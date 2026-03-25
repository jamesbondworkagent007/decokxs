package com.okinc.feature.public_beta_impl.viewmodel;

import com.okinc.feature.public_beta_impl.viewmodel.LandingPageViewModel$processDeeplink$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43238rlX;
import o.C2349AIi;
import o.C32979mnm;
import o.C34783niv;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC43294rma;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class LandingPageViewModel$processDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C2349AIi $featureInfo;
    int label;
    final /* synthetic */ C34783niv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingPageViewModel$processDeeplink$1(C2349AIi c2349AIi, C34783niv c34783niv, Continuation<? super LandingPageViewModel$processDeeplink$1> continuation) {
        super(2, continuation);
        this.$featureInfo = c2349AIi;
        this.this$0 = c34783niv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LandingPageViewModel$processDeeplink$1(this.$featureInfo, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LandingPageViewModel$processDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        final String strAYXKKw;
        String strAhwBna;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                C2349AIi c2349AIi = this.$featureInfo;
                final String str = "";
                if (c2349AIi == null || (strAYXKKw = c2349AIi.AYXKKw()) == null) {
                    strAYXKKw = "";
                }
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                C2349AIi c2349AIi2 = this.$featureInfo;
                if (c2349AIi2 != null && (strAhwBna = c2349AIi2.AhwBna()) != null) {
                    str = strAhwBna;
                }
                interfaceC43294rma.KWHzl(C32979mnm.EZpvd.OLrzqt(), str, C56423yEv.EZpvd(C56390yDp.OLrzqt("featureCode", strAYXKKw)), new Function1() { // from class: o.niA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return LandingPageViewModel$processDeeplink$1.invokeSuspend$lambda$0(strAYXKKw, str, (AbstractC43238rlX) obj2);
                    }
                });
            } catch (Exception e) {
                pUU.AEQbTJ("ShakeFeedbackIntroViewModel", "Failed to start shake feedback", e);
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, C34783niv.Activity.copy$default((C34783niv.Activity) value, null, false, null, new C34783niv.Application("Failed to start shake feedback: " + e.getMessage(), false, 2, null), false, 23, null)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, String str2, AbstractC43238rlX abstractC43238rlX) {
        pUU.KWHzl("ShakeFeedbackIntroViewModel", "execute " + str + " deeplink: " + str2 + " " + abstractC43238rlX);
        return Unit.INSTANCE;
    }
}
