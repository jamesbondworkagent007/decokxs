package com.okinc.cruilib.model.tokenpair;

import androidx.camera.video.AudioStats;
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
public final class OKCRTokenPairItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String coinName;
    public final String icon;
    public final String instId;
    public final String upDownPercentDisplay;
    public final double upDownPercentValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKCRTokenPairItem() {
        this((String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKCRTokenPairItem copy$default(OKCRTokenPairItem oKCRTokenPairItem, String str, double d, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oKCRTokenPairItem.instId;
        }
        if ((i & 2) != 0) {
            d = oKCRTokenPairItem.upDownPercentValue;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str2 = oKCRTokenPairItem.upDownPercentDisplay;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = oKCRTokenPairItem.coinName;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = oKCRTokenPairItem.icon;
        }
        return oKCRTokenPairItem.KWHzl(str, d2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCRTokenPairItem KWHzl(@NotNull String str, double d, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new OKCRTokenPairItem(str, d, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKCRTokenPairItem(instId=" + this.instId + ", upDownPercentValue=" + this.upDownPercentValue + ", upDownPercentDisplay=" + this.upDownPercentDisplay + ", coinName=" + this.coinName + ", icon=" + this.icon + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.tokenpair.OKCRTokenPairItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKCRTokenPairItem> serializer() {
            return OKCRTokenPairItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKCRTokenPairItem(int i, String str, double d, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.upDownPercentValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.upDownPercentValue = d;
        }
        if ((i & 4) == 0) {
            this.upDownPercentDisplay = "";
        } else {
            this.upDownPercentDisplay = str2;
        }
        if ((i & 8) == 0) {
            this.coinName = "";
        } else {
            this.coinName = str3;
        }
        if ((i & 16) == 0) {
            this.icon = "";
        } else {
            this.icon = str4;
        }
    }

    public static final /* synthetic */ void KWHzl(OKCRTokenPairItem oKCRTokenPairItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oKCRTokenPairItem.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, oKCRTokenPairItem.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || Double.compare(oKCRTokenPairItem.upDownPercentValue, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 1, oKCRTokenPairItem.upDownPercentValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) oKCRTokenPairItem.upDownPercentDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, oKCRTokenPairItem.upDownPercentDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) oKCRTokenPairItem.coinName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, oKCRTokenPairItem.coinName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) oKCRTokenPairItem.icon, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, oKCRTokenPairItem.icon);
    }

    public OKCRTokenPairItem(@NotNull String str, double d, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.instId = str;
        this.upDownPercentValue = d;
        this.upDownPercentDisplay = str2;
        this.coinName = str3;
        this.icon = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:double:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x000d: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r7v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, double, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.cruilib.model.tokenpair.OKCRTokenPairItem.<init>(java.lang.String, double, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OKCRTokenPairItem(String str, double d, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKCRTokenPairItem)) {
            return false;
        }
        OKCRTokenPairItem oKCRTokenPairItem = (OKCRTokenPairItem) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) oKCRTokenPairItem.instId) && this.upDownPercentValue == oKCRTokenPairItem.upDownPercentValue;
    }

    public int hashCode() {
        return (this.instId.hashCode() * 31) + Double.hashCode(this.upDownPercentValue);
    }
}
