package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56735yQj {
    public static final C56735yQj AEQbTJ = new C56735yQj();
    public static ActionBar EZpvd;

    /* JADX INFO: renamed from: o.yQj$ActionBar */
    public static final class ActionBar {
        public final java.lang.reflect.Method EZpvd;
        public final java.lang.reflect.Method KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.reflect.Method OLrzqt() {
            return this.KWHzl;
        }

        public ActionBar(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.KWHzl = method;
            this.EZpvd = method2;
        }
    }

    private C56735yQj() {
    }

    public final ActionBar EZpvd(@NotNull java.lang.reflect.Member member) {
        Intrinsics.checkNotNullParameter(member, "");
        java.lang.Class<?> cls = member.getClass();
        try {
            return new ActionBar(cls.getMethod("getParameters", new java.lang.Class[0]), C56743yQr.copydefault(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new ActionBar(null, null);
        }
    }

    public final java.util.List<java.lang.String> AEQbTJ(@NotNull java.lang.reflect.Member member) {
        java.lang.reflect.Method methodEZpvd;
        Intrinsics.checkNotNullParameter(member, "");
        ActionBar actionBarEZpvd = EZpvd;
        if (actionBarEZpvd == null) {
            synchronized (this) {
                actionBarEZpvd = EZpvd;
                if (actionBarEZpvd == null) {
                    actionBarEZpvd = AEQbTJ.EZpvd(member);
                    EZpvd = actionBarEZpvd;
                }
            }
        }
        java.lang.reflect.Method methodOLrzqt = actionBarEZpvd.OLrzqt();
        if (methodOLrzqt == null || (methodEZpvd = actionBarEZpvd.EZpvd()) == null) {
            return null;
        }
        java.lang.Object objInvoke = methodOLrzqt.invoke(member, new java.lang.Object[0]);
        Intrinsics.copydefault(objInvoke, "");
        java.lang.Object[] objArr = (java.lang.Object[]) objInvoke;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            java.lang.Object objInvoke2 = methodEZpvd.invoke(obj, new java.lang.Object[0]);
            Intrinsics.copydefault(objInvoke2, "");
            arrayList.add((java.lang.String) objInvoke2);
        }
        return arrayList;
    }
}
