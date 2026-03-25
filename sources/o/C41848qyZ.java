package o;

import androidx.core.os.BundleKt;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchSubPage;
import com.okinc.market.search.features.favorite.ui.adapter.FavoriteSearchPageResult;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qyZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41848qyZ extends AbstractC32997moD {
    public java.util.ArrayList<FavoriteSearchPageResult> OLrzqt;

    @Override // o.AbstractC32997moD
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41848qyZ(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.OLrzqt = new java.util.ArrayList<>();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.OLrzqt.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        FavoriteSearchSubPage page;
        java.lang.String strAYXKKw;
        FavoriteSearchSubPage page2;
        java.lang.String strAYXKKw2;
        FavoriteSearchPageResult favoriteSearchPageResult = (FavoriteSearchPageResult) CollectionsKt___CollectionsKt.AkhnZx(this.OLrzqt, i);
        java.lang.String str = "";
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (favoriteSearchPageResult != null ? favoriteSearchPageResult.getKeywords() : null))) {
            return (favoriteSearchPageResult == null || (page = favoriteSearchPageResult.getPage()) == null || (strAYXKKw = C33070mpX.AYXKKw(page.getTitleResId())) == null) ? "" : strAYXKKw;
        }
        if (favoriteSearchPageResult != null && (page2 = favoriteSearchPageResult.getPage()) != null && (strAYXKKw2 = C33070mpX.AYXKKw(page2.getTitleResId())) != null) {
            str = strAYXKKw2;
        }
        return str + " (" + (favoriteSearchPageResult != null ? java.lang.Integer.valueOf(favoriteSearchPageResult.getCount()) : null) + ")";
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        FavoriteSearchPageResult favoriteSearchPageResult = (FavoriteSearchPageResult) CollectionsKt___CollectionsKt.AkhnZx(this.OLrzqt, i);
        FavoriteSearchSubPage page = favoriteSearchPageResult != null ? favoriteSearchPageResult.getPage() : null;
        if (page != null && (fragmentCreateFragment = page.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("SUB_TYPE", page.name())));
            return fragmentCreateFragment;
        }
        return new androidx.fragment.app.Fragment();
    }

    public final void OLrzqt(@NotNull java.util.List<FavoriteSearchPageResult> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        notifyDataSetChanged();
    }
}
