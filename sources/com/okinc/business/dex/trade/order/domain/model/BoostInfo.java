package com.okinc.business.dex.trade.order.domain.model;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class BoostInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String boostVolume;
    private final Double weighted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BoostInfo() {
        this((String) null, (Double) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BoostInfo copy$default(BoostInfo boostInfo, String str, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boostInfo.boostVolume;
        }
        if ((i & 2) != 0) {
            d = boostInfo.weighted;
        }
        return boostInfo.copy(str, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component2() {
        return this.weighted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostInfo copy(@NotNull String str, Double d) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BoostInfo(str, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostInfo)) {
            return false;
        }
        BoostInfo boostInfo = (BoostInfo) obj;
        return Intrinsics.EZpvd((Object) this.boostVolume, (Object) boostInfo.boostVolume) && Intrinsics.EZpvd(this.weighted, boostInfo.weighted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoostVolume() {
        return this.boostVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getWeighted() {
        return this.weighted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.boostVolume.hashCode();
        Double d = this.weighted;
        return (iHashCode * 31) + (d == null ? 0 : d.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BoostInfo(boostVolume=" + this.boostVolume + ", weighted=" + this.weighted + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.BoostInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BoostInfo> serializer() {
            return BoostInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BoostInfo(int i, String str, Double d, SerializationConstructorMarker serializationConstructorMarker) {
        this.boostVolume = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.weighted = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        } else {
            this.weighted = d;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(BoostInfo boostInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) boostInfo.boostVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, boostInfo.boostVolume);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(boostInfo.weighted, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.INSTANCE, boostInfo.weighted);
    }

    public BoostInfo(@NotNull String str, Double d) {
        Intrinsics.checkNotNullParameter(str, "");
        this.boostVolume = str;
        this.weighted = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Double:0x000c: INVOKE (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) STATIC call: java.lang.Double.valueOf(double):java.lang.Double A[MD:(double):java.lang.Double (c), WRAPPED] (LINE:271)) : (r2v0 java.lang.Double))
 A[MD:(java.lang.String, java.lang.Double):void (m)] (LINE:269) call: com.okinc.business.dex.trade.order.domain.model.BoostInfo.<init>(java.lang.String, java.lang.Double):void type: THIS */
    public /* synthetic */ BoostInfo(String str, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d);
    }
}
