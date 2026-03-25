package com.okinc.business.dex.trade.common.reminder;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SaUiReminder {
    public static final int $stable = 0;
    private final String actionMessage;
    private final String message;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SaUiReminder() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SaUiReminder copy$default(SaUiReminder saUiReminder, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saUiReminder.title;
        }
        if ((i & 2) != 0) {
            str2 = saUiReminder.message;
        }
        if ((i & 4) != 0) {
            str3 = saUiReminder.actionMessage;
        }
        return saUiReminder.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.actionMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SaUiReminder copy(String str, String str2, String str3) {
        return new SaUiReminder(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaUiReminder)) {
            return false;
        }
        SaUiReminder saUiReminder = (SaUiReminder) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) saUiReminder.title) && Intrinsics.EZpvd((Object) this.message, (Object) saUiReminder.message) && Intrinsics.EZpvd((Object) this.actionMessage, (Object) saUiReminder.actionMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionMessage() {
        return this.actionMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.actionMessage;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SaUiReminder(title=" + this.title + ", message=" + this.message + ", actionMessage=" + this.actionMessage + ")";
    }

    public SaUiReminder(String str, String str2, String str3) {
        this.title = str;
        this.message = str2;
        this.actionMessage = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:542) call: com.okinc.business.dex.trade.common.reminder.SaUiReminder.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SaUiReminder(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
