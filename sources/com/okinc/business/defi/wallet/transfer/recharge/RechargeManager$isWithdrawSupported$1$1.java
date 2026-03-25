package com.okinc.business.defi.wallet.transfer.recharge;

import com.okinc.assets.backend.api.model.GetDepositSupportResponse;
import com.okinc.business.defi.biz.net.bean.RechargeBean;
import com.okinc.business.defi.biz.net.bean.RechargeNavigationBean;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C13754dXa;
import o.C21139guC;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC58184ywW;
import o.InterfaceC8224ayh;

/* JADX INFO: loaded from: classes5.dex */
public final class RechargeManager$isWithdrawSupported$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C10854bwM $coinMeta;
    final /* synthetic */ InterfaceC58184ywW<Pair<String, RechargeBean>> $emit;
    final /* synthetic */ WalletRechargeBean $param;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargeManager$isWithdrawSupported$1$1(C10854bwM c10854bwM, InterfaceC58184ywW<Pair<String, RechargeBean>> interfaceC58184ywW, WalletRechargeBean walletRechargeBean, AbstractC12782ctV abstractC12782ctV, Continuation<? super RechargeManager$isWithdrawSupported$1$1> continuation) {
        super(2, continuation);
        this.$coinMeta = c10854bwM;
        this.$emit = interfaceC58184ywW;
        this.$param = walletRechargeBean;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RechargeManager$isWithdrawSupported$1$1(this.$coinMeta, this.$emit, this.$param, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RechargeManager$isWithdrawSupported$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String strCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
            C10854bwM c10854bwM = this.$coinMeta;
            Integer numAEQbTJ = c10854bwM != null ? C56443yFo.AEQbTJ(c10854bwM.AxsJAY()) : null;
            Boolean boolKWHzl = C56443yFo.KWHzl(false);
            this.label = 1;
            objOLrzqt = interfaceC8224ayh.OLrzqt(numAEQbTJ, boolKWHzl, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        InterfaceC58184ywW<Pair<String, RechargeBean>> interfaceC58184ywW = this.$emit;
        WalletRechargeBean walletRechargeBean = this.$param;
        C10854bwM c10854bwM2 = this.$coinMeta;
        AbstractC12782ctV abstractC12782ctV = this.$wallet;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            GetDepositSupportResponse getDepositSupportResponse = (GetDepositSupportResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            if (Intrinsics.EZpvd(getDepositSupportResponse.getSupport(), C56443yFo.KWHzl(true))) {
                C21139guC c21139guC = C21139guC.OLrzqt;
                Intrinsics.copydefault(interfaceC58184ywW);
                String strAYXKKw = C33070mpX.AYXKKw(c21139guC.OLrzqt(walletRechargeBean) ? C13754dXa.FragmentManager.HJWChPRGtXKCDKRTZD : C13754dXa.FragmentManager.zEHIKV);
                if (c21139guC.OLrzqt(walletRechargeBean)) {
                    strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.getSerial, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM2 != null ? c10854bwM2.fJNWhG() : null))));
                } else {
                    strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.zDGrpR, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM2 != null ? c10854bwM2.fJNWhG() : null))));
                }
                String str = strCopydefault;
                int i2 = C13754dXa.Activity.QKudOq;
                String strDbNXlk = abstractC12782ctV.DbNXlk();
                long jValueOf = C33129mqd.valueOf(c10854bwM2 != null ? C56443yFo.KWHzl(c10854bwM2.AhwBna()) : null);
                Integer currencyId = getDepositSupportResponse.getCurrencyId();
                c21139guC.EZpvd((InterfaceC58184ywW<Pair<String, RechargeBean>>) interfaceC58184ywW, "withdraw", new RechargeBean("withdraw", strAYXKKw, false, str, i2, new RechargeNavigationBean(strDbNXlk, (String) null, (String) null, jValueOf, c21139guC.copydefault(abstractC12782ctV, c10854bwM2, walletRechargeBean.getAddressType()), (String) null, (String) null, false, currencyId != null ? currencyId.intValue() : 0, c10854bwM2 != null ? c10854bwM2.AxsJAY() : 0, abstractC12782ctV.AYXKKw(), abstractC12782ctV.QfsBiF(), false, false, false, (String) null, (String) null, 0, 254182, (DefaultConstructorMarker) null)));
            } else {
                C21139guC c21139guC2 = C21139guC.OLrzqt;
                Intrinsics.copydefault(interfaceC58184ywW);
                c21139guC2.EZpvd((InterfaceC58184ywW<Pair<String, RechargeBean>>) interfaceC58184ywW, "withdraw", (RechargeBean) null);
            }
        }
        InterfaceC58184ywW<Pair<String, RechargeBean>> interfaceC58184ywW2 = this.$emit;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            C21139guC c21139guC3 = C21139guC.OLrzqt;
            Intrinsics.copydefault(interfaceC58184ywW2);
            c21139guC3.EZpvd((InterfaceC58184ywW<Pair<String, RechargeBean>>) interfaceC58184ywW2, "withdraw", (RechargeBean) null);
        }
        return Unit.INSTANCE;
    }
}
