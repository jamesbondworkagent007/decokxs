package uniffi.growth;

import o.ANQ;
import o.C2510AOn;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePopupCallbacks extends BaseFfiConverterTypeLong<C2510AOn> {
    public static final int $stable = 0;
    public static final FfiConverterTypePopupCallbacks INSTANCE = new FfiConverterTypePopupCallbacks();

    private FfiConverterTypePopupCallbacks() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2510AOn lift(long j) {
        return new C2510AOn(C60184zxu.INSTANCE, j);
    }
}
