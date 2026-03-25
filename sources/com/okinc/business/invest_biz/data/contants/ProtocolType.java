package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProtocolType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProtocolType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final ProtocolType Unknown = new ProtocolType("Unknown", 0, -1);

    @SerialName("1")
    public static final ProtocolType STX = new ProtocolType("STX", 1, 1);

    @SerialName("2")
    public static final ProtocolType SUI = new ProtocolType("SUI", 2, 2);

    @SerialName("3")
    public static final ProtocolType SOL = new ProtocolType("SOL", 3, 3);

    @SerialName("4")
    public static final ProtocolType LSDFI = new ProtocolType("LSDFI", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProtocolType[] $values() {
        return new ProtocolType[]{Unknown, STX, SUI, SOL, LSDFI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProtocolType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.ProtocolType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) ProtocolType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ProtocolType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.ProtocolType", values(), new String[]{MultiTransferSignData.DEFAULT_INTERVAL, "1", "2", "3", "4"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    private ProtocolType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ProtocolType[] protocolTypeArr$values = $values();
        $VALUES = protocolTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(protocolTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ProtocolType._init_$_anonymous_();
            }
        });
    }

    public static ProtocolType valueOf(String str) {
        return (ProtocolType) Enum.valueOf(ProtocolType.class, str);
    }

    public static ProtocolType[] values() {
        return (ProtocolType[]) $VALUES.clone();
    }
}
