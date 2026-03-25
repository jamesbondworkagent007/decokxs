package o;

import com.okinc.core.arch.data.StatefulData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC37675oyM<T> extends AbstractC32952mnL<java.util.List<? extends T>> {
    public final C58216yxB AYXKKw = new C58216yxB();
    public StatefulData<java.util.List<T>> DbNXlk;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    public abstract java.util.List<T> KWHzl(java.lang.String str, @NotNull java.util.List<? extends T> list);

    public abstract AbstractC58185ywX<java.util.List<T>> OLrzqt(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.lang.String str, @NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    public final void OLrzqt(StatefulData<java.util.List<T>> statefulData) {
        this.DbNXlk = statefulData;
        EZpvd(this.valueOf, statefulData);
    }

    public final java.util.List<T> valueOf() {
        StatefulData<java.util.List<T>> statefulData = this.DbNXlk;
        if (statefulData != null) {
            return (java.util.List) C32959mnS.KWHzl(statefulData);
        }
        return null;
    }

    @Override // o.AbstractC32952mnL
    public InterfaceC58217yxC EZpvd(long j) {
        AbstractC58185ywX<java.util.List<T>> abstractC58185ywXOLrzqt = OLrzqt(j);
        final Function1 function1 = new Function1() { // from class: o.oyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC37675oyM.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<T>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC37675oyM.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.oyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC37675oyM.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC37675oyM.values(function12, obj);
            }
        });
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC37675oyM abstractC37675oyM, java.util.List list) {
        abstractC37675oyM.OLrzqt(StatefulData.Companion.EZpvd(list));
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC37675oyM abstractC37675oyM, java.lang.Throwable th) {
        StatefulData.StateListAnimator stateListAnimator = StatefulData.Companion;
        Intrinsics.copydefault(th);
        abstractC37675oyM.OLrzqt(StatefulData.StateListAnimator.error$default(stateListAnimator, th, null, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.core.arch.data.StatefulData<java.util.List<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(final java.lang.String str, StatefulData<java.util.List<T>> statefulData) {
        java.util.List list;
        if (statefulData != 0 && (list = (java.util.List) statefulData.EZpvd()) != null) {
            this.AYXKKw.OLrzqt();
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(list);
            final Function1 function1 = new Function1() { // from class: o.oyP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC37675oyM.OLrzqt(this.OLrzqt, str, (java.util.List) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.oyO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC37675oyM.AkhnZx(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            AbstractC58185ywX abstractC58185ywXOLrzqt = C33024moe.OLrzqt(abstractC58185ywXAEQbTJ);
            final Function1 function12 = new Function1() { // from class: o.oyS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC37675oyM.EZpvd(this.KWHzl, str, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM<? super T> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oyW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC37675oyM.DbNXlk(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.oyV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC37675oyM.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oyX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC37675oyM.fetchVPNInfo(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            if (yBK.EZpvd(interfaceC58217yxCAEQbTJ, this.AYXKKw) != null) {
                return;
            }
        }
        setValue(statefulData);
        Unit unit = Unit.INSTANCE;
    }

    public static final java.util.List AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(AbstractC37675oyM abstractC37675oyM, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return abstractC37675oyM.KWHzl(str, list);
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC37675oyM abstractC37675oyM, java.lang.String str, java.util.List list) {
        Intrinsics.copydefault(list);
        abstractC37675oyM.copydefault(str, list);
        abstractC37675oyM.setValue(StatefulData.Companion.EZpvd(list));
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC37675oyM abstractC37675oyM, java.lang.Throwable th) {
        StatefulData.StateListAnimator stateListAnimator = StatefulData.Companion;
        Intrinsics.copydefault(th);
        abstractC37675oyM.setValue(StatefulData.StateListAnimator.error$default(stateListAnimator, th, null, 2, null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void performFilter$default(AbstractC37675oyM abstractC37675oyM, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performFilter");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC37675oyM.EZpvd(str, z);
    }

    public final void EZpvd(java.lang.String str, boolean z) {
        this.valueOf = str;
        if (z) {
            copydefault();
        } else {
            EZpvd(str, this.DbNXlk);
        }
    }

    public final boolean gEmmrt() {
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.valueOf);
    }
}
