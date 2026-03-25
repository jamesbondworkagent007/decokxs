package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zNS;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterApproveStatus implements FfiConverterRustBuffer<zNS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterApproveStatus INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterApproveStatus();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterApproveStatus() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zNS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zNS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zNS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zNS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zNS zns) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zns);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zNS zns) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zns);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zNS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zNS.StateListAnimator(FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
        }
        if (i == 2) {
            return zNS.ActionBar.INSTANCE;
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zNS zns) {
        Intrinsics.checkNotNullParameter(zns, "");
        if (zns instanceof zNS.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(((zNS.StateListAnimator) zns).EZpvd()) + 4);
        }
        if (zns instanceof zNS.ActionBar) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zNS zns, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zns, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zns instanceof zNS.StateListAnimator) {
            byteBuffer.putInt(1);
            FfiConverterInt.INSTANCE.write(((zNS.StateListAnimator) zns).EZpvd(), byteBuffer);
        } else {
            if (!(zns instanceof zNS.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
        }
        Unit unit = Unit.INSTANCE;
    }
}
