package com.okinc.okex.uploadlog.bean.enums;

import com.okinc.okex.uploadlog.bean.enums.TicketChannel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44073sCi;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Serializable(with = C44073sCi.class)
public final class TicketChannel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TicketChannel[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final TicketChannel ImChat = new TicketChannel("ImChat", 0, "IM_CHAT");
    public static final TicketChannel UserTicket = new TicketChannel("UserTicket", 1, "USER_TICKET");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TicketChannel[] $values() {
        return new TicketChannel[]{ImChat, UserTicket};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TicketChannel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.enums.TicketChannel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) TicketChannel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TicketChannel> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44073sCi();
    }

    private TicketChannel(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TicketChannel[] ticketChannelArr$values = $values();
        $VALUES = ticketChannelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(ticketChannelArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TicketChannel._init_$_anonymous_();
            }
        });
    }

    public static TicketChannel valueOf(String str) {
        return (TicketChannel) Enum.valueOf(TicketChannel.class, str);
    }

    public static TicketChannel[] values() {
        return (TicketChannel[]) $VALUES.clone();
    }
}
