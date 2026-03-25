package com.okinc.web3Uilib.bean;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TransactionButtonGroupInfoBean implements Parcelable {
    private Function0<Unit> primaryButtonCallback;
    private String primaryButtonContent;
    private Function0<Unit> secondaryButtonCallback;
    private String secondaryButtonContent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionButtonGroupInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0])};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TransactionButtonGroupInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionButtonGroupInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionButtonGroupInfoBean(parcel.readString(), parcel.readString(), (Function0) parcel.readSerializable(), (Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionButtonGroupInfoBean[] newArray(int i) {
            return new TransactionButtonGroupInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionButtonGroupInfoBean() {
        this((String) null, (String) null, (Function0) null, (Function0) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionButtonGroupInfoBean copy$default(TransactionButtonGroupInfoBean transactionButtonGroupInfoBean, String str, String str2, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionButtonGroupInfoBean.primaryButtonContent;
        }
        if ((i & 2) != 0) {
            str2 = transactionButtonGroupInfoBean.secondaryButtonContent;
        }
        if ((i & 4) != 0) {
            function0 = transactionButtonGroupInfoBean.primaryButtonCallback;
        }
        if ((i & 8) != 0) {
            function02 = transactionButtonGroupInfoBean.secondaryButtonCallback;
        }
        return transactionButtonGroupInfoBean.copy(str, str2, function0, function02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.primaryButtonContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.secondaryButtonContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component3() {
        return this.primaryButtonCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component4() {
        return this.secondaryButtonCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionButtonGroupInfoBean copy(@NotNull String str, @NotNull String str2, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransactionButtonGroupInfoBean(str, str2, function0, function02);
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
        if (!(obj instanceof TransactionButtonGroupInfoBean)) {
            return false;
        }
        TransactionButtonGroupInfoBean transactionButtonGroupInfoBean = (TransactionButtonGroupInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.primaryButtonContent, (Object) transactionButtonGroupInfoBean.primaryButtonContent) && Intrinsics.EZpvd((Object) this.secondaryButtonContent, (Object) transactionButtonGroupInfoBean.secondaryButtonContent) && Intrinsics.EZpvd(this.primaryButtonCallback, transactionButtonGroupInfoBean.primaryButtonCallback) && Intrinsics.EZpvd(this.secondaryButtonCallback, transactionButtonGroupInfoBean.secondaryButtonCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getPrimaryButtonCallback() {
        return this.primaryButtonCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimaryButtonContent() {
        return this.primaryButtonContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getSecondaryButtonCallback() {
        return this.secondaryButtonCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondaryButtonContent() {
        return this.secondaryButtonContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.primaryButtonContent.hashCode();
        int iHashCode2 = this.secondaryButtonContent.hashCode();
        Function0<Unit> function0 = this.primaryButtonCallback;
        int iHashCode3 = function0 == null ? 0 : function0.hashCode();
        Function0<Unit> function02 = this.secondaryButtonCallback;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function02 != null ? function02.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryButtonCallback(Function0<Unit> function0) {
        this.primaryButtonCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryButtonContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.primaryButtonContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryButtonCallback(Function0<Unit> function0) {
        this.secondaryButtonCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryButtonContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.secondaryButtonContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionButtonGroupInfoBean(primaryButtonContent=" + this.primaryButtonContent + ", secondaryButtonContent=" + this.secondaryButtonContent + ", primaryButtonCallback=" + this.primaryButtonCallback + ", secondaryButtonCallback=" + this.secondaryButtonCallback + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.primaryButtonContent);
        parcel.writeString(this.secondaryButtonContent);
        parcel.writeSerializable((java.io.Serializable) this.primaryButtonCallback);
        parcel.writeSerializable((java.io.Serializable) this.secondaryButtonCallback);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionButtonGroupInfoBean> serializer() {
            return TransactionButtonGroupInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionButtonGroupInfoBean(int i, String str, String str2, Function0 function0, Function0 function02, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.primaryButtonContent = "";
        } else {
            this.primaryButtonContent = str;
        }
        if ((i & 2) == 0) {
            this.secondaryButtonContent = "";
        } else {
            this.secondaryButtonContent = str2;
        }
        if ((i & 4) == 0) {
            this.primaryButtonCallback = null;
        } else {
            this.primaryButtonCallback = function0;
        }
        if ((i & 8) == 0) {
            this.secondaryButtonCallback = null;
        } else {
            this.secondaryButtonCallback = function02;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(TransactionButtonGroupInfoBean transactionButtonGroupInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) transactionButtonGroupInfoBean.primaryButtonContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionButtonGroupInfoBean.primaryButtonContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionButtonGroupInfoBean.secondaryButtonContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionButtonGroupInfoBean.secondaryButtonContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionButtonGroupInfoBean.primaryButtonCallback != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], transactionButtonGroupInfoBean.primaryButtonCallback);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && transactionButtonGroupInfoBean.secondaryButtonCallback == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], transactionButtonGroupInfoBean.secondaryButtonCallback);
    }

    public TransactionButtonGroupInfoBean(@NotNull String str, @NotNull String str2, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.primaryButtonContent = str;
        this.secondaryButtonContent = str2;
        this.primaryButtonCallback = function0;
        this.secondaryButtonCallback = function02;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:258) call: com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean.<init>(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionButtonGroupInfoBean(String str, String str2, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function02);
    }
}
