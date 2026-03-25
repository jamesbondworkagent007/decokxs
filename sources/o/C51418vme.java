package o;

import android.view.View;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.tradingbot.impl.market_place.presenter.MpBotSelectedPresenter;
import com.okinc.unify_trade.biz.MpCategory;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51418vme extends AbstractC49945uyC<uUZ, MpBotSelectedPresenter> {
    public final int AEQbTJ = C48033uCm.Activity.glVQsU;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OLrzqt(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        isConnected();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.hdBMmm));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    private final void copydefault() {
        final java.util.List<C51786vtb> listOLrzqt = OLrzqt().OLrzqt();
        uUZ uuzValues = values();
        if (!listOLrzqt.isEmpty()) {
            uuzValues.KWHzl.setOffscreenPageLimit(listOLrzqt.size());
        }
        ViewPager2 viewPager2 = uuzValues.KWHzl;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        viewPager2.setAdapter(new C47976uAj(childFragmentManager, listOLrzqt, lifecycle, null, 8, null));
        uuzValues.AEQbTJ.KWHzl(true);
        new TabLayoutMediator(uuzValues.AEQbTJ.copydefault(), uuzValues.KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51418vme.AEQbTJ(listOLrzqt, tab, i);
            }
        }).attach();
        android.view.View childAt = uuzValues.KWHzl.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
    }

    public static final void AEQbTJ(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C51418vme.OLrzqt(view);
            }
        });
        MpCategory mpCategoryAEQbTJ = ((C51786vtb) list.get(i)).AEQbTJ();
        tab.setText(mpCategoryAEQbTJ.getName());
        tab.setTag(mpCategoryAEQbTJ);
    }

    private final void isConnected() {
        getChildFragmentManager().setFragmentResultListener("bot_dialog_dismiss", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51418vme.AEQbTJ(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C51418vme c51418vme, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c51418vme.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.vme$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C51418vme copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51418vme c51418vme) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c51418vme;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
