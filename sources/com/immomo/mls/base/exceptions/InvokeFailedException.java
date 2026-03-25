package com.immomo.mls.base.exceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes22.dex */
public final class InvokeFailedException extends IllegalStateException {
    public InvokeFailedException(Method method, Object[] objArr, Throwable th) {
        super(String.format("call method %s(%s) failed.", method.getName(), getParamsString(objArr)), th);
    }

    public InvokeFailedException(Constructor constructor, Object[] objArr, Throwable th) {
        super(String.format("call constructor %s(%s) failed.", constructor.getName(), getParamsString(objArr)), th);
    }

    public InvokeFailedException(String str) {
        super(str);
    }

    public InvokeFailedException(String str, Throwable th) {
        super(str, th);
    }

    private static String getParamsString(Object[] objArr) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(obj.getClass().getName());
            }
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
