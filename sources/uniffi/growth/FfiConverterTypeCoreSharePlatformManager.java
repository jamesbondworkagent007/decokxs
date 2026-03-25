package uniffi.growth;

import o.ANQ;
import o.C2486ANp;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoreSharePlatformManager extends BaseFfiConverterTypeLong<C2486ANp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreSharePlatformManager INSTANCE = new FfiConverterTypeCoreSharePlatformManager();

    private FfiConverterTypeCoreSharePlatformManager() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2486ANp lift(long j) {
        return new C2486ANp(C60184zxu.INSTANCE, j);
    }
}
