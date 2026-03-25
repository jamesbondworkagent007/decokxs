package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zLA;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceJourney extends BaseFfiConverterTypeLong<zLA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceJourney INSTANCE = new FfiConverterTypeNewDeviceJourney();

    private FfiConverterTypeNewDeviceJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zLA lift(long j) {
        return new zLA(C60184zxu.INSTANCE, j);
    }
}
