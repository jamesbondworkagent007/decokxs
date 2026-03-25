package o;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZW implements InterfaceC59098zad {
    public static final Activity OLrzqt = new Activity(null);
    public final InterfaceC59098zad[] EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 o.zad[]) A[MD:(java.lang.String, o.zad[]):void (m)] call: o.yZW.<init>(java.lang.String, o.zad[]):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ yZW(java.lang.String str, InterfaceC59098zad[] interfaceC59098zadArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC59098zadArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.copydefault;
    }

    public yZW(java.lang.String str, InterfaceC59098zad[] interfaceC59098zadArr) {
        this.copydefault = str;
        this.EZpvd = interfaceC59098zadArr;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        InterfaceC59098zad[] interfaceC59098zadArr = this.EZpvd;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArr) {
            C56406yEe.KWHzl(linkedHashSet, interfaceC59098zad.AEQbTJ());
        }
        return linkedHashSet;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        InterfaceC59098zad[] interfaceC59098zadArr = this.EZpvd;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArr) {
            C56406yEe.KWHzl(linkedHashSet, interfaceC59098zad.bP_());
        }
        return linkedHashSet;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return C59102zah.copydefault(yDV.uzCIH(this.EZpvd));
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yZW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final InterfaceC59098zad AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.Iterable<? extends InterfaceC59098zad> iterable) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iterable, "");
            C59387zgA c59387zgA = new C59387zgA();
            for (InterfaceC59098zad interfaceC59098zad : iterable) {
                if (interfaceC59098zad != InterfaceC59098zad.ActionBar.copydefault) {
                    if (interfaceC59098zad instanceof yZW) {
                        C56406yEe.KWHzl(c59387zgA, ((yZW) interfaceC59098zad).EZpvd);
                    } else {
                        c59387zgA.add(interfaceC59098zad);
                    }
                }
            }
            return AEQbTJ(str, (java.util.List<? extends InterfaceC59098zad>) c59387zgA);
        }

        public final InterfaceC59098zad AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<? extends InterfaceC59098zad> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            int size = list.size();
            if (size == 0) {
                return InterfaceC59098zad.ActionBar.copydefault;
            }
            if (size == 1) {
                return list.get(0);
            }
            return new yZW(str, (InterfaceC59098zad[]) list.toArray(new InterfaceC59098zad[0]), null);
        }
    }

    @Override // o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        InterfaceC56663yNs interfaceC56663yNs = null;
        for (InterfaceC59098zad interfaceC59098zad : this.EZpvd) {
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

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.Collection<? extends o.yOe>, java.util.Collection<o.yOe> */
    @Override // o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        InterfaceC59098zad[] interfaceC59098zadArr = this.EZpvd;
        int length = interfaceC59098zadArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return interfaceC59098zadArr[0].copydefault(c56935yXu, yqv);
        }
        java.util.Collection<InterfaceC56676yOe> collectionCopydefault = null;
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArr) {
            collectionCopydefault = C59424zgl.copydefault(collectionCopydefault, interfaceC59098zad.copydefault(c56935yXu, yqv));
        }
        return collectionCopydefault == null ? yEE.copydefault() : collectionCopydefault;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.Collection<? extends o.yOp>, java.util.Collection<o.yOp> */
    @Override // o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        InterfaceC59098zad[] interfaceC59098zadArr = this.EZpvd;
        int length = interfaceC59098zadArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return interfaceC59098zadArr[0].AEQbTJ(c56935yXu, yqv);
        }
        java.util.Collection<InterfaceC56687yOp> collectionCopydefault = null;
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArr) {
            collectionCopydefault = C59424zgl.copydefault(collectionCopydefault, interfaceC59098zad.AEQbTJ(c56935yXu, yqv));
        }
        return collectionCopydefault == null ? yEE.copydefault() : collectionCopydefault;
    }

    @Override // o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC59098zad[] interfaceC59098zadArr = this.EZpvd;
        int length = interfaceC59098zadArr.length;
        if (length == 0) {
            return yDY.AhwBna();
        }
        if (length == 1) {
            return interfaceC59098zadArr[0].copydefault(yzu, function1);
        }
        java.util.Collection<InterfaceC56665yNu> collectionCopydefault = null;
        for (InterfaceC59098zad interfaceC59098zad : interfaceC59098zadArr) {
            collectionCopydefault = C59424zgl.copydefault(collectionCopydefault, interfaceC59098zad.copydefault(yzu, function1));
        }
        return collectionCopydefault == null ? yEE.copydefault() : collectionCopydefault;
    }

    @Override // o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        for (InterfaceC59098zad interfaceC59098zad : this.EZpvd) {
            interfaceC59098zad.OLrzqt(c56935yXu, yqv);
        }
    }
}
