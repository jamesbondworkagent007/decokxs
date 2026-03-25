package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56395yDu;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BaseFfiConverterUInt implements FfiConverter<C56395yDu, Integer> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-j8A87jM, reason: not valid java name */
    public long m9549allocationSizej8A87jM(int i) {
        return 4L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterUInt(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(C56395yDu c56395yDu) {
        return m9549allocationSizej8A87jM(c56395yDu.copydefault());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ C56395yDu lift2(Integer num) {
        return C56395yDu.AEQbTJ(m9550liftOGnWXxg(num.intValue()));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ C56395yDu liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return C56395yDu.AEQbTJ(m9551liftFromRustBufferOGnWXxg(byValue));
    }

    /* JADX INFO: renamed from: liftFromRustBuffer-OGnWXxg, reason: not valid java name */
    public int m9551liftFromRustBufferOGnWXxg(@NotNull RustBuffer.ByValue byValue) {
        return ((C56395yDu) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue)).copydefault();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Integer lower2(C56395yDu c56395yDu) {
        return m9552lowerWZ4Q5Ns(c56395yDu.copydefault());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(C56395yDu c56395yDu) {
        return m9553lowerIntoRustBufferWZ4Q5Ns(c56395yDu.copydefault());
    }

    /* JADX INFO: renamed from: lowerIntoRustBuffer-WZ4Q5Ns, reason: not valid java name */
    public RustBuffer.ByValue m9553lowerIntoRustBufferWZ4Q5Ns(int i) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, C56395yDu.AEQbTJ(i));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ C56395yDu read(ByteBuffer byteBuffer) {
        return C56395yDu.AEQbTJ(m9554readOGnWXxg(byteBuffer));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(C56395yDu c56395yDu, ByteBuffer byteBuffer) {
        m9555writeqim9Vi0(c56395yDu.copydefault(), byteBuffer);
    }

    /* JADX INFO: renamed from: lift-OGnWXxg, reason: not valid java name */
    public int m9550liftOGnWXxg(int i) {
        return C56395yDu.EZpvd(i);
    }

    /* JADX INFO: renamed from: read-OGnWXxg, reason: not valid java name */
    public int m9554readOGnWXxg(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return m9550liftOGnWXxg(byteBuffer.getInt());
    }

    /* JADX INFO: renamed from: lower-WZ4Q5Ns, reason: not valid java name */
    public Integer m9552lowerWZ4Q5Ns(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: write-qim9Vi0, reason: not valid java name */
    public void m9555writeqim9Vi0(int i, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(i);
    }
}
