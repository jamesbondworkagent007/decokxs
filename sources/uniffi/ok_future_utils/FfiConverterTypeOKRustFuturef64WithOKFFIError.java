package uniffi.ok_future_utils;

import o.BeN;
import o.BfS;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKRustFuturef64WithOKFFIError extends BaseFfiConverterTypeLong<BeN> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFuturef64WithOKFFIError INSTANCE = new FfiConverterTypeOKRustFuturef64WithOKFFIError();

    private FfiConverterTypeOKRustFuturef64WithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BeN lift(long j) {
        return new BeN(C60184zxu.INSTANCE, j);
    }
}
