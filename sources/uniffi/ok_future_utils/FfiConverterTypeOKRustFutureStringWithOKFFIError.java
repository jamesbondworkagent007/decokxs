package uniffi.ok_future_utils;

import o.BfS;
import o.C4439Bec;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureStringWithOKFFIError extends BaseFfiConverterTypeLong<C4439Bec> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureStringWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureStringWithOKFFIError();

    private FfiConverterTypeOKRustFutureStringWithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4439Bec lift(long j) {
        return new C4439Bec(C60184zxu.INSTANCE, j);
    }
}
