package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSubscriptionReceiveInfoUIBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final InvestExchangeRateBean exchangeBean;
    private final String fixedApy;
    private final List<InvestTokenWithAmount> investWithToken;
    private final Integer investmentCategory;
    private final boolean isDataErro;
    private final boolean isInit;
    private final String maturityTime;
    private final String platformLogo;
    private final String platformName;
    private final InvestTokenWithAmount receiveTokenInfo;
    private final List<InvestTokenWithAmount> swapToToken;
    private final InvestTipsBean tipsBean;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestSubscriptionReceiveInfoUIBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestSubscriptionReceiveInfoUIBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSubscriptionReceiveInfoUIBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                }
            }
            return new InvestSubscriptionReceiveInfoUIBean(z, string, string2, arrayList, arrayList2, parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, InvestTipsBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestExchangeRateBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSubscriptionReceiveInfoUIBean[] newArray(int i) {
            return new InvestSubscriptionReceiveInfoUIBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fixedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component4() {
        return this.investWithToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component5() {
        return this.swapToToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component6() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isDataErro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipsBean component8() {
        return this.tipsBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestExchangeRateBean component9() {
        return this.exchangeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionReceiveInfoUIBean copy(boolean z, @NotNull String str, @NotNull String str2, List<InvestTokenWithAmount> list, List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount, boolean z2, @NotNull InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investTipsBean, "");
        return new InvestSubscriptionReceiveInfoUIBean(z, str, str2, list, list2, investTokenWithAmount, z2, investTipsBean, investExchangeRateBean, str3, str4, num);
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
        if (!(obj instanceof InvestSubscriptionReceiveInfoUIBean)) {
            return false;
        }
        InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean = (InvestSubscriptionReceiveInfoUIBean) obj;
        return this.isInit == investSubscriptionReceiveInfoUIBean.isInit && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investSubscriptionReceiveInfoUIBean.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investSubscriptionReceiveInfoUIBean.platformName) && Intrinsics.EZpvd(this.investWithToken, investSubscriptionReceiveInfoUIBean.investWithToken) && Intrinsics.EZpvd(this.swapToToken, investSubscriptionReceiveInfoUIBean.swapToToken) && Intrinsics.EZpvd(this.receiveTokenInfo, investSubscriptionReceiveInfoUIBean.receiveTokenInfo) && this.isDataErro == investSubscriptionReceiveInfoUIBean.isDataErro && Intrinsics.EZpvd(this.tipsBean, investSubscriptionReceiveInfoUIBean.tipsBean) && Intrinsics.EZpvd(this.exchangeBean, investSubscriptionReceiveInfoUIBean.exchangeBean) && Intrinsics.EZpvd((Object) this.fixedApy, (Object) investSubscriptionReceiveInfoUIBean.fixedApy) && Intrinsics.EZpvd((Object) this.maturityTime, (Object) investSubscriptionReceiveInfoUIBean.maturityTime) && Intrinsics.EZpvd(this.investmentCategory, investSubscriptionReceiveInfoUIBean.investmentCategory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestExchangeRateBean getExchangeBean() {
        return this.exchangeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedApy() {
        return this.fixedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getInvestWithToken() {
        return this.investWithToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaturityTime() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getReceiveTokenInfo() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSwapToToken() {
        return this.swapToToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipsBean getTipsBean() {
        return this.tipsBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isInit);
        int iHashCode2 = this.platformLogo.hashCode();
        int iHashCode3 = this.platformName.hashCode();
        List<InvestTokenWithAmount> list = this.investWithToken;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<InvestTokenWithAmount> list2 = this.swapToToken;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        int iHashCode6 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isDataErro);
        int iHashCode8 = this.tipsBean.hashCode();
        InvestExchangeRateBean investExchangeRateBean = this.exchangeBean;
        int iHashCode9 = investExchangeRateBean == null ? 0 : investExchangeRateBean.hashCode();
        String str = this.fixedApy;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.maturityTime;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.investmentCategory;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDataErro() {
        return this.isDataErro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInit() {
        return this.isInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSubscriptionReceiveInfoUIBean(isInit=" + this.isInit + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", investWithToken=" + this.investWithToken + ", swapToToken=" + this.swapToToken + ", receiveTokenInfo=" + this.receiveTokenInfo + ", isDataErro=" + this.isDataErro + ", tipsBean=" + this.tipsBean + ", exchangeBean=" + this.exchangeBean + ", fixedApy=" + this.fixedApy + ", maturityTime=" + this.maturityTime + ", investmentCategory=" + this.investmentCategory + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isInit ? 1 : 0);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        List<InvestTokenWithAmount> list = this.investWithToken;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestTokenWithAmount> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<InvestTokenWithAmount> list2 = this.swapToToken;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<InvestTokenWithAmount> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isDataErro ? 1 : 0);
        this.tipsBean.writeToParcel(parcel, i);
        InvestExchangeRateBean investExchangeRateBean = this.exchangeBean;
        if (investExchangeRateBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investExchangeRateBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fixedApy);
        parcel.writeString(this.maturityTime);
        Integer num = this.investmentCategory;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSubscriptionReceiveInfoUIBean> serializer() {
            return InvestSubscriptionReceiveInfoUIBean$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null};
    }

    public /* synthetic */ InvestSubscriptionReceiveInfoUIBean(int i, boolean z, String str, String str2, List list, List list2, InvestTokenWithAmount investTokenWithAmount, boolean z2, InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, String str3, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InvestSubscriptionReceiveInfoUIBean$$serializer.INSTANCE.getDescriptor());
        }
        this.isInit = z;
        if ((i & 2) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str;
        }
        if ((i & 4) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str2;
        }
        if ((i & 8) == 0) {
            this.investWithToken = null;
        } else {
            this.investWithToken = list;
        }
        if ((i & 16) == 0) {
            this.swapToToken = null;
        } else {
            this.swapToToken = list2;
        }
        if ((i & 32) == 0) {
            this.receiveTokenInfo = null;
        } else {
            this.receiveTokenInfo = investTokenWithAmount;
        }
        if ((i & 64) == 0) {
            this.isDataErro = false;
        } else {
            this.isDataErro = z2;
        }
        this.tipsBean = (i & 128) == 0 ? new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : investTipsBean;
        if ((i & 256) == 0) {
            this.exchangeBean = null;
        } else {
            this.exchangeBean = investExchangeRateBean;
        }
        if ((i & 512) == 0) {
            this.fixedApy = null;
        } else {
            this.fixedApy = str3;
        }
        if ((i & 1024) == 0) {
            this.maturityTime = null;
        } else {
            this.maturityTime = str4;
        }
        this.investmentCategory = (i & 2048) == 0 ? 0 : num;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, investSubscriptionReceiveInfoUIBean.isInit);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfoUIBean.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investSubscriptionReceiveInfoUIBean.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investSubscriptionReceiveInfoUIBean.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investSubscriptionReceiveInfoUIBean.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investSubscriptionReceiveInfoUIBean.investWithToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], investSubscriptionReceiveInfoUIBean.investWithToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investSubscriptionReceiveInfoUIBean.swapToToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], investSubscriptionReceiveInfoUIBean.swapToToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investSubscriptionReceiveInfoUIBean.receiveTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, InvestTokenWithAmount$$serializer.INSTANCE, investSubscriptionReceiveInfoUIBean.receiveTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investSubscriptionReceiveInfoUIBean.isDataErro) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, investSubscriptionReceiveInfoUIBean.isDataErro);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investSubscriptionReceiveInfoUIBean.tipsBean, new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, InvestTipsBean$$serializer.INSTANCE, investSubscriptionReceiveInfoUIBean.tipsBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investSubscriptionReceiveInfoUIBean.exchangeBean != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, InvestExchangeRateBean$$serializer.INSTANCE, investSubscriptionReceiveInfoUIBean.exchangeBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investSubscriptionReceiveInfoUIBean.fixedApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investSubscriptionReceiveInfoUIBean.fixedApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investSubscriptionReceiveInfoUIBean.maturityTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investSubscriptionReceiveInfoUIBean.maturityTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || (num = investSubscriptionReceiveInfoUIBean.investmentCategory) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, investSubscriptionReceiveInfoUIBean.investmentCategory);
        }
    }

    public InvestSubscriptionReceiveInfoUIBean(boolean z, @NotNull String str, @NotNull String str2, List<InvestTokenWithAmount> list, List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount, boolean z2, @NotNull InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investTipsBean, "");
        this.isInit = z;
        this.platformLogo = str;
        this.platformName = str2;
        this.investWithToken = list;
        this.swapToToken = list2;
        this.receiveTokenInfo = investTokenWithAmount;
        this.isDataErro = z2;
        this.tipsBean = investTipsBean;
        this.exchangeBean = investExchangeRateBean;
        this.fixedApy = str3;
        this.maturityTime = str4;
        this.investmentCategory = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0092: CONSTRUCTOR 
  (r17v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0024: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r22v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipsBean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: CONSTRUCTOR 
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:234) call: com.okinc.business.invest_biz.data.bean.InvestTipsBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 com.okinc.business.invest_biz.data.bean.InvestTipsBean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean) : (r25v0 com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006d: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 java.lang.Integer))
 A[MD:(boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, boolean, com.okinc.business.invest_biz.data.bean.InvestTipsBean, com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:226) call: com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean.<init>(boolean, java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, boolean, com.okinc.business.invest_biz.data.bean.InvestTipsBean, com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ InvestSubscriptionReceiveInfoUIBean(boolean z, String str, String str2, List list, List list2, InvestTokenWithAmount investTokenWithAmount, boolean z2, InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : investTokenWithAmount, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : investTipsBean, (i & 256) != 0 ? null : investExchangeRateBean, (i & 512) != 0 ? null : str3, (i & 1024) == 0 ? str4 : null, (i & 2048) != 0 ? 0 : num);
    }
}
