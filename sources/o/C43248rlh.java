package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43248rlh extends AbstractC43215rlA {
    public static android.app.Application AEQbTJ;
    public static boolean copydefault;
    public static final C43248rlh KWHzl = new C43248rlh();
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.rlg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43248rlh.AhwBna();
        }
    });
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.rlj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43248rlh.EZpvd();
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rli
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43248rlh.KWHzl();
        }
    });
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return copydefault;
    }

    private C43248rlh() {
    }

    public final C43262rlv gEmmrt() {
        return (C43262rlv) AhwBna.getValue();
    }

    public static final C43262rlv AhwBna() {
        return new C43262rlv();
    }

    public final C43303rmj valueOf() {
        return (C43303rmj) AYXKKw.getValue();
    }

    public static final C43303rmj EZpvd() {
        return new C43303rmj();
    }

    public final java.util.Map<java.lang.Class<?>, java.util.Set<Function1<InterfaceC43216rlB, Unit>>> djBIcL() {
        return (java.util.Map) OLrzqt.getValue();
    }

    public static final java.util.Map KWHzl() {
        return new LinkedHashMap();
    }

    @Override // o.AbstractC43215rlA
    public void onInit(@NotNull android.content.Context context) {
        android.app.Application application;
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        if (context instanceof android.app.Application) {
            application = (android.app.Application) context;
        } else if (context.getApplicationContext() != null) {
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.copydefault(applicationContext, "");
            application = (android.app.Application) applicationContext;
        } else {
            throw new java.lang.RuntimeException("Must init IMC with application reference.");
        }
        AEQbTJ = application;
        gEmmrt().copydefault(InterfaceC43298rme.class, new C43297rmd());
        gEmmrt().copydefault(InterfaceC43305rml.class, new C43306rmm());
        gEmmrt().copydefault(InterfaceC43219rlE.class, new C43221rlG());
    }

    public final void EZpvd(boolean z) {
        copydefault = z;
        valueOf().OLrzqt(z);
    }

    public final <S extends InterfaceC43216rlB> void copydefault(@NotNull java.lang.Class<S> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        java.util.Set<Function1<InterfaceC43216rlB, Unit>> set = djBIcL().get(cls);
        if (set != null) {
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Function1 function1 = (Function1) it.next();
                InterfaceC43216rlB interfaceC43216rlBOLrzqt = KWHzl.OLrzqt(cls);
                if (interfaceC43216rlBOLrzqt != null) {
                    function1.invoke(interfaceC43216rlBOLrzqt);
                }
            }
        }
        djBIcL().remove(cls);
    }

    public final <T extends InterfaceC43216rlB> java.util.Set<Function1<InterfaceC43216rlB, Unit>> EZpvd(java.lang.Class<T> cls) {
        java.util.Set<Function1<InterfaceC43216rlB, Unit>> set = djBIcL().get(cls);
        if (set != null) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        KWHzl.djBIcL().put(cls, linkedHashSet);
        return linkedHashSet;
    }

    public final <S extends InterfaceC43216rlB> S EZpvd(@NotNull java.lang.Class<S> cls, Function1<? super S, Unit> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        C43262rlv c43262rlvGEmmrt = gEmmrt();
        android.app.Application application = AEQbTJ;
        if (application == null) {
            Intrinsics.gEmmrt("");
            application = null;
        }
        InterfaceC43216rlB interfaceC43216rlBAEQbTJ = c43262rlvGEmmrt.AEQbTJ(application, cls);
        if (interfaceC43216rlBAEQbTJ == null) {
            if (function1 != null) {
                KWHzl.EZpvd(cls).add((Function1) C56532yIw.KWHzl(function1, 1));
            }
        } else if (function1 != null) {
            function1.invoke(interfaceC43216rlBAEQbTJ);
        }
        return interfaceC43216rlBAEQbTJ;
    }

    public <S extends InterfaceC43216rlB> S OLrzqt(@NotNull java.lang.Class<S> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return (S) EZpvd(cls, null);
    }

    public <S extends InterfaceC43217rlC> S AEQbTJ(@NotNull java.lang.Class<S> cls) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        InterfaceC43217rlC interfaceC43217rlC;
        Intrinsics.checkNotNullParameter(cls, "");
        InterfaceC43216rlB interfaceC43216rlBEZpvd = EZpvd(cls, null);
        try {
            Result.Application application = Result.Companion;
            interfaceC43217rlC = (InterfaceC43217rlC) interfaceC43216rlBEZpvd;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (interfaceC43217rlC != null) {
            objM7377constructorimpl = Result.m7377constructorimpl(interfaceC43217rlC);
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return (S) objM7377constructorimpl;
        }
        if (copydefault) {
            return (S) C43314rmu.OLrzqt(cls);
        }
        throw new java.lang.IllegalStateException("Service " + cls + " has not been register.");
    }

    public static /* synthetic */ InterfaceC43264rlx getLogger$default(C43248rlh c43248rlh, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "IMC";
        }
        return c43248rlh.copydefault(str);
    }

    public final InterfaceC43264rlx copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43264rlx interfaceC43264rlxCopydefault = valueOf().copydefault(str);
        android.app.Application application = AEQbTJ;
        if (application != null) {
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            interfaceC43264rlxCopydefault.init(application);
        }
        return interfaceC43264rlxCopydefault;
    }

    public final void OLrzqt(@NotNull InterfaceC43264rlx interfaceC43264rlx) {
        Intrinsics.checkNotNullParameter(interfaceC43264rlx, "");
        android.app.Application application = AEQbTJ;
        if (application != null) {
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            interfaceC43264rlx.init(application);
        }
        valueOf().KWHzl(interfaceC43264rlx);
    }

    public final void OLrzqt(InterfaceC43259rls interfaceC43259rls) {
        gEmmrt().OLrzqt(interfaceC43259rls);
    }
}
