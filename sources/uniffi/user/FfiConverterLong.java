package uniffi.user;

import o.BzK;
import uniffi.BaseFfiConverterLong;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterLong extends BaseFfiConverterLong {
    public static final int $stable = 0;
    public static final FfiConverterLong INSTANCE = new FfiConverterLong();

    private FfiConverterLong() {
        super(BzK.uniffiRustBuffer);
    }
}
