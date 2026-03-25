package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class AddressSourceGroup {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddressSourceGroup[] $VALUES;
    private final String group;
    public static final AddressSourceGroup RECENT = new AddressSourceGroup("RECENT", 0, "RECENT");
    public static final AddressSourceGroup ADDRESS_BOOKS = new AddressSourceGroup("ADDRESS_BOOKS", 1, "ADDRESS_BOOKS");
    public static final AddressSourceGroup MY_WALLET = new AddressSourceGroup("MY_WALLET", 2, "MY_WALLET");
    public static final AddressSourceGroup DEFAULT = new AddressSourceGroup("DEFAULT", 3, "DEFAULT");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddressSourceGroup[] $values() {
        return new AddressSourceGroup[]{RECENT, ADDRESS_BOOKS, MY_WALLET, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddressSourceGroup> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroup() {
        return this.group;
    }

    private AddressSourceGroup(String str, int i, String str2) {
        this.group = str2;
    }

    static {
        AddressSourceGroup[] addressSourceGroupArr$values = $values();
        $VALUES = addressSourceGroupArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addressSourceGroupArr$values);
    }

    public static AddressSourceGroup valueOf(String str) {
        return (AddressSourceGroup) Enum.valueOf(AddressSourceGroup.class, str);
    }

    public static AddressSourceGroup[] values() {
        return (AddressSourceGroup[]) $VALUES.clone();
    }
}
