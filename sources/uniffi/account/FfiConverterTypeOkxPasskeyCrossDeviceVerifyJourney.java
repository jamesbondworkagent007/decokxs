package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zRA;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceVerifyJourney extends BaseFfiConverterTypeLong<zRA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceVerifyJourney INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceVerifyJourney();

    private FfiConverterTypeOkxPasskeyCrossDeviceVerifyJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zRA lift(long j) {
        return new zRA(C60184zxu.INSTANCE, j);
    }
}
