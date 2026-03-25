package com.okinc.okex.lite.onboarding.util;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.C56518yIi;

/* JADX INFO: loaded from: classes24.dex */
public final class AdapterUtilKt$updateDataset$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<E, E, Boolean> $areItemsTheSame;
    final /* synthetic */ Function0<List<?>> $getItems;
    final /* synthetic */ List<E> $newListData;
    final /* synthetic */ Function1<List<? extends E>, Unit> $setItems;
    final /* synthetic */ RecyclerView.Adapter<VH> $this_updateDataset;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super E, ? super E, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.List<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends E> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<? extends E>, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdapterUtilKt$updateDataset$8(Function2<? super E, ? super E, Boolean> function2, Function0<? extends List<?>> function0, List<? extends E> list, RecyclerView.Adapter<VH> adapter, Function1<? super List<? extends E>, Unit> function1, Continuation<? super AdapterUtilKt$updateDataset$8> continuation) {
        super(2, continuation);
        this.$areItemsTheSame = function2;
        this.$getItems = function0;
        this.$newListData = list;
        this.$this_updateDataset = adapter;
        this.$setItems = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdapterUtilKt$updateDataset$8(this.$areItemsTheSame, this.$getItems, this.$newListData, this.$this_updateDataset, this.$setItems, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdapterUtilKt$updateDataset$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new TaskDescription(this.$areItemsTheSame, this.$getItems, this.$newListData, this.$this_updateDataset));
            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(diffResultCalculateDiff, this.$this_updateDataset, this.$setItems, this.$newListData, null);
            this.label = 1;
            if (BuildersKt.withContext(immediate, anonymousClass1, this) == objCopydefault) {
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

    public static final class TaskDescription extends DiffUtil.Callback {
        public final /* synthetic */ List<E> AEQbTJ;
        public final /* synthetic */ Function0<List<?>> KWHzl;
        public final /* synthetic */ RecyclerView.Adapter<VH> OLrzqt;
        public final /* synthetic */ Function2<E, E, Boolean> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super E, ? super E, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.List<?>> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function2<? super E, ? super E, Boolean> function2, Function0<? extends List<?>> function0, List<? extends E> list, RecyclerView.Adapter<VH> adapter) {
            this.copydefault = function2;
            this.KWHzl = function0;
            this.AEQbTJ = list;
            this.OLrzqt = adapter;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            Function2<E, E, Boolean> function2 = this.copydefault;
            Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl.invoke(), i);
            if (objAkhnZx == null) {
                objAkhnZx = null;
            }
            return function2.invoke((E) objAkhnZx, (E) this.AEQbTJ.get(i2)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.OLrzqt.getItemCount();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.AEQbTJ.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            Object obj = this.AEQbTJ.get(i2);
            if (obj != null) {
                return obj.equals(CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl.invoke(), i));
            }
            return false;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new TaskDescription(this.$areItemsTheSame, this.$getItems, this.$newListData, this.$this_updateDataset));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(diffResultCalculateDiff, this.$this_updateDataset, this.$setItems, this.$newListData, null);
        C56518yIi.AEQbTJ(0);
        BuildersKt.withContext(immediate, anonymousClass1, this);
        C56518yIi.AEQbTJ(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.okex.lite.onboarding.util.AdapterUtilKt$updateDataset$8$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DiffUtil.DiffResult $diff;
        final /* synthetic */ List<E> $newListData;
        final /* synthetic */ Function1<List<? extends E>, Unit> $setItems;
        final /* synthetic */ RecyclerView.Adapter<VH> $this_updateDataset;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<? extends E>, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends E> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(DiffUtil.DiffResult diffResult, RecyclerView.Adapter<VH> adapter, Function1<? super List<? extends E>, Unit> function1, List<? extends E> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$diff = diffResult;
            this.$this_updateDataset = adapter;
            this.$setItems = function1;
            this.$newListData = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$diff, this.$this_updateDataset, this.$setItems, this.$newListData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$diff.dispatchUpdatesTo(this.$this_updateDataset);
                this.$setItems.invoke(this.$newListData);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            this.$diff.dispatchUpdatesTo(this.$this_updateDataset);
            this.$setItems.invoke(this.$newListData);
            return Unit.INSTANCE;
        }
    }
}
