package uniffi.growth;

import o.ANQ;
import o.AOG;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePopupPriorityManager extends BaseFfiConverterTypeLong<AOG> {
    public static final int $stable = 0;
    public static final FfiConverterTypePopupPriorityManager INSTANCE = new FfiConverterTypePopupPriorityManager();

    private FfiConverterTypePopupPriorityManager() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public AOG lift(long j) {
        return new AOG(C60184zxu.INSTANCE, j);
    }
}
