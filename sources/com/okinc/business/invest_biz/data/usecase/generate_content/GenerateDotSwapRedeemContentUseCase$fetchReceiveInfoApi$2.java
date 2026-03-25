package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.iFL;
import o.iGL;
import o.iXB;

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2 extends SuspendLambda implements Function1<Continuation<? super RedeemDetailsAndGasFee>, Object> {
    final /* synthetic */ InitialInfoModel.RedeemInitialInfo $initialInfo;
    final /* synthetic */ TransactionConfig $transactionConfig;
    final /* synthetic */ iXB $userInput;
    Object L$0;
    int label;
    final /* synthetic */ iGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2(iXB ixb, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iGL igl, TransactionConfig transactionConfig, Continuation<? super GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2> continuation) {
        super(1, continuation);
        this.$userInput = ixb;
        this.$initialInfo = redeemInitialInfo;
        this.this$0 = igl;
        this.$transactionConfig = transactionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2(this.$userInput, this.$initialInfo, this.this$0, this.$transactionConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super RedeemDetailsAndGasFee> continuation) {
        return ((GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InvestTokenWithAmount investTokenWithAmountDjBIcL;
        Object objOLrzqt;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            investTokenWithAmountDjBIcL = this.$userInput.djBIcL();
            if (investTokenWithAmountDjBIcL == null) {
                investTokenWithAmountDjBIcL = this.$initialInfo.fIwbmz();
            }
            iGL igl = this.this$0;
            this.L$0 = investTokenWithAmountDjBIcL;
            this.label = 1;
            objOLrzqt = igl.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl);
                return objM7386unboximpl;
            }
            investTokenWithAmountDjBIcL = (InvestTokenWithAmount) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objOLrzqt;
        String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        String str = strDbNXlk == null ? "" : strDbNXlk;
        String strEZpvd = interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(this.$transactionConfig.copydefault()) : null;
        String str2 = strEZpvd == null ? "" : strEZpvd;
        String plainString = C33129mqd.EZpvd(this.$userInput.EZpvd()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        InvestRedeemReceiveReq investRedeemReceiveReq = new InvestRedeemReceiveReq(str, str2, "", this.$transactionConfig.isConnected(), this.$transactionConfig.AkhnZx(), investTokenWithAmountDjBIcL.getTokenAddress(), investTokenWithAmountDjBIcL.getTokenPrecision(), C56443yFo.KWHzl(this.$transactionConfig.AwvSrB()), (String) null, (String) null, (Integer) null, plainString, (Boolean) null, (String) null, (Long) null, 30464, (DefaultConstructorMarker) null);
        iFL ifl = this.this$0.OLrzqt;
        this.L$0 = null;
        this.label = 2;
        Object objKWHzl = ifl.KWHzl(investRedeemReceiveReq, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        objM7386unboximpl = objKWHzl;
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return objM7386unboximpl;
    }
}
