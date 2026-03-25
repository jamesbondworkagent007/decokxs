package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rAX<T> extends LiveData<T> {
    public boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final MutableLiveData AhwBna;
    public boolean AkhnZx;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final MutableLiveData<java.lang.String> OLrzqt;
    public final T copydefault;
    public final MutableLiveData<java.lang.String> djBIcL;
    public boolean gEmmrt;
    public boolean valueOf;
    public final java.util.ArrayList<Function1<T, C41966rBj>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r10v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(java.lang.String, boolean, java.lang.String, T, boolean):void (m)] (LINE:15) call: o.rAX.<init>(java.lang.String, boolean, java.lang.String, java.lang.Object, boolean):void type: THIS */
    public /* synthetic */ rAX(java.lang.String str, boolean z, java.lang.String str2, java.lang.Object obj, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? true : z2);
    }

    public rAX(java.lang.String str, boolean z, java.lang.String str2, T t, boolean z2) {
        super(t);
        this.AYXKKw = str;
        this.AkhnZx = z;
        this.EZpvd = str2;
        this.copydefault = t;
        this.valueOf = z2;
        this.gEmmrt = !z;
        this.djBIcL = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData();
        if (this.AkhnZx && t != null) {
            throw new java.lang.RuntimeException("FormField with a non-null default value must be optional!");
        }
        this.values = new java.util.ArrayList<>();
    }

    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
        if (!z || Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.getValue(), (java.lang.Object) this.KWHzl)) {
            return;
        }
        this.OLrzqt.setValue(this.KWHzl);
    }

    public final void copydefault(java.lang.String str) {
        this.KWHzl = str;
        this.OLrzqt.setValue(str);
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T t) {
        pUU.OLrzqt("KYCFormField", "value: " + this.AYXKKw + ", " + t);
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t) {
        pUU.OLrzqt("KYCFormField", "postValue: " + this.AYXKKw + ", " + t);
        super.postValue(t);
    }

    public final boolean gEmmrt() {
        if (!this.AkhnZx) {
            if (!this.valueOf) {
                AEQbTJ(new C41966rBj(false, null, "Please fill in required fields", 2, null));
                return true;
            }
            if (getValue() == null) {
                AEQbTJ(new C41966rBj(true, null, null, 6, null));
                return true;
            }
            if (java.lang.String.valueOf(getValue()).length() == 0) {
                AEQbTJ(new C41966rBj(true, null, null, 6, null));
                return true;
            }
            if (getValue() instanceof java.util.List) {
                T value = getValue();
                Intrinsics.copydefault(value, "");
                if (((java.util.List) value).isEmpty()) {
                    AEQbTJ(new C41966rBj(true, null, null, 6, null));
                    return true;
                }
            }
            if (getValue() instanceof java.lang.Boolean) {
                AEQbTJ(new C41966rBj(true, null, null, 6, null));
                return true;
            }
            if (java.lang.String.valueOf(getValue()).length() > 0) {
                java.util.ArrayList<Function1<T, C41966rBj>> arrayList = this.values;
                if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C41966rBj c41966rBj = (C41966rBj) ((Function1) it.next()).invoke(getValue());
                        AEQbTJ(c41966rBj);
                        if (!c41966rBj.OLrzqt()) {
                            break;
                        }
                    }
                }
                return this.gEmmrt;
            }
        }
        java.util.ArrayList<Function1<T, C41966rBj>> arrayList2 = this.values;
        if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
            java.util.Iterator<T> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C41966rBj c41966rBj2 = (C41966rBj) ((Function1) it2.next()).invoke(getValue());
                AEQbTJ(c41966rBj2);
                if (!c41966rBj2.OLrzqt()) {
                    break;
                }
            }
        }
        return this.gEmmrt;
    }

    public final void AEQbTJ(C41966rBj c41966rBj) {
        this.gEmmrt = c41966rBj.OLrzqt();
        this.djBIcL.setValue(c41966rBj.copydefault());
        copydefault(c41966rBj.EZpvd());
    }

    public final void AEQbTJ(@NotNull Function1<? super T, C41966rBj> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        T t = this.copydefault;
        if (t != null && !function1.invoke(t).OLrzqt()) {
            throw new java.lang.RuntimeException("The validator cannot validate the default value for this form field!");
        }
        this.values.add(function1);
    }

    public final void copydefault(@NotNull C41957rBa c41957rBa) {
        Intrinsics.checkNotNullParameter(c41957rBa, "");
        c41957rBa.EZpvd(this);
    }

    public final void AEQbTJ(@NotNull Function1<? super T, C41966rBj>... function1Arr) {
        Intrinsics.checkNotNullParameter(function1Arr, "");
        if (this.copydefault != null) {
            for (Function1<? super T, C41966rBj> function1 : function1Arr) {
                if (!function1.invoke(this.copydefault).OLrzqt()) {
                }
            }
            throw new java.lang.RuntimeException("One of the validators cannot validate the default value for this form field!");
        }
        C56406yEe.KWHzl(this.values, function1Arr);
    }
}
