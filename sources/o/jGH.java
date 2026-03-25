package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.market.data.model.alert.AlertPromptType;
import com.okinc.business.market.data.model.alert.AlertTimeFrame;
import com.okinc.business.market.data.model.alert.AlertType;
import com.okinc.business.market.data.model.alert.PromptTypes;
import com.okinc.business.market.features.alert.create.coinselect.tokenlist.data.AlertMarketCapUnit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jGH {

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AlertType.values().length];
            try {
                iArr[AlertType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AlertType.MARKETCAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public final java.util.List<C55276xgr> KWHzl(@NotNull AlertPromptType alertPromptType) {
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        AlertTimeFrame alertTimeFrame = AlertTimeFrame.FIVE_MINUTES;
        C55276xgr c55276xgr = new C55276xgr(C33070mpX.AYXKKw(alertTimeFrame.getTitleResId()), alertTimeFrame, null, yDY.gEmmrt(AlertPromptType.LOSS_EXCEEDS_5MIN, AlertPromptType.GAIN_EXCEEDS_5MIN).contains(alertPromptType), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        AlertTimeFrame alertTimeFrame2 = AlertTimeFrame.ONE_HOUR;
        C55276xgr c55276xgr2 = new C55276xgr(C33070mpX.AYXKKw(alertTimeFrame2.getTitleResId()), alertTimeFrame2, null, yDY.gEmmrt(AlertPromptType.LOSS_EXCEEDS_1H, AlertPromptType.GAIN_EXCEEDS_1H).contains(alertPromptType), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        AlertTimeFrame alertTimeFrame3 = AlertTimeFrame.FOUR_HOURS;
        C55276xgr c55276xgr3 = new C55276xgr(C33070mpX.AYXKKw(alertTimeFrame3.getTitleResId()), alertTimeFrame3, null, yDY.gEmmrt(AlertPromptType.LOSS_EXCEEDS_4H, AlertPromptType.GAIN_EXCEEDS_4H).contains(alertPromptType), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        AlertTimeFrame alertTimeFrame4 = AlertTimeFrame.TWENTY_FOUR_HOURS;
        return yDY.gEmmrt(c55276xgr, c55276xgr2, c55276xgr3, new C55276xgr(C33070mpX.AYXKKw(alertTimeFrame4.getTitleResId()), alertTimeFrame4, null, yDY.gEmmrt(AlertPromptType.LOSS_EXCEEDS_24H, AlertPromptType.GAIN_EXCEEDS_24H).contains(alertPromptType), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
    }

    public static /* synthetic */ java.util.List getTypeSelectionData$default(jGH jgh, AlertPromptType alertPromptType, AlertType alertType, AlertType alertType2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            alertType2 = null;
        }
        return jgh.copydefault(alertPromptType, alertType, alertType2);
    }

    public final java.util.List<C55276xgr> copydefault(@NotNull AlertPromptType alertPromptType, @NotNull AlertType alertType, AlertType alertType2) {
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        int i = alertType2 == null ? -1 : TaskDescription.AEQbTJ[alertType2.ordinal()];
        if (i == 1) {
            return KWHzl(alertPromptType, alertType);
        }
        if (i == 2) {
            return EZpvd(alertPromptType, alertType);
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) EZpvd(alertPromptType, alertType), (java.lang.Iterable) KWHzl(alertPromptType, alertType));
    }

    public final java.util.List<C55276xgr> EZpvd(AlertPromptType alertPromptType, AlertType alertType) {
        C55276xgr[] c55276xgrArr = new C55276xgr[3];
        PromptTypes promptTypes = PromptTypes.MARKETCAP_REACHES;
        c55276xgrArr[0] = new C55276xgr(C33070mpX.AYXKKw(promptTypes.getTitleResId()), promptTypes, null, alertPromptType == AlertPromptType.PRICE_REACHES && alertType == AlertType.MARKETCAP, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        PromptTypes promptTypes2 = PromptTypes.MARKETCAP_MOVE_ABOVE;
        c55276xgrArr[1] = new C55276xgr(C33070mpX.AYXKKw(promptTypes2.getTitleResId()), promptTypes2, null, alertPromptType == AlertPromptType.PRICE_MOVE_ABOVE && alertType == AlertType.MARKETCAP, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        PromptTypes promptTypes3 = PromptTypes.MARKETCAP_MOVE_BELOW;
        c55276xgrArr[2] = new C55276xgr(C33070mpX.AYXKKw(promptTypes3.getTitleResId()), promptTypes3, null, alertPromptType == AlertPromptType.PRICE_MOVE_BELOW && alertType == AlertType.MARKETCAP, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        return yDY.gEmmrt(c55276xgrArr);
    }

    public final java.util.List<C55276xgr> KWHzl(AlertPromptType alertPromptType, AlertType alertType) {
        C55276xgr[] c55276xgrArr = new C55276xgr[5];
        PromptTypes promptTypes = PromptTypes.PRICE_REACHES;
        c55276xgrArr[0] = new C55276xgr(C33070mpX.AYXKKw(promptTypes.getTitleResId()), promptTypes, null, alertPromptType == AlertPromptType.PRICE_REACHES && alertType == AlertType.PRICE, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        PromptTypes promptTypes2 = PromptTypes.PRICE_MOVE_ABOVE;
        c55276xgrArr[1] = new C55276xgr(C33070mpX.AYXKKw(promptTypes2.getTitleResId()), promptTypes2, null, alertPromptType == AlertPromptType.PRICE_MOVE_ABOVE && alertType == AlertType.PRICE, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        PromptTypes promptTypes3 = PromptTypes.PRICE_MOVE_BELOW;
        c55276xgrArr[2] = new C55276xgr(C33070mpX.AYXKKw(promptTypes3.getTitleResId()), promptTypes3, null, alertPromptType == AlertPromptType.PRICE_MOVE_BELOW && alertType == AlertType.PRICE, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        PromptTypes promptTypes4 = PromptTypes.GAIN_EXCEEDS;
        c55276xgrArr[3] = new C55276xgr(C33070mpX.AYXKKw(promptTypes4.getTitleResId()), promptTypes4, null, yDY.gEmmrt(AlertPromptType.GAIN_EXCEEDS_5MIN, AlertPromptType.GAIN_EXCEEDS_1H, AlertPromptType.GAIN_EXCEEDS_4H, AlertPromptType.GAIN_EXCEEDS_24H).contains(alertPromptType), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        PromptTypes promptTypes5 = PromptTypes.LOSS_EXCEEDS;
        c55276xgrArr[4] = new C55276xgr(C33070mpX.AYXKKw(promptTypes5.getTitleResId()), promptTypes5, null, yDY.gEmmrt(AlertPromptType.LOSS_EXCEEDS_5MIN, AlertPromptType.LOSS_EXCEEDS_1H, AlertPromptType.LOSS_EXCEEDS_4H, AlertPromptType.LOSS_EXCEEDS_24H).contains(alertPromptType), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        return yDY.gEmmrt(c55276xgrArr);
    }

    public final java.util.List<C55276xgr> KWHzl(@NotNull AlertMarketCapUnit alertMarketCapUnit) {
        Intrinsics.checkNotNullParameter(alertMarketCapUnit, "");
        C55276xgr[] c55276xgrArr = new C55276xgr[3];
        AlertMarketCapUnit alertMarketCapUnit2 = AlertMarketCapUnit.B;
        c55276xgrArr[0] = new C55276xgr(C33070mpX.AYXKKw(alertMarketCapUnit2.getTitleResId()), alertMarketCapUnit2, C33070mpX.AYXKKw(alertMarketCapUnit2.getDescriptionResId()), alertMarketCapUnit == alertMarketCapUnit2, false, null, alertMarketCapUnit2.getContentDescription(), 48, null);
        AlertMarketCapUnit alertMarketCapUnit3 = AlertMarketCapUnit.M;
        c55276xgrArr[1] = new C55276xgr(C33070mpX.AYXKKw(alertMarketCapUnit3.getTitleResId()), alertMarketCapUnit3, C33070mpX.AYXKKw(alertMarketCapUnit3.getDescriptionResId()), alertMarketCapUnit == alertMarketCapUnit3, false, null, alertMarketCapUnit3.getContentDescription(), 48, null);
        AlertMarketCapUnit alertMarketCapUnit4 = AlertMarketCapUnit.K;
        c55276xgrArr[2] = new C55276xgr(C33070mpX.AYXKKw(alertMarketCapUnit4.getTitleResId()), alertMarketCapUnit4, C33070mpX.AYXKKw(alertMarketCapUnit4.getDescriptionResId()), alertMarketCapUnit == alertMarketCapUnit4, false, null, alertMarketCapUnit4.getContentDescription(), 48, null);
        return yDY.gEmmrt(c55276xgrArr);
    }
}
