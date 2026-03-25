package com.okinc.web3Uilib.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TransactionInputBean implements Parcelable {
    public static final int $stable = 0;
    private final String hintText;
    private final int inputType;
    private final int maxLine;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TransactionInputBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TransactionInputBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionInputBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionInputBean(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionInputBean[] newArray(int i) {
            return new TransactionInputBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionInputBean() {
        this(0, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionInputBean copy$default(TransactionInputBean transactionInputBean, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = transactionInputBean.maxLine;
        }
        if ((i3 & 2) != 0) {
            str = transactionInputBean.title;
        }
        if ((i3 & 4) != 0) {
            i2 = transactionInputBean.inputType;
        }
        if ((i3 & 8) != 0) {
            str2 = transactionInputBean.hintText;
        }
        return transactionInputBean.copy(i, str, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.maxLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.inputType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.hintText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionInputBean copy(int i, @NotNull String str, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransactionInputBean(i, str, i2, str2);
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
        if (!(obj instanceof TransactionInputBean)) {
            return false;
        }
        TransactionInputBean transactionInputBean = (TransactionInputBean) obj;
        return this.maxLine == transactionInputBean.maxLine && Intrinsics.EZpvd((Object) this.title, (Object) transactionInputBean.title) && this.inputType == transactionInputBean.inputType && Intrinsics.EZpvd((Object) this.hintText, (Object) transactionInputBean.hintText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHintText() {
        return this.hintText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInputType() {
        return this.inputType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxLine() {
        return this.maxLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.maxLine) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.inputType)) * 31) + this.hintText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionInputBean(maxLine=" + this.maxLine + ", title=" + this.title + ", inputType=" + this.inputType + ", hintText=" + this.hintText + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.maxLine);
        parcel.writeString(this.title);
        parcel.writeInt(this.inputType);
        parcel.writeString(this.hintText);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.TransactionInputBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionInputBean> serializer() {
            return TransactionInputBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionInputBean(int i, int i2, String str, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.maxLine = 1;
        } else {
            this.maxLine = i2;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.inputType = 1;
        } else {
            this.inputType = i3;
        }
        if ((i & 8) == 0) {
            this.hintText = "";
        } else {
            this.hintText = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(TransactionInputBean transactionInputBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionInputBean.maxLine != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, transactionInputBean.maxLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionInputBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionInputBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionInputBean.inputType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, transactionInputBean.inputType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) transactionInputBean.hintText, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, transactionInputBean.hintText);
    }

    public TransactionInputBean(int i, @NotNull String str, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.maxLine = i;
        this.title = str;
        this.inputType = i2;
        this.hintText = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000d: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
 A[MD:(int, java.lang.String, int, java.lang.String):void (m)] (LINE:248) call: com.okinc.web3Uilib.bean.TransactionInputBean.<init>(int, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionInputBean(int i, String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? "" : str2);
    }
}
