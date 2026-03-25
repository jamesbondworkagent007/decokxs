package o;

import android.graphics.drawable.ColorDrawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pvK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39593pvK extends android.widget.PopupWindow {
    public boolean AEQbTJ;
    public java.util.ArrayList<oLN> AYXKKw;
    public final android.content.Context AhwBna;
    public android.widget.LinearLayout EZpvd;
    public int KWHzl;
    public final Function1<oLN, Unit> OLrzqt;
    public int copydefault;
    public RecyclerView djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.oLN, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39593pvK(@NotNull android.content.Context context, @NotNull Function1<? super oLN, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = context;
        this.OLrzqt = function1;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.pvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39593pvK.EZpvd();
            }
        });
        this.AYXKKw = new java.util.ArrayList<>();
        this.AEQbTJ = true;
        this.copydefault = C33052mpF.dp2px$default(2.0f, null, 1, null);
        this.KWHzl = C33052mpF.dp2px$default(104.0f, null, 1, null);
        AYXKKw();
        KWHzl();
    }

    public static final C59534zip EZpvd() {
        return new C59534zip();
    }

    public final C59534zip OLrzqt() {
        return (C59534zip) this.valueOf.getValue();
    }

    public final void KWHzl() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(this.AhwBna).inflate(C35964oKf.Application.fXYAwm, (android.view.ViewGroup) null);
        this.EZpvd = linearLayout;
        this.djBIcL = linearLayout != null ? (RecyclerView) linearLayout.findViewById(C35964oKf.StateListAnimator.areNotificationsEnabled) : null;
        djBIcL();
    }

    public final void djBIcL() {
        OLrzqt().register(oLN.class, new C39525ptw(this.AhwBna, new Function1() { // from class: o.pvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39593pvK.OLrzqt(this.KWHzl, (oLN) obj);
            }
        }));
        OLrzqt().setItems(this.AYXKKw);
        RecyclerView recyclerView = this.djBIcL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.AhwBna));
        }
        RecyclerView recyclerView2 = this.djBIcL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(OLrzqt());
        }
    }

    public static final Unit OLrzqt(C39593pvK c39593pvK, oLN oln) {
        Intrinsics.checkNotNullParameter(oln, "");
        c39593pvK.OLrzqt.invoke(oln);
        return Unit.INSTANCE;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        Intrinsics.copydefault(view);
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, this.AEQbTJ ? C33129mqd.AhwBna(java.lang.Integer.valueOf(-(view.getHeight() + this.KWHzl + this.copydefault))) : this.copydefault, 3);
    }

    public final void AYXKKw() {
        this.AYXKKw.add(new oLN(1, false, 2, null));
        this.AYXKKw.add(new oLN(2, false, 2, null));
        this.AYXKKw.add(new oLN(3, false, 2, null));
        this.AYXKKw.add(new oLN(4, false, 2, null));
    }

    public final void copydefault() {
        android.widget.LinearLayout linearLayout = this.EZpvd;
        if (linearLayout == null) {
            return;
        }
        setContentView(linearLayout);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void EZpvd(int i, boolean z) {
        this.AEQbTJ = z;
        for (oLN oln : this.AYXKKw) {
            oln.copydefault(oln.EZpvd() == i);
        }
        OLrzqt().notifyDataSetChanged();
        copydefault();
    }
}
