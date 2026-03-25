package uniffi.ok_future_utils;

import o.BfS;
import o.C4482Bfs;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKRustFuturei64WithOKFFIError extends BaseFfiConverterTypeLong<C4482Bfs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFuturei64WithOKFFIError INSTANCE = new FfiConverterTypeOKRustFuturei64WithOKFFIError();

    private FfiConverterTypeOKRustFuturei64WithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4482Bfs lift(long j) {
        return new C4482Bfs(C60184zxu.INSTANCE, j);
    }
}
