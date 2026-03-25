package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zBW;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLinkLandingInteractor extends BaseFfiConverterTypeLong<zBW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkLandingInteractor INSTANCE = new FfiConverterTypeLinkLandingInteractor();

    private FfiConverterTypeLinkLandingInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zBW lift(long j) {
        return new zBW(C60184zxu.INSTANCE, j);
    }
}
