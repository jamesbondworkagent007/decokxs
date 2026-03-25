package uniffi.retail_kline;

import o.C4547Bic;
import o.C4578Bjg;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureCoinNewsResultWithOKFFIError extends BaseFfiConverterTypeLong<C4547Bic> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureCoinNewsResultWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureCoinNewsResultWithOKFFIError();

    private FfiConverterTypeOKRustFutureCoinNewsResultWithOKFFIError() {
        super(C4578Bjg.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4547Bic lift(long j) {
        return new C4547Bic(C60184zxu.INSTANCE, j);
    }
}
