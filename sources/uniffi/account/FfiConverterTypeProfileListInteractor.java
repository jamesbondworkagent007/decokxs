package uniffi.account;

import o.C2852Aar;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeProfileListInteractor extends BaseFfiConverterTypeLong<C2852Aar> {
    public static final int $stable = 0;
    public static final FfiConverterTypeProfileListInteractor INSTANCE = new FfiConverterTypeProfileListInteractor();

    private FfiConverterTypeProfileListInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2852Aar lift(long j) {
        return new C2852Aar(C60184zxu.INSTANCE, j);
    }
}
