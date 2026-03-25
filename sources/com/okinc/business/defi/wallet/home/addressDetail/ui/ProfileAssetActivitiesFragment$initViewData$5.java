package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C13754dXa;
import o.C15905eZq;
import o.C16644enn;
import o.C33064mpR;
import o.C33070mpX;
import o.C43453rpa;
import o.C55173xeu;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.eWM;
import o.eWS;
import o.eXQ;
import o.pUU;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileAssetActivitiesFragment$initViewData$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eXQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetActivitiesFragment$initViewData$5(eXQ exq, Continuation<? super ProfileAssetActivitiesFragment$initViewData$5> continuation) {
        super(2, continuation);
        this.this$0 = exq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetActivitiesFragment$initViewData$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetActivitiesFragment$initViewData$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ eXQ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eXQ exq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = exq;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowFlowCombine = FlowKt.flowCombine(this.this$0.EZpvd().copydefault(), this.this$0.AYXKKw().gEmmrt(), new C02781(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowCombine, anonymousClass2, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$5$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02781 extends SuspendLambda implements yHO<Pair<? extends Boolean, ? extends List<? extends eWM>>, eWS, Continuation<? super Pair<? extends Boolean, ? extends List<? extends eWM>>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C02781(Continuation<? super C02781> continuation) {
                super(3, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Boolean, ? extends List<? extends eWM>> pair, eWS ews, Continuation<? super Pair<? extends Boolean, ? extends List<? extends eWM>>> continuation) {
                return invoke2((Pair<Boolean, ? extends List<eWM>>) pair, ews, (Continuation<? super Pair<Boolean, ? extends List<eWM>>>) continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Pair<Boolean, ? extends List<eWM>> pair, eWS ews, Continuation<? super Pair<Boolean, ? extends List<eWM>>> continuation) {
                C02781 c02781 = new C02781(continuation);
                c02781.L$0 = pair;
                c02781.L$1 = ews;
                return c02781.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ArrayList arrayList;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Pair pair = (Pair) this.L$0;
                    eWS ews = (eWS) this.L$1;
                    boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                    List<eWM> list = (List) pair.component2();
                    if (list != null) {
                        arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (eWM ewm : list) {
                            ewm.OLrzqt(ews.AEQbTJ());
                            arrayList.add(ewm);
                        }
                    } else {
                        arrayList = null;
                    }
                    return C56390yDp.OLrzqt(C56443yFo.KWHzl(zBooleanValue), arrayList);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetActivitiesFragment$initViewData$5$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends List<? extends eWM>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ eXQ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(eXQ exq, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = exq;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Boolean, ? extends List<? extends eWM>> pair, Continuation<? super Unit> continuation) {
                return invoke2((Pair<Boolean, ? extends List<eWM>>) pair, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Pair<Boolean, ? extends List<eWM>> pair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Pair pair = (Pair) this.L$0;
                    boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                    List list = (List) pair.component2();
                    C16644enn c16644enn = this.this$0.isConnected;
                    if (c16644enn == null) {
                        Intrinsics.gEmmrt("");
                        c16644enn = null;
                    }
                    final eXQ exq = this.this$0;
                    c16644enn.EZpvd.AEQbTJ();
                    c16644enn.EZpvd.valueOf();
                    if (!zBooleanValue) {
                        if (list == null) {
                            C55173xeu c55173xeu = c16644enn.AEQbTJ;
                            c55173xeu.setVisibility(0);
                            c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske));
                            c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                            C43453rpa c43453rpa = C43453rpa.AEQbTJ;
                            Context context = c16644enn.AEQbTJ.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            if (c43453rpa.KWHzl(context)) {
                                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow));
                                c55173xeu.setEmptyTypeImage(9);
                            } else {
                                c55173xeu.setEmptyTypeImage(8);
                                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.R));
                            }
                            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eXU
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    eXQ.loadData$default(exq, false, false, 3, null);
                                }
                            });
                            c16644enn.EZpvd.setVisibility(8);
                            c16644enn.EZpvd.AhwBna(false);
                            rVN.reportFullyDrawn$default((Fragment) exq, false, (String) null, 2, (Object) null);
                        } else if (list.isEmpty()) {
                            C55173xeu c55173xeu2 = c16644enn.AEQbTJ;
                            c55173xeu2.setVisibility(0);
                            c55173xeu2.setTitle("");
                            c55173xeu2.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onOptionsItemSelected));
                            c55173xeu2.setEmptyTypeImage(7);
                            c55173xeu2.setRetry("");
                            c16644enn.EZpvd.setVisibility(8);
                            c16644enn.EZpvd.AhwBna(false);
                            rVN.reportFullyDrawn$default((Fragment) exq, true, (String) null, 2, (Object) null);
                        } else {
                            c16644enn.AEQbTJ.setVisibility(8);
                            c16644enn.EZpvd.setVisibility(0);
                            C33064mpR.OLrzqt(exq.DbNXlk, (List<? extends Object>) CollectionsKt___CollectionsKt.djBIcL((Collection) C56402yEa.EZpvd(C15905eZq.copydefault), (Iterable) list));
                            c16644enn.AYXKKw.scrollToPosition(0);
                            rVN.reportFullyDrawn$default((Fragment) exq, true, (String) null, 2, (Object) null);
                        }
                        c16644enn.copydefault.copydefault();
                        c16644enn.copydefault.setVisibility(8);
                    } else if (list == null) {
                        pUU.copydefault(exq.getTAG(), "activitiesList is null");
                        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackMessenger), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    } else if (!list.isEmpty()) {
                        C33064mpR.AEQbTJ(exq.DbNXlk, list);
                    } else {
                        pUU.copydefault(exq.getTAG(), "activitiesList is empty");
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            eXQ exq = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(exq, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(exq, state, anonymousClass1, this) == objCopydefault) {
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
