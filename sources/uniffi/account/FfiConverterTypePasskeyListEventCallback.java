package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zVO;
import o.zVP;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyListEventCallback extends BaseFfiConverterType<zVP> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyListEventCallback INSTANCE = new FfiConverterTypePasskeyListEventCallback();

    private FfiConverterTypePasskeyListEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zVP zvp) {
        Intrinsics.checkNotNullParameter(zvp, "");
        if (zvp instanceof zVO) {
            return Long.valueOf(((zVO) zvp).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zVP createFromHandle(long j) {
        return new zVO(C60184zxu.INSTANCE, j);
    }
}
