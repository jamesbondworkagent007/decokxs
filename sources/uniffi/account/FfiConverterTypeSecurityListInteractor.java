package uniffi.account;

import o.C3071Aey;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSecurityListInteractor extends BaseFfiConverterTypeLong<C3071Aey> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSecurityListInteractor INSTANCE = new FfiConverterTypeSecurityListInteractor();

    private FfiConverterTypeSecurityListInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3071Aey lift(long j) {
        return new C3071Aey(C60184zxu.INSTANCE, j);
    }
}
