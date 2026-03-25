package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import o.AbstractC5531Vh;
import o.C5619Yr;

/* JADX INFO: loaded from: classes21.dex */
public abstract class JavaType extends AbstractC5531Vh implements Serializable, Type {
    private static final long serialVersionUID = 1;
    public final boolean _asStatic;
    public final Class<?> _class;
    protected final int _hash;
    public final Object _typeHandler;
    public final Object _valueHandler;

    @Deprecated
    public abstract JavaType _narrow(Class<?> cls);

    /* JADX DEBUG: Method merged with bridge method: containedType(I)Lo/Vh; */
    @Override // o.AbstractC5531Vh
    public abstract JavaType containedType(int i);

    @Override // o.AbstractC5531Vh
    public abstract int containedTypeCount();

    @Override // o.AbstractC5531Vh
    @Deprecated
    public abstract String containedTypeName(int i);

    public abstract boolean equals(Object obj);

    public abstract JavaType findSuperType(Class<?> cls);

    public abstract JavaType[] findTypeParameters(Class<?> cls);

    public abstract TypeBindings getBindings();

    /* JADX DEBUG: Method merged with bridge method: getContentType()Lo/Vh; */
    @Override // o.AbstractC5531Vh
    public JavaType getContentType() {
        return null;
    }

    public Object getContentTypeHandler() {
        return null;
    }

    public Object getContentValueHandler() {
        return null;
    }

    public abstract StringBuilder getErasedSignature(StringBuilder sb);

    public abstract StringBuilder getGenericSignature(StringBuilder sb);

    public abstract List<JavaType> getInterfaces();

    /* JADX DEBUG: Method merged with bridge method: getKeyType()Lo/Vh; */
    @Override // o.AbstractC5531Vh
    public JavaType getKeyType() {
        return null;
    }

    @Override // o.AbstractC5531Vh
    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5531Vh
    public final Class<?> getRawClass() {
        return this._class;
    }

    /* JADX DEBUG: Method merged with bridge method: getReferencedType()Lo/Vh; */
    @Override // o.AbstractC5531Vh
    public JavaType getReferencedType() {
        return null;
    }

    public abstract JavaType getSuperClass();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public <T> T getTypeHandler() {
        return (T) this._typeHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public <T> T getValueHandler() {
        return (T) this._valueHandler;
    }

    public boolean hasContentType() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasHandlers() {
        return (this._typeHandler == null && this._valueHandler == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5531Vh
    public final boolean hasRawClass(Class<?> cls) {
        return this._class == cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasValueHandler() {
        return this._valueHandler != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hashCode() {
        return this._hash;
    }

    @Override // o.AbstractC5531Vh
    public boolean isArrayType() {
        return false;
    }

    @Override // o.AbstractC5531Vh
    public boolean isCollectionLikeType() {
        return false;
    }

    @Override // o.AbstractC5531Vh
    public abstract boolean isContainerType();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isJavaLangObject() {
        return this._class == Object.class;
    }

    @Override // o.AbstractC5531Vh
    public boolean isMapLikeType() {
        return false;
    }

    public abstract JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract String toString();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean useStaticType() {
        return this._asStatic;
    }

    public abstract JavaType withContentType(JavaType javaType);

    public abstract JavaType withContentTypeHandler(Object obj);

    public abstract JavaType withContentValueHandler(Object obj);

    public abstract JavaType withStaticTyping();

    public abstract JavaType withTypeHandler(Object obj);

    public abstract JavaType withValueHandler(Object obj);

    public JavaType(Class<?> cls, int i, Object obj, Object obj2, boolean z) {
        this._class = cls;
        this._hash = cls.getName().hashCode() + i;
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z;
    }

    public JavaType(JavaType javaType) {
        this._class = javaType._class;
        this._hash = javaType._hash;
        this._valueHandler = javaType._valueHandler;
        this._typeHandler = javaType._typeHandler;
        this._asStatic = javaType._asStatic;
    }

    public JavaType withHandlersFrom(JavaType javaType) {
        Object typeHandler = javaType.getTypeHandler();
        JavaType javaTypeWithTypeHandler = typeHandler != this._typeHandler ? withTypeHandler(typeHandler) : this;
        Object valueHandler = javaType.getValueHandler();
        return valueHandler != this._valueHandler ? javaTypeWithTypeHandler.withValueHandler(valueHandler) : javaTypeWithTypeHandler;
    }

    @Deprecated
    public JavaType forcedNarrowBy(Class<?> cls) {
        return cls == this._class ? this : _narrow(cls);
    }

    public final boolean isTypeOrSubTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean isTypeOrSuperTypeOf(Class<?> cls) {
        Class<?> cls2 = this._class;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    @Override // o.AbstractC5531Vh
    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    @Override // o.AbstractC5531Vh
    public boolean isConcrete() {
        if ((this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    @Override // o.AbstractC5531Vh
    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    @Override // o.AbstractC5531Vh
    public final boolean isEnumType() {
        return C5619Yr.AkhnZx(this._class);
    }

    public final boolean isEnumImplType() {
        return C5619Yr.AkhnZx(this._class) && this._class != Enum.class;
    }

    public final boolean isRecordType() {
        return C5619Yr.iwGUEr(this._class);
    }

    @Override // o.AbstractC5531Vh
    public final boolean isInterface() {
        return this._class.isInterface();
    }

    @Override // o.AbstractC5531Vh
    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    @Override // o.AbstractC5531Vh
    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    @Override // o.AbstractC5531Vh
    public boolean hasGenericTypes() {
        return containedTypeCount() > 0;
    }

    public JavaType containedTypeOrUnknown(int i) {
        JavaType javaTypeContainedType = containedType(i);
        return javaTypeContainedType == null ? TypeFactory.unknownType() : javaTypeContainedType;
    }

    public String getGenericSignature() {
        StringBuilder sb = new StringBuilder(40);
        getGenericSignature(sb);
        return sb.toString();
    }

    public String getErasedSignature() {
        StringBuilder sb = new StringBuilder(40);
        getErasedSignature(sb);
        return sb.toString();
    }
}
