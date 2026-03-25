package com.okinc.im.imui.messages.audio.call.model;

import com.reown.android.pulse.model.EventType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class CallStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CallStatus[] $VALUES;
    public static final Activity Companion;
    public static final CallStatus NOT_ON_CALL = new CallStatus("NOT_ON_CALL", 0);
    public static final CallStatus DIALING_OUT = new CallStatus("DIALING_OUT", 1);
    public static final CallStatus DIALING_IN = new CallStatus("DIALING_IN", 2);
    public static final CallStatus CONNECTED = new CallStatus("CONNECTED", 3);
    public static final CallStatus DISCONNECTED = new CallStatus("DISCONNECTED", 4);
    public static final CallStatus ERROR = new CallStatus(EventType.ERROR, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CallStatus[] $values() {
        return new CallStatus[]{NOT_ON_CALL, DIALING_OUT, DIALING_IN, CONNECTED, DISCONNECTED, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CallStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this == DIALING_OUT || this == DIALING_IN || this == CONNECTED;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnding() {
        return this == DISCONNECTED || this == ERROR;
    }

    private CallStatus(String str, int i) {
    }

    static {
        CallStatus[] callStatusArr$values = $values();
        $VALUES = callStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(callStatusArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messages.audio.call.model.CallStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static CallStatus valueOf(String str) {
        return (CallStatus) Enum.valueOf(CallStatus.class, str);
    }

    public static CallStatus[] values() {
        return (CallStatus[]) $VALUES.clone();
    }
}
