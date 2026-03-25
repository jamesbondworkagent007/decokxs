package com.okinc.business.invest_biz.data.logic.ws.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTransactionModel implements Parcelable {
    private String address;
    private String network;
    private String orderId;
    private Integer pushToastCode;
    private List<String> pushToastParams;
    private InvestTransactionParam routerParams;
    private String txHash;
    private String txId;
    private Integer txVoStatus;
    private String uopHash;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTransactionModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<InvestTransactionModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTransactionModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTransactionModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() != 0 ? InvestTransactionParam.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTransactionModel[] newArray(int i) {
            return new InvestTransactionModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTransactionModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Integer) null, (List) null, (InvestTransactionParam) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.pushToastParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionParam component11() {
        return this.routerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.txVoStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.pushToastCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionModel copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, List<String> list, InvestTransactionParam investTransactionParam) {
        return new InvestTransactionModel(str, str2, str3, str4, str5, num, str6, str7, num2, list, investTransactionParam);
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
        if (!(obj instanceof InvestTransactionModel)) {
            return false;
        }
        InvestTransactionModel investTransactionModel = (InvestTransactionModel) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) investTransactionModel.txId) && Intrinsics.EZpvd((Object) this.txHash, (Object) investTransactionModel.txHash) && Intrinsics.EZpvd((Object) this.uopHash, (Object) investTransactionModel.uopHash) && Intrinsics.EZpvd((Object) this.address, (Object) investTransactionModel.address) && Intrinsics.EZpvd((Object) this.orderId, (Object) investTransactionModel.orderId) && Intrinsics.EZpvd(this.txVoStatus, investTransactionModel.txVoStatus) && Intrinsics.EZpvd((Object) this.network, (Object) investTransactionModel.network) && Intrinsics.EZpvd((Object) this.url, (Object) investTransactionModel.url) && Intrinsics.EZpvd(this.pushToastCode, investTransactionModel.pushToastCode) && Intrinsics.EZpvd(this.pushToastParams, investTransactionModel.pushToastParams) && Intrinsics.EZpvd(this.routerParams, investTransactionModel.routerParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPushToastCode() {
        return this.pushToastCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPushToastParams() {
        return this.pushToastParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionParam getRouterParams() {
        return this.routerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxVoStatus() {
        return this.txVoStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.txHash;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uopHash;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.address;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.orderId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.txVoStatus;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str6 = this.network;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.url;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        Integer num2 = this.pushToastCode;
        int iHashCode9 = num2 == null ? 0 : num2.hashCode();
        List<String> list = this.pushToastParams;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        InvestTransactionParam investTransactionParam = this.routerParams;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (investTransactionParam != null ? investTransactionParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(String str) {
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(String str) {
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushToastCode(Integer num) {
        this.pushToastCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushToastParams(List<String> list) {
        this.pushToastParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRouterParams(InvestTransactionParam investTransactionParam) {
        this.routerParams = investTransactionParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxVoStatus(Integer num) {
        this.txVoStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUopHash(String str) {
        this.uopHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTransactionModel(txId=" + this.txId + ", txHash=" + this.txHash + ", uopHash=" + this.uopHash + ", address=" + this.address + ", orderId=" + this.orderId + ", txVoStatus=" + this.txVoStatus + ", network=" + this.network + ", url=" + this.url + ", pushToastCode=" + this.pushToastCode + ", pushToastParams=" + this.pushToastParams + ", routerParams=" + this.routerParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txId);
        parcel.writeString(this.txHash);
        parcel.writeString(this.uopHash);
        parcel.writeString(this.address);
        parcel.writeString(this.orderId);
        Integer num = this.txVoStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.network);
        parcel.writeString(this.url);
        Integer num2 = this.pushToastCode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeStringList(this.pushToastParams);
        InvestTransactionParam investTransactionParam = this.routerParams;
        if (investTransactionParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTransactionParam.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTransactionModel> serializer() {
            return InvestTransactionModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTransactionModel(int i, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, List list, InvestTransactionParam investTransactionParam, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txId = "";
        } else {
            this.txId = str;
        }
        if ((i & 2) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str2;
        }
        if ((i & 4) == 0) {
            this.uopHash = "";
        } else {
            this.uopHash = str3;
        }
        if ((i & 8) == 0) {
            this.address = "";
        } else {
            this.address = str4;
        }
        if ((i & 16) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str5;
        }
        if ((i & 32) == 0) {
            this.txVoStatus = 0;
        } else {
            this.txVoStatus = num;
        }
        if ((i & 64) == 0) {
            this.network = "";
        } else {
            this.network = str6;
        }
        if ((i & 128) == 0) {
            this.url = "";
        } else {
            this.url = str7;
        }
        if ((i & 256) == 0) {
            this.pushToastCode = 0;
        } else {
            this.pushToastCode = num2;
        }
        if ((i & 512) == 0) {
            this.pushToastParams = null;
        } else {
            this.pushToastParams = list;
        }
        if ((i & 1024) == 0) {
            this.routerParams = null;
        } else {
            this.routerParams = investTransactionParam;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTransactionModel investTransactionModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investTransactionModel.txId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investTransactionModel.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investTransactionModel.txHash, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investTransactionModel.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investTransactionModel.uopHash, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investTransactionModel.uopHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investTransactionModel.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investTransactionModel.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investTransactionModel.orderId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investTransactionModel.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num2 = investTransactionModel.txVoStatus) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, investTransactionModel.txVoStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investTransactionModel.network, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investTransactionModel.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investTransactionModel.url, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investTransactionModel.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || (num = investTransactionModel.pushToastCode) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, investTransactionModel.pushToastCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investTransactionModel.pushToastParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], investTransactionModel.pushToastParams);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && investTransactionModel.routerParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, InvestTransactionParam$$serializer.INSTANCE, investTransactionModel.routerParams);
    }

    public InvestTransactionModel(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, List<String> list, InvestTransactionParam investTransactionParam) {
        this.txId = str;
        this.txHash = str2;
        this.uopHash = str3;
        this.address = str4;
        this.orderId = str5;
        this.txVoStatus = num;
        this.network = str6;
        this.url = str7;
        this.pushToastCode = num2;
        this.pushToastParams = list;
        this.routerParams = investTransactionParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0074: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0044: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004f: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTransactionParam:?: TERNARY null = ((wrap:int:0x0058: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 com.okinc.business.invest_biz.data.bean.InvestTransactionParam) : (null com.okinc.business.invest_biz.data.bean.InvestTransactionParam))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.util.List<java.lang.String>, com.okinc.business.invest_biz.data.bean.InvestTransactionParam):void (m)] (LINE:12) call: com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, com.okinc.business.invest_biz.data.bean.InvestTransactionParam):void type: THIS */
    public /* synthetic */ InvestTransactionModel(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, List list, InvestTransactionParam investTransactionParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0 : num, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? 0 : num2, (i & 512) != 0 ? null : list, (i & 1024) == 0 ? investTransactionParam : null);
    }
}
