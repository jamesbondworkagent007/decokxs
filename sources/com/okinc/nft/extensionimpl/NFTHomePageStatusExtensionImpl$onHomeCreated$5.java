package com.okinc.nft.extensionimpl;

import androidx.fragment.app.FragmentActivity;
import com.okinc.nft.extensionimpl.NFTHomePageStatusExtensionImpl$onHomeCreated$5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC58185ywX;
import o.C43251rlk;
import o.C43443rpQ;
import o.C43651rtM;
import o.C56391yDq;
import o.C56442yFn;
import o.C58156yvv;
import o.InterfaceC58227yxM;
import o.InterfaceC9859bdY;

/* JADX INFO: loaded from: classes9.dex */
public final class NFTHomePageStatusExtensionImpl$onHomeCreated$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int label;
    final /* synthetic */ C43443rpQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFTHomePageStatusExtensionImpl$onHomeCreated$5(FragmentActivity fragmentActivity, C43443rpQ c43443rpQ, Continuation<? super NFTHomePageStatusExtensionImpl$onHomeCreated$5> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.this$0 = c43443rpQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NFTHomePageStatusExtensionImpl$onHomeCreated$5(this.$activity, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NFTHomePageStatusExtensionImpl$onHomeCreated$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            obj = C43651rtM.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).isConnected(), this.$activity);
            final C43443rpQ c43443rpQ = this.this$0;
            final FragmentActivity fragmentActivity = this.$activity;
            final Function1 function1 = new Function1() { // from class: o.rqh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return NFTHomePageStatusExtensionImpl$onHomeCreated$5.invokeSuspend$lambda$0(c43443rpQ, fragmentActivity, (java.lang.Boolean) obj2);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rqf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function1.invoke(obj2);
                }
            };
            final C43443rpQ c43443rpQ2 = this.this$0;
            final FragmentActivity fragmentActivity2 = this.$activity;
            final Function1 function12 = new Function1() { // from class: o.rqe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return NFTHomePageStatusExtensionImpl$onHomeCreated$5.invokeSuspend$lambda$2(c43443rpQ2, fragmentActivity2, (java.lang.Throwable) obj2);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rqd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function12.invoke(obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C43443rpQ c43443rpQ, FragmentActivity fragmentActivity, Boolean bool) {
        if (bool.booleanValue()) {
            c43443rpQ.OLrzqt(fragmentActivity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(C43443rpQ c43443rpQ, FragmentActivity fragmentActivity, Throwable th) {
        c43443rpQ.OLrzqt(fragmentActivity);
        return Unit.INSTANCE;
    }
}
