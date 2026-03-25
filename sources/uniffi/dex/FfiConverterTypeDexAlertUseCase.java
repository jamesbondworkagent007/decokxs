package uniffi.dex;

import o.AAL;
import o.C4152AzU;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDexAlertUseCase extends BaseFfiConverterTypeLong<C4152AzU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexAlertUseCase INSTANCE = new FfiConverterTypeDexAlertUseCase();

    private FfiConverterTypeDexAlertUseCase() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4152AzU lift(long j) {
        return new C4152AzU(C60184zxu.INSTANCE, j);
    }
}
