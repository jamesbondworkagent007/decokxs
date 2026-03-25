package uniffi.account;

import o.C58816zQk;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceSyncJourney extends BaseFfiConverterTypeLong<C58816zQk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceSyncJourney INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceSyncJourney();

    private FfiConverterTypeOkxPasskeyCrossDeviceSyncJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58816zQk lift(long j) {
        return new C58816zQk(C60184zxu.INSTANCE, j);
    }
}
