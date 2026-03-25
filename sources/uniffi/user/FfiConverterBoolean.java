package uniffi.user;

import o.BzK;
import uniffi.BaseFfiConverterBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterBoolean extends BaseFfiConverterBoolean {
    public static final int $stable = 0;
    public static final FfiConverterBoolean INSTANCE = new FfiConverterBoolean();

    private FfiConverterBoolean() {
        super(BzK.uniffiRustBuffer);
    }
}
