package com.okinc.business.dex.trade.component.walletorderlist.ui;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C19855gRv;
import o.C33546myW;
import o.C56391yDq;
import o.C56442yFn;
import o.gRC;
import o.gRD;
import o.hBW;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPageOrderListFragment$setListener$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ gRC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPageOrderListFragment$setListener$7(gRC grc, Continuation<? super WalletPageOrderListFragment$setListener$7> continuation) {
        super(2, continuation);
        this.this$0 = grc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPageOrderListFragment$setListener$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPageOrderListFragment$setListener$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<gRD> stateFlowEZpvd = this.this$0.AhwBna().EZpvd();
            final gRC grc = this.this$0;
            FlowCollector<? super gRD> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.walletorderlist.ui.WalletPageOrderListFragment$setListener$7.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(gRD grd, Continuation<? super Unit> continuation) {
                    C33546myW c33546myW;
                    C33546myW c33546myW2;
                    C33546myW c33546myW3;
                    C33546myW c33546myW4;
                    hBW hbwEZpvd = gRC.EZpvd(grc);
                    if (hbwEZpvd != null && (c33546myW4 = hbwEZpvd.AEQbTJ) != null) {
                        c33546myW4.AEQbTJ();
                    }
                    if (grd instanceof gRD.Application) {
                        grc.OLrzqt(false);
                        hBW hbwEZpvd2 = gRC.EZpvd(grc);
                        if (hbwEZpvd2 != null && (c33546myW3 = hbwEZpvd2.AEQbTJ) != null) {
                            c33546myW3.AhwBna(((gRD.Application) grd).OLrzqt());
                        }
                        hBW hbwEZpvd3 = gRC.EZpvd(grc);
                        if (hbwEZpvd3 != null && (c33546myW2 = hbwEZpvd3.AEQbTJ) != null) {
                            c33546myW2.valueOf();
                        }
                        grc.AYXKKw().OLrzqt((List<? extends Object>) ((gRD.Application) grd).KWHzl());
                        rVN.reportFullyDrawn$default((Fragment) grc, true, (String) null, 2, (Object) null);
                    } else if (Intrinsics.EZpvd(grd, gRD.TaskDescription.OLrzqt)) {
                        grc.OLrzqt(false);
                        C19855gRv c19855gRvAYXKKw = grc.AYXKKw();
                        String strAEQbTJ = grc.AhwBna().AEQbTJ();
                        if (strAEQbTJ == null) {
                            strAEQbTJ = "";
                        }
                        c19855gRvAYXKKw.copydefault(strAEQbTJ);
                        rVN.reportFullyDrawn$default((Fragment) grc, true, (String) null, 2, (Object) null);
                    } else if (grd instanceof gRD.ActionBar) {
                        grc.OLrzqt(false);
                        grc.AYXKKw().KWHzl(((gRD.ActionBar) grd).OLrzqt());
                        rVN.reportFullyDrawn$default((Fragment) grc, false, (String) null, 2, (Object) null);
                    } else if (Intrinsics.EZpvd(grd, gRD.Activity.KWHzl)) {
                        grc.OLrzqt(true);
                    } else if (!Intrinsics.EZpvd(grd, gRD.StateListAnimator.EZpvd)) {
                        if (Intrinsics.EZpvd(grd, gRD.FragmentManager.copydefault)) {
                            grc.OLrzqt(false);
                            hBW hbwEZpvd4 = gRC.EZpvd(grc);
                            if (hbwEZpvd4 != null && (c33546myW = hbwEZpvd4.AEQbTJ) != null) {
                                c33546myW.valueOf();
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
