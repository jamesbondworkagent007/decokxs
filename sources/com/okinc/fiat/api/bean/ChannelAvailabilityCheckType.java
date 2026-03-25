package com.okinc.fiat.api.bean;

import com.okinc.fiat.api.bean.ChannelAvailabilityCheckType;
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
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ChannelAvailabilityCheckType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChannelAvailabilityCheckType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String type;
    public static final ChannelAvailabilityCheckType WALLET = new ChannelAvailabilityCheckType("WALLET", 0, "defi_wallet");
    public static final ChannelAvailabilityCheckType LITE = new ChannelAvailabilityCheckType("LITE", 1, "lite_visibility");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChannelAvailabilityCheckType[] $values() {
        return new ChannelAvailabilityCheckType[]{WALLET, LITE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChannelAvailabilityCheckType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.ChannelAvailabilityCheckType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) ChannelAvailabilityCheckType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ChannelAvailabilityCheckType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.fiat.api.bean.ChannelAvailabilityCheckType", values());
    }

    private ChannelAvailabilityCheckType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        ChannelAvailabilityCheckType[] channelAvailabilityCheckTypeArr$values = $values();
        $VALUES = channelAvailabilityCheckTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(channelAvailabilityCheckTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.niF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChannelAvailabilityCheckType._init_$_anonymous_();
            }
        });
    }

    public static ChannelAvailabilityCheckType valueOf(String str) {
        return (ChannelAvailabilityCheckType) Enum.valueOf(ChannelAvailabilityCheckType.class, str);
    }

    public static ChannelAvailabilityCheckType[] values() {
        return (ChannelAvailabilityCheckType[]) $VALUES.clone();
    }
}
