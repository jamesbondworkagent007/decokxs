package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zVQ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyListEvent implements FfiConverterRustBuffer<zVQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyListEvent INSTANCE = new FfiConverterTypePasskeyListEvent();

    private FfiConverterTypePasskeyListEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zVQ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zVQ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zVQ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zVQ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zVQ zvq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zvq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zVQ zvq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zvq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zVQ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return new zVQ.FragmentManager(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
            case 2:
                return zVQ.PendingIntent.INSTANCE;
            case 3:
                return zVQ.ActionBar.INSTANCE;
            case 4:
                return new zVQ.Application(FfiConverterTypePasskeyListItem.INSTANCE.read(byteBuffer));
            case 5:
                return zVQ.StateListAnimator.INSTANCE;
            case 6:
                FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
                return new zVQ.LoaderManager(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
            case 7:
                return zVQ.Dialog.INSTANCE;
            case 8:
                return new zVQ.Activity(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterSequenceString.INSTANCE.read(byteBuffer));
            case 9:
                return new zVQ.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
            case 10:
                return new zVQ.Fragment(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zVQ zvq) {
        Intrinsics.checkNotNullParameter(zvq, "");
        if (zvq instanceof zVQ.FragmentManager) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((zVQ.FragmentManager) zvq).copydefault()) + 4);
        }
        if ((zvq instanceof zVQ.PendingIntent) || (zvq instanceof zVQ.ActionBar)) {
            return 4L;
        }
        if (zvq instanceof zVQ.Application) {
            return C56396yDv.copydefault(FfiConverterTypePasskeyListItem.INSTANCE.mo9529allocationSizeI7RO_PI(((zVQ.Application) zvq).AEQbTJ()) + 4);
        }
        if (zvq instanceof zVQ.StateListAnimator) {
            return 4L;
        }
        if (zvq instanceof zVQ.LoaderManager) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zVQ.LoaderManager loaderManager = (zVQ.LoaderManager) zvq;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(loaderManager.copydefault()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(loaderManager.AEQbTJ()));
        }
        if (zvq instanceof zVQ.Dialog) {
            return 4L;
        }
        if (zvq instanceof zVQ.Activity) {
            zVQ.Activity activity = (zVQ.Activity) zvq;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(activity.copydefault()) + 4) + FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) activity.KWHzl()));
        }
        if (zvq instanceof zVQ.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVQ.TaskDescription) zvq).copydefault()) + 4);
        }
        if (!(zvq instanceof zVQ.Fragment)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zVQ.Fragment) zvq).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zVQ zvq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zvq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zvq instanceof zVQ.FragmentManager) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((zVQ.FragmentManager) zvq).copydefault(), byteBuffer);
        } else if (zvq instanceof zVQ.PendingIntent) {
            byteBuffer.putInt(2);
        } else if (zvq instanceof zVQ.ActionBar) {
            byteBuffer.putInt(3);
        } else if (zvq instanceof zVQ.Application) {
            byteBuffer.putInt(4);
            FfiConverterTypePasskeyListItem.INSTANCE.write(((zVQ.Application) zvq).AEQbTJ(), byteBuffer);
        } else if (zvq instanceof zVQ.StateListAnimator) {
            byteBuffer.putInt(5);
        } else if (zvq instanceof zVQ.LoaderManager) {
            byteBuffer.putInt(6);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zVQ.LoaderManager loaderManager = (zVQ.LoaderManager) zvq;
            ffiConverterString.write(loaderManager.copydefault(), byteBuffer);
            ffiConverterString.write(loaderManager.AEQbTJ(), byteBuffer);
        } else if (zvq instanceof zVQ.Dialog) {
            byteBuffer.putInt(7);
        } else if (zvq instanceof zVQ.Activity) {
            byteBuffer.putInt(8);
            zVQ.Activity activity = (zVQ.Activity) zvq;
            FfiConverterString.INSTANCE.write(activity.copydefault(), byteBuffer);
            FfiConverterSequenceString.INSTANCE.write((List) activity.KWHzl(), byteBuffer);
        } else if (zvq instanceof zVQ.TaskDescription) {
            byteBuffer.putInt(9);
            FfiConverterString.INSTANCE.write(((zVQ.TaskDescription) zvq).copydefault(), byteBuffer);
        } else {
            if (!(zvq instanceof zVQ.Fragment)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(10);
            FfiConverterBoolean.INSTANCE.write(((zVQ.Fragment) zvq).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
