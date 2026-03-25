package com.okinc.fiat.api.bean;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ChannelType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChannelType[] $VALUES;
    public static final Application Companion;
    private final Integer depositCode;
    private final int type;
    public static final ChannelType NONE = new ChannelType("NONE", 0, -1, null, 2, null);
    public static final ChannelType CARD = new ChannelType("CARD", 1, 0, Integer.valueOf(DepositCodes.CARD_PAYMENT.getCode()));
    public static final ChannelType P2P = new ChannelType(CustomMessageData.SERVICE_NAME_P2P, 2, 1, Integer.valueOf(DepositCodes.OKEX_P2P.getCode()));
    public static final ChannelType THIRD_PARTY = new ChannelType("THIRD_PARTY", 3, 2, null, 2, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChannelType[] $values() {
        return new ChannelType[]{NONE, CARD, P2P, THIRD_PARTY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChannelType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDepositCode() {
        return this.depositCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private ChannelType(String str, int i, int i2, Integer num) {
        this.type = i2;
        this.depositCode = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.String, int, int, java.lang.Integer):void (m)] (LINE:6) call: com.okinc.fiat.api.bean.ChannelType.<init>(java.lang.String, int, int, java.lang.Integer):void type: THIS */
    public /* synthetic */ ChannelType(String str, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : num);
    }

    static {
        ChannelType[] channelTypeArr$values = $values();
        $VALUES = channelTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(channelTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.ChannelType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static ChannelType valueOf(String str) {
        return (ChannelType) Enum.valueOf(ChannelType.class, str);
    }

    public static ChannelType[] values() {
        return (ChannelType[]) $VALUES.clone();
    }
}
