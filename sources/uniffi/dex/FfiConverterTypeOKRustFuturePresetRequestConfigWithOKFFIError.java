package uniffi.dex;

import o.AAL;
import o.AEH;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFuturePresetRequestConfigWithOKFFIError extends BaseFfiConverterTypeLong<AEH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFuturePresetRequestConfigWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFuturePresetRequestConfigWithOKFFIError();

    private FfiConverterTypeOKRustFuturePresetRequestConfigWithOKFFIError() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AEH lift(long j) {
        return new AEH(C60184zxu.INSTANCE, j);
    }
}
