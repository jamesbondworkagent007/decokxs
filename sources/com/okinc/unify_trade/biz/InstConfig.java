package com.okinc.unify_trade.biz;

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
public final class InstConfig implements java.io.Serializable {
    private String instId;
    private String leverHigh;
    private String leverLow;
    private String leverPercents;
    private String leverSuggested;
    private String leverSuggestedHig;
    private String leverSuggestedHigh;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverHigh() {
        return this.leverHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverLow() {
        return this.leverLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverPercents() {
        return this.leverPercents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverSuggested() {
        return this.leverSuggested;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverSuggestedHig() {
        return this.leverSuggestedHig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverSuggestedHigh() {
        return this.leverSuggestedHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverHigh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverHigh = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverLow(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverPercents(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverPercents = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverSuggested(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverSuggested = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverSuggestedHig(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverSuggestedHig = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverSuggestedHigh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverSuggestedHigh = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InstConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstConfig> serializer() {
            return InstConfig$$serializer.INSTANCE;
        }
    }

    public InstConfig() {
        this.instId = "";
        this.leverLow = "";
        this.leverHigh = "";
        this.leverSuggested = "";
        this.leverSuggestedHig = "";
        this.leverPercents = "";
        this.leverSuggestedHigh = "";
    }

    public /* synthetic */ InstConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.leverLow = "";
        } else {
            this.leverLow = str2;
        }
        if ((i & 4) == 0) {
            this.leverHigh = "";
        } else {
            this.leverHigh = str3;
        }
        if ((i & 8) == 0) {
            this.leverSuggested = "";
        } else {
            this.leverSuggested = str4;
        }
        if ((i & 16) == 0) {
            this.leverSuggestedHig = "";
        } else {
            this.leverSuggestedHig = str5;
        }
        if ((i & 32) == 0) {
            this.leverPercents = "";
        } else {
            this.leverPercents = str6;
        }
        if ((i & 64) == 0) {
            this.leverSuggestedHigh = "";
        } else {
            this.leverSuggestedHigh = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InstConfig instConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) instConfig.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, instConfig.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) instConfig.leverLow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, instConfig.leverLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) instConfig.leverHigh, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, instConfig.leverHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) instConfig.leverSuggested, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, instConfig.leverSuggested);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) instConfig.leverSuggestedHig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, instConfig.leverSuggestedHig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) instConfig.leverPercents, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, instConfig.leverPercents);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) instConfig.leverSuggestedHigh, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, instConfig.leverSuggestedHigh);
    }
}
