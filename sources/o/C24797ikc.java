package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexui.main.swap.trade.input.widget.CrossValueDifferenceData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24797ikc extends android.widget.FrameLayout {
    public hFU OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24797ikc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24797ikc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24797ikc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24797ikc(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void KWHzl() {
        this.OLrzqt = hFU.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final void OLrzqt(@NotNull CrossValueDifferenceData crossValueDifferenceData) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(crossValueDifferenceData, "");
        if (!crossValueDifferenceData.isIntentBridge()) {
            hFU hfu = this.OLrzqt;
            if (hfu != null) {
                hfu.copydefault.setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), crossValueDifferenceData.getOpenServiceFee() ? C23274hvD.Fragment.release : C23274hvD.Fragment.RhlVAI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, crossValueDifferenceData.getBridgeName()), C56390yDp.OLrzqt("value", crossValueDifferenceData.getPricebridge()), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, crossValueDifferenceData.getBridgeFee()), C56390yDp.OLrzqt("symbol", crossValueDifferenceData.getSymbolOne()), C56390yDp.OLrzqt("toChain", crossValueDifferenceData.getChainName()))));
                return;
            }
            return;
        }
        hFU hfu2 = this.OLrzqt;
        if (hfu2 == null || (textView = hfu2.copydefault) == null) {
            return;
        }
        textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.isCaptioningEnabled));
    }
}
