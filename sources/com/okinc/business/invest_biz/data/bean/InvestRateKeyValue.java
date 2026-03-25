package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestRateKeyValue implements Parcelable {
    private final String key;
    private final String logo;
    private final InvestTipInfoVo templateTip;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestRateKeyValue> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestRateKeyValue> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRateKeyValue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestRateKeyValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRateKeyValue[] newArray(int i) {
            return new InvestRateKeyValue[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestRateKeyValue() {
        this((String) null, (String) null, (String) null, (InvestTipInfoVo) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestRateKeyValue copy$default(InvestRateKeyValue investRateKeyValue, String str, String str2, String str3, InvestTipInfoVo investTipInfoVo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investRateKeyValue.key;
        }
        if ((i & 2) != 0) {
            str2 = investRateKeyValue.value;
        }
        if ((i & 4) != 0) {
            str3 = investRateKeyValue.logo;
        }
        if ((i & 8) != 0) {
            investTipInfoVo = investRateKeyValue.templateTip;
        }
        return investRateKeyValue.copy(str, str2, str3, investTipInfoVo);
    }

    @SerialName(JwtUtilsKt.DID_METHOD_KEY)
    public static /* synthetic */ void getKey$annotations() {
    }

    @SerialName("logo")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @SerialName("templateTip")
    public static /* synthetic */ void getTemplateTip$annotations() {
    }

    @SerialName("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component4() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRateKeyValue copy(@NotNull String str, @NotNull String str2, @NotNull String str3, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestRateKeyValue(str, str2, str3, investTipInfoVo);
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
        if (!(obj instanceof InvestRateKeyValue)) {
            return false;
        }
        InvestRateKeyValue investRateKeyValue = (InvestRateKeyValue) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) investRateKeyValue.key) && Intrinsics.EZpvd((Object) this.value, (Object) investRateKeyValue.value) && Intrinsics.EZpvd((Object) this.logo, (Object) investRateKeyValue.logo) && Intrinsics.EZpvd(this.templateTip, investRateKeyValue.templateTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getTemplateTip() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.key.hashCode();
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = this.logo.hashCode();
        InvestTipInfoVo investTipInfoVo = this.templateTip;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestRateKeyValue(key=" + this.key + ", value=" + this.value + ", logo=" + this.logo + ", templateTip=" + this.templateTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.value);
        parcel.writeString(this.logo);
        InvestTipInfoVo investTipInfoVo = this.templateTip;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestRateKeyValue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestRateKeyValue> serializer() {
            return InvestRateKeyValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestRateKeyValue(int i, String str, String str2, String str3, InvestTipInfoVo investTipInfoVo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.logo = "";
        } else {
            this.logo = str3;
        }
        if ((i & 8) == 0) {
            this.templateTip = null;
        } else {
            this.templateTip = investTipInfoVo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRateKeyValue investRateKeyValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investRateKeyValue.key, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investRateKeyValue.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investRateKeyValue.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investRateKeyValue.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investRateKeyValue.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investRateKeyValue.logo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investRateKeyValue.templateTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvestTipInfoVo$$serializer.INSTANCE, investRateKeyValue.templateTip);
    }

    public InvestRateKeyValue(@NotNull String str, @NotNull String str2, @NotNull String str3, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.value = str2;
        this.logo = str3;
        this.templateTip = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r5v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:328) call: com.okinc.business.invest_biz.data.bean.InvestRateKeyValue.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestRateKeyValue(String str, String str2, String str3, InvestTipInfoVo investTipInfoVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : investTipInfoVo);
    }
}
