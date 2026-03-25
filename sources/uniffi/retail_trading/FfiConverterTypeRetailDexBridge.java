package uniffi.retail_trading;

import o.BkX;
import o.BlA;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRetailDexBridge extends BaseFfiConverterTypeLong<BkX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRetailDexBridge INSTANCE = new FfiConverterTypeRetailDexBridge();

    private FfiConverterTypeRetailDexBridge() {
        super(BlA.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BkX lift(long j) {
        return new BkX(C60184zxu.INSTANCE, j);
    }
}
