package uniffi.lifecycle;

import o.ATC;
import o.C2692AVo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoreLifecycleLinkServiceBridge extends BaseFfiConverterTypeLong<ATC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreLifecycleLinkServiceBridge INSTANCE = new FfiConverterTypeCoreLifecycleLinkServiceBridge();

    private FfiConverterTypeCoreLifecycleLinkServiceBridge() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public ATC lift(long j) {
        return new ATC(C60184zxu.INSTANCE, j);
    }
}
