package uniffi.ok_future_utils;

import o.BfS;
import o.C4449Bem;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureboolWithOKFFIError extends BaseFfiConverterTypeLong<C4449Bem> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureboolWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureboolWithOKFFIError();

    private FfiConverterTypeOKRustFutureboolWithOKFFIError() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4449Bem lift(long j) {
        return new C4449Bem(C60184zxu.INSTANCE, j);
    }
}
