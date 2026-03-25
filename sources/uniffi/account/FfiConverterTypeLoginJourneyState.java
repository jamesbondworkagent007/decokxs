package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C58478zDw;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;
import uniffi.network.FfiConverterTypeSubDomainStrategy;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLoginJourneyState implements FfiConverterRustBuffer<C58478zDw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginJourneyState INSTANCE = new FfiConverterTypeLoginJourneyState();

    private FfiConverterTypeLoginJourneyState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58478zDw lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58478zDw) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58478zDw liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58478zDw) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58478zDw c58478zDw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58478zDw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58478zDw c58478zDw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58478zDw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58478zDw read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58478zDw(FfiConverterTypeSubDomainStrategy.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58478zDw c58478zDw) {
        Intrinsics.checkNotNullParameter(c58478zDw, "");
        return FfiConverterTypeSubDomainStrategy.INSTANCE.mo9529allocationSizeI7RO_PI(c58478zDw.EZpvd());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58478zDw c58478zDw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58478zDw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSubDomainStrategy.INSTANCE.write(c58478zDw.EZpvd(), byteBuffer);
    }
}
