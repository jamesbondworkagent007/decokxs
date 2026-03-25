package o;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56805ySz implements InterfaceC59098zad {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(C56805ySz.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public final C56794ySo EZpvd;
    public final C56807yTa KWHzl;
    public final InterfaceC59182zcH OLrzqt;
    public final ySZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56807yTa OLrzqt() {
        return this.KWHzl;
    }

    public C56805ySz(@NotNull C56794ySo c56794ySo, @NotNull InterfaceC56840yUg interfaceC56840yUg, @NotNull ySZ ysz) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(interfaceC56840yUg, "");
        Intrinsics.checkNotNullParameter(ysz, "");
        this.EZpvd = c56794ySo;
        this.copydefault = ysz;
        this.KWHzl = new C56807yTa(c56794ySo, interfaceC56840yUg, ysz);
        this.OLrzqt = c56794ySo.EZpvd().KWHzl(new C56804ySy(this));
    }

    public final InterfaceC59098zad[] KWHzl() {
        return (InterfaceC59098zad[]) C59183zcI.AEQbTJ(this.OLrzqt, this, AEQbTJ[0]);
    }

    public static final InterfaceC59098zad[] AEQbTJ(C56805ySz c56805ySz) {
        java.util.Collection<InterfaceC56893yWf> collectionValues = c56805ySz.copydefault.AhwBna().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            InterfaceC59098zad interfaceC59098zadEZpvd = c56805ySz.EZpvd.copydefault().KWHzl().EZpvd(c56805ySz.copydefault, (InterfaceC56893yWf) it.next());
            if (interfaceC59098zadEZpvd != null) {
                arrayList.add(interfaceC59098zadEZpvd);
            }
        }
        return (InterfaceC59098zad[]) C59424zgl.KWHzl(arrayList).toArray(new InterfaceC59098zad[0]);
    }

    @Override // o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        OLrzqt(c56935yXu, yqv);
        InterfaceC56658yNn interfaceC56658yNnKWHzl = this.KWHzl.EZpvd(c56935yXu, yqv);
        if (interfaceC56658yNnKWHzl != null) {
            return interfaceC56658yNnKWHzl;
        }
        InterfaceC56663yNs interfaceC56663yNs = null;
        for (InterfaceC59098zad interfaceC59098zad : KWHzl()) {
            InterfaceC56663yNs interfaceC56663yNsEZpvd = interfaceC59098zad.EZpvd(c56935yXu, yqv);
            if (interfaceC56663yNsEZpvd != null) {
                if (!(interfaceC56663yNsEZpvd instanceof InterfaceC56659yNo) || !((yNJ) interfaceC56663yNsEZpvd).zLjUOn()) {
                    return interfaceC56663yNsEZpvd;
                }
                if (interfaceC56663yNs == null) {
                    interfaceC56663yNs = interfaceC56663yNsEZpvd;
                }
            }
        }
        return interfaceC56663yNs;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        OLrzqt(c56935yXu, yqv);
        C56807yTa c56807yTa = this.KWHzl;
        InterfaceC59098zad[] interfaceC59098zadArrKWHzl = KWHzl();
        java.util.Collection<? extends InterfaceC56676yOe> collectionCopydefault = c56807yTa.copydefault(c56935yXu, yqv);
        int length = interfaceC59098zadArrKWHzl.length;
        int i = 0;
        java.util.Collection collection = collectionCopydefault;
        while (i < length) {
            java.util.Collection collectionCopydefault2 = C59424zgl.copydefault(collection, interfaceC59098zadArrKWHzl[i].copydefault(c56935yXu, yqv));
            i++;
            collection = collectionCopydefault2;
        }
        return collection == null ? yEE.copydefault() : collection;
    }

    @Override // o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        OLrzqt(c56935yXu, yqv);
        C56807yTa c56807yTa = this.KWHzl;
        InterfaceC59098zad[] interfaceC59098zadArrKWHzl = KWHzl();
        java.util.Collection<? extends InterfaceC56687yOp> collectionAEQbTJ = c56807yTa.AEQbTJ(c56935yXu, yqv);
        int length = interfaceC59098zadArrKWHzl.length;
        int i = 0;
        java.util.Collection collection = collectionAEQbTJ;
        while (i < length) {
            java.util.Collection collectionCopydefault = C59424zgl.copydefault(collection, interfaceC59098zadArrKWHzl[i].AEQbTJ(c56935yXu, yqv));
            i++;
            collection = collectionCopydefault;
        }
        return collection == null ? yEE.copydefault() : collection;
    }

    @Override // o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C56807yTa c56807yTa = this.KWHzl;
        InterfaceC59098zad[] interfaceC59098zadArrKWHzl = KWHzl();
        java.util.Collection<InterfaceC56665yNu> collectionCopydefault = c56807yTa.copydefault(yzu, function1);
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArrKWHzl) {
            collectionCopydefault = C59424zgl.copydefault(collectionCopydefault, interfaceC59098zad.copydefault(yzu, function1));
        }
        return collectionCopydefault == null ? yEE.copydefault() : collectionCopydefault;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        InterfaceC59098zad[] interfaceC59098zadArrKWHzl = KWHzl();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArrKWHzl) {
            C56406yEe.KWHzl(linkedHashSet, interfaceC59098zad.AEQbTJ());
        }
        linkedHashSet.addAll(this.KWHzl.AEQbTJ());
        return linkedHashSet;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        InterfaceC59098zad[] interfaceC59098zadArrKWHzl = KWHzl();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArrKWHzl) {
            C56406yEe.KWHzl(linkedHashSet, interfaceC59098zad.bP_());
        }
        linkedHashSet.addAll(this.KWHzl.bP_());
        return linkedHashSet;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        java.util.Set<C56935yXu> setCopydefault = C59102zah.copydefault(yDV.uzCIH(KWHzl()));
        if (setCopydefault == null) {
            return null;
        }
        setCopydefault.addAll(this.KWHzl.EZpvd());
        return setCopydefault;
    }

    @Override // o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        yQU.KWHzl(this.EZpvd.copydefault().DbNXlk(), yqv, this.copydefault, c56935yXu);
    }

    public java.lang.String toString() {
        return "scope for " + this.copydefault;
    }
}
