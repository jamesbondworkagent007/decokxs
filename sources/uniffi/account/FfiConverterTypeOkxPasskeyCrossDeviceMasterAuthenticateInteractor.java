package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zNP;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateInteractor extends BaseFfiConverterTypeLong<zNP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateInteractor INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateInteractor();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zNP lift(long j) {
        return new zNP(C60184zxu.INSTANCE, j);
    }
}
