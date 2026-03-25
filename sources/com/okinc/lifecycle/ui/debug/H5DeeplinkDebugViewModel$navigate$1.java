package com.okinc.lifecycle.ui.debug;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.okinc.lifecycle.ui.debug.H5DeeplinkDebugViewModel$navigate$1;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC38177pPb;
import o.AbstractC43238rlX;
import o.C55326xho;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC43294rma;

/* JADX INFO: loaded from: classes9.dex */
public final class H5DeeplinkDebugViewModel$navigate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AbstractC38177pPb.ActionBar $h5DebugSingleEvent;
    int label;
    final /* synthetic */ H5DeeplinkDebugViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5DeeplinkDebugViewModel$navigate$1(H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel, Context context, AbstractC38177pPb.ActionBar actionBar, Continuation<? super H5DeeplinkDebugViewModel$navigate$1> continuation) {
        super(2, continuation);
        this.this$0 = h5DeeplinkDebugViewModel;
        this.$context = context;
        this.$h5DebugSingleEvent = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new H5DeeplinkDebugViewModel$navigate$1(this.this$0, this.$context, this.$h5DebugSingleEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((H5DeeplinkDebugViewModel$navigate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43294rma interfaceC43294rma = this.this$0.AEQbTJ;
            Context context = this.$context;
            String strEZpvd = this.$h5DebugSingleEvent.EZpvd();
            Map mapKWHzl = C56424yEw.KWHzl();
            LinkSource linkSource = LinkSource.IN_APP;
            final H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel = this.this$0;
            final AbstractC38177pPb.ActionBar actionBar = this.$h5DebugSingleEvent;
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, strEZpvd, mapKWHzl, linkSource, false, new Function1() { // from class: o.pPk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return H5DeeplinkDebugViewModel$navigate$1.invokeSuspend$lambda$0(h5DeeplinkDebugViewModel, actionBar, (AbstractC43238rlX) obj2);
                }
            }, 16, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel, AbstractC38177pPb.ActionBar actionBar, AbstractC43238rlX abstractC43238rlX) {
        if (Intrinsics.EZpvd(abstractC43238rlX, AbstractC43238rlX.StateListAnimator.OLrzqt)) {
            C55326xho.toast$default("Deeplink processed successfully", (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else {
            C55326xho.toast$default("Deeplink processing failed", (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            h5DeeplinkDebugViewModel.KWHzl.setValue(new AbstractC38177pPb.Application(actionBar.KWHzl()));
        }
        return Unit.INSTANCE;
    }
}
