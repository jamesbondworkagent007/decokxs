package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zDH;
import o.zDN;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginPasskeyEventCallback extends BaseFfiConverterType<zDH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginPasskeyEventCallback INSTANCE = new FfiConverterTypeLoginPasskeyEventCallback();

    private FfiConverterTypeLoginPasskeyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zDH zdh) {
        Intrinsics.checkNotNullParameter(zdh, "");
        if (zdh instanceof zDN) {
            return Long.valueOf(((zDN) zdh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zDH createFromHandle(long j) {
        return new zDN(C60184zxu.INSTANCE, j);
    }
}
