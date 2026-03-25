package com.okinc.localization.hooker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes9.dex */
public class Reflector {
    public Field AEQbTJ;
    public Object EZpvd;
    public Class<?> KWHzl;
    public Constructor OLrzqt;
    public Method copydefault;

    public static class ReflectedException extends Exception {
        public ReflectedException(String str) {
            super(str);
        }

        public ReflectedException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Reflector EZpvd(@NonNull Class<?> cls) {
        Reflector reflector = new Reflector();
        reflector.KWHzl = cls;
        return reflector;
    }

    public static Reflector KWHzl(@NonNull Object obj) throws ReflectedException {
        return EZpvd(obj.getClass()).copydefault(obj);
    }

    public Object EZpvd(@Nullable Object obj) throws ReflectedException {
        if (obj == null || this.KWHzl.isInstance(obj)) {
            return obj;
        }
        throw new ReflectedException("Caller [" + obj + "] is not a instance of type [" + this.KWHzl + "]!");
    }

    public void OLrzqt(@Nullable Object obj, @Nullable Member member, @NonNull String str) throws ReflectedException {
        if (member == null) {
            throw new ReflectedException(str + " was null!");
        }
        if (obj == null && !Modifier.isStatic(member.getModifiers())) {
            throw new ReflectedException("Need a caller!");
        }
        EZpvd(obj);
    }

    public Reflector copydefault(@Nullable Object obj) throws ReflectedException {
        this.EZpvd = EZpvd(obj);
        return this;
    }

    public Reflector OLrzqt(@NonNull String str) throws ReflectedException {
        try {
            Field fieldCopydefault = copydefault(str);
            this.AEQbTJ = fieldCopydefault;
            fieldCopydefault.setAccessible(true);
            this.OLrzqt = null;
            this.copydefault = null;
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Field copydefault(@NonNull String str) throws NoSuchFieldException {
        try {
            return this.KWHzl.getField(str);
        } catch (NoSuchFieldException e) {
            for (Class<?> superclass = this.KWHzl; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e;
        }
    }

    public Reflector AEQbTJ(@Nullable Object obj) throws ReflectedException {
        return OLrzqt(this.EZpvd, obj);
    }

    public Reflector OLrzqt(@Nullable Object obj, @Nullable Object obj2) throws ReflectedException {
        OLrzqt(obj, this.AEQbTJ, "Field");
        try {
            this.AEQbTJ.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }
}
