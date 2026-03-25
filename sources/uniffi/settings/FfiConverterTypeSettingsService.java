package uniffi.settings;

import o.BoN;
import o.BoU;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSettingsService extends BaseFfiConverterTypeLong<BoU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSettingsService INSTANCE = new FfiConverterTypeSettingsService();

    private FfiConverterTypeSettingsService() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BoU lift(long j) {
        return new BoU(C60184zxu.INSTANCE, j);
    }
}
