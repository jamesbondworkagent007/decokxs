package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59096zab extends AbstractC59100zaf {
    public final InterfaceC59098zad AEQbTJ;

    public C59096zab(@NotNull InterfaceC59098zad interfaceC59098zad) {
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        this.AEQbTJ = interfaceC59098zad;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public /* synthetic */ java.util.Collection copydefault(yZU yzu, Function1 function1) {
        return OLrzqt(yzu, (Function1<? super C56935yXu, java.lang.Boolean>) function1);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        InterfaceC56663yNs interfaceC56663yNsEZpvd = this.AEQbTJ.EZpvd(c56935yXu, yqv);
        if (interfaceC56663yNsEZpvd == null) {
            return null;
        }
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsEZpvd : null;
        if (interfaceC56658yNn != null) {
            return interfaceC56658yNn;
        }
        if (interfaceC56663yNsEZpvd instanceof InterfaceC56690yOs) {
            return (InterfaceC56690yOs) interfaceC56663yNsEZpvd;
        }
        return null;
    }

    public java.util.List<InterfaceC56663yNs> OLrzqt(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        yZU yzuOLrzqt = yzu.OLrzqt(yZU.AYXKKw.OLrzqt());
        if (yzuOLrzqt == null) {
            return yDY.AhwBna();
        }
        java.util.Collection<InterfaceC56665yNu> collectionCopydefault = this.AEQbTJ.copydefault(yzuOLrzqt, function1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionCopydefault) {
            if (obj instanceof InterfaceC56659yNo) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        return this.AEQbTJ.AEQbTJ();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        return this.AEQbTJ.bP_();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return this.AEQbTJ.EZpvd();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        this.AEQbTJ.OLrzqt(c56935yXu, yqv);
    }

    public java.lang.String toString() {
        return "Classes from " + this.AEQbTJ;
    }
}
