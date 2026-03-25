package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C60180zxq;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverterTypeLong;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseFfiConverterType<T> implements FfiConverterTypeLong<T> {
    public static final int $stable = 8;
    private final C60180zxq<T> handleMap;
    private final RustBuffer rustBuffer;

    public abstract T createFromHandle(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60180zxq<T> getHandleMap$OKCore_deploy() {
        return this.handleMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public abstract Long getRustHandle(@NotNull T t);

    public BaseFfiConverterType(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
        this.handleMap = new C60180zxq<>();
    }

    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public long mo9529allocationSizeI7RO_PI(@NotNull T t) {
        return FfiConverterTypeLong.DefaultImpls.m9571allocationSizeI7RO_PI(this, t);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    @Override // uniffi.FfiConverter
    public T liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (T) FfiConverterTypeLong.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull T t) {
        return FfiConverterTypeLong.DefaultImpls.lowerIntoRustBuffer(this, t);
    }

    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    public T read(@NotNull ByteBuffer byteBuffer) {
        return (T) FfiConverterTypeLong.DefaultImpls.read(this, byteBuffer);
    }

    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    public void write(@NotNull T t, @NotNull ByteBuffer byteBuffer) {
        FfiConverterTypeLong.DefaultImpls.write(this, t, byteBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public Long lower2(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        Long rustHandle = getRustHandle(t);
        return Long.valueOf(rustHandle != null ? rustHandle.longValue() : this.handleMap.EZpvd(t));
    }

    public T lift(long j) {
        if ((1 & j) == 0) {
            return createFromHandle(j);
        }
        return this.handleMap.AEQbTJ(j);
    }
}
