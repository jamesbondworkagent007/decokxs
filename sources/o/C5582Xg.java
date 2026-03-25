package o;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.util.Collections;

/* JADX INFO: renamed from: o.Xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5582Xg {
    public static java.lang.String[] AEQbTJ(java.lang.Class<?> cls) {
        return TaskDescription.copydefault().AEQbTJ(cls);
    }

    public static AnnotatedConstructor AEQbTJ(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, java.util.List<java.lang.String> list) {
        return new StateListAnimator(deserializationContext, abstractC5549Vz).AEQbTJ(list);
    }

    /* JADX INFO: renamed from: o.Xg$TaskDescription */
    public static class TaskDescription {
        public static final java.lang.RuntimeException EZpvd;
        public static final TaskDescription KWHzl;
        public final java.lang.reflect.Method AEQbTJ;
        public final java.lang.reflect.Method OLrzqt;
        public final java.lang.reflect.Method copydefault;

        static {
            TaskDescription taskDescription = null;
            try {
                e = null;
                taskDescription = new TaskDescription();
            } catch (java.lang.RuntimeException e) {
                e = e;
            }
            KWHzl = taskDescription;
            EZpvd = e;
        }

        private TaskDescription() throws java.lang.RuntimeException {
            try {
                this.AEQbTJ = java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]);
                java.lang.Class<?> cls = java.lang.Class.forName("java.lang.reflect.RecordComponent");
                this.OLrzqt = cls.getMethod("getName", new java.lang.Class[0]);
                this.copydefault = cls.getMethod("getType", new java.lang.Class[0]);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(java.lang.String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e.getClass().getName(), e.getMessage()), e);
            }
        }

        public static TaskDescription copydefault() {
            java.lang.RuntimeException runtimeException = EZpvd;
            if (runtimeException == null) {
                return KWHzl;
            }
            throw runtimeException;
        }

        public java.lang.String[] AEQbTJ(java.lang.Class<?> cls) throws java.lang.IllegalArgumentException {
            java.lang.Object[] objArrCopydefault = copydefault(cls);
            if (objArrCopydefault == null) {
                return null;
            }
            java.lang.String[] strArr = new java.lang.String[objArrCopydefault.length];
            for (int i = 0; i < objArrCopydefault.length; i++) {
                try {
                    strArr[i] = (java.lang.String) this.OLrzqt.invoke(objArrCopydefault[i], new java.lang.Object[0]);
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Failed to access name of field #%d (of %d) of Record type %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(objArrCopydefault.length), C5619Yr.uzCIH(cls)), e);
                }
            }
            return strArr;
        }

        public Application[] OLrzqt(java.lang.Class<?> cls) throws java.lang.IllegalArgumentException {
            java.lang.Object[] objArrCopydefault = copydefault(cls);
            if (objArrCopydefault == null) {
                return null;
            }
            Application[] applicationArr = new Application[objArrCopydefault.length];
            for (int i = 0; i < objArrCopydefault.length; i++) {
                try {
                    try {
                        applicationArr[i] = new Application((java.lang.Class) this.copydefault.invoke(objArrCopydefault[i], new java.lang.Object[0]), (java.lang.String) this.OLrzqt.invoke(objArrCopydefault[i], new java.lang.Object[0]));
                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Failed to access type of field #%d (of %d) of Record type %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(objArrCopydefault.length), C5619Yr.uzCIH(cls)), e);
                    }
                } catch (java.lang.Exception e2) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Failed to access name of field #%d (of %d) of Record type %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(objArrCopydefault.length), C5619Yr.uzCIH(cls)), e2);
                }
            }
            return applicationArr;
        }

        public java.lang.Object[] copydefault(java.lang.Class<?> cls) throws java.lang.IllegalArgumentException {
            try {
                return (java.lang.Object[]) this.AEQbTJ.invoke(cls, new java.lang.Object[0]);
            } catch (java.lang.Exception e) {
                if (C5622Yv.KWHzl(e)) {
                    return null;
                }
                throw new java.lang.IllegalArgumentException("Failed to access RecordComponents of type " + C5619Yr.uzCIH(cls));
            }
        }
    }

    /* JADX INFO: renamed from: o.Xg$Application */
    public static class Application {
        public final java.lang.Class<?> OLrzqt;
        public final java.lang.String copydefault;

        public Application(java.lang.Class<?> cls, java.lang.String str) {
            this.OLrzqt = cls;
            this.copydefault = str;
        }
    }

    /* JADX INFO: renamed from: o.Xg$StateListAnimator */
    public static class StateListAnimator {
        public final AnnotationIntrospector AEQbTJ;
        public final java.util.List<AnnotatedConstructor> EZpvd;
        public final AnnotatedConstructor KWHzl;
        public final DeserializationConfig OLrzqt;
        public final AbstractC5549Vz copydefault;
        public final Application[] djBIcL;

        public StateListAnimator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz) {
            this.copydefault = abstractC5549Vz;
            this.AEQbTJ = deserializationContext.getAnnotationIntrospector();
            this.OLrzqt = deserializationContext.getConfig();
            Application[] applicationArrOLrzqt = TaskDescription.copydefault().OLrzqt(abstractC5549Vz.DbNXlk());
            this.djBIcL = applicationArrOLrzqt;
            AnnotatedConstructor annotatedConstructorAEQbTJ = null;
            if (applicationArrOLrzqt == null) {
                this.EZpvd = abstractC5549Vz.fARcdN();
                this.KWHzl = null;
                return;
            }
            int length = applicationArrOLrzqt.length;
            if (length == 0) {
                annotatedConstructorAEQbTJ = abstractC5549Vz.AEQbTJ();
                this.EZpvd = Collections.singletonList(annotatedConstructorAEQbTJ);
            } else {
                java.util.List<AnnotatedConstructor> listFARcdN = abstractC5549Vz.fARcdN();
                this.EZpvd = listFARcdN;
                java.util.Iterator<AnnotatedConstructor> it = listFARcdN.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedConstructor next = it.next();
                    if (next.getParameterCount() == length) {
                        for (int i = 0; i < length; i++) {
                            if (!next.getRawParameterType(i).equals(this.djBIcL[i].OLrzqt)) {
                                break;
                            }
                        }
                        annotatedConstructorAEQbTJ = next;
                        break loop0;
                    }
                }
            }
            if (annotatedConstructorAEQbTJ != null) {
                this.KWHzl = annotatedConstructorAEQbTJ;
                return;
            }
            throw new java.lang.IllegalArgumentException("Failed to find the canonical Record constructor of type " + C5619Yr.copydefault(this.copydefault.getNewProxyInstance()));
        }

        public AnnotatedConstructor AEQbTJ(java.util.List<java.lang.String> list) {
            for (AnnotatedConstructor annotatedConstructor : this.EZpvd) {
                JsonCreator.Mode modeFindCreatorAnnotation = this.AEQbTJ.findCreatorAnnotation(this.OLrzqt, annotatedConstructor);
                if (modeFindCreatorAnnotation != null && JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation && (JsonCreator.Mode.DELEGATING == modeFindCreatorAnnotation || annotatedConstructor != this.KWHzl)) {
                    return null;
                }
            }
            Application[] applicationArr = this.djBIcL;
            if (applicationArr == null) {
                return null;
            }
            for (Application application : applicationArr) {
                list.add(application.copydefault);
            }
            return this.KWHzl;
        }
    }
}
