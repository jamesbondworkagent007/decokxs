package o;

import com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase;
import com.okinc.business.defi.di.AddressBookDIProvideModule;

/* JADX INFO: renamed from: o.dKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13412dKj implements InterfaceC58162ywA<cGT> {
    public final InterfaceC58164ywC<WalletAddressBookDatabase> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public cGT get() {
        return copydefault(this.KWHzl.get());
    }

    public static cGT copydefault(WalletAddressBookDatabase walletAddressBookDatabase) {
        return (cGT) C58165ywD.KWHzl(AddressBookDIProvideModule.AEQbTJ.EZpvd(walletAddressBookDatabase));
    }
}
