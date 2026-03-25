package o;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/* JADX INFO: renamed from: o.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5564Wo {
    public final AnnotatedWithParams AEQbTJ;
    public final AnnotationIntrospector EZpvd;
    public final int KWHzl;
    public final TaskDescription[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnotatedWithParams OLrzqt() {
        return this.AEQbTJ;
    }

    public C5564Wo(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, TaskDescription[] taskDescriptionArr, int i) {
        this.EZpvd = annotationIntrospector;
        this.AEQbTJ = annotatedWithParams;
        this.copydefault = taskDescriptionArr;
        this.KWHzl = i;
    }

    public static C5564Wo copydefault(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, WT[] wtArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        TaskDescription[] taskDescriptionArr = new TaskDescription[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
            taskDescriptionArr[i] = new TaskDescription(parameter, wtArr == null ? null : wtArr[i], annotationIntrospector.findInjectableValue(parameter));
        }
        return new C5564Wo(annotationIntrospector, annotatedWithParams, taskDescriptionArr, parameterCount);
    }

    public JacksonInject.Value OLrzqt(int i) {
        return this.copydefault[i].AEQbTJ;
    }

    public AnnotatedParameter EZpvd(int i) {
        return this.copydefault[i].EZpvd;
    }

    public WT valueOf(int i) {
        return this.copydefault[i].copydefault;
    }

    public PropertyName KWHzl(int i) {
        WT wt = this.copydefault[i].copydefault;
        if (wt != null) {
            return wt.isConnected();
        }
        return null;
    }

    public PropertyName copydefault(int i) {
        WT wt = this.copydefault[i].copydefault;
        if (wt == null || !wt.wlaJM()) {
            return null;
        }
        return wt.isConnected();
    }

    public PropertyName AEQbTJ(int i) {
        java.lang.String strFindImplicitPropertyName = this.EZpvd.findImplicitPropertyName(this.copydefault[i].EZpvd);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    public int KWHzl() {
        int i = -1;
        for (int i2 = 0; i2 < this.KWHzl; i2++) {
            if (this.copydefault[i2].AEQbTJ == null) {
                if (i >= 0) {
                    return -1;
                }
                i = i2;
            }
        }
        return i;
    }

    public java.lang.String toString() {
        return this.AEQbTJ.toString();
    }

    /* JADX INFO: renamed from: o.Wo$TaskDescription */
    public static final class TaskDescription {
        public final JacksonInject.Value AEQbTJ;
        public final AnnotatedParameter EZpvd;
        public final WT copydefault;

        public TaskDescription(AnnotatedParameter annotatedParameter, WT wt, JacksonInject.Value value) {
            this.EZpvd = annotatedParameter;
            this.copydefault = wt;
            this.AEQbTJ = value;
        }
    }
}
