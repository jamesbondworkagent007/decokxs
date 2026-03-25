package uniffi.dex;

import o.AAL;
import o.C2149AAq;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDexChainsManager extends BaseFfiConverterTypeLong<C2149AAq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexChainsManager INSTANCE = new FfiConverterTypeDexChainsManager();

    private FfiConverterTypeDexChainsManager() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2149AAq lift(long j) {
        return new C2149AAq(C60184zxu.INSTANCE, j);
    }
}
