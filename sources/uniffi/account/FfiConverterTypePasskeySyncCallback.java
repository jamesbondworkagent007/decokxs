package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zYM;
import o.zYO;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeySyncCallback extends BaseFfiConverterType<zYM> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeySyncCallback INSTANCE = new FfiConverterTypePasskeySyncCallback();

    private FfiConverterTypePasskeySyncCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zYM zym) {
        Intrinsics.checkNotNullParameter(zym, "");
        if (zym instanceof zYO) {
            return Long.valueOf(((zYO) zym).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zYM createFromHandle(long j) {
        return new zYO(C60184zxu.INSTANCE, j);
    }
}
