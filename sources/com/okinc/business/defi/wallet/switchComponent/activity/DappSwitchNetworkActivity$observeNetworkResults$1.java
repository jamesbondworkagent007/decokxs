package com.okinc.business.defi.wallet.switchComponent.activity;

import android.app.Activity;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16317ehe;
import o.C56391yDq;
import o.C56442yFn;
import o.fRN;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class DappSwitchNetworkActivity$observeNetworkResults$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DappSwitchNetworkActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappSwitchNetworkActivity$observeNetworkResults$1(DappSwitchNetworkActivity dappSwitchNetworkActivity, Continuation<? super DappSwitchNetworkActivity$observeNetworkResults$1> continuation) {
        super(2, continuation);
        this.this$0 = dappSwitchNetworkActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DappSwitchNetworkActivity$observeNetworkResults$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DappSwitchNetworkActivity$observeNetworkResults$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.activity.DappSwitchNetworkActivity$observeNetworkResults$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<fRN.Application, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DappSwitchNetworkActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DappSwitchNetworkActivity dappSwitchNetworkActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dappSwitchNetworkActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fRN.Application application, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                fRN.Application application = (fRN.Application) this.L$0;
                if (application == null) {
                    return Unit.INSTANCE;
                }
                Map<String, List<fRN.ActionBar>> mapKWHzl = application.KWHzl();
                List<fRN.ActionBar> listEZpvd = application.EZpvd();
                List<fRN.ActionBar> listOLrzqt = application.OLrzqt();
                boolean z = listOLrzqt.size() + listEZpvd.size() <= 10;
                C16317ehe c16317ehe = this.this$0.copydefault;
                if (c16317ehe == null) {
                    Intrinsics.gEmmrt("");
                    c16317ehe = null;
                }
                c16317ehe.OLrzqt.djBIcL().setVisibility(z ? 8 : 0);
                C16317ehe c16317ehe2 = this.this$0.copydefault;
                if (c16317ehe2 == null) {
                    Intrinsics.gEmmrt("");
                    c16317ehe2 = null;
                }
                c16317ehe2.OLrzqt.OLrzqt().setVisibility(z ? 8 : 0);
                C16317ehe c16317ehe3 = this.this$0.copydefault;
                if (c16317ehe3 == null) {
                    Intrinsics.gEmmrt("");
                    c16317ehe3 = null;
                }
                boolean z2 = !z;
                c16317ehe3.OLrzqt.setDividerLineVisibility(z2);
                DappSwitchNetworkActivity dappSwitchNetworkActivity = this.this$0;
                C16317ehe c16317ehe4 = dappSwitchNetworkActivity.copydefault;
                if (c16317ehe4 == null) {
                    Intrinsics.gEmmrt("");
                    c16317ehe4 = null;
                }
                OKAnchorSelection oKAnchorSelection = c16317ehe4.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(oKAnchorSelection, "");
                if (z) {
                    listEZpvd = yDY.AhwBna();
                }
                dappSwitchNetworkActivity.EZpvd(oKAnchorSelection, listEZpvd, mapKWHzl, z2);
                DappSwitchNetworkActivity dappSwitchNetworkActivity2 = this.this$0;
                C16317ehe c16317ehe5 = dappSwitchNetworkActivity2.copydefault;
                if (c16317ehe5 == null) {
                    Intrinsics.gEmmrt("");
                    c16317ehe5 = null;
                }
                OKAnchorSelection oKAnchorSelection2 = c16317ehe5.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(oKAnchorSelection2, "");
                dappSwitchNetworkActivity2.copydefault(oKAnchorSelection2, (List<fRN.ActionBar>) listOLrzqt);
                rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
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
            StateFlow<fRN.Application> stateFlowKWHzl = this.this$0.EZpvd().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
