package uniffi.localization;

import o.C2774AYs;
import o.C2775AYt;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLocalizationStringKey extends BaseFfiConverterTypeLong<C2774AYs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLocalizationStringKey INSTANCE = new FfiConverterTypeLocalizationStringKey();

    private FfiConverterTypeLocalizationStringKey() {
        super(C2775AYt.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2774AYs lift(long j) {
        return new C2774AYs(C60184zxu.INSTANCE, j);
    }
}
