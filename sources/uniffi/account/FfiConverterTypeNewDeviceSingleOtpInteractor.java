package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zMX;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceSingleOtpInteractor extends BaseFfiConverterTypeLong<zMX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceSingleOtpInteractor INSTANCE = new FfiConverterTypeNewDeviceSingleOtpInteractor();

    private FfiConverterTypeNewDeviceSingleOtpInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zMX lift(long j) {
        return new zMX(C60184zxu.INSTANCE, j);
    }
}
