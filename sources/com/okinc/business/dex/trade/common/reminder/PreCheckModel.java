package com.okinc.business.dex.trade.common.reminder;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckModel {
    public static final int $stable = 0;
    private final String preCheckMsg;
    private final PreCheckStatus status;
    private final PreCheckReminderType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreCheckModel() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreCheckModel copy$default(PreCheckModel preCheckModel, PreCheckStatus preCheckStatus, PreCheckReminderType preCheckReminderType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            preCheckStatus = preCheckModel.status;
        }
        if ((i & 2) != 0) {
            preCheckReminderType = preCheckModel.type;
        }
        if ((i & 4) != 0) {
            str = preCheckModel.preCheckMsg;
        }
        return preCheckModel.copy(preCheckStatus, preCheckReminderType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckStatus component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckReminderType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.preCheckMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckModel copy(@NotNull PreCheckStatus preCheckStatus, @NotNull PreCheckReminderType preCheckReminderType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(preCheckStatus, "");
        Intrinsics.checkNotNullParameter(preCheckReminderType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new PreCheckModel(preCheckStatus, preCheckReminderType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCheckModel)) {
            return false;
        }
        PreCheckModel preCheckModel = (PreCheckModel) obj;
        return this.status == preCheckModel.status && this.type == preCheckModel.type && Intrinsics.EZpvd((Object) this.preCheckMsg, (Object) preCheckModel.preCheckMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreCheckMsg() {
        return this.preCheckMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckReminderType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.type.hashCode()) * 31) + this.preCheckMsg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreCheckModel(status=" + this.status + ", type=" + this.type + ", preCheckMsg=" + this.preCheckMsg + ")";
    }

    public PreCheckModel(@NotNull PreCheckStatus preCheckStatus, @NotNull PreCheckReminderType preCheckReminderType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(preCheckStatus, "");
        Intrinsics.checkNotNullParameter(preCheckReminderType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.status = preCheckStatus;
        this.type = preCheckReminderType;
        this.preCheckMsg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.common.reminder.PreCheckStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.trade.common.reminder.PreCheckStatus:0x0004: SGET  A[WRAPPED] (LINE:1186) com.okinc.business.dex.trade.common.reminder.PreCheckStatus.None com.okinc.business.dex.trade.common.reminder.PreCheckStatus) : (r1v0 com.okinc.business.dex.trade.common.reminder.PreCheckStatus))
  (wrap:com.okinc.business.dex.trade.common.reminder.PreCheckReminderType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dex.trade.common.reminder.PreCheckReminderType:0x000a: SGET  A[WRAPPED] (LINE:1187) com.okinc.business.dex.trade.common.reminder.PreCheckReminderType.Warning com.okinc.business.dex.trade.common.reminder.PreCheckReminderType) : (r2v0 com.okinc.business.dex.trade.common.reminder.PreCheckReminderType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(com.okinc.business.dex.trade.common.reminder.PreCheckStatus, com.okinc.business.dex.trade.common.reminder.PreCheckReminderType, java.lang.String):void (m)] (LINE:1185) call: com.okinc.business.dex.trade.common.reminder.PreCheckModel.<init>(com.okinc.business.dex.trade.common.reminder.PreCheckStatus, com.okinc.business.dex.trade.common.reminder.PreCheckReminderType, java.lang.String):void type: THIS */
    public /* synthetic */ PreCheckModel(PreCheckStatus preCheckStatus, PreCheckReminderType preCheckReminderType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PreCheckStatus.None : preCheckStatus, (i & 2) != 0 ? PreCheckReminderType.Warning : preCheckReminderType, (i & 4) != 0 ? "" : str);
    }
}
