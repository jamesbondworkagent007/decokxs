package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zVB;
import o.zVG;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyEventCallback extends BaseFfiConverterType<zVB> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyEventCallback INSTANCE = new FfiConverterTypePasskeyEventCallback();

    private FfiConverterTypePasskeyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zVB zvb) {
        Intrinsics.checkNotNullParameter(zvb, "");
        if (zvb instanceof zVG) {
            return Long.valueOf(((zVG) zvb).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zVB createFromHandle(long j) {
        return new zVG(C60184zxu.INSTANCE, j);
    }
}
