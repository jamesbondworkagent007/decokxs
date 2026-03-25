package uniffi.ok_future_utils;

import o.BfJ;
import o.BfS;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKRustFutureu64WithOKFFIError extends BaseFfiConverterTypeLong<BfJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureu64WithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureu64WithOKFFIError();

    private FfiConverterTypeOKRustFutureu64WithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BfJ lift(long j) {
        return new BfJ(C60184zxu.INSTANCE, j);
    }
}
