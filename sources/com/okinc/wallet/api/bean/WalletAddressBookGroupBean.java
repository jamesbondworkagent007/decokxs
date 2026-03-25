package com.okinc.wallet.api.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletAddressBookGroupBean {
    public static final int $stable = 8;
    private final ArrayList<WalletAddressBookChildBean> dataList;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WalletAddressBookChildBean> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    public WalletAddressBookGroupBean(@NotNull String str, @NotNull ArrayList<WalletAddressBookChildBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.title = str;
        this.dataList = arrayList;
    }
}
