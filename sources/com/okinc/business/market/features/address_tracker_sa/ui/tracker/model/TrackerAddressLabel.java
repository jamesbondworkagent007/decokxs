package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerAddressLabel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String label;
    public final String labelName;
    public final int labelNum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrackerAddressLabel copy$default(TrackerAddressLabel trackerAddressLabel, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = trackerAddressLabel.label;
        }
        if ((i2 & 2) != 0) {
            i = trackerAddressLabel.labelNum;
        }
        if ((i2 & 4) != 0) {
            str2 = trackerAddressLabel.labelName;
        }
        return trackerAddressLabel.EZpvd(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerAddressLabel EZpvd(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TrackerAddressLabel(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.labelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.labelNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerAddressLabel)) {
            return false;
        }
        TrackerAddressLabel trackerAddressLabel = (TrackerAddressLabel) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) trackerAddressLabel.label) && this.labelNum == trackerAddressLabel.labelNum && Intrinsics.EZpvd((Object) this.labelName, (Object) trackerAddressLabel.labelName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.label.hashCode() * 31) + Integer.hashCode(this.labelNum)) * 31) + this.labelName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerAddressLabel(label=" + this.label + ", labelNum=" + this.labelNum + ", labelName=" + this.labelName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressLabel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerAddressLabel> serializer() {
            return TrackerAddressLabel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerAddressLabel(int i, String str, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TrackerAddressLabel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.labelNum = i2;
        this.labelName = str2;
    }

    public static final /* synthetic */ void AEQbTJ(TrackerAddressLabel trackerAddressLabel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, trackerAddressLabel.label);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, trackerAddressLabel.labelNum);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, trackerAddressLabel.labelName);
    }

    public TrackerAddressLabel(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.label = str;
        this.labelNum = i;
        this.labelName = str2;
    }
}
