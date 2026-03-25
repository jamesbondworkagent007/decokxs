package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;

/* JADX INFO: renamed from: o.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5610Yi {
    public final ObjectIdGenerator<?> AEQbTJ;
    public boolean OLrzqt = false;
    public java.lang.Object copydefault;

    public C5610Yi(ObjectIdGenerator<?> objectIdGenerator) {
        this.AEQbTJ = objectIdGenerator;
    }

    public boolean copydefault(JsonGenerator jsonGenerator, VI vi, C5606Ye c5606Ye) throws java.io.IOException {
        if (this.copydefault == null) {
            return false;
        }
        if (!this.OLrzqt && !c5606Ye.copydefault) {
            return false;
        }
        if (jsonGenerator.EZpvd()) {
            jsonGenerator.AhwBna((java.lang.Object) java.lang.String.valueOf(this.copydefault));
            return true;
        }
        c5606Ye.KWHzl.serialize(this.copydefault, jsonGenerator, vi);
        return true;
    }

    public java.lang.Object copydefault(java.lang.Object obj) {
        if (this.copydefault == null) {
            this.copydefault = this.AEQbTJ.generateId(obj);
        }
        return this.copydefault;
    }

    public void AEQbTJ(JsonGenerator jsonGenerator, VI vi, C5606Ye c5606Ye) throws java.io.IOException {
        this.OLrzqt = true;
        if (jsonGenerator.EZpvd()) {
            java.lang.Object obj = this.copydefault;
            jsonGenerator.AEQbTJ((java.lang.Object) (obj == null ? null : java.lang.String.valueOf(obj)));
            return;
        }
        InterfaceC5501Ue interfaceC5501Ue = c5606Ye.EZpvd;
        if (interfaceC5501Ue != null) {
            jsonGenerator.copydefault(interfaceC5501Ue);
            c5606Ye.KWHzl.serialize(this.copydefault, jsonGenerator, vi);
        }
    }
}
