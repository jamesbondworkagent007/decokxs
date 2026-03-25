package uniffi.account;

import o.C3184AhE;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeUploadIdJourney extends BaseFfiConverterTypeLong<C3184AhE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUploadIdJourney INSTANCE = new FfiConverterTypeUploadIdJourney();

    private FfiConverterTypeUploadIdJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3184AhE lift(long j) {
        return new C3184AhE(C60184zxu.INSTANCE, j);
    }
}
