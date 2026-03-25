package uniffi.dex;

import o.AAL;
import o.C2162ABd;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDexPoolInfoInteractor extends BaseFfiConverterTypeLong<C2162ABd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexPoolInfoInteractor INSTANCE = new FfiConverterTypeDexPoolInfoInteractor();

    private FfiConverterTypeDexPoolInfoInteractor() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2162ABd lift(long j) {
        return new C2162ABd(C60184zxu.INSTANCE, j);
    }
}
