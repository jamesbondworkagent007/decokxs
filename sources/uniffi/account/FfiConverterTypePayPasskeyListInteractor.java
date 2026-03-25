package uniffi.account;

import o.C59063zZv;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePayPasskeyListInteractor extends BaseFfiConverterTypeLong<C59063zZv> {
    public static final int $stable = 0;
    public static final FfiConverterTypePayPasskeyListInteractor INSTANCE = new FfiConverterTypePayPasskeyListInteractor();

    private FfiConverterTypePayPasskeyListInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C59063zZv lift(long j) {
        return new C59063zZv(C60184zxu.INSTANCE, j);
    }
}
