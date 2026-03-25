package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56393yDs;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public class BaseFfiConverterUByte implements FfiConverter<C56393yDs, Byte> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-qRK8ubM, reason: not valid java name */
    public long m9542allocationSizeqRK8ubM(byte b) {
        return 1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterUByte(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(C56393yDs c56393yDs) {
        return m9542allocationSizeqRK8ubM(c56393yDs.OLrzqt());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ C56393yDs lift2(Byte b) {
        return C56393yDs.OLrzqt(m9543liftWa3L5BU(b.byteValue()));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ C56393yDs liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return C56393yDs.OLrzqt(m9544liftFromRustBufferWa3L5BU(byValue));
    }

    /* JADX INFO: renamed from: liftFromRustBuffer-Wa3L5BU, reason: not valid java name */
    public byte m9544liftFromRustBufferWa3L5BU(@NotNull RustBuffer.ByValue byValue) {
        return ((C56393yDs) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue)).OLrzqt();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Byte lower2(C56393yDs c56393yDs) {
        return m9545lower7apg3OU(c56393yDs.OLrzqt());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(C56393yDs c56393yDs) {
        return m9546lowerIntoRustBuffer7apg3OU(c56393yDs.OLrzqt());
    }

    /* JADX INFO: renamed from: lowerIntoRustBuffer-7apg3OU, reason: not valid java name */
    public RustBuffer.ByValue m9546lowerIntoRustBuffer7apg3OU(byte b) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, C56393yDs.OLrzqt(b));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ C56393yDs read(ByteBuffer byteBuffer) {
        return C56393yDs.OLrzqt(m9547readWa3L5BU(byteBuffer));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(C56393yDs c56393yDs, ByteBuffer byteBuffer) {
        m9548write0ky7B_Q(c56393yDs.OLrzqt(), byteBuffer);
    }

    /* JADX INFO: renamed from: lift-Wa3L5BU, reason: not valid java name */
    public byte m9543liftWa3L5BU(byte b) {
        return C56393yDs.copydefault(b);
    }

    /* JADX INFO: renamed from: read-Wa3L5BU, reason: not valid java name */
    public byte m9547readWa3L5BU(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return m9543liftWa3L5BU(byteBuffer.get());
    }

    /* JADX INFO: renamed from: lower-7apg3OU, reason: not valid java name */
    public Byte m9545lower7apg3OU(byte b) {
        return Byte.valueOf(b);
    }

    /* JADX INFO: renamed from: write-0ky7B_Q, reason: not valid java name */
    public void m9548write0ky7B_Q(byte b, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.put(b);
    }
}
