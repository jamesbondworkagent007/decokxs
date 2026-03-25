package com.okinc.localization2.bean;

import com.okinc.localization2.bean.server.AppLanguageLanguageItem;
import com.okinc.localization2.bean.server.AppLanguageLanguageItem$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LanguageInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AppLanguageLanguageItem languageInfo;
    private final String market;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LanguageInfo copy$default(LanguageInfo languageInfo, String str, AppLanguageLanguageItem appLanguageLanguageItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = languageInfo.market;
        }
        if ((i & 2) != 0) {
            appLanguageLanguageItem = languageInfo.languageInfo;
        }
        return languageInfo.copy(str, appLanguageLanguageItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLanguageLanguageItem component2() {
        return this.languageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageInfo copy(@NotNull String str, @NotNull AppLanguageLanguageItem appLanguageLanguageItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appLanguageLanguageItem, "");
        return new LanguageInfo(str, appLanguageLanguageItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageInfo)) {
            return false;
        }
        LanguageInfo languageInfo = (LanguageInfo) obj;
        return Intrinsics.EZpvd((Object) this.market, (Object) languageInfo.market) && Intrinsics.EZpvd(this.languageInfo, languageInfo.languageInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLanguageLanguageItem getLanguageInfo() {
        return this.languageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarket() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.market.hashCode() * 31) + this.languageInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LanguageInfo(market=" + this.market + ", languageInfo=" + this.languageInfo + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.LanguageInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LanguageInfo> serializer() {
            return LanguageInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LanguageInfo(int i, String str, AppLanguageLanguageItem appLanguageLanguageItem, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, LanguageInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.market = str;
        this.languageInfo = appLanguageLanguageItem;
    }

    public static final /* synthetic */ void write$Self$OKLocalization_localization(LanguageInfo languageInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, languageInfo.market);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, AppLanguageLanguageItem$$serializer.INSTANCE, languageInfo.languageInfo);
    }

    public LanguageInfo(@NotNull String str, @NotNull AppLanguageLanguageItem appLanguageLanguageItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appLanguageLanguageItem, "");
        this.market = str;
        this.languageInfo = appLanguageLanguageItem;
    }
}
