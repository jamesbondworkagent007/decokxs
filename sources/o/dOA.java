package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.impl.Web3ShareServiceImpl$generateShareShortLink$1;
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.Web3ShareBaseInfo;
import com.okinc.business.defi.share.bean.Web3ShareFooterInfo;
import com.okinc.business.defi.share.bean.Web3ShareLinkInfo;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.business.defi.share.bean.Web3ShareType;
import com.okinc.wallet.api.WalletReferralSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dOA extends AbstractC43215rlA implements Web3ShareService {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.dOB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return dOA.OLrzqt();
        }
    });

    public final C13661dTp EZpvd() {
        return (C13661dTp) this.AEQbTJ.getValue();
    }

    public static final C13661dTp OLrzqt() {
        return new C13661dTp();
    }

    @Override // com.okinc.business.defi.share.Web3ShareService
    public void share(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3ShareModel web3ShareModel, InterfaceC13655dTj interfaceC13655dTj) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(web3ShareModel, "");
        if (web3ShareModel.getShareInfoList().isEmpty()) {
            pUU.copydefault("Web3ShareService: lack of share info");
            return;
        }
        if (web3ShareModel.getShareType() == Web3ShareType.SHARE_IMAGE) {
            KWHzl(abstractActivityC33041mov, web3ShareModel, interfaceC13655dTj);
            return;
        }
        if (web3ShareModel.getShareType() != Web3ShareType.SHARE_WEBPAGE) {
            if (web3ShareModel.getShareType() == Web3ShareType.SHARE_CUSTOMIZE) {
                KWHzl(abstractActivityC33041mov, web3ShareModel, interfaceC13655dTj);
                return;
            }
            pUU.copydefault("Web3ShareService Unsupported share type: " + web3ShareModel.getShareType());
            return;
        }
        for (Web3ShareBaseInfo web3ShareBaseInfo : web3ShareModel.getShareInfoList()) {
            if ((web3ShareBaseInfo instanceof Web3ShareLinkInfo) && android.text.TextUtils.isEmpty(((Web3ShareLinkInfo) web3ShareBaseInfo).getDirectShareLink())) {
                KWHzl(abstractActivityC33041mov, web3ShareModel, interfaceC13655dTj);
                return;
            }
        }
        executeShare$default(this, abstractActivityC33041mov, web3ShareModel, null, 4, null);
    }

    @Override // com.okinc.business.defi.share.Web3ShareService
    public void shareByMiniProgram(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, InterfaceC13655dTj interfaceC13655dTj, WalletReferralSource walletReferralSource) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        FragmentActivity activity = fragment.getActivity();
        if ((activity instanceof AbstractActivityC33041mov) && C7863arp.KWHzl(fragment.getContext())) {
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) activity;
            share(abstractActivityC33041mov, Web3ShareModel.Companion.AEQbTJ(str3, str4, str, dTJ.Companion.KWHzl(str2, i, str5, fragment.getLifecycle()), str6, walletReferralSource), interfaceC13655dTj);
        }
    }

    @Override // com.okinc.business.defi.share.Web3ShareService
    public void shareByMiniProgramActivity(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, InterfaceC13655dTj interfaceC13655dTj) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if ((activity instanceof AbstractActivityC33041mov) && C7863arp.KWHzl(activity)) {
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) activity;
            share(abstractActivityC33041mov, Web3ShareModel.Application.createMiniProgramModel$default(Web3ShareModel.Companion, str3, str4, str, dTJ.Companion.KWHzl(str2, i, str5, abstractActivityC33041mov.getLifecycle()), str6, null, 32, null), interfaceC13655dTj);
        }
    }

    @Override // com.okinc.business.defi.share.Web3ShareService
    public void destroyShareMLNInstance() {
        C13654dTi.Companion.copydefault();
    }

    @Override // com.okinc.business.defi.share.Web3ShareService
    public Web3ShareFooterInfo getWeb3CommonFooterInfo() {
        try {
            return new Web3ShareFooterInfo(EZpvd().AYXKKw(), EZpvd().djBIcL(), EZpvd().AhwBna());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, InterfaceC13655dTj interfaceC13655dTj) {
        OLrzqt(abstractActivityC33041mov, interfaceC13655dTj);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new Web3ShareServiceImpl$generateShareShortLink$1(web3ShareModel, abstractActivityC33041mov, this, interfaceC13655dTj, null), 3, null);
    }

    public final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean) {
        for (Web3ShareBaseInfo web3ShareBaseInfo : web3ShareModel.getShareInfoList()) {
            if (web3ShareBaseInfo instanceof Web3ShareLinkInfo) {
                Web3ShareLinkInfo web3ShareLinkInfo = (Web3ShareLinkInfo) web3ShareBaseInfo;
                if (android.text.TextUtils.isEmpty(web3ShareLinkInfo.getDirectShareLink())) {
                    web3ShareLinkInfo.setDirectShareLink(shareLinkBean.getFinalShareLink());
                }
            }
        }
        executeShare$default(this, abstractActivityC33041mov, web3ShareModel, null, 4, null);
    }

    public static /* synthetic */ void executeShare$default(dOA doa, AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            shareLinkBean = null;
        }
        doa.OLrzqt(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean) {
        AbstractC13657dTl abstractC13657dTlAEQbTJ = C13667dTv.Companion.AEQbTJ(web3ShareModel.getShareType());
        if (abstractC13657dTlAEQbTJ != null) {
            abstractC13657dTlAEQbTJ.copydefault(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
        }
    }

    public static /* synthetic */ void executeCustomizeShare$default(dOA doa, AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean, InterfaceC13655dTj interfaceC13655dTj, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            shareLinkBean = null;
        }
        doa.AEQbTJ(abstractActivityC33041mov, web3ShareModel, shareLinkBean, interfaceC13655dTj);
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean, InterfaceC13655dTj interfaceC13655dTj) {
        new C13654dTi(interfaceC13655dTj).copydefault(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, InterfaceC13655dTj interfaceC13655dTj) {
        if (interfaceC13655dTj != null) {
            interfaceC13655dTj.copydefault();
        } else if (C7863arp.KWHzl(fragmentActivity) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoading();
        }
    }

    public final void EZpvd(FragmentActivity fragmentActivity, InterfaceC13655dTj interfaceC13655dTj) {
        if (interfaceC13655dTj != null) {
            interfaceC13655dTj.AEQbTJ();
        } else if (C7863arp.KWHzl(fragmentActivity) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
    }
}
