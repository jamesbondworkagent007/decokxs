package uniffi.dex;

import o.AAL;
import o.ABO;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureAddAlertResponseWithOKFFIError extends BaseFfiConverterTypeLong<ABO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureAddAlertResponseWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureAddAlertResponseWithOKFFIError();

    private FfiConverterTypeOKRustFutureAddAlertResponseWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public ABO lift(long j) {
        return new ABO(C60184zxu.INSTANCE, j);
    }
}
