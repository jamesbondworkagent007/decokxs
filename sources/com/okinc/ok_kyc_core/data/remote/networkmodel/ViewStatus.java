package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlinx.serialization.SerialName;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class ViewStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ViewStatus[] $VALUES;

    @SerialName("form")
    public static final ViewStatus Form = new ViewStatus("Form", 0);

    @SerialName("result")
    public static final ViewStatus Result = new ViewStatus("Result", 1);

    @SerialName("selectWalletVerificationMethod")
    public static final ViewStatus SelectWalletVerification = new ViewStatus("SelectWalletVerification", 2);

    @SerialName("processing")
    public static final ViewStatus Processing = new ViewStatus("Processing", 3);

    @SerialName("cta")
    public static final ViewStatus Cta = new ViewStatus("Cta", 4);

    @SerialName("card")
    public static final ViewStatus Card = new ViewStatus("Card", 5);

    @SerialName("listPickerPopup")
    public static final ViewStatus ListPickerPopup = new ViewStatus("ListPickerPopup", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ViewStatus[] $values() {
        return new ViewStatus[]{Form, Result, SelectWalletVerification, Processing, Cta, Card, ListPickerPopup};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ViewStatus> getEntries() {
        return $ENTRIES;
    }

    private ViewStatus(String str, int i) {
    }

    static {
        ViewStatus[] viewStatusArr$values = $values();
        $VALUES = viewStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(viewStatusArr$values);
    }

    public static ViewStatus valueOf(String str) {
        return (ViewStatus) Enum.valueOf(ViewStatus.class, str);
    }

    public static ViewStatus[] values() {
        return (ViewStatus[]) $VALUES.clone();
    }
}
