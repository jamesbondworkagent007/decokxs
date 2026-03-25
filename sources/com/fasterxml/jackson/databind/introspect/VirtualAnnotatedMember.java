package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import o.C5619Yr;
import o.InterfaceC5580Xe;
import o.WM;
import o.WQ;

/* JADX INFO: loaded from: classes21.dex */
public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _declaringClass;
    protected final String _name;
    protected final JavaType _type;

    /* JADX DEBUG: Method merged with bridge method: getAnnotated()Ljava/lang/reflect/AnnotatedElement; */
    @Override // o.WM
    public Field getAnnotated() {
        return null;
    }

    public int getAnnotationCount() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return null;
    }

    @Override // o.WM
    public int getModifiers() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WM
    public String getName() {
        return this._name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WM
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public WM withAnnotations(WQ wq) {
        return this;
    }

    public VirtualAnnotatedMember(InterfaceC5580Xe interfaceC5580Xe, Class<?> cls, String str, JavaType javaType) {
        super(interfaceC5580Xe, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    @Override // o.WM
    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this._name + "'");
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this._name + "'");
    }

    @Override // o.WM
    public int hashCode() {
        return this._name.hashCode();
    }

    @Override // o.WM
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C5619Yr.AEQbTJ(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    @Override // o.WM
    public String toString() {
        return "[virtual " + getFullName() + "]";
    }
}
