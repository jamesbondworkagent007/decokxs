package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class BaseFfiConverterULong implements FfiConverter<C56396yDv, Long> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-PUiSbYQ, reason: not valid java name */
    public long m9556allocationSizePUiSbYQ(long j) {
        return 8L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterULong(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(C56396yDv c56396yDv) {
        return m9556allocationSizePUiSbYQ(c56396yDv.OLrzqt());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ C56396yDv lift2(Long l) {
        return C56396yDv.KWHzl(m9557liftI7RO_PI(l.longValue()));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ C56396yDv liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return C56396yDv.KWHzl(m9558liftFromRustBufferI7RO_PI(byValue));
    }

    /* JADX INFO: renamed from: liftFromRustBuffer-I7RO_PI, reason: not valid java name */
    public long m9558liftFromRustBufferI7RO_PI(@NotNull RustBuffer.ByValue byValue) {
        return ((C56396yDv) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue)).OLrzqt();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Long lower2(C56396yDv c56396yDv) {
        return m9559lowerVKZWuLQ(c56396yDv.OLrzqt());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(C56396yDv c56396yDv) {
        return m9560lowerIntoRustBufferVKZWuLQ(c56396yDv.OLrzqt());
    }

    /* JADX INFO: renamed from: lowerIntoRustBuffer-VKZWuLQ, reason: not valid java name */
    public RustBuffer.ByValue m9560lowerIntoRustBufferVKZWuLQ(long j) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, C56396yDv.KWHzl(j));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ C56396yDv read(ByteBuffer byteBuffer) {
        return C56396yDv.KWHzl(m9561readI7RO_PI(byteBuffer));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(C56396yDv c56396yDv, ByteBuffer byteBuffer) {
        m9562write4PLdz1A(c56396yDv.OLrzqt(), byteBuffer);
    }

    /* JADX INFO: renamed from: lift-I7RO_PI, reason: not valid java name */
    public long m9557liftI7RO_PI(long j) {
        return C56396yDv.copydefault(j);
    }

    /* JADX INFO: renamed from: read-I7RO_PI, reason: not valid java name */
    public long m9561readI7RO_PI(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return m9557liftI7RO_PI(byteBuffer.getLong());
    }

    /* JADX INFO: renamed from: lower-VKZWuLQ, reason: not valid java name */
    public Long m9559lowerVKZWuLQ(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: write-4PLdz1A, reason: not valid java name */
    public void m9562write4PLdz1A(long j, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putLong(j);
    }
}
