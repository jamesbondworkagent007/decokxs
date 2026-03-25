package o;

import com.okinc.business.dexlogic.bean.QuotePriceRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22816hmW extends AbstractC22801hmH {
    public final AbstractC23101hrq AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22816hmW(@NotNull AbstractC23101hrq abstractC23101hrq) {
        super(abstractC23101hrq);
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.AEQbTJ = abstractC23101hrq;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.RlQdEF().getQuotePriceOnce(str, copydefault());
    }

    public final java.lang.String copydefault() {
        return this.AEQbTJ.AuCTelauCTel().KWHzl();
    }

    public final java.lang.String EZpvd() {
        java.lang.String second;
        kotlin.Pair<java.lang.String, java.lang.String> value = this.AEQbTJ.gkJEwt().getValue();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (value != null ? value.getSecond() : null))) {
            kotlin.Pair<java.lang.String, java.lang.String> value2 = this.AEQbTJ.gkJEwt().getValue();
            if (Intrinsics.EZpvd((java.lang.Object) (value2 != null ? value2.getFirst() : null), (java.lang.Object) this.AEQbTJ.QUSxYX().AEQbTJ())) {
                kotlin.Pair<java.lang.String, java.lang.String> value3 = this.AEQbTJ.gkJEwt().getValue();
                return (value3 == null || (second = value3.getSecond()) == null) ? this.AEQbTJ.QUSxYX().EZpvd() : second;
            }
        }
        return this.AEQbTJ.QUSxYX().EZpvd();
    }

    public final AbstractC22802hmI OLrzqt() {
        return this.AEQbTJ.flVtFt().EZpvd(this.AEQbTJ);
    }

    public final C22333hdQ KWHzl() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = this.AEQbTJ.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            return quotePriceResAxsJAYsNCnLh.getEstimateBridgeFeeAmount();
        }
        return null;
    }

    public final C22337hdU AEQbTJ() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = this.AEQbTJ.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            return quotePriceResAxsJAYsNCnLh.getEstimateGasFeeAmount(this.AEQbTJ.fdOvFl());
        }
        return null;
    }
}
