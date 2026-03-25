package uniffi.growth;

import o.ANQ;
import uniffi.BaseFfiConverterULong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterULong extends BaseFfiConverterULong {
    public static final int $stable = 0;
    public static final FfiConverterULong INSTANCE = new FfiConverterULong();

    private FfiConverterULong() {
        super(ANQ.uniffiRustBuffer);
    }
}
