package com.okinc.tradingbot.impl.signalClone.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SignalCloneCreateLinkBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String algoId;
    public final String algoOrdType;
    public final String appMode;
    public final String appScheme;
    public final String copySource;
    public final String instId;
    public final String instType;
    public final int navOrder;
    public final String routeBiz;
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalCloneCreateLinkBody KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new SignalCloneCreateLinkBody(str, str2, str3, str4, str5, str6, str7, str8, str9, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalCloneCreateLinkBody)) {
            return false;
        }
        SignalCloneCreateLinkBody signalCloneCreateLinkBody = (SignalCloneCreateLinkBody) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) signalCloneCreateLinkBody.algoId) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) signalCloneCreateLinkBody.algoOrdType) && Intrinsics.EZpvd((Object) this.type, (Object) signalCloneCreateLinkBody.type) && Intrinsics.EZpvd((Object) this.instId, (Object) signalCloneCreateLinkBody.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) signalCloneCreateLinkBody.instType) && Intrinsics.EZpvd((Object) this.copySource, (Object) signalCloneCreateLinkBody.copySource) && Intrinsics.EZpvd((Object) this.appMode, (Object) signalCloneCreateLinkBody.appMode) && Intrinsics.EZpvd((Object) this.routeBiz, (Object) signalCloneCreateLinkBody.routeBiz) && Intrinsics.EZpvd((Object) this.appScheme, (Object) signalCloneCreateLinkBody.appScheme) && this.navOrder == signalCloneCreateLinkBody.navOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.algoId.hashCode() * 31) + this.algoOrdType.hashCode()) * 31) + this.type.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.copySource.hashCode()) * 31) + this.appMode.hashCode()) * 31) + this.routeBiz.hashCode()) * 31) + this.appScheme.hashCode()) * 31) + Integer.hashCode(this.navOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalCloneCreateLinkBody(algoId=" + this.algoId + ", algoOrdType=" + this.algoOrdType + ", type=" + this.type + ", instId=" + this.instId + ", instType=" + this.instType + ", copySource=" + this.copySource + ", appMode=" + this.appMode + ", routeBiz=" + this.routeBiz + ", appScheme=" + this.appScheme + ", navOrder=" + this.navOrder + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalCloneCreateLinkBody> serializer() {
            return SignalCloneCreateLinkBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalCloneCreateLinkBody(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, SignalCloneCreateLinkBody$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.algoOrdType = str2;
        this.type = str3;
        this.instId = str4;
        this.instType = str5;
        this.copySource = str6;
        this.appMode = str7;
        this.routeBiz = str8;
        this.appScheme = str9;
        this.navOrder = i2;
    }

    public static final /* synthetic */ void AEQbTJ(SignalCloneCreateLinkBody signalCloneCreateLinkBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signalCloneCreateLinkBody.algoId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signalCloneCreateLinkBody.algoOrdType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, signalCloneCreateLinkBody.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, signalCloneCreateLinkBody.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, signalCloneCreateLinkBody.instType);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, signalCloneCreateLinkBody.copySource);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, signalCloneCreateLinkBody.appMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, signalCloneCreateLinkBody.routeBiz);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, signalCloneCreateLinkBody.appScheme);
        compositeEncoder.encodeIntElement(serialDescriptor, 9, signalCloneCreateLinkBody.navOrder);
    }

    public SignalCloneCreateLinkBody(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.algoId = str;
        this.algoOrdType = str2;
        this.type = str3;
        this.instId = str4;
        this.instType = str5;
        this.copySource = str6;
        this.appMode = str7;
        this.routeBiz = str8;
        this.appScheme = str9;
        this.navOrder = i;
    }
}
