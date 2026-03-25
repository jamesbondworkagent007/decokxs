package uniffi.network;

import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C4326BbW;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeResponse implements FfiConverterRustBuffer<C4326BbW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeResponse INSTANCE = new FfiConverterTypeResponse();

    private FfiConverterTypeResponse() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4326BbW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4326BbW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4326BbW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4326BbW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4326BbW c4326BbW) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4326BbW);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4326BbW c4326BbW) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4326BbW);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4326BbW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        short sM9568readBwKQO78 = FfiConverterUShort.INSTANCE.m9568readBwKQO78(byteBuffer);
        Map<String, String> map = FfiConverterMapStringString.INSTANCE.read(byteBuffer);
        String str = FfiConverterString.INSTANCE.read(byteBuffer);
        byte[] bArr = FfiConverterByteArray.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C4326BbW(sM9568readBwKQO78, map, str, bArr, ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalULong.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4326BbW c4326BbW) {
        Intrinsics.checkNotNullParameter(c4326BbW, "");
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterUShort.INSTANCE.m9563allocationSizeAGRhNks(c4326BbW.djBIcL()) + FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(c4326BbW.copydefault())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4326BbW.valueOf())) + FfiConverterByteArray.INSTANCE.mo9529allocationSizeI7RO_PI(c4326BbW.OLrzqt()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4326BbW.EZpvd())) + FfiConverterOptionalULong.INSTANCE.mo9529allocationSizeI7RO_PI(c4326BbW.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4326BbW.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4326BbW c4326BbW, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4326BbW, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterUShort.INSTANCE.m9569writevckuEUM(c4326BbW.djBIcL(), byteBuffer);
        FfiConverterMapStringString.INSTANCE.write(c4326BbW.copydefault(), byteBuffer);
        FfiConverterString.INSTANCE.write(c4326BbW.valueOf(), byteBuffer);
        FfiConverterByteArray.INSTANCE.write(c4326BbW.OLrzqt(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c4326BbW.EZpvd(), byteBuffer);
        FfiConverterOptionalULong.INSTANCE.write(c4326BbW.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c4326BbW.AEQbTJ(), byteBuffer);
    }
}
