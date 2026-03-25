package uniffi.feature_restriction;

import o.AKR;
import o.ALB;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFeatureRestrictionDebugBridge extends BaseFfiConverterTypeLong<AKR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureRestrictionDebugBridge INSTANCE = new FfiConverterTypeFeatureRestrictionDebugBridge();

    private FfiConverterTypeFeatureRestrictionDebugBridge() {
        super(ALB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AKR lift(long j) {
        return new AKR(C60184zxu.INSTANCE, j);
    }
}
