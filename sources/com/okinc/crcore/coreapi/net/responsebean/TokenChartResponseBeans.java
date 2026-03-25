package com.okinc.crcore.coreapi.net.responsebean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TokenChartResponseBeans {
    private final String coin;
    private final String fullName;
    private final List<List<String>> trend;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenChartResponseBeans() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.TokenChartResponseBeans */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenChartResponseBeans copy$default(TokenChartResponseBeans tokenChartResponseBeans, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenChartResponseBeans.coin;
        }
        if ((i & 2) != 0) {
            str2 = tokenChartResponseBeans.fullName;
        }
        if ((i & 4) != 0) {
            str3 = tokenChartResponseBeans.url;
        }
        if ((i & 8) != 0) {
            list = tokenChartResponseBeans.trend;
        }
        return tokenChartResponseBeans.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component4() {
        return this.trend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenChartResponseBeans copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TokenChartResponseBeans(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenChartResponseBeans)) {
            return false;
        }
        TokenChartResponseBeans tokenChartResponseBeans = (TokenChartResponseBeans) obj;
        return Intrinsics.EZpvd((Object) this.coin, (Object) tokenChartResponseBeans.coin) && Intrinsics.EZpvd((Object) this.fullName, (Object) tokenChartResponseBeans.fullName) && Intrinsics.EZpvd((Object) this.url, (Object) tokenChartResponseBeans.url) && Intrinsics.EZpvd(this.trend, tokenChartResponseBeans.trend);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getTrend() {
        return this.trend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.coin.hashCode() * 31) + this.fullName.hashCode()) * 31) + this.url.hashCode()) * 31) + this.trend.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenChartResponseBeans(coin=" + this.coin + ", fullName=" + this.fullName + ", url=" + this.url + ", trend=" + this.trend + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.TokenChartResponseBeans.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenChartResponseBeans> serializer() {
            return TokenChartResponseBeans$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenChartResponseBeans(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coin = "";
        } else {
            this.coin = str;
        }
        if ((i & 2) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str2;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.trend = yDY.AhwBna();
        } else {
            this.trend = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TokenChartResponseBeans tokenChartResponseBeans, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenChartResponseBeans.coin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenChartResponseBeans.coin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenChartResponseBeans.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenChartResponseBeans.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenChartResponseBeans.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenChartResponseBeans.url);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(tokenChartResponseBeans.trend, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], tokenChartResponseBeans.trend);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenChartResponseBeans(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.coin = str;
        this.fullName = str2;
        this.url = str3;
        this.trend = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.TokenChartResponseBeans.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TokenChartResponseBeans(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
