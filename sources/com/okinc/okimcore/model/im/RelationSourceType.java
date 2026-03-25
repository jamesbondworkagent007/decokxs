package com.okinc.okimcore.model.im;

import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sNW;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sNW.class)
public final class RelationSourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RelationSourceType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;
    public static final RelationSourceType UNKNOWN = new RelationSourceType("UNKNOWN", 0, -1);
    public static final RelationSourceType NORMAL = new RelationSourceType("NORMAL", 1, 0);
    public static final RelationSourceType P2P = new RelationSourceType(CustomMessageData.SERVICE_NAME_P2P, 2, 1);
    public static final RelationSourceType AFFILIATE = new RelationSourceType("AFFILIATE", 3, 2);
    public static final RelationSourceType SOCIAL_TRADING = new RelationSourceType("SOCIAL_TRADING", 4, 3);
    public static final RelationSourceType OK_ASSISTANT = new RelationSourceType("OK_ASSISTANT", 5, 5);
    public static final RelationSourceType VIP = new RelationSourceType("VIP", 6, 6);
    public static final RelationSourceType CRYPTO_GIFT = new RelationSourceType("CRYPTO_GIFT", 7, 7);
    public static final RelationSourceType PAYMENT = new RelationSourceType("PAYMENT", 8, 8);
    public static final RelationSourceType ORBIT = new RelationSourceType("ORBIT", 9, 9);
    public static final RelationSourceType GBSC = new RelationSourceType("GBSC", 10, 10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RelationSourceType[] $values() {
        return new RelationSourceType[]{UNKNOWN, NORMAL, P2P, AFFILIATE, SOCIAL_TRADING, OK_ASSISTANT, VIP, CRYPTO_GIFT, PAYMENT, ORBIT, GBSC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RelationSourceType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.RelationSourceType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RelationSourceType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RelationSourceType> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sNW();
    }

    private RelationSourceType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RelationSourceType[] relationSourceTypeArr$values = $values();
        $VALUES = relationSourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(relationSourceTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RelationSourceType._init_$_anonymous_();
            }
        });
    }

    public static RelationSourceType valueOf(String str) {
        return (RelationSourceType) Enum.valueOf(RelationSourceType.class, str);
    }

    public static RelationSourceType[] values() {
        return (RelationSourceType[]) $VALUES.clone();
    }
}
