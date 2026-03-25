package uniffi.experiment;

import o.AIP;
import o.C2348AIh;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureApiResultWithFetchAllFeaturesError extends BaseFfiConverterTypeLong<AIP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureApiResultWithFetchAllFeaturesError INSTANCE = new FfiConverterTypeOKRustFutureApiResultWithFetchAllFeaturesError();

    private FfiConverterTypeOKRustFutureApiResultWithFetchAllFeaturesError() {
        super(C2348AIh.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AIP lift(long j) {
        return new AIP(C60184zxu.INSTANCE, j);
    }
}
