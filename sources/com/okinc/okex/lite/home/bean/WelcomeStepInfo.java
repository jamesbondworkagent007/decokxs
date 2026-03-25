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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class WelcomeStepInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("stepName")
    private final String stepName;

    @SerializedName("stepText")
    private final String stepText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WelcomeStepInfo copy$default(WelcomeStepInfo welcomeStepInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = welcomeStepInfo.stepName;
        }
        if ((i & 2) != 0) {
            str2 = welcomeStepInfo.stepText;
        }
        return welcomeStepInfo.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.stepText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WelcomeStepInfo OLrzqt(String str, String str2) {
        return new WelcomeStepInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.stepName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WelcomeStepInfo)) {
            return false;
        }
        WelcomeStepInfo welcomeStepInfo = (WelcomeStepInfo) obj;
        return Intrinsics.EZpvd((Object) this.stepName, (Object) welcomeStepInfo.stepName) && Intrinsics.EZpvd((Object) this.stepText, (Object) welcomeStepInfo.stepText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.stepName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.stepText;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WelcomeStepInfo(stepName=" + this.stepName + ", stepText=" + this.stepText + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.WelcomeStepInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WelcomeStepInfo> serializer() {
            return WelcomeStepInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WelcomeStepInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, WelcomeStepInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.stepName = str;
        this.stepText = str2;
    }

    public static final /* synthetic */ void copydefault(WelcomeStepInfo welcomeStepInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, welcomeStepInfo.stepName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, welcomeStepInfo.stepText);
    }

    public WelcomeStepInfo(String str, String str2) {
        this.stepName = str;
        this.stepText = str2;
    }
}
