package o;

import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32991mny<T> implements Observer<C32989mnw<T>> {
    public final Function1<T, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32991mny(@NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onChanged(@NotNull C32989mnw<T> c32989mnw) {
        Intrinsics.checkNotNullParameter(c32989mnw, "");
        T tKWHzl = c32989mnw.KWHzl();
        if (tKWHzl != null) {
            this.AEQbTJ.invoke(tKWHzl);
        }
    }
}
