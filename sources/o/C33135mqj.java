package o;

import com.okinc.core.livelistener.OKIncomingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33135mqj {
    public final java.util.ArrayList<AbstractC33132mqg> AEQbTJ;
    public final long KWHzl;
    public final Function0<Unit> OLrzqt;
    public InterfaceC58217yxC copydefault;

    public final void KWHzl(@NotNull AbstractC33132mqg abstractC33132mqg) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        this.AEQbTJ.add(abstractC33132mqg);
    }

    public final void AEQbTJ(@NotNull AbstractC33132mqg abstractC33132mqg) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        this.AEQbTJ.remove(abstractC33132mqg);
        if (this.AEQbTJ.size() == 0) {
            EZpvd();
        }
    }

    public final void KWHzl(@NotNull AbstractC33132mqg abstractC33132mqg, @NotNull OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        if (this.copydefault == null) {
            KWHzl();
        }
        if (oKIncomingData.isInitialData()) {
            copydefault();
        }
    }

    public final void KWHzl() {
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgRepeat = AbstractC58247yxg.timer(this.KWHzl, java.util.concurrent.TimeUnit.SECONDS, C58266yxz.OLrzqt()).repeat();
        final Function1 function1 = new Function1() { // from class: o.mqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33135mqj.copydefault((java.lang.Throwable) obj);
            }
        };
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgDoOnError = abstractC58247yxgRepeat.doOnError(new InterfaceC58227yxM() { // from class: o.mql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C33135mqj.KWHzl(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.mqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33135mqj.KWHzl(this.EZpvd, (java.lang.Long) obj);
            }
        };
        this.copydefault = abstractC58247yxgDoOnError.subscribe(new InterfaceC58227yxM() { // from class: o.mqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C33135mqj.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C33135mqj c33135mqj, java.lang.Long l) {
        c33135mqj.copydefault();
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        this.OLrzqt.invoke();
    }

    public final void EZpvd() {
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.copydefault = null;
    }
}
