package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zBJ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLinkLandingEvent implements FfiConverterRustBuffer<zBJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkLandingEvent INSTANCE = new FfiConverterTypeLinkLandingEvent();

    private FfiConverterTypeLinkLandingEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zBJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zBJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zBJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zBJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zBJ zbj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zbj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zBJ zbj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zbj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zBJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zBJ.TaskDescription(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new zBJ.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zBJ zbj) {
        Intrinsics.checkNotNullParameter(zbj, "");
        if (zbj instanceof zBJ.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((zBJ.TaskDescription) zbj).KWHzl()) + 4);
        }
        if (!(zbj instanceof zBJ.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zBJ.ActionBar) zbj).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zBJ zbj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zbj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zbj instanceof zBJ.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((zBJ.TaskDescription) zbj).KWHzl(), byteBuffer);
        } else {
            if (!(zbj instanceof zBJ.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zBJ.ActionBar) zbj).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
