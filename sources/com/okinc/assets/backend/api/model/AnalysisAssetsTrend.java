package com.okinc.assets.backend.api.model;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class AnalysisAssetsTrend {
    public final String btcPnl;
    public final int theme;
    public final List<List<String>> trend;
    public final String usdtRate;
    public final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE)), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnalysisAssetsTrend() {
        this((String) null, 0, (List) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.assets.backend.api.model.AnalysisAssetsTrend */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalysisAssetsTrend copy$default(AnalysisAssetsTrend analysisAssetsTrend, String str, int i, List list, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = analysisAssetsTrend.btcPnl;
        }
        if ((i2 & 2) != 0) {
            i = analysisAssetsTrend.theme;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = analysisAssetsTrend.trend;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            str2 = analysisAssetsTrend.value;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = analysisAssetsTrend.usdtRate;
        }
        return analysisAssetsTrend.OLrzqt(str, i3, list2, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnalysisAssetsTrend OLrzqt(String str, int i, @NotNull List<? extends List<String>> list, String str2, String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AnalysisAssetsTrend(str, i, list, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalysisAssetsTrend)) {
            return false;
        }
        AnalysisAssetsTrend analysisAssetsTrend = (AnalysisAssetsTrend) obj;
        return Intrinsics.EZpvd((Object) this.btcPnl, (Object) analysisAssetsTrend.btcPnl) && this.theme == analysisAssetsTrend.theme && Intrinsics.EZpvd(this.trend, analysisAssetsTrend.trend) && Intrinsics.EZpvd((Object) this.value, (Object) analysisAssetsTrend.value) && Intrinsics.EZpvd((Object) this.usdtRate, (Object) analysisAssetsTrend.usdtRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.btcPnl;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Integer.hashCode(this.theme);
        int iHashCode3 = this.trend.hashCode();
        String str2 = this.value;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.usdtRate;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AnalysisAssetsTrend(btcPnl=" + this.btcPnl + ", theme=" + this.theme + ", trend=" + this.trend + ", value=" + this.value + ", usdtRate=" + this.usdtRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.AnalysisAssetsTrend.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnalysisAssetsTrend> serializer() {
            return AnalysisAssetsTrend$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnalysisAssetsTrend(int i, String str, int i2, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.btcPnl = "";
        } else {
            this.btcPnl = str;
        }
        if ((i & 2) == 0) {
            this.theme = 0;
        } else {
            this.theme = i2;
        }
        if ((i & 4) == 0) {
            this.trend = yDY.AhwBna();
        } else {
            this.trend = list;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str2;
        }
        if ((i & 16) == 0) {
            this.usdtRate = "";
        } else {
            this.usdtRate = str3;
        }
    }

    public static final /* synthetic */ void copydefault(AnalysisAssetsTrend analysisAssetsTrend, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) analysisAssetsTrend.btcPnl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, analysisAssetsTrend.btcPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || analysisAssetsTrend.theme != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, analysisAssetsTrend.theme);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(analysisAssetsTrend.trend, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], analysisAssetsTrend.trend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) analysisAssetsTrend.value, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, analysisAssetsTrend.value);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) analysisAssetsTrend.usdtRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, analysisAssetsTrend.usdtRate);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public AnalysisAssetsTrend(String str, int i, @NotNull List<? extends List<String>> list, String str2, String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.btcPnl = str;
        this.theme = i;
        this.trend = list;
        this.value = str2;
        this.usdtRate = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:int:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.util.List:0x0017: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0013: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, int, java.util.List<? extends java.util.List<java.lang.String>>, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.AnalysisAssetsTrend.<init>(java.lang.String, int, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AnalysisAssetsTrend(String str, int i, List list, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? yDY.AhwBna() : list, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3);
    }
}
