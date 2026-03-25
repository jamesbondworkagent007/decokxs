package o;

import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.ReminderShowType;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gOY {
    public static final Application Companion = new Application(null);

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.gOY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateReminderView$default(gOY goy, ReminderListConfig reminderListConfig, ErrorNoticeView errorNoticeView, gOP gop, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            gop = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        goy.copydefault(reminderListConfig, errorNoticeView, gop, function0);
    }

    public final void copydefault(@NotNull ReminderListConfig reminderListConfig, ErrorNoticeView errorNoticeView, gOP gop, Function0<Unit> function0) {
        java.lang.String actionMessage;
        Intrinsics.checkNotNullParameter(reminderListConfig, "");
        if (errorNoticeView == null) {
            return;
        }
        ReminderInfoConfig reminderConfig = reminderListConfig.getReminderConfig();
        if (reminderConfig == null || reminderConfig.getReminderType() == TradeReminderType.None) {
            errorNoticeView.setVisibility(8);
            return;
        }
        ErrorNoticeView.Level levelEZpvd = EZpvd(reminderConfig.getAlertType());
        if (reminderListConfig.getHasMoreReminders() && !reminderListConfig.getHasBlockingTier()) {
            actionMessage = AEQbTJ(reminderListConfig.getTotalReminderCount());
        } else {
            actionMessage = reminderConfig.getActionMessage();
            if (actionMessage == null) {
                actionMessage = "";
            }
        }
        Function0<Unit> function0Copydefault = (!reminderListConfig.getHasMoreReminders() || reminderListConfig.getHasBlockingTier()) ? Companion.copydefault(reminderConfig.getReminderType(), reminderConfig.getActionMessage(), gop) : function0;
        errorNoticeView.setVisibility(0);
        java.lang.String errorTitle = reminderConfig.getErrorTitle();
        if (errorTitle == null) {
            errorTitle = "";
        }
        java.lang.String message = reminderConfig.getMessage();
        if (message == null) {
            message = "";
        }
        ErrorNoticeView.setText$default(errorNoticeView, errorTitle, message, levelEZpvd, null, actionMessage, function0Copydefault, 8, null);
    }

    public static /* synthetic */ void updateReminderView$default(gOY goy, ReminderInfoConfig reminderInfoConfig, ErrorNoticeView errorNoticeView, gOP gop, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            gop = null;
        }
        goy.EZpvd(reminderInfoConfig, errorNoticeView, gop);
    }

    public final void EZpvd(ReminderInfoConfig reminderInfoConfig, ErrorNoticeView errorNoticeView, gOP gop) {
        if (errorNoticeView == null) {
            return;
        }
        if (reminderInfoConfig == null || reminderInfoConfig.getReminderType() == TradeReminderType.None) {
            errorNoticeView.setVisibility(8);
            return;
        }
        ErrorNoticeView.Level levelEZpvd = EZpvd(reminderInfoConfig.getAlertType());
        Function0<Unit> function0Copydefault = Companion.copydefault(reminderInfoConfig.getReminderType(), reminderInfoConfig.getActionMessage(), gop);
        errorNoticeView.setVisibility(0);
        java.lang.String errorTitle = reminderInfoConfig.getErrorTitle();
        java.lang.String str = errorTitle == null ? "" : errorTitle;
        java.lang.String message = reminderInfoConfig.getMessage();
        java.lang.String str2 = message == null ? "" : message;
        java.lang.String actionMessage = reminderInfoConfig.getActionMessage();
        ErrorNoticeView.setText$default(errorNoticeView, str, str2, levelEZpvd, null, actionMessage == null ? "" : actionMessage, function0Copydefault, 8, null);
    }

    public final java.lang.String AEQbTJ(int i) {
        return C33069mpW.copydefault(C23274hvD.Fragment.addObserver, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
    }

    public final ErrorNoticeView.Level EZpvd(ReminderShowType reminderShowType) {
        int i = StateListAnimator.copydefault[reminderShowType.ordinal()];
        if (i == 1) {
            return ErrorNoticeView.Level.Error;
        }
        if (i == 2) {
            return ErrorNoticeView.Level.Warning;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ErrorNoticeView.Level.Warning;
    }

    public static final class Application {

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TradeReminderType.values().length];
                try {
                    iArr[TradeReminderType.WalletBusinessUnsupported.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TradeReminderType.WalletStatusAbnormal.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TradeReminderType.WalletMPCNeedRefreshed.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[TradeReminderType.WalletMPCNeedLogin.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[TradeReminderType.NoLiquidityForOKX.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[TradeReminderType.NoLiquidityForOKXWarning.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[TradeReminderType.PresetConfigMiss.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[TradeReminderType.ServiceSuspendedRecommendDapp.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr[TradeReminderType.ChainNeedUseDapp.ordinal()] = 9;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr[TradeReminderType.QuoteDapp.ordinal()] = 10;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr[TradeReminderType.SAExpiringSoon.ordinal()] = 11;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                try {
                    iArr[TradeReminderType.SANeedUpgrade.ordinal()] = 12;
                } catch (java.lang.NoSuchFieldError unused12) {
                }
                try {
                    iArr[TradeReminderType.SAOrderExceedsValidity.ordinal()] = 13;
                } catch (java.lang.NoSuchFieldError unused13) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gOY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final Function0<Unit> copydefault(@NotNull TradeReminderType tradeReminderType, java.lang.String str, gOP gop) {
            Intrinsics.checkNotNullParameter(tradeReminderType, "");
            if (str != null && str.length() != 0) {
                switch (Activity.KWHzl[tradeReminderType.ordinal()]) {
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
}
