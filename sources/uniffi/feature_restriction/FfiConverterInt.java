package uniffi.feature_restriction;

import o.ALB;
import uniffi.BaseFfiConverterInt;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterInt extends BaseFfiConverterInt {
    public static final int $stable = 0;
    public static final FfiConverterInt INSTANCE = new FfiConverterInt();

    private FfiConverterInt() {
        super(ALB.uniffiRustBuffer);
    }
}
