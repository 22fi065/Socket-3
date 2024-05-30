package sorce;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastServer {
    public static void main(String[] args) throws Exception {
        try {
            // マルチキャストグループのIPアドレスとポート番号を指定
            // 自分のPC内でやる場合
            InetAddress nyan = InetAddress.getByName("239.192.0.0");
            // 隣の人とやる場合
            // InetAddress nyan = InetAddress.getByName("239.0.0.1");
            int port = 49153;
            System.out.println();

            // マルチキャストソケットを作成し、指定したグループとポートに参加
            MulticastSocket multicastSocket = new MulticastSocket(port);
            multicastSocket.joinGroup(nyan); // マルチキャストグループに参加

            System.out.println("Server started. Waiting for commands...");

            // 受信用のバッファを作成
            byte[] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // コマンドを受信して永遠に待機
            while (true) {
                multicastSocket.receive(packet);
                String receivedCommand = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received command: " + receivedCommand);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}