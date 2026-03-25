package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class OpenInterestData {
    private String instId;
    private String instType;
    private String oi;
    private String oiCcy;
    private String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OpenInterestData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OpenInterestData copy$default(OpenInterestData openInterestData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openInterestData.instType;
        }
        if ((i & 2) != 0) {
            str2 = openInterestData.instId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = openInterestData.oi;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = openInterestData.oiCcy;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = openInterestData.ts;
        }
        return openInterestData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.oi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.oiCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OpenInterestData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OpenInterestData(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenInterestData)) {
            return false;
        }
        OpenInterestData openInterestData = (OpenInterestData) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) openInterestData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) openInterestData.instId) && Intrinsics.EZpvd((Object) this.oi, (Object) openInterestData.oi) && Intrinsics.EZpvd((Object) this.oiCcy, (Object) openInterestData.oiCcy) && Intrinsics.EZpvd((Object) this.ts, (Object) openInterestData.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOi() {
        return this.oi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOiCcy() {
        return this.oiCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.instType.hashCode() * 31) + this.instId.hashCode()) * 31) + this.oi.hashCode()) * 31) + this.oiCcy.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.oi = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOiCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.oiCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OpenInterestData(instType=" + this.instType + ", instId=" + this.instId + ", oi=" + this.oi + ", oiCcy=" + this.oiCcy + ", ts=" + this.ts + ")";
    }

    public /* synthetic */ OpenInterestData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.oi = "";
        } else {
            this.oi = str3;
        }
        if ((i & 8) == 0) {
            this.oiCcy = "";
        } else {
            this.oiCcy = str4;
        }
        if ((i & 16) == 0) {
            this.ts = "";
        } else {
            this.ts = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OpenInterestData openInterestData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) openInterestData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, openInterestData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) openInterestData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, openInterestData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) openInterestData.oi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, openInterestData.oi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) openInterestData.oiCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, openInterestData.oiCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) openInterestData.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, openInterestData.ts);
    }

    public OpenInterestData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.instType = str;
        this.instId = str2;
        this.oi = str3;
        this.oiCcy = str4;
        this.ts = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.unify_trade.biz.subscribe.OpenInterestData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OpenInterestData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public static final class Companion {

        public static final class Activity extends TypeToken<ArrayList<ArrayList<Object>>> {
        }

        public static final class StateListAnimator extends TypeToken<ArrayList<OpenInterestData>> {
        }

        public static final class TaskDescription extends TypeToken<List<? extends OpenInterestData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.OpenInterestData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OpenInterestData> serializer() {
            return OpenInterestData$$serializer.INSTANCE;
        }

        public final OpenInterestData copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new TaskDescription().getType());
                if (list != null && !list.isEmpty()) {
                    return (OpenInterestData) list.get(0);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "OpenInterestData-jsonConvert" + e.getMessage());
            }
            return null;
        }

        public final List<OpenInterestData> EZpvd(@NotNull String str) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                ArrayList arrayList2 = (ArrayList) new Gson().fromJson(str, new Activity().getType());
                if (arrayList2.isEmpty() || (arrayList = (ArrayList) new Gson().fromJson(new Gson().toJson(arrayList2.get(0)), new StateListAnimator().getType())) == null) {
                    return null;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "OpenInterestData-jsonConvertList" + e.getMessage());
                return null;
            }
        }
    }
}
