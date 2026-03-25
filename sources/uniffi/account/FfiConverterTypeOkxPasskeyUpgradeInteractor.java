package uniffi.account;

import o.C58924zUm;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyUpgradeInteractor extends BaseFfiConverterTypeLong<C58924zUm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyUpgradeInteractor INSTANCE = new FfiConverterTypeOkxPasskeyUpgradeInteractor();

    private FfiConverterTypeOkxPasskeyUpgradeInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58924zUm lift(long j) {
        return new C58924zUm(C60184zxu.INSTANCE, j);
    }
}
