package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58453zCy;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLinkTextParam implements FfiConverterRustBuffer<C58453zCy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkTextParam INSTANCE = new FfiConverterTypeLinkTextParam();

    private FfiConverterTypeLinkTextParam() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58453zCy lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58453zCy) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58453zCy liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58453zCy) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58453zCy c58453zCy) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58453zCy);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58453zCy c58453zCy) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58453zCy);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58453zCy read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C58453zCy(ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalTypeLinkTextStyleType.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58453zCy c58453zCy) {
        Intrinsics.checkNotNullParameter(c58453zCy, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58453zCy.copydefault()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58453zCy.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58453zCy.OLrzqt())) + FfiConverterOptionalTypeLinkTextStyleType.INSTANCE.mo9529allocationSizeI7RO_PI(c58453zCy.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58453zCy c58453zCy, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58453zCy, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c58453zCy.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c58453zCy.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c58453zCy.OLrzqt(), byteBuffer);
        FfiConverterOptionalTypeLinkTextStyleType.INSTANCE.write(c58453zCy.AEQbTJ(), byteBuffer);
    }
}
