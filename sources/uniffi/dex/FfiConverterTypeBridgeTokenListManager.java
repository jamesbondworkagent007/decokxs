package uniffi.dex;

import o.AAL;
import o.C4134AzC;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBridgeTokenListManager extends BaseFfiConverterTypeLong<C4134AzC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBridgeTokenListManager INSTANCE = new FfiConverterTypeBridgeTokenListManager();

    private FfiConverterTypeBridgeTokenListManager() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4134AzC lift(long j) {
        return new C4134AzC(C60184zxu.INSTANCE, j);
    }
}
