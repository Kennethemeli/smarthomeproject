package com.ken.temperature;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: TemperatureControlService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TemperatureControlServiceGrpc {

  private TemperatureControlServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ken.temperature.TemperatureControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ken.temperature.TemperatureRequest,
      com.ken.temperature.TemperatureResponse> getSetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemperature",
      requestType = com.ken.temperature.TemperatureRequest.class,
      responseType = com.ken.temperature.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ken.temperature.TemperatureRequest,
      com.ken.temperature.TemperatureResponse> getSetTemperatureMethod() {
    io.grpc.MethodDescriptor<com.ken.temperature.TemperatureRequest, com.ken.temperature.TemperatureResponse> getSetTemperatureMethod;
    if ((getSetTemperatureMethod = TemperatureControlServiceGrpc.getSetTemperatureMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getSetTemperatureMethod = TemperatureControlServiceGrpc.getSetTemperatureMethod) == null) {
          TemperatureControlServiceGrpc.getSetTemperatureMethod = getSetTemperatureMethod =
              io.grpc.MethodDescriptor.<com.ken.temperature.TemperatureRequest, com.ken.temperature.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.temperature.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.temperature.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("SetTemperature"))
              .build();
        }
      }
    }
    return getSetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ken.temperature.TemperatureStreamRequest,
      com.ken.temperature.TemperatureResponse> getStreamTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTemperature",
      requestType = com.ken.temperature.TemperatureStreamRequest.class,
      responseType = com.ken.temperature.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ken.temperature.TemperatureStreamRequest,
      com.ken.temperature.TemperatureResponse> getStreamTemperatureMethod() {
    io.grpc.MethodDescriptor<com.ken.temperature.TemperatureStreamRequest, com.ken.temperature.TemperatureResponse> getStreamTemperatureMethod;
    if ((getStreamTemperatureMethod = TemperatureControlServiceGrpc.getStreamTemperatureMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getStreamTemperatureMethod = TemperatureControlServiceGrpc.getStreamTemperatureMethod) == null) {
          TemperatureControlServiceGrpc.getStreamTemperatureMethod = getStreamTemperatureMethod =
              io.grpc.MethodDescriptor.<com.ken.temperature.TemperatureStreamRequest, com.ken.temperature.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.temperature.TemperatureStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.temperature.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("StreamTemperature"))
              .build();
        }
      }
    }
    return getStreamTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemperatureControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureControlServiceStub>() {
        @java.lang.Override
        public TemperatureControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureControlServiceStub(channel, callOptions);
        }
      };
    return TemperatureControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemperatureControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureControlServiceBlockingStub>() {
        @java.lang.Override
        public TemperatureControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureControlServiceBlockingStub(channel, callOptions);
        }
      };
    return TemperatureControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemperatureControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemperatureControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemperatureControlServiceFutureStub>() {
        @java.lang.Override
        public TemperatureControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemperatureControlServiceFutureStub(channel, callOptions);
        }
      };
    return TemperatureControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary RPC for setting the temperature
     * </pre>
     */
    default void setTemperature(com.ken.temperature.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.ken.temperature.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC for getting temperature updates
     * </pre>
     */
    default void streamTemperature(com.ken.temperature.TemperatureStreamRequest request,
        io.grpc.stub.StreamObserver<com.ken.temperature.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TemperatureControlService.
   */
  public static abstract class TemperatureControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TemperatureControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TemperatureControlService.
   */
  public static final class TemperatureControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TemperatureControlServiceStub> {
    private TemperatureControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC for setting the temperature
     * </pre>
     */
    public void setTemperature(com.ken.temperature.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.ken.temperature.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC for getting temperature updates
     * </pre>
     */
    public void streamTemperature(com.ken.temperature.TemperatureStreamRequest request,
        io.grpc.stub.StreamObserver<com.ken.temperature.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamTemperatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TemperatureControlService.
   */
  public static final class TemperatureControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TemperatureControlServiceBlockingStub> {
    private TemperatureControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC for setting the temperature
     * </pre>
     */
    public com.ken.temperature.TemperatureResponse setTemperature(com.ken.temperature.TemperatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side streaming RPC for getting temperature updates
     * </pre>
     */
    public java.util.Iterator<com.ken.temperature.TemperatureResponse> streamTemperature(
        com.ken.temperature.TemperatureStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TemperatureControlService.
   */
  public static final class TemperatureControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TemperatureControlServiceFutureStub> {
    private TemperatureControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC for setting the temperature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ken.temperature.TemperatureResponse> setTemperature(
        com.ken.temperature.TemperatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_TEMPERATURE = 0;
  private static final int METHODID_STREAM_TEMPERATURE = 1;

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
        case METHODID_SET_TEMPERATURE:
          serviceImpl.setTemperature((com.ken.temperature.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<com.ken.temperature.TemperatureResponse>) responseObserver);
          break;
        case METHODID_STREAM_TEMPERATURE:
          serviceImpl.streamTemperature((com.ken.temperature.TemperatureStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.ken.temperature.TemperatureResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSetTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ken.temperature.TemperatureRequest,
              com.ken.temperature.TemperatureResponse>(
                service, METHODID_SET_TEMPERATURE)))
        .addMethod(
          getStreamTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.ken.temperature.TemperatureStreamRequest,
              com.ken.temperature.TemperatureResponse>(
                service, METHODID_STREAM_TEMPERATURE)))
        .build();
  }

  private static abstract class TemperatureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ken.temperature.TemperatureControlServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemperatureControlService");
    }
  }

  private static final class TemperatureControlServiceFileDescriptorSupplier
      extends TemperatureControlServiceBaseDescriptorSupplier {
    TemperatureControlServiceFileDescriptorSupplier() {}
  }

  private static final class TemperatureControlServiceMethodDescriptorSupplier
      extends TemperatureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TemperatureControlServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TemperatureControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemperatureControlServiceFileDescriptorSupplier())
              .addMethod(getSetTemperatureMethod())
              .addMethod(getStreamTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
