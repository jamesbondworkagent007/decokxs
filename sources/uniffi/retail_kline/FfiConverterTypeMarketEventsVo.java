package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.BhD;
import o.C4526Bhi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeMarketEventsVo implements FfiConverterRustBuffer<BhD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMarketEventsVo INSTANCE = new FfiConverterTypeMarketEventsVo();

    private FfiConverterTypeMarketEventsVo() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BhD lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BhD) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhD liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BhD) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BhD bhD) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bhD);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BhD bhD) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bhD);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhD read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new BhD.StateListAnimator(FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        if (i == 2) {
            C4526Bhi c4526Bhi = FfiConverterTypeBigEventPo.INSTANCE.read(byteBuffer);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            String str = ffiConverterString.read(byteBuffer);
            String str2 = ffiConverterString.read(byteBuffer);
            boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
            String str3 = ffiConverterString.read(byteBuffer);
            String str4 = ffiConverterString.read(byteBuffer);
            FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
            return new BhD.TaskDescription(c4526Bhi, str, str2, zBooleanValue, str3, str4, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalSequenceString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BhD bhD) {
        Intrinsics.checkNotNullParameter(bhD, "");
        if (bhD instanceof BhD.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(((BhD.StateListAnimator) bhD).KWHzl()) + 4);
        }
        if (!(bhD instanceof BhD.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        BhD.TaskDescription taskDescription = (BhD.TaskDescription) bhD;
        long jCopydefault = C56396yDv.copydefault(FfiConverterTypeBigEventPo.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.djBIcL()) + 4);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.EZpvd())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(taskDescription.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.copydefault()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(taskDescription.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(taskDescription.KWHzl())) + FfiConverterOptionalSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BhD bhD, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bhD, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (bhD instanceof BhD.StateListAnimator) {
            byteBuffer.putInt(1);
            FfiConverterLong.INSTANCE.write(((BhD.StateListAnimator) bhD).KWHzl(), byteBuffer);
        } else {
            if (!(bhD instanceof BhD.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            BhD.TaskDescription taskDescription = (BhD.TaskDescription) bhD;
            FfiConverterTypeBigEventPo.INSTANCE.write(taskDescription.djBIcL(), byteBuffer);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            ffiConverterString.write(taskDescription.AEQbTJ(), byteBuffer);
            ffiConverterString.write(taskDescription.EZpvd(), byteBuffer);
            FfiConverterBoolean.INSTANCE.write(taskDescription.valueOf(), byteBuffer);
            ffiConverterString.write(taskDescription.AYXKKw(), byteBuffer);
            ffiConverterString.write(taskDescription.copydefault(), byteBuffer);
            FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
            ffiConverterOptionalString.write(taskDescription.gEmmrt(), byteBuffer);
            ffiConverterOptionalString.write(taskDescription.KWHzl(), byteBuffer);
            FfiConverterOptionalSequenceString.INSTANCE.write(taskDescription.OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
