package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.ibm.icu.text.DateFormat;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5619Yr;

/* JADX INFO: loaded from: classes21.dex */
public class TypeBindings implements Serializable {
    private static final TypeBindings EMPTY;
    private static final String[] NO_STRINGS;
    private static final JavaType[] NO_TYPES;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this._hashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType[] typeParameterArray() {
        return this._types;
    }

    static {
        String[] strArr = new String[0];
        NO_STRINGS = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        NO_TYPES = javaTypeArr;
        EMPTY = new TypeBindings(strArr, javaTypeArr, null);
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? NO_STRINGS : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? NO_TYPES : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
        }
        int length = javaTypeArr.length;
        int iHashCode = 1;
        for (int i = 0; i < length; i++) {
            iHashCode += this._types[i].hashCode();
        }
        this._unboundVariables = strArr2;
        this._hashCode = iHashCode;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? EMPTY : this;
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? NO_TYPES : (JavaType[]) list.toArray(NO_TYPES));
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = NO_STRINGS;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : DateFormat.SECOND);
            sb.append(": class expects ");
            sb.append(strArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] typeVariableArrOLrzqt = Activity.OLrzqt(cls);
        int length = typeVariableArrOLrzqt == null ? 0 : typeVariableArrOLrzqt.length;
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new TypeBindings(new String[]{typeVariableArrOLrzqt[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] typeVariableArrEZpvd = Activity.EZpvd(cls);
        int length = typeVariableArrEZpvd == null ? 0 : typeVariableArrEZpvd.length;
        if (length != 2) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
        }
        return new TypeBindings(new String[]{typeVariableArrEZpvd[0].getName(), typeVariableArrEZpvd[1].getName()}, new JavaType[]{javaType, javaType2}, null);
    }

    public static TypeBindings create(List<String> list, List<JavaType> list2) {
        return (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) ? EMPTY : new TypeBindings((String[]) list.toArray(NO_STRINGS), (JavaType[]) list2.toArray(NO_TYPES), null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return EMPTY;
        }
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : DateFormat.SECOND);
            sb.append(": class expects ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public TypeBindings withUnboundVariable(String str) {
        String[] strArr = this._unboundVariables;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this._names, this._types, strArr2);
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this._names[i])) {
                JavaType javaType = this._types[i];
                return (!(javaType instanceof ResolvedRecursiveType) || (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) == null) ? javaType : selfReferencedType;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this._types.length == 0;
    }

    public int size() {
        return this._types.length;
    }

    public String getBoundName(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this._names;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public JavaType getBoundType(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        if (javaTypeArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public Object asKey(Class<?> cls) {
        return new ActionBar(cls, this._types, this._hashCode);
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int length = this._types.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(this._types[i].getGenericSignature());
        }
        sb.append('>');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!C5619Yr.AEQbTJ(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr[i].equals(this._types[i])) {
                return false;
            }
        }
        return true;
    }

    public static class Activity {
        public static final TypeVariable<?>[] KWHzl = AbstractList.class.getTypeParameters();
        public static final TypeVariable<?>[] OLrzqt = Collection.class.getTypeParameters();
        public static final TypeVariable<?>[] EZpvd = Iterable.class.getTypeParameters();
        public static final TypeVariable<?>[] djBIcL = List.class.getTypeParameters();
        public static final TypeVariable<?>[] AEQbTJ = ArrayList.class.getTypeParameters();
        public static final TypeVariable<?>[] AhwBna = Map.class.getTypeParameters();
        public static final TypeVariable<?>[] copydefault = HashMap.class.getTypeParameters();
        public static final TypeVariable<?>[] gEmmrt = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable<?>[] OLrzqt(Class<?> cls) {
            return cls == Collection.class ? OLrzqt : cls == List.class ? djBIcL : cls == ArrayList.class ? AEQbTJ : cls == AbstractList.class ? KWHzl : cls == Iterable.class ? EZpvd : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] EZpvd(Class<?> cls) {
            return cls == Map.class ? AhwBna : cls == HashMap.class ? copydefault : cls == LinkedHashMap.class ? gEmmrt : cls.getTypeParameters();
        }
    }

    public static final class ActionBar {
        public final int AEQbTJ;
        public final JavaType[] OLrzqt;
        public final Class<?> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ;
        }

        public ActionBar(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this.copydefault = cls;
            this.OLrzqt = javaTypeArr;
            this.AEQbTJ = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != ActionBar.class) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            if (this.AEQbTJ == actionBar.AEQbTJ && this.copydefault == actionBar.copydefault) {
                JavaType[] javaTypeArr = actionBar.OLrzqt;
                int length = this.OLrzqt.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this.OLrzqt[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return this.copydefault.getName() + "<>";
        }
    }
}
