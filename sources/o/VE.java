package o;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VE {

    public interface ActionBar {
        void AEQbTJ(VX vx);

        void AEQbTJ(XR xr);

        void EZpvd(PropertyNamingStrategy propertyNamingStrategy);

        void EZpvd(java.lang.Class<?> cls, java.lang.Class<?> cls2);

        void EZpvd(InterfaceC5559Wj interfaceC5559Wj);

        void EZpvd(InterfaceC5605Yd interfaceC5605Yd);

        void EZpvd(NamedType... namedTypeArr);

        void KWHzl(AbstractC5547Vx abstractC5547Vx);

        void KWHzl(InterfaceC5556Wg interfaceC5556Wg);

        void OLrzqt(InterfaceC5562Wm interfaceC5562Wm);

        void copydefault(InterfaceC5605Yd interfaceC5605Yd);
    }

    public abstract java.lang.String getModuleName();

    public abstract void setupModule(ActionBar actionBar);

    public abstract Version version();

    public java.lang.Object getTypeId() {
        return getClass().getName();
    }

    public java.lang.Iterable<? extends VE> getDependencies() {
        return Collections.emptyList();
    }
}
