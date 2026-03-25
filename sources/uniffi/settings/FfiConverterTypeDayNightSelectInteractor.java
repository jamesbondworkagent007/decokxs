package uniffi.settings;

import o.BoN;
import o.C4695Bnp;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDayNightSelectInteractor extends BaseFfiConverterTypeLong<C4695Bnp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDayNightSelectInteractor INSTANCE = new FfiConverterTypeDayNightSelectInteractor();

    private FfiConverterTypeDayNightSelectInteractor() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4695Bnp lift(long j) {
        return new C4695Bnp(C60184zxu.INSTANCE, j);
    }
}
