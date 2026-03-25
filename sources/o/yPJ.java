package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.yZT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPJ extends AbstractC59100zaf {
    public final C56933yXs AEQbTJ;
    public final yNP copydefault;

    public yPJ(@NotNull yNP ynp, @NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        this.copydefault = ynp;
        this.AEQbTJ = c56933yXs;
    }

    public final yNY copydefault(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (c56935yXu.OLrzqt()) {
            return null;
        }
        yNY ynyCopydefault = this.copydefault.copydefault(this.AEQbTJ.KWHzl(c56935yXu));
        if (ynyCopydefault.AhwBna()) {
            return null;
        }
        return ynyCopydefault;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!yzu.EZpvd(yZU.AYXKKw.copydefault())) {
            return yDY.AhwBna();
        }
        if (this.AEQbTJ.AEQbTJ() && yzu.djBIcL().contains(yZT.Activity.OLrzqt)) {
            return yDY.AhwBna();
        }
        java.util.Collection<C56933yXs> collectionOLrzqt = this.copydefault.OLrzqt(this.AEQbTJ, function1);
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionOLrzqt.size());
        java.util.Iterator<C56933yXs> it = collectionOLrzqt.iterator();
        while (it.hasNext()) {
            C56935yXu c56935yXuOLrzqt = it.next().OLrzqt();
            if (function1.invoke(c56935yXuOLrzqt).booleanValue()) {
                C59433zgu.EZpvd(arrayList, copydefault(c56935yXuOLrzqt));
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return yEE.copydefault();
    }

    public java.lang.String toString() {
        return "subpackages of " + this.AEQbTJ + " from " + this.copydefault;
    }
}
