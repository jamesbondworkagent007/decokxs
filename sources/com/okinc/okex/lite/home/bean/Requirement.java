package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class Requirement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("requirementAmount")
    private final double requirementAmount;

    @SerializedName("requirementCurrencyName")
    private final String requirementCurrencyName;

    @SerializedName("requirementType")
    private final int requirementType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Requirement copy$default(Requirement requirement, String str, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = requirement.requirementCurrencyName;
        }
        if ((i2 & 2) != 0) {
            d = requirement.requirementAmount;
        }
        if ((i2 & 4) != 0) {
            i = requirement.requirementType;
        }
        return requirement.EZpvd(str, d, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Requirement EZpvd(@NotNull String str, double d, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Requirement(str, d, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Requirement)) {
            return false;
        }
        Requirement requirement = (Requirement) obj;
        return Intrinsics.EZpvd((Object) this.requirementCurrencyName, (Object) requirement.requirementCurrencyName) && Double.compare(this.requirementAmount, requirement.requirementAmount) == 0 && this.requirementType == requirement.requirementType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.requirementCurrencyName.hashCode() * 31) + Double.hashCode(this.requirementAmount)) * 31) + Integer.hashCode(this.requirementType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Requirement(requirementCurrencyName=" + this.requirementCurrencyName + ", requirementAmount=" + this.requirementAmount + ", requirementType=" + this.requirementType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.Requirement.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Requirement> serializer() {
            return Requirement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Requirement(int i, String str, double d, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, Requirement$$serializer.INSTANCE.getDescriptor());
        }
        this.requirementCurrencyName = str;
        this.requirementAmount = d;
        this.requirementType = i2;
    }

    public static final /* synthetic */ void OLrzqt(Requirement requirement, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, requirement.requirementCurrencyName);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 1, requirement.requirementAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, requirement.requirementType);
    }

    public Requirement(@NotNull String str, double d, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requirementCurrencyName = str;
        this.requirementAmount = d;
        this.requirementType = i;
    }
}
