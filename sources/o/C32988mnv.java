package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32988mnv<T> implements Observer<T> {
    public final T KWHzl;
    public final Function1<T, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32988mnv(@NotNull LiveData<T> liveData, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        this.KWHzl = liveData.getValue();
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(T t) {
        if (Intrinsics.EZpvd(this.KWHzl, t)) {
            return;
        }
        this.copydefault.invoke(t);
    }
}
