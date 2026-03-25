package uniffi.account;

import o.C2890Abc;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRegisterCorInteractor extends BaseFfiConverterTypeLong<C2890Abc> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterCorInteractor INSTANCE = new FfiConverterTypeRegisterCorInteractor();

    private FfiConverterTypeRegisterCorInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2890Abc lift(long j) {
        return new C2890Abc(C60184zxu.INSTANCE, j);
    }
}
