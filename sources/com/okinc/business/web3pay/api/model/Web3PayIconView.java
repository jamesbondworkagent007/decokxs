package com.okinc.business.web3pay.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class Web3PayIconView {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3PayIconView[] $VALUES;
    public static final Web3PayIconView PLUS = new Web3PayIconView("PLUS", 0);
    public static final Web3PayIconView NOTIFICATION = new Web3PayIconView("NOTIFICATION", 1);
    public static final Web3PayIconView SCANNER = new Web3PayIconView("SCANNER", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3PayIconView[] $values() {
        return new Web3PayIconView[]{PLUS, NOTIFICATION, SCANNER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3PayIconView> getEntries() {
        return $ENTRIES;
    }

    private Web3PayIconView(String str, int i) {
    }

    static {
        Web3PayIconView[] web3PayIconViewArr$values = $values();
        $VALUES = web3PayIconViewArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3PayIconViewArr$values);
    }

    public static Web3PayIconView valueOf(String str) {
        return (Web3PayIconView) Enum.valueOf(Web3PayIconView.class, str);
    }

    public static Web3PayIconView[] values() {
        return (Web3PayIconView[]) $VALUES.clone();
    }
}
