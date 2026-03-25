package uniffi.account;

import java.util.List;
import o.zAL;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterOptionalSequenceTypeCredentialDescriptor extends FfiConverterOptional<List<? extends zAL>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceTypeCredentialDescriptor INSTANCE = new FfiConverterOptionalSequenceTypeCredentialDescriptor();

    private FfiConverterOptionalSequenceTypeCredentialDescriptor() {
        super(FfiConverterSequenceTypeCredentialDescriptor.INSTANCE);
    }
}
