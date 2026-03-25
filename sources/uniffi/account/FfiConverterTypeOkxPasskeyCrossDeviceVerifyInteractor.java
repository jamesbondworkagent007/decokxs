package uniffi.account;

import o.C58833zRa;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceVerifyInteractor extends BaseFfiConverterTypeLong<C58833zRa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceVerifyInteractor INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceVerifyInteractor();

    private FfiConverterTypeOkxPasskeyCrossDeviceVerifyInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58833zRa lift(long j) {
        return new C58833zRa(C60184zxu.INSTANCE, j);
    }
}
