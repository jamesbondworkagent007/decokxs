package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32941mnA<T> extends MutableLiveData<T> {
    public final AtomicInteger copydefault = new AtomicInteger(0);

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        this.copydefault.getAndIncrement();
        super.postValue(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.copydefault.getAndIncrement();
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        super.observe(lifecycleOwner, new TaskDescription(this, this.copydefault.get(), observer));
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "");
        super.observeForever(new TaskDescription(this, this.copydefault.get(), observer));
    }

    /* JADX INFO: renamed from: o.mnA$TaskDescription */
    public final class TaskDescription implements Observer<T> {
        public final /* synthetic */ C32941mnA<T> AEQbTJ;
        public final int KWHzl;
        public final Observer<? super T> copydefault;

        public TaskDescription(C32941mnA c32941mnA, @NotNull int i, Observer<? super T> observer) {
            Intrinsics.checkNotNullParameter(observer, "");
            this.AEQbTJ = c32941mnA;
            this.KWHzl = i;
            this.copydefault = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(T t) {
            if (this.AEQbTJ.copydefault.get() > this.KWHzl) {
                this.copydefault.onChanged(t);
            }
        }
    }
}
