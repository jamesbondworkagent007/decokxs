package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zBK;
import o.zBL;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLinkLandingEventCallback extends BaseFfiConverterType<zBL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkLandingEventCallback INSTANCE = new FfiConverterTypeLinkLandingEventCallback();

    private FfiConverterTypeLinkLandingEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zBL zbl) {
        Intrinsics.checkNotNullParameter(zbl, "");
        if (zbl instanceof zBK) {
            return Long.valueOf(((zBK) zbl).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zBL createFromHandle(long j) {
        return new zBK(C60184zxu.INSTANCE, j);
    }
}
