package com.okinc.business.dex.trade.common.reminder.data;

import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ReminderListConfig {
    public static final int $stable = 8;
    private final List<ReminderInfoConfig> allReminderConfigs;
    private final boolean hasBlockingTier;
    private final boolean hasMoreReminders;
    private final ReminderInfoConfig reminderConfig;
    private final int totalReminderCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReminderListConfig() {
        this(null, null, 0, false, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReminderListConfig copy$default(ReminderListConfig reminderListConfig, ReminderInfoConfig reminderInfoConfig, List list, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            reminderInfoConfig = reminderListConfig.reminderConfig;
        }
        if ((i2 & 2) != 0) {
            list = reminderListConfig.allReminderConfigs;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            i = reminderListConfig.totalReminderCount;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = reminderListConfig.hasMoreReminders;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = reminderListConfig.hasBlockingTier;
        }
        return reminderListConfig.copy(reminderInfoConfig, list2, i3, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderInfoConfig component1() {
        return this.reminderConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReminderInfoConfig> component2() {
        return this.allReminderConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.totalReminderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.hasMoreReminders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.hasBlockingTier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderListConfig copy(ReminderInfoConfig reminderInfoConfig, @NotNull List<ReminderInfoConfig> list, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ReminderListConfig(reminderInfoConfig, list, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderListConfig)) {
            return false;
        }
        ReminderListConfig reminderListConfig = (ReminderListConfig) obj;
        return Intrinsics.EZpvd(this.reminderConfig, reminderListConfig.reminderConfig) && Intrinsics.EZpvd(this.allReminderConfigs, reminderListConfig.allReminderConfigs) && this.totalReminderCount == reminderListConfig.totalReminderCount && this.hasMoreReminders == reminderListConfig.hasMoreReminders && this.hasBlockingTier == reminderListConfig.hasBlockingTier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReminderInfoConfig> getAllReminderConfigs() {
        return this.allReminderConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasBlockingTier() {
        return this.hasBlockingTier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasMoreReminders() {
        return this.hasMoreReminders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReminderInfoConfig getReminderConfig() {
        return this.reminderConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalReminderCount() {
        return this.totalReminderCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ReminderInfoConfig reminderInfoConfig = this.reminderConfig;
        return ((((((((reminderInfoConfig == null ? 0 : reminderInfoConfig.hashCode()) * 31) + this.allReminderConfigs.hashCode()) * 31) + Integer.hashCode(this.totalReminderCount)) * 31) + Boolean.hashCode(this.hasMoreReminders)) * 31) + Boolean.hashCode(this.hasBlockingTier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReminderListConfig(reminderConfig=" + this.reminderConfig + ", allReminderConfigs=" + this.allReminderConfigs + ", totalReminderCount=" + this.totalReminderCount + ", hasMoreReminders=" + this.hasMoreReminders + ", hasBlockingTier=" + this.hasBlockingTier + ")";
    }

    public ReminderListConfig(ReminderInfoConfig reminderInfoConfig, @NotNull List<ReminderInfoConfig> list, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.reminderConfig = reminderInfoConfig;
        this.allReminderConfigs = list;
        this.totalReminderCount = i;
        this.hasMoreReminders = z;
        this.hasBlockingTier = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig) : (r4v0 com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig))
  (wrap:java.util.List:0x000d: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r5v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 boolean) : false)
 A[MD:(com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig, java.util.List<com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig>, int, boolean, boolean):void (m)] (LINE:11) call: com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig.<init>(com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig, java.util.List, int, boolean, boolean):void type: THIS */
    public /* synthetic */ ReminderListConfig(ReminderInfoConfig reminderInfoConfig, List list, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : reminderInfoConfig, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? z2 : false);
    }
}
