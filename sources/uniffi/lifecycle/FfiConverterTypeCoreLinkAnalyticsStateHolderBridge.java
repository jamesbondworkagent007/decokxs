package uniffi.lifecycle;

import o.C2660AUh;
import o.C2692AVo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoreLinkAnalyticsStateHolderBridge extends BaseFfiConverterTypeLong<C2660AUh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreLinkAnalyticsStateHolderBridge INSTANCE = new FfiConverterTypeCoreLinkAnalyticsStateHolderBridge();

    private FfiConverterTypeCoreLinkAnalyticsStateHolderBridge() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2660AUh lift(long j) {
        return new C2660AUh(C60184zxu.INSTANCE, j);
    }
}
