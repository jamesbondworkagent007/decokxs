package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KYSAssetType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KYSAssetType[] $VALUES;
    private final int value;
    public static final KYSAssetType NATIVE_TYPE = new KYSAssetType("NATIVE_TYPE", 0, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
    public static final KYSAssetType TOKEN_TYPE = new KYSAssetType("TOKEN_TYPE", 1, 99);
    public static final KYSAssetType NFT_TYPE = new KYSAssetType("NFT_TYPE", 2, 66);
    public static final KYSAssetType OTHER_TYPE = new KYSAssetType("OTHER_TYPE", 3, 33);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KYSAssetType[] $values() {
        return new KYSAssetType[]{NATIVE_TYPE, TOKEN_TYPE, NFT_TYPE, OTHER_TYPE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KYSAssetType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private KYSAssetType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        KYSAssetType[] kYSAssetTypeArr$values = $values();
        $VALUES = kYSAssetTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kYSAssetTypeArr$values);
    }

    public static KYSAssetType valueOf(String str) {
        return (KYSAssetType) Enum.valueOf(KYSAssetType.class, str);
    }

    public static KYSAssetType[] values() {
        return (KYSAssetType[]) $VALUES.clone();
    }
}
