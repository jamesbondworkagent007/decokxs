package uniffi.dex;

import o.AAL;
import o.C2204ACt;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureBridgeChainListWithOKFFIError extends BaseFfiConverterTypeLong<C2204ACt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureBridgeChainListWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureBridgeChainListWithOKFFIError();

    private FfiConverterTypeOKRustFutureBridgeChainListWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2204ACt lift(long j) {
        return new C2204ACt(C60184zxu.INSTANCE, j);
    }
}
