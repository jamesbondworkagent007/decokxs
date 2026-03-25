package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SignAndSendTransactionSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignAndSendTransactionSource[] $VALUES;
    public static final SignAndSendTransactionSource BOOST = new SignAndSendTransactionSource("BOOST", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignAndSendTransactionSource[] $values() {
        return new SignAndSendTransactionSource[]{BOOST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignAndSendTransactionSource> getEntries() {
        return $ENTRIES;
    }

    private SignAndSendTransactionSource(String str, int i) {
    }

    static {
        SignAndSendTransactionSource[] signAndSendTransactionSourceArr$values = $values();
        $VALUES = signAndSendTransactionSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signAndSendTransactionSourceArr$values);
    }

    public static SignAndSendTransactionSource valueOf(String str) {
        return (SignAndSendTransactionSource) Enum.valueOf(SignAndSendTransactionSource.class, str);
    }

    public static SignAndSendTransactionSource[] values() {
        return (SignAndSendTransactionSource[]) $VALUES.clone();
    }
}
