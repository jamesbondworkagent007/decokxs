package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.ztT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59991ztT {
    public java.util.HashSet<C59990ztS<?>> AEQbTJ;
    public final java.util.HashSet<InterfaceC59997ztZ> AhwBna;
    public final boolean EZpvd;
    public final java.util.HashMap<java.lang.String, AbstractC59982ztK<?>> KWHzl;
    public final java.util.List<C59991ztT> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59991ztT() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C59991ztT> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<InterfaceC59997ztZ> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<C59990ztS<?>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, AbstractC59982ztK<?>> copydefault() {
        return this.KWHzl;
    }

    public C59991ztT(boolean z) {
        this.EZpvd = z;
        this.copydefault = C60071zuu.OLrzqt.KWHzl();
        this.AEQbTJ = new java.util.HashSet<>();
        this.KWHzl = new java.util.HashMap<>();
        this.AhwBna = new java.util.HashSet<>();
        this.OLrzqt = new java.util.ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:39) call: o.ztT.<init>(boolean):void type: THIS */
    public /* synthetic */ C59991ztT(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final void OLrzqt(@NotNull C59991ztT... c59991ztTArr) {
        Intrinsics.checkNotNullParameter(c59991ztTArr, "");
        C56406yEe.KWHzl(this.OLrzqt, c59991ztTArr);
    }

    public static /* synthetic */ C59976ztE single$default(C59991ztT c59991ztT, InterfaceC59997ztZ interfaceC59997ztZ, boolean z, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Singleton;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ2, function2, kind, listAhwBna));
        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
        if (z || c59991ztT.OLrzqt()) {
            c59991ztT.KWHzl(c59990ztS);
        }
        return new C59976ztE(c59991ztT, c59990ztS);
    }

    public final void KWHzl(@NotNull AbstractC59982ztK<?> abstractC59982ztK) {
        Intrinsics.checkNotNullParameter(abstractC59982ztK, "");
        C59978ztG<?> c59978ztGOLrzqt = abstractC59982ztK.OLrzqt();
        AEQbTJ(C59977ztF.EZpvd(c59978ztGOLrzqt.EZpvd(), c59978ztGOLrzqt.OLrzqt(), c59978ztGOLrzqt.copydefault()), abstractC59982ztK);
    }

    public final void OLrzqt(@NotNull AbstractC59982ztK<?> abstractC59982ztK) {
        Intrinsics.checkNotNullParameter(abstractC59982ztK, "");
        C59978ztG<?> c59978ztGOLrzqt = abstractC59982ztK.OLrzqt();
        java.util.Iterator<T> it = c59978ztGOLrzqt.valueOf().iterator();
        while (it.hasNext()) {
            AEQbTJ(C59977ztF.EZpvd((InterfaceC56551yJo) it.next(), c59978ztGOLrzqt.OLrzqt(), c59978ztGOLrzqt.copydefault()), abstractC59982ztK);
        }
    }

    public final void KWHzl(@NotNull C59990ztS<?> c59990ztS) {
        Intrinsics.checkNotNullParameter(c59990ztS, "");
        this.AEQbTJ.add(c59990ztS);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull AbstractC59982ztK<?> abstractC59982ztK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC59982ztK, "");
        this.KWHzl.put(str, abstractC59982ztK);
    }

    public static /* synthetic */ C59976ztE factory$default(C59991ztT c59991ztT, InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztT, c59981ztJ);
    }

    public static /* synthetic */ C59976ztE factory$default(C59991ztT c59991ztT, InterfaceC59997ztZ interfaceC59997ztZ, Function2 function2, InterfaceC59997ztZ interfaceC59997ztZ2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ2, "");
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(interfaceC59997ztZ2, C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return new C59976ztE(c59991ztT, c59981ztJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C59991ztT.class == obj.getClass() && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C59991ztT) obj).copydefault);
    }

    public int hashCode() {
        return this.copydefault.hashCode();
    }
}
