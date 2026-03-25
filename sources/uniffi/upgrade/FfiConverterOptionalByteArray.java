package uniffi.upgrade;

import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterOptionalByteArray extends FfiConverterOptional<byte[]> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalByteArray INSTANCE = new FfiConverterOptionalByteArray();

    private FfiConverterOptionalByteArray() {
        super(FfiConverterByteArray.INSTANCE);
    }
}
