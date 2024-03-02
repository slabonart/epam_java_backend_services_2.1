package pl.slabonart.epam_java_bs_2_1.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pl.slabonart.epam_java_bs_2_1.SampleServiceGrpc;
import pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass;

public class GrpcClient {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext().build();

        SampleServiceGrpc.SampleServiceBlockingStub stub = SampleServiceGrpc.newBlockingStub(channel);

        SampleServiceOuterClass.GetMessageRequest request = SampleServiceOuterClass.GetMessageRequest
                .newBuilder()
                .setMessage("ping")
                .build();

        SampleServiceOuterClass.GetMessageResponse response = stub.getMessage(request);

        System.out.println("Response: " + response.getMessage());
    }
}
