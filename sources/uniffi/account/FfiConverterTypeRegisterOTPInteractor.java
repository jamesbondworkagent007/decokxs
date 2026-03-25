package uniffi.account;

import o.C2917AcC;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRegisterOTPInteractor extends BaseFfiConverterTypeLong<C2917AcC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterOTPInteractor INSTANCE = new FfiConverterTypeRegisterOTPInteractor();

    private FfiConverterTypeRegisterOTPInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2917AcC lift(long j) {
        return new C2917AcC(C60184zxu.INSTANCE, j);
    }
}
