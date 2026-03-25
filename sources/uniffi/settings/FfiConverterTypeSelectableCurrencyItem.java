package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BoG;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSelectableCurrencyItem implements FfiConverterRustBuffer<BoG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSelectableCurrencyItem INSTANCE = new FfiConverterTypeSelectableCurrencyItem();

    private FfiConverterTypeSelectableCurrencyItem() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BoG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BoG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BoG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BoG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BoG boG) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, boG);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BoG boG) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, boG);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BoG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BoG(FfiConverterTypeCurrencyModel.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BoG boG) {
        Intrinsics.checkNotNullParameter(boG, "");
        return C56396yDv.copydefault(FfiConverterTypeCurrencyModel.INSTANCE.mo9529allocationSizeI7RO_PI(boG.copydefault()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(boG.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BoG boG, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(boG, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeCurrencyModel.INSTANCE.write(boG.copydefault(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(boG.EZpvd(), byteBuffer);
    }
}
