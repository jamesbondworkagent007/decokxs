package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.C56111xwe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56111xwe<T> extends MutableLiveData<T> {
    public static final int AEQbTJ = 8;
    public ConcurrentHashMap<Observer<T>, Observer<T>> OLrzqt = new ConcurrentHashMap<>();

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        Observer<? super T> observer2 = new Observer() { // from class: o.xwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C56111xwe.EZpvd(observer, obj);
            }
        };
        if (!this.OLrzqt.contains(observer)) {
            this.OLrzqt.put(observer, observer2);
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: com.okinc.unify_trade.bridge.NonStickyLiveData$observe$1
                public final /* synthetic */ C56111xwe<T> copydefault;

                {
                    this.copydefault = this;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                    Intrinsics.checkNotNullParameter(event, "");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ConcurrentHashMap concurrentHashMap = this.copydefault.OLrzqt;
                        Object obj = observer;
                        Intrinsics.copydefault(obj, "");
                        concurrentHashMap.remove(obj);
                    }
                }
            });
        }
        super.observe(lifecycleOwner, observer2);
        EZpvd(observer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Observer observer, java.lang.Object obj) {
        observer.onChanged(obj);
    }

    private final void EZpvd(Observer<? super T> observer) {
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

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        Observer<T> observer2 = this.OLrzqt.get(observer);
        if (observer2 != null) {
            super.removeObserver(observer2);
            this.OLrzqt.remove(observer);
        } else {
            super.removeObserver(observer);
        }
    }
}
