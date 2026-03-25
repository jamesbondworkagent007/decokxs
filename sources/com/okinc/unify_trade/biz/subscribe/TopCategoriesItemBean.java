package com.okinc.unify_trade.biz.subscribe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TopCategoriesItemBean {
    private String avgPctChg;
    private String avgPctChgUtc0;
    private String avgPctChgUtc8;
    private String category;
    private String maxCcy;
    private String maxCcyUtc0;
    private String maxCcyUtc8;
    private String maxPctChg;
    private String maxPctChgUtc0;
    private String maxPctChgUtc8;
    private String msg;
    private String msgCn;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopCategoriesItemBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.avgPctChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.msgCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxPctChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.avgPctChgUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxPctChgUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxCcyUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.avgPctChgUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxPctChgUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxCcyUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopCategoriesItemBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        return new TopCategoriesItemBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopCategoriesItemBean)) {
            return false;
        }
        TopCategoriesItemBean topCategoriesItemBean = (TopCategoriesItemBean) obj;
        return Intrinsics.EZpvd((Object) this.avgPctChg, (Object) topCategoriesItemBean.avgPctChg) && Intrinsics.EZpvd((Object) this.maxPctChg, (Object) topCategoriesItemBean.maxPctChg) && Intrinsics.EZpvd((Object) this.maxCcy, (Object) topCategoriesItemBean.maxCcy) && Intrinsics.EZpvd((Object) this.avgPctChgUtc0, (Object) topCategoriesItemBean.avgPctChgUtc0) && Intrinsics.EZpvd((Object) this.maxPctChgUtc0, (Object) topCategoriesItemBean.maxPctChgUtc0) && Intrinsics.EZpvd((Object) this.maxCcyUtc0, (Object) topCategoriesItemBean.maxCcyUtc0) && Intrinsics.EZpvd((Object) this.avgPctChgUtc8, (Object) topCategoriesItemBean.avgPctChgUtc8) && Intrinsics.EZpvd((Object) this.maxPctChgUtc8, (Object) topCategoriesItemBean.maxPctChgUtc8) && Intrinsics.EZpvd((Object) this.maxCcyUtc8, (Object) topCategoriesItemBean.maxCcyUtc8) && Intrinsics.EZpvd((Object) this.msg, (Object) topCategoriesItemBean.msg) && Intrinsics.EZpvd((Object) this.msgCn, (Object) topCategoriesItemBean.msgCn) && Intrinsics.EZpvd((Object) this.category, (Object) topCategoriesItemBean.category);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPctChg() {
        return this.avgPctChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPctChgUtc0() {
        return this.avgPctChgUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPctChgUtc8() {
        return this.avgPctChgUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCcy() {
        return this.maxCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCcyUtc0() {
        return this.maxCcyUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCcyUtc8() {
        return this.maxCcyUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPctChg() {
        return this.maxPctChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPctChgUtc0() {
        return this.maxPctChgUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPctChgUtc8() {
        return this.maxPctChgUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgCn() {
        return this.msgCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.avgPctChg.hashCode() * 31) + this.maxPctChg.hashCode()) * 31) + this.maxCcy.hashCode()) * 31) + this.avgPctChgUtc0.hashCode()) * 31) + this.maxPctChgUtc0.hashCode()) * 31) + this.maxCcyUtc0.hashCode()) * 31) + this.avgPctChgUtc8.hashCode()) * 31) + this.maxPctChgUtc8.hashCode()) * 31) + this.maxCcyUtc8.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.msgCn.hashCode()) * 31) + this.category.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPctChg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPctChg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPctChgUtc0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPctChgUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPctChgUtc8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPctChgUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCcyUtc0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxCcyUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCcyUtc8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxCcyUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPctChg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPctChg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPctChgUtc0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPctChgUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPctChgUtc8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPctChgUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgCn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msgCn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopCategoriesItemBean(avgPctChg=" + this.avgPctChg + ", maxPctChg=" + this.maxPctChg + ", maxCcy=" + this.maxCcy + ", avgPctChgUtc0=" + this.avgPctChgUtc0 + ", maxPctChgUtc0=" + this.maxPctChgUtc0 + ", maxCcyUtc0=" + this.maxCcyUtc0 + ", avgPctChgUtc8=" + this.avgPctChgUtc8 + ", maxPctChgUtc8=" + this.maxPctChgUtc8 + ", maxCcyUtc8=" + this.maxCcyUtc8 + ", msg=" + this.msg + ", msgCn=" + this.msgCn + ", category=" + this.category + ")";
    }

    public /* synthetic */ TopCategoriesItemBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        this.avgPctChg = (i & 1) == 0 ? "0.123" : str;
        if ((i & 2) == 0) {
            this.maxPctChg = "0.2345";
        } else {
            this.maxPctChg = str2;
        }
        if ((i & 4) == 0) {
            this.maxCcy = "";
        } else {
            this.maxCcy = str3;
        }
        if ((i & 8) == 0) {
            this.avgPctChgUtc0 = "";
        } else {
            this.avgPctChgUtc0 = str4;
        }
        if ((i & 16) == 0) {
            this.maxPctChgUtc0 = "";
        } else {
            this.maxPctChgUtc0 = str5;
        }
        if ((i & 32) == 0) {
            this.maxCcyUtc0 = "";
        } else {
            this.maxCcyUtc0 = str6;
        }
        if ((i & 64) == 0) {
            this.avgPctChgUtc8 = "";
        } else {
            this.avgPctChgUtc8 = str7;
        }
        if ((i & 128) == 0) {
            this.maxPctChgUtc8 = "";
        } else {
            this.maxPctChgUtc8 = str8;
        }
        if ((i & 256) == 0) {
            this.maxCcyUtc8 = "";
        } else {
            this.maxCcyUtc8 = str9;
        }
        if ((i & 512) == 0) {
            this.msg = "";
        } else {
            this.msg = str10;
        }
        if ((i & 1024) == 0) {
            this.msgCn = "";
        } else {
            this.msgCn = str11;
        }
        if ((i & 2048) == 0) {
            this.category = "";
        } else {
            this.category = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TopCategoriesItemBean topCategoriesItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.avgPctChg, (Object) "0.123")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, topCategoriesItemBean.avgPctChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.maxPctChg, (Object) "0.2345")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, topCategoriesItemBean.maxPctChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.maxCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, topCategoriesItemBean.maxCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.avgPctChgUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, topCategoriesItemBean.avgPctChgUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.maxPctChgUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, topCategoriesItemBean.maxPctChgUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.maxCcyUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, topCategoriesItemBean.maxCcyUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.avgPctChgUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, topCategoriesItemBean.avgPctChgUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.maxPctChgUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, topCategoriesItemBean.maxPctChgUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.maxCcyUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, topCategoriesItemBean.maxCcyUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, topCategoriesItemBean.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) topCategoriesItemBean.msgCn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, topCategoriesItemBean.msgCn);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) topCategoriesItemBean.category, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, topCategoriesItemBean.category);
    }

    public TopCategoriesItemBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        this.avgPctChg = str;
        this.maxPctChg = str2;
        this.maxCcy = str3;
        this.avgPctChgUtc0 = str4;
        this.maxPctChgUtc0 = str5;
        this.maxCcyUtc0 = str6;
        this.avgPctChgUtc8 = str7;
        this.maxPctChgUtc8 = str8;
        this.maxCcyUtc8 = str9;
        this.msg = str10;
        this.msgCn = str11;
        this.category = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0.123") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0.2345") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.unify_trade.biz.subscribe.TopCategoriesItemBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TopCategoriesItemBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0.123" : str, (i & 2) != 0 ? "0.2345" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TopCategoriesItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TopCategoriesItemBean> serializer() {
            return TopCategoriesItemBean$$serializer.INSTANCE;
        }
    }
}
