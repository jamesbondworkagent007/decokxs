package o;

import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.ReminderShowType;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31051lmi {

    /* JADX INFO: renamed from: o.lmi$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ReminderShowType.values().length];
            try {
                iArr[ReminderShowType.Critical.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ReminderShowType.Warning.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ReminderShowType.Info.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[TradeReminderType.values().length];
            try {
                iArr2[TradeReminderType.WalletBusinessUnsupported.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TradeReminderType.WalletStatusAbnormal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TradeReminderType.WalletMPCNeedRefreshed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[TradeReminderType.WalletMPCNeedLogin.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[TradeReminderType.NoLiquidityForOKX.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[TradeReminderType.NoLiquidityForOKXWarning.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[TradeReminderType.PresetConfigMiss.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[TradeReminderType.ServiceSuspendedRecommendDapp.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[TradeReminderType.ChainNeedUseDapp.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[TradeReminderType.QuoteDapp.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[TradeReminderType.SAExpiringSoon.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[TradeReminderType.SANeedUpgrade.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[TradeReminderType.SAOrderExceedsValidity.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.lmi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateReminderView$default(C31051lmi c31051lmi, ReminderListConfig reminderListConfig, MemeErrorNoticeView memeErrorNoticeView, gOP gop, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            gop = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        c31051lmi.AEQbTJ(reminderListConfig, memeErrorNoticeView, gop, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull ReminderListConfig reminderListConfig, MemeErrorNoticeView memeErrorNoticeView, gOP gop, Function0<Unit> function0) {
        java.lang.String errorTitle;
        java.lang.String message;
        java.lang.String actionMessage;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(reminderListConfig, "");
        if (memeErrorNoticeView == null) {
            return;
        }
        ReminderInfoConfig reminderConfig = reminderListConfig.getReminderConfig();
        if (reminderConfig == null || reminderConfig.getReminderType() == TradeReminderType.None || (((errorTitle = reminderConfig.getErrorTitle()) == null || errorTitle.length() == 0) && ((message = reminderConfig.getMessage()) == null || message.length() == 0))) {
            memeErrorNoticeView.setVisibility(8);
            return;
        }
        MemeErrorNoticeView.Level levelOLrzqt = OLrzqt(reminderConfig.getAlertType());
        if (reminderListConfig.getHasMoreReminders() && !reminderListConfig.getHasBlockingTier()) {
            actionMessage = KWHzl(reminderListConfig.getTotalReminderCount());
        } else {
            actionMessage = reminderConfig.getActionMessage();
            if (actionMessage == null) {
                str = "";
            }
            if (reminderListConfig.getHasMoreReminders() || reminderListConfig.getHasBlockingTier()) {
                function0 = AEQbTJ(reminderConfig.getReminderType(), reminderConfig.getActionMessage(), gop);
            }
            Function0<Unit> function02 = function0;
            memeErrorNoticeView.setVisibility(0);
            java.lang.String errorTitle2 = reminderConfig.getErrorTitle();
            java.lang.String str2 = errorTitle2 != null ? "" : errorTitle2;
            java.lang.String message2 = reminderConfig.getMessage();
            memeErrorNoticeView.setText(str2, message2 != null ? "" : message2, levelOLrzqt, str, function02);
        }
        str = actionMessage;
        if (reminderListConfig.getHasMoreReminders()) {
            function0 = AEQbTJ(reminderConfig.getReminderType(), reminderConfig.getActionMessage(), gop);
        }
        Function0<Unit> function022 = function0;
        memeErrorNoticeView.setVisibility(0);
        java.lang.String errorTitle22 = reminderConfig.getErrorTitle();
        if (errorTitle22 != null) {
        }
        java.lang.String message22 = reminderConfig.getMessage();
        memeErrorNoticeView.setText(str2, message22 != null ? "" : message22, levelOLrzqt, str, function022);
    }

    public static /* synthetic */ void updateReminderView$default(C31051lmi c31051lmi, ReminderInfoConfig reminderInfoConfig, MemeErrorNoticeView memeErrorNoticeView, gOP gop, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            gop = null;
        }
        c31051lmi.OLrzqt(reminderInfoConfig, memeErrorNoticeView, gop);
    }

    public final void OLrzqt(ReminderInfoConfig reminderInfoConfig, MemeErrorNoticeView memeErrorNoticeView, gOP gop) {
        java.lang.String errorTitle;
        java.lang.String message;
        if (memeErrorNoticeView == null) {
            return;
        }
        if (reminderInfoConfig == null || reminderInfoConfig.getReminderType() == TradeReminderType.None || (((errorTitle = reminderInfoConfig.getErrorTitle()) == null || errorTitle.length() == 0) && ((message = reminderInfoConfig.getMessage()) == null || message.length() == 0))) {
            memeErrorNoticeView.setVisibility(8);
            return;
        }
        MemeErrorNoticeView.Level levelOLrzqt = OLrzqt(reminderInfoConfig.getAlertType());
        Function0<Unit> function0AEQbTJ = AEQbTJ(reminderInfoConfig.getReminderType(), reminderInfoConfig.getActionMessage(), gop);
        memeErrorNoticeView.setVisibility(0);
        java.lang.String errorTitle2 = reminderInfoConfig.getErrorTitle();
        java.lang.String str = errorTitle2 == null ? "" : errorTitle2;
        java.lang.String message2 = reminderInfoConfig.getMessage();
        java.lang.String str2 = message2 == null ? "" : message2;
        java.lang.String actionMessage = reminderInfoConfig.getActionMessage();
        memeErrorNoticeView.setText(str, str2, levelOLrzqt, actionMessage == null ? "" : actionMessage, function0AEQbTJ);
    }

    public final java.lang.String KWHzl(int i) {
        return C33069mpW.copydefault(C23274hvD.Fragment.addObserver, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
    }

    public final MemeErrorNoticeView.Level OLrzqt(ReminderShowType reminderShowType) {
        int i = ActionBar.KWHzl[reminderShowType.ordinal()];
        if (i == 1) {
            return MemeErrorNoticeView.Level.Error;
        }
        if (i == 2) {
            return MemeErrorNoticeView.Level.Warning;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return MemeErrorNoticeView.Level.Warning;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Function0<Unit> AEQbTJ(TradeReminderType tradeReminderType, java.lang.String str, gOP gop) {
        if (str != null && str.length() != 0) {
            switch (ActionBar.OLrzqt[tradeReminderType.ordinal()]) {
                case 1:
                case 2:
                    if (gop != null) {
                        return gop.gEmmrt();
                    }
                    break;
                case 3:
                case 4:
                    if (gop != null) {
                        return gop.OLrzqt();
                    }
                    break;
                case 5:
                case 6:
                    if (gop != null) {
                        return gop.copydefault();
                    }
                    break;
                case 7:
                    if (gop != null) {
                        return gop.AEQbTJ();
                    }
                    break;
                case 8:
                case 9:
                case 10:
                    if (gop != null) {
                        return gop.EZpvd();
                    }
                    break;
                case 11:
                    if (gop != null) {
                        return gop.valueOf();
                    }
                    break;
                case 12:
                    if (gop != null) {
                        return gop.AhwBna();
                    }
                    break;
                case 13:
                    if (gop != null) {
                        return gop.KWHzl();
                    }
                    break;
            }
        }
        return null;
    }
}
