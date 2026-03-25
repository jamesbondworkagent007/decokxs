package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44446sQc;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44446sQc.class)
public final class SendReactionAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SendReactionAction[] $VALUES;
    public static final Companion Companion;
    private final int value;
    public static final SendReactionAction REMOVE = new SendReactionAction("REMOVE", 0, 0);
    public static final SendReactionAction ADD = new SendReactionAction("ADD", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SendReactionAction[] $values() {
        return new SendReactionAction[]{REMOVE, ADD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SendReactionAction> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SendReactionAction> serializer() {
            return C44446sQc.OLrzqt;
        }
    }

    private SendReactionAction(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SendReactionAction[] sendReactionActionArr$values = $values();
        $VALUES = sendReactionActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sendReactionActionArr$values);
        Companion = new Companion(null);
    }

    public static SendReactionAction valueOf(String str) {
        return (SendReactionAction) Enum.valueOf(SendReactionAction.class, str);
    }

    public static SendReactionAction[] values() {
        return (SendReactionAction[]) $VALUES.clone();
    }
}
