package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.C60237zyu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAccountsInteractor extends BaseFfiConverterTypeLong<C60237zyu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountsInteractor INSTANCE = new FfiConverterTypeAccountsInteractor();

    private FfiConverterTypeAccountsInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C60237zyu lift(long j) {
        return new C60237zyu(C60184zxu.INSTANCE, j);
    }
}
