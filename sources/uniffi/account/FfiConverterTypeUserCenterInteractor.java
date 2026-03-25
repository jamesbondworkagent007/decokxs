package uniffi.account;

import o.C3274Aip;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeUserCenterInteractor extends BaseFfiConverterTypeLong<C3274Aip> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUserCenterInteractor INSTANCE = new FfiConverterTypeUserCenterInteractor();

    private FfiConverterTypeUserCenterInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3274Aip lift(long j) {
        return new C3274Aip(C60184zxu.INSTANCE, j);
    }
}
