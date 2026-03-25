package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import o.C5619Yr;
import o.InterfaceC5580Xe;
import o.WQ;

/* JADX INFO: loaded from: classes21.dex */
public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final JavaType _type;

    @Override // o.WM
    public AnnotatedElement getAnnotated() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getIndex() {
        return this._index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WM
    public String getName() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Type getParameterType() {
        return this._type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WM
    public JavaType getType() {
        return this._type;
    }

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, InterfaceC5580Xe interfaceC5580Xe, WQ wq, int i) {
        super(interfaceC5580Xe, wq);
        this._owner = annotatedWithParams;
        this._type = javaType;
        this._index = i;
    }

    /* JADX DEBUG: Method merged with bridge method: withAnnotations(Lo/WQ;)Lo/WM; */
    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedParameter withAnnotations(WQ wq) {
        return wq == this._annotations ? this : this._owner.replaceParameterAnnotations(this._index, wq);
    }

    @Override // o.WM
    public int getModifiers() {
        return this._owner.getModifiers();
    }

    @Override // o.WM
    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._owner.getMember();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // o.WM
    public int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    @Override // o.WM
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C5619Yr.AEQbTJ(obj, (Class<?>) AnnotatedParameter.class)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        return annotatedParameter._owner.equals(this._owner) && annotatedParameter._index == this._index;
    }

    @Override // o.WM
    public String toString() {
        return "[parameter #" + getIndex() + ", annotations: " + this._annotations + "]";
    }
}
