package o;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;

/* JADX INFO: renamed from: o.fzH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19328fzH implements InterfaceC58162ywA<WalletBindApiService> {
    public final WalletBindApiService.WalletBindApiServiceModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public WalletBindApiService get() {
        return EZpvd(this.OLrzqt);
    }

    public static WalletBindApiService EZpvd(WalletBindApiService.WalletBindApiServiceModule walletBindApiServiceModule) {
        return (WalletBindApiService) C58165ywD.KWHzl(walletBindApiServiceModule.copydefault());
    }
}
