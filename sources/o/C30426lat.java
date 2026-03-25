package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.business.market.widget.tag.TagEventSource;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30426lat extends AbstractC30424lar<C28375kZb, C22317hdA> {
    public final Function1<DexMultiTokenInfoBean, Unit> AEQbTJ;
    public final androidx.fragment.app.FragmentManager EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30426lat(@NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1, @NotNull Function1<? super DexMultiTokenInfoBean, Unit> function12, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        super(function1);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.AEQbTJ = function12;
        this.EZpvd = fragmentManager;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C22317hdA KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C22317hdA c22317hdAEZpvd = C22317hdA.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c22317hdAEZpvd, "");
        return c22317hdAEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;Lo/kYY;)V */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC30424lar, o.AbstractC31189lpN
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull final C22317hdA c22317hdA, @NotNull C28375kZb c28375kZb) {
        Intrinsics.checkNotNullParameter(c22317hdA, "");
        Intrinsics.checkNotNullParameter(c28375kZb, "");
        super.KWHzl(c22317hdA, c28375kZb);
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = c28375kZb.EZpvd();
        c22317hdA.gEmmrt.AEQbTJ(dexMultiTokenInfoBeanEZpvd.getTokenLogoUrl(), dexMultiTokenInfoBeanEZpvd.getChainLogoUrl());
        c22317hdA.fetchVPNInfo.setText(EZpvd(dexMultiTokenInfoBeanEZpvd.getTokenSymbol(), c28375kZb.OLrzqt()));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dexMultiTokenInfoBeanEZpvd.getTokenName())) {
            c22317hdA.AkhnZx.setText(C25352ivB.formatAddress$default(dexMultiTokenInfoBeanEZpvd.getOriginContractAddress(), 6, 4, null, 4, null));
            c22317hdA.isConnected.setText(dexMultiTokenInfoBeanEZpvd.getTokenName());
        } else {
            c22317hdA.isConnected.setText(C25352ivB.formatAddress$default(dexMultiTokenInfoBeanEZpvd.getOriginContractAddress(), 6, 4, null, 4, null));
        }
        android.view.View view = c22317hdA.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility((C33129mqd.OLrzqt((java.lang.CharSequence) dexMultiTokenInfoBeanEZpvd.getTokenName()) && C33129mqd.OLrzqt((java.lang.CharSequence) dexMultiTokenInfoBeanEZpvd.getOriginContractAddress()) && !dexMultiTokenInfoBeanEZpvd.isMainChainCoin()) ? 0 : 8);
        AppCompatTextView appCompatTextView = c22317hdA.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility((C33129mqd.OLrzqt((java.lang.CharSequence) dexMultiTokenInfoBeanEZpvd.getTokenName()) && C33129mqd.OLrzqt((java.lang.CharSequence) dexMultiTokenInfoBeanEZpvd.getOriginContractAddress()) && !dexMultiTokenInfoBeanEZpvd.isMainChainCoin()) ? 0 : 8);
        if (c28375kZb.OLrzqt().length() == 0) {
            Group group = c22317hdA.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
        } else {
            Group group2 = c22317hdA.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(0);
            c22317hdA.djBIcL.setText(C33069mpW.copydefault(C22366hdx.StateListAnimator.AxsJAY, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(dexMultiTokenInfoBeanEZpvd.getLiquidity(), false, null, true, false, 11, null)))));
            c22317hdA.values.setText(C33069mpW.copydefault(C22366hdx.StateListAnimator.sSMYrx, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(dexMultiTokenInfoBeanEZpvd.getVolume(), false, null, true, false, 11, null)))));
        }
        c22317hdA.AYXKKw.setText(C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(dexMultiTokenInfoBeanEZpvd.getCurrencyAmount(), false, null, true, false, 11, null));
        c22317hdA.AhwBna.setText(copydefault(dexMultiTokenInfoBeanEZpvd));
        if (dexMultiTokenInfoBeanEZpvd.isCollect()) {
            c22317hdA.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq)));
            c22317hdA.EZpvd.setImageResource(C22366hdx.Application.djBIcL);
        } else {
            c22317hdA.EZpvd.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab)));
            c22317hdA.EZpvd.setImageResource(C22366hdx.Application.gEmmrt);
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c22317hdA.EZpvd, 0L, new Function1() { // from class: o.laq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30426lat.copydefault(c22317hdA, this, (android.view.View) obj);
            }
        }, 1, null);
        java.util.List<TagWrapper> listCopydefault = c28375kZb.copydefault();
        C28067kNr.setTags$default(c22317hdA.AEQbTJ, listCopydefault, false, dexMultiTokenInfoBeanEZpvd.isHighRisk(), new Function1() { // from class: o.lau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30426lat.EZpvd(dexMultiTokenInfoBeanEZpvd, this, (java.util.List) obj);
            }
        }, null, 18, null);
        int size = listCopydefault.size();
        int iDpInt$default = C55298xhM.dpInt$default(18, (android.content.Context) null, 1, (java.lang.Object) null);
        c22317hdA.fetchVPNInfo.setMaxWidth((C55298xhM.dpInt$default(150, (android.content.Context) null, 1, (java.lang.Object) null) - (size * iDpInt$default)) - C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
        c22317hdA.getRoot().setContentDescription(c28375kZb.EZpvd().tokenListItemAccessibilityId());
    }

    public static final Unit copydefault(C22317hdA c22317hdA, C30426lat c30426lat, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = c22317hdA.getRoot().getTag();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = tag instanceof DexMultiTokenInfoBean ? (DexMultiTokenInfoBean) tag : null;
        if (dexMultiTokenInfoBean != null) {
            c30426lat.AEQbTJ.invoke(dexMultiTokenInfoBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, C30426lat c30426lat, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C29717kys.Companion.EZpvd(new TagExplanationBottomSheetParams(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress(), false, null, TagEventSource.TOKEN_DETAIL, false, 44, null)).show(c30426lat.EZpvd);
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (C23313hvq.valueOf(dexMultiTokenInfoBean.getAmountNum(), 0)) {
            return pTB.formatLocalizedWithMinPrecision$default("0.00", 2, null, 2, null);
        }
        return C23322hvz.toLocalizedNumber$default(dexMultiTokenInfoBean.getAmountNum(), false, (RoundingMode) null, true, false, 11, (java.lang.Object) null);
    }
}
