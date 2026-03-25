package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zJM;
import o.zJN;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceCodeEventCallback extends BaseFfiConverterType<zJN> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceCodeEventCallback INSTANCE = new FfiConverterTypeNewDeviceCodeEventCallback();

    private FfiConverterTypeNewDeviceCodeEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zJN zjn) {
        Intrinsics.checkNotNullParameter(zjn, "");
        if (zjn instanceof zJM) {
            return Long.valueOf(((zJM) zjn).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zJN createFromHandle(long j) {
        return new zJM(C60184zxu.INSTANCE, j);
    }
}
