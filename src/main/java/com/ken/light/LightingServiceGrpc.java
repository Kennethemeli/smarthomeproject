package com.ken.light;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Lighting service for managing lights
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: LightService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LightingServiceGrpc {

  private LightingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ken.light.LightingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ken.light.LightRequest,
      com.ken.light.LightResponse> getToggleLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleLights",
      requestType = com.ken.light.LightRequest.class,
      responseType = com.ken.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ken.light.LightRequest,
      com.ken.light.LightResponse> getToggleLightsMethod() {
    io.grpc.MethodDescriptor<com.ken.light.LightRequest, com.ken.light.LightResponse> getToggleLightsMethod;
    if ((getToggleLightsMethod = LightingServiceGrpc.getToggleLightsMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getToggleLightsMethod = LightingServiceGrpc.getToggleLightsMethod) == null) {
          LightingServiceGrpc.getToggleLightsMethod = getToggleLightsMethod =
              io.grpc.MethodDescriptor.<com.ken.light.LightRequest, com.ken.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.light.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("ToggleLights"))
              .build();
        }
      }
    }
    return getToggleLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ken.light.LightControlRequest,
      com.ken.light.LightControlResponse> getInteractiveLightControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InteractiveLightControl",
      requestType = com.ken.light.LightControlRequest.class,
      responseType = com.ken.light.LightControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ken.light.LightControlRequest,
      com.ken.light.LightControlResponse> getInteractiveLightControlMethod() {
    io.grpc.MethodDescriptor<com.ken.light.LightControlRequest, com.ken.light.LightControlResponse> getInteractiveLightControlMethod;
    if ((getInteractiveLightControlMethod = LightingServiceGrpc.getInteractiveLightControlMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getInteractiveLightControlMethod = LightingServiceGrpc.getInteractiveLightControlMethod) == null) {
          LightingServiceGrpc.getInteractiveLightControlMethod = getInteractiveLightControlMethod =
              io.grpc.MethodDescriptor.<com.ken.light.LightControlRequest, com.ken.light.LightControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InteractiveLightControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.light.LightControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.light.LightControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("InteractiveLightControl"))
              .build();
        }
      }
    }
    return getInteractiveLightControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ken.light.MotionRequest,
      com.ken.light.MotionResponse> getStreamMotionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamMotion",
      requestType = com.ken.light.MotionRequest.class,
      responseType = com.ken.light.MotionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ken.light.MotionRequest,
      com.ken.light.MotionResponse> getStreamMotionMethod() {
    io.grpc.MethodDescriptor<com.ken.light.MotionRequest, com.ken.light.MotionResponse> getStreamMotionMethod;
    if ((getStreamMotionMethod = LightingServiceGrpc.getStreamMotionMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getStreamMotionMethod = LightingServiceGrpc.getStreamMotionMethod) == null) {
          LightingServiceGrpc.getStreamMotionMethod = getStreamMotionMethod =
              io.grpc.MethodDescriptor.<com.ken.light.MotionRequest, com.ken.light.MotionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamMotion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.light.MotionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.light.MotionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("StreamMotion"))
              .build();
        }
      }
    }
    return getStreamMotionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingServiceStub>() {
        @java.lang.Override
        public LightingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingServiceStub(channel, callOptions);
        }
      };
    return LightingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingServiceBlockingStub>() {
        @java.lang.Override
        public LightingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingServiceBlockingStub(channel, callOptions);
        }
      };
    return LightingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingServiceFutureStub>() {
        @java.lang.Override
        public LightingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingServiceFutureStub(channel, callOptions);
        }
      };
    return LightingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Lighting service for managing lights
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void toggleLights(com.ken.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.ken.light.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleLightsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.ken.light.LightControlRequest> interactiveLightControl(
        io.grpc.stub.StreamObserver<com.ken.light.LightControlResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getInteractiveLightControlMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.ken.light.MotionRequest> streamMotion(
        io.grpc.stub.StreamObserver<com.ken.light.MotionResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamMotionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LightingService.
   * <pre>
   * Lighting service for managing lights
   * </pre>
   */
  public static abstract class LightingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LightingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LightingService.
   * <pre>
   * Lighting service for managing lights
   * </pre>
   */
  public static final class LightingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LightingServiceStub> {
    private LightingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingServiceStub(channel, callOptions);
    }

    /**
     */
    public void toggleLights(com.ken.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.ken.light.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ken.light.LightControlRequest> interactiveLightControl(
        io.grpc.stub.StreamObserver<com.ken.light.LightControlResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getInteractiveLightControlMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ken.light.MotionRequest> streamMotion(
        io.grpc.stub.StreamObserver<com.ken.light.MotionResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamMotionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LightingService.
   * <pre>
   * Lighting service for managing lights
   * </pre>
   */
  public static final class LightingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LightingServiceBlockingStub> {
    private LightingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ken.light.LightResponse toggleLights(com.ken.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleLightsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LightingService.
   * <pre>
   * Lighting service for managing lights
   * </pre>
   */
  public static final class LightingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LightingServiceFutureStub> {
    private LightingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ken.light.LightResponse> toggleLights(
        com.ken.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOGGLE_LIGHTS = 0;
  private static final int METHODID_INTERACTIVE_LIGHT_CONTROL = 1;
  private static final int METHODID_STREAM_MOTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOGGLE_LIGHTS:
          serviceImpl.toggleLights((com.ken.light.LightRequest) request,
              (io.grpc.stub.StreamObserver<com.ken.light.LightResponse>) responseObserver);
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
        case METHODID_INTERACTIVE_LIGHT_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.interactiveLightControl(
              (io.grpc.stub.StreamObserver<com.ken.light.LightControlResponse>) responseObserver);
        case METHODID_STREAM_MOTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamMotion(
              (io.grpc.stub.StreamObserver<com.ken.light.MotionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getToggleLightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ken.light.LightRequest,
              com.ken.light.LightResponse>(
                service, METHODID_TOGGLE_LIGHTS)))
        .addMethod(
          getInteractiveLightControlMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.ken.light.LightControlRequest,
              com.ken.light.LightControlResponse>(
                service, METHODID_INTERACTIVE_LIGHT_CONTROL)))
        .addMethod(
          getStreamMotionMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.ken.light.MotionRequest,
              com.ken.light.MotionResponse>(
                service, METHODID_STREAM_MOTION)))
        .build();
  }

  private static abstract class LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ken.light.LightServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightingService");
    }
  }

  private static final class LightingServiceFileDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier {
    LightingServiceFileDescriptorSupplier() {}
  }

  private static final class LightingServiceMethodDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LightingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LightingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightingServiceFileDescriptorSupplier())
              .addMethod(getToggleLightsMethod())
              .addMethod(getInteractiveLightControlMethod())
              .addMethod(getStreamMotionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
