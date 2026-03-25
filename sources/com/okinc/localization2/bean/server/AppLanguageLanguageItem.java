package com.okinc.localization2.bean.server;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AppLanguageLanguageItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CEFI_LOCALIZATION_NAME = "cefiLocalizationName";
    public static final String KEY_HIDE_IN_CEFI_MODE = "hideInCefiMode";
    public static final String KEY_ISO_CODE = "isoCode";
    public static final String KEY_LOCALIZATION_NAME = "localizationName";
    private final String cefiLocalizationName;
    private final boolean hideInCefiMode;
    private final String isoCode;
    private final String localizationName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppLanguageLanguageItem copy$default(AppLanguageLanguageItem appLanguageLanguageItem, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appLanguageLanguageItem.isoCode;
        }
        if ((i & 2) != 0) {
            str2 = appLanguageLanguageItem.localizationName;
        }
        if ((i & 4) != 0) {
            str3 = appLanguageLanguageItem.cefiLocalizationName;
        }
        if ((i & 8) != 0) {
            z = appLanguageLanguageItem.hideInCefiMode;
        }
        return appLanguageLanguageItem.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.localizationName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cefiLocalizationName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.hideInCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLanguageLanguageItem copy(@NotNull String str, @NotNull String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AppLanguageLanguageItem(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLanguageLanguageItem)) {
            return false;
        }
        AppLanguageLanguageItem appLanguageLanguageItem = (AppLanguageLanguageItem) obj;
        return Intrinsics.EZpvd((Object) this.isoCode, (Object) appLanguageLanguageItem.isoCode) && Intrinsics.EZpvd((Object) this.localizationName, (Object) appLanguageLanguageItem.localizationName) && Intrinsics.EZpvd((Object) this.cefiLocalizationName, (Object) appLanguageLanguageItem.cefiLocalizationName) && this.hideInCefiMode == appLanguageLanguageItem.hideInCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCefiLocalizationName() {
        return this.cefiLocalizationName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHideInCefiMode() {
        return this.hideInCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalizationName() {
        return this.localizationName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.isoCode.hashCode();
        int iHashCode2 = this.localizationName.hashCode();
        String str = this.cefiLocalizationName;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hideInCefiMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppLanguageLanguageItem(isoCode=" + this.isoCode + ", localizationName=" + this.localizationName + ", cefiLocalizationName=" + this.cefiLocalizationName + ", hideInCefiMode=" + this.hideInCefiMode + ")";
    }

    public /* synthetic */ AppLanguageLanguageItem(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AppLanguageLanguageItem$$serializer.INSTANCE.getDescriptor());
        }
        this.isoCode = str;
        this.localizationName = str2;
        if ((i & 4) == 0) {
            this.cefiLocalizationName = null;
        } else {
            this.cefiLocalizationName = str3;
        }
        if ((i & 8) == 0) {
            this.hideInCefiMode = false;
        } else {
            this.hideInCefiMode = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKLocalization_localization(AppLanguageLanguageItem appLanguageLanguageItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, appLanguageLanguageItem.isoCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, appLanguageLanguageItem.localizationName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || appLanguageLanguageItem.cefiLocalizationName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, appLanguageLanguageItem.cefiLocalizationName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || appLanguageLanguageItem.hideInCefiMode) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, appLanguageLanguageItem.hideInCefiMode);
        }
    }

    public AppLanguageLanguageItem(@NotNull String str, @NotNull String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.isoCode = str;
        this.localizationName = str2;
        this.cefiLocalizationName = str3;
        this.hideInCefiMode = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:8) call: com.okinc.localization2.bean.server.AppLanguageLanguageItem.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AppLanguageLanguageItem(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.server.AppLanguageLanguageItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppLanguageLanguageItem> serializer() {
            return AppLanguageLanguageItem$$serializer.INSTANCE;
        }
    }
}
