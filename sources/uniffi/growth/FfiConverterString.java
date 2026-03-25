package uniffi.growth;

import o.ANQ;
import uniffi.BaseFfiConverterString;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterString extends BaseFfiConverterString {
    public static final int $stable = 0;
    public static final FfiConverterString INSTANCE = new FfiConverterString();

    private FfiConverterString() {
        super(ANQ.uniffiRustBuffer);
    }
}
