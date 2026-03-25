package o;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33622mzt {
    public DialogC55112xdm AEQbTJ;
    public final InterfaceC58227yxM<java.lang.Throwable> AYXKKw = new InterfaceC58227yxM() { // from class: o.mzz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58227yxM
        public final void accept(java.lang.Object obj) {
            C33622mzt.OLrzqt((java.lang.Throwable) obj);
        }
    };
    public InterfaceC58217yxC EZpvd;
    public InterfaceC58217yxC KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;

    public static final void OLrzqt(java.lang.Throwable th) {
    }

    public final void OLrzqt(@NotNull android.content.Context context, boolean z, boolean z2, boolean z3, long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        if (this.AEQbTJ != null) {
            return;
        }
        if (z2) {
            OLrzqt(context, str, z, j);
        } else {
            OLrzqt(context, str, z, 0L);
        }
        if (z3) {
            InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
            if (interfaceC58217yxC == null || interfaceC58217yxC.isDisposed()) {
                AbstractC58247yxg<java.lang.Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(10L, java.util.concurrent.TimeUnit.SECONDS).observeOn(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.mzs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C33622mzt.AEQbTJ(this.copydefault, (java.lang.Long) obj);
                    }
                };
                this.KWHzl = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.mzx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C33622mzt.KWHzl(function1, obj);
                    }
                }, this.AYXKKw);
            }
        }
    }

    public static final Unit AEQbTJ(C33622mzt c33622mzt, java.lang.Long l) {
        c33622mzt.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(android.content.Context context, java.lang.String str, boolean z, long j) {
        if (this.OLrzqt) {
            this.copydefault = true;
            if (this.AEQbTJ == null && (context instanceof android.app.Activity)) {
                DialogC55112xdm dialogC55112xdm = new DialogC55112xdm(context, C55366xib.copydefault(C52761wXj.ActionBar.OFhtUX, context));
                dialogC55112xdm.EZpvd(j);
                dialogC55112xdm.show();
                dialogC55112xdm.setCancelable(z);
                ViewGroup.LayoutParams layoutParams = dialogC55112xdm.KWHzl().getLayoutParams();
                layoutParams.width = C55298xhM.OLrzqt(32, context);
                layoutParams.height = C55298xhM.OLrzqt(32, context);
                this.AEQbTJ = dialogC55112xdm;
            }
        }
    }

    public final void copydefault() {
        if (this.OLrzqt) {
            this.OLrzqt = false;
            if (this.copydefault) {
                InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
                if (interfaceC58217yxC == null || interfaceC58217yxC.isDisposed()) {
                    AbstractC58247yxg<java.lang.Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(500L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
                    final Function1 function1 = new Function1() { // from class: o.mzu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C33622mzt.OLrzqt(this.OLrzqt, (java.lang.Long) obj);
                        }
                    };
                    this.EZpvd = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.mzr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C33622mzt.OLrzqt(function1, obj);
                        }
                    }, this.AYXKKw);
                    return;
                }
                return;
            }
            KWHzl();
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C33622mzt c33622mzt, java.lang.Long l) {
        c33622mzt.copydefault = false;
        c33622mzt.KWHzl();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        DialogC55112xdm dialogC55112xdm = this.AEQbTJ;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.hide();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.OLrzqt = false;
        this.copydefault = false;
        KWHzl();
    }

    public final void KWHzl() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        DialogC55112xdm dialogC55112xdm = this.AEQbTJ;
        if (dialogC55112xdm != null) {
            Intrinsics.copydefault(dialogC55112xdm);
            dialogC55112xdm.dismiss();
            this.AEQbTJ = null;
        }
    }
}
