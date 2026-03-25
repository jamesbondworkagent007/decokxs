package uniffi.account;

import o.C3220Aho;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeUnlinkInteractor extends BaseFfiConverterTypeLong<C3220Aho> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUnlinkInteractor INSTANCE = new FfiConverterTypeUnlinkInteractor();

    private FfiConverterTypeUnlinkInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3220Aho lift(long j) {
        return new C3220Aho(C60184zxu.INSTANCE, j);
    }
}
