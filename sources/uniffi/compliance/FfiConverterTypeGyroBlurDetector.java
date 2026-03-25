package uniffi.compliance;

import o.C3981AwI;
import o.C3984AwL;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeGyroBlurDetector extends BaseFfiConverterTypeLong<C3984AwL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGyroBlurDetector INSTANCE = new FfiConverterTypeGyroBlurDetector();

    private FfiConverterTypeGyroBlurDetector() {
        super(C3981AwI.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3984AwL lift(long j) {
        return new C3984AwL(C60184zxu.INSTANCE, j);
    }
}
