package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fFd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17433fFd implements fDN<eCF> {
    public final Function1<eCF, fDP> AEQbTJ;
    public int KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.eCF, ? extends o.fDP> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17433fFd(@NotNull Function1<? super eCF, ? extends fDP> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17433fFd.EZpvd();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fFg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17433fFd.copydefault();
            }
        });
        this.KWHzl = 1;
    }

    public final java.util.HashMap<java.lang.Integer, fDP> gEmmrt() {
        return (java.util.HashMap) this.copydefault.getValue();
    }

    public static final java.util.HashMap EZpvd() {
        return new java.util.HashMap();
    }

    public final java.util.HashMap<java.lang.Class<?>, java.lang.Integer> OLrzqt() {
        return (java.util.HashMap) this.OLrzqt.getValue();
    }

    public static final java.util.HashMap copydefault() {
        return new java.util.HashMap();
    }

    public final void copydefault(fDP fdp) {
        gEmmrt().put(java.lang.Integer.valueOf(this.KWHzl), fdp);
        OLrzqt().put(fdp.getClass(), java.lang.Integer.valueOf(this.KWHzl));
        this.KWHzl++;
    }

    public final int AEQbTJ(fDP fdp) {
        if (!OLrzqt().containsKey(fdp.getClass())) {
            copydefault(fdp);
        }
        java.lang.Integer num = OLrzqt().get(fdp.getClass());
        Intrinsics.copydefault(num);
        return num.intValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)I */
    @Override // o.fDN
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public int OLrzqt(@NotNull eCF ecf) {
        Intrinsics.checkNotNullParameter(ecf, "");
        return AEQbTJ(this.AEQbTJ.invoke(ecf));
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Lo/fDP; */
    @Override // o.fDN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public fDP EZpvd(@NotNull eCF ecf) {
        Intrinsics.checkNotNullParameter(ecf, "");
        fDP fdp = gEmmrt().get(java.lang.Integer.valueOf(OLrzqt(ecf)));
        Intrinsics.copydefault(fdp);
        return fdp;
    }
}
