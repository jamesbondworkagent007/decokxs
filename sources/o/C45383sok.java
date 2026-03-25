package o;

import androidx.databinding.BindingAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45383sok {
    @BindingAdapter({"appBarTitle"})
    public static final void KWHzl(@NotNull C33537myN c33537myN, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c33537myN, "");
        Intrinsics.checkNotNullParameter(str, "");
        c33537myN.setAppBarTitle(str);
    }
}
