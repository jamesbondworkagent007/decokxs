package o;

import android.view.View;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradingbot.impl.market_place.home.list.HomeSignalType;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeSignalSquarePresenter;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vpZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51572vpZ extends AbstractC54505xKx<uPO, HomeSignalSquarePresenter> {
    public C47976uAj<C51526vog> copydefault;

    public static final boolean OLrzqt(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.DNMMPQ;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ();
        gEmmrt();
        C32866mlf.onEvent$default("SignalMarketplace_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        TabLayout.TabView tabView;
        this.copydefault = new C47976uAj<>(this, copydefault(), null, 4, null);
        gGvvIC().copydefault.setAdapter(this.copydefault);
        new TabLayoutMediator(gGvvIC().OLrzqt.copydefault(), gGvvIC().copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51572vpZ.copydefault(this.AEQbTJ, tab, i);
            }
        }).attach();
        KWHzl();
        int tabCount = gGvvIC().OLrzqt.copydefault().getTabCount();
        for (final int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabCopydefault = gGvvIC().OLrzqt.copydefault(i);
            if (tabCopydefault != null && (tabView = tabCopydefault.view) != null) {
                tabView.setOnClickListener(new View.OnClickListener() { // from class: o.vqe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C51572vpZ.OLrzqt(i, this, view);
                    }
                });
            }
        }
        android.view.View childAt = gGvvIC().copydefault.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
    }

    public static final void copydefault(C51572vpZ c51572vpZ, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vpX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C51572vpZ.OLrzqt(view);
            }
        });
        tab.setText(C33070mpX.AYXKKw(c51572vpZ.copydefault().get(i).OLrzqt().getTitle()));
    }

    public static final void OLrzqt(int i, C51572vpZ c51572vpZ, android.view.View view) {
        java.lang.String type;
        HomeSignalType homeSignalTypeOLrzqt;
        if (i != 0) {
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            C51526vog c51526vog = (C51526vog) CollectionsKt___CollectionsKt.AkhnZx(c51572vpZ.copydefault(), i);
            if (c51526vog == null || (homeSignalTypeOLrzqt = c51526vog.OLrzqt()) == null || (type = homeSignalTypeOLrzqt.getType()) == null) {
                type = "";
            }
            C55867xrz.signalMarketPlaceClickEvent$default(c55867xrz, type, c51572vpZ.dxcTrN().AEQbTJ().getValue(), null, 4, null);
        }
    }

    private final void gEmmrt() {
        getParentFragmentManager().setFragmentResultListener("refresh_bot_action", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51572vpZ.AEQbTJ(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C51572vpZ c51572vpZ, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c51572vpZ.getChildFragmentManager().setFragmentResult(str, bundle);
    }

    public final java.util.List<C51526vog> copydefault() {
        java.util.List<HomeSignalType> listAEQbTJ = HomeSignalType.Companion.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(new C51526vog((HomeSignalType) it.next()));
        }
        return arrayList;
    }

    private final void KWHzl() {
        android.view.View childAt = gGvvIC().copydefault.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setItemViewCacheSize(copydefault().size() - 1);
    }
}
