package com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommonUnSignData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String data;
    private final String from;
    private final String to;
    private final String unsignedTx;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonUnSignData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommonUnSignData copy$default(CommonUnSignData commonUnSignData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonUnSignData.data;
        }
        if ((i & 2) != 0) {
            str2 = commonUnSignData.from;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = commonUnSignData.to;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = commonUnSignData.value;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = commonUnSignData.unsignedTx;
        }
        return commonUnSignData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonUnSignData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CommonUnSignData(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonUnSignData)) {
            return false;
        }
        CommonUnSignData commonUnSignData = (CommonUnSignData) obj;
        return Intrinsics.EZpvd((Object) this.data, (Object) commonUnSignData.data) && Intrinsics.EZpvd((Object) this.from, (Object) commonUnSignData.from) && Intrinsics.EZpvd((Object) this.to, (Object) commonUnSignData.to) && Intrinsics.EZpvd((Object) this.value, (Object) commonUnSignData.value) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) commonUnSignData.unsignedTx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.data.hashCode() * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.value.hashCode()) * 31) + this.unsignedTx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonUnSignData(data=" + this.data + ", from=" + this.from + ", to=" + this.to + ", value=" + this.value + ", unsignedTx=" + this.unsignedTx + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonUnSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonUnSignData> serializer() {
            return CommonUnSignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonUnSignData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = "";
        } else {
            this.data = str;
        }
        if ((i & 2) == 0) {
            this.from = "";
        } else {
            this.from = str2;
        }
        if ((i & 4) == 0) {
            this.to = "";
        } else {
            this.to = str3;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 16) == 0) {
            this.unsignedTx = "";
        } else {
            this.unsignedTx = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CommonUnSignData commonUnSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) commonUnSignData.data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, commonUnSignData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) commonUnSignData.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, commonUnSignData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) commonUnSignData.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, commonUnSignData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) commonUnSignData.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, commonUnSignData.value);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) commonUnSignData.unsignedTx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, commonUnSignData.unsignedTx);
    }

    public CommonUnSignData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.data = str;
        this.from = str2;
        this.to = str3;
        this.value = str4;
        this.unsignedTx = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:30) call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CommonUnSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommonUnSignData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
