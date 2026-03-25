package o;

import aws.sdk.kotlin.runtime.config.profile.ConfigSectionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GetField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectStreamField {
    public final ConfigSectionType EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, GetField> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ObjectStreamField */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ObjectStreamField copy$default(ObjectStreamField objectStreamField, java.lang.String str, java.util.Map map, ConfigSectionType configSectionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = objectStreamField.KWHzl;
        }
        if ((i & 2) != 0) {
            map = objectStreamField.copydefault;
        }
        if ((i & 4) != 0) {
            configSectionType = objectStreamField.EZpvd;
        }
        return objectStreamField.EZpvd(str, map, configSectionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfigSectionType EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ObjectStreamField EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends GetField> map, @NotNull ConfigSectionType configSectionType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(configSectionType, "");
        return new ObjectStreamField(str, map, configSectionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, GetField> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectStreamField)) {
            return false;
        }
        ObjectStreamField objectStreamField = (ObjectStreamField) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) objectStreamField.KWHzl) && Intrinsics.EZpvd(this.copydefault, objectStreamField.copydefault) && this.EZpvd == objectStreamField.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConfigSection(name=" + this.KWHzl + ", properties=" + this.copydefault + ", sectionType=" + this.EZpvd + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends o.GetField> */
    /* JADX WARN: Multi-variable type inference failed */
    public ObjectStreamField(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends GetField> map, @NotNull ConfigSectionType configSectionType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(configSectionType, "");
        this.KWHzl = str;
        this.copydefault = map;
        this.EZpvd = configSectionType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.Map)
  (wrap:aws.sdk.kotlin.runtime.config.profile.ConfigSectionType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:aws.sdk.kotlin.runtime.config.profile.ConfigSectionType:0x0004: SGET  A[WRAPPED] (LINE:14) aws.sdk.kotlin.runtime.config.profile.ConfigSectionType.PROFILE aws.sdk.kotlin.runtime.config.profile.ConfigSectionType) : (r3v0 aws.sdk.kotlin.runtime.config.profile.ConfigSectionType))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, ? extends o.GetField>, aws.sdk.kotlin.runtime.config.profile.ConfigSectionType):void (m)] (LINE:11) call: o.ObjectStreamField.<init>(java.lang.String, java.util.Map, aws.sdk.kotlin.runtime.config.profile.ConfigSectionType):void type: THIS */
    public /* synthetic */ ObjectStreamField(java.lang.String str, java.util.Map map, ConfigSectionType configSectionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? ConfigSectionType.PROFILE : configSectionType);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.containsKey(str);
    }

    public static /* synthetic */ java.lang.String getOrNull$default(ObjectStreamField objectStreamField, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return objectStreamField.AEQbTJ(str, str2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        GetField getField = this.copydefault.get(str);
        if (getField == null) {
            return null;
        }
        if (getField instanceof GetField.TaskDescription) {
            if (str2 != null) {
                throw new java.lang.IllegalArgumentException(("property '" + str + "' is a string, but caller specified a sub-key").toString());
            }
            return ((GetField.TaskDescription) getField).KWHzl();
        }
        if (!(getField instanceof GetField.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException(("property '" + str + "' has sub-properties, caller must specify a sub-key").toString());
        }
        return (java.lang.String) ((GetField.ActionBar) getField).get(str2);
    }
}
