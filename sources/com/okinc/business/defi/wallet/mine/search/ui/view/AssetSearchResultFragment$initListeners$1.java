package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C18951fsB;
import o.C18965fsP;
import o.C19000fsy;
import o.C19188fwa;
import o.C33070mpX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class AssetSearchResultFragment$initListeners$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18965fsP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetSearchResultFragment$initListeners$1(C18965fsP c18965fsP, Continuation<? super AssetSearchResultFragment$initListeners$1> continuation) {
        super(2, continuation);
        this.this$0 = c18965fsP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetSearchResultFragment$initListeners$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AssetSearchResultFragment$initListeners$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.AssetSearchResultFragment$initListeners$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C18965fsP this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18965fsP c18965fsP, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18965fsP;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.AssetSearchResultFragment$initListeners$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02901 extends SuspendLambda implements Function2<C19000fsy, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C18965fsP this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02901(C18965fsP c18965fsP, Continuation<? super C02901> continuation) {
                super(2, continuation);
                this.this$0 = c18965fsP;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02901 c02901 = new C02901(this.this$0, continuation);
                c02901.L$0 = obj;
                return c02901;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C19000fsy c19000fsy, Continuation<? super Unit> continuation) {
                return ((C02901) create(c19000fsy, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C19000fsy c19000fsy = (C19000fsy) this.L$0;
                    if (c19000fsy == null) {
                        return Unit.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!this.this$0.valueOf()) {
                        arrayList.add(new C18951fsB(14.0f, 0.0f, 2, null));
                    }
                    arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gasjUx));
                    if (C33129mqd.KWHzl((Collection) c19000fsy.AEQbTJ()) && c19000fsy.AEQbTJ() != null) {
                        arrayList.addAll(c19000fsy.AEQbTJ());
                    }
                    if (C33129mqd.KWHzl((Collection) c19000fsy.OLrzqt()) && c19000fsy.OLrzqt() != null) {
                        arrayList.addAll(c19000fsy.OLrzqt());
                    }
                    if (arrayList.size() == 1) {
                        arrayList.clear();
                    }
                    if (C33129mqd.KWHzl((Collection) c19000fsy.KWHzl()) && c19000fsy.KWHzl() != null) {
                        if (!arrayList.isEmpty()) {
                            arrayList.add(new C18951fsB(14.0f, 0.0f, 2, null));
                        }
                        arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Rattr));
                        arrayList.addAll(c19000fsy.KWHzl());
                    }
                    if (C33129mqd.KWHzl((Collection) c19000fsy.copydefault()) && c19000fsy.copydefault() != null) {
                        if (!arrayList.isEmpty()) {
                            arrayList.add(new C18951fsB(14.0f, 0.0f, 2, null));
                        }
                        arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Rdrawable));
                        arrayList.addAll(c19000fsy.copydefault());
                    }
                    if (!arrayList.isEmpty()) {
                        C19188fwa.submitList$default(this.this$0.AEQbTJ(), arrayList, null, 2, null);
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
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
                StateFlow<C19000fsy> stateFlowEZpvd = this.this$0.gEmmrt().EZpvd();
                C02901 c02901 = new C02901(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowEZpvd, c02901, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18965fsP c18965fsP = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c18965fsP, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c18965fsP, state, anonymousClass1, this) == objCopydefault) {
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
