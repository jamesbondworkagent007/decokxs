package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zGI;
import o.zGJ;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaPasswordEventCallback extends BaseFfiConverterType<zGJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasswordEventCallback INSTANCE = new FfiConverterTypeMfaPasswordEventCallback();

    private FfiConverterTypeMfaPasswordEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zGJ zgj) {
        Intrinsics.checkNotNullParameter(zgj, "");
        if (zgj instanceof zGI) {
            return Long.valueOf(((zGI) zgj).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zGJ createFromHandle(long j) {
        return new zGI(C60184zxu.INSTANCE, j);
    }
}
