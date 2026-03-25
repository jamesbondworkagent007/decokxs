package uniffi.account;

import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterOptionalBoolean extends FfiConverterOptional<Boolean> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalBoolean INSTANCE = new FfiConverterOptionalBoolean();

    private FfiConverterOptionalBoolean() {
        super(FfiConverterBoolean.INSTANCE);
    }
}
