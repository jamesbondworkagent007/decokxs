package com.okinc.business.trade.features.home.ui.autosell.data;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TPSLConfigItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final double changeScale;
    private final int id;
    private final String ruleDesc;
    private final String ruleName;
    private final double sellScale;
    private final int sellType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TPSLConfigItem() {
        this(0, (String) null, (String) null, 0, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 63, (DefaultConstructorMarker) null);
    }

    @SerialName("changeScale")
    public static /* synthetic */ void getChangeScale$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("ruleDesc")
    public static /* synthetic */ void getRuleDesc$annotations() {
    }

    @SerialName("ruleName")
    public static /* synthetic */ void getRuleName$annotations() {
    }

    @SerialName("sellScale")
    public static /* synthetic */ void getSellScale$annotations() {
    }

    @SerialName("sellType")
    public static /* synthetic */ void getSellType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ruleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ruleDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.sellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component5() {
        return this.changeScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component6() {
        return this.sellScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TPSLConfigItem copy(int i, @NotNull String str, @NotNull String str2, int i2, double d, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TPSLConfigItem(i, str, str2, i2, d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TPSLConfigItem)) {
            return false;
        }
        TPSLConfigItem tPSLConfigItem = (TPSLConfigItem) obj;
        return this.id == tPSLConfigItem.id && Intrinsics.EZpvd((Object) this.ruleName, (Object) tPSLConfigItem.ruleName) && Intrinsics.EZpvd((Object) this.ruleDesc, (Object) tPSLConfigItem.ruleDesc) && this.sellType == tPSLConfigItem.sellType && Double.compare(this.changeScale, tPSLConfigItem.changeScale) == 0 && Double.compare(this.sellScale, tPSLConfigItem.sellScale) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getChangeScale() {
        return this.changeScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleDesc() {
        return this.ruleDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleName() {
        return this.ruleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getSellScale() {
        return this.sellScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSellType() {
        return this.sellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.ruleName.hashCode()) * 31) + this.ruleDesc.hashCode()) * 31) + Integer.hashCode(this.sellType)) * 31) + Double.hashCode(this.changeScale)) * 31) + Double.hashCode(this.sellScale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TPSLConfigItem(id=" + this.id + ", ruleName=" + this.ruleName + ", ruleDesc=" + this.ruleDesc + ", sellType=" + this.sellType + ", changeScale=" + this.changeScale + ", sellScale=" + this.sellScale + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.autosell.data.TPSLConfigItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TPSLConfigItem> serializer() {
            return TPSLConfigItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TPSLConfigItem(int i, int i2, String str, String str2, int i3, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.ruleName = "";
        } else {
            this.ruleName = str;
        }
        if ((i & 4) == 0) {
            this.ruleDesc = "";
        } else {
            this.ruleDesc = str2;
        }
        if ((i & 8) == 0) {
            this.sellType = 1;
        } else {
            this.sellType = i3;
        }
        if ((i & 16) == 0) {
            this.changeScale = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.changeScale = d;
        }
        if ((i & 32) == 0) {
            this.sellScale = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.sellScale = d2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TPSLConfigItem tPSLConfigItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tPSLConfigItem.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, tPSLConfigItem.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tPSLConfigItem.ruleName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tPSLConfigItem.ruleName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tPSLConfigItem.ruleDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tPSLConfigItem.ruleDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tPSLConfigItem.sellType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, tPSLConfigItem.sellType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || Double.compare(tPSLConfigItem.changeScale, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 4, tPSLConfigItem.changeScale);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Double.compare(tPSLConfigItem.sellScale, AudioStats.AUDIO_AMPLITUDE_NONE) == 0) {
            return;
        }
        compositeEncoder.encodeDoubleElement(serialDescriptor, 5, tPSLConfigItem.sellScale);
    }

    public TPSLConfigItem(int i, @NotNull String str, @NotNull String str2, int i2, double d, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = i;
        this.ruleName = str;
        this.ruleDesc = str2;
        this.sellType = i2;
        this.changeScale = d;
        this.sellScale = d2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r13v0 int))
  (wrap:double:?: TERNARY null = ((wrap:int:0x001d: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r14v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r16v0 double) : (wrap:double:0x001f: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
 A[MD:(int, java.lang.String, java.lang.String, int, double, double):void (m)] (LINE:20) call: com.okinc.business.trade.features.home.ui.autosell.data.TPSLConfigItem.<init>(int, java.lang.String, java.lang.String, int, double, double):void type: THIS */
    public /* synthetic */ TPSLConfigItem(int i, String str, String str2, int i2, double d, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? 1 : i2, (i3 & 16) != 0 ? 0.0d : d, (i3 & 32) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE);
    }
}
