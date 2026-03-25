package uniffi.experiment;

import o.C2348AIh;
import o.C2383AJq;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePublicBetaService extends BaseFfiConverterTypeLong<C2383AJq> {
    public static final int $stable = 0;
    public static final FfiConverterTypePublicBetaService INSTANCE = new FfiConverterTypePublicBetaService();

    private FfiConverterTypePublicBetaService() {
        super(C2348AIh.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2383AJq lift(long j) {
        return new C2383AJq(C60184zxu.INSTANCE, j);
    }
}
