package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.ui.params.FilterTabFragmentParams;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26191jVh extends AbstractC26186jVc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public int AYXKKw = 2;
    public final java.util.ArrayList<java.lang.String> AhwBna = yDY.copydefault(C33070mpX.AYXKKw(C23274hvD.Fragment.dcEsSD), C33070mpX.AYXKKw(C23274hvD.Fragment.onTrimMemory));
    public hDU djBIcL;
    public C26200jVq gEmmrt;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.AYXKKw;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.AYXKKw = i;
    }

    /* JADX INFO: renamed from: o.jVh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jVh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C26191jVh OLrzqt(@NotNull FilterTabFragmentParams filterTabFragmentParams) {
            Intrinsics.checkNotNullParameter(filterTabFragmentParams, "");
            C26191jVh c26191jVh = new C26191jVh();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.filter_tab_params", filterTabFragmentParams);
            c26191jVh.setArguments(bundle);
            return c26191jVh;
        }
    }

    public final FilterTabFragmentParams AhwBna() {
        FilterTabFragmentParams filterTabFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (filterTabFragmentParams = (FilterTabFragmentParams) BundleCompat.getParcelable(arguments, "key.filter_tab_params", FilterTabFragmentParams.class)) == null) ? new FilterTabFragmentParams(null, null, null, null, null, null, null, 127, null) : filterTabFragmentParams;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.QAQCdZ));
        wxq.AYXKKw().setContentDescription("web3_dex_market_tokens_list_filter_popup_title_view");
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = hDU.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        AYXKKw();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.jVi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C26191jVh.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(C26191jVh c26191jVh) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c26191jVh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.dpErvT));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.copydefault(), 0L, new Function1() { // from class: o.jVo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26191jVh.KWHzl(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.AEQbTJ(), 0L, new Function1() { // from class: o.jVm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26191jVh.AEQbTJ(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C26191jVh c26191jVh, android.view.View view) {
        InterfaceC26190jVg interfaceC26190jVgEZpvd;
        Intrinsics.checkNotNullParameter(view, "");
        C26200jVq c26200jVq = c26191jVh.gEmmrt;
        if (c26200jVq != null) {
            c26200jVq.EZpvd();
        }
        AdvancedFilter advancedFilterOLrzqt = jUD.copydefault.OLrzqt(c26191jVh.AhwBna().copydefault());
        if (advancedFilterOLrzqt != null && (interfaceC26190jVgEZpvd = c26191jVh.EZpvd()) != null) {
            interfaceC26190jVgEZpvd.KWHzl(advancedFilterOLrzqt);
        }
        c26191jVh.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C26191jVh c26191jVh, android.view.View view) {
        InterfaceC26190jVg interfaceC26190jVgEZpvd;
        Intrinsics.checkNotNullParameter(view, "");
        hDU hdu = c26191jVh.djBIcL;
        if (hdu != null) {
            C26200jVq c26200jVq = c26191jVh.gEmmrt;
            if (c26200jVq != null) {
                c26200jVq.copydefault(hdu.copydefault.AEQbTJ());
            }
            jUD.copydefault.AEQbTJ(c26191jVh.AhwBna().copydefault());
            AdvancedFilter advancedFilterEZpvd = c26191jVh.AhwBna().EZpvd();
            if (advancedFilterEZpvd != null && (interfaceC26190jVgEZpvd = c26191jVh.EZpvd()) != null) {
                interfaceC26190jVgEZpvd.KWHzl(advancedFilterEZpvd);
            }
            c26191jVh.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.jVc.EZpvd()V */
    public final InterfaceC26190jVg EZpvd() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC26190jVg) {
            return (InterfaceC26190jVg) parentFragment;
        }
        return null;
    }

    public final void AYXKKw() {
        hDU hdu = this.djBIcL;
        if (hdu != null) {
            this.gEmmrt = new C26200jVq(this, AhwBna());
            hdu.copydefault.copydefault().removeAllTabs();
            hdu.OLrzqt.setAdapter(this.gEmmrt);
            hdu.OLrzqt.setOffscreenPageLimit(2);
            new TabLayoutMediator(hdu.copydefault.copydefault(), hdu.OLrzqt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.jVn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C26191jVh.copydefault(this.AEQbTJ, tab, i);
                }
            }).attach();
            hdu.OLrzqt.setCurrentItem(AhwBna().valueOf().getPosition(), false);
            hdu.OLrzqt.registerOnPageChangeCallback(new ActionBar());
        }
    }

    public static final void copydefault(C26191jVh c26191jVh, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c26191jVh.AhwBna.get(i));
    }

    /* JADX INFO: renamed from: o.jVh$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C26191jVh c26191jVh = C26191jVh.this;
            c26191jVh.KWHzl(c26191jVh.AhwBna().AEQbTJ(), jVV.EZpvd(jVV.AEQbTJ(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("DEXMarket_Home_Filter_View", (TrackChannel[]) null, new Function1() { // from class: o.jVk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26191jVh.copydefault(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "list_key", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab_name", str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
