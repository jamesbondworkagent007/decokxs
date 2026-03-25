package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20281gdt extends wXX {
    public java.util.List<MevInfo.MevNode> AYXKKw;
    public boolean EZpvd;
    public C16486eko KWHzl;
    public C20284gdw OLrzqt;
    public Function1<? super java.lang.Boolean, Unit> copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.gdt$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gdt.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.gdt$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C20281gdt newInstance$default(Activity activity, boolean z, java.util.List list, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                list = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            return activity.EZpvd(z, list, function1);
        }

        public final C20281gdt EZpvd(boolean z, java.util.List<MevInfo.MevNode> list, Function1<? super java.lang.Boolean, Unit> function1) {
            C20281gdt c20281gdt = new C20281gdt();
            c20281gdt.copydefault = function1;
            c20281gdt.AYXKKw = list;
            c20281gdt.EZpvd = z;
            return c20281gdt;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = C16486eko.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        copydefault();
        KWHzl();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(6);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.icKaHr));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sEcTXd));
        KWHzl(wyf);
        wyf.setOnClickListener(new View.OnClickListener() { // from class: o.gdu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20281gdt.EZpvd(this.AEQbTJ, wyf, view);
            }
        });
        wyf.post(new java.lang.Runnable() { // from class: o.gdy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20281gdt.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(C20281gdt c20281gdt, wYF wyf, android.view.View view) {
        c20281gdt.EZpvd = !c20281gdt.EZpvd;
        c20281gdt.KWHzl(wyf);
        c20281gdt.dismiss();
    }

    public static final void AEQbTJ(C20281gdt c20281gdt) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20281gdt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(wYF wyf) {
        if (!this.EZpvd) {
            wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.icKaHr));
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setVisibility(0);
            }
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                ViewGroup.LayoutParams layoutParams = c52794wYpCopydefault2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                }
                c52794wYpCopydefault2.setLayoutParams(layoutParams);
            }
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setOnClickListener(new View.OnClickListener() { // from class: o.gdv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C20281gdt.KWHzl(this.KWHzl, view);
                    }
                });
                return;
            }
            return;
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sEcTXd));
        C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
        if (c52794wYpCopydefault4 != null) {
            c52794wYpCopydefault4.setVisibility(8);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setVisibility(0);
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ4 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ4 != null) {
            ViewGroup.LayoutParams layoutParams2 = c52794wYpAEQbTJ4.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -1;
            }
            c52794wYpAEQbTJ4.setLayoutParams(layoutParams2);
        }
    }

    public static final void KWHzl(C20281gdt c20281gdt, android.view.View view) {
        c20281gdt.EZpvd = !c20281gdt.EZpvd;
        c20281gdt.KWHzl();
        c20281gdt.dismiss();
    }

    public final void KWHzl() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        if (this.EZpvd) {
            C16486eko c16486eko = this.KWHzl;
            if (c16486eko != null && (appCompatTextView4 = c16486eko.AhwBna) != null) {
                appCompatTextView4.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fJk));
            }
            C16486eko c16486eko2 = this.KWHzl;
            if (c16486eko2 == null || (appCompatTextView3 = c16486eko2.AhwBna) == null) {
                return;
            }
            appCompatTextView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
            return;
        }
        C16486eko c16486eko3 = this.KWHzl;
        if (c16486eko3 != null && (appCompatTextView2 = c16486eko3.AhwBna) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aWuQzD));
        }
        C16486eko c16486eko4 = this.KWHzl;
        if (c16486eko4 == null || (appCompatTextView = c16486eko4.AhwBna) == null) {
            return;
        }
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
    }

    private final void copydefault() {
        android.view.View view;
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AppCompatTextView appCompatTextView2;
        RecyclerView recyclerView3;
        if (!C33129mqd.KWHzl((java.util.Collection) this.AYXKKw)) {
            C16486eko c16486eko = this.KWHzl;
            if (c16486eko != null && (recyclerView = c16486eko.EZpvd) != null) {
                recyclerView.setVisibility(8);
            }
            C16486eko c16486eko2 = this.KWHzl;
            if (c16486eko2 != null && (appCompatTextView = c16486eko2.AYXKKw) != null) {
                appCompatTextView.setVisibility(8);
            }
            C16486eko c16486eko3 = this.KWHzl;
            if (c16486eko3 == null || (view = c16486eko3.djBIcL) == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        C16486eko c16486eko4 = this.KWHzl;
        int i = 0;
        if (c16486eko4 != null && (recyclerView3 = c16486eko4.EZpvd) != null) {
            recyclerView3.setVisibility(0);
        }
        C16486eko c16486eko5 = this.KWHzl;
        if (c16486eko5 != null && (appCompatTextView2 = c16486eko5.AYXKKw) != null) {
            appCompatTextView2.setVisibility(0);
        }
        C16486eko c16486eko6 = this.KWHzl;
        if (c16486eko6 == null || (recyclerView2 = c16486eko6.EZpvd) == null) {
            return;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        java.util.List<MevInfo.MevNode> list = this.AYXKKw;
        Intrinsics.copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            MevInfo.MevNode mevNode = (MevInfo.MevNode) obj;
            arrayList.add(mevNode != null ? new C20285gdx(mevNode) : null);
            i++;
        }
        C20284gdw c20284gdw = new C20284gdw();
        recyclerView2.setAdapter(c20284gdw);
        c20284gdw.submitList(arrayList);
        this.OLrzqt = c20284gdw;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function1<? super java.lang.Boolean, Unit> function1 = this.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(this.EZpvd));
        }
    }
}
