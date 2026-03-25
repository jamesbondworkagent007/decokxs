package o;

import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: o.yRt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56772yRt {
    public static final java.util.Map<C56933yXs, C56766yRn> AEQbTJ;
    public static final java.util.List<AnnotationQualifierApplicabilityType> EZpvd;
    public static final java.util.Map<C56933yXs, C56766yRn> KWHzl;
    public static final java.util.Map<C56933yXs, C56766yRn> OLrzqt;
    public static final java.util.List<AnnotationQualifierApplicabilityType> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.Map<C56933yXs, C56766yRn> AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.Map<C56933yXs, C56766yRn> OLrzqt() {
        return OLrzqt;
    }

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        java.util.List<AnnotationQualifierApplicabilityType> listGEmmrt = yDY.gEmmrt(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        copydefault = listGEmmrt;
        java.util.List<AnnotationQualifierApplicabilityType> listEZpvd = C56402yEa.EZpvd(annotationQualifierApplicabilityType3);
        EZpvd = listEZpvd;
        C56933yXs c56933yXsDbNXlk = yRC.DbNXlk();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        java.util.Map<C56933yXs, C56766yRn> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(c56933yXsDbNXlk, new C56766yRn(new C56858yUy(nullabilityQualifier, false, 2, null), listGEmmrt, false)), C56390yDp.OLrzqt(yRC.djBIcL(), new C56766yRn(new C56858yUy(nullabilityQualifier, false, 2, null), listGEmmrt, false)), C56390yDp.OLrzqt(yRC.valueOf(), new C56766yRn(new C56858yUy(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null), listGEmmrt, false, 4, null)));
        OLrzqt = mapGEmmrt;
        java.util.Map<C56933yXs, C56766yRn> mapGEmmrt2 = C56424yEw.gEmmrt(C56390yDp.OLrzqt(yRC.copydefault(), new C56766yRn(new C56858yUy(nullabilityQualifier, false, 2, null), listEZpvd, false, 4, null)), C56390yDp.OLrzqt(yRC.OLrzqt(), new C56766yRn(new C56858yUy(NullabilityQualifier.NULLABLE, false, 2, null), listEZpvd, false, 4, null)));
        KWHzl = mapGEmmrt2;
        AEQbTJ = C56424yEw.OLrzqt(mapGEmmrt, mapGEmmrt2);
    }
}
