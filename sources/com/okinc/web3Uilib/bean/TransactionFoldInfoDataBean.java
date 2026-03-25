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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TransactionFoldInfoDataBean implements Parcelable {
    private Function0<Unit> clickCallback;
    private String foldTitle;
    private boolean isExpand;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionFoldInfoDataBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(Function0.class), new Annotation[0])};

    public static final class Creator implements Parcelable.Creator<TransactionFoldInfoDataBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionFoldInfoDataBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionFoldInfoDataBean(parcel.readString(), parcel.readInt() != 0, (Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionFoldInfoDataBean[] newArray(int i) {
            return new TransactionFoldInfoDataBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionFoldInfoDataBean() {
        this((String) null, false, (Function0) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionFoldInfoDataBean copy$default(TransactionFoldInfoDataBean transactionFoldInfoDataBean, String str, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionFoldInfoDataBean.foldTitle;
        }
        if ((i & 2) != 0) {
            z = transactionFoldInfoDataBean.isExpand;
        }
        if ((i & 4) != 0) {
            function0 = transactionFoldInfoDataBean.clickCallback;
        }
        return transactionFoldInfoDataBean.copy(str, z, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.foldTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component3() {
        return this.clickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFoldInfoDataBean copy(@NotNull String str, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TransactionFoldInfoDataBean(str, z, function0);
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
        if (!(obj instanceof TransactionFoldInfoDataBean)) {
            return false;
        }
        TransactionFoldInfoDataBean transactionFoldInfoDataBean = (TransactionFoldInfoDataBean) obj;
        return Intrinsics.EZpvd((Object) this.foldTitle, (Object) transactionFoldInfoDataBean.foldTitle) && this.isExpand == transactionFoldInfoDataBean.isExpand && Intrinsics.EZpvd(this.clickCallback, transactionFoldInfoDataBean.clickCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getClickCallback() {
        return this.clickCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFoldTitle() {
        return this.foldTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.foldTitle.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isExpand);
        Function0<Unit> function0 = this.clickCallback;
        return (((iHashCode * 31) + iHashCode2) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExpand() {
        return this.isExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function0<Unit> function0) {
        this.clickCallback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpand(boolean z) {
        this.isExpand = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFoldTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.foldTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionFoldInfoDataBean(foldTitle=" + this.foldTitle + ", isExpand=" + this.isExpand + ", clickCallback=" + this.clickCallback + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.foldTitle);
        parcel.writeInt(this.isExpand ? 1 : 0);
        parcel.writeSerializable((java.io.Serializable) this.clickCallback);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionFoldInfoDataBean> serializer() {
            return TransactionFoldInfoDataBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionFoldInfoDataBean(int i, String str, boolean z, Function0 function0, SerializationConstructorMarker serializationConstructorMarker) {
        this.foldTitle = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isExpand = false;
        } else {
            this.isExpand = z;
        }
        if ((i & 4) == 0) {
            this.clickCallback = null;
        } else {
            this.clickCallback = function0;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(TransactionFoldInfoDataBean transactionFoldInfoDataBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) transactionFoldInfoDataBean.foldTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionFoldInfoDataBean.foldTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionFoldInfoDataBean.isExpand) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, transactionFoldInfoDataBean.isExpand);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && transactionFoldInfoDataBean.clickCallback == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], transactionFoldInfoDataBean.clickCallback);
    }

    public TransactionFoldInfoDataBean(@NotNull String str, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.foldTitle = str;
        this.isExpand = z;
        this.clickCallback = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:239) call: com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean.<init>(java.lang.String, boolean, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ TransactionFoldInfoDataBean(String str, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : function0);
    }
}
