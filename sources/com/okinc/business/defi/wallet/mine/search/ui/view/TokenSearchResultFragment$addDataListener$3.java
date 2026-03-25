package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C17180ext;
import o.C18980fse;
import o.C18982fsg;
import o.C19012ftJ;
import o.C19133fvY;
import o.C19247fxg;
import o.C33129mqd;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultFragment$addDataListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19012ftJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultFragment$addDataListener$3(C19012ftJ c19012ftJ, Continuation<? super TokenSearchResultFragment$addDataListener$3> continuation) {
        super(2, continuation);
        this.this$0 = c19012ftJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenSearchResultFragment$addDataListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenSearchResultFragment$addDataListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C18980fse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C19012ftJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19012ftJ c19012ftJ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19012ftJ;
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
            ConstraintLayout constraintLayout;
            RecyclerView recyclerView;
            C19247fxg c19247fxg;
            ConstraintLayout constraintLayout2;
            RecyclerView recyclerView2;
            C19247fxg c19247fxg2;
            C55113xdn c55113xdn;
            ConstraintLayout constraintLayout3;
            RecyclerView recyclerView3;
            C19247fxg c19247fxg3;
            C19247fxg c19247fxg4;
            ConstraintLayout constraintLayout4;
            C19247fxg c19247fxg5;
            C55113xdn c55113xdn2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C18980fse c18980fse = (C18980fse) this.L$0;
                List<C18982fsg> listAYXKKw = c18980fse.AYXKKw();
                if (listAYXKKw == null) {
                    listAYXKKw = yDY.AhwBna();
                }
                C19012ftJ c19012ftJ = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listAYXKKw) {
                    C18982fsg c18982fsg = (C18982fsg) obj2;
                    if (c19012ftJ.AYXKKw == Long.MIN_VALUE || c18982fsg.copydefault().OLrzqt() == c19012ftJ.AYXKKw) {
                        arrayList.add(obj2);
                    }
                }
                C19133fvY c19133fvY = this.this$0.AkhnZx;
                if (c19133fvY != null) {
                    final C19012ftJ c19012ftJ2 = this.this$0;
                    c19133fvY.submitList(arrayList, new Runnable() { // from class: o.ftR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            TokenSearchResultFragment$addDataListener$3.AnonymousClass1.invokeSuspend$lambda$1(c19012ftJ2);
                        }
                    });
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                C17180ext c17180ext = this.this$0.djBIcL;
                if (c17180ext != null && (c55113xdn2 = c17180ext.KWHzl) != null) {
                    c55113xdn2.KWHzl(0L);
                }
                if (c18980fse.djBIcL()) {
                    C17180ext c17180ext2 = this.this$0.djBIcL;
                    if (c17180ext2 != null && (c19247fxg5 = c17180ext2.AhwBna) != null) {
                        c19247fxg5.setVisibility(8);
                    }
                    C17180ext c17180ext3 = this.this$0.djBIcL;
                    if (c17180ext3 != null && (constraintLayout4 = c17180ext3.copydefault) != null) {
                        constraintLayout4.setVisibility(8);
                    }
                } else {
                    if (arrayList.isEmpty()) {
                        C17180ext c17180ext4 = this.this$0.djBIcL;
                        if (c17180ext4 != null && (c19247fxg4 = c17180ext4.AhwBna) != null) {
                            c19247fxg4.copydefault();
                        }
                        C17180ext c17180ext5 = this.this$0.djBIcL;
                        if (c17180ext5 != null && (c19247fxg3 = c17180ext5.AhwBna) != null) {
                            c19247fxg3.setVisibility(0);
                        }
                        C17180ext c17180ext6 = this.this$0.djBIcL;
                        if (c17180ext6 != null && (recyclerView3 = c17180ext6.djBIcL) != null) {
                            recyclerView3.setVisibility(8);
                        }
                        C17180ext c17180ext7 = this.this$0.djBIcL;
                        if (c17180ext7 != null && (constraintLayout3 = c17180ext7.copydefault) != null) {
                            constraintLayout3.setVisibility(0);
                        }
                    } else if (C33129mqd.KWHzl((Collection) arrayList)) {
                        C17180ext c17180ext8 = this.this$0.djBIcL;
                        if (c17180ext8 != null && (c19247fxg2 = c17180ext8.AhwBna) != null) {
                            c19247fxg2.setVisibility(8);
                        }
                        C17180ext c17180ext9 = this.this$0.djBIcL;
                        if (c17180ext9 != null && (recyclerView2 = c17180ext9.djBIcL) != null) {
                            recyclerView2.setVisibility(0);
                        }
                        C17180ext c17180ext10 = this.this$0.djBIcL;
                        if (c17180ext10 != null && (constraintLayout2 = c17180ext10.copydefault) != null) {
                            constraintLayout2.setVisibility(0);
                        }
                    } else if (c18980fse.gEmmrt()) {
                        C17180ext c17180ext11 = this.this$0.djBIcL;
                        if (c17180ext11 != null && (c19247fxg = c17180ext11.AhwBna) != null) {
                            final C19012ftJ c19012ftJ3 = this.this$0;
                            c19247fxg.setVisibility(0);
                            c19247fxg.EZpvd(new Function0() { // from class: o.ftZ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return TokenSearchResultFragment$addDataListener$3.AnonymousClass1.invokeSuspend$lambda$3$lambda$2(c19012ftJ3);
                                }
                            });
                        }
                        C17180ext c17180ext12 = this.this$0.djBIcL;
                        if (c17180ext12 != null && (recyclerView = c17180ext12.djBIcL) != null) {
                            recyclerView.setVisibility(8);
                        }
                        C17180ext c17180ext13 = this.this$0.djBIcL;
                        if (c17180ext13 != null && (constraintLayout = c17180ext13.copydefault) != null) {
                            constraintLayout.setVisibility(8);
                        }
                    }
                    C17180ext c17180ext14 = this.this$0.djBIcL;
                    if (c17180ext14 != null && (c55113xdn = c17180ext14.KWHzl) != null) {
                        c55113xdn.copydefault();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(C19012ftJ c19012ftJ) {
            RecyclerView recyclerView;
            C17180ext c17180ext = c19012ftJ.djBIcL;
            if (c17180ext == null || (recyclerView = c17180ext.djBIcL) == null) {
                return;
            }
            recyclerView.scrollToPosition(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$2(C19012ftJ c19012ftJ) {
            c19012ftJ.isConnected().AEQbTJ(c19012ftJ.gEmmrt);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<C18980fse> stateFlowOLrzqt = this.this$0.isConnected().OLrzqt();
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
