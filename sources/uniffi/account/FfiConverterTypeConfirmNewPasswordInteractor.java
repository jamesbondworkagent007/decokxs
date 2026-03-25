package uniffi.account;

import o.C58385zAk;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeConfirmNewPasswordInteractor extends BaseFfiConverterTypeLong<C58385zAk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeConfirmNewPasswordInteractor INSTANCE = new FfiConverterTypeConfirmNewPasswordInteractor();

    private FfiConverterTypeConfirmNewPasswordInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58385zAk lift(long j) {
        return new C58385zAk(C60184zxu.INSTANCE, j);
    }
}
