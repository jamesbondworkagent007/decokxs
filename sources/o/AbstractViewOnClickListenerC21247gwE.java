package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8485bDc;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.C52761wXj;
import o.C8491bDi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractViewOnClickListenerC21247gwE<FI extends C8491bDi, FH extends AbstractC8485bDc<FI>> extends wXX implements View.OnClickListener {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public static AbstractC8485bDc<?> gEmmrt;
    public FH AkhnZx;
    public AbstractC16633enc fetchVPNInfo;
    public AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity isConnected;
    public java.util.List<? extends android.view.View> values;
    public float AYXKKw = 0.92f;
    public boolean valueOf = true;
    public boolean AhwBna = true;

    public abstract boolean AEQbTJ();

    public abstract void EZpvd();

    public abstract void EZpvd(@NotNull FI fi);

    public abstract void EZpvd(@NotNull FI fi, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(int i) {
        if (i != 1) {
            return i == 2 && this.valueOf;
        }
        return true;
    }

    public abstract void KWHzl(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull AbstractC16633enc abstractC16633enc) {
        Intrinsics.checkNotNullParameter(abstractC16633enc, "");
        this.fetchVPNInfo = abstractC16633enc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.gwE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractViewOnClickListenerC21247gwE<?, ?> EZpvd(@NotNull AbstractC8485bDc<?> abstractC8485bDc) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(abstractC8485bDc, "");
            AbstractViewOnClickListenerC21247gwE.gEmmrt = abstractC8485bDc;
            if (abstractC8485bDc instanceof AbstractC9346bTp) {
                return new C21294gwz();
            }
            if (abstractC8485bDc instanceof C11990ceW) {
                return new C21248gwF();
            }
            if (abstractC8485bDc instanceof C8843bKP) {
                return new C21290gwv();
            }
            throw new java.lang.Exception("");
        }
    }

    public final AbstractC16633enc djBIcL() {
        AbstractC16633enc abstractC16633enc = this.fetchVPNInfo;
        if (abstractC16633enc != null) {
            return abstractC16633enc;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) throws java.lang.Exception {
        super.onCreate(bundle);
        FH fh = (FH) gEmmrt;
        if (fh == null) {
            dismissAllowingStateLoss();
        } else {
            if (fh == null) {
                throw new java.lang.Exception("");
            }
            this.AkhnZx = fh;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(3);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RgLUBD));
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.gwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractViewOnClickListenerC21247gwE.copydefault(this.OLrzqt, view);
            }
        });
    }

    public static final void copydefault(AbstractViewOnClickListenerC21247gwE abstractViewOnClickListenerC21247gwE, android.view.View view) {
        abstractViewOnClickListenerC21247gwE.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        OLrzqt(AbstractC16633enc.OLrzqt(android.view.LayoutInflater.from(getContext()), constraintLayout, true));
        copydefault();
        AbstractC58185ywX<java.util.List<FeeItem>> abstractC58185ywXValues = AhwBna().values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXValues, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.gwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractViewOnClickListenerC21247gwE.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractViewOnClickListenerC21247gwE.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractViewOnClickListenerC21247gwE.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractViewOnClickListenerC21247gwE.copydefault(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractViewOnClickListenerC21247gwE abstractViewOnClickListenerC21247gwE, java.util.List list) {
        abstractViewOnClickListenerC21247gwE.isConnected();
        Intrinsics.copydefault(list);
        abstractViewOnClickListenerC21247gwE.EZpvd(list);
        abstractViewOnClickListenerC21247gwE.OLrzqt();
        if (((C8486bDd) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getFeeChangeType() == 3) {
            abstractViewOnClickListenerC21247gwE.AEQbTJ(abstractViewOnClickListenerC21247gwE.djBIcL().EZpvd.getRoot().isSelected());
        }
        if (abstractViewOnClickListenerC21247gwE.AhwBna) {
            abstractViewOnClickListenerC21247gwE.AhwBna = false;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractViewOnClickListenerC21247gwE, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault() {
        java.util.List<? extends android.view.View> listGEmmrt = yDY.gEmmrt(djBIcL().AEQbTJ.getRoot(), djBIcL().AhwBna.getRoot(), djBIcL().copydefault.getRoot(), djBIcL().EZpvd.getRoot());
        this.values = listGEmmrt;
        if (listGEmmrt != null) {
            java.util.Iterator<T> it = listGEmmrt.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setOnClickListener(this);
            }
        }
        djBIcL().EZpvd.isConnected.setOnClickListener(this);
    }

    public final void copydefault(@NotNull C8491bDi c8491bDi, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC16843era abstractC16843era;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        AbstractC16843era abstractC16843era2;
        java.lang.Integer num;
        Intrinsics.checkNotNullParameter(c8491bDi, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (c8491bDi.getFeeType()) {
            case 31:
                abstractC16843era = djBIcL().AEQbTJ;
                numValueOf = java.lang.Integer.valueOf(C52761wXj.TaskDescription.iWlNch);
                numValueOf2 = java.lang.Integer.valueOf(C13754dXa.FragmentManager.fdt);
                java.lang.Integer num2 = numValueOf2;
                abstractC16843era2 = abstractC16843era;
                num = num2;
                break;
            case 32:
                abstractC16843era = djBIcL().AhwBna;
                numValueOf = java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPQdUnVm);
                numValueOf2 = java.lang.Integer.valueOf(C13754dXa.FragmentManager.invokespecialDaTmkG);
                java.lang.Integer num22 = numValueOf2;
                abstractC16843era2 = abstractC16843era;
                num = num22;
                break;
            case 33:
                abstractC16843era = djBIcL().copydefault;
                numValueOf = java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPQPAeHI);
                numValueOf2 = java.lang.Integer.valueOf(C13754dXa.FragmentManager.FYtjSf);
                java.lang.Integer num222 = numValueOf2;
                abstractC16843era2 = abstractC16843era;
                num = num222;
                break;
            default:
                num = null;
                numValueOf = null;
                abstractC16843era2 = null;
                break;
        }
        if (abstractC16843era2 == null || numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        if (num != null) {
            copydefault(abstractC16843era2, iIntValue, num.intValue(), c8491bDi.getFormatCost(), str, c8491bDi.getFeeUnit(), str2);
        }
    }

    public final void copydefault(AbstractC16843era abstractC16843era, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.view.View root = abstractC16843era.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        KWHzl(root);
        abstractC16843era.AEQbTJ.setImageResource(i);
        abstractC16843era.OLrzqt.setText(getString(i2));
        if (str == null || str.length() == 0) {
            abstractC16843era.KWHzl.setVisibility(8);
        } else {
            abstractC16843era.KWHzl.setText(str);
        }
        AbstractC17075evu abstractC17075evu = abstractC16843era.EZpvd;
        abstractC17075evu.AEQbTJ.setText(str2);
        abstractC17075evu.OLrzqt.setText(" " + str3);
        abstractC17075evu.gEmmrt.setText(AbstractC8426bCW.formatToFeeCoinAmount$default(AhwBna(), str4, false, false, false, 10, null));
        abstractC17075evu.EZpvd.setText(" " + AhwBna().AYXKKw().fJNWhG());
        abstractC17075evu.KWHzl.setText(AbstractC8426bCW.formatToFeeCurrencyAmount$default(AhwBna(), str4, false, false, false, 14, null));
        abstractC17075evu.copydefault.setVisibility(8);
        abstractC17075evu.copydefault.setText("");
    }

    public final void OLrzqt(@NotNull C8486bDd c8486bDd, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (i == 0 && abstractC16844erb.getRoot().isSelected()) {
            return;
        }
        if (i != 2 || this.valueOf) {
            android.view.View root = abstractC16844erb.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            KWHzl(root);
            abstractC16844erb.AEQbTJ.setText(c8486bDd.getFormatCost());
            AbstractC17075evu abstractC17075evu = abstractC16844erb.fetchVPNInfo;
            abstractC17075evu.AEQbTJ.setText(str);
            abstractC17075evu.OLrzqt.setText(" " + c8486bDd.getFeeUnit());
            abstractC17075evu.gEmmrt.setText(AbstractC8426bCW.formatToFeeCoinAmount$default(AhwBna(), str2, false, false, false, 10, null));
            abstractC17075evu.EZpvd.setText(" " + AhwBna().AYXKKw().fJNWhG());
            abstractC17075evu.KWHzl.setText(AbstractC8426bCW.formatToFeeCurrencyAmount$default(AhwBna(), str2, false, false, false, 14, null));
            abstractC17075evu.copydefault.setVisibility(8);
            abstractC17075evu.copydefault.setText("");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.getAudioAttributes;
        if (numValueOf != null && numValueOf.intValue() == i) {
            values();
            return;
        }
        if (Intrinsics.EZpvd(view, djBIcL().EZpvd.getRoot())) {
            KWHzl(!valueOf(), 2);
        } else {
            this.valueOf = true;
            KWHzl(false, 2);
        }
        java.util.List<? extends android.view.View> list = this.values;
        if (list != null) {
            for (android.view.View view2 : list) {
                view2.setSelected(Intrinsics.EZpvd(view2, view));
            }
        }
        if (!Intrinsics.EZpvd(view, djBIcL().EZpvd.getRoot())) {
            values();
        }
        OLrzqt();
    }

    public final void KWHzl(boolean z, int i) {
        AbstractC16844erb abstractC16844erb = djBIcL().EZpvd;
        if (z) {
            abstractC16844erb.OLrzqt.setVisibility(0);
            abstractC16844erb.fJNWhG.setVisibility(0);
            abstractC16844erb.copydefault.setRotation(270.0f);
        } else {
            abstractC16844erb.OLrzqt.setVisibility(4);
            abstractC16844erb.fJNWhG.setVisibility(8);
            abstractC16844erb.copydefault.setRotation(90.0f);
        }
        KWHzl(z);
        if (z) {
            EZpvd(AhwBna().EZpvd(4), i);
        }
        if (z && this.valueOf) {
            this.valueOf = false;
        }
    }

    public final void values() {
        if (djBIcL().AEQbTJ.getRoot().isSelected()) {
            AEQbTJ(31);
            KWHzl(AhwBna().AYXKKw().fJNWhG(), "slow");
        } else if (djBIcL().AhwBna.getRoot().isSelected()) {
            AEQbTJ(32);
            KWHzl(AhwBna().AYXKKw().fJNWhG(), "average");
        } else if (djBIcL().copydefault.getRoot().isSelected()) {
            AEQbTJ(33);
            KWHzl(AhwBna().AYXKKw().fJNWhG(), "fast");
        } else if (djBIcL().EZpvd.getRoot().isSelected()) {
            EZpvd();
            KWHzl(AhwBna().AYXKKw().fJNWhG(), "custom");
        }
        dismissAllowingStateLoss();
    }

    public void AEQbTJ(int i) {
        AhwBna().copydefault(i);
    }

    public final void OLrzqt() {
        djBIcL().EZpvd.isConnected.setSelected(false);
        djBIcL().EZpvd.isConnected.setEnabled(djBIcL().EZpvd.getRoot().isSelected() ? AEQbTJ() : true);
        if (!djBIcL().EZpvd.isConnected.isEnabled()) {
            djBIcL().EZpvd.values.setChecked(false);
            djBIcL().EZpvd.values.setEnabled(false);
        } else {
            djBIcL().EZpvd.values.setEnabled(true);
        }
    }

    public final void AEQbTJ(boolean z) {
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(600L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().AEQbTJ.KWHzl, "alpha", 1.0f, 0.0f, 1.0f));
        arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().AEQbTJ.copydefault, "alpha", 1.0f, 0.0f, 1.0f));
        arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().AhwBna.KWHzl, "alpha", 1.0f, 0.0f, 1.0f));
        arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().AhwBna.copydefault, "alpha", 1.0f, 0.0f, 1.0f));
        arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().copydefault.KWHzl, "alpha", 1.0f, 0.0f, 1.0f));
        arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().copydefault.copydefault, "alpha", 1.0f, 0.0f, 1.0f));
        if (z) {
            arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().EZpvd.AYXKKw.KWHzl, "alpha", 1.0f, 0.0f, 1.0f));
        } else {
            arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().EZpvd.AEQbTJ, "alpha", 1.0f, 0.0f, 1.0f));
            arrayList.add(android.animation.ObjectAnimator.ofFloat(djBIcL().EZpvd.AhwBna, "alpha", 1.0f, 0.0f, 1.0f));
        }
        duration.playTogether(arrayList);
        duration.start();
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, @NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.isConnected = activity;
        super.show(fragmentManager, str);
    }

    public final FH AhwBna() {
        FH fh = this.AkhnZx;
        Intrinsics.copydefault(fh);
        return fh;
    }

    public final int AYXKKw() {
        return AhwBna().AYXKKw().valueOf();
    }

    public final void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public final boolean valueOf() {
        return djBIcL().EZpvd.OLrzqt.getVisibility() == 0;
    }

    private final void KWHzl(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("NetworkFee_Sheet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.gwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractViewOnClickListenerC21247gwE.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("payment_crypto", str, false));
        eventParamsList.add(new EventParam("network_speed", str2, true));
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        android.content.Context context = getContext();
        if (context != null) {
            C33054mpH.OLrzqt(context, djBIcL().EZpvd.AEQbTJ);
        }
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity = this.isConnected;
        if (activity != null) {
            activity.copydefault(null);
        }
    }

    public final void isConnected() {
        java.util.List<? extends android.view.View> list = this.values;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((android.view.View) it.next()).isSelected()) {
                    return;
                }
            }
        }
        java.lang.Object objAhwBna = AhwBna();
        if (objAhwBna instanceof InterfaceC9347bTq) {
            InterfaceC9347bTq interfaceC9347bTq = (InterfaceC9347bTq) objAhwBna;
            if (interfaceC9347bTq.fIwbmz() == 0 || interfaceC9347bTq.fIwbmz() == 1) {
                djBIcL().EZpvd.getRoot().setSelected(true);
                KWHzl(true, 1);
                return;
            }
        }
        int iDbNXlk = AhwBna().DbNXlk();
        if (iDbNXlk != 4) {
            switch (iDbNXlk) {
                case 31:
                    djBIcL().AEQbTJ.getRoot().setSelected(true);
                    break;
                case 32:
                    djBIcL().AhwBna.getRoot().setSelected(true);
                    break;
                case 33:
                    djBIcL().copydefault.getRoot().setSelected(true);
                    break;
            }
            return;
        }
        djBIcL().EZpvd.getRoot().setSelected(true);
        djBIcL().EZpvd.isConnected.setSelected(false);
        KWHzl(true, 1);
    }

    public final void EZpvd(java.util.List<? extends FI> list) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C8491bDi c8491bDi = (C8491bDi) it.next();
            if (c8491bDi.getFeeType() == 4) {
                EZpvd(c8491bDi, 0);
            } else {
                EZpvd(c8491bDi);
            }
        }
    }
}
