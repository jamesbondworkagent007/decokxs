package com.fasterxml.jackson.databind.introspect;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;
import o.C5619Yr;
import o.InterfaceC5580Xe;
import o.WM;
import o.WQ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotatedMember extends WM implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient WQ _annotations;
    protected final transient InterfaceC5580Xe _typeContext;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WQ getAllAnnotations() {
        return this._annotations;
    }

    public abstract Class<?> getDeclaringClass();

    public abstract Member getMember();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public InterfaceC5580Xe getTypeContext() {
        return this._typeContext;
    }

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract WM withAnnotations(WQ wq);

    public AnnotatedMember(InterfaceC5580Xe interfaceC5580Xe, WQ wq) {
        this._typeContext = interfaceC5580Xe;
        this._annotations = wq;
    }

    public AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }

    public String getFullName() {
        return getDeclaringClass().getName() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + getName();
    }

    @Override // o.WM
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        WQ wq = this._annotations;
        if (wq == null) {
            return null;
        }
        return (A) wq.get(cls);
    }

    @Override // o.WM
    public final boolean hasAnnotation(Class<?> cls) {
        WQ wq = this._annotations;
        if (wq == null) {
            return false;
        }
        return wq.has(cls);
    }

    @Override // o.WM
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        WQ wq = this._annotations;
        if (wq == null) {
            return false;
        }
        return wq.hasOneOf(clsArr);
    }

    @Override // o.WM
    @Deprecated
    public Iterable<Annotation> annotations() {
        WQ wq = this._annotations;
        if (wq == null) {
            return Collections.emptyList();
        }
        return wq.AEQbTJ();
    }

    public final void fixAccess(boolean z) {
        Member member = getMember();
        if (member != null) {
            C5619Yr.EZpvd(member, z);
        }
    }
}
