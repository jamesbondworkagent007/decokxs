package com.okinc.business.invest_biz.ui.screens.univ3;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.InvestUniv3Mode;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23732iHg;
import o.C27024jnQ;
import o.C27492jwH;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$refreshReceiveInfoAndRestartCountdown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestUniv3Mode.values().length];
            try {
                iArr[InvestUniv3Mode.Zap.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$refreshReceiveInfoAndRestartCountdown$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$refreshReceiveInfoAndRestartCountdown$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$refreshReceiveInfoAndRestartCountdown$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$refreshReceiveInfoAndRestartCountdown$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object receiveInfoAndCheckState$default;
        Object objCopydefault;
        Object objCopydefault2;
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo;
        String ratePercent$default;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Activity.copydefault[this.this$0.AuCTelauCTel.ordinal()] == 1) {
                if (this.this$0.isConnected().ffGIBT()) {
                    if (this.this$0.isConnected().OqFWZa() == null) {
                        return Unit.INSTANCE;
                    }
                    InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = this.this$0.isConnected();
                    String strODWQjV = this.this$0.isConnected().ODWQjV();
                    InvestTokenWithAmount investTokenWithAmountOqFWZa = this.this$0.isConnected().OqFWZa();
                    Intrinsics.copydefault(investTokenWithAmountOqFWZa);
                    this.label = 1;
                    objCopydefault2 = investUniv3SubscribeViewModelIsConnected.copydefault(true, strODWQjV, investTokenWithAmountOqFWZa, (24 & 8) != 0 ? "" : null, (24 & 16) != 0 ? null : null, (24 & 32) != 0, this);
                    if (objCopydefault2 == objCopydefault3) {
                        return objCopydefault3;
                    }
                    investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) objCopydefault2;
                } else {
                    if (this.this$0.isConnected().QKudOq() != null && this.this$0.isConnected().DAIeex() != null) {
                        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected2 = this.this$0.isConnected();
                        String strRlQdEF = this.this$0.isConnected().RlQdEF();
                        InvestTokenWithAmount investTokenWithAmountQKudOq = this.this$0.isConnected().QKudOq();
                        Intrinsics.copydefault(investTokenWithAmountQKudOq);
                        String strAxsJAYsNCnLh = this.this$0.isConnected().AxsJAYsNCnLh();
                        InvestTokenWithAmount investTokenWithAmountDAIeex = this.this$0.isConnected().DAIeex();
                        Intrinsics.copydefault(investTokenWithAmountDAIeex);
                        this.label = 2;
                        objCopydefault = investUniv3SubscribeViewModelIsConnected2.copydefault(false, strRlQdEF, investTokenWithAmountQKudOq, (24 & 8) != 0 ? "" : strAxsJAYsNCnLh, (24 & 16) != 0 ? null : investTokenWithAmountDAIeex, (24 & 32) != 0, this);
                        if (objCopydefault == objCopydefault3) {
                            return objCopydefault3;
                        }
                        investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex = this.this$0.AuCTel;
                InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex2 = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                if ((amountInputIndex == amountInputIndex2 && !this.this$0.ejfBZ()) || (this.this$0.AuCTel == InvestUniv3SubscribeActivity.AmountInputIndex.First && this.this$0.ejfBZ())) {
                    amountInputIndex2 = InvestUniv3SubscribeActivity.AmountInputIndex.First;
                }
                String strOLrzqt = (amountInputIndex2 == InvestUniv3SubscribeActivity.AmountInputIndex.First ? this.this$0.isConnected().AwvSrB() : this.this$0.isConnected().zuBGHE()).getValue().OLrzqt();
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected3 = this.this$0.isConnected();
                this.label = 3;
                receiveInfoAndCheckState$default = InvestUniv3SubscribeViewModel.getReceiveInfoAndCheckState$default(investUniv3SubscribeViewModelIsConnected3, strOLrzqt, amountInputIndex2, false, this, 4, null);
                if (receiveInfoAndCheckState$default == objCopydefault3) {
                    return objCopydefault3;
                }
                investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) receiveInfoAndCheckState$default;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objCopydefault2 = obj;
            investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) objCopydefault2;
        } else if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
            investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) objCopydefault;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            receiveInfoAndCheckState$default = obj;
            investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) receiveInfoAndCheckState$default;
        }
        C23732iHg c23732iHg = this.this$0.AhwBna;
        if (c23732iHg == null) {
            Intrinsics.gEmmrt("");
            c23732iHg = null;
        }
        c23732iHg.fARcdN.copydefault();
        if (investUniv3SubscribeReceiveInfo != null) {
            this.this$0.isConnected().QKVWgx().setValue(new C27024jnQ(investUniv3SubscribeReceiveInfo, YieldState.FILLED));
            MutableLiveData<String> mutableLiveDataGHZMYf = this.this$0.isConnected().gHZMYf();
            String apr = investUniv3SubscribeReceiveInfo.getApr();
            if (apr == null || (ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, apr, false, 2, null)) == null) {
                ratePercent$default = "--";
            }
            mutableLiveDataGHZMYf.setValue(ratePercent$default);
            this.this$0.isConnected().KWHzl(TransactionStage.CONFIRMATION);
            if (this.this$0.AhwBna()) {
                InvestUniv3SubscribeActivity investUniv3SubscribeActivity = this.this$0;
                InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt = investUniv3SubscribeActivity.isConnected().gEmmrt();
                investUniv3SubscribeActivity.copydefault(C56548yJl.copydefault(investUniv3SubscribeInfoGEmmrt != null ? investUniv3SubscribeInfoGEmmrt.getRefreshTime() : 15, 15));
            }
        }
        return Unit.INSTANCE;
    }
}
