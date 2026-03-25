package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheetParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kiI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28833kiI extends FragmentStateAdapter {
    public final TokenDetailBottomSheetParams EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28833kiI(@NotNull androidx.fragment.app.Fragment fragment, @NotNull TokenDetailBottomSheetParams tokenDetailBottomSheetParams) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(tokenDetailBottomSheetParams, "");
        this.EZpvd = tokenDetailBottomSheetParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.AEQbTJ().size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        if (i < 0 || i >= this.EZpvd.AEQbTJ().size()) {
            return C28841kiQ.Companion.AEQbTJ(this.EZpvd.copydefault(), new TokenDetailTabData.TokenTab(null, null, false, null, 15, null));
        }
        TokenDetailTabData tokenDetailTabData = this.EZpvd.AEQbTJ().get(i);
        if (tokenDetailTabData instanceof TokenDetailTabData.TokenTab) {
            return C28841kiQ.Companion.AEQbTJ(this.EZpvd.copydefault(), (TokenDetailTabData.TokenTab) tokenDetailTabData);
        }
        if (tokenDetailTabData instanceof TokenDetailTabData.SocialTab) {
            return C28873kiw.Companion.AEQbTJ(this.EZpvd.copydefault(), (TokenDetailTabData.SocialTab) tokenDetailTabData);
        }
        if (tokenDetailTabData instanceof TokenDetailTabData.DataTab) {
            return C28786khO.Companion.copydefault(this.EZpvd.copydefault(), (TokenDetailTabData.DataTab) tokenDetailTabData);
        }
        if (tokenDetailTabData instanceof TokenDetailTabData.TagExplanationTab) {
            TokenDetailTabData.TagExplanationTab tagExplanationTab = (TokenDetailTabData.TagExplanationTab) tokenDetailTabData;
            return C29721kyw.Companion.copydefault(new TagExplanationBottomSheetParams(this.EZpvd.copydefault().KWHzl(), this.EZpvd.copydefault().djBIcL(), tagExplanationTab.KWHzl(), tagExplanationTab.copydefault(), tagExplanationTab.OLrzqt(), true));
        }
        if (!(tokenDetailTabData instanceof TokenDetailTabData.DevTokenTab)) {
            throw new NoWhenBranchMatchedException();
        }
        return C28793khV.Companion.OLrzqt(this.EZpvd.copydefault(), (TokenDetailTabData.DevTokenTab) tokenDetailTabData);
    }
}
