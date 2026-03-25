package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class Changelog {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String enUS;
    private final String zhCN;

    @SerialName("en-US")
    public static /* synthetic */ void getEnUS$annotations() {
    }

    @SerialName("zh-CN")
    public static /* synthetic */ void getZhCN$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnUS() {
        return this.enUS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getZhCN() {
        return this.zhCN;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.Changelog.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Changelog> serializer() {
            return Changelog$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Changelog(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Changelog$$serializer.INSTANCE.getDescriptor());
        }
        this.zhCN = str;
        this.enUS = str2;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(Changelog changelog, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, changelog.zhCN);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, changelog.enUS);
    }

    public Changelog(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.zhCN = str;
        this.enUS = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(Changelog.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        Changelog changelog = (Changelog) obj;
        return Intrinsics.EZpvd((Object) this.zhCN, (Object) changelog.zhCN) && Intrinsics.EZpvd((Object) this.enUS, (Object) changelog.enUS);
    }

    public int hashCode() {
        return (this.zhCN.hashCode() * 31) + this.enUS.hashCode();
    }

    public String toString() {
        return "Changelog(zhCN='" + this.zhCN + "', enUS='" + this.enUS + "')";
    }
}
