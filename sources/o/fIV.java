package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fIV extends AbstractC57671ymn {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AbstractC16458ekM AEQbTJ;
    public boolean AYXKKw;
    public Function2<? super java.lang.Integer, ? super java.lang.String, Unit> EZpvd;
    public java.lang.Float copydefault;
    public java.lang.Integer valueOf;
    public final java.util.HashMap<java.lang.Integer, java.lang.Integer> gEmmrt = new java.util.HashMap<>();
    public final java.util.ArrayList<android.widget.CheckBox> OLrzqt = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public boolean isConnected() {
        return this.AYXKKw;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fIV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final fIV EZpvd() {
            return new fIV();
        }
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16458ekM abstractC16458ekM = (AbstractC16458ekM) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.ULRxlR, viewGroup, false);
        this.AEQbTJ = abstractC16458ekM;
        if (abstractC16458ekM == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM = null;
        }
        return abstractC16458ekM.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC16458ekM abstractC16458ekM = this.AEQbTJ;
        AbstractC16458ekM abstractC16458ekM2 = null;
        if (abstractC16458ekM == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16458ekM.OLrzqt);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.fIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fIV.EZpvd(this.KWHzl, obj);
            }
        });
        AbstractC16458ekM abstractC16458ekM3 = this.AEQbTJ;
        if (abstractC16458ekM3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM3 = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(abstractC16458ekM3.EZpvd).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst2, this).subscribe(new InterfaceC58227yxM() { // from class: o.fIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fIV.KWHzl(this.EZpvd, obj);
            }
        });
        AbstractC16458ekM abstractC16458ekM4 = this.AEQbTJ;
        if (abstractC16458ekM4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM4 = null;
        }
        abstractC16458ekM4.AEQbTJ.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatTransportControlsApi23));
        AbstractC16458ekM abstractC16458ekM5 = this.AEQbTJ;
        if (abstractC16458ekM5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM5 = null;
        }
        abstractC16458ekM5.djBIcL.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.skipToPrevious));
        AbstractC16458ekM abstractC16458ekM6 = this.AEQbTJ;
        if (abstractC16458ekM6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM6 = null;
        }
        abstractC16458ekM6.valueOf.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.createCallback));
        AbstractC16458ekM abstractC16458ekM7 = this.AEQbTJ;
        if (abstractC16458ekM7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM7 = null;
        }
        abstractC16458ekM7.AhwBna.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatTransportControlsBase));
        java.util.ArrayList<android.widget.CheckBox> arrayList = this.OLrzqt;
        wYK[] wykArr = new wYK[4];
        AbstractC16458ekM abstractC16458ekM8 = this.AEQbTJ;
        if (abstractC16458ekM8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM8 = null;
        }
        wykArr[0] = abstractC16458ekM8.AEQbTJ.AEQbTJ;
        AbstractC16458ekM abstractC16458ekM9 = this.AEQbTJ;
        if (abstractC16458ekM9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM9 = null;
        }
        wykArr[1] = abstractC16458ekM9.djBIcL.AEQbTJ;
        AbstractC16458ekM abstractC16458ekM10 = this.AEQbTJ;
        if (abstractC16458ekM10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16458ekM10 = null;
        }
        wykArr[2] = abstractC16458ekM10.valueOf.AEQbTJ;
        AbstractC16458ekM abstractC16458ekM11 = this.AEQbTJ;
        if (abstractC16458ekM11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16458ekM2 = abstractC16458ekM11;
        }
        wykArr[3] = abstractC16458ekM2.AhwBna.AEQbTJ;
        arrayList.addAll(yDY.gEmmrt(wykArr));
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((android.widget.CheckBox) it.next()).setOnClickListener(new View.OnClickListener() { // from class: o.fIW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    fIV.AEQbTJ(this.KWHzl, view2);
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.fIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fIV.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(fIV fiv, java.lang.Object obj) {
        fiv.KWHzl((java.lang.Integer) 2);
    }

    public static final void KWHzl(fIV fiv, java.lang.Object obj) {
        fiv.KWHzl((java.lang.Integer) 1);
    }

    public static final void AEQbTJ(fIV fiv, android.view.View view) {
        Intrinsics.copydefault(view, "");
        fiv.AEQbTJ((android.widget.CheckBox) view);
    }

    public static final void KWHzl(fIV fiv) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) fiv, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(android.widget.CheckBox checkBox) {
        int iIndexOf = this.OLrzqt.indexOf(checkBox);
        checkBox.setSelected(!checkBox.isSelected());
        if (checkBox.isSelected()) {
            this.gEmmrt.put(java.lang.Integer.valueOf(iIndexOf), java.lang.Integer.valueOf(iIndexOf));
        } else if (this.gEmmrt.containsKey(java.lang.Integer.valueOf(iIndexOf))) {
            this.gEmmrt.remove(java.lang.Integer.valueOf(iIndexOf));
        }
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
        show(fragmentManager, fIV.class.getName());
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        java.lang.Integer num = this.valueOf;
        if (num != null || (function2 = this.EZpvd) == null) {
            return;
        }
        function2.invoke(num, null);
    }

    public final void KWHzl(java.lang.Integer num) {
        this.valueOf = num;
        java.util.Iterator<Map.Entry<java.lang.Integer, java.lang.Integer>> it = this.gEmmrt.entrySet().iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = ((java.lang.Object) str) + (it.next().getValue().intValue() + 1) + ",";
        }
        dismissAllowingStateLoss();
        Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2 = this.EZpvd;
        if (function2 != null) {
            function2.invoke(num, str);
        }
    }
}
