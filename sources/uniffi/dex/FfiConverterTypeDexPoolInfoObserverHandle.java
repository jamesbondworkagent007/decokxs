package uniffi.dex;

import o.AAL;
import o.C2177ABs;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeDexPoolInfoObserverHandle extends BaseFfiConverterTypeLong<C2177ABs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexPoolInfoObserverHandle INSTANCE = new FfiConverterTypeDexPoolInfoObserverHandle();

    private FfiConverterTypeDexPoolInfoObserverHandle() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2177ABs lift(long j) {
        return new C2177ABs(C60184zxu.INSTANCE, j);
    }
}
