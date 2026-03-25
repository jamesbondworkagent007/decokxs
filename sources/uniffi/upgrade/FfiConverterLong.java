package uniffi.upgrade;

import o.BuB;
import uniffi.BaseFfiConverterLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterLong extends BaseFfiConverterLong {
    public static final int $stable = 0;
    public static final FfiConverterLong INSTANCE = new FfiConverterLong();

    private FfiConverterLong() {
        super(BuB.uniffiRustBuffer);
    }
}
