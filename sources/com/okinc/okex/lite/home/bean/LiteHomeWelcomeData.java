package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LiteHomeWelcomeData {

    @SerializedName("activeStep")
    private final int activeStep;

    @SerializedName("button")
    private final OnboardingButtonInfo button;

    @SerializedName("iconDark")
    private final String iconDark;

    @SerializedName("iconLight")
    private final String iconLight;

    @SerializedName("steps")
    private final List<WelcomeStepInfo> steps;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(WelcomeStepInfo$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okex.lite.home.bean.LiteHomeWelcomeData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiteHomeWelcomeData copy$default(LiteHomeWelcomeData liteHomeWelcomeData, String str, String str2, String str3, String str4, List list, int i, OnboardingButtonInfo onboardingButtonInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liteHomeWelcomeData.title;
        }
        if ((i2 & 2) != 0) {
            str2 = liteHomeWelcomeData.subtitle;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = liteHomeWelcomeData.iconDark;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = liteHomeWelcomeData.iconLight;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            list = liteHomeWelcomeData.steps;
        }
        List list2 = list;
        if ((i2 & 32) != 0) {
            i = liteHomeWelcomeData.activeStep;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            onboardingButtonInfo = liteHomeWelcomeData.button;
        }
        return liteHomeWelcomeData.OLrzqt(str, str5, str6, str7, list2, i3, onboardingButtonInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.iconLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WelcomeStepInfo> AYXKKw() {
        return this.steps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.activeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteHomeWelcomeData OLrzqt(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, List<WelcomeStepInfo> list, int i, @NotNull OnboardingButtonInfo onboardingButtonInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(onboardingButtonInfo, "");
        return new LiteHomeWelcomeData(str, str2, str3, str4, list, i, onboardingButtonInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnboardingButtonInfo copydefault() {
        return this.button;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiteHomeWelcomeData)) {
            return false;
        }
        LiteHomeWelcomeData liteHomeWelcomeData = (LiteHomeWelcomeData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) liteHomeWelcomeData.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) liteHomeWelcomeData.subtitle) && Intrinsics.EZpvd((Object) this.iconDark, (Object) liteHomeWelcomeData.iconDark) && Intrinsics.EZpvd((Object) this.iconLight, (Object) liteHomeWelcomeData.iconLight) && Intrinsics.EZpvd(this.steps, liteHomeWelcomeData.steps) && this.activeStep == liteHomeWelcomeData.activeStep && Intrinsics.EZpvd(this.button, liteHomeWelcomeData.button);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        String str = this.subtitle;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.iconDark.hashCode();
        int iHashCode4 = this.iconLight.hashCode();
        List<WelcomeStepInfo> list = this.steps;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.activeStep)) * 31) + this.button.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiteHomeWelcomeData(title=" + this.title + ", subtitle=" + this.subtitle + ", iconDark=" + this.iconDark + ", iconLight=" + this.iconLight + ", steps=" + this.steps + ", activeStep=" + this.activeStep + ", button=" + this.button + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.LiteHomeWelcomeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiteHomeWelcomeData> serializer() {
            return LiteHomeWelcomeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiteHomeWelcomeData(int i, String str, String str2, String str3, String str4, List list, int i2, OnboardingButtonInfo onboardingButtonInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (111 != (i & WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY)) {
            PluginExceptionsKt.throwMissingFieldException(i, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, LiteHomeWelcomeData$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.iconDark = str3;
        this.iconLight = str4;
        if ((i & 16) == 0) {
            this.steps = yDY.AhwBna();
        } else {
            this.steps = list;
        }
        this.activeStep = i2;
        this.button = onboardingButtonInfo;
    }

    public static final /* synthetic */ void EZpvd(LiteHomeWelcomeData liteHomeWelcomeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, liteHomeWelcomeData.title);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, liteHomeWelcomeData.subtitle);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, liteHomeWelcomeData.iconDark);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, liteHomeWelcomeData.iconLight);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(liteHomeWelcomeData.steps, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], liteHomeWelcomeData.steps);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, liteHomeWelcomeData.activeStep);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, OnboardingButtonInfo$$serializer.INSTANCE, liteHomeWelcomeData.button);
    }

    public LiteHomeWelcomeData(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, List<WelcomeStepInfo> list, int i, @NotNull OnboardingButtonInfo onboardingButtonInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(onboardingButtonInfo, "");
        this.title = str;
        this.subtitle = str2;
        this.iconDark = str3;
        this.iconLight = str4;
        this.steps = list;
        this.activeStep = i;
        this.button = onboardingButtonInfo;
    }
}
