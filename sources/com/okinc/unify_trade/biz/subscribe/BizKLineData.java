package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.xVJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BizKLineData {
    private String c;
    private String h;
    private String l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f1045o;
    private String ts;
    private String vol;
    private String volCcy;
    private String volCcyQuote;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizKLineData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getC() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getH() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getO() {
        return this.f1045o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVol() {
        return this.vol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolCcy() {
        return this.volCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolCcyQuote() {
        return this.volCcyQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setC(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setH(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.l = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f1045o = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolCcyQuote(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volCcyQuote = str;
    }

    public /* synthetic */ BizKLineData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ts = "";
        } else {
            this.ts = str;
        }
        if ((i & 2) == 0) {
            this.f1045o = "";
        } else {
            this.f1045o = str2;
        }
        if ((i & 4) == 0) {
            this.h = "";
        } else {
            this.h = str3;
        }
        if ((i & 8) == 0) {
            this.l = "";
        } else {
            this.l = str4;
        }
        if ((i & 16) == 0) {
            this.c = "";
        } else {
            this.c = str5;
        }
        if ((i & 32) == 0) {
            this.vol = "";
        } else {
            this.vol = str6;
        }
        if ((i & 64) == 0) {
            this.volCcy = "";
        } else {
            this.volCcy = str7;
        }
        if ((i & 128) == 0) {
            this.volCcyQuote = "";
        } else {
            this.volCcyQuote = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizKLineData bizKLineData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bizKLineData.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bizKLineData.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bizKLineData.f1045o, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bizKLineData.f1045o);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bizKLineData.h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bizKLineData.h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bizKLineData.l, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bizKLineData.l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bizKLineData.c, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, bizKLineData.c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) bizKLineData.vol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, bizKLineData.vol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) bizKLineData.volCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, bizKLineData.volCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) bizKLineData.volCcyQuote, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, bizKLineData.volCcyQuote);
    }

    public BizKLineData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.ts = str;
        this.f1045o = str2;
        this.h = str3;
        this.l = str4;
        this.c = str5;
        this.vol = str6;
        this.volCcy = str7;
        this.volCcyQuote = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.unify_trade.biz.subscribe.BizKLineData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizKLineData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }

    public static final class Companion {

        public static final class Application extends TypeToken<List<? extends List<? extends String>>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.BizKLineData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BizKLineData> serializer() {
            return BizKLineData$$serializer.INSTANCE;
        }

        public final List<BizKLineData> KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new Application().getType();
            Intrinsics.copydefault(type);
            List<List> list = (List) xvj.OLrzqt(str, type, true);
            if (list == null || list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (List list2 : list) {
                if (!list2.isEmpty()) {
                    BizKLineData bizKLineData = new BizKLineData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        switch (i) {
                            case 0:
                                bizKLineData.setTs((String) list2.get(i));
                                break;
                            case 1:
                                bizKLineData.setO((String) list2.get(i));
                                break;
                            case 2:
                                bizKLineData.setH((String) list2.get(i));
                                break;
                            case 3:
                                bizKLineData.setL((String) list2.get(i));
                                break;
                            case 4:
                                bizKLineData.setC((String) list2.get(i));
                                break;
                            case 5:
                                bizKLineData.setVol((String) list2.get(i));
                                break;
                            case 6:
                                bizKLineData.setVolCcy((String) list2.get(i));
                                break;
                            case 7:
                                bizKLineData.setVolCcyQuote((String) list2.get(i));
                                break;
                        }
                    }
                    if ((!arrayList.isEmpty()) && Intrinsics.EZpvd((Object) ((BizKLineData) CollectionsKt___CollectionsKt.AubY(arrayList)).getTs(), (Object) bizKLineData.getTs())) {
                        arrayList.set(yDY.AuCTel(arrayList), bizKLineData);
                    } else {
                        arrayList.add(bizKLineData);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        public final BizKLineData EZpvd(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BizKLineData bizKLineData = new BizKLineData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                String str = (String) obj;
                switch (i) {
                    case 0:
                        bizKLineData.setTs(str);
                        break;
                    case 1:
                        bizKLineData.setO(str);
                        break;
                    case 2:
                        bizKLineData.setH(str);
                        break;
                    case 3:
                        bizKLineData.setL(str);
                        break;
                    case 4:
                        bizKLineData.setC(str);
                        break;
                    case 5:
                        bizKLineData.setVol(str);
                        break;
                    case 6:
                        bizKLineData.setVolCcy(str);
                        break;
                    case 7:
                        bizKLineData.setVolCcyQuote(str);
                        break;
                }
                i++;
            }
            return bizKLineData;
        }
    }
}
