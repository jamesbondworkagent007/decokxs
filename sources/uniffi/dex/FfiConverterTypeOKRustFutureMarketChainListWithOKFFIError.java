package uniffi.dex;

import o.AAL;
import o.ADO;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureMarketChainListWithOKFFIError extends BaseFfiConverterTypeLong<ADO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureMarketChainListWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureMarketChainListWithOKFFIError();

    private FfiConverterTypeOKRustFutureMarketChainListWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public ADO lift(long j) {
        return new ADO(C60184zxu.INSTANCE, j);
    }
}
