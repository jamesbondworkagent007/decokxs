package uniffi.account;

import o.C60184zxu;
import o.C60230zyn;
import o.zGO;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMfaPasswordInteractor extends BaseFfiConverterTypeLong<zGO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasswordInteractor INSTANCE = new FfiConverterTypeMfaPasswordInteractor();

    private FfiConverterTypeMfaPasswordInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public zGO lift(long j) {
        return new zGO(C60184zxu.INSTANCE, j);
    }
}
