package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletBalanceShareInfo;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletPnlShareInfo;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletTokenPnlShareInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.wallet.api.WalletReferralSource;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15911eZw {
    public static final <T extends androidx.fragment.app.Fragment> void AEQbTJ(@NotNull T t, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, WalletTokenPnlShareInfo walletTokenPnlShareInfo, @NotNull java.lang.String str4, @NotNull InterfaceC13655dTj interfaceC13655dTj) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(interfaceC13655dTj, "");
        dJJ djj = dJJ.copydefault;
        java.lang.String strAEQbTJ = djj.AEQbTJ("dex/coin/detail", C56390yDp.OLrzqt("tokenContractAddress", str2), C56390yDp.OLrzqt("chainId", str), C56390yDp.OLrzqt("from_module", "profile_pnl"), C56390yDp.OLrzqt("from_channel_id", "none"));
        java.lang.String strCopydefault = djj.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sZqaRl) + "/detail/" + str + "/" + str2, C56390yDp.OLrzqt("from_module", "profile_pnl"), C56390yDp.OLrzqt("from_channel_id", "none"));
        if (walletTokenPnlShareInfo == null) {
            Web3ShareModel web3ShareModelEZpvd = Web3ShareModel.Companion.EZpvd(strCopydefault, strAEQbTJ, str3, (40 & 8) != 0 ? null : null, str4, (40 & 32) != 0 ? null : WalletReferralSource.PROFILE_POSITION_PNL);
            Web3ShareService web3ShareService = (Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class);
            FragmentActivity activity = t.getActivity();
            Intrinsics.copydefault(activity, "");
            web3ShareService.share((AbstractActivityC33041mov) activity, web3ShareModelEZpvd, interfaceC13655dTj);
            return;
        }
        Web3ShareService.Application.shareByMiniProgram$default((Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class), t, str3, "dex_market_pnl", 1, strCopydefault, strAEQbTJ, Json.Default.encodeToString(WalletTokenPnlShareInfo.Companion.serializer(), walletTokenPnlShareInfo), str4, interfaceC13655dTj, null, 512, null);
    }

    public static final <T extends AbstractActivityC33041mov> void EZpvd(@NotNull T t, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull WalletPnlShareInfo walletPnlShareInfo, @NotNull java.lang.String str4, @NotNull InterfaceC13655dTj interfaceC13655dTj) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(walletPnlShareInfo, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(interfaceC13655dTj, "");
        dJJ djj = dJJ.copydefault;
        java.lang.String strAEQbTJ = djj.AEQbTJ("wallet/objectivity", C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2), C56390yDp.OLrzqt("selectedChainId", str), C56390yDp.OLrzqt("periodType", str3), C56390yDp.OLrzqt("from_module", "profile_pnl"), C56390yDp.OLrzqt("from_channel_id", "none"));
        java.lang.String string = t.getString(C13754dXa.FragmentManager.sZqaRl);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ((Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class)).share(t, Web3ShareModel.Companion.AEQbTJ(djj.copydefault(string + "/portfolio/" + str2, C56390yDp.OLrzqt("from_module", "profile_pnl"), C56390yDp.OLrzqt("from_channel_id", "none")), strAEQbTJ, "profile_share_pnl", dTJ.Companion.KWHzl("profile_share_pnl", 1, C33488mxR.EZpvd(walletPnlShareInfo), t.getLifecycle()), str4, WalletReferralSource.PROFILE_PNL), interfaceC13655dTj);
    }

    public static final <T extends androidx.fragment.app.Fragment> void KWHzl(@NotNull T t, @NotNull WalletBalanceShareInfo walletBalanceShareInfo, @NotNull java.lang.String str, @NotNull InterfaceC13655dTj interfaceC13655dTj) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(walletBalanceShareInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC13655dTj, "");
        dTJ dtjKWHzl = dTJ.Companion.KWHzl("wallet_profile_balance_share", 1, C33488mxR.EZpvd(walletBalanceShareInfo), t.getLifecycle());
        Web3ShareModel.Application application = Web3ShareModel.Companion;
        java.lang.String string = t.getString(C13754dXa.FragmentManager.sZqaRl);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Web3ShareModel web3ShareModelAEQbTJ = application.AEQbTJ(string, gKZ.EZpvd.KWHzl("wallet/home"), "wallet_profile_balance_share", dtjKWHzl, str, WalletReferralSource.WALLET_BALANCE);
        Web3ShareService web3ShareService = (Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class);
        FragmentActivity activity = t.getActivity();
        Intrinsics.copydefault(activity, "");
        web3ShareService.share((AbstractActivityC33041mov) activity, web3ShareModelAEQbTJ, interfaceC13655dTj);
    }
}
