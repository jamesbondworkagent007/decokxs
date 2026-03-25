package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.InterfaceC5609Yh;
import o.WQ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotationCollector {
    public static final InterfaceC5609Yh EZpvd = new NoAnnotations();
    public final Object KWHzl;

    public static class NoAnnotations implements InterfaceC5609Yh, Serializable {
        private static final long serialVersionUID = 1;

        @Override // o.InterfaceC5609Yh
        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        @Override // o.InterfaceC5609Yh
        public boolean has(Class<?> cls) {
            return false;
        }

        @Override // o.InterfaceC5609Yh
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // o.InterfaceC5609Yh
        public int size() {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC5609Yh AEQbTJ() {
        return EZpvd;
    }

    public abstract WQ EZpvd();

    public abstract InterfaceC5609Yh KWHzl();

    public abstract boolean OLrzqt(Annotation annotation);

    public abstract AnnotationCollector copydefault(Annotation annotation);

    public AnnotationCollector(Object obj) {
        this.KWHzl = obj;
    }

    public static AnnotationCollector copydefault() {
        return ActionBar.AEQbTJ;
    }

    public static class ActionBar extends AnnotationCollector {
        public static final ActionBar AEQbTJ = new ActionBar(null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public InterfaceC5609Yh KWHzl() {
            return AnnotationCollector.EZpvd;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean OLrzqt(Annotation annotation) {
            return false;
        }

        public ActionBar(Object obj) {
            super(obj);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public WQ EZpvd() {
            return new WQ();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector copydefault(Annotation annotation) {
            return new Application(this.KWHzl, annotation.annotationType(), annotation);
        }
    }

    public static class Application extends AnnotationCollector {
        public Annotation AEQbTJ;
        public Class<?> OLrzqt;

        public Application(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.OLrzqt = cls;
            this.AEQbTJ = annotation;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public InterfaceC5609Yh KWHzl() {
            return new OneAnnotation(this.OLrzqt, this.AEQbTJ);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public WQ EZpvd() {
            return WQ.EZpvd(this.OLrzqt, this.AEQbTJ);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean OLrzqt(Annotation annotation) {
            return annotation.annotationType() == this.OLrzqt;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector copydefault(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<?> cls = this.OLrzqt;
            if (cls != clsAnnotationType) {
                return new Activity(this.KWHzl, cls, this.AEQbTJ, clsAnnotationType, annotation);
            }
            this.AEQbTJ = annotation;
            return this;
        }
    }

    public static class Activity extends AnnotationCollector {
        public final HashMap<Class<?>, Annotation> OLrzqt;

        public Activity(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> map = new HashMap<>();
            this.OLrzqt = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public InterfaceC5609Yh KWHzl() {
            if (this.OLrzqt.size() == 2) {
                Iterator<Map.Entry<Class<?>, Annotation>> it = this.OLrzqt.entrySet().iterator();
                Map.Entry<Class<?>, Annotation> next = it.next();
                Map.Entry<Class<?>, Annotation> next2 = it.next();
                return new TwoAnnotations(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
            }
            return new WQ(this.OLrzqt);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public WQ EZpvd() {
            WQ wq = new WQ();
            Iterator<Annotation> it = this.OLrzqt.values().iterator();
            while (it.hasNext()) {
                wq.AEQbTJ(it.next());
            }
            return wq;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public boolean OLrzqt(Annotation annotation) {
            return this.OLrzqt.containsKey(annotation.annotationType());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public AnnotationCollector copydefault(Annotation annotation) {
            this.OLrzqt.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static class OneAnnotation implements InterfaceC5609Yh, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type;
        private final Annotation _value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5609Yh
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type == cls) {
                return (A) this._value;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5609Yh
        public boolean has(Class<?> cls) {
            return this._type == cls;
        }

        @Override // o.InterfaceC5609Yh
        public int size() {
            return 1;
        }

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this._type = cls;
            this._value = annotation;
        }

        @Override // o.InterfaceC5609Yh
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class TwoAnnotations implements InterfaceC5609Yh, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type1;
        private final Class<?> _type2;
        private final Annotation _value1;
        private final Annotation _value2;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5609Yh
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type1 == cls) {
                return (A) this._value1;
            }
            if (this._type2 == cls) {
                return (A) this._value2;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5609Yh
        public boolean has(Class<?> cls) {
            return this._type1 == cls || this._type2 == cls;
        }

        @Override // o.InterfaceC5609Yh
        public int size() {
            return 2;
        }

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this._type1 = cls;
            this._value1 = annotation;
            this._type2 = cls2;
            this._value2 = annotation2;
        }

        @Override // o.InterfaceC5609Yh
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type1 || cls == this._type2) {
                    return true;
                }
            }
            return false;
        }
    }
}
