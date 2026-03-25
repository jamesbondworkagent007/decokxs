package uniffi.buy_sell;

import o.C3634Ape;
import o.C3722ArM;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBSCQuickConvertInteractor extends BaseFfiConverterTypeLong<C3634Ape> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBSCQuickConvertInteractor INSTANCE = new FfiConverterTypeBSCQuickConvertInteractor();

    private FfiConverterTypeBSCQuickConvertInteractor() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3634Ape lift(long j) {
        return new C3634Ape(C60184zxu.INSTANCE, j);
    }
}
