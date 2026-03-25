package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DebtCanWithdrawBean implements Parcelable {
    private String ccy;
    private boolean checked;
    private boolean enabled;
    private String maxWd;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DebtCanWithdrawBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<DebtCanWithdrawBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DebtCanWithdrawBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DebtCanWithdrawBean(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DebtCanWithdrawBean[] newArray(int i) {
            return new DebtCanWithdrawBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DebtCanWithdrawBean copy$default(DebtCanWithdrawBean debtCanWithdrawBean, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debtCanWithdrawBean.ccy;
        }
        if ((i & 2) != 0) {
            str2 = debtCanWithdrawBean.maxWd;
        }
        if ((i & 4) != 0) {
            z = debtCanWithdrawBean.checked;
        }
        if ((i & 8) != 0) {
            z2 = debtCanWithdrawBean.enabled;
        }
        return debtCanWithdrawBean.copy(str, str2, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.checked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DebtCanWithdrawBean copy(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DebtCanWithdrawBean(str, str2, z, z2);
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
        if (!(obj instanceof DebtCanWithdrawBean)) {
            return false;
        }
        DebtCanWithdrawBean debtCanWithdrawBean = (DebtCanWithdrawBean) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) debtCanWithdrawBean.ccy) && Intrinsics.EZpvd((Object) this.maxWd, (Object) debtCanWithdrawBean.maxWd) && this.checked == debtCanWithdrawBean.checked && this.enabled == debtCanWithdrawBean.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxWd() {
        return this.maxWd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.ccy.hashCode() * 31) + this.maxWd.hashCode()) * 31) + Boolean.hashCode(this.checked)) * 31) + Boolean.hashCode(this.enabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecked(boolean z) {
        this.checked = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxWd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxWd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DebtCanWithdrawBean(ccy=" + this.ccy + ", maxWd=" + this.maxWd + ", checked=" + this.checked + ", enabled=" + this.enabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.maxWd);
        parcel.writeInt(this.checked ? 1 : 0);
        parcel.writeInt(this.enabled ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DebtCanWithdrawBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DebtCanWithdrawBean> serializer() {
            return DebtCanWithdrawBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DebtCanWithdrawBean(int i, String str, String str2, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DebtCanWithdrawBean$$serializer.INSTANCE.getDescriptor());
        }
        this.ccy = str;
        this.maxWd = str2;
        if ((i & 4) == 0) {
            this.checked = false;
        } else {
            this.checked = z;
        }
        if ((i & 8) == 0) {
            this.enabled = true;
        } else {
            this.enabled = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DebtCanWithdrawBean debtCanWithdrawBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, debtCanWithdrawBean.ccy);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, debtCanWithdrawBean.maxWd);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || debtCanWithdrawBean.checked) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, debtCanWithdrawBean.checked);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && debtCanWithdrawBean.enabled) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, debtCanWithdrawBean.enabled);
    }

    public DebtCanWithdrawBean(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ccy = str;
        this.maxWd = str2;
        this.checked = z;
        this.enabled = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:22) call: com.okinc.unify_trade.biz.DebtCanWithdrawBean.<init>(java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ DebtCanWithdrawBean(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
    }
}
