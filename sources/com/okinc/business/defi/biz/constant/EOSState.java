package com.okinc.business.defi.biz.constant;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EOSState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EOSState[] $VALUES;
    public static final Activity Companion;
    public static final EOSState Unopened = new EOSState("Unopened", 0);
    public static final EOSState Pending = new EOSState("Pending", 1);
    public static final EOSState Opened = new EOSState("Opened", 2);
    public static final EOSState Unknown = new EOSState("Unknown", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EOSState[] $values() {
        return new EOSState[]{Unopened, Pending, Opened, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EOSState> getEntries() {
        return $ENTRIES;
    }

    private EOSState(String str, int i) {
    }

    static {
        EOSState[] eOSStateArr$values = $values();
        $VALUES = eOSStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eOSStateArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.constant.EOSState.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final EOSState copydefault(int i) {
            if (i == 0) {
                return EOSState.Unopened;
            }
            if (i == 1) {
                return EOSState.Pending;
            }
            if (i == 2) {
                return EOSState.Opened;
            }
            return EOSState.Unknown;
        }
    }

    public static EOSState valueOf(String str) {
        return (EOSState) Enum.valueOf(EOSState.class, str);
    }

    public static EOSState[] values() {
        return (EOSState[]) $VALUES.clone();
    }
}
