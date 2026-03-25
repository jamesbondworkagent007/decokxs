package o;

import android.view.View;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qXB implements qXK {
    public Triple<C55173xeu, C55113xdn, ? extends java.util.List<? extends android.view.View>> KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qXI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return qXB.copydefault(this.OLrzqt);
        }
    });

    public static final class ActionBar {
        public ActionBar() {
        }

        public final C55173xeu KWHzl() {
            if (qXB.this.KWHzl != null) {
                Triple triple = qXB.this.KWHzl;
                if (triple != null) {
                    return (C55173xeu) triple.getFirst();
                }
                return null;
            }
            throw new java.lang.RuntimeException("should invoke registerUiStateViews() method first");
        }

        public final C55113xdn EZpvd() {
            if (qXB.this.KWHzl != null) {
                Triple triple = qXB.this.KWHzl;
                if (triple != null) {
                    return (C55113xdn) triple.getSecond();
                }
                return null;
            }
            throw new java.lang.RuntimeException("should invoke registerUiStateViews() method first");
        }

        public final java.util.List<android.view.View> OLrzqt() {
            if (qXB.this.KWHzl != null) {
                Triple triple = qXB.this.KWHzl;
                if (triple != null) {
                    return (java.util.List) triple.getThird();
                }
                return null;
            }
            throw new java.lang.RuntimeException("should invoke registerUiStateViews() method first");
        }
    }

    public final ActionBar AEQbTJ() {
        return (ActionBar) this.OLrzqt.getValue();
    }

    public static final ActionBar copydefault(qXB qxb) {
        return qxb.new ActionBar();
    }

    public void KWHzl(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        AEQbTJ(c55113xdn);
        this.KWHzl = new Triple<>(c55173xeu, c55113xdn, yDV.AwvSrB(viewArr));
    }

    public void AEQbTJ(C55113xdn c55113xdn) {
        if (c55113xdn != null) {
            c55113xdn.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
    }

    @Override // o.qXK
    public void copydefault(long j) {
        C55173xeu c55173xeuKWHzl = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl != null) {
            c55173xeuKWHzl.setVisibility(8);
        }
        C55113xdn c55113xdnEZpvd = AEQbTJ().EZpvd();
        if (c55113xdnEZpvd != null) {
            c55113xdnEZpvd.KWHzl(j);
        }
        java.util.List<android.view.View> listOLrzqt = AEQbTJ().OLrzqt();
        if (listOLrzqt != null) {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setVisibility(8);
            }
        }
    }

    @Override // o.qXK
    public void EZpvd(int i, int i2, int i3, @NotNull Function0<Unit> function0) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf == null || (strAYXKKw = C33070mpX.AYXKKw(numValueOf.intValue())) == null) {
            strAYXKKw = "";
        }
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 == null || (strAYXKKw2 = C33070mpX.AYXKKw(numValueOf2.intValue())) == null) {
            strAYXKKw2 = "";
        }
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i3);
        java.lang.Integer num = numValueOf3.intValue() != 0 ? numValueOf3 : null;
        if (num != null && (strAYXKKw3 = C33070mpX.AYXKKw(num.intValue())) != null) {
            str = strAYXKKw3;
        }
        copydefault(strAYXKKw, strAYXKKw2, str, function0);
    }

    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C55173xeu c55173xeuKWHzl = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl != null) {
            c55173xeuKWHzl.setVisibility(0);
        }
        C55173xeu c55173xeuKWHzl2 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl2 != null) {
            c55173xeuKWHzl2.setEmptyTypeImage(8);
        }
        C55173xeu c55173xeuKWHzl3 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl3 != null) {
            if (str == null) {
                str = "";
            }
            c55173xeuKWHzl3.setTitle(str);
        }
        C55173xeu c55173xeuKWHzl4 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl4 != null) {
            if (str2 == null) {
                str2 = "";
            }
            c55173xeuKWHzl4.setSubTitle((java.lang.CharSequence) str2);
        }
        C55173xeu c55173xeuKWHzl5 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl5 != null) {
            if (str3 == null) {
                str3 = "";
            }
            c55173xeuKWHzl5.setRetry(str3);
        }
        C55173xeu c55173xeuKWHzl6 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl6 != null) {
            c55173xeuKWHzl6.setRetryClickListener(new View.OnClickListener() { // from class: o.qXE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    qXB.copydefault(function0, view);
                }
            });
        }
        C55113xdn c55113xdnEZpvd = AEQbTJ().EZpvd();
        if (c55113xdnEZpvd != null) {
            c55113xdnEZpvd.copydefault();
        }
        java.util.List<android.view.View> listOLrzqt = AEQbTJ().OLrzqt();
        if (listOLrzqt != null) {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setVisibility(8);
            }
        }
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    @Override // o.qXK
    public void AEQbTJ(int i, int i2, int i3, int i4, @NotNull Function0<Unit> function0) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        java.lang.String str = (numValueOf == null || (strAYXKKw3 = C33070mpX.AYXKKw(numValueOf.intValue())) == null) ? "" : strAYXKKw3;
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        java.lang.String str2 = (numValueOf2 == null || (strAYXKKw2 = C33070mpX.AYXKKw(numValueOf2.intValue())) == null) ? "" : strAYXKKw2;
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i3);
        java.lang.Integer num = numValueOf3.intValue() != 0 ? numValueOf3 : null;
        AEQbTJ(str, str2, (num == null || (strAYXKKw = C33070mpX.AYXKKw(num.intValue())) == null) ? "" : strAYXKKw, i4, function0);
    }

    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C55173xeu c55173xeuKWHzl = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl != null) {
            c55173xeuKWHzl.setVisibility(0);
        }
        C55173xeu c55173xeuKWHzl2 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl2 != null) {
            c55173xeuKWHzl2.setEmptyTypeImage(i);
        }
        C55173xeu c55173xeuKWHzl3 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl3 != null) {
            if (str == null) {
                str = "";
            }
            c55173xeuKWHzl3.setTitle(str);
        }
        C55173xeu c55173xeuKWHzl4 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl4 != null) {
            if (str2 == null) {
                str2 = "";
            }
            c55173xeuKWHzl4.setSubTitle((java.lang.CharSequence) str2);
        }
        C55173xeu c55173xeuKWHzl5 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl5 != null) {
            if (str3 == null) {
                str3 = "";
            }
            c55173xeuKWHzl5.setRetry(str3);
        }
        C55173xeu c55173xeuKWHzl6 = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl6 != null) {
            c55173xeuKWHzl6.setRetryClickListener(new View.OnClickListener() { // from class: o.qXJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    qXB.KWHzl(function0, view);
                }
            });
        }
        C55113xdn c55113xdnEZpvd = AEQbTJ().EZpvd();
        if (c55113xdnEZpvd != null) {
            c55113xdnEZpvd.copydefault();
        }
        java.util.List<android.view.View> listOLrzqt = AEQbTJ().OLrzqt();
        if (listOLrzqt != null) {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setVisibility(8);
            }
        }
    }

    public static final void KWHzl(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public void copydefault() {
        C55173xeu c55173xeuKWHzl = AEQbTJ().KWHzl();
        if (c55173xeuKWHzl != null) {
            c55173xeuKWHzl.setVisibility(8);
        }
        C55113xdn c55113xdnEZpvd = AEQbTJ().EZpvd();
        if (c55113xdnEZpvd != null) {
            c55113xdnEZpvd.copydefault();
        }
        java.util.List<android.view.View> listOLrzqt = AEQbTJ().OLrzqt();
        if (listOLrzqt != null) {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setVisibility(0);
            }
        }
    }
}
