package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zZP;
import o.zZR;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePayPasskeyListStateCallback extends BaseFfiConverterType<zZR> {
    public static final int $stable = 0;
    public static final FfiConverterTypePayPasskeyListStateCallback INSTANCE = new FfiConverterTypePayPasskeyListStateCallback();

    private FfiConverterTypePayPasskeyListStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zZR zzr) {
        Intrinsics.checkNotNullParameter(zzr, "");
        if (zzr instanceof zZP) {
            return Long.valueOf(((zZP) zzr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zZR createFromHandle(long j) {
        return new zZP(C60184zxu.INSTANCE, j);
    }
}
