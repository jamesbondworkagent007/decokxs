package com.okinc.im.imui.relationlist.model;

import androidx.annotation.StringRes;
import o.C35399nuc;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class AddContactOption {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddContactOption[] $VALUES;
    private final int title;
    public static final AddContactOption PHONE = new AddContactOption("PHONE", 0, C35399nuc.LoaderManager.UhxbNG);
    public static final AddContactOption EMAIL = new AddContactOption("EMAIL", 1, C35399nuc.LoaderManager.fetchVPNInfo);
    public static final AddContactOption UID = new AddContactOption("UID", 2, C35399nuc.LoaderManager.DbNXlk);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddContactOption[] $values() {
        return new AddContactOption[]{PHONE, EMAIL, UID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddContactOption> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private AddContactOption(@StringRes String str, int i, int i2) {
        this.title = i2;
    }

    static {
        AddContactOption[] addContactOptionArr$values = $values();
        $VALUES = addContactOptionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addContactOptionArr$values);
    }

    public static AddContactOption valueOf(String str) {
        return (AddContactOption) Enum.valueOf(AddContactOption.class, str);
    }

    public static AddContactOption[] values() {
        return (AddContactOption[]) $VALUES.clone();
    }
}
