package com.okinc.tradingbot.impl.futures_grid;

import com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C43422row;
import o.C51045vfc;
import o.C51053vfk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class FuturesGridWithdrawViewModel$confirmWithdraw$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ C51045vfc.StateListAnimator $currentUiState;
    final /* synthetic */ MarginBalanceType $type;
    final /* synthetic */ String $withdrawAmount;
    int label;
    final /* synthetic */ C51045vfc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesGridWithdrawViewModel$confirmWithdraw$1(C51045vfc c51045vfc, C51045vfc.StateListAnimator stateListAnimator, String str, MarginBalanceType marginBalanceType, String str2, Continuation<? super FuturesGridWithdrawViewModel$confirmWithdraw$1> continuation) {
        super(2, continuation);
        this.this$0 = c51045vfc;
        this.$currentUiState = stateListAnimator;
        this.$algoId = str;
        this.$type = marginBalanceType;
        this.$withdrawAmount = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesGridWithdrawViewModel$confirmWithdraw$1(this.this$0, this.$currentUiState, this.$algoId, this.$type, this.$withdrawAmount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesGridWithdrawViewModel$confirmWithdraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, INVOKE, IGET, INVOKE, INVOKE, CHECK_CAST, IGET, IGET, INVOKE, INVOKE, CHECK_CAST, INVOKE, CHECK_CAST]}, finally: {[IGET, INVOKE, IGET, INVOKE, INVOKE, CHECK_CAST, IGET, IGET, INVOKE, INVOKE, CHECK_CAST, INVOKE, CHECK_CAST, CONST, CONST, CONST, CONST, CONST, CONST, INVOKE, INVOKE, CONST, CONST, CONST, CONST, CONST, CONST, INVOKE, INVOKE, MOVE, CONST, CONST, CONST, CONST, CONST, CONST, INVOKE, INVOKE, CONST, CONST, CONST, CONST, CONST, CONST, INVOKE, INVOKE, CONST, IF, IGET, INVOKE, CONST, IF, INVOKE, MOVE, INVOKE, IF, INVOKE, IF, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [271=5] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121 A[PHI: r0 r2
  0x0121: PHI (r0v8 kotlinx.coroutines.flow.MutableStateFlow) = 
  (r0v5 kotlinx.coroutines.flow.MutableStateFlow)
  (r0v5 kotlinx.coroutines.flow.MutableStateFlow)
  (r0v16 kotlinx.coroutines.flow.MutableStateFlow)
  (r0v16 kotlinx.coroutines.flow.MutableStateFlow)
 binds: [B:39:0x0115, B:41:0x011d, B:21:0x00ba, B:23:0x00c2] A[DONT_GENERATE, DONT_INLINE]
  0x0121: PHI (r2v9 o.vfc$StateListAnimator) = 
  (r2v6 o.vfc$StateListAnimator)
  (r2v6 o.vfc$StateListAnimator)
  (r2v25 o.vfc$StateListAnimator)
  (r2v25 o.vfc$StateListAnimator)
 binds: [B:39:0x0115, B:41:0x011d, B:21:0x00ba, B:23:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        C51045vfc.StateListAnimator stateListAnimator;
        String strOLrzqt;
        Object objKWHzl;
        C51045vfc c51045vfc;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.OLrzqt.setValue(C51045vfc.StateListAnimator.copy$default(this.$currentUiState, null, false, null, false, true, 7, null));
                    this.this$0.EZpvd(C51045vfc.TaskDescription.ActionBar.copydefault);
                    C51053vfk c51053vfk = this.this$0.AEQbTJ;
                    C51053vfk.ActionBar actionBar = new C51053vfk.ActionBar(this.$algoId, this.$type, null, this.$withdrawAmount, null, 20, null);
                    this.label = 1;
                    objKWHzl = c51053vfk.KWHzl(actionBar, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = obj;
                }
                pUU.EZpvd("FuturesGridWithdrawViewModel", "Adjust margin balance success: " + ((C51053vfk.StateListAnimator) objKWHzl));
                this.this$0.EZpvd(new C51045vfc.TaskDescription.Activity(this.$withdrawAmount));
                mutableStateFlow = this.this$0.OLrzqt;
                stateListAnimator = (C51045vfc.StateListAnimator) this.this$0.OLrzqt.getValue();
                c51045vfc = this.this$0;
                str = this.$withdrawAmount;
                C51045vfc.Activity activity = (C51045vfc.Activity) ((uLU) c51045vfc.copydefault.getValue()).KWHzl();
                strOLrzqt = activity != null ? activity.OLrzqt() : null;
            } catch (Exception e) {
                pUU.AEQbTJ("FuturesGridWithdrawViewModel", "Adjust margin balance failed", e);
                C51045vfc c51045vfc2 = this.this$0;
                String message = e.getMessage();
                if (message == null) {
                    message = C43422row.OLrzqt();
                }
                c51045vfc2.EZpvd(new C51045vfc.TaskDescription.StateListAnimator(message));
                mutableStateFlow = this.this$0.OLrzqt;
                stateListAnimator = (C51045vfc.StateListAnimator) this.this$0.OLrzqt.getValue();
                C51045vfc c51045vfc3 = this.this$0;
                String str2 = this.$withdrawAmount;
                C51045vfc.Activity activity2 = (C51045vfc.Activity) ((uLU) c51045vfc3.copydefault.getValue()).KWHzl();
                strOLrzqt = activity2 != null ? activity2.OLrzqt() : null;
                if (!c51045vfc3.AEQbTJ(str2, strOLrzqt != null ? strOLrzqt : "") || !C33129mqd.OLrzqt((CharSequence) this.$withdrawAmount)) {
                }
            }
            boolean z = c51045vfc.AEQbTJ(str, strOLrzqt != null ? strOLrzqt : "") && C33129mqd.OLrzqt((CharSequence) this.$withdrawAmount);
            mutableStateFlow.setValue(C51045vfc.StateListAnimator.copy$default(stateListAnimator, null, false, null, z, false, 7, null));
            return Unit.INSTANCE;
        } catch (Throwable th) {
            MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
            C51045vfc.StateListAnimator stateListAnimator2 = (C51045vfc.StateListAnimator) this.this$0.OLrzqt.getValue();
            C51045vfc c51045vfc4 = this.this$0;
            String str3 = this.$withdrawAmount;
            C51045vfc.Activity activity3 = (C51045vfc.Activity) ((uLU) c51045vfc4.copydefault.getValue()).KWHzl();
            strOLrzqt = activity3 != null ? activity3.OLrzqt() : null;
            mutableStateFlow2.setValue(C51045vfc.StateListAnimator.copy$default(stateListAnimator2, null, false, null, c51045vfc4.AEQbTJ(str3, strOLrzqt != null ? strOLrzqt : "") && C33129mqd.OLrzqt((CharSequence) this.$withdrawAmount), false, 7, null));
            throw th;
        }
    }
}
