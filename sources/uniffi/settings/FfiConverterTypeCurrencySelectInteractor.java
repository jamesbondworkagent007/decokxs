package uniffi.settings;

import o.BmZ;
import o.BoN;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCurrencySelectInteractor extends BaseFfiConverterTypeLong<BmZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCurrencySelectInteractor INSTANCE = new FfiConverterTypeCurrencySelectInteractor();

    private FfiConverterTypeCurrencySelectInteractor() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BmZ lift(long j) {
        return new BmZ(C60184zxu.INSTANCE, j);
    }
}
