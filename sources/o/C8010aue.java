package o;

import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.wrapper.ProGuardError;
import com.immomo.mls.wrapper.RegisterError;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import org.luaj.vm2.Globals;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.aue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8010aue {
    public static final java.util.Map<java.lang.Class, java.lang.Class<? extends LuaUserdata>> AEQbTJ = new java.util.HashMap(20);
    public final StateListAnimator KWHzl = new StateListAnimator();
    public final java.util.List<FragmentManager> AkhnZx = new java.util.ArrayList(10);
    public final java.util.List<Dialog> AYXKKw = new java.util.ArrayList(10);
    public final java.util.List<PendingIntent> gEmmrt = new java.util.ArrayList(10);
    public final java.util.List<PendingIntent> OLrzqt = new java.util.ArrayList(10);
    public final java.util.HashMap<java.lang.Class, java.lang.String> valueOf = new java.util.HashMap<>();
    public final Activity copydefault = new Activity();
    public final Activity AhwBna = new Activity();
    public final java.util.List<Fragment> isConnected = new java.util.ArrayList();
    public final java.util.List<TaskDescription> djBIcL = new java.util.ArrayList();
    public final java.util.List<java.lang.String> EZpvd = new java.util.ArrayList();
    public boolean fetchVPNInfo = false;

    /* JADX INFO: renamed from: o.aue$TaskDescription */
    public static final class TaskDescription extends Application {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.fetchVPNInfo;
    }

    public void OLrzqt() {
        this.KWHzl.EZpvd();
        this.AkhnZx.clear();
        this.AYXKKw.clear();
        this.gEmmrt.clear();
        this.OLrzqt.clear();
        AEQbTJ.clear();
        this.valueOf.clear();
        this.copydefault.copydefault();
        this.AhwBna.copydefault();
        this.isConnected.clear();
        this.djBIcL.clear();
        this.EZpvd.clear();
    }

    public boolean copydefault() {
        return this.AhwBna.OLrzqt > 0 || this.copydefault.OLrzqt > 0;
    }

    public static boolean OLrzqt(java.lang.Class cls, java.lang.String str) {
        return copydefault(cls, str, LuaValue[].class);
    }

    public static boolean copydefault(java.lang.Class cls, java.lang.String str) {
        return copydefault(cls, str, java.lang.Long.TYPE, LuaValue[].class);
    }

    public static boolean copydefault(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        java.lang.reflect.Method declaredMethod;
        try {
            declaredMethod = cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            declaredMethod = null;
        }
        if (declaredMethod == null) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
        }
        if (declaredMethod == null) {
            return false;
        }
        if (declaredMethod.getAnnotation(InterfaceC60044zuT.class) != null) {
            return true;
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (LuaUserdata.class == superclass || JavaUserdata.class == superclass) {
            return false;
        }
        return copydefault(superclass, str, clsArr);
    }

    public static void OLrzqt(java.lang.Class cls, java.lang.String[] strArr, boolean z) {
        java.lang.String simpleName = cls.getSimpleName();
        if (cls.getAnnotation(InterfaceC60044zuT.class) == null) {
            throw new ProGuardError("Throw in debug! No @LuaApiUsed in class " + cls.getName());
        }
        if (strArr == null || strArr.length == 0) {
            return;
        }
        try {
            for (java.lang.String str : strArr) {
                if (z) {
                    if (!OLrzqt(cls, str)) {
                        throw new java.lang.Exception(simpleName + JwtUtilsKt.JWT_DELIMITER + str + " has no LuaApiUsed annotation!");
                    }
                } else if (!copydefault(cls, str)) {
                    throw new java.lang.Exception(simpleName + JwtUtilsKt.JWT_DELIMITER + str + " has no LuaApiUsed annotation!");
                }
            }
        } catch (java.lang.Exception e) {
            throw new ProGuardError("Throw in debug! " + e.getMessage());
        }
    }

    public void copydefault(java.lang.Class cls, boolean z, boolean z2, java.lang.String... strArr) throws RegisterError {
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName(cls.getName() + "_udwrapper");
            java.lang.String[] strArr2 = (java.lang.String[]) cls2.getDeclaredField("methods").get(null);
            for (java.lang.String str : strArr) {
                AssistContent assistContent = new AssistContent(str, cls2, z, z2, strArr2);
                assistContent.AhwBna = false;
                try {
                    AEQbTJ(assistContent);
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw new RegisterError(th);
                }
            }
            AEQbTJ.put(cls, (java.lang.Class<? extends LuaUserdata>) cls2);
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public void AEQbTJ(AssistContent assistContent) {
        if (C7326ahi.EZpvd && assistContent.AhwBna) {
            OLrzqt((java.lang.Class) assistContent.EZpvd, assistContent.OLrzqt, true);
        }
        if (assistContent.KWHzl) {
            this.AhwBna.EZpvd(assistContent);
        } else {
            C60093zva.EZpvd(assistContent.EZpvd);
            this.copydefault.EZpvd(assistContent);
        }
    }

    public void OLrzqt(Fragment fragment) {
        fragment.AEQbTJ();
        this.valueOf.put(fragment.EZpvd, fragment.KWHzl);
        this.isConnected.add(fragment);
    }

    public static AssistContent copydefault(java.lang.String str, java.lang.Class<? extends LuaUserdata> cls, boolean z, java.lang.String... strArr) {
        return new AssistContent(str, cls, z, strArr);
    }

    public static AssistContent KWHzl(java.lang.String str, java.lang.Class<? extends LuaUserdata> cls, boolean z, boolean z2, java.lang.String... strArr) {
        return new AssistContent(str, cls, z, z2, strArr);
    }

    public static AssistContent OLrzqt(java.lang.String str, java.lang.Class cls, boolean z) {
        return AEQbTJ(str, cls, z, false);
    }

    public static AssistContent AEQbTJ(java.lang.String str, java.lang.Class cls, boolean z, boolean z2) {
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName(cls.getName() + "_udwrapper");
            java.lang.String[] strArr = (java.lang.String[]) cls2.getDeclaredField("methods").get(null);
            AEQbTJ.put(cls, (java.lang.Class<? extends LuaUserdata>) cls2);
            AssistContent assistContent = new AssistContent(str, cls2, z, z2, strArr);
            assistContent.AhwBna = false;
            return assistContent;
        } catch (java.lang.Throwable th) {
            throw new RegisterError(th);
        }
    }

    public void AEQbTJ(LoaderManager loaderManager) {
        if (C7326ahi.EZpvd && loaderManager.KWHzl) {
            OLrzqt(loaderManager.EZpvd, loaderManager.AEQbTJ, false);
        }
        this.KWHzl.copydefault(loaderManager);
    }

    public static LoaderManager AEQbTJ(java.lang.String str, java.lang.Class cls, java.lang.String... strArr) {
        return new LoaderManager(str, cls, strArr);
    }

    public static LoaderManager copydefault(java.lang.String str, java.lang.Class cls) {
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName(cls.getName() + "_sbwrapper");
            LoaderManager loaderManager = new LoaderManager(str, cls2, (java.lang.String[]) cls2.getDeclaredField("methods").get(null));
            loaderManager.KWHzl = false;
            return loaderManager;
        } catch (java.lang.Throwable th) {
            throw new RegisterError(th);
        }
    }

    public void copydefault(TaskDescription taskDescription) {
        taskDescription.AEQbTJ();
        this.valueOf.put(taskDescription.EZpvd, taskDescription.KWHzl);
        this.djBIcL.add(taskDescription);
    }

    public void AEQbTJ(java.lang.String str, java.lang.Class cls, boolean z) throws RegisterError {
        java.lang.String str2 = "__" + str;
        copydefault(cls, false, z, str2);
        if (z) {
            this.gEmmrt.add(new PendingIntent(str, str2));
        } else {
            this.OLrzqt.add(new PendingIntent(str, str2));
        }
    }

    public void OLrzqt(java.lang.Class cls) {
        RegisterError registerError;
        InterfaceC7952atY interfaceC7952atY = (InterfaceC7952atY) cls.getAnnotation(InterfaceC7952atY.class);
        if (interfaceC7952atY == null) {
            throw new RegisterError("register enum failed! class must have a ConstantClass annotation. Class:" + cls.getName());
        }
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields == null ? 0 : declaredFields.length;
        if (length == 0) {
            return;
        }
        java.lang.String strKWHzl = interfaceC7952atY.KWHzl();
        if (AEQbTJ(strKWHzl)) {
            strKWHzl = cls.getSimpleName();
        }
        java.lang.String[] strArr = new java.lang.String[length];
        java.lang.Class<?> type = declaredFields[0].getType();
        if (type.isPrimitive()) {
            double[] dArr = new double[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.reflect.Field field = declaredFields[i2];
                    InterfaceC8007aub interfaceC8007aub = (InterfaceC8007aub) field.getAnnotation(InterfaceC8007aub.class);
                    if (interfaceC8007aub == null) {
                        i++;
                    } else {
                        int i3 = i2 - i;
                        dArr[i3] = ((java.lang.Number) field.get(null)).doubleValue();
                        java.lang.String strOLrzqt = interfaceC8007aub.OLrzqt();
                        if (AEQbTJ(strOLrzqt)) {
                            strOLrzqt = field.getName();
                        }
                        strArr[i3] = strOLrzqt;
                    }
                } finally {
                }
            }
            if (i != 0) {
                int i4 = length - i;
                if (i4 <= 0) {
                    return;
                }
                java.lang.String[] strArr2 = new java.lang.String[i4];
                double[] dArr2 = new double[i4];
                java.lang.System.arraycopy(strArr, 0, strArr2, 0, i4);
                java.lang.System.arraycopy(dArr, 0, dArr2, 0, i4);
                strArr = strArr2;
                dArr = dArr2;
            }
            AEQbTJ(strKWHzl, strArr, dArr);
            return;
        }
        if (type.equals(java.lang.String.class)) {
            java.lang.String[] strArr3 = new java.lang.String[length];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    java.lang.reflect.Field field2 = declaredFields[i6];
                    InterfaceC8007aub interfaceC8007aub2 = (InterfaceC8007aub) field2.getAnnotation(InterfaceC8007aub.class);
                    if (interfaceC8007aub2 == null) {
                        i5++;
                    } else {
                        int i7 = i6 - i5;
                        strArr3[i7] = (java.lang.String) field2.get(null);
                        java.lang.String strOLrzqt2 = interfaceC8007aub2.OLrzqt();
                        if (AEQbTJ(strOLrzqt2)) {
                            strOLrzqt2 = field2.getName();
                        }
                        strArr[i7] = strOLrzqt2;
                    }
                } finally {
                }
            }
            if (i5 != 0) {
                int i8 = length - i5;
                if (i8 <= 0) {
                    return;
                }
                java.lang.String[] strArr4 = new java.lang.String[i8];
                java.lang.String[] strArr5 = new java.lang.String[i8];
                java.lang.System.arraycopy(strArr, 0, strArr4, 0, i8);
                java.lang.System.arraycopy(strArr3, 0, strArr5, 0, i8);
                strArr = strArr4;
                strArr3 = strArr5;
            }
            KWHzl(strKWHzl, strArr, strArr3);
            return;
        }
        throw new RegisterError("constant type must be number type or String, Class: " + cls.getName() + " field[0] class: " + type.getName());
    }

    public static boolean AEQbTJ(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    public void KWHzl(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.AkhnZx.add(new FragmentManager(str, strArr, strArr2));
    }

    public void AEQbTJ(java.lang.String str, java.lang.String[] strArr, double[] dArr) {
        this.AYXKKw.add(new Dialog(str, strArr, dArr));
    }

    public static java.lang.Class<? extends LuaUserdata> copydefault(java.lang.Class cls) {
        return AEQbTJ.get(cls);
    }

    public void copydefault(Globals globals) {
        EZpvd(globals, true);
    }

    public void EZpvd(Globals globals, boolean z) {
        java.util.Iterator<Fragment> it = this.isConnected.iterator();
        while (it.hasNext()) {
            it.next().copydefault(globals, this.valueOf);
        }
        java.util.Iterator<TaskDescription> it2 = this.djBIcL.iterator();
        while (it2.hasNext()) {
            it2.next().copydefault(globals, this.valueOf);
        }
        this.copydefault.EZpvd(globals);
        if (z) {
            this.AhwBna.EZpvd(globals);
        }
        this.KWHzl.EZpvd(globals);
        for (FragmentManager fragmentManager : this.AkhnZx) {
            globals.OLrzqt(fragmentManager.KWHzl, fragmentManager.AEQbTJ, fragmentManager.copydefault);
        }
        for (Dialog dialog : this.AYXKKw) {
            globals.AEQbTJ(dialog.KWHzl, dialog.AEQbTJ, dialog.EZpvd);
        }
        globals.EZpvd(this.valueOf);
    }

    public void KWHzl() {
        synchronized (this) {
            if (this.fetchVPNInfo) {
                return;
            }
            try {
                this.copydefault.KWHzl();
                this.AhwBna.KWHzl();
                this.KWHzl.KWHzl();
                if (!this.EZpvd.isEmpty()) {
                    Globals.KWHzl((java.lang.String[]) this.EZpvd.toArray(new java.lang.String[0]));
                }
                this.EZpvd.clear();
                this.fetchVPNInfo = true;
            } catch (java.lang.Throwable th) {
                C7870arw.KWHzl("------------>Throwable:" + th.getMessage());
                if (C7323ahf.valueOf() != null) {
                    C7323ahf.valueOf().AEQbTJ(th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aue$Activity */
    public final class Activity {
        public final int AEQbTJ = 50;
        public final java.util.List<java.lang.Class> copydefault = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> djBIcL = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> valueOf = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> EZpvd = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> AYXKKw = new java.util.ArrayList(500);
        public int[] AhwBna = new int[50];
        public boolean[] KWHzl = new boolean[50];
        public int OLrzqt = 0;

        public Activity() {
        }

        public void copydefault() {
            this.copydefault.clear();
            this.djBIcL.clear();
            this.valueOf.clear();
            this.EZpvd.clear();
            this.AYXKKw.clear();
            this.AhwBna = new int[50];
            this.KWHzl = new boolean[50];
            this.OLrzqt = 0;
        }

        public void EZpvd(AssistContent assistContent) {
            this.djBIcL.add(assistContent.copydefault);
            this.copydefault.add(assistContent.EZpvd);
            this.EZpvd.add(C60049zuY.copydefault(assistContent.EZpvd));
            java.lang.String[] strArr = assistContent.OLrzqt;
            this.AhwBna = EZpvd(this.AhwBna, this.OLrzqt, strArr != null ? strArr.length : 0);
            this.KWHzl = copydefault(this.KWHzl, this.OLrzqt, assistContent.AEQbTJ);
            this.OLrzqt++;
            this.AYXKKw.addAll(java.util.Arrays.asList(assistContent.OLrzqt));
            C8010aue.this.valueOf.put(assistContent.EZpvd, assistContent.copydefault);
        }

        public void EZpvd(Globals globals) {
            this.AhwBna = KWHzl(this.AhwBna, this.OLrzqt);
            this.KWHzl = copydefault(this.KWHzl, this.OLrzqt);
            globals.EZpvd((java.lang.String[]) this.djBIcL.toArray(new java.lang.String[this.OLrzqt]), (java.lang.String[]) this.valueOf.toArray(new java.lang.String[this.OLrzqt]), (java.lang.String[]) this.EZpvd.toArray(new java.lang.String[this.OLrzqt]), this.KWHzl);
        }

        public void KWHzl() {
            this.AhwBna = KWHzl(this.AhwBna, this.OLrzqt);
            java.lang.String[] strArr = (java.lang.String[]) this.AYXKKw.toArray(new java.lang.String[0]);
            if (this.copydefault.isEmpty()) {
                int i = 0;
                for (int i2 = 0; i2 < this.OLrzqt; i2++) {
                    int i3 = this.AhwBna[i2];
                    java.lang.String[] strArr2 = new java.lang.String[i3];
                    java.lang.System.arraycopy(strArr, i, strArr2, 0, i3);
                    Globals.EZpvd(this.EZpvd.get(i2), strArr2);
                    i += this.AhwBna[i2];
                }
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < this.OLrzqt; i5++) {
                    java.lang.String strEZpvd = Globals.EZpvd(this.copydefault.get(i5), C8010aue.this.valueOf);
                    if (this.djBIcL.get(i5).equals(strEZpvd)) {
                        strEZpvd = null;
                    }
                    this.valueOf.add(strEZpvd);
                    int i6 = this.AhwBna[i5];
                    java.lang.String[] strArr3 = new java.lang.String[i6];
                    java.lang.System.arraycopy(strArr, i4, strArr3, 0, i6);
                    Globals.EZpvd(this.EZpvd.get(i5), strArr3);
                    i4 += this.AhwBna[i5];
                }
            }
            this.copydefault.clear();
        }

        public final int[] EZpvd(int[] iArr, int i, int i2) {
            if (iArr.length > i) {
                iArr[i] = i2;
                return iArr;
            }
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length + 10);
            iArrCopyOf[i] = i2;
            return iArrCopyOf;
        }

        public final boolean[] copydefault(boolean[] zArr, int i, boolean z) {
            if (zArr.length > i) {
                zArr[i] = z;
                return zArr;
            }
            boolean[] zArrCopyOf = java.util.Arrays.copyOf(zArr, zArr.length + 10);
            zArrCopyOf[i] = z;
            return zArrCopyOf;
        }

        public final int[] KWHzl(int[] iArr, int i) {
            return iArr.length == i ? iArr : java.util.Arrays.copyOf(iArr, i);
        }

        public final boolean[] copydefault(boolean[] zArr, int i) {
            return zArr.length == i ? zArr : java.util.Arrays.copyOf(zArr, i);
        }
    }

    /* JADX INFO: renamed from: o.aue$StateListAnimator */
    public final class StateListAnimator {
        public final int OLrzqt = 50;
        public final java.util.List<java.lang.Class> KWHzl = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> AEQbTJ = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> gEmmrt = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> copydefault = new java.util.ArrayList(50);
        public final java.util.List<java.lang.String> djBIcL = new java.util.ArrayList(500);
        public int[] valueOf = new int[50];
        public int EZpvd = 0;

        public StateListAnimator() {
        }

        public void EZpvd() {
            this.KWHzl.clear();
            this.AEQbTJ.clear();
            this.gEmmrt.clear();
            this.copydefault.clear();
            this.djBIcL.clear();
            this.valueOf = new int[50];
            this.EZpvd = 0;
        }

        public void copydefault(LoaderManager loaderManager) {
            this.AEQbTJ.add(loaderManager.OLrzqt);
            this.KWHzl.add(loaderManager.EZpvd);
            this.copydefault.add(C60049zuY.copydefault(loaderManager.EZpvd));
            java.lang.String[] strArr = loaderManager.AEQbTJ;
            this.valueOf = OLrzqt(this.valueOf, this.EZpvd, strArr != null ? strArr.length : 0);
            this.EZpvd++;
            this.djBIcL.addAll(java.util.Arrays.asList(loaderManager.AEQbTJ));
            C8010aue.this.valueOf.put(loaderManager.EZpvd, loaderManager.OLrzqt);
        }

        public void EZpvd(Globals globals) {
            this.valueOf = KWHzl(this.valueOf, this.EZpvd);
            globals.AEQbTJ((java.lang.String[]) this.AEQbTJ.toArray(new java.lang.String[this.EZpvd]), (java.lang.String[]) this.gEmmrt.toArray(new java.lang.String[this.EZpvd]), (java.lang.String[]) this.copydefault.toArray(new java.lang.String[this.EZpvd]));
        }

        public void KWHzl() {
            this.valueOf = KWHzl(this.valueOf, this.EZpvd);
            java.lang.String[] strArr = (java.lang.String[]) this.djBIcL.toArray(new java.lang.String[0]);
            if (this.KWHzl.isEmpty()) {
                int i = 0;
                for (int i2 = 0; i2 < this.EZpvd; i2++) {
                    int i3 = this.valueOf[i2];
                    java.lang.String[] strArr2 = new java.lang.String[i3];
                    java.lang.System.arraycopy(strArr, i, strArr2, 0, i3);
                    Globals.OLrzqt(this.copydefault.get(i2), strArr2);
                    i += this.valueOf[i2];
                }
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < this.EZpvd; i5++) {
                    java.lang.String strEZpvd = Globals.EZpvd(this.KWHzl.get(i5), C8010aue.this.valueOf);
                    if (this.AEQbTJ.get(i5).equals(strEZpvd)) {
                        strEZpvd = null;
                    }
                    this.gEmmrt.add(strEZpvd);
                    int i6 = this.valueOf[i5];
                    java.lang.String[] strArr3 = new java.lang.String[i6];
                    java.lang.System.arraycopy(strArr, i4, strArr3, 0, i6);
                    Globals.OLrzqt(this.copydefault.get(i5), strArr3);
                    i4 += this.valueOf[i5];
                }
            }
            this.KWHzl.clear();
        }

        public final int[] OLrzqt(int[] iArr, int i, int i2) {
            if (iArr.length > i) {
                iArr[i] = i2;
                return iArr;
            }
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length + 10);
            iArrCopyOf[i] = i2;
            return iArrCopyOf;
        }

        public final int[] KWHzl(int[] iArr, int i) {
            return iArr.length == i ? iArr : java.util.Arrays.copyOf(iArr, i);
        }
    }

    public void OLrzqt(Globals globals, boolean z) {
        for (PendingIntent pendingIntent : this.OLrzqt) {
            globals.copydefault(pendingIntent.OLrzqt, pendingIntent.copydefault, new LuaValue[0]);
        }
        if (z) {
            for (PendingIntent pendingIntent2 : this.gEmmrt) {
                globals.copydefault(pendingIntent2.OLrzqt, pendingIntent2.copydefault, new LuaValue[0]);
            }
        }
    }

    /* JADX INFO: renamed from: o.aue$AssistContent */
    public static final class AssistContent {
        public boolean AEQbTJ;
        public boolean AhwBna;
        public java.lang.Class<? extends LuaUserdata> EZpvd;
        public boolean KWHzl;
        public java.lang.String[] OLrzqt;
        public java.lang.String copydefault;

        public AssistContent(java.lang.String str, java.lang.Class<? extends LuaUserdata> cls, boolean z, java.lang.String[] strArr) {
            this(str, cls, z, UDView.class.isAssignableFrom(cls), strArr);
        }

        public AssistContent(java.lang.String str, java.lang.Class<? extends LuaUserdata> cls, boolean z, boolean z2, java.lang.String[] strArr) {
            this.AhwBna = true;
            this.copydefault = str;
            this.EZpvd = cls;
            this.OLrzqt = strArr;
            this.AEQbTJ = z;
            this.KWHzl = z2;
        }
    }

    /* JADX INFO: renamed from: o.aue$PendingIntent */
    public static final class PendingIntent {
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        public PendingIntent(java.lang.String str, java.lang.String str2) {
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: renamed from: o.aue$LoaderManager */
    public static final class LoaderManager {
        public java.lang.String[] AEQbTJ;
        public java.lang.Class EZpvd;
        public boolean KWHzl;
        public java.lang.String OLrzqt;

        public LoaderManager(java.lang.String str, java.lang.Class cls, java.lang.String[] strArr) {
            this.KWHzl = true;
            this.OLrzqt = str;
            this.EZpvd = cls;
            this.AEQbTJ = strArr;
        }
    }

    /* JADX INFO: renamed from: o.aue$ActionBar */
    public static class ActionBar {
        public java.lang.String[] AEQbTJ;
        public java.lang.String KWHzl;

        public ActionBar(java.lang.String str, java.lang.String[] strArr) {
            this.KWHzl = str;
            this.AEQbTJ = strArr;
        }
    }

    /* JADX INFO: renamed from: o.aue$FragmentManager */
    public static final class FragmentManager extends ActionBar {
        public java.lang.String[] copydefault;

        public FragmentManager(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
            super(str, strArr);
            this.copydefault = strArr2;
        }
    }

    /* JADX INFO: renamed from: o.aue$Dialog */
    public static final class Dialog extends ActionBar {
        public double[] EZpvd;

        public Dialog(java.lang.String str, java.lang.String[] strArr, double[] dArr) {
            super(str, strArr);
            this.EZpvd = dArr;
        }
    }

    /* JADX INFO: renamed from: o.aue$Application */
    public static class Application {
        public java.lang.reflect.Method AEQbTJ;
        public final java.lang.Class EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.reflect.Method OLrzqt;
        public java.lang.String copydefault = "@UNSET";

        public Application(java.lang.String str, java.lang.Class cls) {
            this.KWHzl = str;
            this.EZpvd = cls;
            try {
                this.AEQbTJ = cls.getDeclaredMethod("_init", new java.lang.Class[0]);
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("_register", java.lang.Long.TYPE, java.lang.String.class);
                this.OLrzqt = declaredMethod;
                this.AEQbTJ.setAccessible(true);
                declaredMethod.setAccessible(true);
            } catch (java.lang.Throwable th) {
                throw new RegisterError("register " + cls.getName() + " failed!", th);
            }
        }

        public void AEQbTJ() {
            java.lang.reflect.Method method = this.AEQbTJ;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, new java.lang.Object[0]);
                this.AEQbTJ = null;
            } catch (java.lang.Throwable th) {
                throw new RegisterError("init " + this.EZpvd.getName() + " failed!", th);
            }
        }

        public void copydefault(Globals globals, java.util.Map<java.lang.Class, java.lang.String> map) {
            if (this.copydefault == "@UNSET") {
                this.copydefault = Globals.EZpvd(this.EZpvd, map);
            }
            try {
                this.OLrzqt.invoke(null, java.lang.Long.valueOf(globals.ejfBZ()), this.copydefault);
            } catch (java.lang.Throwable th) {
                C7320ahc.EZpvd(th, globals);
            }
        }
    }

    /* JADX INFO: renamed from: o.aue$Fragment */
    public static final class Fragment extends Application {
        public Fragment(java.lang.String str, java.lang.Class<? extends LuaUserdata> cls) {
            super(str, cls);
        }
    }
}
