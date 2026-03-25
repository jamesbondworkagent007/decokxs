package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zAT;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCrossDeviceMasterScanSource implements FfiConverterRustBuffer<zAT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCrossDeviceMasterScanSource INSTANCE = new FfiConverterTypeCrossDeviceMasterScanSource();

    private FfiConverterTypeCrossDeviceMasterScanSource() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zAT lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zAT) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAT liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zAT) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zAT zat) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zat);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zAT zat) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zat);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAT read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zAT.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new zAT.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zAT zat) {
        Intrinsics.checkNotNullParameter(zat, "");
        if (zat instanceof zAT.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zAT.ActionBar) zat).KWHzl()) + 4);
        }
        if (!(zat instanceof zAT.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zAT.Activity) zat).KWHzl()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zAT zat, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zat, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zat instanceof zAT.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((zAT.ActionBar) zat).KWHzl(), byteBuffer);
        } else {
            if (!(zat instanceof zAT.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zAT.Activity) zat).KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
