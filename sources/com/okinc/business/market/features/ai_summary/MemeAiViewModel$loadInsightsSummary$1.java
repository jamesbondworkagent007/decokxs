package com.okinc.business.market.features.ai_summary;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AGG;
import o.AGJ;
import o.C23313hvq;
import o.C25794jGp;
import o.C33129mqd;
import o.C38303pTu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25784jGf;
import o.InterfaceC25788jGj;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeAiViewModel$loadInsightsSummary$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $tokenTicker;
    int label;
    final /* synthetic */ MemeAiViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeAiViewModel$loadInsightsSummary$1(MemeAiViewModel memeAiViewModel, String str, String str2, String str3, Continuation<? super MemeAiViewModel$loadInsightsSummary$1> continuation) {
        super(2, continuation);
        this.this$0 = memeAiViewModel;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$tokenTicker = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeAiViewModel$loadInsightsSummary$1(this.this$0, this.$chainId, this.$tokenAddress, this.$tokenTicker, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeAiViewModel$loadInsightsSummary$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        InterfaceC25784jGf stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(InterfaceC25788jGj.Dialog.KWHzl);
            C25794jGp c25794jGp = this.this$0.copydefault;
            String str = this.$chainId;
            String str2 = this.$tokenAddress;
            String str3 = this.$tokenTicker;
            this.label = 1;
            Object objKWHzl = c25794jGp.KWHzl(str, str2, str3, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        MemeAiViewModel memeAiViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            AGG agg = (AGG) objM7386unboximpl;
            AGJ agjAEQbTJ = agg.AEQbTJ();
            String strEZpvd = agjAEQbTJ != null ? agjAEQbTJ.EZpvd() : null;
            AGJ agjAEQbTJ2 = agg.AEQbTJ();
            String strAEQbTJ = agjAEQbTJ2 != null ? agjAEQbTJ2.AEQbTJ() : null;
            AGJ agjAEQbTJ3 = agg.AEQbTJ();
            String strCopydefault = agjAEQbTJ3 != null ? agjAEQbTJ3.copydefault() : null;
            if (C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
                if (!C38303pTu.copydefault(memeAiViewModel.AEQbTJ.OLrzqt().getLocale())) {
                    MutableStateFlow mutableStateFlow = memeAiViewModel.OLrzqt;
                    if (C33129mqd.OLrzqt((CharSequence) strAEQbTJ)) {
                        stateListAnimator = new InterfaceC25788jGj.Activity(strEZpvd == null ? "" : strEZpvd, C38303pTu.copydefault(memeAiViewModel.AEQbTJ.OLrzqt().getLocale()) ? null : strAEQbTJ, true, C23313hvq.copydefault(agg.copydefault(), "1"), strCopydefault == null ? "" : strCopydefault);
                    } else {
                        stateListAnimator = new InterfaceC25788jGj.StateListAnimator(strEZpvd == null ? "" : strEZpvd, C23313hvq.copydefault(agg.copydefault(), "1"), null, false, strCopydefault == null ? "" : strCopydefault, 4, null);
                    }
                    mutableStateFlow.setValue(stateListAnimator);
                } else {
                    memeAiViewModel.OLrzqt.setValue(new InterfaceC25788jGj.Activity(strEZpvd == null ? "" : strEZpvd, null, false, C23313hvq.copydefault(agg.copydefault(), "1"), strCopydefault == null ? "" : strCopydefault, 6, null));
                    return Unit.INSTANCE;
                }
            } else {
                memeAiViewModel.OLrzqt.setValue(InterfaceC25788jGj.ActionBar.EZpvd);
            }
        }
        MemeAiViewModel memeAiViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            memeAiViewModel2.OLrzqt.setValue(InterfaceC25788jGj.FragmentManager.EZpvd);
        }
        return Unit.INSTANCE;
    }
}
