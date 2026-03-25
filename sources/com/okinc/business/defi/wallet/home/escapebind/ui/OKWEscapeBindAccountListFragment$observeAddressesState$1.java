package com.okinc.business.defi.wallet.home.escapebind.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean;
import com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountListFragment$observeAddressesState$1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16638enh;
import o.C13754dXa;
import o.C18048faz;
import o.C33070mpX;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class OKWEscapeBindAccountListFragment$observeAddressesState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18048faz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWEscapeBindAccountListFragment$observeAddressesState$1(C18048faz c18048faz, Continuation<? super OKWEscapeBindAccountListFragment$observeAddressesState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18048faz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWEscapeBindAccountListFragment$observeAddressesState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWEscapeBindAccountListFragment$observeAddressesState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountListFragment$observeAddressesState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends List<? extends EscapeBindAccountListUIBean>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18048faz this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18048faz c18048faz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18048faz;
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
        public /* bridge */ /* synthetic */ Object invoke(Point<? extends List<? extends EscapeBindAccountListUIBean>> point, Continuation<? super Unit> continuation) {
            return invoke2((Point<? extends List<EscapeBindAccountListUIBean>>) point, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Point<? extends List<EscapeBindAccountListUIBean>> point, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(point, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RecyclerView recyclerView;
            C55173xeu c55173xeu;
            RecyclerView recyclerView2;
            C55173xeu c55173xeu2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (point == null) {
                    return Unit.INSTANCE;
                }
                if (point instanceof Point.StateListAnimator) {
                    this.this$0.showLoadingWithLogo();
                    AbstractC16638enh abstractC16638enh = this.this$0.copydefault;
                    if (abstractC16638enh != null && (c55173xeu2 = abstractC16638enh.OLrzqt) != null) {
                        c55173xeu2.setVisibility(8);
                    }
                    AbstractC16638enh abstractC16638enh2 = this.this$0.copydefault;
                    if (abstractC16638enh2 != null && (recyclerView2 = abstractC16638enh2.copydefault) != null) {
                        recyclerView2.setVisibility(8);
                    }
                } else if (point instanceof Point.Application) {
                    this.this$0.dismissLoadingWithLogo();
                    this.this$0.KWHzl((List<EscapeBindAccountListUIBean>) ((Point.Application) point).copydefault());
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else {
                    if (!(point instanceof Point.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.dismissLoadingWithLogo();
                    AbstractC16638enh abstractC16638enh3 = this.this$0.copydefault;
                    if (abstractC16638enh3 != null && (c55173xeu = abstractC16638enh3.OLrzqt) != null) {
                        final C18048faz c18048faz = this.this$0;
                        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
                        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.faA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                OKWEscapeBindAccountListFragment$observeAddressesState$1.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(c18048faz, view);
                            }
                        });
                        c55173xeu.setVisibility(0);
                    }
                    AbstractC16638enh abstractC16638enh4 = this.this$0.copydefault;
                    if (abstractC16638enh4 != null && (recyclerView = abstractC16638enh4.copydefault) != null) {
                        recyclerView.setVisibility(8);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(C18048faz c18048faz, View view) {
            c18048faz.KWHzl().KWHzl();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Point<List<EscapeBindAccountListUIBean>>> stateFlowCopydefault = this.this$0.KWHzl().copydefault();
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
