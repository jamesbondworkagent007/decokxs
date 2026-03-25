package o;

import java.lang.reflect.Modifier;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZU {
    public static final yZU AEQbTJ;
    public static final Application AYXKKw;
    public static final int AhwBna;
    public static final int AkhnZx;
    public static final int AuCTel;
    public static final int DbNXlk;
    public static final yZU EZpvd;
    public static final int KWHzl;
    public static final yZU OLrzqt;
    public static final int copydefault;
    public static final java.util.List<Application.Activity> djBIcL;
    public static final yZU ejfBZ;
    public static final int fARcdN;
    public static final yZU fIwbmz;
    public static final yZU fJNWhG;
    public static final int fetchVPNInfo;
    public static final java.util.List<Application.Activity> gEmmrt;
    public static final yZU getFieldNames;
    public static final int getNewProxyInstance;
    public static int hDKMBd;
    public static final yZU isConnected;
    public static final int uzCIH;
    public static final yZU valueOf;
    public static final yZU values;
    public final int AuCTelauCTel;
    public final java.util.List<yZT> iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(int i) {
        return (i & this.AuCTelauCTel) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<yZT> djBIcL() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.yZT> */
    /* JADX WARN: Multi-variable type inference failed */
    public yZU(int i, @NotNull java.util.List<? extends yZT> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.iwGUEr = list;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((yZT) it.next()).EZpvd();
        }
        this.AuCTelauCTel = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:92)) : (r2v0 java.util.List))
 A[MD:(int, java.util.List<? extends o.yZT>):void (m)] (LINE:90) call: o.yZU.<init>(int, java.util.List):void type: THIS */
    public /* synthetic */ yZU(int i, java.util.List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? yDY.AhwBna() : list);
    }

    public final yZU OLrzqt(int i) {
        int i2 = i & this.AuCTelauCTel;
        if (i2 == 0) {
            return null;
        }
        return new yZU(i2, this.iwGUEr);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(yZU.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        yZU yzu = (yZU) obj;
        return Intrinsics.EZpvd(this.iwGUEr, yzu.iwGUEr) && this.AuCTelauCTel == yzu.AuCTelauCTel;
    }

    public int hashCode() {
        return (this.iwGUEr.hashCode() * 31) + this.AuCTelauCTel;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yZU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final int gEmmrt() {
            int i = yZU.hDKMBd;
            Application application = yZU.AYXKKw;
            yZU.hDKMBd <<= 1;
            return i;
        }

        public final int AEQbTJ() {
            return yZU.DbNXlk;
        }

        public final int AYXKKw() {
            return yZU.AuCTel;
        }

        public final int valueOf() {
            return yZU.fARcdN;
        }

        public final int copydefault() {
            return yZU.fetchVPNInfo;
        }

        public final int EZpvd() {
            return yZU.AkhnZx;
        }

        public final int AhwBna() {
            return yZU.uzCIH;
        }

        public final int KWHzl() {
            return yZU.KWHzl;
        }

        public final int OLrzqt() {
            return yZU.AhwBna;
        }

        public static final class Activity {
            public final int EZpvd;
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.KWHzl;
            }

            public Activity(int i, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = i;
                this.KWHzl = str;
            }
        }
    }

    static {
        Application.Activity activity;
        Application.Activity activity2;
        Application application = new Application(null);
        AYXKKw = application;
        hDKMBd = 1;
        int iGEmmrt = application.gEmmrt();
        DbNXlk = iGEmmrt;
        int iGEmmrt2 = application.gEmmrt();
        AuCTel = iGEmmrt2;
        int iGEmmrt3 = application.gEmmrt();
        fARcdN = iGEmmrt3;
        int iGEmmrt4 = application.gEmmrt();
        fetchVPNInfo = iGEmmrt4;
        int iGEmmrt5 = application.gEmmrt();
        AkhnZx = iGEmmrt5;
        int iGEmmrt6 = application.gEmmrt();
        uzCIH = iGEmmrt6;
        int iGEmmrt7 = application.gEmmrt() - 1;
        KWHzl = iGEmmrt7;
        int i = iGEmmrt | iGEmmrt2 | iGEmmrt3;
        AhwBna = i;
        int i2 = iGEmmrt2 | iGEmmrt5 | iGEmmrt6;
        getNewProxyInstance = i2;
        int i3 = iGEmmrt5 | iGEmmrt6;
        copydefault = i3;
        int i4 = 2;
        AEQbTJ = new yZU(iGEmmrt7, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        OLrzqt = new yZU(i3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        isConnected = new yZU(iGEmmrt, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        ejfBZ = new yZU(iGEmmrt2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        fIwbmz = new yZU(iGEmmrt3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        EZpvd = new yZU(i, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        values = new yZU(iGEmmrt4, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        valueOf = new yZU(iGEmmrt5, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        getFieldNames = new yZU(iGEmmrt6, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        fJNWhG = new yZU(i2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        java.lang.reflect.Field[] fields = yZU.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "");
        java.util.ArrayList<java.lang.reflect.Field> arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.reflect.Field field2 : arrayList) {
            java.lang.Object obj = field2.get(null);
            yZU yzu = obj instanceof yZU ? (yZU) obj : null;
            if (yzu != null) {
                int i5 = yzu.AuCTelauCTel;
                java.lang.String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                activity2 = new Application.Activity(i5, name);
            } else {
                activity2 = null;
            }
            if (activity2 != null) {
                arrayList2.add(activity2);
            }
        }
        djBIcL = arrayList2;
        java.lang.reflect.Field[] fields2 = yZU.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        java.util.ArrayList<java.lang.reflect.Field> arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            if (Intrinsics.EZpvd(((java.lang.reflect.Field) obj2).getType(), java.lang.Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.reflect.Field field4 : arrayList4) {
            java.lang.Object obj3 = field4.get(null);
            Intrinsics.copydefault(obj3, "");
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                java.lang.String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                activity = new Application.Activity(iIntValue, name2);
            } else {
                activity = null;
            }
            if (activity != null) {
                arrayList5.add(activity);
            }
        }
        gEmmrt = arrayList5;
    }

    public java.lang.String toString() {
        java.lang.Object next;
        java.util.Iterator<T> it = djBIcL.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Application.Activity) next).AEQbTJ() == this.AuCTelauCTel) {
                break;
            }
        }
        Application.Activity activity = (Application.Activity) next;
        java.lang.String strCopydefault = activity != null ? activity.copydefault() : null;
        if (strCopydefault == null) {
            java.util.List<Application.Activity> list = gEmmrt;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (Application.Activity activity2 : list) {
                java.lang.String strCopydefault2 = EZpvd(activity2.AEQbTJ()) ? activity2.copydefault() : null;
                if (strCopydefault2 != null) {
                    arrayList.add(strCopydefault2);
                }
            }
            strCopydefault = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strCopydefault + ", " + this.iwGUEr + ')';
    }
}
