package com.okinc.business.invest_biz.ui.claim;

import android.os.Bundle;
import com.okinc.business.invest_api.bean.Web3CampaignBean;
import com.okinc.business.invest_api.bean.Web3RewardToken;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.C25523iyN;
import o.C27508jwX;
import o.C56402yEa;
import o.C56403yEb;
import o.C56443yFo;
import o.InterfaceC25483ixa;
import o.InterfaceC25530iyU;
import o.iPB;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class Web3RewardsClaimManager {

    @yCM
    public iPB claimTransactionHandler;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull iPB ipb) {
        Intrinsics.checkNotNullParameter(ipb, "");
        this.claimTransactionHandler = ipb;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimManager.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final iPB copydefault() {
        iPB ipb = this.claimTransactionHandler;
        if (ipb != null) {
            return ipb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final Object AEQbTJ(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3CampaignBean web3CampaignBean, final InterfaceC25483ixa interfaceC25483ixa, @NotNull Continuation<? super Unit> continuation) {
        List<Web3RewardToken> listOLrzqt;
        if (Intrinsics.EZpvd(web3CampaignBean.EZpvd(), C56443yFo.KWHzl(false)) || (listOLrzqt = web3CampaignBean.OLrzqt()) == null || listOLrzqt.size() == 0) {
            if (interfaceC25483ixa != null) {
                InterfaceC25483ixa.TaskDescription.onClaimFailed$default(interfaceC25483ixa, 1001, null, 2, null);
            }
            return Unit.INSTANCE;
        }
        List<Web3RewardToken> listOLrzqt2 = web3CampaignBean.OLrzqt();
        Intrinsics.copydefault(listOLrzqt2);
        Web3RewardToken web3RewardToken = listOLrzqt2.get(0);
        List<Web3RewardToken> listOLrzqt3 = web3CampaignBean.OLrzqt();
        Intrinsics.copydefault(listOLrzqt3);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt3, 10));
        for (Web3RewardToken web3RewardToken2 : listOLrzqt3) {
            arrayList.add(new InvestUserRewardElementInfo((ButtonType) null, web3RewardToken2.KWHzl(), web3RewardToken2.EZpvd(), web3RewardToken2.valueOf(), (String) null, web3RewardToken2.OLrzqt(), web3RewardToken2.AhwBna(), 17, (DefaultConstructorMarker) null));
        }
        Long lCopydefault = web3RewardToken.copydefault();
        long jLongValue = lCopydefault != null ? lCopydefault.longValue() : 0L;
        Long lCopydefault2 = web3CampaignBean.copydefault();
        Long lKWHzl = C56443yFo.KWHzl(lCopydefault2 != null ? lCopydefault2.longValue() : 0L);
        Long lCopydefault3 = web3CampaignBean.copydefault();
        copydefault().copydefault(abstractActivityC33041mov, new C25523iyN(jLongValue, 2, arrayList, false, null, lKWHzl, C56402yEa.EZpvd(C56443yFo.KWHzl(lCopydefault3 != null ? lCopydefault3.longValue() : 0L)), null, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, null), new Function1() { // from class: o.iPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return Web3RewardsClaimManager.OLrzqt(interfaceC25483ixa, abstractActivityC33041mov, (InterfaceC25530iyU) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC25483ixa interfaceC25483ixa, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC25530iyU interfaceC25530iyU) {
        Intrinsics.checkNotNullParameter(interfaceC25530iyU, "");
        if (interfaceC25530iyU instanceof InterfaceC25530iyU.TaskDescription) {
            if (interfaceC25483ixa != null) {
                interfaceC25483ixa.copydefault();
            }
            return Unit.INSTANCE;
        }
        if (interfaceC25530iyU instanceof InterfaceC25530iyU.Application) {
            InterfaceC25530iyU.Application application = (InterfaceC25530iyU.Application) interfaceC25530iyU;
            int iOLrzqt = application.OLrzqt() == Integer.MIN_VALUE ? 1003 : application.OLrzqt();
            if (iOLrzqt == 5) {
                if (interfaceC25483ixa != null) {
                    interfaceC25483ixa.copydefault(application.OLrzqt());
                }
                return Unit.INSTANCE;
            }
            if (interfaceC25483ixa != null) {
                interfaceC25483ixa.KWHzl(iOLrzqt, application.AEQbTJ());
            }
            return Unit.INSTANCE;
        }
        if (interfaceC25530iyU instanceof InterfaceC25530iyU.StateListAnimator) {
            if (interfaceC25483ixa != null) {
                interfaceC25483ixa.copydefault(((InterfaceC25530iyU.StateListAnimator) interfaceC25530iyU).KWHzl());
            }
            return Unit.INSTANCE;
        }
        if (interfaceC25530iyU instanceof InterfaceC25530iyU.ActionBar) {
            if (interfaceC25483ixa != null) {
                interfaceC25483ixa.copydefault(((InterfaceC25530iyU.ActionBar) interfaceC25530iyU).OLrzqt());
            }
            AbstractActivityC33041mov abstractActivityC33041mov2 = (AbstractActivityC33041mov) new WeakReference(abstractActivityC33041mov).get();
            if (abstractActivityC33041mov2 != null) {
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                InterfaceC25530iyU.ActionBar actionBar = (InterfaceC25530iyU.ActionBar) interfaceC25530iyU;
                Bundle bundleCopydefault = actionBar.copydefault();
                bundleCopydefault.putBoolean("action_web3_claim", true);
                Unit unit = Unit.INSTANCE;
                C27508jwX.toTransactionResultPage$default(c27508jwX, abstractActivityC33041mov2, bundleCopydefault, actionBar.KWHzl(), actionBar.AEQbTJ().getValue(), null, null, 24, null);
            }
        }
        return Unit.INSTANCE;
    }
}
