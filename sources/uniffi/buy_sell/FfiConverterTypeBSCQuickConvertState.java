package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3652Apw;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBSCQuickConvertState implements FfiConverterRustBuffer<C3652Apw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBSCQuickConvertState INSTANCE = new FfiConverterTypeBSCQuickConvertState();

    private FfiConverterTypeBSCQuickConvertState() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3652Apw lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3652Apw) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3652Apw liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3652Apw) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3652Apw c3652Apw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3652Apw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3652Apw c3652Apw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3652Apw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3652Apw read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3652Apw(FfiConverterTypeBSCQuickConvertContentState.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3652Apw c3652Apw) {
        Intrinsics.checkNotNullParameter(c3652Apw, "");
        return FfiConverterTypeBSCQuickConvertContentState.INSTANCE.mo9529allocationSizeI7RO_PI(c3652Apw.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3652Apw c3652Apw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3652Apw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBSCQuickConvertContentState.INSTANCE.write(c3652Apw.KWHzl(), byteBuffer);
    }
}
