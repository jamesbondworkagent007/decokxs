package uniffi.dex;

import o.AAL;
import o.C2275AFm;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureSummaryDataWithOKFFIError extends BaseFfiConverterTypeLong<C2275AFm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureSummaryDataWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureSummaryDataWithOKFFIError();

    private FfiConverterTypeOKRustFutureSummaryDataWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2275AFm lift(long j) {
        return new C2275AFm(C60184zxu.INSTANCE, j);
    }
}
