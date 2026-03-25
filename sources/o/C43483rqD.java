package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43483rqD {
    public static final C43483rqD OLrzqt = new C43483rqD();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rqI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43483rqD.AEQbTJ();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rqJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43483rqD.valueOf();
        }
    });
    public static final int AEQbTJ = 8;

    private C43483rqD() {
    }

    public final java.util.HashMap<java.lang.String, Function0<C43528rqw>> AhwBna() {
        return (java.util.HashMap) EZpvd.getValue();
    }

    public static final java.util.HashMap AEQbTJ() {
        return new java.util.HashMap();
    }

    public final java.util.HashMap<java.lang.String, C43528rqw> AYXKKw() {
        return (java.util.HashMap) KWHzl.getValue();
    }

    public static final java.util.HashMap valueOf() {
        return new java.util.HashMap();
    }

    public static final C43528rqw gEmmrt() {
        return new C43528rqw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rqD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerChannelFactory$default(C43483rqD c43483rqD, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.rqH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43483rqD.gEmmrt();
                }
            };
        }
        c43483rqD.OLrzqt(str, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.rqw> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str, Function0<? extends C43528rqw> function0) {
        AhwBna().put(str, function0);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        if (AhwBna().get(str) == null) {
            OLrzqt(str, new Function0() { // from class: o.rqF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43483rqD.djBIcL();
                }
            });
        }
        C43528rqw c43528rqwInvoke = AYXKKw().get(str);
        if (c43528rqwInvoke == null) {
            Function0<C43528rqw> function0 = AhwBna().get(str);
            Intrinsics.copydefault(function0);
            c43528rqwInvoke = function0.invoke();
            c43528rqwInvoke.EZpvd(str);
            c43528rqwInvoke.OLrzqt(c57567ykp);
            AYXKKw().put(str, c43528rqwInvoke);
        }
        c43528rqwInvoke.OLrzqt();
    }

    public static final C43528rqw djBIcL() {
        return new C43548rrP();
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C43528rqw c43528rqwRemove = AYXKKw().remove(str);
        AhwBna().remove(str);
        if (c43528rqwRemove != null) {
            c43528rqwRemove.AhwBna();
        }
    }
}
