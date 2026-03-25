package uniffi.account;

import o.C3106Afg;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSetPasswordInteractor extends BaseFfiConverterTypeLong<C3106Afg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSetPasswordInteractor INSTANCE = new FfiConverterTypeSetPasswordInteractor();

    private FfiConverterTypeSetPasswordInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3106Afg lift(long j) {
        return new C3106Afg(C60184zxu.INSTANCE, j);
    }
}
