package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import android.app.Activity;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC17579fKo;
import o.C33064mpR;
import o.C43316rmw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fLJ;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyWalletSetAddressActivity$observeUIData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17579fKo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletSetAddressActivity$observeUIData$1(ActivityC17579fKo activityC17579fKo, Continuation<? super EscapePassKeyWalletSetAddressActivity$observeUIData$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17579fKo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletSetAddressActivity$observeUIData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletSetAddressActivity$observeUIData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletSetAddressActivity$observeUIData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends fLJ>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17579fKo this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17579fKo activityC17579fKo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17579fKo;
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
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends fLJ>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<? extends List<fLJ>>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<? extends List<fLJ>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    this.this$0.ejfBZ();
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    this.this$0.DbNXlk();
                    C43316rmw c43316rmw = this.this$0.copydefault;
                    if (c43316rmw == null) {
                        Intrinsics.gEmmrt("");
                        c43316rmw = null;
                    }
                    C33064mpR.OLrzqt(c43316rmw, (List<? extends Object>) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
                    C43316rmw c43316rmw2 = this.this$0.copydefault;
                    if (c43316rmw2 == null) {
                        Intrinsics.gEmmrt("");
                        c43316rmw2 = null;
                    }
                    c43316rmw2.notifyDataSetChanged();
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
                    if (application.AEQbTJ() instanceof OKServerException) {
                        Throwable thAEQbTJ = application.AEQbTJ();
                        Intrinsics.copydefault(thAEQbTJ, "");
                        if (((OKServerException) thAEQbTJ).getCode() == 10002) {
                            this.this$0.fJNWhG();
                        } else {
                            this.this$0.fIwbmz();
                        }
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
                    this.this$0.fJNWhG();
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
            StateFlow<InterfaceC49371unL<List<fLJ>>> stateFlowCopydefault = this.this$0.isConnected().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
