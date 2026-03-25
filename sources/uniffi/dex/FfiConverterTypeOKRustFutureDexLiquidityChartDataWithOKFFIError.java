package uniffi.dex;

import o.AAL;
import o.C2234ADx;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureDexLiquidityChartDataWithOKFFIError extends BaseFfiConverterTypeLong<C2234ADx> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureDexLiquidityChartDataWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureDexLiquidityChartDataWithOKFFIError();

    private FfiConverterTypeOKRustFutureDexLiquidityChartDataWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2234ADx lift(long j) {
        return new C2234ADx(C60184zxu.INSTANCE, j);
    }
}
