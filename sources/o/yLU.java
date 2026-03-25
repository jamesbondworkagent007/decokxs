package o;

import java.util.Collections;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* JADX INFO: loaded from: classes13.dex */
public class yLU extends C56525yIp {
    @Override // o.C56525yIp
    public InterfaceC56550yJn EZpvd(java.lang.Class cls, java.lang.String str) {
        return yJT.isConnected(cls);
    }

    @Override // o.C56525yIp
    public InterfaceC56551yJo EZpvd(java.lang.Class cls) {
        return yJT.fetchVPNInfo(cls);
    }

    @Override // o.C56525yIp
    public java.lang.String KWHzl(Lambda lambda) {
        return KWHzl((InterfaceC56517yIh) lambda);
    }

    @Override // o.C56525yIp
    public java.lang.String KWHzl(InterfaceC56517yIh interfaceC56517yIh) {
        yKT yktEZpvd;
        InterfaceC56555yJs interfaceC56555yJsEZpvd = yJO.EZpvd(interfaceC56517yIh);
        if (interfaceC56555yJsEZpvd != null && (yktEZpvd = yLX.EZpvd(interfaceC56555yJsEZpvd)) != null) {
            return yLS.EZpvd.EZpvd(yktEZpvd.values());
        }
        return super.KWHzl(interfaceC56517yIh);
    }

    @Override // o.C56525yIp
    public InterfaceC56555yJs AEQbTJ(FunctionReference functionReference) {
        return new yKT(EZpvd(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // o.C56525yIp
    public InterfaceC56562yJz OLrzqt(PropertyReference0 propertyReference0) {
        return new C56608yLr(EZpvd(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // o.C56525yIp
    public InterfaceC56557yJu OLrzqt(MutablePropertyReference0 mutablePropertyReference0) {
        return new C56591yLa(EZpvd(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // o.C56525yIp
    public InterfaceC56560yJx copydefault(PropertyReference1 propertyReference1) {
        return new C56611yLu(EZpvd(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // o.C56525yIp
    public InterfaceC56554yJr KWHzl(MutablePropertyReference1 mutablePropertyReference1) {
        return new yKZ(EZpvd(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // o.C56525yIp
    public InterfaceC56561yJy copydefault(PropertyReference2 propertyReference2) {
        return new C56609yLs(EZpvd(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // o.C56525yIp
    public InterfaceC56556yJt KWHzl(MutablePropertyReference2 mutablePropertyReference2) {
        return new C56596yLf(EZpvd(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    public static KDeclarationContainerImpl EZpvd(CallableReference callableReference) {
        InterfaceC56550yJn owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : C56565yKb.EZpvd;
    }

    @Override // o.C56525yIp
    public InterfaceC56559yJw OLrzqt(InterfaceC56553yJq interfaceC56553yJq, java.util.List<KTypeProjection> list, boolean z) {
        if (interfaceC56553yJq instanceof InterfaceC56513yId) {
            return yJT.AEQbTJ(((InterfaceC56513yId) interfaceC56553yJq).OLrzqt(), list, z);
        }
        return yJI.EZpvd(interfaceC56553yJq, list, z, Collections.emptyList());
    }
}
