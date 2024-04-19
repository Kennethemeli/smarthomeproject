package com.ken.security;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Security service for locks and alarms
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SecurityService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SecurityServiceGrpc {

  private SecurityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ken.security.SecurityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ken.security.LockRequest,
      com.ken.security.LockResponse> getToggleLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleLock",
      requestType = com.ken.security.LockRequest.class,
      responseType = com.ken.security.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ken.security.LockRequest,
      com.ken.security.LockResponse> getToggleLockMethod() {
    io.grpc.MethodDescriptor<com.ken.security.LockRequest, com.ken.security.LockResponse> getToggleLockMethod;
    if ((getToggleLockMethod = SecurityServiceGrpc.getToggleLockMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getToggleLockMethod = SecurityServiceGrpc.getToggleLockMethod) == null) {
          SecurityServiceGrpc.getToggleLockMethod = getToggleLockMethod =
              io.grpc.MethodDescriptor.<com.ken.security.LockRequest, com.ken.security.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.security.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.security.LockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("ToggleLock"))
              .build();
        }
      }
    }
    return getToggleLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ken.security.SecuritySettingsRequest,
      com.ken.security.SecuritySettingsResponse> getSetSecuritySettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSecuritySettings",
      requestType = com.ken.security.SecuritySettingsRequest.class,
      responseType = com.ken.security.SecuritySettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ken.security.SecuritySettingsRequest,
      com.ken.security.SecuritySettingsResponse> getSetSecuritySettingsMethod() {
    io.grpc.MethodDescriptor<com.ken.security.SecuritySettingsRequest, com.ken.security.SecuritySettingsResponse> getSetSecuritySettingsMethod;
    if ((getSetSecuritySettingsMethod = SecurityServiceGrpc.getSetSecuritySettingsMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getSetSecuritySettingsMethod = SecurityServiceGrpc.getSetSecuritySettingsMethod) == null) {
          SecurityServiceGrpc.getSetSecuritySettingsMethod = getSetSecuritySettingsMethod =
              io.grpc.MethodDescriptor.<com.ken.security.SecuritySettingsRequest, com.ken.security.SecuritySettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSecuritySettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.security.SecuritySettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ken.security.SecuritySettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("SetSecuritySettings"))
              .build();
        }
      }
    }
    return getSetSecuritySettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceStub>() {
        @java.lang.Override
        public SecurityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceStub(channel, callOptions);
        }
      };
    return SecurityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceBlockingStub>() {
        @java.lang.Override
        public SecurityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceBlockingStub(channel, callOptions);
        }
      };
    return SecurityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceFutureStub>() {
        @java.lang.Override
        public SecurityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceFutureStub(channel, callOptions);
        }
      };
    return SecurityServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Security service for locks and alarms
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary RPC to toggle lock
     * </pre>
     */
    default void toggleLock(com.ken.security.LockRequest request,
        io.grpc.stub.StreamObserver<com.ken.security.LockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC for multiple security settings at once
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.ken.security.SecuritySettingsRequest> setSecuritySettings(
        io.grpc.stub.StreamObserver<com.ken.security.SecuritySettingsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetSecuritySettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SecurityService.
   * <pre>
   * Security service for locks and alarms
   * </pre>
   */
  public static abstract class SecurityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SecurityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SecurityService.
   * <pre>
   * Security service for locks and alarms
   * </pre>
   */
  public static final class SecurityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SecurityServiceStub> {
    private SecurityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC to toggle lock
     * </pre>
     */
    public void toggleLock(com.ken.security.LockRequest request,
        io.grpc.stub.StreamObserver<com.ken.security.LockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC for multiple security settings at once
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ken.security.SecuritySettingsRequest> setSecuritySettings(
        io.grpc.stub.StreamObserver<com.ken.security.SecuritySettingsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetSecuritySettingsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SecurityService.
   * <pre>
   * Security service for locks and alarms
   * </pre>
   */
  public static final class SecurityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SecurityServiceBlockingStub> {
    private SecurityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC to toggle lock
     * </pre>
     */
    public com.ken.security.LockResponse toggleLock(com.ken.security.LockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleLockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SecurityService.
   * <pre>
   * Security service for locks and alarms
   * </pre>
   */
  public static final class SecurityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SecurityServiceFutureStub> {
    private SecurityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC to toggle lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ken.security.LockResponse> toggleLock(
        com.ken.security.LockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleLockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOGGLE_LOCK = 0;
  private static final int METHODID_SET_SECURITY_SETTINGS = 1;

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
        case METHODID_TOGGLE_LOCK:
          serviceImpl.toggleLock((com.ken.security.LockRequest) request,
              (io.grpc.stub.StreamObserver<com.ken.security.LockResponse>) responseObserver);
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
        case METHODID_SET_SECURITY_SETTINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setSecuritySettings(
              (io.grpc.stub.StreamObserver<com.ken.security.SecuritySettingsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getToggleLockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ken.security.LockRequest,
              com.ken.security.LockResponse>(
                service, METHODID_TOGGLE_LOCK)))
        .addMethod(
          getSetSecuritySettingsMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.ken.security.SecuritySettingsRequest,
              com.ken.security.SecuritySettingsResponse>(
                service, METHODID_SET_SECURITY_SETTINGS)))
        .build();
  }

  private static abstract class SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ken.security.SecurityServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityService");
    }
  }

  private static final class SecurityServiceFileDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier {
    SecurityServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityServiceMethodDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SecurityServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SecurityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityServiceFileDescriptorSupplier())
              .addMethod(getToggleLockMethod())
              .addMethod(getSetSecuritySettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
