package uniffi.retail_trading;

import o.BlA;
import o.C4608Bkj;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureDexTokenVoListWithOKFFIError extends BaseFfiConverterTypeLong<C4608Bkj> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureDexTokenVoListWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureDexTokenVoListWithOKFFIError();

    private FfiConverterTypeOKRustFutureDexTokenVoListWithOKFFIError() {
        super(BlA.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4608Bkj lift(long j) {
        return new C4608Bkj(C60184zxu.INSTANCE, j);
    }
}
