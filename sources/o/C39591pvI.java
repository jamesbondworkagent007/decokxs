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

/* JADX INFO: renamed from: o.pvI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39591pvI extends android.widget.PopupWindow {
    public final Function1<oLQ, Unit> AEQbTJ;
    public java.util.ArrayList<oLQ> AhwBna;
    public int EZpvd;
    public android.widget.LinearLayout KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public RecyclerView djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final android.content.Context valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.oLQ, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39591pvI(@NotNull android.content.Context context, @NotNull Function1<? super oLQ, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = context;
        this.AEQbTJ = function1;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.pvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39591pvI.EZpvd();
            }
        });
        this.AhwBna = new java.util.ArrayList<>();
        this.OLrzqt = true;
        this.EZpvd = C33052mpF.dp2px$default(2.0f, null, 1, null);
        this.copydefault = C33052mpF.dp2px$default(54.0f, null, 1, null);
        AhwBna();
        copydefault();
    }

    public static final C59534zip EZpvd() {
        return new C59534zip();
    }

    public final C59534zip OLrzqt() {
        return (C59534zip) this.gEmmrt.getValue();
    }

    public final void copydefault() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(this.valueOf).inflate(C35964oKf.Application.ihnvzI, (android.view.ViewGroup) null);
        this.KWHzl = linearLayout;
        this.djBIcL = linearLayout != null ? (RecyclerView) linearLayout.findViewById(C35964oKf.StateListAnimator.IPostMessageService) : null;
        valueOf();
    }

    public final void valueOf() {
        OLrzqt().register(oLQ.class, new C39521pts(this.valueOf, new Function1() { // from class: o.pvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39591pvI.EZpvd(this.OLrzqt, (oLQ) obj);
            }
        }));
        OLrzqt().setItems(this.AhwBna);
        RecyclerView recyclerView = this.djBIcL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.valueOf));
        }
        RecyclerView recyclerView2 = this.djBIcL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(OLrzqt());
        }
    }

    public static final Unit EZpvd(C39591pvI c39591pvI, oLQ olq) {
        Intrinsics.checkNotNullParameter(olq, "");
        c39591pvI.AEQbTJ.invoke(olq);
        return Unit.INSTANCE;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        Intrinsics.copydefault(view);
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, this.OLrzqt ? C33129mqd.AhwBna(java.lang.Integer.valueOf(-(view.getHeight() + this.copydefault + this.EZpvd))) : this.EZpvd, 3);
    }

    public final void AhwBna() {
        this.AhwBna.add(new oLQ(0, false, 2, null));
        this.AhwBna.add(new oLQ(1, false, 2, null));
    }

    public final void AEQbTJ() {
        android.widget.LinearLayout linearLayout = this.KWHzl;
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

    public final void OLrzqt(int i, boolean z) {
        this.OLrzqt = z;
        for (oLQ olq : this.AhwBna) {
            olq.AEQbTJ(olq.EZpvd() == i);
        }
        OLrzqt().notifyDataSetChanged();
        AEQbTJ();
    }
}
