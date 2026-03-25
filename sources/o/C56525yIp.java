package o;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: o.yIp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56525yIp {
    public InterfaceC56555yJs AEQbTJ(FunctionReference functionReference) {
        return functionReference;
    }

    public InterfaceC56554yJr KWHzl(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public InterfaceC56556yJt KWHzl(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public InterfaceC56557yJu OLrzqt(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public InterfaceC56562yJz OLrzqt(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public InterfaceC56560yJx copydefault(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public InterfaceC56561yJy copydefault(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public InterfaceC56550yJn EZpvd(java.lang.Class cls, java.lang.String str) {
        return new C56527yIr(cls, str);
    }

    public InterfaceC56551yJo EZpvd(java.lang.Class cls) {
        return new C56512yIc(cls);
    }

    public java.lang.String KWHzl(Lambda lambda) {
        return KWHzl((InterfaceC56517yIh) lambda);
    }

    public java.lang.String KWHzl(InterfaceC56517yIh interfaceC56517yIh) {
        java.lang.String string = interfaceC56517yIh.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public InterfaceC56559yJw OLrzqt(InterfaceC56553yJq interfaceC56553yJq, java.util.List<KTypeProjection> list, boolean z) {
        return new C56530yIu(interfaceC56553yJq, list, z);
    }
}
