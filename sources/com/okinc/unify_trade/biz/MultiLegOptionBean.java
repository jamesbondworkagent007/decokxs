package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.biz.OptionStrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class MultiLegOptionBean implements Parcelable {
    private String currentExpTime;
    private String currentUnderlying;
    private LegBean highLegBean;
    private LegBean lowLegBean;
    private String quantityUnit;
    private String riskUnit;
    private OptionStrategyType strategyType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultiLegOptionBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.biz.OptionStrategyType", OptionStrategyType.values()), null, null};

    public static final class Creator implements Parcelable.Creator<MultiLegOptionBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiLegOptionBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MultiLegOptionBean(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LegBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LegBean.CREATOR.createFromParcel(parcel) : null, OptionStrategyType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiLegOptionBean[] newArray(int i) {
            return new MultiLegOptionBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiLegOptionBean() {
        this((String) null, (String) null, (LegBean) null, (LegBean) null, (OptionStrategyType) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MultiLegOptionBean copy$default(MultiLegOptionBean multiLegOptionBean, String str, String str2, LegBean legBean, LegBean legBean2, OptionStrategyType optionStrategyType, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiLegOptionBean.currentExpTime;
        }
        if ((i & 2) != 0) {
            str2 = multiLegOptionBean.currentUnderlying;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            legBean = multiLegOptionBean.lowLegBean;
        }
        LegBean legBean3 = legBean;
        if ((i & 8) != 0) {
            legBean2 = multiLegOptionBean.highLegBean;
        }
        LegBean legBean4 = legBean2;
        if ((i & 16) != 0) {
            optionStrategyType = multiLegOptionBean.strategyType;
        }
        OptionStrategyType optionStrategyType2 = optionStrategyType;
        if ((i & 32) != 0) {
            str3 = multiLegOptionBean.quantityUnit;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = multiLegOptionBean.riskUnit;
        }
        return multiLegOptionBean.copy(str, str5, legBean3, legBean4, optionStrategyType2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentExpTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currentUnderlying;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LegBean component3() {
        return this.lowLegBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LegBean component4() {
        return this.highLegBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionStrategyType component5() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quantityUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.riskUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiLegOptionBean copy(String str, @NotNull String str2, LegBean legBean, LegBean legBean2, @NotNull OptionStrategyType optionStrategyType, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(optionStrategyType, "");
        return new MultiLegOptionBean(str, str2, legBean, legBean2, optionStrategyType, str3, str4);
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
        if (!(obj instanceof MultiLegOptionBean)) {
            return false;
        }
        MultiLegOptionBean multiLegOptionBean = (MultiLegOptionBean) obj;
        return Intrinsics.EZpvd((Object) this.currentExpTime, (Object) multiLegOptionBean.currentExpTime) && Intrinsics.EZpvd((Object) this.currentUnderlying, (Object) multiLegOptionBean.currentUnderlying) && Intrinsics.EZpvd(this.lowLegBean, multiLegOptionBean.lowLegBean) && Intrinsics.EZpvd(this.highLegBean, multiLegOptionBean.highLegBean) && this.strategyType == multiLegOptionBean.strategyType && Intrinsics.EZpvd((Object) this.quantityUnit, (Object) multiLegOptionBean.quantityUnit) && Intrinsics.EZpvd((Object) this.riskUnit, (Object) multiLegOptionBean.riskUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentExpTime() {
        return this.currentExpTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentUnderlying() {
        return this.currentUnderlying;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LegBean getHighLegBean() {
        return this.highLegBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LegBean getLowLegBean() {
        return this.lowLegBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuantityUnit() {
        return this.quantityUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskUnit() {
        return this.riskUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionStrategyType getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currentExpTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.currentUnderlying.hashCode();
        LegBean legBean = this.lowLegBean;
        int iHashCode3 = legBean == null ? 0 : legBean.hashCode();
        LegBean legBean2 = this.highLegBean;
        int iHashCode4 = legBean2 == null ? 0 : legBean2.hashCode();
        int iHashCode5 = this.strategyType.hashCode();
        String str2 = this.quantityUnit;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.riskUnit;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentExpTime(String str) {
        this.currentExpTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentUnderlying(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currentUnderlying = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHighLegBean(LegBean legBean) {
        this.highLegBean = legBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLowLegBean(LegBean legBean) {
        this.lowLegBean = legBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuantityUnit(String str) {
        this.quantityUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskUnit(String str) {
        this.riskUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyType(@NotNull OptionStrategyType optionStrategyType) {
        Intrinsics.checkNotNullParameter(optionStrategyType, "");
        this.strategyType = optionStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiLegOptionBean(currentExpTime=" + this.currentExpTime + ", currentUnderlying=" + this.currentUnderlying + ", lowLegBean=" + this.lowLegBean + ", highLegBean=" + this.highLegBean + ", strategyType=" + this.strategyType + ", quantityUnit=" + this.quantityUnit + ", riskUnit=" + this.riskUnit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currentExpTime);
        parcel.writeString(this.currentUnderlying);
        LegBean legBean = this.lowLegBean;
        if (legBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            legBean.writeToParcel(parcel, i);
        }
        LegBean legBean2 = this.highLegBean;
        if (legBean2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            legBean2.writeToParcel(parcel, i);
        }
        this.strategyType.writeToParcel(parcel, i);
        parcel.writeString(this.quantityUnit);
        parcel.writeString(this.riskUnit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MultiLegOptionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiLegOptionBean> serializer() {
            return MultiLegOptionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiLegOptionBean(int i, String str, String str2, LegBean legBean, LegBean legBean2, OptionStrategyType optionStrategyType, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currentExpTime = null;
        } else {
            this.currentExpTime = str;
        }
        if ((i & 2) == 0) {
            this.currentUnderlying = "";
        } else {
            this.currentUnderlying = str2;
        }
        if ((i & 4) == 0) {
            this.lowLegBean = null;
        } else {
            this.lowLegBean = legBean;
        }
        if ((i & 8) == 0) {
            this.highLegBean = null;
        } else {
            this.highLegBean = legBean2;
        }
        if ((i & 16) == 0) {
            this.strategyType = OptionStrategyType.DEFAULT_OPTION_STRATEGY;
        } else {
            this.strategyType = optionStrategyType;
        }
        if ((i & 32) == 0) {
            this.quantityUnit = null;
        } else {
            this.quantityUnit = str3;
        }
        if ((i & 64) == 0) {
            this.riskUnit = null;
        } else {
            this.riskUnit = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MultiLegOptionBean multiLegOptionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || multiLegOptionBean.currentExpTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, multiLegOptionBean.currentExpTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) multiLegOptionBean.currentUnderlying, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, multiLegOptionBean.currentUnderlying);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || multiLegOptionBean.lowLegBean != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LegBean$$serializer.INSTANCE, multiLegOptionBean.lowLegBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || multiLegOptionBean.highLegBean != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LegBean$$serializer.INSTANCE, multiLegOptionBean.highLegBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || multiLegOptionBean.strategyType != OptionStrategyType.DEFAULT_OPTION_STRATEGY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], multiLegOptionBean.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || multiLegOptionBean.quantityUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, multiLegOptionBean.quantityUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && multiLegOptionBean.riskUnit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, multiLegOptionBean.riskUnit);
    }

    public MultiLegOptionBean(String str, @NotNull String str2, LegBean legBean, LegBean legBean2, @NotNull OptionStrategyType optionStrategyType, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(optionStrategyType, "");
        this.currentExpTime = str;
        this.currentUnderlying = str2;
        this.lowLegBean = legBean;
        this.highLegBean = legBean2;
        this.strategyType = optionStrategyType;
        this.quantityUnit = str3;
        this.riskUnit = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.LegBean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.LegBean) : (r9v0 com.okinc.unify_trade.biz.LegBean))
  (wrap:com.okinc.unify_trade.biz.LegBean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.LegBean) : (r10v0 com.okinc.unify_trade.biz.LegBean))
  (wrap:com.okinc.biz.OptionStrategyType:0x0023: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.biz.OptionStrategyType:0x0021: SGET  A[WRAPPED] (LINE:5196) com.okinc.biz.OptionStrategyType.DEFAULT_OPTION_STRATEGY com.okinc.biz.OptionStrategyType) : (r11v0 com.okinc.biz.OptionStrategyType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.LegBean, com.okinc.unify_trade.biz.LegBean, com.okinc.biz.OptionStrategyType, java.lang.String, java.lang.String):void (m)] (LINE:5191) call: com.okinc.unify_trade.biz.MultiLegOptionBean.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.LegBean, com.okinc.unify_trade.biz.LegBean, com.okinc.biz.OptionStrategyType, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MultiLegOptionBean(String str, String str2, LegBean legBean, LegBean legBean2, OptionStrategyType optionStrategyType, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : legBean, (i & 8) != 0 ? null : legBean2, (i & 16) != 0 ? OptionStrategyType.DEFAULT_OPTION_STRATEGY : optionStrategyType, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
