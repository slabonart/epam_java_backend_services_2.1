package pl.slabonart.epam_java_bs_2_1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sampleService.proto")
public final class SampleServiceGrpc {

  private SampleServiceGrpc() {}

  public static final String SERVICE_NAME = "SampleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest,
      pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse> getGetMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessage",
      requestType = pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest.class,
      responseType = pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest,
      pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse> getGetMessageMethod() {
    io.grpc.MethodDescriptor<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest, pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse> getGetMessageMethod;
    if ((getGetMessageMethod = SampleServiceGrpc.getGetMessageMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getGetMessageMethod = SampleServiceGrpc.getGetMessageMethod) == null) {
          SampleServiceGrpc.getGetMessageMethod = getGetMessageMethod = 
              io.grpc.MethodDescriptor.<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest, pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SampleService", "GetMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("GetMessage"))
                  .build();
          }
        }
     }
     return getGetMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleServiceStub newStub(io.grpc.Channel channel) {
    return new SampleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SampleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SampleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SampleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMessage(pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest request,
        io.grpc.stub.StreamObserver<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest,
                pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse>(
                  this, METHODID_GET_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class SampleServiceStub extends io.grpc.stub.AbstractStub<SampleServiceStub> {
    private SampleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMessage(pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest request,
        io.grpc.stub.StreamObserver<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SampleServiceBlockingStub extends io.grpc.stub.AbstractStub<SampleServiceBlockingStub> {
    private SampleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse getMessage(pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SampleServiceFutureStub extends io.grpc.stub.AbstractStub<SampleServiceFutureStub> {
    private SampleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse> getMessage(
        pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MESSAGE:
          serviceImpl.getMessage((pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageRequest) request,
              (io.grpc.stub.StreamObserver<pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.GetMessageResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pl.slabonart.epam_java_bs_2_1.SampleServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SampleService");
    }
  }

  private static final class SampleServiceFileDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier {
    SampleServiceFileDescriptorSupplier() {}
  }

  private static final class SampleServiceMethodDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleServiceFileDescriptorSupplier())
              .addMethod(getGetMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
