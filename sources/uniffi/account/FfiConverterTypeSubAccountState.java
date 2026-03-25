package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3124Afy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSubAccountState implements FfiConverterRustBuffer<C3124Afy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubAccountState INSTANCE = new FfiConverterTypeSubAccountState();

    private FfiConverterTypeSubAccountState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3124Afy lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3124Afy) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3124Afy liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3124Afy) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3124Afy c3124Afy) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3124Afy);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3124Afy c3124Afy) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3124Afy);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3124Afy read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        String str = FfiConverterOptionalString.INSTANCE.read(byteBuffer);
        int iIntValue = FfiConverterInt.INSTANCE.read(byteBuffer).intValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3124Afy(str, iIntValue, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3124Afy c3124Afy) {
        Intrinsics.checkNotNullParameter(c3124Afy, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c3124Afy.KWHzl()) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c3124Afy.OLrzqt()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3124Afy.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3124Afy.copydefault())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3124Afy.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3124Afy c3124Afy, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3124Afy, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString.INSTANCE.write(c3124Afy.KWHzl(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c3124Afy.OLrzqt(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3124Afy.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c3124Afy.copydefault(), byteBuffer);
        ffiConverterBoolean.write(c3124Afy.AEQbTJ(), byteBuffer);
    }
}
