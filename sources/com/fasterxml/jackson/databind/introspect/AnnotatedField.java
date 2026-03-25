package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import o.C5619Yr;
import o.InterfaceC5580Xe;
import o.WQ;

/* JADX INFO: loaded from: classes21.dex */
public final class AnnotatedField extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Field _field;
    protected Serialization _serialization;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getAnnotated()Ljava/lang/reflect/AnnotatedElement; */
    @Override // o.WM
    public Field getAnnotated() {
        return this._field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._field;
    }

    public AnnotatedField(InterfaceC5580Xe interfaceC5580Xe, Field field, WQ wq) {
        super(interfaceC5580Xe, wq);
        this._field = field;
    }

    /* JADX DEBUG: Method merged with bridge method: withAnnotations(Lo/WQ;)Lo/WM; */
    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedField withAnnotations(WQ wq) {
        return new AnnotatedField(this._typeContext, this._field, wq);
    }

    public AnnotatedField(Serialization serialization) {
        super(null, null);
        this._field = null;
        this._serialization = serialization;
    }

    @Override // o.WM
    public int getModifiers() {
        return this._field.getModifiers();
    }

    @Override // o.WM
    public String getName() {
        return this._field.getName();
    }

    @Override // o.WM
    public Class<?> getRawType() {
        return this._field.getType();
    }

    @Override // o.WM
    public JavaType getType() {
        return this._typeContext.copydefault(this._field.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e.getMessage(), e);
        }
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    @Override // o.WM
    public int hashCode() {
        return this._field.getName().hashCode();
    }

    @Override // o.WM
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C5619Yr.AEQbTJ(obj, (Class<?>) AnnotatedField.class)) {
            return false;
        }
        Field field = ((AnnotatedField) obj)._field;
        if (field == null) {
            return this._field == null;
        }
        return field.equals(this._field);
    }

    @Override // o.WM
    public String toString() {
        return "[field " + getFullName() + "]";
    }

    public Object writeReplace() {
        return new AnnotatedField(new Serialization(this._field));
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Field declaredField = cls.getDeclaredField(serialization.name);
            if (!declaredField.isAccessible()) {
                C5619Yr.EZpvd((Member) declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Field field) {
            this.clazz = field.getDeclaringClass();
            this.name = field.getName();
        }
    }
}
