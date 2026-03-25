package uniffi.account;

import java.util.Map;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterOptionalMapStringString extends FfiConverterOptional<Map<String, ? extends String>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalMapStringString INSTANCE = new FfiConverterOptionalMapStringString();

    private FfiConverterOptionalMapStringString() {
        super(FfiConverterMapStringString.INSTANCE);
    }
}
