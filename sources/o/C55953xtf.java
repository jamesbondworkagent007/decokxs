package o;

import androidx.camera.video.AudioStats;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridProfitDetailsResponse;
import com.okinc.unify_trade.bot.data.ProDetailData;
import com.okinc.unify_trade.bot.data.ProfitDetailData;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.xtf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55953xtf implements InterfaceC54501xKt<java.util.List<? extends GridProfitDetailsResponse>, ProfitDetailData> {
    public java.lang.String EZpvd = "";
    public java.lang.String copydefault = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String KWHzl = "";
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ ProfitDetailData KWHzl(java.util.List<? extends GridProfitDetailsResponse> list) {
        return copydefault((java.util.List<GridProfitDetailsResponse>) list);
    }

    public ProfitDetailData copydefault(@NotNull java.util.List<GridProfitDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        GridProfitDetailsResponse gridProfitDetailsResponse = (GridProfitDetailsResponse) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new ProDetailData(C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent), getProfitString$default(this, this.copydefault, this.OLrzqt, gridProfitDetailsResponse.getQuoteTotalPro(), this.KWHzl, false, 16, null), getProfitString$default(this, this.copydefault, this.OLrzqt, gridProfitDetailsResponse.getBaseTotalProfit(), this.AEQbTJ, false, 16, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null));
        arrayList.add(new ProDetailData(C33070mpX.AYXKKw(C55688xof.Application.invalidateOptionsMenu), getProfitString$default(this, this.copydefault, this.OLrzqt, gridProfitDetailsResponse.getQuoteExtractAmount(), this.KWHzl, false, 16, null), getProfitString$default(this, this.copydefault, this.OLrzqt, gridProfitDetailsResponse.getBaseExtractAmount(), this.AEQbTJ, false, 16, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null));
        arrayList.add(new ProDetailData(C33070mpX.AYXKKw(C55688xof.Application.getSubtitle), getProfitString$default(this, this.copydefault, this.OLrzqt, gridProfitDetailsResponse.getUtilizedAmount(), this.KWHzl, false, 16, null), (java.lang.String) null, C33070mpX.AYXKKw(C55688xof.Application.getTitle), C33070mpX.AYXKKw(C55688xof.Application.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A), C33070mpX.AYXKKw(C55688xof.Application.MediaDescriptionCompat1), 4, (DefaultConstructorMarker) null));
        return new ProfitDetailData(this.EZpvd, this.KWHzl, gridProfitDetailsResponse.getQuoteWithdrawableAmount(), arrayList, (java.lang.String) null, this.copydefault, this.OLrzqt, (kotlin.Pair) null, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ java.lang.String getProfitString$default(C55953xtf c55953xtf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        java.lang.String str5 = str4;
        if ((i & 16) != 0) {
            z = true;
        }
        return c55953xtf.copydefault(str, str2, str3, str5, z);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        java.lang.String strAEQbTJ = C56068xvo.copydefault.AEQbTJ(str, str2, str3, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : false, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "--") || C33129mqd.AEQbTJ(strAEQbTJ) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (!Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null))) {
                strAEQbTJ = "";
            }
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            return "";
        }
        if (!z) {
            return strAEQbTJ;
        }
        return strAEQbTJ + " " + str4;
    }
}
