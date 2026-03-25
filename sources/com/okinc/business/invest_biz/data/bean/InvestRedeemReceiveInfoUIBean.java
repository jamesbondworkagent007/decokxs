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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestRedeemReceiveInfoUIBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final InvestExchangeRateBean exchangeBean;
    private final Integer investmentCategory;
    private final boolean isDataErro;
    private final boolean isInit;
    private final InvestTokenWithAmount payWithTokenInfo;
    private final InvestTipInfoVo payWithTokenTip;
    private final String platformLogo;
    private final String platformName;
    private final List<InvestTokenWithAmount> receiveTokenInfo;
    private final InvestTipsBean redeemTips;
    private final List<InvestTokenWithAmount> swapToToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestRedeemReceiveInfoUIBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestRedeemReceiveInfoUIBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRedeemReceiveInfoUIBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            return new InvestRedeemReceiveInfoUIBean(z, string, string2, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), InvestTipsBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestExchangeRateBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRedeemReceiveInfoUIBean[] newArray(int i) {
            return new InvestRedeemReceiveInfoUIBean[i];
        }
    }

    @SerialName("exchangeBean")
    public static /* synthetic */ void getExchangeBean$annotations() {
    }

    @SerialName("payWithTokenInfo")
    public static /* synthetic */ void getPayWithTokenInfo$annotations() {
    }

    @SerialName("payWithTokenTip")
    public static /* synthetic */ void getPayWithTokenTip$annotations() {
    }

    @SerialName("redeemTips")
    public static /* synthetic */ void getRedeemTips$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component10() {
        return this.payWithTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component11() {
        return this.payWithTokenTip;
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
        return this.swapToToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component5() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isDataErro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipsBean component8() {
        return this.redeemTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestExchangeRateBean component9() {
        return this.exchangeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRedeemReceiveInfoUIBean copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list, @NotNull List<InvestTokenWithAmount> list2, boolean z2, Integer num, @NotNull InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, InvestTokenWithAmount investTokenWithAmount, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(investTipsBean, "");
        return new InvestRedeemReceiveInfoUIBean(z, str, str2, list, list2, z2, num, investTipsBean, investExchangeRateBean, investTokenWithAmount, investTipInfoVo);
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
        if (!(obj instanceof InvestRedeemReceiveInfoUIBean)) {
            return false;
        }
        InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean = (InvestRedeemReceiveInfoUIBean) obj;
        return this.isInit == investRedeemReceiveInfoUIBean.isInit && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investRedeemReceiveInfoUIBean.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investRedeemReceiveInfoUIBean.platformName) && Intrinsics.EZpvd(this.swapToToken, investRedeemReceiveInfoUIBean.swapToToken) && Intrinsics.EZpvd(this.receiveTokenInfo, investRedeemReceiveInfoUIBean.receiveTokenInfo) && this.isDataErro == investRedeemReceiveInfoUIBean.isDataErro && Intrinsics.EZpvd(this.investmentCategory, investRedeemReceiveInfoUIBean.investmentCategory) && Intrinsics.EZpvd(this.redeemTips, investRedeemReceiveInfoUIBean.redeemTips) && Intrinsics.EZpvd(this.exchangeBean, investRedeemReceiveInfoUIBean.exchangeBean) && Intrinsics.EZpvd(this.payWithTokenInfo, investRedeemReceiveInfoUIBean.payWithTokenInfo) && Intrinsics.EZpvd(this.payWithTokenTip, investRedeemReceiveInfoUIBean.payWithTokenTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestExchangeRateBean getExchangeBean() {
        return this.exchangeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getPayWithTokenInfo() {
        return this.payWithTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getPayWithTokenTip() {
        return this.payWithTokenTip;
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
    public final List<InvestTokenWithAmount> getReceiveTokenInfo() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipsBean getRedeemTips() {
        return this.redeemTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSwapToToken() {
        return this.swapToToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isInit);
        int iHashCode2 = this.platformLogo.hashCode();
        int iHashCode3 = this.platformName.hashCode();
        int iHashCode4 = this.swapToToken.hashCode();
        int iHashCode5 = this.receiveTokenInfo.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isDataErro);
        Integer num = this.investmentCategory;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        int iHashCode8 = this.redeemTips.hashCode();
        InvestExchangeRateBean investExchangeRateBean = this.exchangeBean;
        int iHashCode9 = investExchangeRateBean == null ? 0 : investExchangeRateBean.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.payWithTokenInfo;
        int iHashCode10 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        InvestTipInfoVo investTipInfoVo = this.payWithTokenTip;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (investTipInfoVo != null ? investTipInfoVo.hashCode() : 0);
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
        return "InvestRedeemReceiveInfoUIBean(isInit=" + this.isInit + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", swapToToken=" + this.swapToToken + ", receiveTokenInfo=" + this.receiveTokenInfo + ", isDataErro=" + this.isDataErro + ", investmentCategory=" + this.investmentCategory + ", redeemTips=" + this.redeemTips + ", exchangeBean=" + this.exchangeBean + ", payWithTokenInfo=" + this.payWithTokenInfo + ", payWithTokenTip=" + this.payWithTokenTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isInit ? 1 : 0);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        List<InvestTokenWithAmount> list = this.swapToToken;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithAmount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list2 = this.receiveTokenInfo;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isDataErro ? 1 : 0);
        Integer num = this.investmentCategory;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.redeemTips.writeToParcel(parcel, i);
        InvestExchangeRateBean investExchangeRateBean = this.exchangeBean;
        if (investExchangeRateBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investExchangeRateBean.writeToParcel(parcel, i);
        }
        InvestTokenWithAmount investTokenWithAmount = this.payWithTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo = this.payWithTokenTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestRedeemReceiveInfoUIBean> serializer() {
            return InvestRedeemReceiveInfoUIBean$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null};
    }

    public /* synthetic */ InvestRedeemReceiveInfoUIBean(int i, boolean z, String str, String str2, List list, List list2, boolean z2, Integer num, InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, InvestTokenWithAmount investTokenWithAmount, InvestTipInfoVo investTipInfoVo, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InvestRedeemReceiveInfoUIBean$$serializer.INSTANCE.getDescriptor());
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
            this.swapToToken = new ArrayList();
        } else {
            this.swapToToken = list;
        }
        if ((i & 16) == 0) {
            this.receiveTokenInfo = new ArrayList();
        } else {
            this.receiveTokenInfo = list2;
        }
        if ((i & 32) == 0) {
            this.isDataErro = false;
        } else {
            this.isDataErro = z2;
        }
        if ((i & 64) == 0) {
            this.investmentCategory = 0;
        } else {
            this.investmentCategory = num;
        }
        if ((i & 128) == 0) {
            this.redeemTips = new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.redeemTips = investTipsBean;
        }
        if ((i & 256) == 0) {
            this.exchangeBean = null;
        } else {
            this.exchangeBean = investExchangeRateBean;
        }
        if ((i & 512) == 0) {
            this.payWithTokenInfo = null;
        } else {
            this.payWithTokenInfo = investTokenWithAmount;
        }
        if ((i & 1024) == 0) {
            this.payWithTokenTip = null;
        } else {
            this.payWithTokenTip = investTipInfoVo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [354=4] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, investRedeemReceiveInfoUIBean.isInit);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfoUIBean.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investRedeemReceiveInfoUIBean.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investRedeemReceiveInfoUIBean.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investRedeemReceiveInfoUIBean.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(investRedeemReceiveInfoUIBean.swapToToken, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investRedeemReceiveInfoUIBean.swapToToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(investRedeemReceiveInfoUIBean.receiveTokenInfo, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investRedeemReceiveInfoUIBean.receiveTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investRedeemReceiveInfoUIBean.isDataErro) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, investRedeemReceiveInfoUIBean.isDataErro);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num = investRedeemReceiveInfoUIBean.investmentCategory) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, investRedeemReceiveInfoUIBean.investmentCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investRedeemReceiveInfoUIBean.redeemTips, new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, InvestTipsBean$$serializer.INSTANCE, investRedeemReceiveInfoUIBean.redeemTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investRedeemReceiveInfoUIBean.exchangeBean != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, InvestExchangeRateBean$$serializer.INSTANCE, investRedeemReceiveInfoUIBean.exchangeBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investRedeemReceiveInfoUIBean.payWithTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, InvestTokenWithAmount$$serializer.INSTANCE, investRedeemReceiveInfoUIBean.payWithTokenInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && investRedeemReceiveInfoUIBean.payWithTokenTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, InvestTipInfoVo$$serializer.INSTANCE, investRedeemReceiveInfoUIBean.payWithTokenTip);
    }

    public InvestRedeemReceiveInfoUIBean(boolean z, @NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list, @NotNull List<InvestTokenWithAmount> list2, boolean z2, Integer num, @NotNull InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, InvestTokenWithAmount investTokenWithAmount, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(investTipsBean, "");
        this.isInit = z;
        this.platformLogo = str;
        this.platformName = str2;
        this.swapToToken = list;
        this.receiveTokenInfo = list2;
        this.isDataErro = z2;
        this.investmentCategory = num;
        this.redeemTips = investTipsBean;
        this.exchangeBean = investExchangeRateBean;
        this.payWithTokenInfo = investTokenWithAmount;
        this.payWithTokenTip = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (r15v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r26v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:361) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r18v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:362) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r19v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0034: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipsBean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: CONSTRUCTOR 
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:366) call: com.okinc.business.invest_biz.data.bean.InvestTipsBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.business.invest_biz.data.bean.InvestTipsBean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean:?: TERNARY null = ((wrap:int:0x0060: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean) : (r23v0 com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0069: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r24v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0071: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r25v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, boolean, java.lang.Integer, com.okinc.business.invest_biz.data.bean.InvestTipsBean, com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:357) call: com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean.<init>(boolean, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, java.lang.Integer, com.okinc.business.invest_biz.data.bean.InvestTipsBean, com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestRedeemReceiveInfoUIBean(boolean z, String str, String str2, List list, List list2, boolean z2, Integer num, InvestTipsBean investTipsBean, InvestExchangeRateBean investExchangeRateBean, InvestTokenWithAmount investTokenWithAmount, InvestTipInfoVo investTipInfoVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? new ArrayList() : list2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? 0 : num, (i & 128) != 0 ? new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : investTipsBean, (i & 256) != 0 ? null : investExchangeRateBean, (i & 512) != 0 ? null : investTokenWithAmount, (i & 1024) == 0 ? investTipInfoVo : null);
    }
}
