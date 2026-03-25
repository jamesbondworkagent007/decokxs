package o;

import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6768aVc {
    public static final LinkedHashMap<java.lang.Integer, C6771aVf> AEQbTJ;
    public static final int OLrzqt;
    public static final C6768aVc copydefault = new C6768aVc();

    private C6768aVc() {
    }

    static {
        java.lang.String name = java.lang.ArithmeticException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(1, new C6771aVf(name, "divide by zero", 1));
        java.lang.String name2 = java.lang.OutOfMemoryError.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(2, new C6771aVf(name2, "Failed to allocate a 855015272 byte allocation with 726639 free bytes and 189MB until OOM, target footprint 2906559, growth limit 201326592", 2));
        java.lang.String name3 = java.lang.NullPointerException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "");
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(3, new C6771aVf(name3, "Attempt to invoke virtual method 'o.onMessageChannelReady.c(AdaWebViewClient)' on a null object reference", 3));
        java.lang.String name4 = java.lang.ClassCastException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "");
        kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(4, new C6771aVf(name4, "o.ICustomTabsCallback incompatible with o.bind", 4));
        java.lang.String name5 = java.lang.IndexOutOfBoundsException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name5, "");
        kotlin.Pair pairOLrzqt5 = C56390yDp.OLrzqt(5, new C6771aVf(name5, "Wrong offset: 30. Should be in range: [0, 23]", 5));
        java.lang.String name6 = java.lang.IllegalStateException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name6, "");
        kotlin.Pair pairOLrzqt6 = C56390yDp.OLrzqt(6, new C6771aVf(name6, "Encountered genotype with ploidy 0 but 1 alleles.", 6));
        java.lang.String name7 = java.lang.IllegalStateException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name7, "");
        kotlin.Pair pairOLrzqt7 = C56390yDp.OLrzqt(7, new C6771aVf(name7, "Cannot coerce value to an empty range: maximum 51 is less than minimum 190.", 7));
        java.lang.String name8 = java.lang.NumberFormatException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name8, "");
        kotlin.Pair pairOLrzqt8 = C56390yDp.OLrzqt(8, new C6771aVf(name8, "For input string: '?2130969380'", 8));
        java.lang.String name9 = ConcurrentModificationException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name9, "");
        kotlin.Pair pairOLrzqt9 = C56390yDp.OLrzqt(9, new C6771aVf(name9, "tree is modified", 9));
        java.lang.String name10 = java.lang.UnsupportedOperationException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name10, "");
        kotlin.Pair pairOLrzqt10 = C56390yDp.OLrzqt(10, new C6771aVf(name10, "View 'base' not available", 10));
        java.lang.String name11 = java.lang.RuntimeException.class.getName();
        Intrinsics.checkNotNullExpressionValue(name11, "");
        AEQbTJ = C56424yEw.AhwBna(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, pairOLrzqt4, pairOLrzqt5, pairOLrzqt6, pairOLrzqt7, pairOLrzqt8, pairOLrzqt9, pairOLrzqt10, C56390yDp.OLrzqt(11, new C6771aVf(name11, "Could not resolve host", 11)));
        OLrzqt = 8;
    }

    public final boolean KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        LinkedList<java.lang.Throwable> linkedList = new LinkedList();
        int i = 0;
        while (th != null) {
            pUU.KWHzl("Dionysus", ("Cause " + i + ": #") + th.getClass().getName());
            linkedList.add(th);
            th = th.getCause();
            i++;
        }
        for (java.lang.Throwable th2 : linkedList) {
            java.lang.String name = th2.getClass().getName();
            java.lang.String message = th2.getMessage();
            java.util.Collection<C6771aVf> collectionValues = AEQbTJ.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            for (C6771aVf c6771aVf : collectionValues) {
                if (Intrinsics.EZpvd((java.lang.Object) c6771aVf.EZpvd(), (java.lang.Object) name) && Intrinsics.EZpvd((java.lang.Object) c6771aVf.AEQbTJ(), (java.lang.Object) message)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Exception OLrzqt(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        java.lang.String strEZpvd;
        java.lang.Exception runtimeException;
        int iNextInt;
        Intrinsics.checkNotNullParameter(arrayList, "");
        int iNextInt2 = new java.security.SecureRandom().nextInt(11) + 1;
        C6771aVf c6771aVf = AEQbTJ.get(java.lang.Integer.valueOf(iNextInt2));
        if (c6771aVf != null) {
            try {
                strEZpvd = c6771aVf.EZpvd();
            } catch (java.lang.Exception unused) {
                pUU.copydefault("CrashHandler", "Error generating exception");
                runtimeException = new java.lang.RuntimeException("Could not resolve host");
            }
        } else {
            strEZpvd = null;
        }
        java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(strEZpvd).getConstructor(java.lang.String.class);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = c6771aVf != null ? c6771aVf.AEQbTJ() : null;
        java.lang.Object objNewInstance = constructor.newInstance(objArr);
        Intrinsics.copydefault(objNewInstance, "");
        runtimeException = (java.lang.Exception) objNewInstance;
        pUU.copydefault("CrashHandler", "generateRandomException i=" + iNextInt2 + " " + (c6771aVf != null ? c6771aVf.EZpvd() : null) + " " + (c6771aVf != null ? c6771aVf.AEQbTJ() : null));
        java.lang.StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[stackTrace.length];
        Intrinsics.copydefault(stackTrace);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i];
            if (i2 > 3) {
                java.lang.String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "");
                if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className, (java.lang.CharSequence) "com.okinc", true)) {
                    java.lang.String className2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "");
                    if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className2, (java.lang.CharSequence) "com.okmobile", true)) {
                        C6768aVc c6768aVc = copydefault;
                        java.lang.String className3 = stackTraceElement.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className3, "");
                        if (!c6768aVc.OLrzqt(className3, arrayList)) {
                            java.lang.String className4 = stackTraceElement.getClassName();
                            Intrinsics.checkNotNullExpressionValue(className4, "");
                            if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className4, (java.lang.CharSequence) "com.oklink", true)) {
                                arrayList2.add(stackTraceElement);
                            }
                        }
                    }
                }
            }
            i++;
            i2++;
        }
        int i3 = 0;
        for (java.lang.Object obj : arrayList2) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) obj;
            java.lang.String className5 = stackTraceElement2.getClassName();
            int lineNumber = stackTraceElement2.getLineNumber();
            java.lang.String fileName = stackTraceElement2.getFileName();
            java.lang.String methodName = stackTraceElement2.getMethodName();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) stackTraceElement2.getClassName())) {
                java.lang.String className6 = stackTraceElement2.getClassName();
                Intrinsics.checkNotNullExpressionValue(className6, "");
                if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className6, (java.lang.CharSequence) "com.okinc", true)) {
                    java.lang.String className7 = stackTraceElement2.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className7, "");
                    if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className7, (java.lang.CharSequence) "com.okmobile", true)) {
                        java.lang.String className8 = stackTraceElement2.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className8, "");
                        if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className8, (java.lang.CharSequence) "com.oklink", true)) {
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) stackTraceElement2.getClassName())) {
                                java.lang.String className9 = stackTraceElement2.getClassName();
                                Intrinsics.checkNotNullExpressionValue(className9, "");
                                if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className9, (java.lang.CharSequence) "android.view", true)) {
                                    java.lang.String className10 = stackTraceElement2.getClassName();
                                    Intrinsics.checkNotNullExpressionValue(className10, "");
                                    if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) className10, (java.lang.CharSequence) "android.widget", true)) {
                                    }
                                }
                                iNextInt = new java.security.SecureRandom().nextInt(9999);
                            }
                        }
                        lineNumber = iNextInt + 1;
                        fileName = "Unknown Source";
                    }
                }
                iNextInt = new java.security.SecureRandom().nextInt(9999);
                lineNumber = iNextInt + 1;
                fileName = "Unknown Source";
            }
            stackTraceElementArr[i3] = new java.lang.StackTraceElement(className5, methodName, fileName, lineNumber);
            i3++;
        }
        runtimeException.setStackTrace((java.lang.StackTraceElement[]) yDV.getFieldNames(stackTraceElementArr).toArray(new java.lang.StackTraceElement[0]));
        return runtimeException;
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) it.next(), true)) {
                return true;
            }
        }
        return false;
    }
}
