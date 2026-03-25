package o;

import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xGQ<T> {
    public InterfaceC58217yxC gHZMYf;
    public volatile boolean sSMYrx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
    }

    public abstract void AEQbTJ(@NotNull java.lang.String str);

    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC58217yxC interfaceC58217yxC) {
        this.gHZMYf = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.sSMYrx = z;
    }

    public abstract boolean OLrzqt(java.lang.Object obj);

    public boolean bC_() {
        return true;
    }

    public T bD_() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String bJ_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC iwGUEr() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean q_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String uzCIH() {
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xGQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC57556yke getWsListener$default(xGQ xgq, java.lang.String str, java.util.ArrayList arrayList, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWsListener");
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return xgq.EZpvd(str, arrayList, function1);
    }

    public final AbstractC57556yke EZpvd(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return C54407xHg.Companion.EZpvd(str, arrayList, AYXKKw(), (xGQ<?>) this, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xGQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC57556yke getWsListener$default(xGQ xgq, java.lang.String str, WsArgV5 wsArgV5, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWsListener");
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return xgq.KWHzl(str, wsArgV5, (Function1<? super java.lang.String, Unit>) function1);
    }

    public final AbstractC57556yke KWHzl(@NotNull java.lang.String str, @NotNull WsArgV5 wsArgV5, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wsArgV5, "");
        return EZpvd(str, yDY.copydefault(wsArgV5), function1);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xHa.TaskDescription.getV5Connection$default(o.xHa$TaskDescription, java.lang.String, boolean, boolean, boolean, boolean, com.okinc.websocket.connection.OKWsDoh, int, java.lang.Object):o.ykp */
    public C57567ykp AYXKKw() {
        return C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, uzCIH(), AhwBna(), false, bC_(), false, null, 52, null);
    }

    public static /* synthetic */ InterfaceC58217yxC startWsTimer$default(xGQ xgq, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startWsTimer");
        }
        if ((i & 1) != 0) {
            j = 700;
        }
        return xgq.KWHzl(j);
    }

    public InterfaceC58217yxC KWHzl(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.gHZMYf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, j, java.util.concurrent.TimeUnit.MILLISECONDS, yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGQ.EZpvd(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgInterval.map(new InterfaceC58229yxO() { // from class: o.xGZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xGQ.djBIcL(function1, obj);
            }
        }).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xGY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGQ.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xGQ.gEmmrt(function12, obj);
            }
        });
        this.gHZMYf = interfaceC58217yxCSubscribe;
        return interfaceC58217yxCSubscribe;
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(xGQ xgq, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return xgq.sSMYrx ? new kotlin.Pair(java.lang.Boolean.TRUE, xgq.bD_()) : new kotlin.Pair(java.lang.Boolean.FALSE, null);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xGQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(xGQ xgq, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && pair.getSecond() != null) {
            xgq.sSMYrx = false;
            java.lang.Object second = pair.getSecond();
            Intrinsics.copydefault(second);
            xgq.AEQbTJ(second);
        }
        return Unit.INSTANCE;
    }

    public final boolean valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\"eventType\":\"snapshot\"", false, 2, (java.lang.Object) null);
    }

    public final boolean AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\"lastPage\":true", false, 2, (java.lang.Object) null);
    }

    public final boolean djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\"curPage\":\"1\"", false, 2, (java.lang.Object) null);
    }

    public void KWHzl(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str);
    }

    public static final class Application {
        public final boolean AEQbTJ;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = application.KWHzl;
            }
            if ((i & 4) != 0) {
                z2 = application.AEQbTJ;
            }
            if ((i & 8) != 0) {
                z3 = application.copydefault;
            }
            return application.EZpvd(str, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && this.KWHzl == application.KWHzl && this.AEQbTJ == application.AEQbTJ && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WsData(data=" + this.OLrzqt + ", isTotalData=" + this.KWHzl + ", isLastPage=" + this.AEQbTJ + ", isFirstPage=" + this.copydefault + ")";
        }

        public Application(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.KWHzl = z;
            this.AEQbTJ = z2;
            this.copydefault = z3;
        }
    }
}
