package uniffi.dex;

import o.AAL;
import o.C2242AEf;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureOptionalBridgeApproveDataWithOKFFIError extends BaseFfiConverterTypeLong<C2242AEf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureOptionalBridgeApproveDataWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureOptionalBridgeApproveDataWithOKFFIError();

    private FfiConverterTypeOKRustFutureOptionalBridgeApproveDataWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2242AEf lift(long j) {
        return new C2242AEf(C60184zxu.INSTANCE, j);
    }
}
