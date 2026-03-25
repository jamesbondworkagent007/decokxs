package com.okinc.kline.ui.unlock.data.po;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokenSchedule {
    public static final int $stable = 8;

    @SerializedName("data")
    private final List<UnlockScheduleInfo> infos;

    @SerializedName("nearToday")
    private final boolean nearToday;

    @SerializedName("ts")
    private final String ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnlockTokenSchedule copy$default(UnlockTokenSchedule unlockTokenSchedule, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = unlockTokenSchedule.infos;
        }
        if ((i & 2) != 0) {
            str = unlockTokenSchedule.ts;
        }
        if ((i & 4) != 0) {
            z = unlockTokenSchedule.nearToday;
        }
        return unlockTokenSchedule.copy(list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnlockScheduleInfo> component1() {
        return this.infos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.nearToday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnlockTokenSchedule copy(@NotNull List<UnlockScheduleInfo> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new UnlockTokenSchedule(list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockTokenSchedule)) {
            return false;
        }
        UnlockTokenSchedule unlockTokenSchedule = (UnlockTokenSchedule) obj;
        return Intrinsics.EZpvd(this.infos, unlockTokenSchedule.infos) && Intrinsics.EZpvd((Object) this.ts, (Object) unlockTokenSchedule.ts) && this.nearToday == unlockTokenSchedule.nearToday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnlockScheduleInfo> getInfos() {
        return this.infos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNearToday() {
        return this.nearToday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.infos.hashCode() * 31) + this.ts.hashCode()) * 31) + Boolean.hashCode(this.nearToday);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnlockTokenSchedule(infos=" + this.infos + ", ts=" + this.ts + ", nearToday=" + this.nearToday + ")";
    }

    public UnlockTokenSchedule(@NotNull List<UnlockScheduleInfo> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.infos = list;
        this.ts = str;
        this.nearToday = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.util.List<com.okinc.kline.ui.unlock.data.po.UnlockScheduleInfo>, java.lang.String, boolean):void (m)] (LINE:7) call: com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule.<init>(java.util.List, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ UnlockTokenSchedule(List list, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? false : z);
    }
}
