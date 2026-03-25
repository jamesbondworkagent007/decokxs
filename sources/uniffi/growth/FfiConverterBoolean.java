package uniffi.growth;

import o.ANQ;
import uniffi.BaseFfiConverterBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterBoolean extends BaseFfiConverterBoolean {
    public static final int $stable = 0;
    public static final FfiConverterBoolean INSTANCE = new FfiConverterBoolean();

    private FfiConverterBoolean() {
        super(ANQ.uniffiRustBuffer);
    }
}
