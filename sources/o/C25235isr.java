package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25235isr extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ;
    public java.util.List<WalletDexService.SupportedMevNodeBean> AYXKKw;
    public int AhwBna = 1;
    public boolean EZpvd;
    public C21613hFw KWHzl;
    public C25242isy OLrzqt;

    private final void AEQbTJ() {
    }

    private final void KWHzl() {
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.isr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.isr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.isr$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C25235isr newInstance$default(ActionBar actionBar, java.lang.String str, boolean z, int i, boolean z2, java.util.List list, Function1 function1, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            return actionBar.AEQbTJ(str, z, i, z2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : function1);
        }

        public final C25235isr AEQbTJ(@NotNull java.lang.String str, boolean z, int i, boolean z2, java.util.List<WalletDexService.SupportedMevNodeBean> list, Function1<? super java.lang.Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            C25235isr c25235isr = new C25235isr();
            c25235isr.AEQbTJ = function1;
            c25235isr.AYXKKw = list;
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putInt("type", i);
            bundle.putBoolean("data", z);
            bundle.putBoolean("trade_tab_type", z2);
            c25235isr.setArguments(bundle);
            return c25235isr;
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
        this.KWHzl = C21613hFw.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? arguments.getBoolean("data") : false;
        android.os.Bundle arguments2 = getArguments();
        this.AhwBna = arguments2 != null ? arguments2.getInt("type") : 1;
        copydefault();
        AEQbTJ();
        KWHzl();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.iss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25235isr.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void copydefault(C25235isr c25235isr) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c25235isr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(6);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistryKtrememberLauncherForActivityResultkey1));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerKtBackHandler2invokeinlinedonDispose1));
        KWHzl(wyf);
        C25352ivB.setOnDoubleCheckClickListener$default(wyf, 0L, new Function1() { // from class: o.isu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25235isr.KWHzl(this.OLrzqt, wyf, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C25235isr c25235isr, wYF wyf, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c25235isr.EZpvd = !c25235isr.EZpvd;
        c25235isr.KWHzl(wyf);
        c25235isr.dismiss();
        return Unit.INSTANCE;
    }

    public final void KWHzl(wYF wyf) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (this.AhwBna == 1) {
            C21613hFw c21613hFw = this.KWHzl;
            if (c21613hFw != null && (appCompatTextView2 = c21613hFw.AYXKKw) != null) {
                appCompatTextView2.setVisibility(0);
            }
            OLrzqt(wyf);
            return;
        }
        C21613hFw c21613hFw2 = this.KWHzl;
        if (c21613hFw2 != null && (appCompatTextView = c21613hFw2.AYXKKw) != null) {
            appCompatTextView.setVisibility(8);
        }
        copydefault(wyf);
    }

    public final void OLrzqt(wYF wyf) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        if (this.EZpvd) {
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(0);
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setVisibility(8);
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                ViewGroup.LayoutParams layoutParams = c52794wYpAEQbTJ2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                }
                c52794wYpAEQbTJ2.setLayoutParams(layoutParams);
            }
            C21613hFw c21613hFw = this.KWHzl;
            if (c21613hFw != null && (appCompatTextView4 = c21613hFw.AYXKKw) != null) {
                appCompatTextView4.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.provides));
            }
            C21613hFw c21613hFw2 = this.KWHzl;
            if (c21613hFw2 == null || (appCompatTextView3 = c21613hFw2.AYXKKw) == null) {
                return;
            }
            appCompatTextView3.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.dzCpvv));
            return;
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setVisibility(8);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setVisibility(0);
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            ViewGroup.LayoutParams layoutParams2 = c52794wYpCopydefault3.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -1;
            }
            c52794wYpCopydefault3.setLayoutParams(layoutParams2);
        }
        C21613hFw c21613hFw3 = this.KWHzl;
        if (c21613hFw3 != null && (appCompatTextView2 = c21613hFw3.AYXKKw) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.LocalFullyDrawnReporterOwner));
        }
        C21613hFw c21613hFw4 = this.KWHzl;
        if (c21613hFw4 == null || (appCompatTextView = c21613hFw4.AYXKKw) == null) {
            return;
        }
        appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.DeEinT));
    }

    public final void copydefault(wYF wyf) {
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.ihnvzI));
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
    }

    private final void copydefault() {
        android.view.View view;
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AppCompatTextView appCompatTextView2;
        RecyclerView recyclerView3;
        if (this.AhwBna != 1 || !C33129mqd.KWHzl((java.util.Collection) this.AYXKKw)) {
            C21613hFw c21613hFw = this.KWHzl;
            if (c21613hFw != null && (recyclerView = c21613hFw.OLrzqt) != null) {
                recyclerView.setVisibility(8);
            }
            C21613hFw c21613hFw2 = this.KWHzl;
            if (c21613hFw2 != null && (appCompatTextView = c21613hFw2.gEmmrt) != null) {
                appCompatTextView.setVisibility(8);
            }
            C21613hFw c21613hFw3 = this.KWHzl;
            if (c21613hFw3 == null || (view = c21613hFw3.valueOf) == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        C21613hFw c21613hFw4 = this.KWHzl;
        int i = 0;
        if (c21613hFw4 != null && (recyclerView3 = c21613hFw4.OLrzqt) != null) {
            recyclerView3.setVisibility(0);
        }
        C21613hFw c21613hFw5 = this.KWHzl;
        if (c21613hFw5 != null && (appCompatTextView2 = c21613hFw5.gEmmrt) != null) {
            appCompatTextView2.setVisibility(0);
        }
        C21613hFw c21613hFw6 = this.KWHzl;
        if (c21613hFw6 == null || (recyclerView2 = c21613hFw6.OLrzqt) == null) {
            return;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        java.util.List<WalletDexService.SupportedMevNodeBean> list = this.AYXKKw;
        Intrinsics.copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new C25237ist((WalletDexService.SupportedMevNodeBean) obj));
            i++;
        }
        C25242isy c25242isy = new C25242isy(new Function1() { // from class: o.isv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C25235isr.copydefault((C25237ist) obj2);
            }
        });
        recyclerView2.setAdapter(c25242isy);
        c25242isy.submitList(arrayList);
        this.OLrzqt = c25242isy;
    }

    public static final Unit copydefault(C25237ist c25237ist) {
        Intrinsics.checkNotNullParameter(c25237ist, "");
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function1<? super java.lang.Boolean, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(this.EZpvd));
        }
    }
}
