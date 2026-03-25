package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.ui.view.DAppSearchResultFragment$addDataListener$2;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.DAppSearchResultViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C17183exw;
import o.C18951fsB;
import o.C18977fsb;
import o.C18980fse;
import o.C18983fsh;
import o.C19033fte;
import o.C19188fwa;
import o.C19247fxg;
import o.C33129mqd;
import o.C55113xdn;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class DAppSearchResultFragment$addDataListener$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19033fte this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppSearchResultFragment$addDataListener$2(C19033fte c19033fte, Continuation<? super DAppSearchResultFragment$addDataListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c19033fte;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppSearchResultFragment$addDataListener$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppSearchResultFragment$addDataListener$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.DAppSearchResultFragment$addDataListener$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C18980fse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C19033fte this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19033fte c19033fte, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19033fte;
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
        public final Object invoke(C18980fse c18980fse, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c18980fse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C18980fse c18980fse;
            List<C18977fsb> listAhwBna;
            RecyclerView recyclerView;
            C19247fxg c19247fxg;
            RecyclerView recyclerView2;
            C19247fxg c19247fxg2;
            C55113xdn c55113xdn;
            RecyclerView recyclerView3;
            C19247fxg c19247fxg3;
            C19247fxg c19247fxg4;
            C19247fxg c19247fxg5;
            C55113xdn c55113xdn2;
            RecyclerView recyclerView4;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C18980fse c18980fse2 = (C18980fse) this.L$0;
                DAppSearchResultViewModel dAppSearchResultViewModelAEQbTJ = this.this$0.AEQbTJ();
                this.L$0 = c18980fse2;
                this.label = 1;
                if (dAppSearchResultViewModelAEQbTJ.KWHzl(this) == objCopydefault) {
                    return objCopydefault;
                }
                c18980fse = c18980fse2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c18980fse = (C18980fse) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            List<C18977fsb> listOLrzqt = c18980fse.OLrzqt();
            if (listOLrzqt == null) {
                listOLrzqt = yDY.AhwBna();
            }
            this.this$0.AEQbTJ.clear();
            if (!this.this$0.DbNXlk()) {
                this.this$0.AEQbTJ.add(new C18951fsB(8.0f, 0.0f, 2, null));
            }
            ArrayList arrayList = this.this$0.AEQbTJ;
            if (!listOLrzqt.isEmpty()) {
                listAhwBna = listOLrzqt;
            } else if (c18980fse.EZpvd().length() > 0) {
                listAhwBna = C56402yEa.EZpvd(new C18983fsh(c18980fse.EZpvd()));
            } else {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
            C19188fwa.submitList$default(this.this$0.KWHzl(), CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.this$0.AEQbTJ), null, 2, null);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            C17183exw c17183exw = this.this$0.copydefault;
            if (c17183exw != null && (recyclerView4 = c17183exw.AEQbTJ) != null) {
                recyclerView4.scrollToPosition(0);
            }
            C17183exw c17183exw2 = this.this$0.copydefault;
            if (c17183exw2 != null && (c55113xdn2 = c17183exw2.KWHzl) != null) {
                c55113xdn2.KWHzl(0L);
            }
            if (c18980fse.djBIcL()) {
                C17183exw c17183exw3 = this.this$0.copydefault;
                if (c17183exw3 != null && (c19247fxg5 = c17183exw3.AYXKKw) != null) {
                    c19247fxg5.setVisibility(8);
                }
            } else {
                if (listOLrzqt.isEmpty() && c18980fse.EZpvd().length() == 0) {
                    C17183exw c17183exw4 = this.this$0.copydefault;
                    if (c17183exw4 != null && (c19247fxg4 = c17183exw4.AYXKKw) != null) {
                        c19247fxg4.copydefault();
                    }
                    C17183exw c17183exw5 = this.this$0.copydefault;
                    if (c17183exw5 != null && (c19247fxg3 = c17183exw5.AYXKKw) != null) {
                        c19247fxg3.setVisibility(0);
                    }
                    C17183exw c17183exw6 = this.this$0.copydefault;
                    if (c17183exw6 != null && (recyclerView3 = c17183exw6.AEQbTJ) != null) {
                        recyclerView3.setVisibility(8);
                    }
                } else if (C33129mqd.KWHzl((Collection) listOLrzqt) || c18980fse.EZpvd().length() > 0) {
                    C17183exw c17183exw7 = this.this$0.copydefault;
                    if (c17183exw7 != null && (c19247fxg = c17183exw7.AYXKKw) != null) {
                        c19247fxg.setVisibility(8);
                    }
                    C17183exw c17183exw8 = this.this$0.copydefault;
                    if (c17183exw8 != null && (recyclerView = c17183exw8.AEQbTJ) != null) {
                        recyclerView.setVisibility(0);
                    }
                } else if (c18980fse.gEmmrt()) {
                    C17183exw c17183exw9 = this.this$0.copydefault;
                    if (c17183exw9 != null && (c19247fxg2 = c17183exw9.AYXKKw) != null) {
                        final C19033fte c19033fte = this.this$0;
                        c19247fxg2.setVisibility(0);
                        c19247fxg2.EZpvd(new Function0() { // from class: o.fto
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return DAppSearchResultFragment$addDataListener$2.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(c19033fte);
                            }
                        });
                    }
                    C17183exw c17183exw10 = this.this$0.copydefault;
                    if (c17183exw10 != null && (recyclerView2 = c17183exw10.AEQbTJ) != null) {
                        recyclerView2.setVisibility(8);
                    }
                }
                C17183exw c17183exw11 = this.this$0.copydefault;
                if (c17183exw11 != null && (c55113xdn = c17183exw11.KWHzl) != null) {
                    c55113xdn.copydefault();
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(C19033fte c19033fte) {
            c19033fte.AkhnZx().AEQbTJ(c19033fte.OLrzqt);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<C18980fse> stateFlowOLrzqt = this.this$0.AkhnZx().OLrzqt();
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
