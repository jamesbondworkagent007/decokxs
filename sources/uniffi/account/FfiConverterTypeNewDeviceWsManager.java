package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zNF;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceWsManager extends BaseFfiConverterTypeLong<zNF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceWsManager INSTANCE = new FfiConverterTypeNewDeviceWsManager();

    private FfiConverterTypeNewDeviceWsManager() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zNF lift(long j) {
        return new zNF(C60184zxu.INSTANCE, j);
    }
}
