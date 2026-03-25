package uniffi.feature_restriction;

import o.AJR;
import o.ALB;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFeatureRestrictionBridge extends BaseFfiConverterTypeLong<AJR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureRestrictionBridge INSTANCE = new FfiConverterTypeFeatureRestrictionBridge();

    private FfiConverterTypeFeatureRestrictionBridge() {
        super(ALB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AJR lift(long j) {
        return new AJR(C60184zxu.INSTANCE, j);
    }
}
