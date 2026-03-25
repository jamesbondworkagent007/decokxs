package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BoF;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterTypeAppLanguageItem;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSelectableLanguageItem implements FfiConverterRustBuffer<BoF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSelectableLanguageItem INSTANCE = new FfiConverterTypeSelectableLanguageItem();

    private FfiConverterTypeSelectableLanguageItem() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BoF lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BoF) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BoF liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BoF) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BoF boF) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, boF);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BoF boF) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, boF);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BoF read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BoF(FfiConverterTypeAppLanguageItem.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BoF boF) {
        Intrinsics.checkNotNullParameter(boF, "");
        return C56396yDv.copydefault(FfiConverterTypeAppLanguageItem.INSTANCE.mo9529allocationSizeI7RO_PI(boF.OLrzqt()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(boF.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BoF boF, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(boF, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeAppLanguageItem.INSTANCE.write(boF.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(boF.KWHzl(), byteBuffer);
    }
}
