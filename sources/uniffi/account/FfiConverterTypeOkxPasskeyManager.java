package uniffi.account;

import o.C58863zSd;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyManager extends BaseFfiConverterTypeLong<C58863zSd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyManager INSTANCE = new FfiConverterTypeOkxPasskeyManager();

    private FfiConverterTypeOkxPasskeyManager() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58863zSd lift(long j) {
        return new C58863zSd(C60184zxu.INSTANCE, j);
    }
}
