package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class WithdrawBatchSubResp implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final int areaCode;
    private final int code;
    private final String msg;
    private final String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawBatchSubResp() {
        this((String) null, (String) null, 0, 0, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawBatchSubResp copy$default(WithdrawBatchSubResp withdrawBatchSubResp, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = withdrawBatchSubResp.address;
        }
        if ((i3 & 2) != 0) {
            str2 = withdrawBatchSubResp.tag;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = withdrawBatchSubResp.areaCode;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = withdrawBatchSubResp.code;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = withdrawBatchSubResp.msg;
        }
        return withdrawBatchSubResp.copy(str, str4, i4, i5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawBatchSubResp copy(String str, String str2, int i, int i2, String str3) {
        return new WithdrawBatchSubResp(str, str2, i, i2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawBatchSubResp)) {
            return false;
        }
        WithdrawBatchSubResp withdrawBatchSubResp = (WithdrawBatchSubResp) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) withdrawBatchSubResp.address) && Intrinsics.EZpvd((Object) this.tag, (Object) withdrawBatchSubResp.tag) && this.areaCode == withdrawBatchSubResp.areaCode && this.code == withdrawBatchSubResp.code && Intrinsics.EZpvd((Object) this.msg, (Object) withdrawBatchSubResp.msg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tag;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Integer.hashCode(this.areaCode);
        int iHashCode4 = Integer.hashCode(this.code);
        String str3 = this.msg;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.code == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawBatchSubResp(address=" + this.address + ", tag=" + this.tag + ", areaCode=" + this.areaCode + ", code=" + this.code + ", msg=" + this.msg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.WithdrawBatchSubResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WithdrawBatchSubResp> serializer() {
            return WithdrawBatchSubResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WithdrawBatchSubResp(int i, String str, String str2, int i2, int i3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.tag = null;
        } else {
            this.tag = str2;
        }
        if ((i & 4) == 0) {
            this.areaCode = 0;
        } else {
            this.areaCode = i2;
        }
        if ((i & 8) == 0) {
            this.code = 0;
        } else {
            this.code = i3;
        }
        if ((i & 16) == 0) {
            this.msg = null;
        } else {
            this.msg = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(WithdrawBatchSubResp withdrawBatchSubResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || withdrawBatchSubResp.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, withdrawBatchSubResp.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || withdrawBatchSubResp.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, withdrawBatchSubResp.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || withdrawBatchSubResp.areaCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, withdrawBatchSubResp.areaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || withdrawBatchSubResp.code != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, withdrawBatchSubResp.code);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && withdrawBatchSubResp.msg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, withdrawBatchSubResp.msg);
    }

    public WithdrawBatchSubResp(String str, String str2, int i, int i2, String str3) {
        this.address = str;
        this.tag = str2;
        this.areaCode = i;
        this.code = i2;
        this.msg = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, int, java.lang.String):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.WithdrawBatchSubResp.<init>(java.lang.String, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawBatchSubResp(String str, String str2, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str3);
    }
}
