package o;

import java.util.Collections;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: o.yIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56524yIo {
    public static final InterfaceC56551yJo[] EZpvd;
    public static final C56525yIp copydefault;

    static {
        C56525yIp c56525yIp;
        try {
            c56525yIp = (C56525yIp) yLU.class.newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            c56525yIp = null;
        }
        if (c56525yIp == null) {
            c56525yIp = new C56525yIp();
        }
        copydefault = c56525yIp;
        EZpvd = new InterfaceC56551yJo[0];
    }

    public static InterfaceC56550yJn EZpvd(java.lang.Class cls) {
        return copydefault.EZpvd(cls, "");
    }

    public static InterfaceC56551yJo AEQbTJ(java.lang.Class cls) {
        return copydefault.EZpvd(cls);
    }

    public static java.lang.String AEQbTJ(Lambda lambda) {
        return copydefault.KWHzl(lambda);
    }

    public static java.lang.String AEQbTJ(InterfaceC56517yIh interfaceC56517yIh) {
        return copydefault.KWHzl(interfaceC56517yIh);
    }

    public static InterfaceC56555yJs OLrzqt(FunctionReference functionReference) {
        return copydefault.AEQbTJ(functionReference);
    }

    public static InterfaceC56562yJz AEQbTJ(PropertyReference0 propertyReference0) {
        return copydefault.OLrzqt(propertyReference0);
    }

    public static InterfaceC56557yJu OLrzqt(MutablePropertyReference0 mutablePropertyReference0) {
        return copydefault.OLrzqt(mutablePropertyReference0);
    }

    public static InterfaceC56560yJx copydefault(PropertyReference1 propertyReference1) {
        return copydefault.copydefault(propertyReference1);
    }

    public static InterfaceC56554yJr EZpvd(MutablePropertyReference1 mutablePropertyReference1) {
        return copydefault.KWHzl(mutablePropertyReference1);
    }

    public static InterfaceC56561yJy AEQbTJ(PropertyReference2 propertyReference2) {
        return copydefault.copydefault(propertyReference2);
    }

    public static InterfaceC56556yJt EZpvd(MutablePropertyReference2 mutablePropertyReference2) {
        return copydefault.KWHzl(mutablePropertyReference2);
    }

    public static InterfaceC56559yJw copydefault(java.lang.Class cls) {
        return copydefault.OLrzqt(AEQbTJ(cls), Collections.emptyList(), false);
    }

    public static InterfaceC56559yJw copydefault(java.lang.Class cls, KTypeProjection kTypeProjection) {
        return copydefault.OLrzqt(AEQbTJ(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static InterfaceC56559yJw KWHzl(java.lang.Class cls) {
        return copydefault.OLrzqt(AEQbTJ(cls), Collections.emptyList(), true);
    }
}
