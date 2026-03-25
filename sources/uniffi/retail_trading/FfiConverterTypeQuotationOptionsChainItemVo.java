package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.BkV;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeQuotationOptionsChainItemVo implements FfiConverterRustBuffer<BkV> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuotationOptionsChainItemVo INSTANCE = new FfiConverterTypeQuotationOptionsChainItemVo();

    private FfiConverterTypeQuotationOptionsChainItemVo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BkV lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BkV) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkV liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BkV) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BkV bkV) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bkV);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BkV bkV) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bkV);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkV read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return new BkV.Activity(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        if (i == 2) {
            return new BkV.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BkV bkV) {
        Intrinsics.checkNotNullParameter(bkV, "");
        if (bkV instanceof BkV.Activity) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            BkV.Activity activity = (BkV.Activity) bkV;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(activity.copydefault()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(activity.OLrzqt()));
        }
        if (!(bkV instanceof BkV.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((BkV.TaskDescription) bkV).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BkV bkV, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bkV, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (bkV instanceof BkV.Activity) {
            byteBuffer.putInt(1);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            BkV.Activity activity = (BkV.Activity) bkV;
            ffiConverterString.write(activity.copydefault(), byteBuffer);
            ffiConverterString.write(activity.OLrzqt(), byteBuffer);
        } else {
            if (!(bkV instanceof BkV.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((BkV.TaskDescription) bkV).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
