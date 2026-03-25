package uniffi.dex;

import o.AAL;
import o.C2185ACa;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureAlertListResponseVecWithOKFFIError extends BaseFfiConverterTypeLong<C2185ACa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureAlertListResponseVecWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureAlertListResponseVecWithOKFFIError();

    private FfiConverterTypeOKRustFutureAlertListResponseVecWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2185ACa lift(long j) {
        return new C2185ACa(C60184zxu.INSTANCE, j);
    }
}
