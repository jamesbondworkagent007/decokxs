package com.okinc.business.invest_biz.data.bean.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TransactionStep implements Parcelable {
    public final String approveAddress;
    public final int approveType;
    public final String callDataExtra;
    public final long chainId;
    public final boolean isBaseToken;
    public final boolean isNeedExecute;
    public final String needApproveAmount;
    public final String network;
    public final int orderType;
    public final String stepInProgressName;
    public final String stepName;
    public final String tokenAddress;
    public final String tokenId;
    public final String tokenLogo;
    public final String tokenName;
    public final int tokenPrecision;
    public final String tokenSymbol;
    public final List<TransactionStepTokenInfo> transactionStepTokenInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionStep> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TransactionStepTokenInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<TransactionStep> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionStep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(TransactionStepTokenInfo.CREATOR.createFromParcel(parcel));
            }
            return new TransactionStep(string, string2, j, z, string3, i, string4, string5, string6, arrayList, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionStep[] newArray(int i) {
            return new TransactionStep[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionStep() {
        this((String) null, (String) null, 0L, false, (String) null, 0, (String) null, (String) null, (String) null, (List) null, 0, (String) null, (String) null, (String) null, (String) null, false, (String) null, 0, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.approveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.stepName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStepTokenInfo> AkhnZx() {
        return this.transactionStepTokenInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.callDataExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStep copydefault(@NotNull String str, @NotNull String str2, long j, boolean z, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<TransactionStepTokenInfo> list, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z2, @NotNull String str11, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new TransactionStep(str, str2, j, z, str3, i, str4, str5, str6, list, i2, str7, str8, str9, str10, z2, str11, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.needApproveAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.stepInProgressName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionStep)) {
            return false;
        }
        TransactionStep transactionStep = (TransactionStep) obj;
        return Intrinsics.EZpvd((Object) this.approveAddress, (Object) transactionStep.approveAddress) && Intrinsics.EZpvd((Object) this.callDataExtra, (Object) transactionStep.callDataExtra) && this.chainId == transactionStep.chainId && this.isNeedExecute == transactionStep.isNeedExecute && Intrinsics.EZpvd((Object) this.network, (Object) transactionStep.network) && this.orderType == transactionStep.orderType && Intrinsics.EZpvd((Object) this.stepInProgressName, (Object) transactionStep.stepInProgressName) && Intrinsics.EZpvd((Object) this.stepName, (Object) transactionStep.stepName) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) transactionStep.tokenAddress) && Intrinsics.EZpvd(this.transactionStepTokenInfoList, transactionStep.transactionStepTokenInfoList) && this.tokenPrecision == transactionStep.tokenPrecision && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) transactionStep.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenId, (Object) transactionStep.tokenId) && Intrinsics.EZpvd((Object) this.tokenName, (Object) transactionStep.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) transactionStep.tokenLogo) && this.isBaseToken == transactionStep.isBaseToken && Intrinsics.EZpvd((Object) this.needApproveAmount, (Object) transactionStep.needApproveAmount) && this.approveType == transactionStep.approveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.isNeedExecute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.approveAddress.hashCode() * 31) + this.callDataExtra.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + Boolean.hashCode(this.isNeedExecute)) * 31) + this.network.hashCode()) * 31) + Integer.hashCode(this.orderType)) * 31) + this.stepInProgressName.hashCode()) * 31) + this.stepName.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.transactionStepTokenInfoList.hashCode()) * 31) + Integer.hashCode(this.tokenPrecision)) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenId.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + Boolean.hashCode(this.isBaseToken)) * 31) + this.needApproveAmount.hashCode()) * 31) + Integer.hashCode(this.approveType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionStep(approveAddress=" + this.approveAddress + ", callDataExtra=" + this.callDataExtra + ", chainId=" + this.chainId + ", isNeedExecute=" + this.isNeedExecute + ", network=" + this.network + ", orderType=" + this.orderType + ", stepInProgressName=" + this.stepInProgressName + ", stepName=" + this.stepName + ", tokenAddress=" + this.tokenAddress + ", transactionStepTokenInfoList=" + this.transactionStepTokenInfoList + ", tokenPrecision=" + this.tokenPrecision + ", tokenSymbol=" + this.tokenSymbol + ", tokenId=" + this.tokenId + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", isBaseToken=" + this.isBaseToken + ", needApproveAmount=" + this.needApproveAmount + ", approveType=" + this.approveType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.approveAddress);
        parcel.writeString(this.callDataExtra);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.isNeedExecute ? 1 : 0);
        parcel.writeString(this.network);
        parcel.writeInt(this.orderType);
        parcel.writeString(this.stepInProgressName);
        parcel.writeString(this.stepName);
        parcel.writeString(this.tokenAddress);
        List<TransactionStepTokenInfo> list = this.transactionStepTokenInfoList;
        parcel.writeInt(list.size());
        Iterator<TransactionStepTokenInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.tokenPrecision);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenId);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenLogo);
        parcel.writeInt(this.isBaseToken ? 1 : 0);
        parcel.writeString(this.needApproveAmount);
        parcel.writeInt(this.approveType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.TransactionStep.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionStep> serializer() {
            return TransactionStep$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionStep(int i, String str, String str2, long j, boolean z, String str3, int i2, String str4, String str5, String str6, List list, int i3, String str7, String str8, String str9, String str10, boolean z2, String str11, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.approveAddress = "";
        } else {
            this.approveAddress = str;
        }
        if ((i & 2) == 0) {
            this.callDataExtra = "";
        } else {
            this.callDataExtra = str2;
        }
        this.chainId = (i & 4) == 0 ? 0L : j;
        if ((i & 8) == 0) {
            this.isNeedExecute = false;
        } else {
            this.isNeedExecute = z;
        }
        if ((i & 16) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 32) == 0) {
            this.orderType = -1;
        } else {
            this.orderType = i2;
        }
        if ((i & 64) == 0) {
            this.stepInProgressName = "";
        } else {
            this.stepInProgressName = str4;
        }
        if ((i & 128) == 0) {
            this.stepName = "";
        } else {
            this.stepName = str5;
        }
        if ((i & 256) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str6;
        }
        this.transactionStepTokenInfoList = (i & 512) == 0 ? yDY.AhwBna() : list;
        if ((i & 1024) == 0) {
            this.tokenPrecision = 0;
        } else {
            this.tokenPrecision = i3;
        }
        if ((i & 2048) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str7;
        }
        if ((i & 4096) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str8;
        }
        if ((i & 8192) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str9;
        }
        if ((i & 16384) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str10;
        }
        if ((32768 & i) == 0) {
            this.isBaseToken = false;
        } else {
            this.isBaseToken = z2;
        }
        if ((65536 & i) == 0) {
            this.needApproveAmount = "";
        } else {
            this.needApproveAmount = str11;
        }
        if ((i & 131072) == 0) {
            this.approveType = -1;
        } else {
            this.approveType = i4;
        }
    }

    public static final /* synthetic */ void OLrzqt(TransactionStep transactionStep, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) transactionStep.approveAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionStep.approveAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionStep.callDataExtra, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionStep.callDataExtra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionStep.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, transactionStep.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transactionStep.isNeedExecute) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, transactionStep.isNeedExecute);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transactionStep.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, transactionStep.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transactionStep.orderType != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, transactionStep.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) transactionStep.stepInProgressName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, transactionStep.stepInProgressName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) transactionStep.stepName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, transactionStep.stepName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) transactionStep.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, transactionStep.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(transactionStep.transactionStepTokenInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], transactionStep.transactionStepTokenInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || transactionStep.tokenPrecision != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, transactionStep.tokenPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) transactionStep.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, transactionStep.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) transactionStep.tokenId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, transactionStep.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) transactionStep.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, transactionStep.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) transactionStep.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, transactionStep.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || transactionStep.isBaseToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, transactionStep.isBaseToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) transactionStep.needApproveAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, transactionStep.needApproveAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && transactionStep.approveType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 17, transactionStep.approveType);
    }

    public TransactionStep(@NotNull String str, @NotNull String str2, long j, boolean z, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<TransactionStepTokenInfo> list, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z2, @NotNull String str11, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.approveAddress = str;
        this.callDataExtra = str2;
        this.chainId = j;
        this.isNeedExecute = z;
        this.network = str3;
        this.orderType = i;
        this.stepInProgressName = str4;
        this.stepName = str5;
        this.tokenAddress = str6;
        this.transactionStepTokenInfoList = list;
        this.tokenPrecision = i2;
        this.tokenSymbol = str7;
        this.tokenId = str8;
        this.tokenName = str9;
        this.tokenLogo = str10;
        this.isBaseToken = z2;
        this.needApproveAmount = str11;
        this.approveType = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cd: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r23v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r27v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004d: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r31v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0058: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0089: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009f: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r39v0 int))
 A[MD:(java.lang.String, java.lang.String, long, boolean, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.response.TransactionStepTokenInfo>, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int):void (m)] (LINE:11) call: com.okinc.business.invest_biz.data.bean.response.TransactionStep.<init>(java.lang.String, java.lang.String, long, boolean, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int):void type: THIS */
    public /* synthetic */ TransactionStep(String str, String str2, long j, boolean z, String str3, int i, String str4, String str5, String str6, List list, int i2, String str7, String str8, String str9, String str10, boolean z2, String str11, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0L : j, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? -1 : i, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? yDY.AhwBna() : list, (i4 & 1024) != 0 ? 0 : i2, (i4 & 2048) != 0 ? "" : str7, (i4 & 4096) != 0 ? "" : str8, (i4 & 8192) != 0 ? "" : str9, (i4 & 16384) != 0 ? "" : str10, (i4 & 32768) != 0 ? false : z2, (i4 & 65536) != 0 ? "" : str11, (i4 & 131072) != 0 ? -1 : i3);
    }
}
