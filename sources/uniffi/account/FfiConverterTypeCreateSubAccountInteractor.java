package uniffi.account;

import o.C58397zAw;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCreateSubAccountInteractor extends BaseFfiConverterTypeLong<C58397zAw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCreateSubAccountInteractor INSTANCE = new FfiConverterTypeCreateSubAccountInteractor();

    private FfiConverterTypeCreateSubAccountInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58397zAw lift(long j) {
        return new C58397zAw(C60184zxu.INSTANCE, j);
    }
}
