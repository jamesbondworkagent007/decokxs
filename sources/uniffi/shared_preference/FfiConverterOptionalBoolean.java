package uniffi.shared_preference;

import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterOptionalBoolean extends FfiConverterOptional<Boolean> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalBoolean INSTANCE = new FfiConverterOptionalBoolean();

    private FfiConverterOptionalBoolean() {
        super(FfiConverterBoolean.INSTANCE);
    }
}
