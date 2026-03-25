package uniffi.lifecycle;

import o.C2631ATe;
import o.C2692AVo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoreDeeplinkServiceBridge extends BaseFfiConverterTypeLong<C2631ATe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreDeeplinkServiceBridge INSTANCE = new FfiConverterTypeCoreDeeplinkServiceBridge();

    private FfiConverterTypeCoreDeeplinkServiceBridge() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2631ATe lift(long j) {
        return new C2631ATe(C60184zxu.INSTANCE, j);
    }
}
