package uniffi.compliance;

import o.C3981AwI;
import o.C4068Axq;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeIDScanDebugBridge extends BaseFfiConverterTypeLong<C4068Axq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeIDScanDebugBridge INSTANCE = new FfiConverterTypeIDScanDebugBridge();

    private FfiConverterTypeIDScanDebugBridge() {
        super(C3981AwI.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4068Axq lift(long j) {
        return new C4068Axq(C60184zxu.INSTANCE, j);
    }
}
