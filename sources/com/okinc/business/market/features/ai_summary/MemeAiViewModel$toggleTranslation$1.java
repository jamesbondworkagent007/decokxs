package com.okinc.business.market.features.ai_summary;

import com.okinc.business.market.features.ai_summary.MemeAiViewModel$toggleTranslation$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AGG;
import o.AGJ;
import o.C23313hvq;
import o.C25794jGp;
import o.C31256lqb;
import o.C33129mqd;
import o.C38303pTu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25784jGf;
import o.InterfaceC25788jGj;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeAiViewModel$toggleTranslation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ InterfaceC25788jGj $currentState;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $tokenTicker;
    int label;
    final /* synthetic */ MemeAiViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeAiViewModel$toggleTranslation$1(MemeAiViewModel memeAiViewModel, String str, String str2, String str3, InterfaceC25788jGj interfaceC25788jGj, Continuation<? super MemeAiViewModel$toggleTranslation$1> continuation) {
        super(2, continuation);
        this.this$0 = memeAiViewModel;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$tokenTicker = str3;
        this.$currentState = interfaceC25788jGj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeAiViewModel$toggleTranslation$1(this.this$0, this.$chainId, this.$tokenAddress, this.$tokenTicker, this.$currentState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeAiViewModel$toggleTranslation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
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
        final InterfaceC25788jGj interfaceC25788jGj = this.$currentState;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            AGG agg = (AGG) objM7386unboximpl;
            AGJ agjAEQbTJ = agg.AEQbTJ();
            String strEZpvd = agjAEQbTJ != null ? agjAEQbTJ.EZpvd() : null;
            AGJ agjAEQbTJ2 = agg.AEQbTJ();
            String strAEQbTJ = agjAEQbTJ2 != null ? agjAEQbTJ2.AEQbTJ() : null;
            AGJ agjAEQbTJ3 = agg.AEQbTJ();
            String strCopydefault = agjAEQbTJ3 != null ? agjAEQbTJ3.copydefault() : null;
            if (C38303pTu.copydefault(memeAiViewModel.AEQbTJ.OLrzqt().getLocale())) {
                MutableStateFlow mutableStateFlow = memeAiViewModel.OLrzqt;
                String strKWHzl = C31256lqb.KWHzl(strEZpvd, (Function0<String>) new Function0() { // from class: o.jGk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MemeAiViewModel$toggleTranslation$1.invokeSuspend$lambda$5$lambda$0(interfaceC25788jGj);
                    }
                });
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                mutableStateFlow.setValue(new InterfaceC25788jGj.Activity(strKWHzl, null, false, C23313hvq.copydefault(agg.copydefault(), "1"), strCopydefault, 6, null));
                return Unit.INSTANCE;
            }
            if (C33129mqd.OLrzqt((CharSequence) strAEQbTJ)) {
                memeAiViewModel.OLrzqt.setValue(new InterfaceC25788jGj.Activity(C31256lqb.KWHzl(strEZpvd, (Function0<String>) new Function0() { // from class: o.jGo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MemeAiViewModel$toggleTranslation$1.invokeSuspend$lambda$5$lambda$1(interfaceC25788jGj);
                    }
                }), C38303pTu.copydefault(memeAiViewModel.AEQbTJ.OLrzqt().getLocale()) ? null : strAEQbTJ, true, C23313hvq.copydefault(agg.copydefault(), "1"), C31256lqb.KWHzl(strCopydefault, (Function0<String>) new Function0() { // from class: o.jGn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MemeAiViewModel$toggleTranslation$1.invokeSuspend$lambda$5$lambda$2(interfaceC25788jGj);
                    }
                })));
            } else {
                memeAiViewModel.OLrzqt.setValue(new InterfaceC25788jGj.TaskDescription(C31256lqb.KWHzl(strEZpvd, (Function0<String>) new Function0() { // from class: o.jGm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MemeAiViewModel$toggleTranslation$1.invokeSuspend$lambda$5$lambda$3(interfaceC25788jGj);
                    }
                }), C23313hvq.copydefault(agg.copydefault(), "1"), C31256lqb.KWHzl(strCopydefault, (Function0<String>) new Function0() { // from class: o.jGl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MemeAiViewModel$toggleTranslation$1.invokeSuspend$lambda$5$lambda$4(interfaceC25788jGj);
                    }
                })));
            }
        }
        MemeAiViewModel memeAiViewModel2 = this.this$0;
        InterfaceC25788jGj interfaceC25788jGj2 = this.$currentState;
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            InterfaceC25784jGf interfaceC25784jGf = (InterfaceC25784jGf) interfaceC25788jGj2;
            memeAiViewModel2.OLrzqt.setValue(new InterfaceC25788jGj.TaskDescription(interfaceC25784jGf.KWHzl(), interfaceC25784jGf.EZpvd(), interfaceC25784jGf.AEQbTJ()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$5$lambda$0(InterfaceC25788jGj interfaceC25788jGj) {
        return ((InterfaceC25784jGf) interfaceC25788jGj).KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$5$lambda$1(InterfaceC25788jGj interfaceC25788jGj) {
        return ((InterfaceC25784jGf) interfaceC25788jGj).KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$5$lambda$2(InterfaceC25788jGj interfaceC25788jGj) {
        return ((InterfaceC25784jGf) interfaceC25788jGj).AEQbTJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$5$lambda$3(InterfaceC25788jGj interfaceC25788jGj) {
        return ((InterfaceC25784jGf) interfaceC25788jGj).KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$5$lambda$4(InterfaceC25788jGj interfaceC25788jGj) {
        return ((InterfaceC25784jGf) interfaceC25788jGj).AEQbTJ();
    }
}
