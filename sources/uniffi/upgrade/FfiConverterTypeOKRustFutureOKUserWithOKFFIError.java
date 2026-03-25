package uniffi.upgrade;

import o.BuB;
import o.C4865Btx;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKRustFutureOKUserWithOKFFIError extends BaseFfiConverterTypeLong<C4865Btx> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureOKUserWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureOKUserWithOKFFIError();

    private FfiConverterTypeOKRustFutureOKUserWithOKFFIError() {
        super(BuB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4865Btx lift(long j) {
        return new C4865Btx(C60184zxu.INSTANCE, j);
    }
}
