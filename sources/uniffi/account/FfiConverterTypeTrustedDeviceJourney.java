package uniffi.account;

import o.C3087AfN;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTrustedDeviceJourney extends BaseFfiConverterTypeLong<C3087AfN> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceJourney INSTANCE = new FfiConverterTypeTrustedDeviceJourney();

    private FfiConverterTypeTrustedDeviceJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3087AfN lift(long j) {
        return new C3087AfN(C60184zxu.INSTANCE, j);
    }
}
