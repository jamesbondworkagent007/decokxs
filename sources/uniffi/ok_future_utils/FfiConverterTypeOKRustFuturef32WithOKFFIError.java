package uniffi.ok_future_utils;

import o.BeD;
import o.BfS;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKRustFuturef32WithOKFFIError extends BaseFfiConverterTypeLong<BeD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFuturef32WithOKFFIError INSTANCE = new FfiConverterTypeOKRustFuturef32WithOKFFIError();

    private FfiConverterTypeOKRustFuturef32WithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BeD lift(long j) {
        return new BeD(C60184zxu.INSTANCE, j);
    }
}
