package com.okinc.okex.lite.onboarding.util;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.C59534zip;

/* JADX INFO: loaded from: classes24.dex */
public final class AdapterUtilKt$updateDataset$$inlined$updateDataset$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $areItemsTheSame;
    final /* synthetic */ List $newListData;
    final /* synthetic */ RecyclerView.Adapter $this_updateDataset;
    final /* synthetic */ C59534zip $this_updateDataset$inlined;
    final /* synthetic */ C59534zip $this_updateDataset$inlined$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterUtilKt$updateDataset$$inlined$updateDataset$2(Function2 function2, List list, RecyclerView.Adapter adapter, Continuation continuation, C59534zip c59534zip, C59534zip c59534zip2) {
        super(2, continuation);
        this.$areItemsTheSame = function2;
        this.$newListData = list;
        this.$this_updateDataset = adapter;
        this.$this_updateDataset$inlined = c59534zip;
        this.$this_updateDataset$inlined$1 = c59534zip2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdapterUtilKt$updateDataset$$inlined$updateDataset$2(this.$areItemsTheSame, this.$newListData, this.$this_updateDataset, continuation, this.$this_updateDataset$inlined, this.$this_updateDataset$inlined$1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdapterUtilKt$updateDataset$$inlined$updateDataset$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final Function2 function2 = this.$areItemsTheSame;
            final List list = this.$newListData;
            final RecyclerView.Adapter adapter = this.$this_updateDataset;
            final C59534zip c59534zip = this.$this_updateDataset$inlined;
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: com.okinc.okex.lite.onboarding.util.AdapterUtilKt$updateDataset$$inlined$updateDataset$2.5
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    return adapter.getItemCount();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i2, int i3) {
                    Object obj2 = list.get(i3);
                    if (obj2 == null) {
                        return false;
                    }
                    List<?> items = c59534zip.getItems();
                    Intrinsics.checkNotNullExpressionValue(items, "");
                    return obj2.equals(CollectionsKt___CollectionsKt.AkhnZx(items, i2));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i2, int i3) {
                    Function2 function22 = function2;
                    List<?> items = c59534zip.getItems();
                    Intrinsics.checkNotNullExpressionValue(items, "");
                    Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items, i2);
                    if (objAkhnZx == null) {
                        objAkhnZx = null;
                    }
                    return ((Boolean) function22.invoke(objAkhnZx, list.get(i3))).booleanValue();
                }
            });
            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(diffResultCalculateDiff, this.$this_updateDataset, this.$newListData, null, this.$this_updateDataset$inlined$1);
            this.label = 1;
            if (BuildersKt.withContext(immediate, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.okex.lite.onboarding.util.AdapterUtilKt$updateDataset$$inlined$updateDataset$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DiffUtil.DiffResult $diff;
        final /* synthetic */ List $newListData;
        final /* synthetic */ RecyclerView.Adapter $this_updateDataset;
        final /* synthetic */ C59534zip $this_updateDataset$inlined;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DiffUtil.DiffResult diffResult, RecyclerView.Adapter adapter, List list, Continuation continuation, C59534zip c59534zip) {
            super(2, continuation);
            this.$diff = diffResult;
            this.$this_updateDataset = adapter;
            this.$newListData = list;
            this.$this_updateDataset$inlined = c59534zip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$diff, this.$this_updateDataset, this.$newListData, continuation, this.$this_updateDataset$inlined);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.$diff.dispatchUpdatesTo(this.$this_updateDataset);
            this.$this_updateDataset$inlined.setItems(this.$newListData);
            return Unit.INSTANCE;
        }
    }
}
