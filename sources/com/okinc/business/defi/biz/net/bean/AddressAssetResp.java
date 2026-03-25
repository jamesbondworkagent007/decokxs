package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AddressAssetResp {
    public String address;
    public String coinAmount;
    public Long coinId;
    public String currencyAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressAssetResp() {
        this((Long) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressAssetResp copy$default(AddressAssetResp addressAssetResp, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = addressAssetResp.coinId;
        }
        if ((i & 2) != 0) {
            str = addressAssetResp.coinAmount;
        }
        if ((i & 4) != 0) {
            str2 = addressAssetResp.address;
        }
        if ((i & 8) != 0) {
            str3 = addressAssetResp.currencyAmount;
        }
        return addressAssetResp.copydefault(l, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long EZpvd() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAssetResp copydefault(Long l, String str, String str2, String str3) {
        return new AddressAssetResp(l, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressAssetResp)) {
            return false;
        }
        AddressAssetResp addressAssetResp = (AddressAssetResp) obj;
        return Intrinsics.EZpvd(this.coinId, addressAssetResp.coinId) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) addressAssetResp.coinAmount) && Intrinsics.EZpvd((Object) this.address, (Object) addressAssetResp.address) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) addressAssetResp.currencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.coinAmount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currencyAmount;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAssetResp(coinId=" + this.coinId + ", coinAmount=" + this.coinAmount + ", address=" + this.address + ", currencyAmount=" + this.currencyAmount + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressAssetResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressAssetResp> serializer() {
            return AddressAssetResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressAssetResp(int i, Long l, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = str2;
        }
        if ((i & 8) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str3;
        }
    }

    public static final /* synthetic */ void KWHzl(AddressAssetResp addressAssetResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressAssetResp.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, addressAssetResp.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addressAssetResp.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, addressAssetResp.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || addressAssetResp.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, addressAssetResp.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && addressAssetResp.currencyAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, addressAssetResp.currencyAmount);
    }

    public AddressAssetResp(Long l, String str, String str2, String str3) {
        this.coinId = l;
        this.coinAmount = str;
        this.address = str2;
        this.currencyAmount = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:801) call: com.okinc.business.defi.biz.net.bean.AddressAssetResp.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AddressAssetResp(Long l, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
