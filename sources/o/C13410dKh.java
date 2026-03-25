package o;

import com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase;
import com.okinc.business.defi.di.AddressBookDIProvideModule;

/* JADX INFO: renamed from: o.dKh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13410dKh implements InterfaceC58162ywA<WalletAddressBookDatabase> {
    public final InterfaceC58164ywC<android.content.Context> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public WalletAddressBookDatabase get() {
        return KWHzl(this.copydefault.get());
    }

    public static WalletAddressBookDatabase KWHzl(android.content.Context context) {
        return (WalletAddressBookDatabase) C58165ywD.KWHzl(AddressBookDIProvideModule.AEQbTJ.copydefault(context));
    }
}
