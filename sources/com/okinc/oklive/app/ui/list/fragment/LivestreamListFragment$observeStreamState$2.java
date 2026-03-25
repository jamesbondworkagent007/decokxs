package com.okinc.oklive.app.ui.list.fragment;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC44569sUu;
import o.AbstractC44574sUz;
import o.C44573sUy;
import o.C56391yDq;
import o.C56442yFn;
import o.sWg;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamListFragment$observeStreamState$2 extends SuspendLambda implements Function2<AbstractC44574sUz, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<AbstractC44574sUz> $prevState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44573sUy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListFragment$observeStreamState$2(C44573sUy c44573sUy, Ref.ObjectRef<AbstractC44574sUz> objectRef, Continuation<? super LivestreamListFragment$observeStreamState$2> continuation) {
        super(2, continuation);
        this.this$0 = c44573sUy;
        this.$prevState = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamListFragment$observeStreamState$2 livestreamListFragment$observeStreamState$2 = new LivestreamListFragment$observeStreamState$2(this.this$0, this.$prevState, continuation);
        livestreamListFragment$observeStreamState$2.L$0 = obj;
        return livestreamListFragment$observeStreamState$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC44574sUz abstractC44574sUz, Continuation<? super Unit> continuation) {
        return ((LivestreamListFragment$observeStreamState$2) create(abstractC44574sUz, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object, o.sUz] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RecyclerView recyclerView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ?? r5 = (AbstractC44574sUz) this.L$0;
            if (Intrinsics.EZpvd((Object) r5, AbstractC44574sUz.StateListAnimator.EZpvd)) {
                this.this$0.fetchVPNInfo();
                sWg swgAEQbTJ = this.this$0.AEQbTJ();
                if (swgAEQbTJ != null && (recyclerView = swgAEQbTJ.EZpvd) != null) {
                    this.this$0.OLrzqt().AEQbTJ(recyclerView);
                }
            } else if (Intrinsics.EZpvd((Object) r5, AbstractC44574sUz.Dialog.OLrzqt) && (this.$prevState.element instanceof AbstractC44574sUz.StateListAnimator)) {
                List<AbstractC44569sUu> currentList = this.this$0.OLrzqt().getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : currentList) {
                    if (obj2 instanceof AbstractC44569sUu.Activity) {
                        arrayList.add(obj2);
                    }
                }
                AbstractC44569sUu.Activity activity = (AbstractC44569sUu.Activity) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (activity != null) {
                    this.this$0.KWHzl(activity.OLrzqt());
                }
            }
            this.$prevState.element = r5;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
