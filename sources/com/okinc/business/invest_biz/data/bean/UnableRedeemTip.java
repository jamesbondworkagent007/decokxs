package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class UnableRedeemTip implements Parcelable {
    public static final int $stable = 0;
    private final String clickAction;
    private final String tipContent;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UnableRedeemTip> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnableRedeemTip> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnableRedeemTip createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnableRedeemTip(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnableRedeemTip[] newArray(int i) {
            return new UnableRedeemTip[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnableRedeemTip() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnableRedeemTip copy$default(UnableRedeemTip unableRedeemTip, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unableRedeemTip.tipContent;
        }
        if ((i & 2) != 0) {
            str2 = unableRedeemTip.clickAction;
        }
        return unableRedeemTip.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tipContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.clickAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnableRedeemTip copy(String str, String str2) {
        return new UnableRedeemTip(str, str2);
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
        if (!(obj instanceof UnableRedeemTip)) {
            return false;
        }
        UnableRedeemTip unableRedeemTip = (UnableRedeemTip) obj;
        return Intrinsics.EZpvd((Object) this.tipContent, (Object) unableRedeemTip.tipContent) && Intrinsics.EZpvd((Object) this.clickAction, (Object) unableRedeemTip.clickAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClickAction() {
        return this.clickAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipContent() {
        return this.tipContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tipContent;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.clickAction;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnableRedeemTip(tipContent=" + this.tipContent + ", clickAction=" + this.clickAction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tipContent);
        parcel.writeString(this.clickAction);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.UnableRedeemTip.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnableRedeemTip> serializer() {
            return UnableRedeemTip$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnableRedeemTip(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tipContent = null;
        } else {
            this.tipContent = str;
        }
        if ((i & 2) == 0) {
            this.clickAction = null;
        } else {
            this.clickAction = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(UnableRedeemTip unableRedeemTip, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || unableRedeemTip.tipContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, unableRedeemTip.tipContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && unableRedeemTip.clickAction == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, unableRedeemTip.clickAction);
    }

    public UnableRedeemTip(String str, String str2) {
        this.tipContent = str;
        this.clickAction = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:409) call: com.okinc.business.invest_biz.data.bean.UnableRedeemTip.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UnableRedeemTip(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
