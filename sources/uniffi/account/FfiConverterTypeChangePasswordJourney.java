package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.C60245zzB;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeChangePasswordJourney extends BaseFfiConverterTypeLong<C60245zzB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChangePasswordJourney INSTANCE = new FfiConverterTypeChangePasswordJourney();

    private FfiConverterTypeChangePasswordJourney() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C60245zzB lift(long j) {
        return new C60245zzB(C60184zxu.INSTANCE, j);
    }
}
