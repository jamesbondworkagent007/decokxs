package com.okinc.business.defi.wallet.home.usdgActivity.data.repository;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ActivityStatus[] $VALUES;
    public static final ActionBar Companion;
    private final int status;
    public static final ActivityStatus STATUS_OPEN = new ActivityStatus("STATUS_OPEN", 0, 1);
    public static final ActivityStatus STATUS_CLOSED = new ActivityStatus("STATUS_CLOSED", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ActivityStatus[] $values() {
        return new ActivityStatus[]{STATUS_OPEN, STATUS_CLOSED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ActivityStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private ActivityStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        ActivityStatus[] activityStatusArr$values = $values();
        $VALUES = activityStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(activityStatusArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.usdgActivity.data.repository.ActivityStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ActivityStatus AEQbTJ(int i) {
            for (ActivityStatus activityStatus : ActivityStatus.values()) {
                if (activityStatus.getStatus() == i) {
                    return activityStatus;
                }
            }
            return null;
        }
    }

    public static ActivityStatus valueOf(String str) {
        return (ActivityStatus) Enum.valueOf(ActivityStatus.class, str);
    }

    public static ActivityStatus[] values() {
        return (ActivityStatus[]) $VALUES.clone();
    }
}
