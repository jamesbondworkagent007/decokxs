package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3063Aeq;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeResponseJson implements FfiConverterRustBuffer<C3063Aeq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeResponseJson INSTANCE = new FfiConverterTypeResponseJson();

    private FfiConverterTypeResponseJson() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3063Aeq lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3063Aeq) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3063Aeq liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3063Aeq) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3063Aeq c3063Aeq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3063Aeq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3063Aeq c3063Aeq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3063Aeq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3063Aeq read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C3063Aeq(str, str2, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterTypeResponseData.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeClientExtensionResultsData.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3063Aeq c3063Aeq) {
        Intrinsics.checkNotNullParameter(c3063Aeq, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3063Aeq.valueOf()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3063Aeq.EZpvd()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3063Aeq.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3063Aeq.copydefault())) + FfiConverterTypeResponseData.INSTANCE.mo9529allocationSizeI7RO_PI(c3063Aeq.OLrzqt())) + FfiConverterOptionalTypeClientExtensionResultsData.INSTANCE.mo9529allocationSizeI7RO_PI(c3063Aeq.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3063Aeq c3063Aeq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3063Aeq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3063Aeq.valueOf(), byteBuffer);
        ffiConverterString.write(c3063Aeq.EZpvd(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c3063Aeq.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c3063Aeq.copydefault(), byteBuffer);
        FfiConverterTypeResponseData.INSTANCE.write(c3063Aeq.OLrzqt(), byteBuffer);
        FfiConverterOptionalTypeClientExtensionResultsData.INSTANCE.write(c3063Aeq.AEQbTJ(), byteBuffer);
    }
}
