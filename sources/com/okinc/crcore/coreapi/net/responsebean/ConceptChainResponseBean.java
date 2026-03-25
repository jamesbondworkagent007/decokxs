package com.okinc.crcore.coreapi.net.responsebean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ConceptChainResponseBean {
    private final String changePer24h;
    private final String code;
    private final ArrayList<ConceptCoinResponseBean> coinList;
    private final String downNum;
    private final String holdTimeAvg;
    private final String hotIndex;
    private final String introduce;
    private final String marketCap;
    private final String name;
    private final String ratioBuy;
    private final String ratioSell;
    private final String upNum;
    private final String volatility;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ConceptCoinResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConceptChainResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.volatility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConceptCoinResponseBean> component13() {
        return this.coinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changePer24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.upNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.downNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.holdTimeAvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConceptChainResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull ArrayList<ConceptCoinResponseBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new ConceptChainResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConceptChainResponseBean)) {
            return false;
        }
        ConceptChainResponseBean conceptChainResponseBean = (ConceptChainResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) conceptChainResponseBean.code) && Intrinsics.EZpvd((Object) this.introduce, (Object) conceptChainResponseBean.introduce) && Intrinsics.EZpvd((Object) this.changePer24h, (Object) conceptChainResponseBean.changePer24h) && Intrinsics.EZpvd((Object) this.upNum, (Object) conceptChainResponseBean.upNum) && Intrinsics.EZpvd((Object) this.downNum, (Object) conceptChainResponseBean.downNum) && Intrinsics.EZpvd((Object) this.hotIndex, (Object) conceptChainResponseBean.hotIndex) && Intrinsics.EZpvd((Object) this.name, (Object) conceptChainResponseBean.name) && Intrinsics.EZpvd((Object) this.marketCap, (Object) conceptChainResponseBean.marketCap) && Intrinsics.EZpvd((Object) this.holdTimeAvg, (Object) conceptChainResponseBean.holdTimeAvg) && Intrinsics.EZpvd((Object) this.volatility, (Object) conceptChainResponseBean.volatility) && Intrinsics.EZpvd((Object) this.ratioBuy, (Object) conceptChainResponseBean.ratioBuy) && Intrinsics.EZpvd((Object) this.ratioSell, (Object) conceptChainResponseBean.ratioSell) && Intrinsics.EZpvd(this.coinList, conceptChainResponseBean.coinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePer24h() {
        return this.changePer24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConceptCoinResponseBean> getCoinList() {
        return this.coinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDownNum() {
        return this.downNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldTimeAvg() {
        return this.holdTimeAvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotIndex() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioBuy() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioSell() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpNum() {
        return this.upNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolatility() {
        return this.volatility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.code.hashCode() * 31) + this.introduce.hashCode()) * 31) + this.changePer24h.hashCode()) * 31) + this.upNum.hashCode()) * 31) + this.downNum.hashCode()) * 31) + this.hotIndex.hashCode()) * 31) + this.name.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.holdTimeAvg.hashCode()) * 31) + this.volatility.hashCode()) * 31) + this.ratioBuy.hashCode()) * 31) + this.ratioSell.hashCode()) * 31) + this.coinList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConceptChainResponseBean(code=" + this.code + ", introduce=" + this.introduce + ", changePer24h=" + this.changePer24h + ", upNum=" + this.upNum + ", downNum=" + this.downNum + ", hotIndex=" + this.hotIndex + ", name=" + this.name + ", marketCap=" + this.marketCap + ", holdTimeAvg=" + this.holdTimeAvg + ", volatility=" + this.volatility + ", ratioBuy=" + this.ratioBuy + ", ratioSell=" + this.ratioSell + ", coinList=" + this.coinList + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ConceptChainResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConceptChainResponseBean> serializer() {
            return ConceptChainResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConceptChainResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.introduce = "";
        } else {
            this.introduce = str2;
        }
        if ((i & 4) == 0) {
            this.changePer24h = "";
        } else {
            this.changePer24h = str3;
        }
        if ((i & 8) == 0) {
            this.upNum = "";
        } else {
            this.upNum = str4;
        }
        if ((i & 16) == 0) {
            this.downNum = "";
        } else {
            this.downNum = str5;
        }
        if ((i & 32) == 0) {
            this.hotIndex = "";
        } else {
            this.hotIndex = str6;
        }
        if ((i & 64) == 0) {
            this.name = "";
        } else {
            this.name = str7;
        }
        if ((i & 128) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str8;
        }
        if ((i & 256) == 0) {
            this.holdTimeAvg = "";
        } else {
            this.holdTimeAvg = str9;
        }
        if ((i & 512) == 0) {
            this.volatility = "";
        } else {
            this.volatility = str10;
        }
        if ((i & 1024) == 0) {
            this.ratioBuy = "";
        } else {
            this.ratioBuy = str11;
        }
        if ((i & 2048) == 0) {
            this.ratioSell = "";
        } else {
            this.ratioSell = str12;
        }
        this.coinList = (i & 4096) == 0 ? new ArrayList() : arrayList;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ConceptChainResponseBean conceptChainResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, conceptChainResponseBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.introduce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, conceptChainResponseBean.introduce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.changePer24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, conceptChainResponseBean.changePer24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.upNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, conceptChainResponseBean.upNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.downNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, conceptChainResponseBean.downNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.hotIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, conceptChainResponseBean.hotIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, conceptChainResponseBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, conceptChainResponseBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.holdTimeAvg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, conceptChainResponseBean.holdTimeAvg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.volatility, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, conceptChainResponseBean.volatility);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.ratioBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, conceptChainResponseBean.ratioBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) conceptChainResponseBean.ratioSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, conceptChainResponseBean.ratioSell);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(conceptChainResponseBean.coinList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], conceptChainResponseBean.coinList);
    }

    public ConceptChainResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull ArrayList<ConceptCoinResponseBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.code = str;
        this.introduce = str2;
        this.changePer24h = str3;
        this.upNum = str4;
        this.downNum = str5;
        this.hotIndex = str6;
        this.name = str7;
        this.marketCap = str8;
        this.holdTimeAvg = str9;
        this.volatility = str10;
        this.ratioBuy = str11;
        this.ratioSell = str12;
        this.coinList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0089: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:21) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r27v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.ConceptCoinResponseBean>):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.ConceptChainResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ ConceptChainResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "", (i & 4096) != 0 ? new ArrayList() : arrayList);
    }
}
