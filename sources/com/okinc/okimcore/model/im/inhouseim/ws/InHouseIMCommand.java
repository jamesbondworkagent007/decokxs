package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMCommand;
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
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMCommand {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InHouseIMCommand[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final InHouseIMCommand WSPushMsg = new InHouseIMCommand("WSPushMsg", 0);
    public static final InHouseIMCommand WSSendMsg = new InHouseIMCommand("WSSendMsg", 1);
    public static final InHouseIMCommand WSSendIndicator = new InHouseIMCommand("WSSendIndicator", 2);
    public static final InHouseIMCommand WSPushIndicator = new InHouseIMCommand("WSPushIndicator", 3);
    public static final InHouseIMCommand WSGetNewestSeq = new InHouseIMCommand("WSGetNewestSeq", 4);
    public static final InHouseIMCommand WSGetMsgByPage = new InHouseIMCommand("WSGetMsgByPage", 5);
    public static final InHouseIMCommand WSGetMsgBySeqList = new InHouseIMCommand("WSGetMsgBySeqList", 6);
    public static final InHouseIMCommand WSConversationIds = new InHouseIMCommand("WSConversationIds", 7);
    public static final InHouseIMCommand WSPing = new InHouseIMCommand("WSPing", 8);
    public static final InHouseIMCommand WSSendReaction = new InHouseIMCommand("WSSendReaction", 9);
    public static final InHouseIMCommand WSGetReaction = new InHouseIMCommand("WSGetReaction", 10);
    public static final InHouseIMCommand WSGetReactionUpdateTs = new InHouseIMCommand("WSGetReactionUpdateTs", 11);
    public static final InHouseIMCommand WSPushReaction = new InHouseIMCommand("WSPushReaction", 12);
    public static final InHouseIMCommand WSSubscribeToLivestream = new InHouseIMCommand("WSSubscribeToLivestream", 13);
    public static final InHouseIMCommand WSUnsubscribeToLivestream = new InHouseIMCommand("WSUnsubscribeToLivestream", 14);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InHouseIMCommand[] $values() {
        return new InHouseIMCommand[]{WSPushMsg, WSSendMsg, WSSendIndicator, WSPushIndicator, WSGetNewestSeq, WSGetMsgByPage, WSGetMsgBySeqList, WSConversationIds, WSPing, WSSendReaction, WSGetReaction, WSGetReactionUpdateTs, WSPushReaction, WSSubscribeToLivestream, WSUnsubscribeToLivestream};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InHouseIMCommand> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMCommand.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) InHouseIMCommand.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InHouseIMCommand> serializer() {
            return copydefault();
        }
    }

    private InHouseIMCommand(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMCommand", values());
    }

    static {
        InHouseIMCommand[] inHouseIMCommandArr$values = $values();
        $VALUES = inHouseIMCommandArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inHouseIMCommandArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InHouseIMCommand._init_$_anonymous_();
            }
        });
    }

    public static InHouseIMCommand valueOf(String str) {
        return (InHouseIMCommand) Enum.valueOf(InHouseIMCommand.class, str);
    }

    public static InHouseIMCommand[] values() {
        return (InHouseIMCommand[]) $VALUES.clone();
    }
}
