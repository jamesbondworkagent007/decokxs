package uniffi.account;

import o.C60184zxu;
import o.C60186zxw;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAccountConnectJourney extends BaseFfiConverterTypeLong<C60186zxw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountConnectJourney INSTANCE = new FfiConverterTypeAccountConnectJourney();

    private FfiConverterTypeAccountConnectJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C60186zxw lift(long j) {
        return new C60186zxw(C60184zxu.INSTANCE, j);
    }
}
