package com.reown.walletkit.utils;

import com.reown.android.cacao.signature.ISignatureType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class SignatureType implements ISignatureType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ SignatureType[] $VALUES;
    public final String header;
    public static final SignatureType EIP191 = new SignatureType("EIP191", 0, "eip191");
    public static final SignatureType EIP1271 = new SignatureType("EIP1271", 1, "eip1271");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ SignatureType[] $values() {
        return new SignatureType[]{EIP191, EIP1271};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignatureType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SignatureType valueOf(String str) {
        return (SignatureType) Enum.valueOf(SignatureType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SignatureType[] values() {
        return (SignatureType[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.cacao.signature.ISignatureType
    public String getHeader() {
        return this.header;
    }

    public SignatureType(String str, int i, String str2) {
        this.header = str2;
    }

    static {
        SignatureType[] signatureTypeArr$values = $values();
        $VALUES = signatureTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signatureTypeArr$values);
    }
}
