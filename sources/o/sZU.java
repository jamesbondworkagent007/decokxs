package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.okmarket.home.MarketHomeSubPage;
import java.lang.ref.WeakReference;
import java.util.EnumMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZU extends FragmentStateAdapter implements mAR, pWJ {
    public final java.util.List<MarketHomeSubPage> AEQbTJ;
    public final android.view.ViewGroup EZpvd;
    public final EnumMap<MarketHomeSubPage, WeakReference<androidx.fragment.app.Fragment>> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.okmarket.home.MarketHomeSubPage> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sZU(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull android.view.ViewGroup viewGroup, @NotNull java.util.List<? extends MarketHomeSubPage> list) {
        super(fragmentManager, fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = viewGroup;
        this.AEQbTJ = list;
        this.KWHzl = new EnumMap<>(MarketHomeSubPage.class);
    }

    public final androidx.fragment.app.Fragment copydefault(int i) {
        WeakReference<androidx.fragment.app.Fragment> weakReference;
        MarketHomeSubPage marketHomeSubPage = (MarketHomeSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        if (marketHomeSubPage == null || (weakReference = this.KWHzl.get(marketHomeSubPage)) == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(OLrzqt());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }

    @Override // o.pWJ
    public int OLrzqt() {
        return this.AEQbTJ.size();
    }

    public final java.lang.CharSequence EZpvd(int i) {
        java.lang.String strAYXKKw;
        MarketHomeSubPage marketHomeSubPage = (MarketHomeSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        return (marketHomeSubPage == null || (strAYXKKw = C33070mpX.AYXKKw(marketHomeSubPage.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final int KWHzl(int i) {
        MarketHomeSubPage marketHomeSubPage = (MarketHomeSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        if (marketHomeSubPage != null) {
            return marketHomeSubPage.getTitleResId();
        }
        return 0;
    }

    public final java.lang.String AEQbTJ(int i) {
        java.lang.String e2eContentDescription;
        MarketHomeSubPage marketHomeSubPage = (MarketHomeSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        return (marketHomeSubPage == null || (e2eContentDescription = marketHomeSubPage.getE2eContentDescription()) == null) ? "" : e2eContentDescription;
    }

    @Override // o.pWJ
    public java.lang.String OLrzqt(int i) {
        java.lang.String pageType;
        MarketHomeSubPage marketHomeSubPage = (MarketHomeSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        return (marketHomeSubPage == null || (pageType = marketHomeSubPage.getPageType()) == null) ? "" : pageType;
    }

    public final mAS EZpvd() {
        return new StateListAnimator(C33570myu.AEQbTJ(), C33518mxv.EZpvd(C32979mnm.EZpvd.OLrzqt(), 448.0f));
    }

    @Override // o.mAR
    public java.util.List<mAS> KWHzl() {
        int itemCount = getItemCount() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(getItemCount());
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                java.lang.Object objCopydefault = copydefault(i);
                if (objCopydefault == null) {
                    objCopydefault = EZpvd();
                }
                Intrinsics.copydefault(objCopydefault, "");
                arrayList.add((mAS) objCopydefault);
                if (i == itemCount) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public final class StateListAnimator implements mAS {
        public final float AEQbTJ;
        public final float KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mAS
        public float AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mAS
        public float EZpvd() {
            return this.AEQbTJ;
        }

        public StateListAnimator(float f, float f2) {
            this.KWHzl = f;
            this.AEQbTJ = f2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        MarketHomeSubPage marketHomeSubPage = (MarketHomeSubPage) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        if (marketHomeSubPage != null) {
            EnumMap<MarketHomeSubPage, WeakReference<androidx.fragment.app.Fragment>> enumMap = this.KWHzl;
            WeakReference<androidx.fragment.app.Fragment> weakReference = enumMap.get(marketHomeSubPage);
            if (weakReference == null) {
                weakReference = new WeakReference<>(marketHomeSubPage.createFragment());
                enumMap.put(marketHomeSubPage, weakReference);
            }
            androidx.fragment.app.Fragment fragmentCreateFragment = weakReference.get();
            if (fragmentCreateFragment == null) {
                fragmentCreateFragment = marketHomeSubPage.createFragment();
            }
            if (fragmentCreateFragment != null) {
                return fragmentCreateFragment;
            }
        }
        return new androidx.fragment.app.Fragment();
    }

    @Override // o.pWJ
    public int OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<MarketHomeSubPage> it = this.AEQbTJ.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) it.next().getPageType(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }
}
