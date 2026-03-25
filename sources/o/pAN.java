package o;

import androidx.lifecycle.ViewModel;
import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.kline.news.data.KlineCampaignData;
import com.okinc.kline.ui.view.model.KlineReferralViewModel$requestCampaign$2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pAN extends ViewModel {
    public KlineCampaignData EZpvd;
    public final java.lang.String copydefault = "KlineReferralViewModel";
    public java.lang.String AEQbTJ = "";
    public java.lang.String KWHzl = "";
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineCampaignData AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super KlineActiveListData> continuation) {
        return BuildersKt.withContext(C37943pGl.OLrzqt.OLrzqt(), new KlineReferralViewModel$requestCampaign$2(this, null), continuation);
    }

    public final void EZpvd(KlineActiveListData klineActiveListData) {
        java.util.ArrayList<KlineCampaignData> campaign;
        this.EZpvd = (klineActiveListData == null || (campaign = klineActiveListData.getCampaign()) == null) ? null : (KlineCampaignData) CollectionsKt___CollectionsKt.firstOrNull(campaign);
    }
}
