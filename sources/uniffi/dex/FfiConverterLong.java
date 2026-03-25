package uniffi.dex;

import o.AAL;
import uniffi.BaseFfiConverterLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterLong extends BaseFfiConverterLong {
    public static final int $stable = 0;
    public static final FfiConverterLong INSTANCE = new FfiConverterLong();

    private FfiConverterLong() {
        super(AAL.uniffiRustBuffer);
    }
}
