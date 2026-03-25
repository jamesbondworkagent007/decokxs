package com.okinc.business.market.features.trader.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TradersRequestParam {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String addressFilter;
    public final String chainId;
    public final String currentAddress;
    public final String subId;
    public final String tagFilter;
    public final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradersRequestParam copy$default(TradersRequestParam tradersRequestParam, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradersRequestParam.chainId;
        }
        if ((i & 2) != 0) {
            str2 = tradersRequestParam.tokenAddress;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = tradersRequestParam.currentAddress;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = tradersRequestParam.tagFilter;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = tradersRequestParam.addressFilter;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = tradersRequestParam.subId;
        }
        return tradersRequestParam.EZpvd(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradersRequestParam EZpvd(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TradersRequestParam(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.addressFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.currentAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.tagFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradersRequestParam)) {
            return false;
        }
        TradersRequestParam tradersRequestParam = (TradersRequestParam) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) tradersRequestParam.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) tradersRequestParam.tokenAddress) && Intrinsics.EZpvd((Object) this.currentAddress, (Object) tradersRequestParam.currentAddress) && Intrinsics.EZpvd((Object) this.tagFilter, (Object) tradersRequestParam.tagFilter) && Intrinsics.EZpvd((Object) this.addressFilter, (Object) tradersRequestParam.addressFilter) && Intrinsics.EZpvd((Object) this.subId, (Object) tradersRequestParam.subId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.tokenAddress.hashCode();
        String str = this.currentAddress;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tagFilter;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addressFilter;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subId;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradersRequestParam(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", currentAddress=" + this.currentAddress + ", tagFilter=" + this.tagFilter + ", addressFilter=" + this.addressFilter + ", subId=" + this.subId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.trader.domain.model.TradersRequestParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradersRequestParam> serializer() {
            return TradersRequestParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradersRequestParam(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TradersRequestParam$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.tokenAddress = str2;
        if ((i & 4) == 0) {
            this.currentAddress = null;
        } else {
            this.currentAddress = str3;
        }
        if ((i & 8) == 0) {
            this.tagFilter = null;
        } else {
            this.tagFilter = str4;
        }
        if ((i & 16) == 0) {
            this.addressFilter = null;
        } else {
            this.addressFilter = str5;
        }
        if ((i & 32) == 0) {
            this.subId = null;
        } else {
            this.subId = str6;
        }
    }

    public static final /* synthetic */ void KWHzl(TradersRequestParam tradersRequestParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tradersRequestParam.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradersRequestParam.tokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradersRequestParam.currentAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradersRequestParam.currentAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradersRequestParam.tagFilter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradersRequestParam.tagFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradersRequestParam.addressFilter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradersRequestParam.addressFilter);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && tradersRequestParam.subId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradersRequestParam.subId);
    }

    public TradersRequestParam(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.currentAddress = str3;
        this.tagFilter = str4;
        this.addressFilter = str5;
        this.subId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.features.trader.domain.model.TradersRequestParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradersRequestParam(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
