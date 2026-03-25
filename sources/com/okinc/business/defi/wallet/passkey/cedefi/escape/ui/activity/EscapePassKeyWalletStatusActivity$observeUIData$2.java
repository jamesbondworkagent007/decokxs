package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import android.app.Activity;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fKG;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyWalletStatusActivity$observeUIData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fKG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletStatusActivity$observeUIData$2(fKG fkg, Continuation<? super EscapePassKeyWalletStatusActivity$observeUIData$2> continuation) {
        super(2, continuation);
        this.this$0 = fkg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletStatusActivity$observeUIData$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletStatusActivity$observeUIData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletStatusActivity$observeUIData$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Pair<? extends Boolean, ? extends EscapedStatusUIData>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fKG this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fKG fkg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fkg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Pair<? extends Boolean, ? extends EscapedStatusUIData>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<Pair<Boolean, EscapedStatusUIData>>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<Pair<Boolean, EscapedStatusUIData>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    fKG fkg = this.this$0;
                    Pair pair = (Pair) ((InterfaceC49371unL.ActionBar) interfaceC49371unL).EZpvd();
                    fkg.OLrzqt(pair != null ? ((Boolean) pair.getFirst()).booleanValue() : true);
                } else {
                    if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                        InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                        this.this$0.copydefault(((Boolean) ((Pair) activity.copydefault()).getFirst()).booleanValue());
                        this.this$0.KWHzl((EscapedStatusUIData) ((Pair) activity.copydefault()).getSecond());
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                        Throwable thAEQbTJ = ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ();
                        OKServerException oKServerException = thAEQbTJ instanceof OKServerException ? (OKServerException) thAEQbTJ : null;
                        Integer numAEQbTJ = oKServerException != null ? C56443yFo.AEQbTJ(oKServerException.getCode()) : null;
                        if ((numAEQbTJ != null && numAEQbTJ.intValue() == 10002) || (numAEQbTJ != null && numAEQbTJ.intValue() == 10026)) {
                            this.this$0.isConnected();
                        } else {
                            this.this$0.valueOf();
                        }
                    } else if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
                        fKG fkg2 = this.this$0;
                        Pair pair2 = (Pair) ((InterfaceC49371unL.TaskDescription) interfaceC49371unL).AEQbTJ();
                        fkg2.KWHzl(pair2 != null ? ((Boolean) pair2.getFirst()).booleanValue() : true);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC49371unL<Pair<Boolean, EscapedStatusUIData>>> stateFlowOLrzqt = this.this$0.OLrzqt().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
