package uniffi.feature_restriction;

import o.ALB;
import uniffi.BaseFfiConverterBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterBoolean extends BaseFfiConverterBoolean {
    public static final int $stable = 0;
    public static final FfiConverterBoolean INSTANCE = new FfiConverterBoolean();

    private FfiConverterBoolean() {
        super(ALB.uniffiRustBuffer);
    }
}
