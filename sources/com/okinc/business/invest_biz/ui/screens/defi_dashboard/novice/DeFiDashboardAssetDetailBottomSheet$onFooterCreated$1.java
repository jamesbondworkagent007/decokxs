package com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice;

import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C24214iZc;
import o.C24236iZy;
import o.C33129mqd;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27286jsN;
import o.iYU;
import o.iZT;
import o.wYF;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ wYF $buttonbox;
    int label;
    final /* synthetic */ C24214iZc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1(C24214iZc c24214iZc, wYF wyf, Continuation<? super DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = c24214iZc;
        this.$buttonbox = wyf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1(this.this$0, this.$buttonbox, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.this$0.EZpvd().AEQbTJ(), this.this$0.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED);
            final C24214iZc c24214iZc = this.this$0;
            final wYF wyf = this.$buttonbox;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1.3

                /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1$3$TaskDescription */
                public static final class TaskDescription implements View.OnClickListener {
                    public final /* synthetic */ C24214iZc AEQbTJ;
                    public final /* synthetic */ long EZpvd;
                    public final /* synthetic */ DeFiTokenModelAssetDetail KWHzl;
                    public final /* synthetic */ View OLrzqt;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public TaskDescription(View view, long j, DeFiTokenModelAssetDetail deFiTokenModelAssetDetail, C24214iZc c24214iZc) {
                        this.OLrzqt = view;
                        this.EZpvd = j;
                        this.KWHzl = deFiTokenModelAssetDetail;
                        this.AEQbTJ = c24214iZc;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                            C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                            C24236iZy c24236iZy = (C24236iZy) CollectionsKt___CollectionsKt.firstOrNull(this.KWHzl.AEQbTJ());
                            String strDjBIcL = c24236iZy != null ? c24236iZy.djBIcL() : null;
                            if (C33129mqd.OLrzqt((CharSequence) strDjBIcL)) {
                                this.AEQbTJ.dismissAllowingStateLoss();
                                iYU iyuKWHzl = this.AEQbTJ.KWHzl();
                                Intrinsics.copydefault((Object) strDjBIcL);
                                iyuKWHzl.OLrzqt(new InterfaceC27286jsN.TaskDescription(strDjBIcL));
                            }
                            this.AEQbTJ.dismissAllowingStateLoss();
                        }
                    }
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(iZT izt, Continuation<? super Unit> continuation) {
                    if (!Intrinsics.EZpvd(c24214iZc.gEmmrt, izt)) {
                        c24214iZc.gEmmrt = izt;
                        if (!(izt instanceof iZT.TaskDescription)) {
                            ConstraintLayout constraintLayout = c24214iZc.EZpvd;
                            if (constraintLayout != null) {
                                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), c24214iZc.getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt));
                            }
                            wyf.setVisibility(8);
                        } else {
                            DeFiTokenModelAssetDetail deFiTokenModelAssetDetailKWHzl = ((iZT.TaskDescription) izt).KWHzl();
                            if (!C33129mqd.OLrzqt((CharSequence) deFiTokenModelAssetDetailKWHzl.copydefault())) {
                                ConstraintLayout constraintLayout2 = c24214iZc.EZpvd;
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), c24214iZc.getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fFgQHt));
                                }
                                wyf.setVisibility(8);
                            } else {
                                wyf.setType(5);
                                wyf.setPrimaryText(deFiTokenModelAssetDetailKWHzl.copydefault());
                                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                                if (c52794wYpCopydefault != null) {
                                    c52794wYpCopydefault.setOKDSType(260);
                                }
                                C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
                                if (c52794wYpCopydefault2 != null) {
                                    c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, deFiTokenModelAssetDetailKWHzl, c24214iZc));
                                }
                                wyf.setVisibility(0);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowFlowWithLifecycle.collect(flowCollector, this) == objCopydefault) {
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
