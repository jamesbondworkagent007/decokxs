package o;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import o.C60123zwM;

/* JADX INFO: renamed from: o.zwJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60121zwJ {

    /* JADX INFO: renamed from: o.zwJ$Activity */
    public interface Activity extends ActivityCompat.OnRequestPermissionsResultCallback {
        void onPermissionsDenied(int i, @androidx.annotation.NonNull java.util.List<java.lang.String> list);

        void onPermissionsGranted(int i, @androidx.annotation.NonNull java.util.List<java.lang.String> list);
    }

    /* JADX INFO: renamed from: o.zwJ$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(int i);

        void copydefault(int i);
    }

    public static boolean KWHzl(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull @androidx.annotation.Size(min = 1) java.lang.String... strArr) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Can't check permissions for null context");
        }
        for (java.lang.String str : strArr) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void AEQbTJ(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull java.lang.String str, int i, @androidx.annotation.NonNull @androidx.annotation.Size(min = 1) java.lang.String... strArr) {
        copydefault(new C60123zwM.ActionBar(activity, i, strArr).copydefault(str).AEQbTJ());
    }

    public static void AEQbTJ(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment, @androidx.annotation.NonNull java.lang.String str, int i, @androidx.annotation.NonNull @androidx.annotation.Size(min = 1) java.lang.String... strArr) {
        copydefault(new C60123zwM.ActionBar(fragment, i, strArr).copydefault(str).AEQbTJ());
    }

    public static void copydefault(C60123zwM c60123zwM) {
        if (KWHzl(c60123zwM.AEQbTJ().OLrzqt(), c60123zwM.OLrzqt())) {
            copydefault(c60123zwM.AEQbTJ().AEQbTJ(), c60123zwM.djBIcL(), c60123zwM.OLrzqt());
        } else {
            c60123zwM.AEQbTJ().AEQbTJ(c60123zwM.EZpvd(), c60123zwM.KWHzl(), c60123zwM.copydefault(), c60123zwM.gEmmrt(), c60123zwM.djBIcL(), c60123zwM.OLrzqt());
        }
    }

    public static void KWHzl(int i, @androidx.annotation.NonNull java.lang.String[] strArr, @androidx.annotation.NonNull int[] iArr, @androidx.annotation.NonNull java.lang.Object... objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            java.lang.String str = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (java.lang.Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof Activity)) {
                ((Activity) obj).onPermissionsGranted(i, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof Activity)) {
                ((Activity) obj).onPermissionsDenied(i, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                EZpvd(obj, i);
            }
        }
    }

    public static boolean copydefault(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull java.util.List<java.lang.String> list) {
        return AbstractC60132zwV.AEQbTJ(activity).OLrzqt(list);
    }

    public static boolean KWHzl(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment, @androidx.annotation.NonNull java.util.List<java.lang.String> list) {
        return AbstractC60132zwV.OLrzqt(fragment).OLrzqt(list);
    }

    public static void copydefault(@androidx.annotation.NonNull java.lang.Object obj, int i, @androidx.annotation.NonNull java.lang.String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = 0;
        }
        KWHzl(i, strArr, iArr, obj);
    }

    public static void EZpvd(@androidx.annotation.NonNull java.lang.Object obj, int i) {
        java.lang.Class<?> superclass = obj.getClass();
        if (EZpvd(obj)) {
            superclass = superclass.getSuperclass();
        }
        while (superclass != null) {
            for (java.lang.reflect.Method method : superclass.getDeclaredMethods()) {
                InterfaceC60122zwK interfaceC60122zwK = (InterfaceC60122zwK) method.getAnnotation(InterfaceC60122zwK.class);
                if (interfaceC60122zwK != null && interfaceC60122zwK.copydefault() == i) {
                    if (method.getParameterTypes().length > 0) {
                        throw new java.lang.RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                    }
                    try {
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(obj, new java.lang.Object[0]);
                    } catch (java.lang.IllegalAccessException | InvocationTargetException unused) {
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    public static boolean EZpvd(@androidx.annotation.NonNull java.lang.Object obj) {
        if (!obj.getClass().getSimpleName().endsWith("_")) {
            return false;
        }
        try {
            return java.lang.Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }
}
