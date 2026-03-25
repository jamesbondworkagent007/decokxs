package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.NamedCompanion;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OfficialTagType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OfficialTagType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final CREATOR CREATOR;
    private final int type;

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final OfficialTagType Official = new OfficialTagType("Official", 0, -1);

    @SerialName("1")
    public static final OfficialTagType VipManager = new OfficialTagType("VipManager", 1, 1);

    @SerialName("2")
    public static final OfficialTagType CommunityOperation = new OfficialTagType("CommunityOperation", 2, 2);

    @SerialName("3")
    public static final OfficialTagType VipRM = new OfficialTagType("VipRM", 3, 3);

    @SerialName("4")
    public static final OfficialTagType VipSupport = new OfficialTagType("VipSupport", 4, 4);

    @SerialName("5")
    public static final OfficialTagType ROBOT = new OfficialTagType("ROBOT", 5, 5);

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final OfficialTagType SUPPORT = new OfficialTagType("SUPPORT", 6, 6);

    @SerialName("100")
    public static final OfficialTagType DefaultNonOfficial = new OfficialTagType("DefaultNonOfficial", 7, 100);

    @SerialName(UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER)
    public static final OfficialTagType CertifiedMerchant = new OfficialTagType("CertifiedMerchant", 8, 101);

    @SerialName("102")
    public static final OfficialTagType DiamondMerchant = new OfficialTagType("DiamondMerchant", 9, 102);

    @SerialName("103")
    public static final OfficialTagType PendingRecallVIP = new OfficialTagType("PendingRecallVIP", 10, 103);

    @SerialName("104")
    public static final OfficialTagType InObserveVip = new OfficialTagType("InObserveVip", 11, 104);

    @SerialName("105")
    public static final OfficialTagType InEmergencyVip = new OfficialTagType("InEmergencyVip", 12, 105);

    @SerialName("106")
    public static final OfficialTagType VipTag = new OfficialTagType("VipTag", 13, 106);

    @SerialName("120")
    public static final OfficialTagType Vip1 = new OfficialTagType("Vip1", 14, 120);

    @SerialName("121")
    public static final OfficialTagType Vip2 = new OfficialTagType("Vip2", 15, 121);

    @SerialName("122")
    public static final OfficialTagType Vip3 = new OfficialTagType("Vip3", 16, 122);

    @SerialName("123")
    public static final OfficialTagType Vip4 = new OfficialTagType("Vip4", 17, 123);

    @SerialName("124")
    public static final OfficialTagType Vip5 = new OfficialTagType("Vip5", 18, 124);

    @SerialName("125")
    public static final OfficialTagType Vip6 = new OfficialTagType("Vip6", 19, 125);

    @SerialName("126")
    public static final OfficialTagType Vip7 = new OfficialTagType("Vip7", 20, WebSocketProtocol.PAYLOAD_SHORT);

    @SerialName("127")
    public static final OfficialTagType Vip8 = new OfficialTagType("Vip8", 21, 127);

    @SerialName("128")
    public static final OfficialTagType Vip9 = new OfficialTagType("Vip9", 22, 128);

    @SerialName("200")
    public static final OfficialTagType Beta = new OfficialTagType("Beta", 23, 200);

    @SerialName("201")
    public static final OfficialTagType OfficialGroup = new OfficialTagType("OfficialGroup", 24, 201);

    @SerialName("301")
    public static final OfficialTagType AffiliateGroup = new OfficialTagType("AffiliateGroup", 25, 301);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OfficialTagType[] $values() {
        return new OfficialTagType[]{Official, VipManager, CommunityOperation, VipRM, VipSupport, ROBOT, SUPPORT, DefaultNonOfficial, CertifiedMerchant, DiamondMerchant, PendingRecallVIP, InObserveVip, InEmergencyVip, VipTag, Vip1, Vip2, Vip3, Vip4, Vip5, Vip6, Vip7, Vip8, Vip9, Beta, OfficialGroup, AffiliateGroup};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OfficialTagType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private OfficialTagType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        OfficialTagType[] officialTagTypeArr$values = $values();
        $VALUES = officialTagTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(officialTagTypeArr$values);
        CREATOR = new CREATOR(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OfficialTagType._init_$_anonymous_();
            }
        });
    }

    private OfficialTagType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OfficialTagType> {

        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] EZpvd;
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[UserTagType.values().length];
                try {
                    iArr[UserTagType.Official.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UserTagType.VipManager.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UserTagType.VipRM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UserTagType.VipSupport.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[UserTagType.CommunityOperation.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[UserTagType.ROBOT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[UserTagType.SUPPORT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[UserTagType.CertifiedMerchant.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[UserTagType.DiamondMerchant.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[UserTagType.PendingRecallVIP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[UserTagType.InEmergencyVip.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[UserTagType.InObserveVip.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[UserTagType.Vip1.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[UserTagType.Vip2.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[UserTagType.Vip3.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[UserTagType.Vip4.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[UserTagType.Vip5.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[UserTagType.Vip6.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[UserTagType.Vip7.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[UserTagType.Vip8.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[UserTagType.Vip9.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                EZpvd = iArr;
                int[] iArr2 = new int[GroupTagType.values().length];
                try {
                    iArr2[GroupTagType.NOVICE_GROUP.ordinal()] = 1;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr2[GroupTagType.CURRENCY_GROUP.ordinal()] = 2;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr2[GroupTagType.CUSTOMER_GROUP.ordinal()] = 3;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr2[GroupTagType.COMMUNITY_GROUP.ordinal()] = 4;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr2[GroupTagType.COMMON.ordinal()] = 5;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr2[GroupTagType.MERCHANT.ordinal()] = 6;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr2[GroupTagType.SOCIAL_TRADING.ordinal()] = 7;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr2[GroupTagType.OK_ASSISTANT.ordinal()] = 8;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr2[GroupTagType.GBSC_OUTBOUND_CALL_GROUP.ordinal()] = 9;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr2[GroupTagType.AFFILIATE.ordinal()] = 10;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr2[GroupTagType.VIP_CHAT_GROUP.ordinal()] = 11;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr2[GroupTagType.BETA.ordinal()] = 12;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr2[GroupTagType.DEFAULT.ordinal()] = 13;
                } catch (NoSuchFieldError unused34) {
                }
                copydefault = iArr2;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.OfficialTagType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) OfficialTagType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OfficialTagType> serializer() {
            return get$cachedSerializer();
        }

        public final OfficialTagType valueOf(int i) {
            if (i == 1) {
                return OfficialTagType.VipManager;
            }
            if (i == 2) {
                return OfficialTagType.CommunityOperation;
            }
            if (i == 3) {
                return OfficialTagType.VipRM;
            }
            if (i == 4) {
                return OfficialTagType.VipSupport;
            }
            if (i == 5) {
                return OfficialTagType.ROBOT;
            }
            if (i == 6) {
                return OfficialTagType.SUPPORT;
            }
            if (i == 100) {
                return OfficialTagType.DefaultNonOfficial;
            }
            if (i == 101) {
                return OfficialTagType.CertifiedMerchant;
            }
            if (i == 102) {
                return OfficialTagType.DiamondMerchant;
            }
            if (i == 103) {
                return OfficialTagType.PendingRecallVIP;
            }
            if (i == 104) {
                return OfficialTagType.InObserveVip;
            }
            if (i == 105) {
                return OfficialTagType.InEmergencyVip;
            }
            if (i == 120) {
                return OfficialTagType.Vip1;
            }
            if (i == 121) {
                return OfficialTagType.Vip2;
            }
            if (i == 122) {
                return OfficialTagType.Vip3;
            }
            if (i == 123) {
                return OfficialTagType.Vip4;
            }
            if (i == 124) {
                return OfficialTagType.Vip5;
            }
            if (i == 125) {
                return OfficialTagType.Vip6;
            }
            if (i == 126) {
                return OfficialTagType.Vip7;
            }
            if (i == 127) {
                return OfficialTagType.Vip8;
            }
            if (i == 128) {
                return OfficialTagType.Vip9;
            }
            if (i == 200) {
                return OfficialTagType.Beta;
            }
            if (i == 201) {
                return OfficialTagType.OfficialGroup;
            }
            if (i == 301) {
                return OfficialTagType.AffiliateGroup;
            }
            if (i == -1) {
                return OfficialTagType.Official;
            }
            if (3 <= i && i < 101) {
                return OfficialTagType.Official;
            }
            if (202 <= i && i < 301) {
                return OfficialTagType.OfficialGroup;
            }
            if (302 > i || i >= 401) {
                return null;
            }
            return OfficialTagType.AffiliateGroup;
        }

        public final OfficialTagType fromInHouseUserTag(@NotNull UserTagType userTagType) {
            Intrinsics.checkNotNullParameter(userTagType, "");
            switch (Application.EZpvd[userTagType.ordinal()]) {
            }
            return OfficialTagType.Official;
        }

        public final OfficialTagType fromInHouseGroupTag(@NotNull GroupTagType groupTagType) {
            Intrinsics.checkNotNullParameter(groupTagType, "");
            switch (Application.copydefault[groupTagType.ordinal()]) {
            }
            return OfficialTagType.OfficialGroup;
        }

        public final boolean isValid(int i) {
            OfficialTagType officialTagType;
            OfficialTagType[] officialTagTypeArrValues = OfficialTagType.values();
            int length = officialTagTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    officialTagType = null;
                    break;
                }
                officialTagType = officialTagTypeArrValues[i2];
                if (officialTagType.getType() == i) {
                    break;
                }
                i2++;
            }
            return officialTagType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OfficialTagType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return valueOf(parcel.readInt());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OfficialTagType[] newArray(int i) {
            return new OfficialTagType[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.remote.OfficialTagType", values(), new String[]{MultiTransferSignData.DEFAULT_INTERVAL, "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "100", UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER, "102", "103", "104", "105", "106", "120", "121", "122", "123", "124", "125", "126", "127", "128", "200", "201", "301"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    public static OfficialTagType valueOf(String str) {
        return (OfficialTagType) Enum.valueOf(OfficialTagType.class, str);
    }

    public static OfficialTagType[] values() {
        return (OfficialTagType[]) $VALUES.clone();
    }
}
