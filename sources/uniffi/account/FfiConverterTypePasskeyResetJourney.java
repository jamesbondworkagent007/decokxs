package uniffi.account;

import o.C58997zXh;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeyResetJourney extends BaseFfiConverterTypeLong<C58997zXh> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyResetJourney INSTANCE = new FfiConverterTypePasskeyResetJourney();

    private FfiConverterTypePasskeyResetJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58997zXh lift(long j) {
        return new C58997zXh(C60184zxu.INSTANCE, j);
    }
}
