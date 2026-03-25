package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTipInfoVo implements Parcelable {
    public static final String TYPE_INVEST_TIPS_INFO = "1";
    public static final String TYPE_INVEST_TIPS_WARN = "2";
    private final InvestClickActionType clickAction;
    private final Integer contentType;
    private final InvestCustomRedirectData customRedirectData;
    private final boolean disappearAfterInput;
    private final InvestHoverOnData hoverOnData;
    private final InvestPopUpData popUpData;
    private final InvestRedirectData redirectData;
    private final String tipContent;
    private final String title;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTipInfoVo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.bean.InvestClickActionType", InvestClickActionType.values(), new String[]{"CUSTOM_REDIRECT", "HOVER_ON", "NO_ACTION", "POPUP", "REDIRECT"}, new Annotation[][]{null, null, null, null, null}, null), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestTipInfoVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTipInfoVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTipInfoVo(InvestClickActionType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : InvestCustomRedirectData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestHoverOnData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestPopUpData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InvestRedirectData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTipInfoVo[] newArray(int i) {
            return new InvestTipInfoVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTipInfoVo() {
        this((InvestClickActionType) null, (InvestCustomRedirectData) null, (InvestHoverOnData) null, (InvestPopUpData) null, (InvestRedirectData) null, (String) null, (String) null, false, (String) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestClickActionType component1() {
        return this.clickAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCustomRedirectData component2() {
        return this.customRedirectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestHoverOnData component3() {
        return this.hoverOnData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPopUpData component4() {
        return this.popUpData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRedirectData component5() {
        return this.redirectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tipContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.disappearAfterInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo copy(@NotNull InvestClickActionType investClickActionType, InvestCustomRedirectData investCustomRedirectData, InvestHoverOnData investHoverOnData, InvestPopUpData investPopUpData, InvestRedirectData investRedirectData, String str, String str2, boolean z, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(investClickActionType, "");
        return new InvestTipInfoVo(investClickActionType, investCustomRedirectData, investHoverOnData, investPopUpData, investRedirectData, str, str2, z, str3, num);
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
        if (!(obj instanceof InvestTipInfoVo)) {
            return false;
        }
        InvestTipInfoVo investTipInfoVo = (InvestTipInfoVo) obj;
        return this.clickAction == investTipInfoVo.clickAction && Intrinsics.EZpvd(this.customRedirectData, investTipInfoVo.customRedirectData) && Intrinsics.EZpvd(this.hoverOnData, investTipInfoVo.hoverOnData) && Intrinsics.EZpvd(this.popUpData, investTipInfoVo.popUpData) && Intrinsics.EZpvd(this.redirectData, investTipInfoVo.redirectData) && Intrinsics.EZpvd((Object) this.tipContent, (Object) investTipInfoVo.tipContent) && Intrinsics.EZpvd((Object) this.type, (Object) investTipInfoVo.type) && this.disappearAfterInput == investTipInfoVo.disappearAfterInput && Intrinsics.EZpvd((Object) this.title, (Object) investTipInfoVo.title) && Intrinsics.EZpvd(this.contentType, investTipInfoVo.contentType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestClickActionType getClickAction() {
        return this.clickAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCustomRedirectData getCustomRedirectData() {
        return this.customRedirectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisappearAfterInput() {
        return this.disappearAfterInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestHoverOnData getHoverOnData() {
        return this.hoverOnData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPopUpData getPopUpData() {
        return this.popUpData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRedirectData getRedirectData() {
        return this.redirectData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipContent() {
        return this.tipContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.clickAction.hashCode();
        InvestCustomRedirectData investCustomRedirectData = this.customRedirectData;
        int iHashCode2 = investCustomRedirectData == null ? 0 : investCustomRedirectData.hashCode();
        InvestHoverOnData investHoverOnData = this.hoverOnData;
        int iHashCode3 = investHoverOnData == null ? 0 : investHoverOnData.hashCode();
        InvestPopUpData investPopUpData = this.popUpData;
        int iHashCode4 = investPopUpData == null ? 0 : investPopUpData.hashCode();
        InvestRedirectData investRedirectData = this.redirectData;
        int iHashCode5 = investRedirectData == null ? 0 : investRedirectData.hashCode();
        String str = this.tipContent;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.type;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = Boolean.hashCode(this.disappearAfterInput);
        String str3 = this.title;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.contentType;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTipInfoVo(clickAction=" + this.clickAction + ", customRedirectData=" + this.customRedirectData + ", hoverOnData=" + this.hoverOnData + ", popUpData=" + this.popUpData + ", redirectData=" + this.redirectData + ", tipContent=" + this.tipContent + ", type=" + this.type + ", disappearAfterInput=" + this.disappearAfterInput + ", title=" + this.title + ", contentType=" + this.contentType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.clickAction.name());
        InvestCustomRedirectData investCustomRedirectData = this.customRedirectData;
        if (investCustomRedirectData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investCustomRedirectData.writeToParcel(parcel, i);
        }
        InvestHoverOnData investHoverOnData = this.hoverOnData;
        if (investHoverOnData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investHoverOnData.writeToParcel(parcel, i);
        }
        InvestPopUpData investPopUpData = this.popUpData;
        if (investPopUpData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investPopUpData.writeToParcel(parcel, i);
        }
        InvestRedirectData investRedirectData = this.redirectData;
        if (investRedirectData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investRedirectData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tipContent);
        parcel.writeString(this.type);
        parcel.writeInt(this.disappearAfterInput ? 1 : 0);
        parcel.writeString(this.title);
        Integer num = this.contentType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public /* synthetic */ InvestTipInfoVo(int i, InvestClickActionType investClickActionType, InvestCustomRedirectData investCustomRedirectData, InvestHoverOnData investHoverOnData, InvestPopUpData investPopUpData, InvestRedirectData investRedirectData, String str, String str2, boolean z, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.clickAction = (i & 1) == 0 ? InvestClickActionType.NO_ACTION : investClickActionType;
        if ((i & 2) == 0) {
            this.customRedirectData = null;
        } else {
            this.customRedirectData = investCustomRedirectData;
        }
        if ((i & 4) == 0) {
            this.hoverOnData = null;
        } else {
            this.hoverOnData = investHoverOnData;
        }
        if ((i & 8) == 0) {
            this.popUpData = null;
        } else {
            this.popUpData = investPopUpData;
        }
        if ((i & 16) == 0) {
            this.redirectData = null;
        } else {
            this.redirectData = investRedirectData;
        }
        if ((i & 32) == 0) {
            this.tipContent = null;
        } else {
            this.tipContent = str;
        }
        if ((i & 64) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 128) == 0) {
            this.disappearAfterInput = false;
        } else {
            this.disappearAfterInput = z;
        }
        if ((i & 256) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 512) == 0) {
            this.contentType = -1;
        } else {
            this.contentType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTipInfoVo investTipInfoVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTipInfoVo.clickAction != InvestClickActionType.NO_ACTION) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investTipInfoVo.clickAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTipInfoVo.customRedirectData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestCustomRedirectData$$serializer.INSTANCE, investTipInfoVo.customRedirectData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investTipInfoVo.hoverOnData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InvestHoverOnData$$serializer.INSTANCE, investTipInfoVo.hoverOnData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTipInfoVo.popUpData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvestPopUpData$$serializer.INSTANCE, investTipInfoVo.popUpData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investTipInfoVo.redirectData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestRedirectData$$serializer.INSTANCE, investTipInfoVo.redirectData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investTipInfoVo.tipContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investTipInfoVo.tipContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investTipInfoVo.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investTipInfoVo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investTipInfoVo.disappearAfterInput) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, investTipInfoVo.disappearAfterInput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investTipInfoVo.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investTipInfoVo.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || (num = investTipInfoVo.contentType) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, investTipInfoVo.contentType);
        }
    }

    public InvestTipInfoVo(@NotNull InvestClickActionType investClickActionType, InvestCustomRedirectData investCustomRedirectData, InvestHoverOnData investHoverOnData, InvestPopUpData investPopUpData, InvestRedirectData investRedirectData, String str, String str2, boolean z, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(investClickActionType, "");
        this.clickAction = investClickActionType;
        this.customRedirectData = investCustomRedirectData;
        this.hoverOnData = investHoverOnData;
        this.popUpData = investPopUpData;
        this.redirectData = investRedirectData;
        this.tipContent = str;
        this.type = str2;
        this.disappearAfterInput = z;
        this.title = str3;
        this.contentType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestClickActionType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:186) com.okinc.business.invest_biz.data.bean.InvestClickActionType.NO_ACTION com.okinc.business.invest_biz.data.bean.InvestClickActionType) : (r12v0 com.okinc.business.invest_biz.data.bean.InvestClickActionType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData) : (r13v0 com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestHoverOnData:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestHoverOnData) : (r14v0 com.okinc.business.invest_biz.data.bean.InvestHoverOnData))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestPopUpData:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestPopUpData) : (r15v0 com.okinc.business.invest_biz.data.bean.InvestPopUpData))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestRedirectData:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestRedirectData) : (r16v0 com.okinc.business.invest_biz.data.bean.InvestRedirectData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r21v0 java.lang.Integer))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestClickActionType, com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData, com.okinc.business.invest_biz.data.bean.InvestHoverOnData, com.okinc.business.invest_biz.data.bean.InvestPopUpData, com.okinc.business.invest_biz.data.bean.InvestRedirectData, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer):void (m)] (LINE:184) call: com.okinc.business.invest_biz.data.bean.InvestTipInfoVo.<init>(com.okinc.business.invest_biz.data.bean.InvestClickActionType, com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData, com.okinc.business.invest_biz.data.bean.InvestHoverOnData, com.okinc.business.invest_biz.data.bean.InvestPopUpData, com.okinc.business.invest_biz.data.bean.InvestRedirectData, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ InvestTipInfoVo(InvestClickActionType investClickActionType, InvestCustomRedirectData investCustomRedirectData, InvestHoverOnData investHoverOnData, InvestPopUpData investPopUpData, InvestRedirectData investRedirectData, String str, String str2, boolean z, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestClickActionType.NO_ACTION : investClickActionType, (i & 2) != 0 ? null : investCustomRedirectData, (i & 4) != 0 ? null : investHoverOnData, (i & 8) != 0 ? null : investPopUpData, (i & 16) != 0 ? null : investRedirectData, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str3 : null, (i & 512) != 0 ? -1 : num);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTipInfoVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestTipInfoVo> serializer() {
            return InvestTipInfoVo$$serializer.INSTANCE;
        }
    }
}
