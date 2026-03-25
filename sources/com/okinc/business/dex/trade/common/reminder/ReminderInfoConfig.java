package com.okinc.business.dex.trade.common.reminder;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ReminderInfoConfig {
    public static final int $stable = 0;
    private final String actionMessage;
    private final ReminderShowType alertType;
    private final String errorTitle;
    private final String message;
    private final TradeReminderType reminderType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReminderInfoConfig copy$default(ReminderInfoConfig reminderInfoConfig, TradeReminderType tradeReminderType, String str, String str2, ReminderShowType reminderShowType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeReminderType = reminderInfoConfig.reminderType;
        }
        if ((i & 2) != 0) {
            str = reminderInfoConfig.errorTitle;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = reminderInfoConfig.message;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            reminderShowType = reminderInfoConfig.alertType;
        }
        ReminderShowType reminderShowType2 = reminderShowType;
        if ((i & 16) != 0) {
            str3 = reminderInfoConfig.actionMessage;
        }
        return reminderInfoConfig.copy(tradeReminderType, str4, str5, reminderShowType2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeReminderType component1() {
        return this.reminderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.errorTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderShowType component4() {
        return this.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.actionMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderInfoConfig copy(@NotNull TradeReminderType tradeReminderType, String str, String str2, @NotNull ReminderShowType reminderShowType, String str3) {
        Intrinsics.checkNotNullParameter(tradeReminderType, "");
        Intrinsics.checkNotNullParameter(reminderShowType, "");
        return new ReminderInfoConfig(tradeReminderType, str, str2, reminderShowType, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderInfoConfig)) {
            return false;
        }
        ReminderInfoConfig reminderInfoConfig = (ReminderInfoConfig) obj;
        return this.reminderType == reminderInfoConfig.reminderType && Intrinsics.EZpvd((Object) this.errorTitle, (Object) reminderInfoConfig.errorTitle) && Intrinsics.EZpvd((Object) this.message, (Object) reminderInfoConfig.message) && this.alertType == reminderInfoConfig.alertType && Intrinsics.EZpvd((Object) this.actionMessage, (Object) reminderInfoConfig.actionMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionMessage() {
        return this.actionMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderShowType getAlertType() {
        return this.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeReminderType getReminderType() {
        return this.reminderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.reminderType.hashCode();
        String str = this.errorTitle;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.alertType.hashCode();
        String str3 = this.actionMessage;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReminderInfoConfig(reminderType=" + this.reminderType + ", errorTitle=" + this.errorTitle + ", message=" + this.message + ", alertType=" + this.alertType + ", actionMessage=" + this.actionMessage + ")";
    }

    public ReminderInfoConfig(@NotNull TradeReminderType tradeReminderType, String str, String str2, @NotNull ReminderShowType reminderShowType, String str3) {
        Intrinsics.checkNotNullParameter(tradeReminderType, "");
        Intrinsics.checkNotNullParameter(reminderShowType, "");
        this.reminderType = tradeReminderType;
        this.errorTitle = str;
        this.message = str2;
        this.alertType = reminderShowType;
        this.actionMessage = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 com.okinc.business.dex.trade.common.reminder.TradeReminderType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.common.reminder.ReminderShowType:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.trade.common.reminder.ReminderShowType:0x0013: SGET  A[WRAPPED] (LINE:533) com.okinc.business.dex.trade.common.reminder.ReminderShowType.Warning com.okinc.business.dex.trade.common.reminder.ReminderShowType) : (r11v0 com.okinc.business.dex.trade.common.reminder.ReminderShowType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(com.okinc.business.dex.trade.common.reminder.TradeReminderType, java.lang.String, java.lang.String, com.okinc.business.dex.trade.common.reminder.ReminderShowType, java.lang.String):void (m)] (LINE:529) call: com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig.<init>(com.okinc.business.dex.trade.common.reminder.TradeReminderType, java.lang.String, java.lang.String, com.okinc.business.dex.trade.common.reminder.ReminderShowType, java.lang.String):void type: THIS */
    public /* synthetic */ ReminderInfoConfig(TradeReminderType tradeReminderType, String str, String str2, ReminderShowType reminderShowType, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeReminderType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ReminderShowType.Warning : reminderShowType, (i & 16) != 0 ? null : str3);
    }
}
