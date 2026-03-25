package uniffi.retail_kline;

import o.BiZ;
import o.C4578Bjg;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureNewsCarouselResultWithOKFFIError extends BaseFfiConverterTypeLong<BiZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureNewsCarouselResultWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureNewsCarouselResultWithOKFFIError();

    private FfiConverterTypeOKRustFutureNewsCarouselResultWithOKFFIError() {
        super(C4578Bjg.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BiZ lift(long j) {
        return new BiZ(C60184zxu.INSTANCE, j);
    }
}
