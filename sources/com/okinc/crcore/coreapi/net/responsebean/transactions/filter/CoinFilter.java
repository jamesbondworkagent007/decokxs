package com.okinc.crcore.coreapi.net.responsebean.transactions.filter;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CoinFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final Integer id;
    public final String name;
    public final String sign;
    public final String sort;
    public final String symbol;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinFilter() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinFilter copy$default(CoinFilter coinFilter, Integer num, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = coinFilter.id;
        }
        if ((i & 2) != 0) {
            str = coinFilter.name;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = coinFilter.sign;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = coinFilter.sort;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = coinFilter.symbol;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = coinFilter.url;
        }
        return coinFilter.KWHzl(num, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinFilter KWHzl(Integer num, String str, String str2, String str3, String str4, String str5) {
        return new CoinFilter(num, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinFilter)) {
            return false;
        }
        CoinFilter coinFilter = (CoinFilter) obj;
        return Intrinsics.EZpvd(this.id, coinFilter.id) && Intrinsics.EZpvd((Object) this.name, (Object) coinFilter.name) && Intrinsics.EZpvd((Object) this.sign, (Object) coinFilter.sign) && Intrinsics.EZpvd((Object) this.sort, (Object) coinFilter.sort) && Intrinsics.EZpvd((Object) this.symbol, (Object) coinFilter.symbol) && Intrinsics.EZpvd((Object) this.url, (Object) coinFilter.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.id;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.sign;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sort;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.symbol;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.url;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinFilter(id=" + this.id + ", name=" + this.name + ", sign=" + this.sign + ", sort=" + this.sort + ", symbol=" + this.symbol + ", url=" + this.url + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.transactions.filter.CoinFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinFilter> serializer() {
            return CoinFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinFilter(int i, Integer num, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = num;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.sign = null;
        } else {
            this.sign = str2;
        }
        if ((i & 8) == 0) {
            this.sort = null;
        } else {
            this.sort = str3;
        }
        if ((i & 16) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str4;
        }
        if ((i & 32) == 0) {
            this.url = null;
        } else {
            this.url = str5;
        }
    }

    public static final /* synthetic */ void KWHzl(CoinFilter coinFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || coinFilter.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, coinFilter.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinFilter.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, coinFilter.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinFilter.sign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, coinFilter.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || coinFilter.sort != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, coinFilter.sort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || coinFilter.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, coinFilter.symbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && coinFilter.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, coinFilter.url);
    }

    public CoinFilter(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.id = num;
        this.name = str;
        this.sign = str2;
        this.sort = str3;
        this.symbol = str4;
        this.url = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.crcore.coreapi.net.responsebean.transactions.filter.CoinFilter.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinFilter(Integer num, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
