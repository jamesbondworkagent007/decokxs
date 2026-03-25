package com.okinc.web3Uilib.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TransactionTopReminderInfoBean implements Parcelable {
    private final String image;
    private final CharSequence originText;
    private Function0<Unit> primaryClickCallback;
    private final CharSequence primaryClickText;
    private Function0<Unit> secondaryClickCallback;
    private final CharSequence secondaryClickText;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionTopReminderInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0])};

    public static final class Creator implements Parcelable.Creator<TransactionTopReminderInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionTopReminderInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new TransactionTopReminderInfoBean(string, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (Function0) parcel.readSerializable(), (CharSequence) creator.createFromParcel(parcel), (Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionTopReminderInfoBean[] newArray(int i) {
            return new TransactionTopReminderInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionTopReminderInfoBean() {
        this((String) null, (CharSequence) null, (CharSequence) null, (Function0) null, (CharSequence) null, (Function0) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionTopReminderInfoBean copy$default(TransactionTopReminderInfoBean transactionTopReminderInfoBean, String str, CharSequence charSequence, CharSequence charSequence2, Function0 function0, CharSequence charSequence3, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionTopReminderInfoBean.image;
        }
        if ((i & 2) != 0) {
            charSequence = transactionTopReminderInfoBean.originText;
        }
        CharSequence charSequence4 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = transactionTopReminderInfoBean.primaryClickText;
        }
        CharSequence charSequence5 = charSequence2;
        if ((i & 8) != 0) {
            function0 = transactionTopReminderInfoBean.primaryClickCallback;
        }
        Function0 function03 = function0;
        if ((i & 16) != 0) {
            charSequence3 = transactionTopReminderInfoBean.secondaryClickText;
        }
        CharSequence charSequence6 = charSequence3;
        if ((i & 32) != 0) {
            function02 = transactionTopReminderInfoBean.secondaryClickCallback;
        }
        return transactionTopReminderInfoBean.copy(str, charSequence4, charSequence5, function03, charSequence6, function02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component2() {
        return this.originText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.primaryClickText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component4() {
        return this.primaryClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component5() {
        return this.secondaryClickText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component6() {
        return this.secondaryClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionTopReminderInfoBean copy(String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, Function0<Unit> function0, @NotNull CharSequence charSequence3, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        return new TransactionTopReminderInfoBean(str, charSequence, charSequence2, function0, charSequence3, function02);
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
        if (!(obj instanceof TransactionTopReminderInfoBean)) {
            return false;
        }
        TransactionTopReminderInfoBean transactionTopReminderInfoBean = (TransactionTopReminderInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.image, (Object) transactionTopReminderInfoBean.image) && Intrinsics.EZpvd(this.originText, transactionTopReminderInfoBean.originText) && Intrinsics.EZpvd(this.primaryClickText, transactionTopReminderInfoBean.primaryClickText) && Intrinsics.EZpvd(this.primaryClickCallback, transactionTopReminderInfoBean.primaryClickCallback) && Intrinsics.EZpvd(this.secondaryClickText, transactionTopReminderInfoBean.secondaryClickText) && Intrinsics.EZpvd(this.secondaryClickCallback, transactionTopReminderInfoBean.secondaryClickCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getOriginText() {
        return this.originText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getPrimaryClickCallback() {
        return this.primaryClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getPrimaryClickText() {
        return this.primaryClickText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getSecondaryClickCallback() {
        return this.secondaryClickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getSecondaryClickText() {
        return this.secondaryClickText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.image;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.originText.hashCode();
        int iHashCode3 = this.primaryClickText.hashCode();
        Function0<Unit> function0 = this.primaryClickCallback;
        int iHashCode4 = function0 == null ? 0 : function0.hashCode();
        int iHashCode5 = this.secondaryClickText.hashCode();
        Function0<Unit> function02 = this.secondaryClickCallback;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function02 != null ? function02.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryClickCallback(Function0<Unit> function0) {
        this.primaryClickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryClickCallback(Function0<Unit> function0) {
        this.secondaryClickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.image;
        CharSequence charSequence = this.originText;
        CharSequence charSequence2 = this.primaryClickText;
        Function0<Unit> function0 = this.primaryClickCallback;
        CharSequence charSequence3 = this.secondaryClickText;
        return "TransactionTopReminderInfoBean(image=" + str + ", originText=" + ((Object) charSequence) + ", primaryClickText=" + ((Object) charSequence2) + ", primaryClickCallback=" + function0 + ", secondaryClickText=" + ((Object) charSequence3) + ", secondaryClickCallback=" + this.secondaryClickCallback + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.image);
        TextUtils.writeToParcel(this.originText, parcel, i);
        TextUtils.writeToParcel(this.primaryClickText, parcel, i);
        parcel.writeSerializable((java.io.Serializable) this.primaryClickCallback);
        TextUtils.writeToParcel(this.secondaryClickText, parcel, i);
        parcel.writeSerializable((java.io.Serializable) this.secondaryClickCallback);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionTopReminderInfoBean> serializer() {
            return TransactionTopReminderInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionTopReminderInfoBean(int i, String str, CharSequence charSequence, CharSequence charSequence2, Function0 function0, CharSequence charSequence3, Function0 function02, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.image = null;
        } else {
            this.image = str;
        }
        if ((i & 2) == 0) {
            this.originText = "";
        } else {
            this.originText = charSequence;
        }
        if ((i & 4) == 0) {
            this.primaryClickText = "";
        } else {
            this.primaryClickText = charSequence2;
        }
        if ((i & 8) == 0) {
            this.primaryClickCallback = null;
        } else {
            this.primaryClickCallback = function0;
        }
        if ((i & 16) == 0) {
            this.secondaryClickText = "";
        } else {
            this.secondaryClickText = charSequence3;
        }
        if ((i & 32) == 0) {
            this.secondaryClickCallback = null;
        } else {
            this.secondaryClickCallback = function02;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(TransactionTopReminderInfoBean transactionTopReminderInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionTopReminderInfoBean.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, transactionTopReminderInfoBean.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionTopReminderInfoBean.originText, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionTopReminderInfoBean.originText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) transactionTopReminderInfoBean.primaryClickText, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], transactionTopReminderInfoBean.primaryClickText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transactionTopReminderInfoBean.primaryClickCallback != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], transactionTopReminderInfoBean.primaryClickCallback);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transactionTopReminderInfoBean.secondaryClickText, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], transactionTopReminderInfoBean.secondaryClickText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && transactionTopReminderInfoBean.secondaryClickCallback == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], transactionTopReminderInfoBean.secondaryClickCallback);
    }

    public TransactionTopReminderInfoBean(String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, Function0<Unit> function0, @NotNull CharSequence charSequence3, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        this.image = str;
        this.originText = charSequence;
        this.primaryClickText = charSequence2;
        this.primaryClickCallback = function0;
        this.secondaryClickText = charSequence3;
        this.secondaryClickCallback = function02;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.CharSequence))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0018: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r9v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x001f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.CharSequence) : (""))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r11v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.CharSequence, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:278) call: com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean.<init>(java.lang.String, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function0, java.lang.CharSequence, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionTopReminderInfoBean(String str, CharSequence charSequence, CharSequence charSequence2, Function0 function0, CharSequence charSequence3, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : charSequence, (i & 4) != 0 ? "" : charSequence2, (i & 8) != 0 ? null : function0, (i & 16) == 0 ? charSequence3 : "", (i & 32) != 0 ? null : function02);
    }
}
