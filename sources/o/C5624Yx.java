package o;

import com.fasterxml.jackson.core.JsonGenerator;

/* JADX INFO: renamed from: o.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5624Yx implements VF {
    public java.lang.Object KWHzl;

    public C5624Yx(java.lang.String str) {
        this.KWHzl = str;
    }

    @Override // o.VF
    public void serialize(JsonGenerator jsonGenerator, VI vi) throws java.io.IOException {
        java.lang.Object obj = this.KWHzl;
        if (obj instanceof VF) {
            ((VF) obj).serialize(jsonGenerator, vi);
        } else {
            AEQbTJ(jsonGenerator);
        }
    }

    @Override // o.VF
    public void serializeWithType(JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws java.io.IOException {
        java.lang.Object obj = this.KWHzl;
        if (obj instanceof VF) {
            ((VF) obj).serializeWithType(jsonGenerator, vi, abstractC5601Xz);
        } else if (obj instanceof InterfaceC5501Ue) {
            serialize(jsonGenerator, vi);
        }
    }

    public void EZpvd(JsonGenerator jsonGenerator) throws java.io.IOException {
        java.lang.Object obj = this.KWHzl;
        if (obj instanceof VF) {
            jsonGenerator.EZpvd(obj);
        } else {
            AEQbTJ(jsonGenerator);
        }
    }

    public void AEQbTJ(JsonGenerator jsonGenerator) throws java.io.IOException {
        java.lang.Object obj = this.KWHzl;
        if (obj instanceof InterfaceC5501Ue) {
            jsonGenerator.AEQbTJ((InterfaceC5501Ue) obj);
        } else {
            jsonGenerator.AYXKKw(java.lang.String.valueOf(obj));
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5624Yx)) {
            return false;
        }
        java.lang.Object obj2 = this.KWHzl;
        java.lang.Object obj3 = ((C5624Yx) obj).KWHzl;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    public int hashCode() {
        java.lang.Object obj = this.KWHzl;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return java.lang.String.format("[RawValue of type %s]", C5619Yr.copydefault(this.KWHzl));
    }
}
