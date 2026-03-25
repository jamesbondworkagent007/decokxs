package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zSL;
import o.zSM;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeySyncCallback extends BaseFfiConverterType<zSM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeySyncCallback INSTANCE = new FfiConverterTypeOkxPasskeySyncCallback();

    private FfiConverterTypeOkxPasskeySyncCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zSM zsm) {
        Intrinsics.checkNotNullParameter(zsm, "");
        if (zsm instanceof zSL) {
            return Long.valueOf(((zSL) zsm).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zSM createFromHandle(long j) {
        return new zSL(C60184zxu.INSTANCE, j);
    }
}
