package uniffi.growth;

import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterOptionalString extends FfiConverterOptional<String> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalString INSTANCE = new FfiConverterOptionalString();

    private FfiConverterOptionalString() {
        super(FfiConverterString.INSTANCE);
    }
}
