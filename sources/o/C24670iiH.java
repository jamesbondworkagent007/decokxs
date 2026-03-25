package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iiH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24670iiH extends AbstractC24712iix {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24670iiH(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    public boolean AYXKKw() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = copydefault().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            return quotePriceResAxsJAYsNCnLh.showEthCrossRiskHint();
        }
        return false;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.RzdrRQ);
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        return valueOf();
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zAYXKKw = AYXKKw();
        if (zAYXKKw) {
            AbstractC24712iix.showCheckDialog$default(this, fragmentManager, C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags, C23274hvD.Fragment.DwQSDd, 0, 0, function0, null, null, null, 472, null);
        }
        return zAYXKKw;
    }

    public final java.lang.String valueOf() {
        java.lang.String tokenSymbol;
        DexMultiTokenInfoBean token;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = copydefault().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null || (token = quotePriceResAxsJAYsNCnLh.toToken()) == null || (tokenSymbol = token.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.RqmePg, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenSymbol", tokenSymbol)));
    }
}
