package com.okinc.business.defi.share;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.okinc.business.defi.share.bean.Web3ShareFooterInfo;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.wallet.api.WalletReferralSource;
import o.AbstractActivityC33041mov;
import o.InterfaceC13655dTj;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface Web3ShareService extends InterfaceC43217rlC {
    void destroyShareMLNInstance();

    Web3ShareFooterInfo getWeb3CommonFooterInfo();

    void share(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3ShareModel web3ShareModel, InterfaceC13655dTj interfaceC13655dTj);

    void shareByMiniProgram(@NotNull Fragment fragment, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, InterfaceC13655dTj interfaceC13655dTj, WalletReferralSource walletReferralSource);

    void shareByMiniProgramActivity(@NotNull Activity activity, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, InterfaceC13655dTj interfaceC13655dTj);

    public static final class Application {
        public static /* synthetic */ void share$default(Web3ShareService web3ShareService, AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, InterfaceC13655dTj interfaceC13655dTj, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: share");
            }
            if ((i & 4) != 0) {
                interfaceC13655dTj = null;
            }
            web3ShareService.share(abstractActivityC33041mov, web3ShareModel, interfaceC13655dTj);
        }

        public static /* synthetic */ void shareByMiniProgram$default(Web3ShareService web3ShareService, Fragment fragment, String str, String str2, int i, String str3, String str4, String str5, String str6, InterfaceC13655dTj interfaceC13655dTj, WalletReferralSource walletReferralSource, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareByMiniProgram");
            }
            web3ShareService.shareByMiniProgram(fragment, str, str2, i, str3, str4, str5, str6, (i2 & 256) != 0 ? null : interfaceC13655dTj, (i2 & 512) != 0 ? null : walletReferralSource);
        }

        public static /* synthetic */ void shareByMiniProgramActivity$default(Web3ShareService web3ShareService, Activity activity, String str, String str2, int i, String str3, String str4, String str5, String str6, InterfaceC13655dTj interfaceC13655dTj, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareByMiniProgramActivity");
            }
            web3ShareService.shareByMiniProgramActivity(activity, str, str2, i, str3, str4, str5, str6, (i2 & 256) != 0 ? null : interfaceC13655dTj);
        }
    }
}
