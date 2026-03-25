package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC56005xue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48100uEz implements InterfaceC56005xue {
    public static final int KWHzl = AiOrderReq.$stable;
    public final java.lang.String EZpvd;
    public final AiOrderReq copydefault;

    @Override // o.InterfaceC56005xue
    public LiveData<java.util.List<Distribution>> OLrzqt() {
        return null;
    }

    public C48100uEz(@NotNull AiOrderReq aiOrderReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(aiOrderReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = aiOrderReq;
        this.EZpvd = str;
    }

    @Override // o.InterfaceC56005xue
    public void EZpvd(@NotNull java.lang.Object obj) {
        InterfaceC56005xue.ActionBar.AEQbTJ(this, obj);
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String EZpvd() {
        return this.copydefault.getQuoteCcy();
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String KWHzl() {
        return C56033xvF.fmtBotValueBySymbol$default(this.copydefault.getQuoteCcy(), this.copydefault.getTotalAmt(), null, true, null, false, null, null, null, null, null, 2036, null);
    }

    @Override // o.InterfaceC56005xue
    public java.util.List<java.lang.Object> AEQbTJ() {
        java.lang.Object vta;
        java.lang.String slRatio;
        java.lang.String strAYXKKw;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = new TacticsInsideItemData(C33070mpX.AYXKKw(C48033uCm.Fragment.ffGIBT), this.copydefault.getAiModel(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, this.EZpvd, 65532, null);
        objArr[1] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.siEkQe), Intrinsics.EZpvd((java.lang.Object) this.copydefault.getInstType(), (java.lang.Object) "SPOT") ? C33070mpX.AYXKKw(C48033uCm.Fragment.iHkeWl) : C33070mpX.AYXKKw(C48033uCm.Fragment.UccSpe), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        if (this.copydefault.getInstIds().size() <= 1) {
            vta = new TacticsInsideItemData(C33070mpX.AYXKKw(C48033uCm.Fragment.iZzfmt), C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(this.copydefault.getInstIds()), this.copydefault.getInstType(), false, false, 12, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        } else {
            vta = new vTA(this.copydefault.getInstIds(), this.copydefault.getInstType());
        }
        objArr[2] = vta;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.onCommand);
        java.lang.String tpRatio = this.copydefault.getTpRatio();
        if ((tpRatio == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpRatio)) && ((slRatio = this.copydefault.getSlRatio()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slRatio))) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
        } else {
            strAYXKKw = C33069mpW.copydefault(C48033uCm.Fragment.AxsJAYsNCnLh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tpPct", EZpvd(this.copydefault.getTpRatio())), C56390yDp.OLrzqt("slPct", EZpvd(this.copydefault.getSlRatio()))));
        }
        objArr[3] = new TacticsInsideItemData(strAYXKKw2, strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        return yDY.gEmmrt(objArr);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return xVG.formatPercent$default(str, null, null, DisplaySign.AUTO, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 19, null);
    }
}
