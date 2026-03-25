package uniffi.lifecycle;

import o.C2692AVo;
import o.C2712AWi;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureboolWithLifecycleFutureError extends BaseFfiConverterTypeLong<C2712AWi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureboolWithLifecycleFutureError INSTANCE = new FfiConverterTypeOKRustFutureboolWithLifecycleFutureError();

    private FfiConverterTypeOKRustFutureboolWithLifecycleFutureError() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2712AWi lift(long j) {
        return new C2712AWi(C60184zxu.INSTANCE, j);
    }
}
