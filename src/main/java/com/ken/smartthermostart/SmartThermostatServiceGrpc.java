package com.ken.smartthermostart;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: TemperatureControlService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartThermostatServiceGrpc {

  private SmartThermostatServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ken.smartthermostart.SmartThermostatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ken.smartthermostart.TemperatureRequest,
      com.ken.smartthermostart.TemperatureResponse> getAdjustTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustTemperature",
      requestType = com.ken.smartthermostart.TemperatureRequest.class,
      responseType = com.ken.smartthermostart.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ken.smartthermostart.TemperatureRequest,
      com.ken.smartthermostart.TemperatureResponse> getAdjustTemperatureMethod() {
    io.grpc.MethodDescriptor<com.ken.smartthermostart.TemperatureRequest, com.ken.smartthermostart.TemperatureResponse> getAdjustTemperatureMethod;
    if ((getAdjustTemperatureMethod = SmartThermostatServiceGrpc.getAdjustTemperatureMethod) == null) {
      synchronized (SmartThermostatServiceGrpc.class) {
        if ((getAdjustTemperatureMethod = SmartThermostatServiceGrpc.getAdjustTemperatureMethod) == null) {
          SmartThermostatServiceGrpc.getAdjustTemperatureMethod = getAdjustTemperatureMethod =
              io.grpc.MethodDescriptor.<com.ken.smartthermostart.TemperatureRequest, com.ken.smartthermostart.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.smartthermostart.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.smartthermostart.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartThermostatServiceMethodDescriptorSupplier("AdjustTemperature"))
              .build();
        }
      }
    }
    return getAdjustTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartThermostatServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartThermostatServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartThermostatServiceStub>() {
        @java.lang.Override
        public SmartThermostatServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartThermostatServiceStub(channel, callOptions);
        }
      };
    return SmartThermostatServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartThermostatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartThermostatServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartThermostatServiceBlockingStub>() {
        @java.lang.Override
        public SmartThermostatServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartThermostatServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartThermostatServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartThermostatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartThermostatServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartThermostatServiceFutureStub>() {
        @java.lang.Override
        public SmartThermostatServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartThermostatServiceFutureStub(channel, callOptions);
        }
      };
    return SmartThermostatServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.ken.smartthermostart.TemperatureRequest> adjustTemperature(
        io.grpc.stub.StreamObserver<com.ken.smartthermostart.TemperatureResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAdjustTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartThermostatService.
   */
  public static abstract class SmartThermostatServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartThermostatServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartThermostatService.
   */
  public static final class SmartThermostatServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SmartThermostatServiceStub> {
    private SmartThermostatServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartThermostatServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartThermostatServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ken.smartthermostart.TemperatureRequest> adjustTemperature(
        io.grpc.stub.StreamObserver<com.ken.smartthermostart.TemperatureResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartThermostatService.
   */
  public static final class SmartThermostatServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartThermostatServiceBlockingStub> {
    private SmartThermostatServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartThermostatServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartThermostatServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartThermostatService.
   */
  public static final class SmartThermostatServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartThermostatServiceFutureStub> {
    private SmartThermostatServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartThermostatServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartThermostatServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ADJUST_TEMPERATURE = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADJUST_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustTemperature(
              (io.grpc.stub.StreamObserver<com.ken.smartthermostart.TemperatureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAdjustTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.ken.smartthermostart.TemperatureRequest,
              com.ken.smartthermostart.TemperatureResponse>(
                service, METHODID_ADJUST_TEMPERATURE)))
        .build();
  }

  private static abstract class SmartThermostatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartThermostatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ken.smartthermostart.SmartThermostatProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartThermostatService");
    }
  }

  private static final class SmartThermostatServiceFileDescriptorSupplier
      extends SmartThermostatServiceBaseDescriptorSupplier {
    SmartThermostatServiceFileDescriptorSupplier() {}
  }

  private static final class SmartThermostatServiceMethodDescriptorSupplier
      extends SmartThermostatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartThermostatServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartThermostatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartThermostatServiceFileDescriptorSupplier())
              .addMethod(getAdjustTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
