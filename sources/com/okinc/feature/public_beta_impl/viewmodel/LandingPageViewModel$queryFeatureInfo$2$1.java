package com.okinc.feature.public_beta_impl.viewmodel;

import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C2349AIi;
import o.C2368AJb;
import o.C2383AJq;
import o.C32979mnm;
import o.C34783niv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC4440Bed;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class LandingPageViewModel$queryFeatureInfo$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<C2349AIi, Unit> $callback;
    final /* synthetic */ String $featureCode;
    int label;
    final /* synthetic */ C34783niv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.AIi, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LandingPageViewModel$queryFeatureInfo$2$1(C34783niv c34783niv, String str, Function1<? super C2349AIi, Unit> function1, Continuation<? super LandingPageViewModel$queryFeatureInfo$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c34783niv;
        this.$featureCode = str;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LandingPageViewModel$queryFeatureInfo$2$1(this.this$0, this.$featureCode, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LandingPageViewModel$queryFeatureInfo$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C2368AJb c2368AJb = (C2368AJb) this.this$0.OLrzqt.get();
            if (c2368AJb != null && !c2368AJb.AEQbTJ()) {
                Object obj2 = this.this$0.OLrzqt.get();
                pUU.KWHzl("ShakeFeedbackIntroViewModel", "Has running query feature task: " + (obj2 != null ? obj2.hashCode() : 0) + ", cancel it.");
                C2368AJb c2368AJb2 = (C2368AJb) this.this$0.OLrzqt.get();
                if (c2368AJb2 != null) {
                    c2368AJb2.copydefault();
                }
            }
            C2383AJq c2383AJqValueOf = this.this$0.valueOf();
            String str = this.$featureCode;
            String packageName = C32979mnm.EZpvd.OLrzqt().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            final C2368AJb c2368AJbKWHzl = c2383AJqValueOf.KWHzl(str, packageName);
            this.this$0.OLrzqt.set(c2368AJbKWHzl);
            pUU.KWHzl("ShakeFeedbackIntroViewModel", "Start query Feature info loaded: " + c2368AJbKWHzl.hashCode());
            final C34783niv c34783niv = this.this$0;
            final Function1<C2349AIi, Unit> function1 = this.$callback;
            c2368AJbKWHzl.EZpvd(new InterfaceC4440Bed() { // from class: com.okinc.feature.public_beta_impl.viewmodel.LandingPageViewModel$queryFeatureInfo$2$1.3
                @Override // o.InterfaceC4440Bed
                public void OLrzqt() {
                    pUU.KWHzl("ShakeFeedbackIntroViewModel", "query feature: " + c2368AJbKWHzl.hashCode() + ", " + c2368AJbKWHzl.OLrzqt());
                    c34783niv.OLrzqt.set(null);
                    C2349AIi c2349AIiOLrzqt = c2368AJbKWHzl.OLrzqt();
                    if (c2349AIiOLrzqt == null) {
                        return;
                    }
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(c34783niv), Dispatchers.getMain(), null, new LandingPageViewModel$queryFeatureInfo$2$1$1$onFinished$1(c2349AIiOLrzqt, function1, c34783niv, null), 2, null);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
