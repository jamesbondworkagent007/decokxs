package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.yDB;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public class BaseFfiConverterUShort implements FfiConverter<yDB, Short> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-AGRhNks, reason: not valid java name */
    public long m9563allocationSizeAGRhNks(short s) {
        return 2L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterUShort(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(yDB ydb) {
        return m9563allocationSizeAGRhNks(ydb.EZpvd());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ yDB lift2(Short sh) {
        return yDB.EZpvd(m9564liftBwKQO78(sh.shortValue()));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ yDB liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return yDB.EZpvd(m9565liftFromRustBufferBwKQO78(byValue));
    }

    /* JADX INFO: renamed from: liftFromRustBuffer-BwKQO78, reason: not valid java name */
    public short m9565liftFromRustBufferBwKQO78(@NotNull RustBuffer.ByValue byValue) {
        return ((yDB) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue)).EZpvd();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Short lower2(yDB ydb) {
        return m9566lowerxj2QHRw(ydb.EZpvd());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(yDB ydb) {
        return m9567lowerIntoRustBufferxj2QHRw(ydb.EZpvd());
    }

    /* JADX INFO: renamed from: lowerIntoRustBuffer-xj2QHRw, reason: not valid java name */
    public RustBuffer.ByValue m9567lowerIntoRustBufferxj2QHRw(short s) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, yDB.EZpvd(s));
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    public /* synthetic */ yDB read(ByteBuffer byteBuffer) {
        return yDB.EZpvd(m9568readBwKQO78(byteBuffer));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(yDB ydb, ByteBuffer byteBuffer) {
        m9569writevckuEUM(ydb.EZpvd(), byteBuffer);
    }

    /* JADX INFO: renamed from: lift-BwKQO78, reason: not valid java name */
    public short m9564liftBwKQO78(short s) {
        return yDB.AEQbTJ(s);
    }

    /* JADX INFO: renamed from: read-BwKQO78, reason: not valid java name */
    public short m9568readBwKQO78(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return m9564liftBwKQO78(byteBuffer.getShort());
    }

    /* JADX INFO: renamed from: lower-xj2QHRw, reason: not valid java name */
    public Short m9566lowerxj2QHRw(short s) {
        return Short.valueOf(s);
    }

    /* JADX INFO: renamed from: write-vckuEUM, reason: not valid java name */
    public void m9569writevckuEUM(short s, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putShort(s);
    }
}
