package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.MemeSimpleDexData;
import com.okinc.business.dexlogic.main.swap.trade.bean.MemeStateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.DexDialogException;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C25383ivg {
    @yCM
    public C25383ivg() {
    }

    public final void OLrzqt(@NotNull MemeStateData memeStateData) {
        Intrinsics.checkNotNullParameter(memeStateData, "");
        try {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                java.lang.String userWalletAddress = memeStateData.getUserWalletAddress();
                KWHzl(activityAEQbTJ, memeStateData);
                if (memeStateData.getSuccess()) {
                    C23243huZ.KWHzl(userWalletAddress);
                } else {
                    C23243huZ.EZpvd(userWalletAddress);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String userWalletAddress2 = memeStateData.getUserWalletAddress();
            C6777aVl.Companion.EZpvd(new DexDialogException(userWalletAddress2 + e + C23307hvk.KWHzl()));
        }
    }

    public final void copydefault(@NotNull MemeSimpleDexData memeSimpleDexData) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(memeSimpleDexData, "");
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            C55097xdX c55097xdX = new C55097xdX(activityAEQbTJ, null, 0, 4, null);
            c55097xdX.setState(2);
            java.util.List listGEmmrt = yDY.gEmmrt(memeSimpleDexData.getFromAmount(), memeSimpleDexData.getToAmount(), memeSimpleDexData.getFromTokenSymbol(), memeSimpleDexData.getToTokenSymbol());
            if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
                int i = C23274hvD.Fragment.OnBackPressedDispatcher2;
                C23271hvA c23271hvA = C23271hvA.copydefault;
                java.lang.String fromAmount = memeSimpleDexData.getFromAmount();
                RoundingMode roundingMode = RoundingMode.DOWN;
                string = C33069mpW.KWHzl(activityAEQbTJ, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromCount", C23271hvA.formatTokenCode$default(c23271hvA, fromAmount, false, roundingMode, false, null, null, 29, null)), C56390yDp.OLrzqt("fromToken", memeSimpleDexData.getFromTokenSymbol()), C56390yDp.OLrzqt("toCount", C23271hvA.formatTokenCode$default(c23271hvA, memeSimpleDexData.getToAmount(), false, roundingMode, false, null, null, 29, null)), C56390yDp.OLrzqt("toToken", memeSimpleDexData.getToTokenSymbol())));
            } else {
                java.util.Iterator it = listGEmmrt.iterator();
                while (it.hasNext()) {
                    if (((java.lang.String) it.next()).length() == 0) {
                        string = activityAEQbTJ.getString(C23274hvD.Fragment.MediaSessionCompatApi21CallbackProxy);
                        break;
                    }
                }
                int i2 = C23274hvD.Fragment.OnBackPressedDispatcher2;
                C23271hvA c23271hvA2 = C23271hvA.copydefault;
                java.lang.String fromAmount2 = memeSimpleDexData.getFromAmount();
                RoundingMode roundingMode2 = RoundingMode.DOWN;
                string = C33069mpW.KWHzl(activityAEQbTJ, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromCount", C23271hvA.formatTokenCode$default(c23271hvA2, fromAmount2, false, roundingMode2, false, null, null, 29, null)), C56390yDp.OLrzqt("fromToken", memeSimpleDexData.getFromTokenSymbol()), C56390yDp.OLrzqt("toCount", C23271hvA.formatTokenCode$default(c23271hvA2, memeSimpleDexData.getToAmount(), false, roundingMode2, false, null, null, 29, null)), C56390yDp.OLrzqt("toToken", memeSimpleDexData.getToTokenSymbol())));
            }
            Intrinsics.copydefault((java.lang.Object) string);
            c55097xdX.setTitle(string);
            c55097xdX.setCloseBtnShow(false);
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.app.Activity activity, MemeStateData memeStateData) {
        int noticeState;
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        c55097xdX.setState(4);
        if (memeStateData.getNoticeState() == 5) {
            noticeState = memeStateData.getNoticeState();
        } else if (memeStateData.getNoticeState() == 1) {
            c55097xdX.setLeadingIcon(c55097xdX.getContext().getDrawable(C52761wXj.TaskDescription.ORWKdN));
            noticeState = memeStateData.getNoticeState();
        } else if (memeStateData.isSolanaPost()) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(activity, C52761wXj.TaskDescription.RXzakW);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(activity, C52761wXj.Activity.fdOvFl));
            } else {
                drawable = null;
            }
            c55097xdX.setLeadingIcon(drawable);
            noticeState = 1;
        } else {
            RetryMemeParams memeRetry = memeStateData.getMemeRetry();
            if (memeRetry == null || !memeRetry.isMemeTimeOut()) {
                if (memeStateData.getSuccess()) {
                    noticeState = 2;
                } else {
                    noticeState = Intrinsics.EZpvd((java.lang.Object) memeStateData.getStatus(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) ? 3 : 0;
                }
            }
        }
        c55097xdX.setState(noticeState);
        if (memeStateData.getHasSurplus() && memeStateData.getSuccess() && C22416heu.zsXlph()) {
            C25353ivC.EZpvd(c55097xdX, memeStateData.getSurplusAmount(), memeStateData.getFromTokenSymbol(), memeStateData.getToTokenSymbol());
        } else {
            c55097xdX.setTitle(memeStateData.getContent());
        }
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }
}
