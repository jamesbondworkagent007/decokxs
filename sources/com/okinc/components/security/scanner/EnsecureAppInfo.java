package com.okinc.components.security.scanner;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class EnsecureAppInfo {
    public static final int $stable = 8;
    private ApplicationInfo appInfo;
    private String appName;
    private Drawable icon;
    private boolean isIgnored;
    private String packageName;
    private ScanResult scanResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EnsecureAppInfo copy$default(EnsecureAppInfo ensecureAppInfo, ApplicationInfo applicationInfo, String str, String str2, Drawable drawable, ScanResult scanResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            applicationInfo = ensecureAppInfo.appInfo;
        }
        if ((i & 2) != 0) {
            str = ensecureAppInfo.appName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = ensecureAppInfo.packageName;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            drawable = ensecureAppInfo.icon;
        }
        Drawable drawable2 = drawable;
        if ((i & 16) != 0) {
            scanResult = ensecureAppInfo.scanResult;
        }
        ScanResult scanResult2 = scanResult;
        if ((i & 32) != 0) {
            z = ensecureAppInfo.isIgnored;
        }
        return ensecureAppInfo.copy(applicationInfo, str3, str4, drawable2, scanResult2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApplicationInfo component1() {
        return this.appInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable component4() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScanResult component5() {
        return this.scanResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isIgnored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnsecureAppInfo copy(ApplicationInfo applicationInfo, @NotNull String str, @NotNull String str2, Drawable drawable, @NotNull ScanResult scanResult, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(scanResult, "");
        return new EnsecureAppInfo(applicationInfo, str, str2, drawable, scanResult, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnsecureAppInfo)) {
            return false;
        }
        EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) obj;
        return Intrinsics.EZpvd(this.appInfo, ensecureAppInfo.appInfo) && Intrinsics.EZpvd((Object) this.appName, (Object) ensecureAppInfo.appName) && Intrinsics.EZpvd((Object) this.packageName, (Object) ensecureAppInfo.packageName) && Intrinsics.EZpvd(this.icon, ensecureAppInfo.icon) && Intrinsics.EZpvd(this.scanResult, ensecureAppInfo.scanResult) && this.isIgnored == ensecureAppInfo.isIgnored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApplicationInfo getAppInfo() {
        return this.appInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScanResult getScanResult() {
        return this.scanResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ApplicationInfo applicationInfo = this.appInfo;
        int iHashCode = applicationInfo == null ? 0 : applicationInfo.hashCode();
        int iHashCode2 = this.appName.hashCode();
        int iHashCode3 = this.packageName.hashCode();
        Drawable drawable = this.icon;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (drawable != null ? drawable.hashCode() : 0)) * 31) + this.scanResult.hashCode()) * 31) + Boolean.hashCode(this.isIgnored);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isIgnored() {
        return this.isIgnored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppInfo(ApplicationInfo applicationInfo) {
        this.appInfo = applicationInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.appName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(Drawable drawable) {
        this.icon = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIgnored(boolean z) {
        this.isIgnored = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.packageName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScanResult(@NotNull ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "");
        this.scanResult = scanResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EnsecureAppInfo(appInfo=" + this.appInfo + ", appName=" + this.appName + ", packageName=" + this.packageName + ", icon=" + this.icon + ", scanResult=" + this.scanResult + ", isIgnored=" + this.isIgnored + ")";
    }

    public EnsecureAppInfo(ApplicationInfo applicationInfo, @NotNull String str, @NotNull String str2, Drawable drawable, @NotNull ScanResult scanResult, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(scanResult, "");
        this.appInfo = applicationInfo;
        this.appName = str;
        this.packageName = str2;
        this.icon = drawable;
        this.scanResult = scanResult;
        this.isIgnored = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:android.content.pm.ApplicationInfo:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.content.pm.ApplicationInfo) : (r8v0 android.content.pm.ApplicationInfo))
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 android.graphics.drawable.Drawable)
  (r12v0 com.okinc.components.security.scanner.EnsecureAppInfo$ScanResult)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(android.content.pm.ApplicationInfo, java.lang.String, java.lang.String, android.graphics.drawable.Drawable, com.okinc.components.security.scanner.EnsecureAppInfo$ScanResult, boolean):void (m)] (LINE:12) call: com.okinc.components.security.scanner.EnsecureAppInfo.<init>(android.content.pm.ApplicationInfo, java.lang.String, java.lang.String, android.graphics.drawable.Drawable, com.okinc.components.security.scanner.EnsecureAppInfo$ScanResult, boolean):void type: THIS */
    public /* synthetic */ EnsecureAppInfo(ApplicationInfo applicationInfo, String str, String str2, Drawable drawable, ScanResult scanResult, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : applicationInfo, str, str2, drawable, scanResult, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class RiskLevel implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RiskLevel[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<RiskLevel> CREATOR;
        public static final Companion Companion;
        private final String levelString;
        public static final RiskLevel DEVICE_SECURITY_LEVEL_HIGH = new RiskLevel("DEVICE_SECURITY_LEVEL_HIGH", 0, "high");
        public static final RiskLevel DEVICE_SECURITY_LEVEL_MEDIUM = new RiskLevel("DEVICE_SECURITY_LEVEL_MEDIUM", 1, "medium");
        public static final RiskLevel DEVICE_SECURITY_LEVEL_LOW = new RiskLevel("DEVICE_SECURITY_LEVEL_LOW", 2, "low");

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<RiskLevel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskLevel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return RiskLevel.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskLevel[] newArray(int i) {
                return new RiskLevel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RiskLevel[] $values() {
            return new RiskLevel[]{DEVICE_SECURITY_LEVEL_HIGH, DEVICE_SECURITY_LEVEL_MEDIUM, DEVICE_SECURITY_LEVEL_LOW};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RiskLevel> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLevelString() {
            return this.levelString;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.security.scanner.EnsecureAppInfo.RiskLevel.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer EZpvd() {
                return (KSerializer) RiskLevel.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<RiskLevel> serializer() {
                return EZpvd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.okinc.components.security.scanner.EnsecureAppInfo.RiskLevel", values());
        }

        private RiskLevel(String str, int i, String str2) {
            this.levelString = str2;
        }

        static {
            RiskLevel[] riskLevelArr$values = $values();
            $VALUES = riskLevelArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(riskLevelArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mji
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return EnsecureAppInfo.RiskLevel._init_$_anonymous_();
                }
            });
        }

        public static RiskLevel valueOf(String str) {
            return (RiskLevel) Enum.valueOf(RiskLevel.class, str);
        }

        public static RiskLevel[] values() {
            return (RiskLevel[]) $VALUES.clone();
        }
    }

    @Serializable
    public static final class ScanResult implements Parcelable {
        private RiskLevel level;
        private final String reason;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<ScanResult> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, RiskLevel.Companion.serializer()};

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<ScanResult> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ScanResult(parcel.readString(), RiskLevel.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanResult[] newArray(int i) {
                return new ScanResult[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ScanResult copy$default(ScanResult scanResult, String str, RiskLevel riskLevel, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scanResult.reason;
            }
            if ((i & 2) != 0) {
                riskLevel = scanResult.level;
            }
            return scanResult.copy(str, riskLevel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RiskLevel component2() {
            return this.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ScanResult copy(@NotNull String str, @NotNull RiskLevel riskLevel) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(riskLevel, "");
            return new ScanResult(str, riskLevel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScanResult)) {
                return false;
            }
            ScanResult scanResult = (ScanResult) obj;
            return Intrinsics.EZpvd((Object) this.reason, (Object) scanResult.reason) && this.level == scanResult.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RiskLevel getLevel() {
            return this.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.reason.hashCode() * 31) + this.level.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLevel(@NotNull RiskLevel riskLevel) {
            Intrinsics.checkNotNullParameter(riskLevel, "");
            this.level = riskLevel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ScanResult(reason=" + this.reason + ", level=" + this.level + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.reason);
            this.level.writeToParcel(parcel, i);
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.security.scanner.EnsecureAppInfo.ScanResult.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ScanResult> serializer() {
                return EnsecureAppInfo$ScanResult$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ScanResult(int i, String str, RiskLevel riskLevel, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, EnsecureAppInfo$ScanResult$$serializer.INSTANCE.getDescriptor());
            }
            this.reason = str;
            this.level = riskLevel;
        }

        public static final /* synthetic */ void write$Self$OKSecurity_ok_security_impl(ScanResult scanResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, scanResult.reason);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], scanResult.level);
        }

        public ScanResult(@NotNull String str, @NotNull RiskLevel riskLevel) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(riskLevel, "");
            this.reason = str;
            this.level = riskLevel;
        }
    }
}
