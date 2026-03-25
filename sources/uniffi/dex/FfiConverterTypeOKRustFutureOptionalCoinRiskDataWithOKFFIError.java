package uniffi.dex;

import o.AAL;
import o.C2257AEu;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureOptionalCoinRiskDataWithOKFFIError extends BaseFfiConverterTypeLong<C2257AEu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureOptionalCoinRiskDataWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureOptionalCoinRiskDataWithOKFFIError();

    private FfiConverterTypeOKRustFutureOptionalCoinRiskDataWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2257AEu lift(long j) {
        return new C2257AEu(C60184zxu.INSTANCE, j);
    }
}
