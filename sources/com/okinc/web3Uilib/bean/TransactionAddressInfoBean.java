package com.okinc.web3Uilib.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TransactionAddressInfoBean implements Parcelable {
    private Function0<Unit> arrowClickCallback;
    private String contentInfo;
    private String headerTitle;
    private Function0<Unit> iconCallback;
    private boolean isShowArrowIcon;
    private boolean isShowIcon;
    private String primaryTagInfo;
    private String secondaryTagInfo;
    private String subContent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionAddressInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0]), null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0])};

    public static final class Creator implements Parcelable.Creator<TransactionAddressInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionAddressInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionAddressInfoBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Function0) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, (Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionAddressInfoBean[] newArray(int i) {
            return new TransactionAddressInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionAddressInfoBean() {
        this((String) null, (String) null, (String) null, (String) null, false, (Function0) null, (String) null, false, (Function0) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.primaryTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.secondaryTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isShowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component6() {
        return this.iconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.subContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isShowArrowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component9() {
        return this.arrowClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionAddressInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, Function0<Unit> function0, @NotNull String str5, boolean z2, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TransactionAddressInfoBean(str, str2, str3, str4, z, function0, str5, z2, function02);
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
        if (!(obj instanceof TransactionAddressInfoBean)) {
            return false;
        }
        TransactionAddressInfoBean transactionAddressInfoBean = (TransactionAddressInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.headerTitle, (Object) transactionAddressInfoBean.headerTitle) && Intrinsics.EZpvd((Object) this.contentInfo, (Object) transactionAddressInfoBean.contentInfo) && Intrinsics.EZpvd((Object) this.primaryTagInfo, (Object) transactionAddressInfoBean.primaryTagInfo) && Intrinsics.EZpvd((Object) this.secondaryTagInfo, (Object) transactionAddressInfoBean.secondaryTagInfo) && this.isShowIcon == transactionAddressInfoBean.isShowIcon && Intrinsics.EZpvd(this.iconCallback, transactionAddressInfoBean.iconCallback) && Intrinsics.EZpvd((Object) this.subContent, (Object) transactionAddressInfoBean.subContent) && this.isShowArrowIcon == transactionAddressInfoBean.isShowArrowIcon && Intrinsics.EZpvd(this.arrowClickCallback, transactionAddressInfoBean.arrowClickCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getArrowClickCallback() {
        return this.arrowClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentInfo() {
        return this.contentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getIconCallback() {
        return this.iconCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimaryTagInfo() {
        return this.primaryTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondaryTagInfo() {
        return this.secondaryTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubContent() {
        return this.subContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.headerTitle.hashCode();
        int iHashCode2 = this.contentInfo.hashCode();
        int iHashCode3 = this.primaryTagInfo.hashCode();
        int iHashCode4 = this.secondaryTagInfo.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isShowIcon);
        Function0<Unit> function0 = this.iconCallback;
        int iHashCode6 = function0 == null ? 0 : function0.hashCode();
        int iHashCode7 = this.subContent.hashCode();
        int iHashCode8 = Boolean.hashCode(this.isShowArrowIcon);
        Function0<Unit> function02 = this.arrowClickCallback;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (function02 != null ? function02.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowArrowIcon() {
        return this.isShowArrowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowIcon() {
        return this.isShowIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArrowClickCallback(Function0<Unit> function0) {
        this.arrowClickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.headerTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconCallback(Function0<Unit> function0) {
        this.iconCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryTagInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.primaryTagInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryTagInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.secondaryTagInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowArrowIcon(boolean z) {
        this.isShowArrowIcon = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowIcon(boolean z) {
        this.isShowIcon = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionAddressInfoBean(headerTitle=" + this.headerTitle + ", contentInfo=" + this.contentInfo + ", primaryTagInfo=" + this.primaryTagInfo + ", secondaryTagInfo=" + this.secondaryTagInfo + ", isShowIcon=" + this.isShowIcon + ", iconCallback=" + this.iconCallback + ", subContent=" + this.subContent + ", isShowArrowIcon=" + this.isShowArrowIcon + ", arrowClickCallback=" + this.arrowClickCallback + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.headerTitle);
        parcel.writeString(this.contentInfo);
        parcel.writeString(this.primaryTagInfo);
        parcel.writeString(this.secondaryTagInfo);
        parcel.writeInt(this.isShowIcon ? 1 : 0);
        parcel.writeSerializable((java.io.Serializable) this.iconCallback);
        parcel.writeString(this.subContent);
        parcel.writeInt(this.isShowArrowIcon ? 1 : 0);
        parcel.writeSerializable((java.io.Serializable) this.arrowClickCallback);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.TransactionAddressInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionAddressInfoBean> serializer() {
            return TransactionAddressInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionAddressInfoBean(int i, String str, String str2, String str3, String str4, boolean z, Function0 function0, String str5, boolean z2, Function0 function02, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.headerTitle = "";
        } else {
            this.headerTitle = str;
        }
        if ((i & 2) == 0) {
            this.contentInfo = "";
        } else {
            this.contentInfo = str2;
        }
        if ((i & 4) == 0) {
            this.primaryTagInfo = "";
        } else {
            this.primaryTagInfo = str3;
        }
        if ((i & 8) == 0) {
            this.secondaryTagInfo = "";
        } else {
            this.secondaryTagInfo = str4;
        }
        if ((i & 16) == 0) {
            this.isShowIcon = false;
        } else {
            this.isShowIcon = z;
        }
        if ((i & 32) == 0) {
            this.iconCallback = null;
        } else {
            this.iconCallback = function0;
        }
        if ((i & 64) == 0) {
            this.subContent = "";
        } else {
            this.subContent = str5;
        }
        if ((i & 128) == 0) {
            this.isShowArrowIcon = false;
        } else {
            this.isShowArrowIcon = z2;
        }
        if ((i & 256) == 0) {
            this.arrowClickCallback = null;
        } else {
            this.arrowClickCallback = function02;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(TransactionAddressInfoBean transactionAddressInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) transactionAddressInfoBean.headerTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionAddressInfoBean.headerTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionAddressInfoBean.contentInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionAddressInfoBean.contentInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) transactionAddressInfoBean.primaryTagInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, transactionAddressInfoBean.primaryTagInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) transactionAddressInfoBean.secondaryTagInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, transactionAddressInfoBean.secondaryTagInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || transactionAddressInfoBean.isShowIcon) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, transactionAddressInfoBean.isShowIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transactionAddressInfoBean.iconCallback != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], transactionAddressInfoBean.iconCallback);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) transactionAddressInfoBean.subContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, transactionAddressInfoBean.subContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || transactionAddressInfoBean.isShowArrowIcon) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, transactionAddressInfoBean.isShowArrowIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && transactionAddressInfoBean.arrowClickCallback == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], transactionAddressInfoBean.arrowClickCallback);
    }

    public TransactionAddressInfoBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, Function0<Unit> function0, @NotNull String str5, boolean z2, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.headerTitle = str;
        this.contentInfo = str2;
        this.primaryTagInfo = str3;
        this.secondaryTagInfo = str4;
        this.isShowIcon = z;
        this.iconCallback = function0;
        this.subContent = str5;
        this.isShowArrowIcon = z2;
        this.arrowClickCallback = function02;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r17v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r21v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0040: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:153) call: com.okinc.web3Uilib.bean.TransactionAddressInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, java.lang.String, boolean, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionAddressInfoBean(String str, String str2, String str3, String str4, boolean z, Function0 function0, String str5, boolean z2, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : function0, (i & 64) == 0 ? str5 : "", (i & 128) == 0 ? z2 : false, (i & 256) == 0 ? function02 : null);
    }
}
