package uniffi.lifecycle;

import o.AVV;
import o.C2692AVo;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureShortLinkInfoWithLifecycleFutureError extends BaseFfiConverterTypeLong<AVV> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureShortLinkInfoWithLifecycleFutureError INSTANCE = new FfiConverterTypeOKRustFutureShortLinkInfoWithLifecycleFutureError();

    private FfiConverterTypeOKRustFutureShortLinkInfoWithLifecycleFutureError() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AVV lift(long j) {
        return new AVV(C60184zxu.INSTANCE, j);
    }
}
