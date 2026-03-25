package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58412zBk;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeItem implements FfiConverterRustBuffer<C58412zBk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeItem INSTANCE = new FfiConverterTypeItem();

    private FfiConverterTypeItem() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58412zBk lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58412zBk) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58412zBk liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58412zBk) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58412zBk c58412zBk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58412zBk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58412zBk c58412zBk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58412zBk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58412zBk read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C58412zBk(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterSequenceTypeParam.INSTANCE.read(byteBuffer), FfiConverterOptionalBoolean.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58412zBk c58412zBk) {
        Intrinsics.checkNotNullParameter(c58412zBk, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c58412zBk.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58412zBk.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58412zBk.EZpvd())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c58412zBk.OLrzqt())) + FfiConverterSequenceTypeParam.INSTANCE.mo9529allocationSizeI7RO_PI((List) c58412zBk.copydefault())) + FfiConverterOptionalBoolean.INSTANCE.mo9529allocationSizeI7RO_PI(c58412zBk.gEmmrt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58412zBk c58412zBk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58412zBk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c58412zBk.KWHzl(), byteBuffer);
        ffiConverterString.write(c58412zBk.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c58412zBk.EZpvd(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c58412zBk.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypeParam.INSTANCE.write((List) c58412zBk.copydefault(), byteBuffer);
        FfiConverterOptionalBoolean.INSTANCE.write(c58412zBk.gEmmrt(), byteBuffer);
    }
}
