package pl.slabonart.epam_java_bs_2_1.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import pl.slabonart.epam_java_bs_2_1.service.Service;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(8080).addService(new Service()).build();
        server.start();

        System.out.println("Server started on " + server.getPort());
        server.awaitTermination();

    }
}
