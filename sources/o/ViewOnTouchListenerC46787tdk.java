package o;

import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okmarket.ui.market.edit.widget.DragTouchWrapper$onTouch$1$1;
import com.okinc.okmarket.ui.market.edit.widget.DragTouchWrapper$onTouch$1$2;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnTouchListenerC46787tdk implements InterfaceC46791tdo, View.OnTouchListener {
    public final InterfaceC46794tdr AEQbTJ;
    public final Function1<java.lang.Integer, Unit> EZpvd;
    public final C46796tdt KWHzl;
    public final ItemTouchHelper OLrzqt;
    public C46786tdj copydefault;
    public final Function0<java.lang.Boolean> djBIcL;
    public final java.lang.Runnable gEmmrt;
    public final C46788tdl valueOf;

    public final void EZpvd() {
    }

    public final void OLrzqt() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnTouchListenerC46787tdk(@NotNull C46796tdt c46796tdt, @NotNull InterfaceC46789tdm interfaceC46789tdm, @NotNull Function1<? super java.lang.Integer, Unit> function1, @NotNull InterfaceC46794tdr interfaceC46794tdr, @NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(c46796tdt, "");
        Intrinsics.checkNotNullParameter(interfaceC46789tdm, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(interfaceC46794tdr, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = c46796tdt;
        this.EZpvd = function1;
        this.AEQbTJ = interfaceC46794tdr;
        this.djBIcL = function0;
        C46788tdl c46788tdl = new C46788tdl(interfaceC46789tdm, this);
        this.valueOf = c46788tdl;
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(c46788tdl);
        this.OLrzqt = itemTouchHelper;
        this.gEmmrt = new java.lang.Runnable() { // from class: o.tdi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC46787tdk.EZpvd(this.copydefault);
            }
        };
        c46796tdt.setEnhanceTouchListener(this);
        RecyclerView.Adapter adapter = c46796tdt.getAdapter();
        if (adapter != null) {
            adapter.hasStableIds();
        }
        itemTouchHelper.attachToRecyclerView(c46796tdt);
    }

    public static final void EZpvd(ViewOnTouchListenerC46787tdk viewOnTouchListenerC46787tdk) {
        java.lang.Integer numOLrzqt;
        C46786tdj c46786tdj = viewOnTouchListenerC46787tdk.copydefault;
        if (c46786tdj != null) {
            c46786tdj.AEQbTJ(false);
        }
        viewOnTouchListenerC46787tdk.KWHzl.requestDisallowInterceptTouchEvent(true);
        C46786tdj c46786tdj2 = viewOnTouchListenerC46787tdk.copydefault;
        Objects.toString(c46786tdj2 != null ? c46786tdj2.OLrzqt() : null);
        C46786tdj c46786tdj3 = viewOnTouchListenerC46787tdk.copydefault;
        if (c46786tdj3 != null && (numOLrzqt = c46786tdj3.OLrzqt()) != null) {
            viewOnTouchListenerC46787tdk.EZpvd.invoke(java.lang.Integer.valueOf(numOLrzqt.intValue()));
        }
        C46786tdj c46786tdj4 = viewOnTouchListenerC46787tdk.copydefault;
        if (c46786tdj4 != null) {
            c46786tdj4.OLrzqt(false);
        }
        viewOnTouchListenerC46787tdk.copydefault = null;
        viewOnTouchListenerC46787tdk.AEQbTJ();
        viewOnTouchListenerC46787tdk.AEQbTJ.AEQbTJ();
        viewOnTouchListenerC46787tdk.copydefault = null;
    }

    public final void KWHzl() {
        this.KWHzl.removeCallbacks(this.gEmmrt);
        this.KWHzl.postDelayed(this.gEmmrt, 700L);
    }

    public final void AEQbTJ() {
        this.KWHzl.removeCallbacks(this.gEmmrt);
    }

    @Override // o.InterfaceC46791tdo
    public boolean copydefault() {
        C46786tdj c46786tdj;
        return this.djBIcL.invoke().booleanValue() && ((c46786tdj = this.copydefault) == null || c46786tdj.KWHzl());
    }

    @Override // o.InterfaceC46791tdo
    public void OLrzqt(int i, java.lang.Integer num) {
        C46786tdj c46786tdj = this.copydefault;
        if (c46786tdj != null) {
            if (i == 2 && c46786tdj.EZpvd() == 0) {
                c46786tdj.KWHzl(true);
                this.AEQbTJ.KWHzl(num != null ? num.intValue() : -1);
                C46786tdj c46786tdj2 = this.copydefault;
                if (c46786tdj2 != null) {
                    c46786tdj2.copydefault(num);
                }
                KWHzl();
            } else if (i == 0 && c46786tdj.EZpvd() == 2) {
                AEQbTJ();
                c46786tdj.KWHzl(false);
            }
            c46786tdj.KWHzl(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                C46786tdj c46786tdj = new C46786tdj(motionEvent.getRawY(), new DragTouchWrapper$onTouch$1$1(this), new DragTouchWrapper$onTouch$1$2(this));
                c46786tdj.AEQbTJ(true);
                this.copydefault = c46786tdj;
            } else if (action == 1) {
                if (this.copydefault != null) {
                    this.AEQbTJ.AEQbTJ();
                }
                C46786tdj c46786tdj2 = this.copydefault;
                if (c46786tdj2 != null) {
                    c46786tdj2.AEQbTJ(true);
                }
                C46786tdj c46786tdj3 = this.copydefault;
                if (c46786tdj3 != null) {
                    c46786tdj3.OLrzqt(false);
                }
                this.copydefault = null;
                AEQbTJ();
            } else if (action == 2) {
                C46786tdj c46786tdj4 = this.copydefault;
                if (c46786tdj4 != null && c46786tdj4.copydefault()) {
                    if (java.lang.Math.abs(c46786tdj4.AEQbTJ() - motionEvent.getRawY()) > 20.0f) {
                        AEQbTJ();
                    }
                    c46786tdj4.OLrzqt(true);
                }
            } else if (action == 3) {
            }
        }
        return false;
    }
}
