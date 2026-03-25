package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AZL;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMultipartData implements FfiConverterRustBuffer<AZL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMultipartData INSTANCE = new FfiConverterTypeMultipartData();

    private FfiConverterTypeMultipartData() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AZL lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AZL) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AZL liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AZL) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AZL azl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, azl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AZL azl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, azl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AZL read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AZL.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AZL.Application(FfiConverterByteArray.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AZL.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AZL azl) {
        Intrinsics.checkNotNullParameter(azl, "");
        if (azl instanceof AZL.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AZL.ActionBar) azl).OLrzqt()) + 4);
        }
        if (azl instanceof AZL.Application) {
            return C56396yDv.copydefault(FfiConverterByteArray.INSTANCE.mo9529allocationSizeI7RO_PI(((AZL.Application) azl).KWHzl()) + 4);
        }
        if (!(azl instanceof AZL.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AZL.Activity) azl).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AZL azl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(azl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (azl instanceof AZL.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((AZL.ActionBar) azl).OLrzqt(), byteBuffer);
        } else if (azl instanceof AZL.Application) {
            byteBuffer.putInt(2);
            FfiConverterByteArray.INSTANCE.write(((AZL.Application) azl).KWHzl(), byteBuffer);
        } else {
            if (!(azl instanceof AZL.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AZL.Activity) azl).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
