package uniffi.compliance;

import o.C3981AwI;
import o.C4119Ayo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeIDScanOrchestratorBridge extends BaseFfiConverterTypeLong<C4119Ayo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeIDScanOrchestratorBridge INSTANCE = new FfiConverterTypeIDScanOrchestratorBridge();

    private FfiConverterTypeIDScanOrchestratorBridge() {
        super(C3981AwI.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4119Ayo lift(long j) {
        return new C4119Ayo(C60184zxu.INSTANCE, j);
    }
}
