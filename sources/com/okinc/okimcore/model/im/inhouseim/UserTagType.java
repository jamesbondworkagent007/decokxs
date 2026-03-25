package com.okinc.okimcore.model.im.inhouseim;

import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44439sPw;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44439sPw.class)
public final class UserTagType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UserTagType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int apiValue;
    public static final UserTagType Official = new UserTagType("Official", 0, -1);
    public static final UserTagType VipManager = new UserTagType("VipManager", 1, 1);
    public static final UserTagType CommunityOperation = new UserTagType("CommunityOperation", 2, 2);
    public static final UserTagType VipRM = new UserTagType("VipRM", 3, 3);
    public static final UserTagType VipSupport = new UserTagType("VipSupport", 4, 4);
    public static final UserTagType ROBOT = new UserTagType("ROBOT", 5, 5);
    public static final UserTagType SUPPORT = new UserTagType("SUPPORT", 6, 6);
    public static final UserTagType CertifiedMerchant = new UserTagType("CertifiedMerchant", 7, 101);
    public static final UserTagType DiamondMerchant = new UserTagType("DiamondMerchant", 8, 102);
    public static final UserTagType PendingRecallVIP = new UserTagType("PendingRecallVIP", 9, 103);
    public static final UserTagType InObserveVip = new UserTagType("InObserveVip", 10, 104);
    public static final UserTagType InEmergencyVip = new UserTagType("InEmergencyVip", 11, 105);
    public static final UserTagType Vip1 = new UserTagType("Vip1", 12, 120);
    public static final UserTagType Vip2 = new UserTagType("Vip2", 13, 121);
    public static final UserTagType Vip3 = new UserTagType("Vip3", 14, 122);
    public static final UserTagType Vip4 = new UserTagType("Vip4", 15, 123);
    public static final UserTagType Vip5 = new UserTagType("Vip5", 16, 124);
    public static final UserTagType Vip6 = new UserTagType("Vip6", 17, 125);
    public static final UserTagType Vip7 = new UserTagType("Vip7", 18, WebSocketProtocol.PAYLOAD_SHORT);
    public static final UserTagType Vip8 = new UserTagType("Vip8", 19, 127);
    public static final UserTagType Vip9 = new UserTagType("Vip9", 20, 128);
    public static final UserTagType UNKNOWN = new UserTagType("UNKNOWN", 21, -2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UserTagType[] $values() {
        return new UserTagType[]{Official, VipManager, CommunityOperation, VipRM, VipSupport, ROBOT, SUPPORT, CertifiedMerchant, DiamondMerchant, PendingRecallVIP, InObserveVip, InEmergencyVip, Vip1, Vip2, Vip3, Vip4, Vip5, Vip6, Vip7, Vip8, Vip9, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UserTagType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    private UserTagType(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        UserTagType[] userTagTypeArr$values = $values();
        $VALUES = userTagTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(userTagTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UserTagType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.UserTagType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) UserTagType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<UserTagType> serializer() {
            return copydefault();
        }

        public final UserTagType OLrzqt(int i) {
            UserTagType userTagType;
            UserTagType[] userTagTypeArrValues = UserTagType.values();
            int length = userTagTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    userTagType = null;
                    break;
                }
                userTagType = userTagTypeArrValues[i2];
                if (userTagType.getApiValue() == i) {
                    break;
                }
                i2++;
            }
            return userTagType == null ? UserTagType.UNKNOWN : userTagType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44439sPw();
    }

    public static UserTagType valueOf(String str) {
        return (UserTagType) Enum.valueOf(UserTagType.class, str);
    }

    public static UserTagType[] values() {
        return (UserTagType[]) $VALUES.clone();
    }
}
