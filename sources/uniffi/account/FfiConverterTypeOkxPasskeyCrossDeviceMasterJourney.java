package uniffi.account;

import o.C58785zPg;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterJourney extends BaseFfiConverterTypeLong<C58785zPg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterJourney INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterJourney();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58785zPg lift(long j) {
        return new C58785zPg(C60184zxu.INSTANCE, j);
    }
}
