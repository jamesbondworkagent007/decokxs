package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.models.UnderlyingToken;
import com.okinc.business.invest_biz.data.models.UnderlyingToken$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class InvestCoinRecommendBean implements Parcelable {
    private boolean includeBonus;
    private final String jumpParam;
    private String rate;
    private String rateType;
    private String rateTypeDesc;
    private final int tabId;
    private String tokenIdKey;
    private List<UnderlyingToken> tokenLogos;
    private String tokenSymbol;
    private final String totalTokenAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestCoinRecommendBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(UnderlyingToken$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestCoinRecommendBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCoinRecommendBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                }
            }
            return new InvestCoinRecommendBean(string, string2, string3, string4, string5, arrayList, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCoinRecommendBean[] newArray(int i) {
            return new InvestCoinRecommendBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestCoinRecommendBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, 0, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    @SerialName("jumpParam")
    public static /* synthetic */ void getJumpParam$annotations() {
    }

    @SerialName("tabId")
    public static /* synthetic */ void getTabId$annotations() {
    }

    @SerialName("totalTokenAmount")
    public static /* synthetic */ void getTotalTokenAmount$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenIdKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component6() {
        return this.tokenLogos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.includeBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.jumpParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCoinRecommendBean copy(String str, String str2, String str3, String str4, String str5, List<UnderlyingToken> list, boolean z, int i, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InvestCoinRecommendBean(str, str2, str3, str4, str5, list, z, i, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestCoinRecommendBean)) {
            return false;
        }
        InvestCoinRecommendBean investCoinRecommendBean = (InvestCoinRecommendBean) obj;
        return Intrinsics.EZpvd((Object) this.rate, (Object) investCoinRecommendBean.rate) && Intrinsics.EZpvd((Object) this.rateType, (Object) investCoinRecommendBean.rateType) && Intrinsics.EZpvd((Object) this.rateTypeDesc, (Object) investCoinRecommendBean.rateTypeDesc) && Intrinsics.EZpvd((Object) this.tokenIdKey, (Object) investCoinRecommendBean.tokenIdKey) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investCoinRecommendBean.tokenSymbol) && Intrinsics.EZpvd(this.tokenLogos, investCoinRecommendBean.tokenLogos) && this.includeBonus == investCoinRecommendBean.includeBonus && this.tabId == investCoinRecommendBean.tabId && Intrinsics.EZpvd((Object) this.jumpParam, (Object) investCoinRecommendBean.jumpParam) && Intrinsics.EZpvd((Object) this.totalTokenAmount, (Object) investCoinRecommendBean.totalTokenAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIncludeBonus() {
        return this.includeBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJumpParam() {
        return this.jumpParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateTypeDesc() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTabId() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenIdKey() {
        return this.tokenIdKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getTokenLogos() {
        return this.tokenLogos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTokenAmount() {
        return this.totalTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rateType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.rateTypeDesc;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenIdKey;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenSymbol;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        List<UnderlyingToken> list = this.tokenLogos;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.includeBonus)) * 31) + Integer.hashCode(this.tabId)) * 31) + this.jumpParam.hashCode()) * 31) + this.totalTokenAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIncludeBonus(boolean z) {
        this.includeBonus = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(String str) {
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateType(String str) {
        this.rateType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateTypeDesc(String str) {
        this.rateTypeDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenIdKey(String str) {
        this.tokenIdKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogos(List<UnderlyingToken> list) {
        this.tokenLogos = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(String str) {
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestCoinRecommendBean(rate=" + this.rate + ", rateType=" + this.rateType + ", rateTypeDesc=" + this.rateTypeDesc + ", tokenIdKey=" + this.tokenIdKey + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogos=" + this.tokenLogos + ", includeBonus=" + this.includeBonus + ", tabId=" + this.tabId + ", jumpParam=" + this.jumpParam + ", totalTokenAmount=" + this.totalTokenAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rate);
        parcel.writeString(this.rateType);
        parcel.writeString(this.rateTypeDesc);
        parcel.writeString(this.tokenIdKey);
        parcel.writeString(this.tokenSymbol);
        List<UnderlyingToken> list = this.tokenLogos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UnderlyingToken> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.includeBonus ? 1 : 0);
        parcel.writeInt(this.tabId);
        parcel.writeString(this.jumpParam);
        parcel.writeString(this.totalTokenAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestCoinRecommendBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestCoinRecommendBean> serializer() {
            return InvestCoinRecommendBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestCoinRecommendBean(int i, String str, String str2, String str3, String str4, String str5, List list, boolean z, int i2, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rate = null;
        } else {
            this.rate = str;
        }
        if ((i & 2) == 0) {
            this.rateType = null;
        } else {
            this.rateType = str2;
        }
        if ((i & 4) == 0) {
            this.rateTypeDesc = null;
        } else {
            this.rateTypeDesc = str3;
        }
        if ((i & 8) == 0) {
            this.tokenIdKey = null;
        } else {
            this.tokenIdKey = str4;
        }
        if ((i & 16) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 32) == 0) {
            this.tokenLogos = null;
        } else {
            this.tokenLogos = list;
        }
        if ((i & 64) == 0) {
            this.includeBonus = false;
        } else {
            this.includeBonus = z;
        }
        if ((i & 128) == 0) {
            this.tabId = 0;
        } else {
            this.tabId = i2;
        }
        if ((i & 256) == 0) {
            this.jumpParam = "";
        } else {
            this.jumpParam = str6;
        }
        if ((i & 512) == 0) {
            this.totalTokenAmount = "";
        } else {
            this.totalTokenAmount = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestCoinRecommendBean investCoinRecommendBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investCoinRecommendBean.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investCoinRecommendBean.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investCoinRecommendBean.rateType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investCoinRecommendBean.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investCoinRecommendBean.rateTypeDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investCoinRecommendBean.rateTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investCoinRecommendBean.tokenIdKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investCoinRecommendBean.tokenIdKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investCoinRecommendBean.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investCoinRecommendBean.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investCoinRecommendBean.tokenLogos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], investCoinRecommendBean.tokenLogos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investCoinRecommendBean.includeBonus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, investCoinRecommendBean.includeBonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investCoinRecommendBean.tabId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, investCoinRecommendBean.tabId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investCoinRecommendBean.jumpParam, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investCoinRecommendBean.jumpParam);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) investCoinRecommendBean.totalTokenAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, investCoinRecommendBean.totalTokenAmount);
    }

    public InvestCoinRecommendBean(String str, String str2, String str3, String str4, String str5, List<UnderlyingToken> list, boolean z, int i, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.rate = str;
        this.rateType = str2;
        this.rateTypeDesc = str3;
        this.tokenIdKey = str4;
        this.tokenSymbol = str5;
        this.tokenLogos = list;
        this.includeBonus = z;
        this.tabId = i;
        this.jumpParam = str6;
        this.totalTokenAmount = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.util.List) : (null java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, boolean, int, java.lang.String, java.lang.String):void (m)] (LINE:165) call: com.okinc.business.invest_biz.data.bean.InvestCoinRecommendBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestCoinRecommendBean(String str, String str2, String str3, String str4, String str5, List list, boolean z, int i, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) == 0 ? list : null, (i2 & 64) != 0 ? false : z, (i2 & 128) == 0 ? i : 0, (i2 & 256) != 0 ? "" : str6, (i2 & 512) == 0 ? str7 : "");
    }
}
