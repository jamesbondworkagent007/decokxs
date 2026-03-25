package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zEI;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMfaJourney extends BaseFfiConverterTypeLong<zEI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaJourney INSTANCE = new FfiConverterTypeMfaJourney();

    private FfiConverterTypeMfaJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zEI lift(long j) {
        return new zEI(C60184zxu.INSTANCE, j);
    }
}
