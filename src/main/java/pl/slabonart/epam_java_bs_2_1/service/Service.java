package pl.slabonart.epam_java_bs_2_1.service;

import io.grpc.stub.StreamObserver;
import pl.slabonart.epam_java_bs_2_1.SampleServiceGrpc;
import pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass;

public class Service extends SampleServiceGrpc.SampleServiceImplBase {

    private static final String EXPECTED_MESSAGE = "ping";
    private static final String RESPONSE_MESSAGE = "pong";
    private static final String WRONG_REQUEST_MESSAGE = "wrong request message";

    private SampleServiceOuterClass.GetMessageResponse.Builder responseBuilder;

    @Override
    public void getMessage(SampleServiceOuterClass.GetMessageRequest request, StreamObserver<SampleServiceOuterClass.GetMessageResponse> responseObserver) {

        responseBuilder = SampleServiceOuterClass.GetMessageResponse.newBuilder();

        if (EXPECTED_MESSAGE.equals(request.getMessage())) {
            responseBuilder.setMessage(RESPONSE_MESSAGE);
        } else {
            responseBuilder.setMessage(WRONG_REQUEST_MESSAGE);
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }
}
