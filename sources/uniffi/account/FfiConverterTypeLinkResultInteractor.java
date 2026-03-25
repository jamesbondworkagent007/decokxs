package uniffi.account;

import o.C58441zCm;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLinkResultInteractor extends BaseFfiConverterTypeLong<C58441zCm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkResultInteractor INSTANCE = new FfiConverterTypeLinkResultInteractor();

    private FfiConverterTypeLinkResultInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58441zCm lift(long j) {
        return new C58441zCm(C60184zxu.INSTANCE, j);
    }
}
