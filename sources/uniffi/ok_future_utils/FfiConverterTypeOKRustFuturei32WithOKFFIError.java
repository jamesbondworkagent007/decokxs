package uniffi.ok_future_utils;

import o.BeZ;
import o.BfS;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFuturei32WithOKFFIError extends BaseFfiConverterTypeLong<BeZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFuturei32WithOKFFIError INSTANCE = new FfiConverterTypeOKRustFuturei32WithOKFFIError();

    private FfiConverterTypeOKRustFuturei32WithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BeZ lift(long j) {
        return new BeZ(C60184zxu.INSTANCE, j);
    }
}
