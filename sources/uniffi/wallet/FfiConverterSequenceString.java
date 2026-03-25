package uniffi.wallet;

import uniffi.FfiConverterSequence;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterSequenceString extends FfiConverterSequence<String> {
    public static final int $stable = 0;
    public static final FfiConverterSequenceString INSTANCE = new FfiConverterSequenceString();

    private FfiConverterSequenceString() {
        super(FfiConverterString.INSTANCE);
    }
}
