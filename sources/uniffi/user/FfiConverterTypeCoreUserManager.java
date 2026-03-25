package uniffi.user;

import o.BvG;
import o.BzK;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoreUserManager extends BaseFfiConverterTypeLong<BvG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreUserManager INSTANCE = new FfiConverterTypeCoreUserManager();

    private FfiConverterTypeCoreUserManager() {
        super(BzK.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BvG lift(long j) {
        return new BvG(C60184zxu.INSTANCE, j);
    }
}
