package o;

import com.okinc.base.bugreport.SerializableThrowable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6781aVp {
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void KWHzl(@NotNull java.lang.Throwable th) {
        SerializableThrowable serializableThrowable;
        Intrinsics.checkNotNullParameter(th, "");
        pUU.KWHzl(SerializableThrowable.TAG, "saveThrowableToCache");
        java.io.File file = new java.io.File(pIW.EZpvd(), "firebase_crash");
        try {
            java.lang.String name = th.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            java.lang.String message = th.getMessage();
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                java.lang.String name2 = cause.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                java.lang.String message2 = cause.getMessage();
                java.lang.StackTraceElement[] stackTrace2 = cause.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "");
                serializableThrowable = new SerializableThrowable(name2, message2, stackTrace2, null, 8, null);
            } else {
                serializableThrowable = null;
            }
            SerializableThrowable serializableThrowable2 = new SerializableThrowable(name, message, stackTrace, serializableThrowable);
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream(file));
            try {
                objectOutputStream.writeObject(serializableThrowable2);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(objectOutputStream, null);
            } finally {
            }
        } catch (java.io.IOException e) {
            pUU.copydefault(SerializableThrowable.TAG, "saveThrowableToCache " + e);
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final java.lang.Throwable copydefault() {
        pUU.KWHzl(SerializableThrowable.TAG, "loadThrowableFromCache");
        java.io.File file = new java.io.File(pIW.EZpvd(), "firebase_crash");
        try {
            if (!file.exists()) {
                return null;
            }
            java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.FileInputStream(file));
            try {
                java.lang.Object object = objectInputStream.readObject();
                Intrinsics.copydefault(object, "");
                java.lang.Throwable thRestore = ((SerializableThrowable) object).restore();
                yFA.copydefault(objectInputStream, null);
                return thRestore;
            } finally {
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(SerializableThrowable.TAG, "loadThrowableFromCache " + e);
            return null;
        }
    }
}
