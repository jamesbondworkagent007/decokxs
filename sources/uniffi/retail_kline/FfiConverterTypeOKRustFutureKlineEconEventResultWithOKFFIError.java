package uniffi.retail_kline;

import o.C4562Bir;
import o.C4578Bjg;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureKlineEconEventResultWithOKFFIError extends BaseFfiConverterTypeLong<C4562Bir> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureKlineEconEventResultWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureKlineEconEventResultWithOKFFIError();

    private FfiConverterTypeOKRustFutureKlineEconEventResultWithOKFFIError() {
        super(C4578Bjg.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4562Bir lift(long j) {
        return new C4562Bir(C60184zxu.INSTANCE, j);
    }
}
