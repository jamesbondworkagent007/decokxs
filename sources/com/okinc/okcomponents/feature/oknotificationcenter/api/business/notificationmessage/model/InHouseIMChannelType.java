package com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.rXJ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = rXJ.class)
public final class InHouseIMChannelType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InHouseIMChannelType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int apiValue;
    public static final InHouseIMChannelType Unknown = new InHouseIMChannelType("Unknown", 0, -1);
    public static final InHouseIMChannelType Group = new InHouseIMChannelType("Group", 1, 0);
    public static final InHouseIMChannelType Individual = new InHouseIMChannelType("Individual", 2, 1);
    public static final InHouseIMChannelType SystemNotification = new InHouseIMChannelType("SystemNotification", 3, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InHouseIMChannelType[] $values() {
        return new InHouseIMChannelType[]{Unknown, Group, Individual, SystemNotification};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InHouseIMChannelType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) InHouseIMChannelType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InHouseIMChannelType> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new rXJ();
    }

    private InHouseIMChannelType(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        InHouseIMChannelType[] inHouseIMChannelTypeArr$values = $values();
        $VALUES = inHouseIMChannelTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inHouseIMChannelTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InHouseIMChannelType._init_$_anonymous_();
            }
        });
    }

    public static InHouseIMChannelType valueOf(String str) {
        return (InHouseIMChannelType) Enum.valueOf(InHouseIMChannelType.class, str);
    }

    public static InHouseIMChannelType[] values() {
        return (InHouseIMChannelType[]) $VALUES.clone();
    }
}
