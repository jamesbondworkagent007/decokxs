package o;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import o.WX;

/* JADX INFO: loaded from: classes21.dex */
public final class WJ extends WM implements InterfaceC5580Xe {
    public static final Application copydefault = new Application(null, Collections.emptyList(), Collections.emptyList());
    public final TypeBindings AEQbTJ;
    public final boolean AYXKKw;
    public Application AhwBna;
    public final java.lang.Class<?> AkhnZx;
    public transient java.lang.Boolean DbNXlk;
    public final InterfaceC5609Yh EZpvd;
    public final AnnotationIntrospector KWHzl;
    public final java.lang.Class<?> OLrzqt;
    public final WX.TaskDescription djBIcL;
    public final TypeFactory fetchVPNInfo;
    public java.util.List<AnnotatedField> gEmmrt;
    public final JavaType isConnected;
    public WR valueOf;
    public final java.util.List<JavaType> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getAnnotated()Ljava/lang/reflect/AnnotatedElement; */
    @Override // o.WM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Class<?> getAnnotated() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC5609Yh AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WM
    public java.lang.Class<?> getRawType() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WM
    public JavaType getType() {
        return this.isConnected;
    }

    public WJ(JavaType javaType, java.lang.Class<?> cls, java.util.List<JavaType> list, java.lang.Class<?> cls2, InterfaceC5609Yh interfaceC5609Yh, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, WX.TaskDescription taskDescription, TypeFactory typeFactory, boolean z) {
        this.isConnected = javaType;
        this.OLrzqt = cls;
        this.values = list;
        this.AkhnZx = cls2;
        this.EZpvd = interfaceC5609Yh;
        this.AEQbTJ = typeBindings;
        this.KWHzl = annotationIntrospector;
        this.djBIcL = taskDescription;
        this.fetchVPNInfo = typeFactory;
        this.AYXKKw = z;
    }

    public WJ(java.lang.Class<?> cls) {
        this.isConnected = null;
        this.OLrzqt = cls;
        this.values = Collections.emptyList();
        this.AkhnZx = null;
        this.EZpvd = AnnotationCollector.AEQbTJ();
        this.AEQbTJ = TypeBindings.emptyBindings();
        this.KWHzl = null;
        this.djBIcL = null;
        this.fetchVPNInfo = null;
        this.AYXKKw = false;
    }

    @Override // o.InterfaceC5580Xe
    public JavaType copydefault(java.lang.reflect.Type type) {
        return this.fetchVPNInfo.resolveMemberType(type, this.AEQbTJ);
    }

    @Override // o.WM
    public int getModifiers() {
        return this.OLrzqt.getModifiers();
    }

    @Override // o.WM
    public java.lang.String getName() {
        return this.OLrzqt.getName();
    }

    @Override // o.WM
    public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> cls) {
        return (A) this.EZpvd.get(cls);
    }

    @Override // o.WM
    public boolean hasAnnotation(java.lang.Class<?> cls) {
        return this.EZpvd.has(cls);
    }

    @Override // o.WM
    public boolean hasOneOf(java.lang.Class<? extends java.lang.annotation.Annotation>[] clsArr) {
        return this.EZpvd.hasOneOf(clsArr);
    }

    @Override // o.WM
    @java.lang.Deprecated
    public java.lang.Iterable<java.lang.annotation.Annotation> annotations() {
        InterfaceC5609Yh interfaceC5609Yh = this.EZpvd;
        if (interfaceC5609Yh instanceof WQ) {
            return ((WQ) interfaceC5609Yh).AEQbTJ();
        }
        if ((interfaceC5609Yh instanceof AnnotationCollector.OneAnnotation) || (interfaceC5609Yh instanceof AnnotationCollector.TwoAnnotations)) {
            throw new java.lang.UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.emptyList();
    }

    public boolean valueOf() {
        return this.EZpvd.size() > 0;
    }

    public AnnotatedConstructor djBIcL() {
        return EZpvd().AEQbTJ;
    }

    public java.util.List<AnnotatedConstructor> AYXKKw() {
        return EZpvd().EZpvd;
    }

    public java.util.List<AnnotatedMethod> gEmmrt() {
        return EZpvd().OLrzqt;
    }

    public java.lang.Iterable<AnnotatedMethod> DbNXlk() {
        return KWHzl();
    }

    public AnnotatedMethod copydefault(java.lang.String str, java.lang.Class<?>[] clsArr) {
        return KWHzl().AEQbTJ(str, clsArr);
    }

    public java.lang.Iterable<AnnotatedField> copydefault() {
        return OLrzqt();
    }

    public boolean fetchVPNInfo() {
        java.lang.Boolean boolValueOf = this.DbNXlk;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(C5619Yr.fIwbmz(this.OLrzqt));
            this.DbNXlk = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final java.util.List<AnnotatedField> OLrzqt() {
        java.util.List<AnnotatedField> listKWHzl = this.gEmmrt;
        if (listKWHzl == null) {
            JavaType javaType = this.isConnected;
            if (javaType == null) {
                listKWHzl = Collections.emptyList();
            } else {
                listKWHzl = WS.KWHzl(this.KWHzl, this, this.djBIcL, this.fetchVPNInfo, javaType, this.AYXKKw);
            }
            this.gEmmrt = listKWHzl;
        }
        return listKWHzl;
    }

    public final WR KWHzl() {
        WR wrAEQbTJ = this.valueOf;
        if (wrAEQbTJ == null) {
            JavaType javaType = this.isConnected;
            if (javaType == null) {
                wrAEQbTJ = new WR();
            } else {
                wrAEQbTJ = WO.AEQbTJ(this.KWHzl, this, this.djBIcL, this.fetchVPNInfo, javaType, this.values, this.AkhnZx, this.AYXKKw);
            }
            this.valueOf = wrAEQbTJ;
        }
        return wrAEQbTJ;
    }

    public final Application EZpvd() {
        Application applicationOLrzqt = this.AhwBna;
        if (applicationOLrzqt == null) {
            JavaType javaType = this.isConnected;
            applicationOLrzqt = javaType == null ? copydefault : WL.OLrzqt(this.KWHzl, this.fetchVPNInfo, this, javaType, this.AkhnZx, this.AYXKKw);
            this.AhwBna = applicationOLrzqt;
        }
        return applicationOLrzqt;
    }

    @Override // o.WM
    public java.lang.String toString() {
        return "[AnnotedClass " + this.OLrzqt.getName() + "]";
    }

    @Override // o.WM
    public int hashCode() {
        return this.OLrzqt.getName().hashCode();
    }

    @Override // o.WM
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return C5619Yr.AEQbTJ(obj, (java.lang.Class<?>) WJ.class) && ((WJ) obj).OLrzqt == this.OLrzqt;
    }

    public static final class Application {
        public final AnnotatedConstructor AEQbTJ;
        public final java.util.List<AnnotatedConstructor> EZpvd;
        public final java.util.List<AnnotatedMethod> OLrzqt;

        public Application(AnnotatedConstructor annotatedConstructor, java.util.List<AnnotatedConstructor> list, java.util.List<AnnotatedMethod> list2) {
            this.AEQbTJ = annotatedConstructor;
            this.EZpvd = list;
            this.OLrzqt = list2;
        }
    }
}
