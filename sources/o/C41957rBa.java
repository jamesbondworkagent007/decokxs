package o;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41957rBa {
    public final java.util.ArrayList<rAX<?>> KWHzl = new java.util.ArrayList<>();
    public final MediatorLiveData<java.lang.Boolean> AEQbTJ = new MediatorLiveData<>();

    /* JADX INFO: renamed from: o.rBa$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<java.lang.Boolean> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<rAX<?>> OLrzqt() {
        return this.KWHzl;
    }

    public final void KWHzl() {
        this.KWHzl.clear();
    }

    public final boolean gEmmrt() {
        java.util.Iterator<rAX<?>> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            rAX<?> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            rAX<?> rax = next;
            if (!rax.gEmmrt()) {
                if (!rax.KWHzl()) {
                    rax.OLrzqt(true);
                }
                rax.valueOf().setValue(null);
                return false;
            }
        }
        return true;
    }

    public final void copydefault() {
        this.AEQbTJ.setValue(java.lang.Boolean.valueOf(EZpvd()));
    }

    public final void EZpvd(@NotNull rAX<?> rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        this.KWHzl.add(rax);
        this.AEQbTJ.addSource(rax, new StateListAnimator(new Application(rax, this)));
    }

    /* JADX INFO: renamed from: o.rBa$Application */
    public static final class Application implements Function1 {
        public final /* synthetic */ rAX<?> EZpvd;
        public final /* synthetic */ C41957rBa KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(rAX<?> rax, C41957rBa c41957rBa) {
            this.EZpvd = rax;
            this.KWHzl = c41957rBa;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            EZpvd(obj);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.Object obj) {
            this.EZpvd.gEmmrt();
            this.KWHzl.AEQbTJ().setValue(java.lang.Boolean.valueOf(this.KWHzl.EZpvd()));
        }
    }

    public final boolean EZpvd() {
        java.util.ArrayList<rAX<?>> arrayList = this.KWHzl;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((rAX) it.next()).AhwBna()) {
                    return false;
                }
            }
        }
        return true;
    }
}
