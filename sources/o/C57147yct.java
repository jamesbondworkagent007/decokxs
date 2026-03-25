package o;

import com.okinc.wallet.mln.service.UDChainAddress;
import com.okinc.wallet.mln.service.UDCoinMeta;
import com.okinc.wallet.mln.service.UDDexMarketManager;
import com.okinc.wallet.mln.service.UDMetaManager;
import com.okinc.wallet.mln.service.UDRPCManager;
import com.okinc.wallet.mln.service.UDReferralManager;
import com.okinc.wallet.mln.service.UDRootWallet;
import com.okinc.wallet.mln.service.UDWallet;
import com.okinc.wallet.mln.service.UDWalletCeFiBindService;
import com.okinc.wallet.mln.service.UDWalletCoinAsset;
import com.okinc.wallet.mln.service.UDWalletCore;
import com.okinc.wallet.mln.service.UDWalletCoreNew;
import com.okinc.wallet.mln.service.UDWalletManager;
import com.okinc.wallet.mln.service.UDWalletNFTAsset;
import com.okinc.wallet.mln.service.UDWalletNFTItem;
import com.okinc.wallet.mln.service.UDWeb3AnalyticsService;
import com.okinc.wallet.mln.service.UDWeb3PrecisionFormatterService;
import com.okinc.wallet.mln.service.UDWeb3ShareService;
import com.okinc.wallet.widget.video.UDWalletVideoPlayerView;
import o.C7325ahh;
import o.C8010aue;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.yct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57147yct extends AbstractC7372aib {
    @Override // o.InterfaceC7378aih
    public java.lang.Class<?>[] registerConstants() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.TaskDescription[] registerConverter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.LoaderManager[] registerStaticClass() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public InterfaceC7380aij registerRouter() {
        return new C57102ycA();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application(UDWalletCore.LUA_CLASS_NAME, UDWalletCore.class), new C7325ahh.Application(UDWalletCoreNew.LUA_CLASS_NAME, UDWalletCoreNew.class), new C7325ahh.Application(UDRPCManager.LUA_CLASS_NAME, UDRPCManager.class), new C7325ahh.Application("WalletCeFiBindService", UDWalletCeFiBindService.class), new C7325ahh.Application("Web3ShareService", UDWeb3ShareService.class), new C7325ahh.Application("ReferralManager", UDReferralManager.class), new C7325ahh.Application("DexMarketManager", UDDexMarketManager.class), new C7325ahh.Application("Web3DisplayFormatterMlnService", UDWeb3PrecisionFormatterService.class), new C7325ahh.Application("OKWeb3Analytics", UDWeb3AnalyticsService.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        java.lang.String[] strArr = UDCoinMeta.methods;
        C8010aue.AssistContent assistContentCopydefault = C8010aue.copydefault(UDCoinMeta.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDCoinMeta.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        java.lang.String[] strArr2 = UDMetaManager.methods;
        C8010aue.AssistContent assistContentCopydefault2 = C8010aue.copydefault(UDMetaManager.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDMetaManager.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr2, strArr2.length));
        java.lang.String[] strArr3 = UDWallet.methods;
        C8010aue.AssistContent assistContentCopydefault3 = C8010aue.copydefault(UDWallet.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDWallet.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr3, strArr3.length));
        java.lang.String[] strArr4 = UDWalletCoinAsset.methods;
        C8010aue.AssistContent assistContentCopydefault4 = C8010aue.copydefault(UDWalletCoinAsset.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDWalletCoinAsset.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr4, strArr4.length));
        java.lang.String[] strArr5 = UDWalletManager.methods;
        C8010aue.AssistContent assistContentCopydefault5 = C8010aue.copydefault(UDWalletManager.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDWalletManager.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr5, strArr5.length));
        java.lang.String[] strArr6 = UDWalletNFTItem.methods;
        C8010aue.AssistContent assistContentCopydefault6 = C8010aue.copydefault(UDWalletNFTItem.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDWalletNFTItem.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr6, strArr6.length));
        java.lang.String[] strArr7 = UDWalletNFTAsset.methods;
        C8010aue.AssistContent assistContentCopydefault7 = C8010aue.copydefault(UDWalletNFTAsset.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDWalletNFTAsset.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr7, strArr7.length));
        java.lang.String[] strArr8 = UDRootWallet.methods;
        C8010aue.AssistContent assistContentCopydefault8 = C8010aue.copydefault(UDRootWallet.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDRootWallet.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr8, strArr8.length));
        java.lang.String[] strArr9 = UDChainAddress.methods;
        C8010aue.AssistContent assistContentCopydefault9 = C8010aue.copydefault(UDChainAddress.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDChainAddress.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr9, strArr9.length));
        java.lang.String[] strArr10 = UDWalletVideoPlayerView.KWHzl;
        return new C8010aue.AssistContent[]{assistContentCopydefault, assistContentCopydefault2, assistContentCopydefault3, assistContentCopydefault4, assistContentCopydefault5, assistContentCopydefault6, assistContentCopydefault7, assistContentCopydefault8, assistContentCopydefault9, C8010aue.KWHzl("OKWalletVideoPlayer", UDWalletVideoPlayerView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr10, strArr10.length))};
    }
}
