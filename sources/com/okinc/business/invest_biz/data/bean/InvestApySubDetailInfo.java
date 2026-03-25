package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.contants.ApyType;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestApySubDetailInfo implements Parcelable {
    private final boolean hasBonus;
    private final List<InvestRateKeyValue> keyValueList;
    private final String rate;
    private final String subTitle;
    private final InvestTipInfoVo templateTip;
    private final String totalValue;
    private final ApyType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestApySubDetailInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestRateKeyValue$$serializer.INSTANCE), null, null, ApyType.Companion.serializer(), null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestApySubDetailInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestApySubDetailInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestRateKeyValue.CREATOR.createFromParcel(parcel));
            }
            return new InvestApySubDetailInfo(arrayList, parcel.readString(), parcel.readString(), ApyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestApySubDetailInfo[] newArray(int i) {
            return new InvestApySubDetailInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestApySubDetailInfo() {
        this((List) null, (String) null, (String) null, (ApyType) null, (InvestTipInfoVo) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestApySubDetailInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestApySubDetailInfo copy$default(InvestApySubDetailInfo investApySubDetailInfo, List list, String str, String str2, ApyType apyType, InvestTipInfoVo investTipInfoVo, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investApySubDetailInfo.keyValueList;
        }
        if ((i & 2) != 0) {
            str = investApySubDetailInfo.subTitle;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = investApySubDetailInfo.rate;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            apyType = investApySubDetailInfo.type;
        }
        ApyType apyType2 = apyType;
        if ((i & 16) != 0) {
            investTipInfoVo = investApySubDetailInfo.templateTip;
        }
        InvestTipInfoVo investTipInfoVo2 = investTipInfoVo;
        if ((i & 32) != 0) {
            str3 = investApySubDetailInfo.totalValue;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            z = investApySubDetailInfo.hasBonus;
        }
        return investApySubDetailInfo.copy(list, str4, str5, apyType2, investTipInfoVo2, str6, z);
    }

    @SerialName("hasBonus")
    public static /* synthetic */ void getHasBonus$annotations() {
    }

    @SerialName("keyValueList")
    public static /* synthetic */ void getKeyValueList$annotations() {
    }

    @SerialName("rate")
    public static /* synthetic */ void getRate$annotations() {
    }

    @SerialName("subTitle")
    public static /* synthetic */ void getSubTitle$annotations() {
    }

    @SerialName("templateTip")
    public static /* synthetic */ void getTemplateTip$annotations() {
    }

    @SerialName("totalValue")
    public static /* synthetic */ void getTotalValue$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestRateKeyValue> component1() {
        return this.keyValueList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApyType component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component5() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestApySubDetailInfo copy(@NotNull List<InvestRateKeyValue> list, @NotNull String str, @NotNull String str2, @NotNull ApyType apyType, InvestTipInfoVo investTipInfoVo, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(apyType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestApySubDetailInfo(list, str, str2, apyType, investTipInfoVo, str3, z);
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
        if (!(obj instanceof InvestApySubDetailInfo)) {
            return false;
        }
        InvestApySubDetailInfo investApySubDetailInfo = (InvestApySubDetailInfo) obj;
        return Intrinsics.EZpvd(this.keyValueList, investApySubDetailInfo.keyValueList) && Intrinsics.EZpvd((Object) this.subTitle, (Object) investApySubDetailInfo.subTitle) && Intrinsics.EZpvd((Object) this.rate, (Object) investApySubDetailInfo.rate) && this.type == investApySubDetailInfo.type && Intrinsics.EZpvd(this.templateTip, investApySubDetailInfo.templateTip) && Intrinsics.EZpvd((Object) this.totalValue, (Object) investApySubDetailInfo.totalValue) && this.hasBonus == investApySubDetailInfo.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasBonus() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestRateKeyValue> getKeyValueList() {
        return this.keyValueList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getTemplateTip() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApyType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.keyValueList.hashCode();
        int iHashCode2 = this.subTitle.hashCode();
        int iHashCode3 = this.rate.hashCode();
        int iHashCode4 = this.type.hashCode();
        InvestTipInfoVo investTipInfoVo = this.templateTip;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode())) * 31) + this.totalValue.hashCode()) * 31) + Boolean.hashCode(this.hasBonus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestApySubDetailInfo(keyValueList=" + this.keyValueList + ", subTitle=" + this.subTitle + ", rate=" + this.rate + ", type=" + this.type + ", templateTip=" + this.templateTip + ", totalValue=" + this.totalValue + ", hasBonus=" + this.hasBonus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestRateKeyValue> list = this.keyValueList;
        parcel.writeInt(list.size());
        Iterator<InvestRateKeyValue> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.subTitle);
        parcel.writeString(this.rate);
        parcel.writeString(this.type.name());
        InvestTipInfoVo investTipInfoVo = this.templateTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalValue);
        parcel.writeInt(this.hasBonus ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestApySubDetailInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestApySubDetailInfo> serializer() {
            return InvestApySubDetailInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestApySubDetailInfo(int i, List list, String str, String str2, ApyType apyType, InvestTipInfoVo investTipInfoVo, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.keyValueList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str;
        }
        if ((i & 4) == 0) {
            this.rate = "";
        } else {
            this.rate = str2;
        }
        if ((i & 8) == 0) {
            this.type = ApyType.BaseApy;
        } else {
            this.type = apyType;
        }
        if ((i & 16) == 0) {
            this.templateTip = null;
        } else {
            this.templateTip = investTipInfoVo;
        }
        if ((i & 32) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str3;
        }
        if ((i & 64) == 0) {
            this.hasBonus = false;
        } else {
            this.hasBonus = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestApySubDetailInfo investApySubDetailInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investApySubDetailInfo.keyValueList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investApySubDetailInfo.keyValueList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investApySubDetailInfo.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investApySubDetailInfo.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investApySubDetailInfo.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investApySubDetailInfo.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investApySubDetailInfo.type != ApyType.BaseApy) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investApySubDetailInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investApySubDetailInfo.templateTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestTipInfoVo$$serializer.INSTANCE, investApySubDetailInfo.templateTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investApySubDetailInfo.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investApySubDetailInfo.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investApySubDetailInfo.hasBonus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, investApySubDetailInfo.hasBonus);
        }
    }

    public InvestApySubDetailInfo(@NotNull List<InvestRateKeyValue> list, @NotNull String str, @NotNull String str2, @NotNull ApyType apyType, InvestTipInfoVo investTipInfoVo, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(apyType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.keyValueList = list;
        this.subTitle = str;
        this.rate = str2;
        this.type = apyType;
        this.templateTip = investTipInfoVo;
        this.totalValue = str3;
        this.hasBonus = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:310)) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.ApyType:0x001e: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.ApyType:0x001c: SGET  A[WRAPPED] (LINE:316) com.okinc.business.invest_biz.data.contants.ApyType.BaseApy com.okinc.business.invest_biz.data.contants.ApyType) : (r9v0 com.okinc.business.invest_biz.data.contants.ApyType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:0x0024: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r10v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestRateKeyValue>, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.ApyType, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String, boolean):void (m)] (LINE:308) call: com.okinc.business.invest_biz.data.bean.InvestApySubDetailInfo.<init>(java.util.List, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.ApyType, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestApySubDetailInfo(List list, String str, String str2, ApyType apyType, InvestTipInfoVo investTipInfoVo, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ApyType.BaseApy : apyType, (i & 16) != 0 ? null : investTipInfoVo, (i & 32) == 0 ? str3 : "", (i & 64) != 0 ? false : z);
    }
}
