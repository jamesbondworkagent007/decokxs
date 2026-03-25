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
public final class InvestApyDetailInfo implements Parcelable {
    private final String apyCalDesc;
    private final String rate;
    private final List<InvestApySubDetailInfo> subDetailInfoList;
    private final InvestTipInfoVo templateTip;
    private final String title;
    private final String totalValue;
    private final ApyType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestApyDetailInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(InvestApySubDetailInfo$$serializer.INSTANCE), null, null, ApyType.Companion.serializer(), null, null};

    public static final class Creator implements Parcelable.Creator<InvestApyDetailInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestApyDetailInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestApySubDetailInfo.CREATOR.createFromParcel(parcel));
            }
            return new InvestApyDetailInfo(string, arrayList, parcel.readString(), parcel.readString(), ApyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestApyDetailInfo[] newArray(int i) {
            return new InvestApyDetailInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestApyDetailInfo() {
        this((String) null, (List) null, (String) null, (String) null, (ApyType) null, (InvestTipInfoVo) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestApyDetailInfo copy$default(InvestApyDetailInfo investApyDetailInfo, String str, List list, String str2, String str3, ApyType apyType, InvestTipInfoVo investTipInfoVo, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investApyDetailInfo.apyCalDesc;
        }
        if ((i & 2) != 0) {
            list = investApyDetailInfo.subDetailInfoList;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = investApyDetailInfo.title;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = investApyDetailInfo.rate;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            apyType = investApyDetailInfo.type;
        }
        ApyType apyType2 = apyType;
        if ((i & 32) != 0) {
            investTipInfoVo = investApyDetailInfo.templateTip;
        }
        InvestTipInfoVo investTipInfoVo2 = investTipInfoVo;
        if ((i & 64) != 0) {
            str4 = investApyDetailInfo.totalValue;
        }
        return investApyDetailInfo.copy(str, list2, str5, str6, apyType2, investTipInfoVo2, str4);
    }

    @SerialName("apyCalDesc")
    public static /* synthetic */ void getApyCalDesc$annotations() {
    }

    @SerialName("rate")
    public static /* synthetic */ void getRate$annotations() {
    }

    @SerialName("subDetailInfoList")
    public static /* synthetic */ void getSubDetailInfoList$annotations() {
    }

    @SerialName("templateTip")
    public static /* synthetic */ void getTemplateTip$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("totalValue")
    public static /* synthetic */ void getTotalValue$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.apyCalDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestApySubDetailInfo> component2() {
        return this.subDetailInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApyType component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component6() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestApyDetailInfo copy(@NotNull String str, @NotNull List<InvestApySubDetailInfo> list, @NotNull String str2, @NotNull String str3, @NotNull ApyType apyType, InvestTipInfoVo investTipInfoVo, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(apyType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InvestApyDetailInfo(str, list, str2, str3, apyType, investTipInfoVo, str4);
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
        if (!(obj instanceof InvestApyDetailInfo)) {
            return false;
        }
        InvestApyDetailInfo investApyDetailInfo = (InvestApyDetailInfo) obj;
        return Intrinsics.EZpvd((Object) this.apyCalDesc, (Object) investApyDetailInfo.apyCalDesc) && Intrinsics.EZpvd(this.subDetailInfoList, investApyDetailInfo.subDetailInfoList) && Intrinsics.EZpvd((Object) this.title, (Object) investApyDetailInfo.title) && Intrinsics.EZpvd((Object) this.rate, (Object) investApyDetailInfo.rate) && this.type == investApyDetailInfo.type && Intrinsics.EZpvd(this.templateTip, investApyDetailInfo.templateTip) && Intrinsics.EZpvd((Object) this.totalValue, (Object) investApyDetailInfo.totalValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApyCalDesc() {
        return this.apyCalDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestApySubDetailInfo> getSubDetailInfoList() {
        return this.subDetailInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getTemplateTip() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
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
        int iHashCode = this.apyCalDesc.hashCode();
        int iHashCode2 = this.subDetailInfoList.hashCode();
        int iHashCode3 = this.title.hashCode();
        int iHashCode4 = this.rate.hashCode();
        int iHashCode5 = this.type.hashCode();
        InvestTipInfoVo investTipInfoVo = this.templateTip;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode())) * 31) + this.totalValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestApyDetailInfo(apyCalDesc=" + this.apyCalDesc + ", subDetailInfoList=" + this.subDetailInfoList + ", title=" + this.title + ", rate=" + this.rate + ", type=" + this.type + ", templateTip=" + this.templateTip + ", totalValue=" + this.totalValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.apyCalDesc);
        List<InvestApySubDetailInfo> list = this.subDetailInfoList;
        parcel.writeInt(list.size());
        Iterator<InvestApySubDetailInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestApyDetailInfo> serializer() {
            return InvestApyDetailInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestApyDetailInfo(int i, String str, List list, String str2, String str3, ApyType apyType, InvestTipInfoVo investTipInfoVo, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.apyCalDesc = "";
        } else {
            this.apyCalDesc = str;
        }
        if ((i & 2) == 0) {
            this.subDetailInfoList = yDY.AhwBna();
        } else {
            this.subDetailInfoList = list;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.rate = "";
        } else {
            this.rate = str3;
        }
        if ((i & 16) == 0) {
            this.type = ApyType.BaseApy;
        } else {
            this.type = apyType;
        }
        if ((i & 32) == 0) {
            this.templateTip = null;
        } else {
            this.templateTip = investTipInfoVo;
        }
        if ((i & 64) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestApyDetailInfo investApyDetailInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investApyDetailInfo.apyCalDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investApyDetailInfo.apyCalDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(investApyDetailInfo.subDetailInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investApyDetailInfo.subDetailInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investApyDetailInfo.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investApyDetailInfo.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investApyDetailInfo.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investApyDetailInfo.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investApyDetailInfo.type != ApyType.BaseApy) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investApyDetailInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investApyDetailInfo.templateTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, InvestTipInfoVo$$serializer.INSTANCE, investApyDetailInfo.templateTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) investApyDetailInfo.totalValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, investApyDetailInfo.totalValue);
    }

    public InvestApyDetailInfo(@NotNull String str, @NotNull List<InvestApySubDetailInfo> list, @NotNull String str2, @NotNull String str3, @NotNull ApyType apyType, InvestTipInfoVo investTipInfoVo, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(apyType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.apyCalDesc = str;
        this.subDetailInfoList = list;
        this.title = str2;
        this.rate = str3;
        this.type = apyType;
        this.templateTip = investTipInfoVo;
        this.totalValue = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.util.List:0x0011: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:292)) : (r8v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.ApyType:0x0026: TERNARY null = ((wrap:int:0x0020: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.ApyType:0x0024: SGET  A[WRAPPED] (LINE:298) com.okinc.business.invest_biz.data.contants.ApyType.BaseApy com.okinc.business.invest_biz.data.contants.ApyType) : (r11v0 com.okinc.business.invest_biz.data.contants.ApyType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:0x002c: TERNARY null = ((wrap:int:0x0027: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r12v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestApySubDetailInfo>, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.ApyType, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String):void (m)] (LINE:288) call: com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.ApyType, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String):void type: THIS */
    public /* synthetic */ InvestApyDetailInfo(String str, List list, String str2, String str3, ApyType apyType, InvestTipInfoVo investTipInfoVo, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ApyType.BaseApy : apyType, (i & 32) != 0 ? null : investTipInfoVo, (i & 64) != 0 ? "" : str4);
    }
}
