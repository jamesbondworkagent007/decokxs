package uniffi.ok_future_utils;

import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterOptionalTypeOKFFIError extends FfiConverterOptional<OkffiException> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeOKFFIError INSTANCE = new FfiConverterOptionalTypeOKFFIError();

    private FfiConverterOptionalTypeOKFFIError() {
        super(FfiConverterTypeOKFFIError.INSTANCE);
    }
}
