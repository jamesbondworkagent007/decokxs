package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58981zWr;
import o.C58983zWt;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyListState implements FfiConverterRustBuffer<C58981zWr> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyListState INSTANCE = new FfiConverterTypePasskeyListState();

    private FfiConverterTypePasskeyListState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58981zWr lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58981zWr) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58981zWr liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58981zWr) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58981zWr c58981zWr) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58981zWr);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58981zWr c58981zWr) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58981zWr);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58981zWr read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        List<C58983zWt> list = FfiConverterSequenceTypePasskeyListItem.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C58981zWr(list, ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterTypePasskeyReminderType.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58981zWr c58981zWr) {
        Intrinsics.checkNotNullParameter(c58981zWr, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterSequenceTypePasskeyListItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c58981zWr.OLrzqt());
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58981zWr.AEQbTJ())) + FfiConverterTypePasskeyReminderType.INSTANCE.mo9529allocationSizeI7RO_PI(c58981zWr.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58981zWr.copydefault())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58981zWr.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58981zWr c58981zWr, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58981zWr, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypePasskeyListItem.INSTANCE.write((List) c58981zWr.OLrzqt(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c58981zWr.AEQbTJ(), byteBuffer);
        FfiConverterTypePasskeyReminderType.INSTANCE.write(c58981zWr.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c58981zWr.copydefault(), byteBuffer);
        ffiConverterBoolean.write(c58981zWr.KWHzl(), byteBuffer);
    }
}
