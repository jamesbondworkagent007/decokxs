package uniffi.lifecycle;

import o.AVG;
import o.C2692AVo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureDeeplinkResultWithLifecycleFutureError extends BaseFfiConverterTypeLong<AVG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureDeeplinkResultWithLifecycleFutureError INSTANCE = new FfiConverterTypeOKRustFutureDeeplinkResultWithLifecycleFutureError();

    private FfiConverterTypeOKRustFutureDeeplinkResultWithLifecycleFutureError() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AVG lift(long j) {
        return new AVG(C60184zxu.INSTANCE, j);
    }
}
