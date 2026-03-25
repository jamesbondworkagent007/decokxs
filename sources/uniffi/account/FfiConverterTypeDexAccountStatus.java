package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zAU;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDexAccountStatus implements FfiConverterRustBuffer<zAU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexAccountStatus INSTANCE = new FfiConverterTypeDexAccountStatus();

    private FfiConverterTypeDexAccountStatus() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zAU lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zAU) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAU liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zAU) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zAU zau) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zau);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zAU zau) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zau);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAU read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return zAU.ActionBar.INSTANCE;
        }
        if (i == 2) {
            return zAU.Application.INSTANCE;
        }
        if (i == 3) {
            return zAU.TaskDescription.INSTANCE;
        }
        if (i == 4) {
            return new zAU.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zAU zau) {
        Intrinsics.checkNotNullParameter(zau, "");
        if ((zau instanceof zAU.ActionBar) || (zau instanceof zAU.Application) || (zau instanceof zAU.TaskDescription)) {
            return 4L;
        }
        if (!(zau instanceof zAU.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zAU.Activity) zau).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zAU zau, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zau, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zau instanceof zAU.ActionBar) {
            byteBuffer.putInt(1);
        } else if (zau instanceof zAU.Application) {
            byteBuffer.putInt(2);
        } else if (zau instanceof zAU.TaskDescription) {
            byteBuffer.putInt(3);
        } else {
            if (!(zau instanceof zAU.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((zAU.Activity) zau).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
