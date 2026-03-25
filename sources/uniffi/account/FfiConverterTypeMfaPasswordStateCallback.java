package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58567zHd;
import o.C60184zxu;
import o.C60230zyn;
import o.zGX;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaPasswordStateCallback extends BaseFfiConverterType<zGX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasswordStateCallback INSTANCE = new FfiConverterTypeMfaPasswordStateCallback();

    private FfiConverterTypeMfaPasswordStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zGX zgx) {
        Intrinsics.checkNotNullParameter(zgx, "");
        if (zgx instanceof C58567zHd) {
            return Long.valueOf(((C58567zHd) zgx).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zGX createFromHandle(long j) {
        return new C58567zHd(C60184zxu.INSTANCE, j);
    }
}
