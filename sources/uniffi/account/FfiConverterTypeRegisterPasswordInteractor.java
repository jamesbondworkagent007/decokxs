package uniffi.account;

import o.C3006Adm;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRegisterPasswordInteractor extends BaseFfiConverterTypeLong<C3006Adm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterPasswordInteractor INSTANCE = new FfiConverterTypeRegisterPasswordInteractor();

    private FfiConverterTypeRegisterPasswordInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3006Adm lift(long j) {
        return new C3006Adm(C60184zxu.INSTANCE, j);
    }
}
