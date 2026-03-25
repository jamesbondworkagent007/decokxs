package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestAdvancePanelUIBean implements Parcelable {
    private final int slippageState;
    private final String slippageTips;
    private final boolean slippageWarn;
    private final int state;
    private final InvestSubscriptionReceiveInfo subscriptionReceiveInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestAdvancePanelUIBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestAdvancePanelUIBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestAdvancePanelUIBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestAdvancePanelUIBean(parcel.readInt(), parcel.readInt() == 0 ? null : InvestSubscriptionReceiveInfo.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestAdvancePanelUIBean[] newArray(int i) {
            return new InvestAdvancePanelUIBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestAdvancePanelUIBean copy$default(InvestAdvancePanelUIBean investAdvancePanelUIBean, int i, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, int i2, String str, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = investAdvancePanelUIBean.state;
        }
        if ((i3 & 2) != 0) {
            investSubscriptionReceiveInfo = investAdvancePanelUIBean.subscriptionReceiveInfo;
        }
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = investSubscriptionReceiveInfo;
        if ((i3 & 4) != 0) {
            i2 = investAdvancePanelUIBean.slippageState;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str = investAdvancePanelUIBean.slippageTips;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            z = investAdvancePanelUIBean.slippageWarn;
        }
        return investAdvancePanelUIBean.copy(i, investSubscriptionReceiveInfo2, i4, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionReceiveInfo component2() {
        return this.subscriptionReceiveInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.slippageState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slippageTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.slippageWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAdvancePanelUIBean copy(int i, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, int i2, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestAdvancePanelUIBean(i, investSubscriptionReceiveInfo, i2, str, z);
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
        if (!(obj instanceof InvestAdvancePanelUIBean)) {
            return false;
        }
        InvestAdvancePanelUIBean investAdvancePanelUIBean = (InvestAdvancePanelUIBean) obj;
        return this.state == investAdvancePanelUIBean.state && Intrinsics.EZpvd(this.subscriptionReceiveInfo, investAdvancePanelUIBean.subscriptionReceiveInfo) && this.slippageState == investAdvancePanelUIBean.slippageState && Intrinsics.EZpvd((Object) this.slippageTips, (Object) investAdvancePanelUIBean.slippageTips) && this.slippageWarn == investAdvancePanelUIBean.slippageWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageState() {
        return this.slippageState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageTips() {
        return this.slippageTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSlippageWarn() {
        return this.slippageWarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionReceiveInfo getSubscriptionReceiveInfo() {
        return this.subscriptionReceiveInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.state);
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.subscriptionReceiveInfo;
        return (((((((iHashCode * 31) + (investSubscriptionReceiveInfo == null ? 0 : investSubscriptionReceiveInfo.hashCode())) * 31) + Integer.hashCode(this.slippageState)) * 31) + this.slippageTips.hashCode()) * 31) + Boolean.hashCode(this.slippageWarn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestAdvancePanelUIBean(state=" + this.state + ", subscriptionReceiveInfo=" + this.subscriptionReceiveInfo + ", slippageState=" + this.slippageState + ", slippageTips=" + this.slippageTips + ", slippageWarn=" + this.slippageWarn + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.state);
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.subscriptionReceiveInfo;
        if (investSubscriptionReceiveInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investSubscriptionReceiveInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.slippageState);
        parcel.writeString(this.slippageTips);
        parcel.writeInt(this.slippageWarn ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestAdvancePanelUIBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestAdvancePanelUIBean> serializer() {
            return InvestAdvancePanelUIBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestAdvancePanelUIBean(int i, int i2, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, int i3, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InvestAdvancePanelUIBean$$serializer.INSTANCE.getDescriptor());
        }
        this.state = i2;
        this.subscriptionReceiveInfo = investSubscriptionReceiveInfo;
        if ((i & 4) == 0) {
            this.slippageState = 0;
        } else {
            this.slippageState = i3;
        }
        if ((i & 8) == 0) {
            this.slippageTips = "";
        } else {
            this.slippageTips = str;
        }
        if ((i & 16) == 0) {
            this.slippageWarn = false;
        } else {
            this.slippageWarn = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestAdvancePanelUIBean investAdvancePanelUIBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, investAdvancePanelUIBean.state);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestSubscriptionReceiveInfo$$serializer.INSTANCE, investAdvancePanelUIBean.subscriptionReceiveInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investAdvancePanelUIBean.slippageState != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, investAdvancePanelUIBean.slippageState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investAdvancePanelUIBean.slippageTips, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investAdvancePanelUIBean.slippageTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investAdvancePanelUIBean.slippageWarn) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, investAdvancePanelUIBean.slippageWarn);
        }
    }

    public InvestAdvancePanelUIBean(int i, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, int i2, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = i;
        this.subscriptionReceiveInfo = investSubscriptionReceiveInfo;
        this.slippageState = i2;
        this.slippageTips = str;
        this.slippageWarn = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(int, com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo, int, java.lang.String, boolean):void (m)] (LINE:253) call: com.okinc.business.invest_biz.data.bean.InvestAdvancePanelUIBean.<init>(int, com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo, int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InvestAdvancePanelUIBean(int i, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, int i2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, investSubscriptionReceiveInfo, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? false : z);
    }
}
