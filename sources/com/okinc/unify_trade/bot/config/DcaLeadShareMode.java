package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.google.api.client.googleapis.notifications.ResourceStates;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class DcaLeadShareMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DcaLeadShareMode[] $VALUES;
    public static final Activity Companion;
    private final String mode;
    private final int showMode;
    public static final DcaLeadShareMode SYNC = new DcaLeadShareMode(ResourceStates.SYNC, 0, "sync", C55688xof.Application.QFTsTN);
    public static final DcaLeadShareMode ASYNC = new DcaLeadShareMode("ASYNC", 1, "async", C55688xof.Application.fiXcQa);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DcaLeadShareMode[] $values() {
        return new DcaLeadShareMode[]{SYNC, ASYNC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DcaLeadShareMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowMode() {
        return this.showMode;
    }

    private DcaLeadShareMode(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.showMode = i2;
    }

    static {
        DcaLeadShareMode[] dcaLeadShareModeArr$values = $values();
        $VALUES = dcaLeadShareModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dcaLeadShareModeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.DcaLeadShareMode.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final DcaLeadShareMode OLrzqt(String str) {
            for (DcaLeadShareMode dcaLeadShareMode : DcaLeadShareMode.values()) {
                if (Intrinsics.EZpvd((Object) dcaLeadShareMode.getMode(), (Object) str)) {
                    return dcaLeadShareMode;
                }
            }
            return null;
        }
    }

    public static DcaLeadShareMode valueOf(String str) {
        return (DcaLeadShareMode) Enum.valueOf(DcaLeadShareMode.class, str);
    }

    public static DcaLeadShareMode[] values() {
        return (DcaLeadShareMode[]) $VALUES.clone();
    }
}
