package o;

import com.okinc.lib.dionysus.instrumentation.ReflectException;

/* JADX INFO: loaded from: classes9.dex */
public class pIZ {
    public java.lang.Class<?> KWHzl;

    public pIZ(java.lang.String str) {
        copydefault(str, "ClassName can not be empty!");
        try {
            this.KWHzl = java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new ReflectException("Class:" + str + " can not be found!", e.getCause());
        }
    }

    public static pIZ OLrzqt(java.lang.String str) {
        return new pIZ(str);
    }

    public final Activity EZpvd(java.lang.String str, java.lang.Class<?>... clsArr) throws ReflectException {
        java.lang.reflect.Method declaredMethod;
        copydefault(str, "MethodName can not be empty!");
        if (clsArr != null) {
            try {
                if (clsArr.length == 0) {
                    declaredMethod = this.KWHzl.getDeclaredMethod(str, new java.lang.Class[0]);
                } else {
                    declaredMethod = this.KWHzl.getDeclaredMethod(str, clsArr);
                }
            } catch (java.lang.Exception e) {
                throw new ReflectException(e.getMessage());
            }
        } else {
            declaredMethod = this.KWHzl.getDeclaredMethod(str, new java.lang.Class[0]);
        }
        declaredMethod.setAccessible(true);
        return Activity.copydefault(declaredMethod);
    }

    public static final class Activity {
        public java.lang.reflect.Method EZpvd;

        public Activity(java.lang.reflect.Method method) {
            this.EZpvd = method;
        }

        public static Activity copydefault(java.lang.reflect.Method method) {
            return new Activity(method);
        }

        public java.lang.Object copydefault(java.lang.Object obj, java.lang.Object... objArr) throws ReflectException {
            java.lang.reflect.Method method = this.EZpvd;
            if (method == null) {
                return null;
            }
            if (obj == null && (method.getModifiers() & 8) == 0) {
                throw new ReflectException("Invoker can not be null!");
            }
            if (objArr != null) {
                try {
                    if (objArr.length != 0) {
                        return this.EZpvd.invoke(obj, objArr);
                    }
                } catch (java.lang.Exception e) {
                    throw new ReflectException(e.getMessage());
                }
            }
            return this.EZpvd.invoke(obj, new java.lang.Object[0]);
        }
    }

    public final StateListAnimator KWHzl(java.lang.String str) throws ReflectException {
        copydefault(str, "FieldName can not be empty!");
        try {
            java.lang.reflect.Field declaredField = this.KWHzl.getDeclaredField(str);
            declaredField.setAccessible(true);
            return StateListAnimator.OLrzqt(declaredField);
        } catch (java.lang.Exception e) {
            throw new ReflectException(e.getMessage());
        }
    }

    public static final class StateListAnimator {
        public java.lang.reflect.Field copydefault;

        public StateListAnimator(java.lang.reflect.Field field) {
            this.copydefault = field;
        }

        public static StateListAnimator OLrzqt(java.lang.reflect.Field field) {
            return new StateListAnimator(field);
        }

        public void OLrzqt(java.lang.Object obj, java.lang.Object obj2) throws ReflectException {
            java.lang.reflect.Field field = this.copydefault;
            if (field == null) {
                return;
            }
            if (obj == null && (field.getModifiers() & 8) == 0) {
                throw new ReflectException("Target object can not be null!");
            }
            try {
                this.copydefault.set(obj, obj2);
            } catch (java.lang.Exception e) {
                throw new ReflectException(e.getMessage());
            }
        }

        public java.lang.Object OLrzqt(java.lang.Object obj) throws ReflectException {
            java.lang.reflect.Field field = this.copydefault;
            if (field == null) {
                return null;
            }
            if (obj == null && (field.getModifiers() & 8) == 0) {
                throw new ReflectException("Target object can not be null!");
            }
            try {
                return this.copydefault.get(obj);
            } catch (java.lang.Exception e) {
                throw new ReflectException(e.getMessage());
            }
        }
    }

    public static void copydefault(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new ReflectException(java.lang.String.valueOf(str2));
        }
    }
}
