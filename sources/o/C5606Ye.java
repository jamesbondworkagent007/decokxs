package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;

/* JADX INFO: renamed from: o.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5606Ye {
    public final ObjectIdGenerator<?> AEQbTJ;
    public final InterfaceC5501Ue EZpvd;
    public final VD<java.lang.Object> KWHzl;
    public final JavaType OLrzqt;
    public final boolean copydefault;

    public C5606Ye(JavaType javaType, InterfaceC5501Ue interfaceC5501Ue, ObjectIdGenerator<?> objectIdGenerator, VD<?> vd, boolean z) {
        this.OLrzqt = javaType;
        this.EZpvd = interfaceC5501Ue;
        this.AEQbTJ = objectIdGenerator;
        this.KWHzl = vd;
        this.copydefault = z;
    }

    public static C5606Ye KWHzl(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        java.lang.String simpleName = propertyName == null ? null : propertyName.getSimpleName();
        return new C5606Ye(javaType, simpleName != null ? new SerializedString(simpleName) : null, objectIdGenerator, null, z);
    }

    public C5606Ye OLrzqt(VD<?> vd) {
        return new C5606Ye(this.OLrzqt, this.EZpvd, this.AEQbTJ, vd, this.copydefault);
    }

    public C5606Ye AEQbTJ(boolean z) {
        return z == this.copydefault ? this : new C5606Ye(this.OLrzqt, this.EZpvd, this.AEQbTJ, this.KWHzl, z);
    }
}
