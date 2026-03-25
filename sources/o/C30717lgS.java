package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.PricingTokenItemBinder$1;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lgS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30717lgS extends AbstractC25436iwg<UIPricingToken, hHQ> {
    public final Function1<UIPricingToken, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30717lgS(@NotNull Function1<? super UIPricingToken, Unit> function1) {
        super(PricingTokenItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    public static final Unit OLrzqt(C30717lgS c30717lgS, UIPricingToken uIPricingToken, UIPricingToken uIPricingToken2) {
        Intrinsics.checkNotNullParameter(uIPricingToken2, "");
        c30717lgS.EZpvd.invoke(uIPricingToken);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHQ> c25435iwf, @NotNull final UIPricingToken uIPricingToken) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(uIPricingToken, "");
        OLrzqt((hHQ) c25435iwf.EZpvd(), uIPricingToken, new Function1() { // from class: o.lgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30717lgS.OLrzqt(this.copydefault, uIPricingToken, (UIPricingToken) obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, UIPricingToken uIPricingToken, android.view.View view) {
        function1.invoke(uIPricingToken);
    }

    public final void OLrzqt(hHQ hhq, final UIPricingToken uIPricingToken, final Function1<? super UIPricingToken, Unit> function1) {
        hhq.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30717lgS.copydefault(function1, uIPricingToken, view);
            }
        });
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = uIPricingToken.EZpvd();
        hhq.copydefault.setText(dexMultiTokenInfoBeanEZpvd.getTokenSymbol());
        hhq.EZpvd.setText(dexMultiTokenInfoBeanEZpvd.getTokenName());
        hhq.AhwBna.setText(C23271hvA.getShowData$default(C23271hvA.copydefault, dexMultiTokenInfoBeanEZpvd.getAmountNum(), false, null, false, false, 22, null));
        hhq.AYXKKw.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, dexMultiTokenInfoBeanEZpvd.getCurrencyAmount(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        android.widget.ImageView imageView = hhq.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(uIPricingToken.OLrzqt() ^ true ? 4 : 0);
        hhq.AEQbTJ.AEQbTJ(dexMultiTokenInfoBeanEZpvd.getTokenLogoUrl(), dexMultiTokenInfoBeanEZpvd.getChainLogoUrl());
        hhq.getRoot().setContentDescription(dexMultiTokenInfoBeanEZpvd.tokenListItemAccessibilityId());
    }
}
