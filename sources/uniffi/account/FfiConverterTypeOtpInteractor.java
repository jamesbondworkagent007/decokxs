package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zUD;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOtpInteractor extends BaseFfiConverterTypeLong<zUD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOtpInteractor INSTANCE = new FfiConverterTypeOtpInteractor();

    private FfiConverterTypeOtpInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zUD lift(long j) {
        return new zUD(C60184zxu.INSTANCE, j);
    }
}
