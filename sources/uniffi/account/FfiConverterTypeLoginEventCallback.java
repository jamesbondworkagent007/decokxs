package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zCB;
import o.zCE;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginEventCallback extends BaseFfiConverterType<zCE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginEventCallback INSTANCE = new FfiConverterTypeLoginEventCallback();

    private FfiConverterTypeLoginEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zCE zce) {
        Intrinsics.checkNotNullParameter(zce, "");
        if (zce instanceof zCB) {
            return Long.valueOf(((zCB) zce).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zCE createFromHandle(long j) {
        return new zCB(C60184zxu.INSTANCE, j);
    }
}
