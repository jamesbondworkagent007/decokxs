package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;

/* JADX INFO: renamed from: o.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5499Uc implements InterfaceC5500Ud {
    public java.util.Map<ObjectIdGenerator.IdKey, java.lang.Object> copydefault;

    @Override // o.InterfaceC5500Ud
    public void EZpvd(ObjectIdGenerator.IdKey idKey, java.lang.Object obj) {
        java.util.Map<ObjectIdGenerator.IdKey, java.lang.Object> map = this.copydefault;
        if (map == null) {
            this.copydefault = new java.util.HashMap();
        } else {
            java.lang.Object obj2 = map.get(idKey);
            if (obj2 != null) {
                if (obj2 == obj) {
                    return;
                }
                throw new java.lang.IllegalStateException("Already had POJO for id (" + idKey.key.getClass().getName() + ") [" + idKey + "]");
            }
        }
        this.copydefault.put(idKey, obj);
    }

    @Override // o.InterfaceC5500Ud
    public java.lang.Object AEQbTJ(ObjectIdGenerator.IdKey idKey) {
        java.util.Map<ObjectIdGenerator.IdKey, java.lang.Object> map = this.copydefault;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }

    @Override // o.InterfaceC5500Ud
    public boolean copydefault(InterfaceC5500Ud interfaceC5500Ud) {
        return interfaceC5500Ud.getClass() == getClass();
    }

    @Override // o.InterfaceC5500Ud
    public InterfaceC5500Ud AEQbTJ(java.lang.Object obj) {
        return new C5499Uc();
    }
}
