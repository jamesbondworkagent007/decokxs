package com.okinc.im.call.model;

import com.okinc.im.call.model.DisconnectReason;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DisconnectReason {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DisconnectReason[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final DisconnectReason LOCAL_HANGUP = new DisconnectReason("LOCAL_HANGUP", 0);
    public static final DisconnectReason LOCAL_REJECT = new DisconnectReason("LOCAL_REJECT", 1);
    public static final DisconnectReason LOCAL_CANCEL = new DisconnectReason("LOCAL_CANCEL", 2);
    public static final DisconnectReason REMOTE_HANGUP = new DisconnectReason("REMOTE_HANGUP", 3);
    public static final DisconnectReason REMOTE_REJECT = new DisconnectReason("REMOTE_REJECT", 4);
    public static final DisconnectReason REMOTE_CANCEL = new DisconnectReason("REMOTE_CANCEL", 5);
    public static final DisconnectReason NO_ANSWER = new DisconnectReason("NO_ANSWER", 6);
    public static final DisconnectReason NETWORK_ERROR = new DisconnectReason("NETWORK_ERROR", 7);
    public static final DisconnectReason AGORA_ERROR = new DisconnectReason("AGORA_ERROR", 8);
    public static final DisconnectReason PERMISSION_DENIED = new DisconnectReason("PERMISSION_DENIED", 9);
    public static final DisconnectReason ACCEPTED_ON_OTHER_DEVICE = new DisconnectReason("ACCEPTED_ON_OTHER_DEVICE", 10);
    public static final DisconnectReason BUSY = new DisconnectReason("BUSY", 11);
    public static final DisconnectReason BLOCKED = new DisconnectReason("BLOCKED", 12);
    public static final DisconnectReason UNKNOWN = new DisconnectReason("UNKNOWN", 13);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DisconnectReason[] $values() {
        return new DisconnectReason[]{LOCAL_HANGUP, LOCAL_REJECT, LOCAL_CANCEL, REMOTE_HANGUP, REMOTE_REJECT, REMOTE_CANCEL, NO_ANSWER, NETWORK_ERROR, AGORA_ERROR, PERMISSION_DENIED, ACCEPTED_ON_OTHER_DEVICE, BUSY, BLOCKED, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DisconnectReason> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.DisconnectReason.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) DisconnectReason.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<DisconnectReason> serializer() {
            return KWHzl();
        }
    }

    private DisconnectReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.im.call.model.DisconnectReason", values());
    }

    static {
        DisconnectReason[] disconnectReasonArr$values = $values();
        $VALUES = disconnectReasonArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(disconnectReasonArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.nrP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DisconnectReason._init_$_anonymous_();
            }
        });
    }

    public static DisconnectReason valueOf(String str) {
        return (DisconnectReason) Enum.valueOf(DisconnectReason.class, str);
    }

    public static DisconnectReason[] values() {
        return (DisconnectReason[]) $VALUES.clone();
    }
}
