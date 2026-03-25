package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.InterfaceC5580Xe;
import o.WQ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final WQ[] _paramAnnotations;

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    @Deprecated
    public abstract Type getGenericParameterType(int i);

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i);

    public abstract Class<?> getRawParameterType(int i);

    public AnnotatedWithParams(InterfaceC5580Xe interfaceC5580Xe, WQ wq, WQ[] wqArr) {
        super(interfaceC5580Xe, wq);
        this._paramAnnotations = wqArr;
    }

    public AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, WQ[] wqArr) {
        super(annotatedWithParams);
        this._paramAnnotations = wqArr;
    }

    public final void addOrOverrideParam(int i, Annotation annotation) {
        WQ wq = this._paramAnnotations[i];
        if (wq == null) {
            wq = new WQ();
            this._paramAnnotations[i] = wq;
        }
        wq.AEQbTJ(annotation);
    }

    public AnnotatedParameter replaceParameterAnnotations(int i, WQ wq) {
        this._paramAnnotations[i] = wq;
        return getParameter(i);
    }

    public final WQ getParameterAnnotations(int i) {
        WQ[] wqArr = this._paramAnnotations;
        if (wqArr == null || i < 0 || i >= wqArr.length) {
            return null;
        }
        return wqArr[i];
    }

    public final AnnotatedParameter getParameter(int i) {
        return new AnnotatedParameter(this, getParameterType(i), this._typeContext, getParameterAnnotations(i), i);
    }

    public final int getAnnotationCount() {
        return this._annotations.size();
    }
}
