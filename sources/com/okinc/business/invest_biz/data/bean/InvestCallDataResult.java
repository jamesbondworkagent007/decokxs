package com.okinc.business.invest_biz.data.bean;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33488mxR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestCallDataResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String checkSum;
    public final String data;
    public final String fromAdr;
    public final String orderId;
    public final String priorityFee;
    public final String providerPubkey;
    public final String pubkey;
    public final String signedData;
    public final String signedPSBT;
    public final String slipper;
    public final String toAdr;
    public final String unstakeIndex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestCallDataResult() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCallDataResult AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, String str10, String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new InvestCallDataResult(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.signedPSBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.signedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.fromAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.toAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestCallDataResult)) {
            return false;
        }
        InvestCallDataResult investCallDataResult = (InvestCallDataResult) obj;
        return Intrinsics.EZpvd((Object) this.data, (Object) investCallDataResult.data) && Intrinsics.EZpvd((Object) this.signedData, (Object) investCallDataResult.signedData) && Intrinsics.EZpvd((Object) this.signedPSBT, (Object) investCallDataResult.signedPSBT) && Intrinsics.EZpvd((Object) this.fromAdr, (Object) investCallDataResult.fromAdr) && Intrinsics.EZpvd((Object) this.toAdr, (Object) investCallDataResult.toAdr) && Intrinsics.EZpvd((Object) this.checkSum, (Object) investCallDataResult.checkSum) && Intrinsics.EZpvd((Object) this.orderId, (Object) investCallDataResult.orderId) && Intrinsics.EZpvd((Object) this.slipper, (Object) investCallDataResult.slipper) && Intrinsics.EZpvd((Object) this.pubkey, (Object) investCallDataResult.pubkey) && Intrinsics.EZpvd((Object) this.unstakeIndex, (Object) investCallDataResult.unstakeIndex) && Intrinsics.EZpvd((Object) this.providerPubkey, (Object) investCallDataResult.providerPubkey) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) investCallDataResult.priorityFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.data.hashCode();
        int iHashCode2 = this.signedData.hashCode();
        int iHashCode3 = this.signedPSBT.hashCode();
        int iHashCode4 = this.fromAdr.hashCode();
        int iHashCode5 = this.toAdr.hashCode();
        int iHashCode6 = this.checkSum.hashCode();
        int iHashCode7 = this.orderId.hashCode();
        int iHashCode8 = this.slipper.hashCode();
        String str = this.pubkey;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.unstakeIndex;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.providerPubkey;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.priorityFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestCallDataResult(data=" + this.data + ", signedData=" + this.signedData + ", signedPSBT=" + this.signedPSBT + ", fromAdr=" + this.fromAdr + ", toAdr=" + this.toAdr + ", checkSum=" + this.checkSum + ", orderId=" + this.orderId + ", slipper=" + this.slipper + ", pubkey=" + this.pubkey + ", unstakeIndex=" + this.unstakeIndex + ", providerPubkey=" + this.providerPubkey + ", priorityFee=" + this.priorityFee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestCallDataResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestCallDataResult> serializer() {
            return InvestCallDataResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestCallDataResult(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = "";
        } else {
            this.data = str;
        }
        if ((i & 2) == 0) {
            this.signedData = "";
        } else {
            this.signedData = str2;
        }
        if ((i & 4) == 0) {
            this.signedPSBT = "";
        } else {
            this.signedPSBT = str3;
        }
        if ((i & 8) == 0) {
            this.fromAdr = "";
        } else {
            this.fromAdr = str4;
        }
        if ((i & 16) == 0) {
            this.toAdr = "";
        } else {
            this.toAdr = str5;
        }
        if ((i & 32) == 0) {
            this.checkSum = "";
        } else {
            this.checkSum = str6;
        }
        if ((i & 64) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str7;
        }
        if ((i & 128) == 0) {
            this.slipper = "";
        } else {
            this.slipper = str8;
        }
        if ((i & 256) == 0) {
            this.pubkey = null;
        } else {
            this.pubkey = str9;
        }
        if ((i & 512) == 0) {
            this.unstakeIndex = null;
        } else {
            this.unstakeIndex = str10;
        }
        if ((i & 1024) == 0) {
            this.providerPubkey = null;
        } else {
            this.providerPubkey = str11;
        }
        if ((i & 2048) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str12;
        }
    }

    public static final /* synthetic */ void copydefault(InvestCallDataResult investCallDataResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investCallDataResult.data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investCallDataResult.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investCallDataResult.signedData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investCallDataResult.signedData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investCallDataResult.signedPSBT, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investCallDataResult.signedPSBT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investCallDataResult.fromAdr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investCallDataResult.fromAdr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investCallDataResult.toAdr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investCallDataResult.toAdr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investCallDataResult.checkSum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investCallDataResult.checkSum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investCallDataResult.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investCallDataResult.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investCallDataResult.slipper, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investCallDataResult.slipper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investCallDataResult.pubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investCallDataResult.pubkey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investCallDataResult.unstakeIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investCallDataResult.unstakeIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investCallDataResult.providerPubkey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investCallDataResult.providerPubkey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) investCallDataResult.priorityFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, investCallDataResult.priorityFee);
    }

    public InvestCallDataResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, String str10, String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.data = str;
        this.signedData = str2;
        this.signedPSBT = str3;
        this.fromAdr = str4;
        this.toAdr = str5;
        this.checkSum = str6;
        this.orderId = str7;
        this.slipper = str8;
        this.pubkey = str9;
        this.unstakeIndex = str10;
        this.providerPubkey = str11;
        this.priorityFee = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:765) call: com.okinc.business.invest_biz.data.bean.InvestCallDataResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestCallDataResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null, (i & 2048) == 0 ? str12 : "");
    }

    public final String OLrzqt() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("slipper", this.slipper);
        jsonObject.addProperty("checkSum", this.checkSum);
        jsonObject.addProperty("priorityFee", this.priorityFee);
        jsonObject.addProperty("signedPsbt", this.signedPSBT);
        jsonObject.addProperty("orderId", this.orderId);
        String str = this.pubkey;
        if (str != null) {
            jsonObject.addProperty("pubKey", str);
        }
        String str2 = this.unstakeIndex;
        if (str2 != null) {
            jsonObject.addProperty("unstakeIndex", str2);
        }
        String str3 = this.providerPubkey;
        if (str3 != null) {
            jsonObject.addProperty("providerPubkey", str3);
        }
        return C33488mxR.EZpvd(jsonObject);
    }
}
