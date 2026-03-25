package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yOS implements yOL {
    public final yOL AEQbTJ;
    public final Function1<C56933yXs, java.lang.Boolean> EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.yXs, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public yOS(@NotNull yOL yol, boolean z, @NotNull Function1<? super C56933yXs, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = yol;
        this.copydefault = z;
        this.EZpvd = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yOS(@NotNull yOL yol, @NotNull Function1<? super C56933yXs, java.lang.Boolean> function1) {
        this(yol, false, function1);
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // o.yOL
    public boolean copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        if (this.EZpvd.invoke(c56933yXs).booleanValue()) {
            return this.AEQbTJ.copydefault(c56933yXs);
        }
        return false;
    }

    @Override // o.yOL
    public yOJ EZpvd(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        if (this.EZpvd.invoke(c56933yXs).booleanValue()) {
            return this.AEQbTJ.EZpvd(c56933yXs);
        }
        return null;
    }

    public final boolean copydefault(yOJ yoj) {
        C56933yXs c56933yXsKWHzl = yoj.KWHzl();
        return c56933yXsKWHzl != null && this.EZpvd.invoke(c56933yXsKWHzl).booleanValue();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<yOJ> iterator() {
        yOL yol = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (yOJ yoj : yol) {
            if (copydefault(yoj)) {
                arrayList.add(yoj);
            }
        }
        return arrayList.iterator();
    }

    @Override // o.yOL
    public boolean AEQbTJ() {
        boolean z;
        yOL yol = this.AEQbTJ;
        if ((yol instanceof java.util.Collection) && ((java.util.Collection) yol).isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<yOJ> it = yol.iterator();
            while (it.hasNext()) {
                if (copydefault(it.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return this.copydefault ? !z : z;
    }
}
