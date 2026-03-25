package com.okinc.business.invest_biz.ui.finality_provider;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class InvestFinalityProviderItem implements Parcelable {
    private final String commission;
    private boolean isSelected;
    private final String providerPubkey;
    private final boolean recommended;
    private final String totalDelegations;
    private final String validatorName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestFinalityProviderItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestFinalityProviderItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFinalityProviderItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestFinalityProviderItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFinalityProviderItem[] newArray(int i) {
            return new InvestFinalityProviderItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestFinalityProviderItem() {
        this((String) null, (String) null, (String) null, false, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestFinalityProviderItem copy$default(InvestFinalityProviderItem investFinalityProviderItem, String str, String str2, String str3, boolean z, String str4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investFinalityProviderItem.totalDelegations;
        }
        if ((i & 2) != 0) {
            str2 = investFinalityProviderItem.commission;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = investFinalityProviderItem.validatorName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = investFinalityProviderItem.recommended;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str4 = investFinalityProviderItem.providerPubkey;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z2 = investFinalityProviderItem.isSelected;
        }
        return investFinalityProviderItem.copy(str, str5, str6, z3, str7, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalDelegations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.commission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.recommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestFinalityProviderItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InvestFinalityProviderItem(str, str2, str3, z, str4, z2);
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
        if (!(obj instanceof InvestFinalityProviderItem)) {
            return false;
        }
        InvestFinalityProviderItem investFinalityProviderItem = (InvestFinalityProviderItem) obj;
        return Intrinsics.EZpvd((Object) this.totalDelegations, (Object) investFinalityProviderItem.totalDelegations) && Intrinsics.EZpvd((Object) this.commission, (Object) investFinalityProviderItem.commission) && Intrinsics.EZpvd((Object) this.validatorName, (Object) investFinalityProviderItem.validatorName) && this.recommended == investFinalityProviderItem.recommended && Intrinsics.EZpvd((Object) this.providerPubkey, (Object) investFinalityProviderItem.providerPubkey) && this.isSelected == investFinalityProviderItem.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommission() {
        return this.commission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProviderPubkey() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRecommended() {
        return this.recommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalDelegations() {
        return this.totalDelegations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidatorName() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.totalDelegations.hashCode() * 31) + this.commission.hashCode()) * 31) + this.validatorName.hashCode()) * 31) + Boolean.hashCode(this.recommended)) * 31) + this.providerPubkey.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestFinalityProviderItem(totalDelegations=" + this.totalDelegations + ", commission=" + this.commission + ", validatorName=" + this.validatorName + ", recommended=" + this.recommended + ", providerPubkey=" + this.providerPubkey + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalDelegations);
        parcel.writeString(this.commission);
        parcel.writeString(this.validatorName);
        parcel.writeInt(this.recommended ? 1 : 0);
        parcel.writeString(this.providerPubkey);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestFinalityProviderItem> serializer() {
            return InvestFinalityProviderItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestFinalityProviderItem(int i, String str, String str2, String str3, boolean z, String str4, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalDelegations = "";
        } else {
            this.totalDelegations = str;
        }
        if ((i & 2) == 0) {
            this.commission = "";
        } else {
            this.commission = str2;
        }
        if ((i & 4) == 0) {
            this.validatorName = "";
        } else {
            this.validatorName = str3;
        }
        if ((i & 8) == 0) {
            this.recommended = false;
        } else {
            this.recommended = z;
        }
        if ((i & 16) == 0) {
            this.providerPubkey = "";
        } else {
            this.providerPubkey = str4;
        }
        if ((i & 32) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestFinalityProviderItem investFinalityProviderItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investFinalityProviderItem.totalDelegations, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investFinalityProviderItem.totalDelegations);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investFinalityProviderItem.commission, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investFinalityProviderItem.commission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investFinalityProviderItem.validatorName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investFinalityProviderItem.validatorName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investFinalityProviderItem.recommended) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, investFinalityProviderItem.recommended);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investFinalityProviderItem.providerPubkey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investFinalityProviderItem.providerPubkey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investFinalityProviderItem.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, investFinalityProviderItem.isSelected);
        }
    }

    public InvestFinalityProviderItem(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.totalDelegations = str;
        this.commission = str2;
        this.validatorName = str3;
        this.recommended = z;
        this.providerPubkey = str4;
        this.isSelected = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void (m)] (LINE:18) call: com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestFinalityProviderItem(String str, String str2, String str3, boolean z, String str4, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z2);
    }
}
