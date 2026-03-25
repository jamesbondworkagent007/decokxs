package com.okinc.localization2.bean.server;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AppLanguage {
    public static final String KEY_FALLBACK = "fallback";
    public static final String KEY_LANGUAGE_LIST = "languageList";
    public static final String KEY_MARKET = "market";
    private final AppLanguageFallback fallback;
    private final List<AppLanguageLanguageItem> languageList;
    private final String market;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(AppLanguageLanguageItem$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.localization2.bean.server.AppLanguage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppLanguage copy$default(AppLanguage appLanguage, AppLanguageFallback appLanguageFallback, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            appLanguageFallback = appLanguage.fallback;
        }
        if ((i & 2) != 0) {
            list = appLanguage.languageList;
        }
        if ((i & 4) != 0) {
            str = appLanguage.market;
        }
        return appLanguage.copy(appLanguageFallback, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLanguageFallback component1() {
        return this.fallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AppLanguageLanguageItem> component2() {
        return this.languageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLanguage copy(@NotNull AppLanguageFallback appLanguageFallback, @NotNull List<AppLanguageLanguageItem> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(appLanguageFallback, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new AppLanguage(appLanguageFallback, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLanguage)) {
            return false;
        }
        AppLanguage appLanguage = (AppLanguage) obj;
        return Intrinsics.EZpvd(this.fallback, appLanguage.fallback) && Intrinsics.EZpvd(this.languageList, appLanguage.languageList) && Intrinsics.EZpvd((Object) this.market, (Object) appLanguage.market);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLanguageFallback getFallback() {
        return this.fallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AppLanguageLanguageItem> getLanguageList() {
        return this.languageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarket() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.fallback.hashCode() * 31) + this.languageList.hashCode()) * 31) + this.market.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppLanguage(fallback=" + this.fallback + ", languageList=" + this.languageList + ", market=" + this.market + ")";
    }

    public /* synthetic */ AppLanguage(int i, AppLanguageFallback appLanguageFallback, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AppLanguage$$serializer.INSTANCE.getDescriptor());
        }
        this.fallback = appLanguageFallback;
        this.languageList = list;
        this.market = str;
    }

    public static final /* synthetic */ void write$Self$OKLocalization_localization(AppLanguage appLanguage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AppLanguageFallback$$serializer.INSTANCE, appLanguage.fallback);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], appLanguage.languageList);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, appLanguage.market);
    }

    public AppLanguage(@NotNull AppLanguageFallback appLanguageFallback, @NotNull List<AppLanguageLanguageItem> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(appLanguageFallback, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.fallback = appLanguageFallback;
        this.languageList = list;
        this.market = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.server.AppLanguage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppLanguage> serializer() {
            return AppLanguage$$serializer.INSTANCE;
        }
    }
}
