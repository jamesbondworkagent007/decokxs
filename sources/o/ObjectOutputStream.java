package o;

import aws.sdk.kotlin.runtime.config.profile.ConfigSectionType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectOutputStream {
    public final java.util.Map<ConfigSectionType, java.util.Map<java.lang.String, ObjectStreamField>> KWHzl;
    public final ObjectOutput OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<aws.sdk.kotlin.runtime.config.profile.ConfigSectionType, ? extends java.util.Map<java.lang.String, o.ObjectStreamField>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ObjectOutputStream(@NotNull java.util.Map<ConfigSectionType, ? extends java.util.Map<java.lang.String, ObjectStreamField>> map, @NotNull ObjectOutput objectOutput) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(objectOutput, "");
        this.KWHzl = map;
        this.OLrzqt = objectOutput;
    }

    public final java.util.Map<java.lang.String, ObjectStreamField> copydefault() {
        java.util.Map<java.lang.String, ObjectStreamField> map = this.KWHzl.get(ConfigSectionType.PROFILE);
        return map == null ? C56424yEw.KWHzl() : map;
    }

    public final java.util.Map<java.lang.String, ObjectStreamField> AEQbTJ() {
        java.util.Map<java.lang.String, ObjectStreamField> map = this.KWHzl.get(ConfigSectionType.SSO_SESSION);
        return map == null ? C56424yEw.KWHzl() : map;
    }

    public final java.util.Map<java.lang.String, ObjectStreamField> EZpvd() {
        java.util.Map<java.lang.String, ObjectStreamField> map = this.KWHzl.get(ConfigSectionType.SERVICES);
        return map == null ? C56424yEw.KWHzl() : map;
    }

    public final ObjectStreamField OLrzqt() {
        ObjectStreamField objectStreamField = copydefault().get(this.OLrzqt.KWHzl());
        return objectStreamField == null ? new ObjectStreamField(this.OLrzqt.KWHzl(), C56424yEw.KWHzl(), null, 4, null) : objectStreamField;
    }
}
