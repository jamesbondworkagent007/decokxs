package uniffi.settings;

import o.BoN;
import o.C4663Bmk;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeColorSelectInteractor extends BaseFfiConverterTypeLong<C4663Bmk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeColorSelectInteractor INSTANCE = new FfiConverterTypeColorSelectInteractor();

    private FfiConverterTypeColorSelectInteractor() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4663Bmk lift(long j) {
        return new C4663Bmk(C60184zxu.INSTANCE, j);
    }
}
