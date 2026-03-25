package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zIR;
import o.zIV;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeNativePasskeyKeyProvider extends BaseFfiConverterType<zIR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativePasskeyKeyProvider INSTANCE = new FfiConverterTypeNativePasskeyKeyProvider();

    private FfiConverterTypeNativePasskeyKeyProvider() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zIR zir) {
        Intrinsics.checkNotNullParameter(zir, "");
        if (zir instanceof zIV) {
            return Long.valueOf(((zIV) zir).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zIR createFromHandle(long j) {
        return new zIV(C60184zxu.INSTANCE, j);
    }
}
