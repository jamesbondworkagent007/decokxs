package uniffi.lifecycle;

import o.ATM;
import o.C2692AVo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoreLinkAnalyticsBridge extends BaseFfiConverterTypeLong<ATM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreLinkAnalyticsBridge INSTANCE = new FfiConverterTypeCoreLinkAnalyticsBridge();

    private FfiConverterTypeCoreLinkAnalyticsBridge() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public ATM lift(long j) {
        return new ATM(C60184zxu.INSTANCE, j);
    }
}
