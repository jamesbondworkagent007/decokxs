package com.okinc.assets.backend.api.model;

import com.google.gson.annotations.SerializedName;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class Category {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Category[] $VALUES;

    @SerializedName("1")
    public static final Category CryptoDepositWithdrawal = new Category("CryptoDepositWithdrawal", 0, 1);

    @SerializedName("2")
    public static final Category FiatDepositWithdrawal = new Category("FiatDepositWithdrawal", 1, 2);

    @SerializedName("3")
    public static final Category SmartAccountTransfer = new Category("SmartAccountTransfer", 2, 3);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Category[] $values() {
        return new Category[]{CryptoDepositWithdrawal, FiatDepositWithdrawal, SmartAccountTransfer};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Category> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private Category(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Category[] categoryArr$values = $values();
        $VALUES = categoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(categoryArr$values);
    }

    public static Category valueOf(String str) {
        return (Category) Enum.valueOf(Category.class, str);
    }

    public static Category[] values() {
        return (Category[]) $VALUES.clone();
    }
}
