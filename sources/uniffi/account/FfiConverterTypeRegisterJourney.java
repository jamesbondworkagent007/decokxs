package uniffi.account;

import o.C2946Acf;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRegisterJourney extends BaseFfiConverterTypeLong<C2946Acf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterJourney INSTANCE = new FfiConverterTypeRegisterJourney();

    private FfiConverterTypeRegisterJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2946Acf lift(long j) {
        return new C2946Acf(C60184zxu.INSTANCE, j);
    }
}
