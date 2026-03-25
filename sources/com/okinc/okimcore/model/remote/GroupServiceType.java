package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.remote.GroupServiceType;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sQG;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sQG.class)
public final class GroupServiceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupServiceType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;
    public static final GroupServiceType IM = new GroupServiceType(OtcExtraKeys.IM, 0, 0);
    public static final GroupServiceType P2P = new GroupServiceType(CustomMessageData.SERVICE_NAME_P2P, 1, 1);
    public static final GroupServiceType Affiliate = new GroupServiceType("Affiliate", 2, 2);
    public static final GroupServiceType SocialTrading = new GroupServiceType(CustomMessageData.SERVICE_NAME_CONTRACT_ADDRESS, 3, 3);
    public static final GroupServiceType OKA = new GroupServiceType("OKA", 4, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupServiceType[] $values() {
        return new GroupServiceType[]{IM, P2P, Affiliate, SocialTrading, OKA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupServiceType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupServiceType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) GroupServiceType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GroupServiceType> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sQG();
    }

    private GroupServiceType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        GroupServiceType[] groupServiceTypeArr$values = $values();
        $VALUES = groupServiceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupServiceTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupServiceType._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }

    public static GroupServiceType valueOf(String str) {
        return (GroupServiceType) Enum.valueOf(GroupServiceType.class, str);
    }

    public static GroupServiceType[] values() {
        return (GroupServiceType[]) $VALUES.clone();
    }
}
