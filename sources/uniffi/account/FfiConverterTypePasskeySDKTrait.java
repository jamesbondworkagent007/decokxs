package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C59015zXz;
import o.C60184zxu;
import o.C60230zyn;
import o.zXB;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeySDKTrait extends BaseFfiConverterType<zXB> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeySDKTrait INSTANCE = new FfiConverterTypePasskeySDKTrait();

    private FfiConverterTypePasskeySDKTrait() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zXB zxb) {
        Intrinsics.checkNotNullParameter(zxb, "");
        if (zxb instanceof C59015zXz) {
            return Long.valueOf(((C59015zXz) zxb).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zXB createFromHandle(long j) {
        return new C59015zXz(C60184zxu.INSTANCE, j);
    }
}
