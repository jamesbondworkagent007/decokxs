package com.okinc.localization2.bean.server;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AppLinkLang {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String isoCode;
    private final String link;
    private final String md5;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppLinkLang copy$default(AppLinkLang appLinkLang, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appLinkLang.isoCode;
        }
        if ((i & 2) != 0) {
            str2 = appLinkLang.link;
        }
        if ((i & 4) != 0) {
            str3 = appLinkLang.md5;
        }
        return appLinkLang.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AppLinkLang(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLinkLang)) {
            return false;
        }
        AppLinkLang appLinkLang = (AppLinkLang) obj;
        return Intrinsics.EZpvd((Object) this.isoCode, (Object) appLinkLang.isoCode) && Intrinsics.EZpvd((Object) this.link, (Object) appLinkLang.link) && Intrinsics.EZpvd((Object) this.md5, (Object) appLinkLang.md5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.isoCode.hashCode() * 31) + this.link.hashCode()) * 31) + this.md5.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppLinkLang(isoCode=" + this.isoCode + ", link=" + this.link + ", md5=" + this.md5 + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.server.AppLinkLang.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppLinkLang> serializer() {
            return AppLinkLang$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppLinkLang(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AppLinkLang$$serializer.INSTANCE.getDescriptor());
        }
        this.isoCode = str;
        this.link = str2;
        this.md5 = str3;
    }

    public static final /* synthetic */ void write$Self$OKLocalization_localization(AppLinkLang appLinkLang, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, appLinkLang.isoCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, appLinkLang.link);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, appLinkLang.md5);
    }

    public AppLinkLang(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.isoCode = str;
        this.link = str2;
        this.md5 = str3;
    }
}
