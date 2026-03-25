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
public final class AppLink {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AppLinkLang globalCurrent;
    private final AppLinkLang globalDefault;
    private final String market;
    private final AppLinkLang marketCurrent;
    private final AppLinkLang marketDefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppLink copy$default(AppLink appLink, String str, AppLinkLang appLinkLang, AppLinkLang appLinkLang2, AppLinkLang appLinkLang3, AppLinkLang appLinkLang4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appLink.market;
        }
        if ((i & 2) != 0) {
            appLinkLang = appLink.marketCurrent;
        }
        AppLinkLang appLinkLang5 = appLinkLang;
        if ((i & 4) != 0) {
            appLinkLang2 = appLink.marketDefault;
        }
        AppLinkLang appLinkLang6 = appLinkLang2;
        if ((i & 8) != 0) {
            appLinkLang3 = appLink.globalCurrent;
        }
        AppLinkLang appLinkLang7 = appLinkLang3;
        if ((i & 16) != 0) {
            appLinkLang4 = appLink.globalDefault;
        }
        return appLink.copy(str, appLinkLang5, appLinkLang6, appLinkLang7, appLinkLang4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang component2() {
        return this.marketCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang component3() {
        return this.marketDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang component4() {
        return this.globalCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang component5() {
        return this.globalDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLink copy(@NotNull String str, AppLinkLang appLinkLang, AppLinkLang appLinkLang2, AppLinkLang appLinkLang3, AppLinkLang appLinkLang4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AppLink(str, appLinkLang, appLinkLang2, appLinkLang3, appLinkLang4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLink)) {
            return false;
        }
        AppLink appLink = (AppLink) obj;
        return Intrinsics.EZpvd((Object) this.market, (Object) appLink.market) && Intrinsics.EZpvd(this.marketCurrent, appLink.marketCurrent) && Intrinsics.EZpvd(this.marketDefault, appLink.marketDefault) && Intrinsics.EZpvd(this.globalCurrent, appLink.globalCurrent) && Intrinsics.EZpvd(this.globalDefault, appLink.globalDefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang getGlobalCurrent() {
        return this.globalCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang getGlobalDefault() {
        return this.globalDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarket() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang getMarketCurrent() {
        return this.marketCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLinkLang getMarketDefault() {
        return this.marketDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.market.hashCode();
        AppLinkLang appLinkLang = this.marketCurrent;
        int iHashCode2 = appLinkLang == null ? 0 : appLinkLang.hashCode();
        AppLinkLang appLinkLang2 = this.marketDefault;
        int iHashCode3 = appLinkLang2 == null ? 0 : appLinkLang2.hashCode();
        AppLinkLang appLinkLang3 = this.globalCurrent;
        int iHashCode4 = appLinkLang3 == null ? 0 : appLinkLang3.hashCode();
        AppLinkLang appLinkLang4 = this.globalDefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (appLinkLang4 != null ? appLinkLang4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppLink(market=" + this.market + ", marketCurrent=" + this.marketCurrent + ", marketDefault=" + this.marketDefault + ", globalCurrent=" + this.globalCurrent + ", globalDefault=" + this.globalDefault + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.server.AppLink.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppLink> serializer() {
            return AppLink$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppLink(int i, String str, AppLinkLang appLinkLang, AppLinkLang appLinkLang2, AppLinkLang appLinkLang3, AppLinkLang appLinkLang4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, AppLink$$serializer.INSTANCE.getDescriptor());
        }
        this.market = str;
        this.marketCurrent = appLinkLang;
        this.marketDefault = appLinkLang2;
        this.globalCurrent = appLinkLang3;
        this.globalDefault = appLinkLang4;
    }

    public static final /* synthetic */ void write$Self$OKLocalization_localization(AppLink appLink, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, appLink.market);
        AppLinkLang$$serializer appLinkLang$$serializer = AppLinkLang$$serializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, appLinkLang$$serializer, appLink.marketCurrent);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, appLinkLang$$serializer, appLink.marketDefault);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, appLinkLang$$serializer, appLink.globalCurrent);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, appLinkLang$$serializer, appLink.globalDefault);
    }

    public AppLink(@NotNull String str, AppLinkLang appLinkLang, AppLinkLang appLinkLang2, AppLinkLang appLinkLang3, AppLinkLang appLinkLang4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.market = str;
        this.marketCurrent = appLinkLang;
        this.marketDefault = appLinkLang2;
        this.globalCurrent = appLinkLang3;
        this.globalDefault = appLinkLang4;
    }
}
