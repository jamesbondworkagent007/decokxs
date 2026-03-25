package com.okinc.business.defi.impl;

import com.okinc.business.defi.impl.Web3ShareServiceImpl$generateShareShortLink$1;
import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.ShareLinkReq;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.business.defi.share.bean.Web3ShareType;
import com.okinc.wallet.api.WalletReferralSource;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C43251rlk;
import o.C43423rox;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C57104ycC;
import o.C58156yvv;
import o.InterfaceC13655dTj;
import o.InterfaceC58227yxM;
import o.dJJ;
import o.dOA;
import o.gKZ;
import o.pUU;
import o.xWP;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3ShareServiceImpl$generateShareShortLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ InterfaceC13655dTj $listener;
    final /* synthetic */ Web3ShareModel $shareModel;
    int label;
    final /* synthetic */ dOA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3ShareServiceImpl$generateShareShortLink$1(Web3ShareModel web3ShareModel, AbstractActivityC33041mov abstractActivityC33041mov, dOA doa, InterfaceC13655dTj interfaceC13655dTj, Continuation<? super Web3ShareServiceImpl$generateShareShortLink$1> continuation) {
        super(2, continuation);
        this.$shareModel = web3ShareModel;
        this.$activity = abstractActivityC33041mov;
        this.this$0 = doa;
        this.$listener = interfaceC13655dTj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3ShareServiceImpl$generateShareShortLink$1(this.$shareModel, this.$activity, this.this$0, this.$listener, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3ShareServiceImpl$generateShareShortLink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strCopydefault;
        String strOLrzqt;
        final Function1 function1;
        gKZ gkz;
        String strOLrzqt2;
        String event;
        dJJ djj;
        String strCopydefault2;
        String event2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str = "";
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xWP xwp = (xWP) C43251rlk.copydefault(xWP.class);
            String accountId = this.$shareModel.getAccountId();
            if (accountId == null) {
                accountId = "";
            }
            this.label = 1;
            obj = xwp.EZpvd(accountId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final Pair pair = (Pair) obj;
        this.$shareModel.setReferralCode((String) pair.getFirst());
        this.$shareModel.setDiscountRate((String) pair.getSecond());
        String webUrl = this.$shareModel.getWebUrl();
        String deepLink = this.$shareModel.getDeepLink();
        if (webUrl == null || (strCopydefault2 = (djj = dJJ.copydefault).copydefault(webUrl, C56390yDp.OLrzqt("ref", "{ref}"))) == null) {
            strCopydefault = null;
        } else {
            Pair<String, ? extends Object>[] pairArr = new Pair[1];
            WalletReferralSource source = this.$shareModel.getSource();
            if (source == null || (event2 = source.getEvent()) == null) {
                event2 = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("shareFrom", event2);
            strCopydefault = djj.copydefault(strCopydefault2, pairArr);
        }
        if (deepLink == null || (strOLrzqt2 = (gkz = gKZ.EZpvd).OLrzqt(deepLink, C56390yDp.OLrzqt("ref", "{ref}"))) == null) {
            strOLrzqt = null;
        } else {
            Pair<String, ? extends Object>[] pairArr2 = new Pair[1];
            WalletReferralSource source2 = this.$shareModel.getSource();
            if (source2 != null && (event = source2.getEvent()) != null) {
                str = event;
            }
            pairArr2[0] = C56390yDp.OLrzqt("shareFrom", str);
            strOLrzqt = gkz.OLrzqt(strOLrzqt2, pairArr2);
        }
        ShareLinkReq shareLinkReq = new ShareLinkReq(this.$shareModel.getModelId(), this.$shareModel.getLinkQueryParams(), strCopydefault, strOLrzqt);
        if (this.$shareModel.getShareType() == Web3ShareType.SHARE_CUSTOMIZE) {
            final dOA doa = this.this$0;
            final AbstractActivityC33041mov abstractActivityC33041mov = this.$activity;
            final Web3ShareModel web3ShareModel = this.$shareModel;
            final InterfaceC13655dTj interfaceC13655dTj = this.$listener;
            function1 = new Function1() { // from class: o.dOF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return Web3ShareServiceImpl$generateShareShortLink$1.invokeSuspend$lambda$0(doa, abstractActivityC33041mov, web3ShareModel, interfaceC13655dTj, (ShareLinkBean) obj2);
                }
            };
        } else {
            final Web3ShareModel web3ShareModel2 = this.$shareModel;
            final dOA doa2 = this.this$0;
            final AbstractActivityC33041mov abstractActivityC33041mov2 = this.$activity;
            final InterfaceC13655dTj interfaceC13655dTj2 = this.$listener;
            function1 = new Function1() { // from class: o.dOD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return Web3ShareServiceImpl$generateShareShortLink$1.invokeSuspend$lambda$1(web3ShareModel2, doa2, abstractActivityC33041mov2, interfaceC13655dTj2, (ShareLinkBean) obj2);
                }
            };
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(new C57104ycC().OLrzqt(shareLinkReq), this.$activity), (Function1) null, 1, (Object) null);
        final Function1 function12 = new Function1() { // from class: o.dOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return Web3ShareServiceImpl$generateShareShortLink$1.invokeSuspend$lambda$2(pair, function1, (ShareLinkBean) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dOC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                function12.invoke(obj2);
            }
        };
        final Web3ShareModel web3ShareModel3 = this.$shareModel;
        final Function1 function13 = new Function1() { // from class: o.dOE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return Web3ShareServiceImpl$generateShareShortLink$1.invokeSuspend$lambda$4(web3ShareModel3, function1, (java.lang.Throwable) obj2);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                function13.invoke(obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(dOA doa, AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, InterfaceC13655dTj interfaceC13655dTj, ShareLinkBean shareLinkBean) {
        doa.AEQbTJ(abstractActivityC33041mov, web3ShareModel, shareLinkBean, interfaceC13655dTj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Web3ShareModel web3ShareModel, dOA doa, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC13655dTj interfaceC13655dTj, ShareLinkBean shareLinkBean) {
        if (web3ShareModel.getShareType() == Web3ShareType.SHARE_IMAGE) {
            doa.OLrzqt(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
        } else if (web3ShareModel.getShareType() == Web3ShareType.SHARE_WEBPAGE) {
            doa.copydefault(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
        }
        doa.EZpvd(abstractActivityC33041mov, interfaceC13655dTj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Pair pair, Function1 function1, ShareLinkBean shareLinkBean) {
        if (C33129mqd.OLrzqt((CharSequence) pair.getFirst())) {
            String shortLink = shareLinkBean.getShortLink();
            shareLinkBean.setShortLink(shortLink != null ? dJJ.copydefault.copydefault(shortLink, C56390yDp.OLrzqt("ref", pair.getFirst())) : null);
        }
        function1.invoke(shareLinkBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(Web3ShareModel web3ShareModel, Function1 function1, Throwable th) {
        function1.invoke(new ShareLinkBean(web3ShareModel.getWebUrl(), (String) null, (String) null, (String) null, 0L, 30, (DefaultConstructorMarker) null));
        pUU.copydefault("Web3ShareService request shortLink error: " + th.getMessage());
        return Unit.INSTANCE;
    }
}
