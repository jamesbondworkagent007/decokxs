package o;

import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51861vux extends AbstractC32996moC {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public uOZ AEQbTJ;
    public boolean EZpvd;
    public java.lang.String AhwBna = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String copydefault = "";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vuw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51861vux.valueOf(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vuy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51861vux.EZpvd(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vuz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51861vux.KWHzl(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.vux$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.spnCvw;
    }

    /* JADX INFO: renamed from: o.vux$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vux.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C51861vux newInstance$default(Application application, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return application.AEQbTJ(z, str);
        }

        public final C51861vux AEQbTJ(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C51861vux c51861vux = new C51861vux();
            c51861vux.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_use_large_tabs", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("extra_tab_location", str)));
            return c51861vux;
        }
    }

    private final boolean copydefault() {
        return ((java.lang.Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean valueOf(C51861vux c51861vux) {
        android.os.Bundle arguments = c51861vux.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_use_large_tabs", false);
        }
        return false;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String EZpvd(C51861vux c51861vux) {
        java.lang.String string;
        android.os.Bundle arguments = c51861vux.getArguments();
        return (arguments == null || (string = arguments.getString("extra_tab_location", "")) == null) ? "" : string;
    }

    private final java.util.List<java.lang.Integer> AEQbTJ() {
        return (java.util.List) this.valueOf.getValue();
    }

    public static final java.util.List KWHzl(C51861vux c51861vux) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (c51861vux.copydefault()) {
            listOLrzqt.add(java.lang.Integer.valueOf(C48033uCm.Fragment.GqbzPL));
            listOLrzqt.add(java.lang.Integer.valueOf(C48033uCm.Fragment.Qsauvs));
        } else {
            listOLrzqt.add(java.lang.Integer.valueOf(C55688xof.Application.onCustomAction));
            listOLrzqt.add(java.lang.Integer.valueOf(C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResult1invokeinlinedonDispose1));
        }
        listOLrzqt.add(java.lang.Integer.valueOf(C55688xof.Application.RidNCX));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final FragmentStateAdapter KWHzl() {
        return new ActionBar(yDY.gEmmrt(C51856vus.Companion.KWHzl(this.AhwBna), C51823vuL.Companion.copydefault(this.AhwBna, this.EZpvd), C51812vuA.Companion.EZpvd(this.AhwBna, this.EZpvd, this.OLrzqt, this.copydefault)), getChildFragmentManager(), getViewLifecycleOwner().getLifecycle());
    }

    /* JADX INFO: renamed from: o.vux$ActionBar */
    public static final class ActionBar extends FragmentStateAdapter {
        public final /* synthetic */ java.util.List<AbstractC32996moC> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.moC> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(java.util.List<? extends AbstractC32996moC> list, androidx.fragment.app.FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
            this.copydefault = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return this.copydefault.get(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("id", "")) == null) {
            string = "";
        }
        this.AhwBna = string;
        android.os.Bundle arguments2 = getArguments();
        this.EZpvd = arguments2 != null ? arguments2.getBoolean("from", false) : false;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("path", "")) == null) {
            string2 = "";
        }
        this.OLrzqt = string2;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null && (string3 = arguments4.getString("name", "")) != null) {
            str = string3;
        }
        this.copydefault = str;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = (uOZ) DataBindingUtil.bind(view);
        valueOf();
        gEmmrt();
        OLrzqt();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        ViewPager2 viewPager2;
        java.lang.Integer numCopydefault = copydefault(EZpvd());
        if (numCopydefault != null) {
            int iIntValue = numCopydefault.intValue();
            try {
                Result.Application application = Result.Companion;
                uOZ uoz = this.AEQbTJ;
                if (uoz == null || (viewPager2 = uoz.copydefault) == null) {
                    unit = null;
                } else {
                    viewPager2.setCurrentItem(iIntValue, false);
                    unit = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                thM7380exceptionOrNullimpl.printStackTrace();
            }
        }
    }

    public final java.lang.Integer copydefault(java.lang.String str) {
        java.lang.String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return null;
        }
        int iHashCode = lowerCase.hashCode();
        return iHashCode != 3029900 ? iHashCode != 109757599 ? (iHashCode == 926934164 && lowerCase.equals("history")) ? 2 : null : !lowerCase.equals("stats") ? null : 0 : !lowerCase.equals("bots") ? null : 1;
    }

    private final void valueOf() {
        C55254xgV c55254xgV;
        uOZ uoz = this.AEQbTJ;
        if (uoz == null || (c55254xgV = uoz.OLrzqt) == null || !copydefault()) {
            return;
        }
        c55254xgV.setOKDSSize(44);
    }

    private final void gEmmrt() {
        uOZ uoz = this.AEQbTJ;
        if (uoz != null) {
            uoz.copydefault.setAdapter(KWHzl());
            uoz.copydefault.setOffscreenPageLimit(AEQbTJ().size());
            new TabLayoutMediator(uoz.OLrzqt.copydefault(), uoz.copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vuC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C51861vux.AEQbTJ(this.KWHzl, tab, i);
                }
            }).attach();
            uoz.OLrzqt.copydefault().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity());
        }
    }

    public static final void AEQbTJ(C51861vux c51861vux, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c51861vux.AEQbTJ().get(i).intValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        uOZ uoz = this.AEQbTJ;
        if (uoz != null && (viewPager2 = uoz.copydefault) != null) {
            viewPager2.setAdapter(null);
        }
        this.AEQbTJ = null;
        super.onDestroyView();
    }
}
