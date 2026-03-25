package o;

import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXL {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public final int AYXKKw;
    public final int[] EZpvd;
    public int OLrzqt;
    public int[] copydefault;
    public int djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int[] OLrzqt() {
        return this.copydefault;
    }

    public wXL(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.AYXKKw = i;
        this.EZpvd = new int[]{0, 0, 0, 0};
        this.copydefault = new int[0];
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:28) call: o.wXL.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ wXL(java.lang.String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 8 : i);
    }

    public final void djBIcL() {
        AEQbTJ(this.gEmmrt);
        copydefault(this.AYXKKw);
    }

    public final int[] AEQbTJ(java.lang.String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int[] iArr = this.EZpvd;
            int i2 = i % 4;
            int i3 = iArr[i2];
            iArr[i2] = ((i3 << 5) - i3) + str.charAt(i);
        }
        return this.EZpvd;
    }

    public final void copydefault(int i) {
        this.AEQbTJ = copydefault();
        this.OLrzqt = copydefault();
        this.djBIcL = copydefault();
        this.copydefault = AEQbTJ(i);
    }

    public final double AhwBna() {
        int[] iArr = this.EZpvd;
        int i = iArr[0];
        int i2 = i ^ (i << 11);
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        int i3 = iArr[3];
        iArr[2] = i3;
        int i4 = (((i3 >> 19) ^ i3) ^ i2) ^ (i2 >> 8);
        iArr[3] = i4;
        return java.lang.Math.abs(((double) i4) / (-2.147483648E9d));
    }

    public final int copydefault() {
        float f = 100;
        return ColorUtils.HSLToColor(new float[]{(float) java.lang.Math.floor(AhwBna() * ((double) 360)), ((float) ((AhwBna() * ((double) 60)) + ((double) 40))) / f, ((float) ((((AhwBna() + AhwBna()) + AhwBna()) + AhwBna()) * ((double) 25))) / f});
    }

    public final int[] AEQbTJ(int i) {
        int iCeil = (int) java.lang.Math.ceil(i / 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i3 = 0; i3 < iCeil; i3++) {
                arrayList2.add(java.lang.Integer.valueOf((int) java.lang.Math.floor(AhwBna() * 2.3d)));
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i4 = 0; i4 < i - iCeil; i4++) {
                arrayList3.add(arrayList2.get(i4));
            }
            C56404yEc.zsXlph(arrayList3);
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList2.add(arrayList3.get(i5));
            }
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                java.lang.Object obj = arrayList2.get(i6);
                Intrinsics.copydefault(obj);
                arrayList.add(obj);
            }
        }
        return OLrzqt(arrayList);
    }

    public final int[] OLrzqt(java.util.List<java.lang.Integer> list) {
        int[] iArr = new int[list.size()];
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(wXL.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        wXL wxl = (wXL) obj;
        return this.AYXKKw == wxl.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) wxl.gEmmrt);
    }

    public int hashCode() {
        return (this.AYXKKw * 31) + this.gEmmrt.hashCode();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
