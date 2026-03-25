package com.okinc.okex.combinedresource;

import android.content.Context;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization2.bean.LanguageUpdateResult;
import com.okinc.mln.miniapp.MiniAppUpdateError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C43246rlf;
import o.C45210slW;
import o.C56391yDq;
import o.C56442yFn;
import o.C58113yvE;
import o.C7841arT;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class CombinedResourceUpdater$init$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedResourceUpdater$init$3(Context context, Continuation<? super CombinedResourceUpdater$init$3> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CombinedResourceUpdater$init$3(this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CombinedResourceUpdater$init$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<LanguageUpdateResult> flowKWHzl = ((LocalizeDIModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt().KWHzl();
            final Context context = this.$context;
            FlowCollector<? super LanguageUpdateResult> flowCollector = new FlowCollector() { // from class: com.okinc.okex.combinedresource.CombinedResourceUpdater$init$3.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(LanguageUpdateResult languageUpdateResult, Continuation<? super Unit> continuation) {
                    if (Intrinsics.EZpvd(languageUpdateResult, LanguageUpdateResult.TaskDescription.OLrzqt) || Intrinsics.EZpvd(languageUpdateResult, LanguageUpdateResult.Application.KWHzl)) {
                        C45210slW.requestUpdate$default(C45210slW.KWHzl, context, false, false, 4, null);
                    } else {
                        pUU.copydefault("CombinedResourceUpdater", "language update failed");
                        new C7841arT(null, 1, null).KWHzl(new MiniAppUpdateError(302, "update language failed", null, 4, null));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowKWHzl.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
