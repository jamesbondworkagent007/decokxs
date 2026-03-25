package uniffi.account;

import o.C2982AdO;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRegisterPhoneInputInteractor extends BaseFfiConverterTypeLong<C2982AdO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterPhoneInputInteractor INSTANCE = new FfiConverterTypeRegisterPhoneInputInteractor();

    private FfiConverterTypeRegisterPhoneInputInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2982AdO lift(long j) {
        return new C2982AdO(C60184zxu.INSTANCE, j);
    }
}
