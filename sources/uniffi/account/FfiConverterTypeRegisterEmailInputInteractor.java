package uniffi.account;

import o.C2874AbM;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRegisterEmailInputInteractor extends BaseFfiConverterTypeLong<C2874AbM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterEmailInputInteractor INSTANCE = new FfiConverterTypeRegisterEmailInputInteractor();

    private FfiConverterTypeRegisterEmailInputInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2874AbM lift(long j) {
        return new C2874AbM(C60184zxu.INSTANCE, j);
    }
}
