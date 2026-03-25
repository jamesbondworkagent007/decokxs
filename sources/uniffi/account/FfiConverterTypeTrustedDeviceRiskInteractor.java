package uniffi.account;

import o.C3128AgB;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTrustedDeviceRiskInteractor extends BaseFfiConverterTypeLong<C3128AgB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceRiskInteractor INSTANCE = new FfiConverterTypeTrustedDeviceRiskInteractor();

    private FfiConverterTypeTrustedDeviceRiskInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3128AgB lift(long j) {
        return new C3128AgB(C60184zxu.INSTANCE, j);
    }
}
