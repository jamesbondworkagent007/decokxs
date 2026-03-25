package com.okinc.planet.biz_content.input;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.domain.remote.dto.ImageItem;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C47576tsi;
import o.C47793twn;
import o.C56391yDq;
import o.C56442yFn;
import o.tNJ;

/* JADX INFO: loaded from: classes19.dex */
public final class GenericInputFragment$setupImageItemsObservation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47576tsi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericInputFragment$setupImageItemsObservation$1(C47576tsi c47576tsi, Continuation<? super GenericInputFragment$setupImageItemsObservation$1> continuation) {
        super(2, continuation);
        this.this$0 = c47576tsi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputFragment$setupImageItemsObservation$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericInputFragment$setupImageItemsObservation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.input.GenericInputFragment$setupImageItemsObservation$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C47576tsi this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47576tsi c47576tsi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47576tsi;
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
                StateFlow<List<ImageItem>> stateFlowCopydefault = this.this$0.fetchVPNInfo().copydefault();
                final C47576tsi c47576tsi = this.this$0;
                FlowCollector<? super List<ImageItem>> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.input.GenericInputFragment.setupImageItemsObservation.1.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<ImageItem> list, Continuation<? super Unit> continuation) {
                        tNJ tnj = c47576tsi.KWHzl;
                        tNJ tnj2 = null;
                        if (tnj == null) {
                            Intrinsics.gEmmrt("");
                            tnj = null;
                        }
                        RecyclerView recyclerView = tnj.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                        recyclerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                        c47576tsi.isConnected.setItems(CollectionsKt___CollectionsKt.fJNWhG((Collection) list));
                        c47576tsi.isConnected.notifyDataSetChanged();
                        GenericInputParentViewModel genericInputParentViewModelIsConnected = c47576tsi.isConnected();
                        if (genericInputParentViewModelIsConnected != null) {
                            genericInputParentViewModelIsConnected.EZpvd(list);
                        }
                        GenericInputParentViewModel genericInputParentViewModelIsConnected2 = c47576tsi.isConnected();
                        C47793twn c47793twn = genericInputParentViewModelIsConnected2 instanceof C47793twn ? (C47793twn) genericInputParentViewModelIsConnected2 : null;
                        if (c47793twn != null) {
                            tNJ tnj3 = c47576tsi.KWHzl;
                            if (tnj3 == null) {
                                Intrinsics.gEmmrt("");
                                tnj3 = null;
                            }
                            c47793twn.AEQbTJ(tnj3.valueOf.values());
                        }
                        if (c47576tsi.djBIcL().AEQbTJ()) {
                            boolean z = list.size() >= c47576tsi.djBIcL().AhwBna();
                            GenericInputParentViewModel genericInputParentViewModelIsConnected3 = c47576tsi.isConnected();
                            if (genericInputParentViewModelIsConnected3 != null) {
                                genericInputParentViewModelIsConnected3.AEQbTJ(z);
                            }
                        }
                        c47576tsi.OLrzqt((List<ImageItem>) list);
                        tNJ tnj4 = c47576tsi.KWHzl;
                        if (tnj4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            tnj2 = tnj4;
                        }
                        c47576tsi.KWHzl(tnj2.valueOf.values());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
