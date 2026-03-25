package uniffi.upgrade;

import o.BuB;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeUpgradeCore extends BaseFfiConverterTypeLong<UpgradeCore> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUpgradeCore INSTANCE = new FfiConverterTypeUpgradeCore();

    private FfiConverterTypeUpgradeCore() {
        super(BuB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public UpgradeCore lift(long j) {
        return new UpgradeCore(C60184zxu.INSTANCE, j);
    }
}
