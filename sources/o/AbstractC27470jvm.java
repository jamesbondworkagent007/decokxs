package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC27470jvm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27470jvm extends C59534zip {
    public final AsyncListDiffer<InterfaceC27436jvE> EZpvd = new AsyncListDiffer<>(this, C27474jvq.copydefault);

    public AbstractC27470jvm() {
        register(C27433jvB.class, new C27435jvD());
        register(C27437jvF.class, new C27434jvC());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jvm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(AbstractC27470jvm abstractC27470jvm, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        abstractC27470jvm.EZpvd(list, function0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, o.jvm$TaskDescription] */
    public final void EZpvd(@NotNull java.util.List<? extends InterfaceC27436jvE> list, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        if (function0 != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            ?? taskDescription = new TaskDescription(booleanRef, this, handler, function0);
            objectRef.element = taskDescription;
            registerAdapterDataObserver((RecyclerView.AdapterDataObserver) taskDescription);
            this.EZpvd.submitList(list, new java.lang.Runnable() { // from class: o.jvp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.AEQbTJ(this.EZpvd, handler, booleanRef, objectRef, function0);
                }
            });
            return;
        }
        this.EZpvd.submitList(list, new java.lang.Runnable() { // from class: o.jvu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC27470jvm.copydefault(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.jvm$TaskDescription */
    public static final class TaskDescription extends RecyclerView.AdapterDataObserver {
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;
        public final /* synthetic */ AbstractC27470jvm OLrzqt;
        public final /* synthetic */ android.os.Handler copydefault;

        public TaskDescription(Ref.BooleanRef booleanRef, AbstractC27470jvm abstractC27470jvm, android.os.Handler handler, Function0<Unit> function0) {
            this.EZpvd = booleanRef;
            this.OLrzqt = abstractC27470jvm;
            this.copydefault = handler;
            this.KWHzl = function0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            this.EZpvd.element = true;
            this.OLrzqt.unregisterAdapterDataObserver(this);
            final android.os.Handler handler = this.copydefault;
            final Function0<Unit> function0 = this.KWHzl;
            handler.post(new java.lang.Runnable() { // from class: o.jvz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.AYXKKw(handler, function0);
                }
            });
        }

        public static final void AYXKKw(android.os.Handler handler, final Function0 function0) {
            handler.post(new java.lang.Runnable() { // from class: o.jvx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.AhwBna(function0);
                }
            });
        }

        public static final void AhwBna(Function0 function0) {
            function0.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            this.EZpvd.element = true;
            this.OLrzqt.unregisterAdapterDataObserver(this);
            final android.os.Handler handler = this.copydefault;
            final Function0<Unit> function0 = this.KWHzl;
            handler.post(new java.lang.Runnable() { // from class: o.jvv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.valueOf(handler, function0);
                }
            });
        }

        public static final void valueOf(android.os.Handler handler, final Function0 function0) {
            handler.post(new java.lang.Runnable() { // from class: o.jvr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.AYXKKw(function0);
                }
            });
        }

        public static final void AYXKKw(Function0 function0) {
            function0.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            this.EZpvd.element = true;
            this.OLrzqt.unregisterAdapterDataObserver(this);
            final android.os.Handler handler = this.copydefault;
            final Function0<Unit> function0 = this.KWHzl;
            handler.post(new java.lang.Runnable() { // from class: o.jvA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.AhwBna(handler, function0);
                }
            });
        }

        public static final void AhwBna(android.os.Handler handler, final Function0 function0) {
            handler.post(new java.lang.Runnable() { // from class: o.jvt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.valueOf(function0);
                }
            });
        }

        public static final void valueOf(Function0 function0) {
            function0.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.EZpvd.element = true;
            this.OLrzqt.unregisterAdapterDataObserver(this);
            final android.os.Handler handler = this.copydefault;
            final Function0<Unit> function0 = this.KWHzl;
            handler.post(new java.lang.Runnable() { // from class: o.jvw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.KWHzl(handler, function0);
                }
            });
        }

        public static final void KWHzl(android.os.Handler handler, final Function0 function0) {
            handler.post(new java.lang.Runnable() { // from class: o.jvy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC27470jvm.TaskDescription.KWHzl(function0);
                }
            });
        }

        public static final void KWHzl(Function0 function0) {
            function0.invoke();
        }
    }

    public static final void AEQbTJ(final AbstractC27470jvm abstractC27470jvm, final android.os.Handler handler, final Ref.BooleanRef booleanRef, final Ref.ObjectRef objectRef, final Function0 function0) {
        super.setItems(abstractC27470jvm.EZpvd.getCurrentList());
        handler.post(new java.lang.Runnable() { // from class: o.jvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC27470jvm.EZpvd(handler, booleanRef, abstractC27470jvm, objectRef, function0);
            }
        });
    }

    public static final void EZpvd(android.os.Handler handler, final Ref.BooleanRef booleanRef, final AbstractC27470jvm abstractC27470jvm, final Ref.ObjectRef objectRef, final Function0 function0) {
        handler.post(new java.lang.Runnable() { // from class: o.jvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC27470jvm.EZpvd(booleanRef, abstractC27470jvm, objectRef, function0);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(Ref.BooleanRef booleanRef, AbstractC27470jvm abstractC27470jvm, Ref.ObjectRef objectRef, Function0 function0) {
        if (booleanRef.element) {
            return;
        }
        abstractC27470jvm.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) objectRef.element);
        function0.invoke();
    }

    public static final void copydefault(AbstractC27470jvm abstractC27470jvm) {
        super.setItems(abstractC27470jvm.EZpvd.getCurrentList());
    }

    public final void KWHzl(int i, @NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        java.util.List<InterfaceC27436jvE> currentList = this.EZpvd.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) currentList);
        if (i >= listFJNWhG.size() || i < 0) {
            pUU.copydefault("updateItem: position out of bound");
            return;
        }
        listFJNWhG.set(i, interfaceC27436jvE);
        setItems(listFJNWhG);
        notifyItemChanged(i);
    }

    public static /* synthetic */ void insertAndUpdate$default(AbstractC27470jvm abstractC27470jvm, int i, java.util.List list, java.lang.Integer num, InterfaceC27436jvE interfaceC27436jvE, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertAndUpdate");
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC27436jvE = null;
        }
        abstractC27470jvm.copydefault(i, list, num, interfaceC27436jvE);
    }

    public final void copydefault(int i, @NotNull java.util.List<? extends InterfaceC27436jvE> list, java.lang.Integer num, InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<InterfaceC27436jvE> currentList = this.EZpvd.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) currentList);
        if (i > listFJNWhG.size() || i < 0) {
            pUU.copydefault("updateRange: startPosition out of bound");
            return;
        }
        if (i == listFJNWhG.size()) {
            listFJNWhG.addAll(list);
        } else {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = i + i2;
                if (i3 < listFJNWhG.size()) {
                    listFJNWhG.add(i3, list.get(i2));
                } else {
                    listFJNWhG.add(list.get(i2));
                }
            }
        }
        if (num != null && interfaceC27436jvE != null && num.intValue() >= 0 && num.intValue() < listFJNWhG.size()) {
            listFJNWhG.set(num.intValue(), interfaceC27436jvE);
        }
        setData$default(this, listFJNWhG, null, 2, null);
    }

    public static /* synthetic */ void removeRangeAndUpdate$default(AbstractC27470jvm abstractC27470jvm, int i, int i2, java.lang.Integer num, InterfaceC27436jvE interfaceC27436jvE, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeRangeAndUpdate");
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            interfaceC27436jvE = null;
        }
        abstractC27470jvm.OLrzqt(i, i2, num, interfaceC27436jvE);
    }

    public final void OLrzqt(int i, int i2, java.lang.Integer num, InterfaceC27436jvE interfaceC27436jvE) {
        java.util.List<InterfaceC27436jvE> currentList = this.EZpvd.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) currentList);
        if (i >= listFJNWhG.size() || i < 0 || i + i2 > listFJNWhG.size()) {
            pUU.copydefault("removeRange: position out of bound");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            listFJNWhG.remove(i);
        }
        if (num != null && interfaceC27436jvE != null && num.intValue() > -1 && num.intValue() < listFJNWhG.size()) {
            listFJNWhG.set(num.intValue(), interfaceC27436jvE);
        }
        setData$default(this, listFJNWhG, null, 2, null);
    }
}
