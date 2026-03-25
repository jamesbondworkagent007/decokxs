package uniffi.account;

import o.C58893zTh;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyTracker extends BaseFfiConverterTypeLong<C58893zTh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyTracker INSTANCE = new FfiConverterTypeOkxPasskeyTracker();

    private FfiConverterTypeOkxPasskeyTracker() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58893zTh lift(long j) {
        return new C58893zTh(C60184zxu.INSTANCE, j);
    }
}
