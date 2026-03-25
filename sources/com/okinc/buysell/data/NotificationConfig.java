package com.okinc.buysell.data;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class NotificationConfig {
    public static final int $stable = 0;

    @SerializedName("simple_trade_notification_duration")
    private final long simpleTradeNotificationDurationInMins;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationConfig() {
        this(0L, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotificationConfig copy$default(NotificationConfig notificationConfig, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = notificationConfig.simpleTradeNotificationDurationInMins;
        }
        return notificationConfig.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.simpleTradeNotificationDurationInMins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationConfig copy(long j) {
        return new NotificationConfig(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationConfig) && this.simpleTradeNotificationDurationInMins == ((NotificationConfig) obj).simpleTradeNotificationDurationInMins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSimpleTradeNotificationDurationInMins() {
        return this.simpleTradeNotificationDurationInMins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.simpleTradeNotificationDurationInMins);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationConfig(simpleTradeNotificationDurationInMins=" + this.simpleTradeNotificationDurationInMins + ")";
    }

    public NotificationConfig(long j) {
        this.simpleTradeNotificationDurationInMins = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (60 long) : (r1v0 long))
 A[MD:(long):void (m)] (LINE:7) call: com.okinc.buysell.data.NotificationConfig.<init>(long):void type: THIS */
    public /* synthetic */ NotificationConfig(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60L : j);
    }
}
