package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zUS;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOtpState extends BaseFfiConverterTypeLong<zUS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOtpState INSTANCE = new FfiConverterTypeOtpState();

    private FfiConverterTypeOtpState() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zUS lift(long j) {
        return new zUS(C60184zxu.INSTANCE, j);
    }
}
