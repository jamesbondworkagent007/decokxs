package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zHB;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMfaSwitchMethodInteractor extends BaseFfiConverterTypeLong<zHB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaSwitchMethodInteractor INSTANCE = new FfiConverterTypeMfaSwitchMethodInteractor();

    private FfiConverterTypeMfaSwitchMethodInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zHB lift(long j) {
        return new zHB(C60184zxu.INSTANCE, j);
    }
}
