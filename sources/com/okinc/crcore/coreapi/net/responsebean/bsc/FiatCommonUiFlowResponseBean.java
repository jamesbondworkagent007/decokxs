package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FiatCommonUiFlowResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String depositName;
    private final String depositPlatformCode;
    private final String uiFlow;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FiatCommonUiFlowResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<FiatCommonUiFlowResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCommonUiFlowResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FiatCommonUiFlowResponseBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCommonUiFlowResponseBean[] newArray(int i) {
            return new FiatCommonUiFlowResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatCommonUiFlowResponseBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FiatCommonUiFlowResponseBean copy$default(FiatCommonUiFlowResponseBean fiatCommonUiFlowResponseBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fiatCommonUiFlowResponseBean.uiFlow;
        }
        if ((i & 2) != 0) {
            str2 = fiatCommonUiFlowResponseBean.depositPlatformCode;
        }
        if ((i & 4) != 0) {
            str3 = fiatCommonUiFlowResponseBean.depositName;
        }
        return fiatCommonUiFlowResponseBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uiFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatCommonUiFlowResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new FiatCommonUiFlowResponseBean(str, str2, str3);
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
        if (!(obj instanceof FiatCommonUiFlowResponseBean)) {
            return false;
        }
        FiatCommonUiFlowResponseBean fiatCommonUiFlowResponseBean = (FiatCommonUiFlowResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.uiFlow, (Object) fiatCommonUiFlowResponseBean.uiFlow) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) fiatCommonUiFlowResponseBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.depositName, (Object) fiatCommonUiFlowResponseBean.depositName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUiFlow() {
        return this.uiFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.uiFlow.hashCode() * 31) + this.depositPlatformCode.hashCode()) * 31) + this.depositName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatCommonUiFlowResponseBean(uiFlow=" + this.uiFlow + ", depositPlatformCode=" + this.depositPlatformCode + ", depositName=" + this.depositName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.uiFlow);
        parcel.writeString(this.depositPlatformCode);
        parcel.writeString(this.depositName);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.FiatCommonUiFlowResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FiatCommonUiFlowResponseBean> serializer() {
            return FiatCommonUiFlowResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FiatCommonUiFlowResponseBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uiFlow = "";
        } else {
            this.uiFlow = str;
        }
        if ((i & 2) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str2;
        }
        if ((i & 4) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FiatCommonUiFlowResponseBean fiatCommonUiFlowResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiatCommonUiFlowResponseBean.uiFlow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatCommonUiFlowResponseBean.uiFlow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fiatCommonUiFlowResponseBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fiatCommonUiFlowResponseBean.depositPlatformCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) fiatCommonUiFlowResponseBean.depositName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, fiatCommonUiFlowResponseBean.depositName);
    }

    public FiatCommonUiFlowResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.uiFlow = str;
        this.depositPlatformCode = str2;
        this.depositName = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.bsc.FiatCommonUiFlowResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FiatCommonUiFlowResponseBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
