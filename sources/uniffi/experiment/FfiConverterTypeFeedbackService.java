package uniffi.experiment;

import o.AIC;
import o.C2348AIh;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFeedbackService extends BaseFfiConverterTypeLong<AIC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeedbackService INSTANCE = new FfiConverterTypeFeedbackService();

    private FfiConverterTypeFeedbackService() {
        super(C2348AIh.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AIC lift(long j) {
        return new AIC(C60184zxu.INSTANCE, j);
    }
}
