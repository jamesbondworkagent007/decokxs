package uniffi.account;

import o.C59041zYz;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeySyncBleManager extends BaseFfiConverterTypeLong<C59041zYz> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeySyncBleManager INSTANCE = new FfiConverterTypePasskeySyncBleManager();

    private FfiConverterTypePasskeySyncBleManager() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C59041zYz lift(long j) {
        return new C59041zYz(C60184zxu.INSTANCE, j);
    }
}
