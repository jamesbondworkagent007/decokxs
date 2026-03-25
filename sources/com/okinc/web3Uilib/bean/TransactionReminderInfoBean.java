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
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TransactionReminderInfoBean implements Parcelable {
    private Function0<Unit> clickCallback;
    private final CharSequence clickText;
    private final CharSequence originText;
    private final int style;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionReminderInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0])};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TransactionReminderInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionReminderInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new TransactionReminderInfoBean(i, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionReminderInfoBean[] newArray(int i) {
            return new TransactionReminderInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionReminderInfoBean() {
        this(0, (CharSequence) null, (CharSequence) null, (Function0) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3Uilib.bean.TransactionReminderInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionReminderInfoBean copy$default(TransactionReminderInfoBean transactionReminderInfoBean, int i, CharSequence charSequence, CharSequence charSequence2, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transactionReminderInfoBean.style;
        }
        if ((i2 & 2) != 0) {
            charSequence = transactionReminderInfoBean.originText;
        }
        if ((i2 & 4) != 0) {
            charSequence2 = transactionReminderInfoBean.clickText;
        }
        if ((i2 & 8) != 0) {
            function0 = transactionReminderInfoBean.clickCallback;
        }
        return transactionReminderInfoBean.copy(i, charSequence, charSequence2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component2() {
        return this.originText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.clickText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component4() {
        return this.clickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionReminderInfoBean copy(int i, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        return new TransactionReminderInfoBean(i, charSequence, charSequence2, function0);
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
        if (!(obj instanceof TransactionReminderInfoBean)) {
            return false;
        }
        TransactionReminderInfoBean transactionReminderInfoBean = (TransactionReminderInfoBean) obj;
        return this.style == transactionReminderInfoBean.style && Intrinsics.EZpvd(this.originText, transactionReminderInfoBean.originText) && Intrinsics.EZpvd(this.clickText, transactionReminderInfoBean.clickText) && Intrinsics.EZpvd(this.clickCallback, transactionReminderInfoBean.clickCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getClickCallback() {
        return this.clickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getClickText() {
        return this.clickText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getOriginText() {
        return this.originText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.style);
        int iHashCode2 = this.originText.hashCode();
        int iHashCode3 = this.clickText.hashCode();
        Function0<Unit> function0 = this.clickCallback;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function0<Unit> function0) {
        this.clickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        int i = this.style;
        CharSequence charSequence = this.originText;
        CharSequence charSequence2 = this.clickText;
        return "TransactionReminderInfoBean(style=" + i + ", originText=" + ((Object) charSequence) + ", clickText=" + ((Object) charSequence2) + ", clickCallback=" + this.clickCallback + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.style);
        TextUtils.writeToParcel(this.originText, parcel, i);
        TextUtils.writeToParcel(this.clickText, parcel, i);
        parcel.writeSerializable((java.io.Serializable) this.clickCallback);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.TransactionReminderInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionReminderInfoBean> serializer() {
            return TransactionReminderInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionReminderInfoBean(int i, int i2, CharSequence charSequence, CharSequence charSequence2, Function0 function0, SerializationConstructorMarker serializationConstructorMarker) {
        this.style = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.originText = "";
        } else {
            this.originText = charSequence;
        }
        if ((i & 4) == 0) {
            this.clickText = "";
        } else {
            this.clickText = charSequence2;
        }
        if ((i & 8) == 0) {
            this.clickCallback = null;
        } else {
            this.clickCallback = function0;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(TransactionReminderInfoBean transactionReminderInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionReminderInfoBean.style != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, transactionReminderInfoBean.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionReminderInfoBean.originText, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionReminderInfoBean.originText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) transactionReminderInfoBean.clickText, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], transactionReminderInfoBean.clickText);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && transactionReminderInfoBean.clickCallback == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], transactionReminderInfoBean.clickCallback);
    }

    public TransactionReminderInfoBean(int i, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.style = i;
        this.originText = charSequence;
        this.clickText = charSequence2;
        this.clickCallback = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.CharSequence))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(int, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:268) call: com.okinc.web3Uilib.bean.TransactionReminderInfoBean.<init>(int, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionReminderInfoBean(int i, String str, String str2, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : function0);
    }
}
