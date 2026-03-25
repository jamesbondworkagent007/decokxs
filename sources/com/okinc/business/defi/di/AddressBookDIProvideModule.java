package com.okinc.business.defi.di;

import android.content.Context;
import com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase;
import kotlin.jvm.internal.Intrinsics;
import o.cGT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class AddressBookDIProvideModule {
    public static final AddressBookDIProvideModule AEQbTJ = new AddressBookDIProvideModule();

    private AddressBookDIProvideModule() {
    }

    public final cGT EZpvd(@NotNull WalletAddressBookDatabase walletAddressBookDatabase) {
        Intrinsics.checkNotNullParameter(walletAddressBookDatabase, "");
        return walletAddressBookDatabase.KWHzl();
    }

    public final WalletAddressBookDatabase copydefault(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return WalletAddressBookDatabase.Companion.copydefault(context);
    }
}
