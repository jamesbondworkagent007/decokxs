package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.invest_api.bean.DeFiRedeemParam;
import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.invest_api.bean.Web3CampaignBean;
import com.okinc.business.invest_api.bean.Web3CampaignResponse;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$claimRewardByToken$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$doRedeem$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$executeBoostTrade$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$goToActivityPageV2$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$goToInvestDetailPage$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$shouldShowEarnTabWithChainId$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$stake$1;
import com.okinc.business.invest_biz.app.serviceimpl.InvestServiceApiImpl$unStake$1;
import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.bean.SubTabsData;
import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimManager;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceFrgParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.InterfaceC25483ixa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C25459ixC extends AbstractC43215rlA implements InterfaceC25429iwZ {
    public android.os.Bundle KWHzl;
    public final InterfaceC23635iDr copydefault;

    @yCM
    public C25459ixC(@NotNull InterfaceC23635iDr interfaceC23635iDr) {
        Intrinsics.checkNotNullParameter(interfaceC23635iDr, "");
        this.copydefault = interfaceC23635iDr;
    }

    @Override // o.InterfaceC25429iwZ
    public void EZpvd(@NotNull android.content.Context context, long j, long j2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        C27508jwX.AEQbTJ.copydefault(context, java.lang.Long.valueOf(j2), str, (java.lang.Integer) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC25429iwZ
    public void AEQbTJ(@NotNull android.content.Context context, long j, long j2, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof LifecycleOwner) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context), null, null, new InvestServiceApiImpl$goToInvestDetailPage$1(context, j2, num, str, null), 3, null);
        }
    }

    @Override // o.InterfaceC25429iwZ
    public java.lang.String EZpvd(java.lang.String str, boolean z) {
        return C27492jwH.OLrzqt.AEQbTJ(str, z);
    }

    @Override // o.InterfaceC25429iwZ
    public void EZpvd(final android.os.Bundle bundle) {
        C27570jxg.investEvent$default("YieldHome_Full_Page_View", null, new Function1() { // from class: o.ixK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25459ixC.AEQbTJ(bundle, this, (EventParamsList) obj);
            }
        }, 1, null);
        this.KWHzl = null;
    }

    public static final Unit AEQbTJ(android.os.Bundle bundle, C25459ixC c25459ixC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (bundle == null) {
            bundle = c25459ixC.KWHzl;
        }
        if (bundle != null) {
            java.lang.String string = bundle.getString(RemoteMessageConst.Notification.CHANNEL_ID);
            if (string != null) {
                eventParamsList.put("channel_id", string, false);
            }
            java.lang.String string2 = bundle.getString("source");
            if (string2 != null) {
                eventParamsList.put("source", string2, false);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC25429iwZ
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        C27508jwX.AEQbTJ.OLrzqt(context, str);
    }

    @Override // o.InterfaceC25429iwZ
    public void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        C27508jwX.AEQbTJ.copydefault(context, str, str2, "dashboard");
    }

    @Override // o.InterfaceC25429iwZ
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new InvestServiceApiImpl$goToActivityPageV2$1(context, str, null), 2, null);
    }

    @Override // o.InterfaceC25429iwZ
    public void EZpvd(@NotNull android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        C27508jwX.AEQbTJ.EZpvd(context, i, str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25429iwZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InvestServiceApiImpl$shouldShowEarnTabWithChainId$1 investServiceApiImpl$shouldShowEarnTabWithChainId$1;
        java.lang.Object objOLrzqt;
        java.util.List<SubTabsData> listAEQbTJ;
        if (continuation instanceof InvestServiceApiImpl$shouldShowEarnTabWithChainId$1) {
            investServiceApiImpl$shouldShowEarnTabWithChainId$1 = (InvestServiceApiImpl$shouldShowEarnTabWithChainId$1) continuation;
            int i = investServiceApiImpl$shouldShowEarnTabWithChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investServiceApiImpl$shouldShowEarnTabWithChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                investServiceApiImpl$shouldShowEarnTabWithChainId$1 = new InvestServiceApiImpl$shouldShowEarnTabWithChainId$1(this, continuation);
            }
        }
        java.lang.Object obj = investServiceApiImpl$shouldShowEarnTabWithChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investServiceApiImpl$shouldShowEarnTabWithChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23635iDr interfaceC23635iDr = this.copydefault;
            investServiceApiImpl$shouldShowEarnTabWithChainId$1.label = 1;
            objOLrzqt = interfaceC23635iDr.OLrzqt(j, str, investServiceApiImpl$shouldShowEarnTabWithChainId$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            objOLrzqt = null;
        }
        SearchHeaderInfoResponse searchHeaderInfoResponse = (SearchHeaderInfoResponse) objOLrzqt;
        return C56443yFo.KWHzl((searchHeaderInfoResponse == null || (listAEQbTJ = searchHeaderInfoResponse.AEQbTJ()) == null || !(listAEQbTJ.isEmpty() ^ true)) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25429iwZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<EarnRecommendApyBean>> continuation) throws java.lang.Throwable {
        InvestServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1 investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof InvestServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1) {
            investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1 = (InvestServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1) continuation;
            int i = investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1.label = i - Integer.MIN_VALUE;
            } else {
                investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1 = new InvestServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1(this, continuation);
            }
        }
        InvestServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1 investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$12 = investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$1;
        java.lang.Object obj = investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23635iDr interfaceC23635iDr = this.copydefault;
            investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$12.label = 1;
            objOLrzqt = interfaceC23635iDr.OLrzqt(j, str, str2, investServiceApiImpl$shouldShowEarnAPYWithHoldingAssetList$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        return Result.m7380exceptionOrNullimpl(objOLrzqt) == null ? objOLrzqt : yDY.AhwBna();
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(JLjava/lang/String;Z)Landroidx/fragment/app/Fragment; */
    @Override // o.InterfaceC25429iwZ
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AbstractC32996moC EZpvd(long j, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return C26330jaL.Companion.OLrzqt(j, str);
        }
        return C26409jbl.Companion.OLrzqt(new DexEntranceFrgParam(j, str));
    }

    @Override // o.InterfaceC25429iwZ
    public AbstractC58185ywX<Web3CampaignResponse> copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.EZpvd(str, i, str2, i2), (Function1) null, 1, (java.lang.Object) null);
    }

    @Override // o.InterfaceC25429iwZ
    public void copydefault(@NotNull android.content.Context context, @NotNull Web3CampaignBean web3CampaignBean, InterfaceC25483ixa interfaceC25483ixa) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(web3CampaignBean, "");
        if (interfaceC25483ixa != null) {
            interfaceC25483ixa.OLrzqt();
        }
        if (!iPF.OLrzqt(context)) {
            if (interfaceC25483ixa != null) {
                InterfaceC25483ixa.TaskDescription.onClaimFailed$default(interfaceC25483ixa, 1002, null, 2, null);
            }
        } else {
            Web3RewardsClaimManager web3RewardsClaimManagerCopydefault = iPF.copydefault(context);
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov)) == null) {
                return;
            }
            C27493jwI.safeLaunch$default(lifecycleScope, null, null, new InvestServiceApiImpl$claimRewardByToken$1(web3RewardsClaimManagerCopydefault, context, web3CampaignBean, interfaceC25483ixa, null), 3, null);
        }
    }

    @Override // o.InterfaceC25429iwZ
    public void copydefault(@NotNull android.content.Context context, @NotNull DeFiRedeemParam deFiRedeemParam, InterfaceC25423iwT interfaceC25423iwT) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(deFiRedeemParam, "");
        if (interfaceC25423iwT != null) {
            interfaceC25423iwT.KWHzl();
        }
        if (!C26672jgj.copydefault(context)) {
            if (interfaceC25423iwT != null) {
                interfaceC25423iwT.EZpvd();
                return;
            }
            return;
        }
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov != null) {
            C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new InvestServiceApiImpl$doRedeem$1(C26672jgj.KWHzl(context), abstractActivityC33041mov, deFiRedeemParam, interfaceC25423iwT, null), 3, null);
        } else if (interfaceC25423iwT != null) {
            interfaceC25423iwT.EZpvd();
        }
    }

    @Override // o.InterfaceC25429iwZ
    public void EZpvd(@NotNull android.content.Context context, long j, long j2, long j3, InterfaceC25422iwS interfaceC25422iwS) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context, j, j2, j3, interfaceC25422iwS, new InvestServiceApiImpl$stake$1(context, null));
    }

    @Override // o.InterfaceC25429iwZ
    public void AEQbTJ(@NotNull android.content.Context context, long j, long j2, long j3, InterfaceC25422iwS interfaceC25422iwS) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context, j, j2, j3, interfaceC25422iwS, new InvestServiceApiImpl$unStake$1(context, null));
    }

    public final void EZpvd(android.content.Context context, long j, long j2, long j3, InterfaceC25422iwS interfaceC25422iwS, yHT<? super AbstractActivityC33041mov, ? super C25476ixT, ? super InterfaceC25422iwS, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        if (interfaceC25422iwS != null) {
            interfaceC25422iwS.KWHzl();
        }
        if (!C26672jgj.copydefault(context)) {
            if (interfaceC25422iwS != null) {
                interfaceC25422iwS.KWHzl(new java.lang.Exception("stake useCase create failed"));
                return;
            }
            return;
        }
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov != null) {
            C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new InvestServiceApiImpl$executeBoostTrade$1(yht, abstractActivityC33041mov, new C25476ixT(j2, null, null, j3, null, null, null, null, null, false, null, null, null, false, null, null, null, null, InvestPageSource.Boost, java.lang.Long.valueOf(j), 253942, null), interfaceC25422iwS, null), 3, null);
        } else if (interfaceC25422iwS != null) {
            interfaceC25422iwS.KWHzl(new java.lang.Exception("context must be BaseActivity"));
        }
    }
}
