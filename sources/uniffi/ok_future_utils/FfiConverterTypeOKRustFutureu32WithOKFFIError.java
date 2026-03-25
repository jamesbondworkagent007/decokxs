package uniffi.ok_future_utils;

import o.BfA;
import o.BfS;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKRustFutureu32WithOKFFIError extends BaseFfiConverterTypeLong<BfA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureu32WithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureu32WithOKFFIError();

    private FfiConverterTypeOKRustFutureu32WithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BfA lift(long j) {
        return new BfA(C60184zxu.INSTANCE, j);
    }
}
