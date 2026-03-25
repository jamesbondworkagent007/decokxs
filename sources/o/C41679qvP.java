package o;

import androidx.core.os.BundleKt;
import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41679qvP extends qYA<AbstractC41702qvm> {
    public final RankingSubPage EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41679qvP(@NotNull androidx.fragment.app.Fragment fragment, @NotNull RankingSubPage rankingSubPage) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(rankingSubPage, "");
        this.EZpvd = rankingSubPage;
    }

    @Override // o.qYA, androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        AbstractC41702qvm abstractC41702qvmAEQbTJ = AEQbTJ(i);
        if (abstractC41702qvmAEQbTJ != null && (fragmentCreateFragment = abstractC41702qvmAEQbTJ.createFragment()) != null) {
            RankingSubPage rankingSubPage = this.EZpvd;
            RankingSubPage rankingSubPage2 = RankingSubPage.RANKING_NEW_LISTINGS;
            if (rankingSubPage != rankingSubPage2) {
                return fragmentCreateFragment;
            }
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(RankingSubPage.class.getSimpleName(), rankingSubPage2)));
            return fragmentCreateFragment;
        }
        return new androidx.fragment.app.Fragment();
    }

    public final java.lang.CharSequence EZpvd(int i) {
        java.lang.String strAYXKKw;
        AbstractC41702qvm abstractC41702qvmAEQbTJ = AEQbTJ(i);
        return (abstractC41702qvmAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(abstractC41702qvmAEQbTJ.AEQbTJ())) == null) ? "" : strAYXKKw;
    }

    public final java.lang.String OLrzqt(int i) {
        java.lang.String strCopydefault;
        AbstractC41702qvm abstractC41702qvmAEQbTJ = AEQbTJ(i);
        return (abstractC41702qvmAEQbTJ == null || (strCopydefault = abstractC41702qvmAEQbTJ.copydefault()) == null) ? "" : strCopydefault;
    }
}
