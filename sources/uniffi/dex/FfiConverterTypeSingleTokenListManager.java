package uniffi.dex;

import o.AAL;
import o.C2303AGo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSingleTokenListManager extends BaseFfiConverterTypeLong<C2303AGo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSingleTokenListManager INSTANCE = new FfiConverterTypeSingleTokenListManager();

    private FfiConverterTypeSingleTokenListManager() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2303AGo lift(long j) {
        return new C2303AGo(C60184zxu.INSTANCE, j);
    }
}
