package uniffi.ok_future_utils;

import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterOptionalInt extends FfiConverterOptional<Integer> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalInt INSTANCE = new FfiConverterOptionalInt();

    private FfiConverterOptionalInt() {
        super(FfiConverterInt.INSTANCE);
    }
}
