package uniffi.dex;

import o.AAL;
import o.C2221ADk;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureDexHolderAnalysisDataWithOKFFIError extends BaseFfiConverterTypeLong<C2221ADk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureDexHolderAnalysisDataWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureDexHolderAnalysisDataWithOKFFIError();

    private FfiConverterTypeOKRustFutureDexHolderAnalysisDataWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2221ADk lift(long j) {
        return new C2221ADk(C60184zxu.INSTANCE, j);
    }
}
