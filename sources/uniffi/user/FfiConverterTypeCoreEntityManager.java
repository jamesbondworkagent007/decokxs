package uniffi.user;

import o.BzK;
import o.C4901Bvf;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoreEntityManager extends BaseFfiConverterTypeLong<C4901Bvf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreEntityManager INSTANCE = new FfiConverterTypeCoreEntityManager();

    private FfiConverterTypeCoreEntityManager() {
        super(BzK.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4901Bvf lift(long j) {
        return new C4901Bvf(C60184zxu.INSTANCE, j);
    }
}
