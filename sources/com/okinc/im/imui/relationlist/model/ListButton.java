package com.okinc.im.imui.relationlist.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import o.C35399nuc;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class ListButton {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ListButton[] $VALUES;
    private final int description;
    private final int iconRes;
    public static final ListButton NEW_GROUP = new ListButton("NEW_GROUP", 0, C35399nuc.LoaderManager.openFileOutput, C52761wXj.TaskDescription.vLaW);
    public static final ListButton ADD_BY_PHONE_NUMBER = new ListButton("ADD_BY_PHONE_NUMBER", 1, C35399nuc.LoaderManager.Zpvmxu, C52761wXj.TaskDescription.registerUser);
    public static final ListButton NEW_INVITEES_GROUP = new ListButton("NEW_INVITEES_GROUP", 2, C35399nuc.LoaderManager.ZxnNGp, C52761wXj.TaskDescription.ejfBZ);
    public static final ListButton NEW_BROADCAST = new ListButton("NEW_BROADCAST", 3, C35399nuc.LoaderManager.DhEJvI, C52761wXj.TaskDescription.AxsJAYsNCnLh);
    public static final ListButton ADD_BY_UUID = new ListButton("ADD_BY_UUID", 4, C35399nuc.LoaderManager.HJWChPUUMfbK, C35399nuc.ActionBar.wlaJM);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ListButton[] $values() {
        return new ListButton[]{NEW_GROUP, ADD_BY_PHONE_NUMBER, NEW_INVITEES_GROUP, NEW_BROADCAST, ADD_BY_UUID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ListButton> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconRes() {
        return this.iconRes;
    }

    private ListButton(@StringRes String str, @DrawableRes int i, int i2, int i3) {
        this.description = i2;
        this.iconRes = i3;
    }

    static {
        ListButton[] listButtonArr$values = $values();
        $VALUES = listButtonArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(listButtonArr$values);
    }

    public static ListButton valueOf(String str) {
        return (ListButton) Enum.valueOf(ListButton.class, str);
    }

    public static ListButton[] values() {
        return (ListButton[]) $VALUES.clone();
    }
}
