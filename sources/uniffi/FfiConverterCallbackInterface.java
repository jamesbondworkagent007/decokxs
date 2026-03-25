package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C60180zxq;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverterTypeLong;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FfiConverterCallbackInterface<CallbackInterface> implements FfiConverterTypeLong<CallbackInterface> {
    public static final int $stable = 8;
    private final C60180zxq<CallbackInterface> handleMap;
    private final RustBuffer rustBuffer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60180zxq<CallbackInterface> getHandleMap$OKCore_deploy() {
        return this.handleMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public FfiConverterCallbackInterface(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
        this.handleMap = new C60180zxq<>();
    }

    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public long mo9529allocationSizeI7RO_PI(@NotNull CallbackInterface callbackinterface) {
        return FfiConverterTypeLong.DefaultImpls.m9571allocationSizeI7RO_PI(this, callbackinterface);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    @Override // uniffi.FfiConverter
    public CallbackInterface liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (CallbackInterface) FfiConverterTypeLong.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull CallbackInterface callbackinterface) {
        return FfiConverterTypeLong.DefaultImpls.lowerIntoRustBuffer(this, callbackinterface);
    }

    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    public CallbackInterface read(@NotNull ByteBuffer byteBuffer) {
        return (CallbackInterface) FfiConverterTypeLong.DefaultImpls.read(this, byteBuffer);
    }

    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    public void write(@NotNull CallbackInterface callbackinterface, @NotNull ByteBuffer byteBuffer) {
        FfiConverterTypeLong.DefaultImpls.write(this, callbackinterface, byteBuffer);
    }

    public final void drop$OKCore_deploy(long j) throws InternalException {
        this.handleMap.AEQbTJ(j);
    }

    public CallbackInterface lift(long j) {
        return this.handleMap.copydefault(j);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public Long lower2(@NotNull CallbackInterface callbackinterface) {
        Intrinsics.checkNotNullParameter(callbackinterface, "");
        return Long.valueOf(this.handleMap.EZpvd(callbackinterface));
    }
}
