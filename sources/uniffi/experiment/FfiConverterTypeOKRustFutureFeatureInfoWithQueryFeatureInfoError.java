package uniffi.experiment;

import o.C2348AIh;
import o.C2368AJb;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKRustFutureFeatureInfoWithQueryFeatureInfoError extends BaseFfiConverterTypeLong<C2368AJb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureFeatureInfoWithQueryFeatureInfoError INSTANCE = new FfiConverterTypeOKRustFutureFeatureInfoWithQueryFeatureInfoError();

    private FfiConverterTypeOKRustFutureFeatureInfoWithQueryFeatureInfoError() {
        super(C2348AIh.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2368AJb lift(long j) {
        return new C2368AJb(C60184zxu.INSTANCE, j);
    }
}
