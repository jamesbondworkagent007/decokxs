package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32942mnB {

    /* JADX INFO: renamed from: o.mnB$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public static final <X, Y> MutableLiveData<Y> OLrzqt(@NotNull LiveData<X> liveData, @NotNull final Function1<? super X, ? extends Y> function1) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new TaskDescription(new Function1() { // from class: o.mnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32942mnB.EZpvd(mediatorLiveData, function1, obj);
            }
        }));
        return mediatorLiveData;
    }

    public static final Unit EZpvd(MediatorLiveData mediatorLiveData, Function1 function1, java.lang.Object obj) {
        mediatorLiveData.setValue(function1.invoke(obj));
        return Unit.INSTANCE;
    }

    public static final <X, Y> MutableLiveData<Y> KWHzl(@NotNull LiveData<X> liveData, @NotNull final Function1<? super X, ? extends Y> function1) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new TaskDescription(new Function1() { // from class: o.mnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32942mnB.OLrzqt(mediatorLiveData, function1, obj);
            }
        }));
        return mediatorLiveData;
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, Function1 function1, java.lang.Object obj) {
        if (obj == null) {
            return Unit.INSTANCE;
        }
        mediatorLiveData.setValue(function1.invoke(obj));
        return Unit.INSTANCE;
    }

    public static final <A, B> MediatorLiveData<kotlin.Pair<A, B>> OLrzqt(@NotNull LiveData<A> liveData, @NotNull LiveData<B> liveData2) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(liveData2, "");
        final MediatorLiveData<kotlin.Pair<A, B>> mediatorLiveData = new MediatorLiveData<>();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mediatorLiveData.addSource(liveData, new TaskDescription(new Function1() { // from class: o.mnF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32942mnB.copydefault(mediatorLiveData, objectRef, objectRef2, obj);
            }
        }));
        mediatorLiveData.addSource(liveData2, new TaskDescription(new Function1() { // from class: o.mnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32942mnB.KWHzl(mediatorLiveData, objectRef2, objectRef, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.Object obj) {
        if (obj == 0 && mediatorLiveData.getValue() != 0) {
            mediatorLiveData.setValue(null);
        }
        objectRef.element = obj;
        if (obj != 0 && objectRef2.element != 0) {
            Intrinsics.copydefault(obj);
            T t = objectRef2.element;
            Intrinsics.copydefault(t);
            mediatorLiveData.setValue(C56390yDp.OLrzqt(obj, t));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.Object obj) {
        if (obj == 0 && mediatorLiveData.getValue() != 0) {
            mediatorLiveData.setValue(null);
        }
        objectRef.element = obj;
        T t = objectRef2.element;
        if (t != 0 && obj != 0) {
            Intrinsics.copydefault(t);
            T t2 = objectRef.element;
            Intrinsics.copydefault(t2);
            mediatorLiveData.setValue(C56390yDp.OLrzqt(t, t2));
        }
        return Unit.INSTANCE;
    }

    public static final <A, B, C> Triple<A, B, C> EZpvd(Triple<? extends A, ? extends B, ? extends C> triple, A a2) {
        if (triple == null) {
            return new Triple<>(a2, null, null);
        }
        return Triple.copy$default(triple, a2, null, null, 6, null);
    }

    public static final <B, A, C> Triple<A, B, C> copydefault(Triple<? extends A, ? extends B, ? extends C> triple, B b) {
        if (triple == null) {
            return new Triple<>(null, b, null);
        }
        return Triple.copy$default(triple, null, b, null, 5, null);
    }

    public static final <C, A, B> Triple<A, B, C> KWHzl(Triple<? extends A, ? extends B, ? extends C> triple, C c) {
        if (triple == null) {
            return new Triple<>(null, null, c);
        }
        return Triple.copy$default(triple, null, null, c, 3, null);
    }

    public static final <A, B, C> LiveData<Triple<A, B, C>> OLrzqt(@NotNull LiveData<A> liveData, @NotNull LiveData<B> liveData2, @NotNull LiveData<C> liveData3) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(liveData2, "");
        Intrinsics.checkNotNullParameter(liveData3, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new TaskDescription(new Function1() { // from class: o.mnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32942mnB.KWHzl(mediatorLiveData, obj);
            }
        }));
        mediatorLiveData.addSource(liveData2, new TaskDescription(new Function1() { // from class: o.mnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32942mnB.EZpvd(mediatorLiveData, obj);
            }
        }));
        mediatorLiveData.addSource(liveData3, new TaskDescription(new Function1() { // from class: o.mnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32942mnB.djBIcL(mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, java.lang.Object obj) {
        mediatorLiveData.setValue(EZpvd((Triple<? extends java.lang.Object, ? extends B, ? extends C>) mediatorLiveData.getValue(), obj));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(MediatorLiveData mediatorLiveData, java.lang.Object obj) {
        mediatorLiveData.setValue(copydefault((Triple<? extends A, ? extends java.lang.Object, ? extends C>) mediatorLiveData.getValue(), obj));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(MediatorLiveData mediatorLiveData, java.lang.Object obj) {
        mediatorLiveData.setValue(KWHzl((Triple<? extends A, ? extends B, ? extends java.lang.Object>) mediatorLiveData.getValue(), obj));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void addOneShotObserver$default(LiveData liveData, LifecycleOwner lifecycleOwner, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        copydefault(liveData, lifecycleOwner, function1);
    }

    public static final <T> void copydefault(@NotNull LiveData<T> liveData, LifecycleOwner lifecycleOwner, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (lifecycleOwner == null) {
            liveData.observeForever(new C32951mnK(liveData, function1));
        } else {
            liveData.observe(lifecycleOwner, new C32951mnK(liveData, function1));
        }
    }

    public static /* synthetic */ void addIgnoreCurrentValueObserver$default(LiveData liveData, LifecycleOwner lifecycleOwner, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        EZpvd(liveData, lifecycleOwner, function1);
    }

    public static final <T> void EZpvd(@NotNull LiveData<T> liveData, LifecycleOwner lifecycleOwner, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (lifecycleOwner == null) {
            liveData.observeForever(new C32988mnv(liveData, function1));
        } else {
            liveData.observe(lifecycleOwner, new C32988mnv(liveData, function1));
        }
    }
}
