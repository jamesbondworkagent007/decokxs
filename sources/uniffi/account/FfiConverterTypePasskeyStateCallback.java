package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zXU;
import o.zXV;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyStateCallback extends BaseFfiConverterType<zXU> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyStateCallback INSTANCE = new FfiConverterTypePasskeyStateCallback();

    private FfiConverterTypePasskeyStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zXU zxu) {
        Intrinsics.checkNotNullParameter(zxu, "");
        if (zxu instanceof zXV) {
            return Long.valueOf(((zXV) zxu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zXU createFromHandle(long j) {
        return new zXV(C60184zxu.INSTANCE, j);
    }
}
