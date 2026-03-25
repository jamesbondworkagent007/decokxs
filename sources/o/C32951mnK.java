package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32951mnK<T> implements Observer<T> {
    public final Function1<T, Unit> KWHzl;
    public final LiveData<T> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32951mnK(@NotNull LiveData<T> liveData, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = liveData;
        this.KWHzl = function1;
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(T t) {
        this.OLrzqt.removeObserver(this);
        this.KWHzl.invoke(t);
    }
}
