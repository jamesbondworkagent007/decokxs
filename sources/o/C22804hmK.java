package o;

import com.okinc.business.dexlogic.bean.QuotePriceRes;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22804hmK extends AbstractC22802hmI {
    public final AbstractC23101hrq AEQbTJ;
    public final java.lang.String KWHzl;

    public C22804hmK(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.KWHzl = str;
        this.AEQbTJ = abstractC23101hrq;
    }

    @Override // o.AbstractC22802hmI
    public C22803hmJ EZpvd(@NotNull android.content.Context context) {
        java.lang.String countDownText$default;
        Intrinsics.checkNotNullParameter(context, "");
        QuotePriceRes quotePriceResAxsJAYsNCnLh = this.AEQbTJ.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null) {
            return new C22803hmJ(false, "--", "--", "--" + context.getString(C23274hvD.Fragment.gdLjtZ), 1, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) quotePriceResAxsJAYsNCnLh.estimatedTime())) {
            countDownText$default = C23311hvo.setCountDownText$default(C33129mqd.AhwBna(quotePriceResAxsJAYsNCnLh.estimatedTime()), false, 2, null);
        } else {
            countDownText$default = "--" + context.getString(C23274hvD.Fragment.gdLjtZ);
        }
        return new C22803hmJ(false, C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, quotePriceResAxsJAYsNCnLh.networkFeeOfNativeToken(), quotePriceResAxsJAYsNCnLh.getCommonDexInfo().getFromNativeTokenSymbol(), false, null, false, false, 60, null), this.AEQbTJ.wlaJM().copydefault(quotePriceResAxsJAYsNCnLh) ? "--" : this.AEQbTJ.wlaJM().EZpvd(quotePriceResAxsJAYsNCnLh, this.KWHzl, false), countDownText$default, 1, null);
    }
}
