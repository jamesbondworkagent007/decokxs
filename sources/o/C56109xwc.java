package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56109xwc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56109xwc<T> extends MutableLiveData<T> {
    public ConcurrentHashMap<Observer<T>, Activity<T>> copydefault = new ConcurrentHashMap<>();
    public ConcurrentHashMap<Observer<T>, Observer<T>> EZpvd = new ConcurrentHashMap<>();

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        Observer<? super T> observer2 = new Observer() { // from class: o.xwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C56109xwc.AEQbTJ(observer, obj);
            }
        };
        if (!this.EZpvd.contains(observer)) {
            this.EZpvd.put(observer, observer2);
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: com.okinc.unify_trade.bridge.NonStickyForeverLiveData$observe$1
                public final /* synthetic */ C56109xwc<T> AEQbTJ;

                {
                    this.AEQbTJ = this;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                    Intrinsics.checkNotNullParameter(event, "");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.AEQbTJ.EZpvd.remove(observer);
                    }
                }
            });
        }
        super.observe(lifecycleOwner, observer2);
        copydefault(observer2);
    }

    public static final void AEQbTJ(Observer observer, java.lang.Object obj) {
        observer.onChanged(obj);
    }

    public final void KWHzl(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        OLrzqt();
        Activity<T> activity = new Activity<>(observer, new Function0() { // from class: o.xwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56109xwc.copydefault();
            }
        });
        super.observeForever(activity);
        activity.EZpvd();
        if (this.copydefault.contains(observer)) {
            return;
        }
        this.copydefault.put(observer, activity);
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        Activity<T> activity = new Activity<>(observer, null, 2, 0 == true ? 1 : 0);
        super.observeForever(activity);
        activity.EZpvd();
        if (this.copydefault.contains(observer)) {
            return;
        }
        this.copydefault.put(observer, activity);
    }

    public final void OLrzqt() {
        for (Observer<T> observer : this.copydefault.keySet()) {
            Intrinsics.checkNotNullExpressionValue(observer, "");
            Observer<T> observer2 = observer;
            Activity<T> activity = this.copydefault.get(observer2);
            if (activity != null && activity.copydefault()) {
                removeObserver(observer2);
                this.copydefault.remove(observer2);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        Activity<T> activity = this.copydefault.get(observer);
        Observer<T> observer2 = this.EZpvd.get(observer);
        if (activity != null) {
            super.removeObserver(activity);
            this.copydefault.remove(observer);
        } else if (observer2 != null) {
            super.removeObserver(observer2);
            this.EZpvd.remove(observer);
        } else {
            super.removeObserver(observer);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void copydefault(Observer<? super T> observer) {
        try {
            java.lang.reflect.Field declaredField = LiveData.class.getDeclaredField("mObservers");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.reflect.Method declaredMethod = obj.getClass().getDeclaredMethod("get", java.lang.Object.class);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(obj, observer);
            java.lang.Object value = objInvoke instanceof Map.Entry ? ((Map.Entry) objInvoke).getValue() : null;
            if (value == null) {
                throw new java.lang.NullPointerException("ObserverWrapper can not be null");
            }
            java.lang.Class<? super java.lang.Object> superclass = value.getClass().getSuperclass();
            Intrinsics.copydefault(superclass);
            java.lang.reflect.Field declaredField2 = superclass.getDeclaredField("mLastVersion");
            declaredField2.setAccessible(true);
            java.lang.reflect.Field declaredField3 = LiveData.class.getDeclaredField("mVersion");
            declaredField3.setAccessible(true);
            declaredField2.set(value, declaredField3.get(this));
            declaredField.setAccessible(false);
            declaredMethod.setAccessible(false);
            declaredField2.setAccessible(false);
            declaredField3.setAccessible(false);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o.xwc$Activity */
    public static final class Activity<T> implements Observer<T> {
        public final Function0<Unit> AEQbTJ;
        public boolean KWHzl;
        public final Observer<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd() {
            this.KWHzl = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ != null;
        }

        public Activity(@NotNull Observer<T> observer, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(observer, "");
            this.copydefault = observer;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.Observer)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r2v0 kotlin.jvm.functions.Function0))
 A[MD:(androidx.lifecycle.Observer<T>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:131) call: o.xwc.Activity.<init>(androidx.lifecycle.Observer, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ Activity(Observer observer, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(observer, (i & 2) != 0 ? null : function0);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(T t) {
            if (this.KWHzl) {
                this.copydefault.onChanged(t);
                Function0<Unit> function0 = this.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
