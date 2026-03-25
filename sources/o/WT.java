package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class WT implements InterfaceC5623Yw {
    public static final JsonInclude.Value EZpvd = JsonInclude.Value.empty();

    public AnnotationIntrospector.ReferenceProperty AYXKKw() {
        return null;
    }

    public abstract JavaType AuCTel();

    public boolean AuCTelauCTel() {
        return false;
    }

    public abstract PropertyMetadata DbNXlk();

    public abstract JsonInclude.Value EZpvd();

    public C5576Xa KWHzl() {
        return null;
    }

    public java.lang.Class<?>[] djBIcL() {
        return null;
    }

    public abstract AnnotatedMember ejfBZ();

    public abstract java.lang.Class<?> fIwbmz();

    public abstract AnnotatedMethod fJNWhG();

    public abstract AnnotatedMethod fetchVPNInfo();

    public abstract boolean getFieldNames();

    @Override // o.InterfaceC5623Yw
    public abstract java.lang.String getName();

    public abstract PropertyName getNewProxyInstance();

    public abstract boolean hDKMBd();

    public abstract PropertyName isConnected();

    public abstract boolean iwGUEr();

    public abstract boolean uzCIH();

    public abstract AnnotatedParameter valueOf();

    public abstract AnnotatedField values();

    public boolean copydefault(PropertyName propertyName) {
        return isConnected().equals(propertyName);
    }

    public boolean wlaJM() {
        return getFieldNames();
    }

    public boolean OLrzqt() {
        return AkhnZx() != null;
    }

    public boolean copydefault() {
        return gEmmrt() != null;
    }

    public java.util.Iterator<AnnotatedParameter> AhwBna() {
        return C5619Yr.KWHzl();
    }

    public AnnotatedMember gEmmrt() {
        AnnotatedMethod annotatedMethodFetchVPNInfo = fetchVPNInfo();
        return annotatedMethodFetchVPNInfo == null ? values() : annotatedMethodFetchVPNInfo;
    }

    public AnnotatedMember AkhnZx() {
        AnnotatedParameter annotatedParameterValueOf = valueOf();
        if (annotatedParameterValueOf != null) {
            return annotatedParameterValueOf;
        }
        AnnotatedMethod annotatedMethodFJNWhG = fJNWhG();
        return annotatedMethodFJNWhG == null ? values() : annotatedMethodFJNWhG;
    }

    public AnnotatedMember fARcdN() {
        AnnotatedMethod annotatedMethodFJNWhG = fJNWhG();
        return annotatedMethodFJNWhG == null ? values() : annotatedMethodFJNWhG;
    }

    public java.lang.String AEQbTJ() {
        AnnotationIntrospector.ReferenceProperty referencePropertyAYXKKw = AYXKKw();
        if (referencePropertyAYXKKw == null) {
            return null;
        }
        return referencePropertyAYXKKw.KWHzl();
    }
}
