package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.BmP;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCurrencySelectEvent implements FfiConverterRustBuffer<BmP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCurrencySelectEvent INSTANCE = new FfiConverterTypeCurrencySelectEvent();

    private FfiConverterTypeCurrencySelectEvent() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BmP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BmP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BmP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BmP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BmP bmP) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bmP);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BmP bmP) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bmP);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BmP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return BmP.ActionBar.INSTANCE;
        }
        if (i == 2) {
            return BmP.Activity.INSTANCE;
        }
        if (i == 3) {
            return new BmP.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BmP bmP) {
        Intrinsics.checkNotNullParameter(bmP, "");
        if ((bmP instanceof BmP.ActionBar) || (bmP instanceof BmP.Activity)) {
            return 4L;
        }
        if (!(bmP instanceof BmP.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((BmP.TaskDescription) bmP).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BmP bmP, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bmP, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (bmP instanceof BmP.ActionBar) {
            byteBuffer.putInt(1);
        } else if (bmP instanceof BmP.Activity) {
            byteBuffer.putInt(2);
        } else {
            if (!(bmP instanceof BmP.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((BmP.TaskDescription) bmP).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
