package com.okinc.business.defi.share.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Web3ShareType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3ShareType[] $VALUES;
    private final int type;
    public static final Web3ShareType SHARE_TEXT = new Web3ShareType("SHARE_TEXT", 0, 1);
    public static final Web3ShareType SHARE_IMAGE = new Web3ShareType("SHARE_IMAGE", 1, 2);
    public static final Web3ShareType SHARE_WEBPAGE = new Web3ShareType("SHARE_WEBPAGE", 2, 4);
    public static final Web3ShareType SHARE_CUSTOMIZE = new Web3ShareType("SHARE_CUSTOMIZE", 3, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3ShareType[] $values() {
        return new Web3ShareType[]{SHARE_TEXT, SHARE_IMAGE, SHARE_WEBPAGE, SHARE_CUSTOMIZE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3ShareType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private Web3ShareType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        Web3ShareType[] web3ShareTypeArr$values = $values();
        $VALUES = web3ShareTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3ShareTypeArr$values);
    }

    public static Web3ShareType valueOf(String str) {
        return (Web3ShareType) Enum.valueOf(Web3ShareType.class, str);
    }

    public static Web3ShareType[] values() {
        return (Web3ShareType[]) $VALUES.clone();
    }
}
