package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.util.TipTool;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C21282gwn;
import o.C52761wXj;
import o.C57406yhn;
import o.C9225bRa;
import o.ViewOnClickListenerC21275gwg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21274gwf extends AbstractC14668dpm implements View.OnClickListener {
    public AbstractC16549ely AhwBna;
    public boolean EZpvd;
    public boolean KWHzl = true;
    public C9225bRa.Activity OLrzqt;
    public java.util.List<? extends android.view.View> copydefault;
    public InterfaceC9041bOB isConnected;
    public C9225bRa valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gwf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ViewOnClickListenerC21274gwf AEQbTJ(InterfaceC9041bOB interfaceC9041bOB) {
            ViewOnClickListenerC21274gwf viewOnClickListenerC21274gwf = new ViewOnClickListenerC21274gwf();
            viewOnClickListenerC21274gwf.isConnected = interfaceC9041bOB;
            return viewOnClickListenerC21274gwf;
        }
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AEQbTJ();
        AbstractC16549ely abstractC16549elyKWHzl = AbstractC16549ely.KWHzl(android.view.LayoutInflater.from(getContext()), viewGroup, false);
        this.AhwBna = abstractC16549elyKWHzl;
        if (abstractC16549elyKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC16549elyKWHzl = null;
        }
        android.view.View root = abstractC16549elyKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C9225bRa c9225bRaIsConnected;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.DGgkXd));
        KWHzl();
        InterfaceC9041bOB interfaceC9041bOB = this.isConnected;
        if (interfaceC9041bOB == null || (c9225bRaIsConnected = interfaceC9041bOB.isConnected()) == null) {
            return;
        }
        this.valueOf = c9225bRaIsConnected;
        AbstractC58185ywX<FeeItem> abstractC58185ywXIsConnected = c9225bRaIsConnected.isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXIsConnected, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.gwj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC21274gwf.AEQbTJ(this.KWHzl, (C9165bQT) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC21274gwf.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gwh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC21274gwf.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC21274gwf.KWHzl(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC21274gwf viewOnClickListenerC21274gwf, C9165bQT c9165bQT) {
        java.lang.Object next;
        C9225bRa.Activity activity;
        java.lang.Object next2;
        if (viewOnClickListenerC21274gwf.OLrzqt == null) {
            C9225bRa c9225bRa = viewOnClickListenerC21274gwf.valueOf;
            if (c9225bRa == null) {
                Intrinsics.gEmmrt("");
                c9225bRa = null;
            }
            java.util.Iterator<T> it = c9225bRa.zsXlph().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                long jAhwBna = ((C9225bRa.Activity) next2).copydefault().AhwBna();
                C9225bRa c9225bRa2 = viewOnClickListenerC21274gwf.valueOf;
                if (c9225bRa2 == null) {
                    Intrinsics.gEmmrt("");
                    c9225bRa2 = null;
                }
                if (jAhwBna == c9225bRa2.AYXKKw().AhwBna()) {
                    break;
                }
            }
            activity = (C9225bRa.Activity) next2;
            if (activity == null) {
                return Unit.INSTANCE;
            }
        } else {
            C9225bRa c9225bRa3 = viewOnClickListenerC21274gwf.valueOf;
            if (c9225bRa3 == null) {
                Intrinsics.gEmmrt("");
                c9225bRa3 = null;
            }
            java.util.Iterator<T> it2 = c9225bRa3.zsXlph().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                long jAhwBna2 = ((C9225bRa.Activity) next).copydefault().AhwBna();
                C9225bRa.Activity activity2 = viewOnClickListenerC21274gwf.OLrzqt;
                if (activity2 == null) {
                    Intrinsics.gEmmrt("");
                    activity2 = null;
                }
                if (jAhwBna2 == activity2.copydefault().AhwBna()) {
                    break;
                }
            }
            activity = (C9225bRa.Activity) next;
            if (activity == null) {
                return Unit.INSTANCE;
            }
        }
        viewOnClickListenerC21274gwf.OLrzqt = activity;
        viewOnClickListenerC21274gwf.gEmmrt();
        if (c9165bQT.getFeeChangeType() == 3) {
            viewOnClickListenerC21274gwf.fARcdN();
        }
        if (viewOnClickListenerC21274gwf.KWHzl) {
            viewOnClickListenerC21274gwf.KWHzl = false;
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC21274gwf, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        AbstractC16549ely abstractC16549ely = this.AhwBna;
        AbstractC16549ely abstractC16549ely2 = null;
        if (abstractC16549ely == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely = null;
        }
        android.widget.TextView textView = abstractC16549ely.AkhnZx;
        C9225bRa.Activity activity = this.OLrzqt;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        textView.setText(activity.copydefault().fJNWhG());
        AbstractC16549ely abstractC16549ely3 = this.AhwBna;
        if (abstractC16549ely3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely3 = null;
        }
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(abstractC16549ely3.EZpvd);
        C9225bRa.Activity activity2 = this.OLrzqt;
        if (activity2 == null) {
            Intrinsics.gEmmrt("");
            activity2 = null;
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = componentCallbacks2C5333NrKWHzl.EZpvd(activity2.copydefault().DbNXlk());
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        C5335Nt c5335NtAEQbTJ = c5335NtEZpvd.copydefault(c14726dqr.OLrzqt()).KWHzl(c14726dqr.OLrzqt()).AEQbTJ(c14726dqr.OLrzqt());
        AbstractC16549ely abstractC16549ely4 = this.AhwBna;
        if (abstractC16549ely4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16549ely2 = abstractC16549ely4;
        }
        c5335NtAEQbTJ.EZpvd((android.widget.ImageView) abstractC16549ely2.EZpvd);
    }

    public final void AYXKKw() {
        java.lang.String strConvertToString$default;
        java.lang.String strFARcdN;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        AbstractC16549ely abstractC16549ely = null;
        switch (EZpvd()) {
            case 31:
                C9225bRa.Activity activity = this.OLrzqt;
                if (activity == null) {
                    Intrinsics.gEmmrt("");
                    activity = null;
                }
                java.lang.String strFetchVPNInfo = activity.fetchVPNInfo();
                C9225bRa.Activity activity2 = this.OLrzqt;
                if (activity2 == null) {
                    Intrinsics.gEmmrt("");
                    activity2 = null;
                }
                strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(strFetchVPNInfo, activity2.fARcdN()), false, null, null, 7, null);
                C9225bRa.Activity activity3 = this.OLrzqt;
                if (activity3 == null) {
                    Intrinsics.gEmmrt("");
                    activity3 = null;
                }
                strFARcdN = activity3.fARcdN();
                break;
            case 32:
                C9225bRa.Activity activity4 = this.OLrzqt;
                if (activity4 == null) {
                    Intrinsics.gEmmrt("");
                    activity4 = null;
                }
                java.lang.String strValueOf = activity4.valueOf();
                C9225bRa.Activity activity5 = this.OLrzqt;
                if (activity5 == null) {
                    Intrinsics.gEmmrt("");
                    activity5 = null;
                }
                strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(strValueOf, activity5.DbNXlk()), false, null, null, 7, null);
                C9225bRa.Activity activity6 = this.OLrzqt;
                if (activity6 == null) {
                    Intrinsics.gEmmrt("");
                    activity6 = null;
                }
                strFARcdN = activity6.DbNXlk();
                break;
            case 33:
                C9225bRa.Activity activity7 = this.OLrzqt;
                if (activity7 == null) {
                    Intrinsics.gEmmrt("");
                    activity7 = null;
                }
                java.lang.String strOLrzqt = activity7.OLrzqt();
                C9225bRa.Activity activity8 = this.OLrzqt;
                if (activity8 == null) {
                    Intrinsics.gEmmrt("");
                    activity8 = null;
                }
                strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(strOLrzqt, activity8.AhwBna()), false, null, null, 7, null);
                C9225bRa.Activity activity9 = this.OLrzqt;
                if (activity9 == null) {
                    Intrinsics.gEmmrt("");
                    activity9 = null;
                }
                strFARcdN = activity9.AhwBna();
                break;
            default:
                return;
        }
        AbstractC16549ely abstractC16549ely2 = this.AhwBna;
        if (abstractC16549ely2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely2 = null;
        }
        abstractC16549ely2.ejfBZ.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        AbstractC16549ely abstractC16549ely3 = this.AhwBna;
        if (abstractC16549ely3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely3 = null;
        }
        android.widget.TextView textView = abstractC16549ely3.ejfBZ;
        C17946fYd c17946fYd = C17946fYd.AEQbTJ;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        InterfaceC9041bOB interfaceC9041bOB = this.isConnected;
        if (interfaceC9041bOB == null) {
            return;
        }
        if (C33129mqd.AEQbTJ(strFARcdN, "0")) {
            C9225bRa.Activity activity10 = this.OLrzqt;
            if (activity10 == null) {
                Intrinsics.gEmmrt("");
                activity10 = null;
            }
            strKWHzl = activity10.KWHzl(strFARcdN, true);
        } else {
            strKWHzl = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strFARcdN)) {
            C9225bRa.Activity activity11 = this.OLrzqt;
            if (activity11 == null) {
                Intrinsics.gEmmrt("");
                activity11 = null;
            }
            strKWHzl2 = activity11.KWHzl(strConvertToString$default, true);
        } else {
            strKWHzl2 = null;
        }
        InterfaceC9041bOB interfaceC9041bOB2 = this.isConnected;
        int iUzCIH = interfaceC9041bOB2 != null ? interfaceC9041bOB2.uzCIH() : 0;
        InterfaceC9041bOB interfaceC9041bOB3 = this.isConnected;
        textView.setText(c17946fYd.copydefault(childFragmentManager, interfaceC9041bOB, strKWHzl, strKWHzl2, iUzCIH, interfaceC9041bOB3 != null ? interfaceC9041bOB3.zsXlph() : 1));
        AbstractC16549ely abstractC16549ely4 = this.AhwBna;
        if (abstractC16549ely4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely4 = null;
        }
        android.widget.TextView textView2 = abstractC16549ely4.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        AbstractC16549ely abstractC16549ely5 = this.AhwBna;
        if (abstractC16549ely5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16549ely = abstractC16549ely5;
        }
        java.lang.CharSequence text = abstractC16549ely.ejfBZ.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        textView2.setVisibility(text.length() <= 0 ? 8 : 0);
    }

    public final int EZpvd() {
        AbstractC16549ely abstractC16549ely = this.AhwBna;
        AbstractC16549ely abstractC16549ely2 = null;
        if (abstractC16549ely == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely = null;
        }
        if (abstractC16549ely.djBIcL.getRoot().isSelected()) {
            return 31;
        }
        AbstractC16549ely abstractC16549ely3 = this.AhwBna;
        if (abstractC16549ely3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely3 = null;
        }
        if (!abstractC16549ely3.fetchVPNInfo.getRoot().isSelected()) {
            AbstractC16549ely abstractC16549ely4 = this.AhwBna;
            if (abstractC16549ely4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16549ely2 = abstractC16549ely4;
            }
            if (abstractC16549ely2.OLrzqt.getRoot().isSelected()) {
                return 33;
            }
        }
        return 32;
    }

    public final void values() {
        if (fPD.copydefault.AEQbTJ()) {
            C9225bRa c9225bRa = this.valueOf;
            AbstractC16549ely abstractC16549ely = null;
            if (c9225bRa == null) {
                Intrinsics.gEmmrt("");
                c9225bRa = null;
            }
            java.util.Iterator<T> it = c9225bRa.zsXlph().iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((C9225bRa.Activity) it.next()).fJNWhG()) {
                    z = true;
                }
            }
            if (z) {
                TipTool.TaskDescription taskDescription = TipTool.Companion;
                AbstractC16549ely abstractC16549ely2 = this.AhwBna;
                if (abstractC16549ely2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16549ely = abstractC16549ely2;
                }
                AppCompatImageView appCompatImageView = abstractC16549ely.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                taskDescription.KWHzl(appCompatImageView).OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPanelState)).AEQbTJ(TipTool.Position.BOTTOM).EZpvd(true).djBIcL();
                fPD.copydefault.OLrzqt(false);
            }
        }
    }

    public final void KWHzl() {
        android.view.View[] viewArr = new android.view.View[3];
        AbstractC16549ely abstractC16549ely = this.AhwBna;
        AbstractC16549ely abstractC16549ely2 = null;
        if (abstractC16549ely == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely = null;
        }
        viewArr[0] = abstractC16549ely.djBIcL.getRoot();
        AbstractC16549ely abstractC16549ely3 = this.AhwBna;
        if (abstractC16549ely3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely3 = null;
        }
        viewArr[1] = abstractC16549ely3.fetchVPNInfo.getRoot();
        AbstractC16549ely abstractC16549ely4 = this.AhwBna;
        if (abstractC16549ely4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely4 = null;
        }
        viewArr[2] = abstractC16549ely4.OLrzqt.getRoot();
        java.util.List<? extends android.view.View> listGEmmrt = yDY.gEmmrt(viewArr);
        this.copydefault = listGEmmrt;
        if (listGEmmrt != null) {
            java.util.Iterator<T> it = listGEmmrt.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setOnClickListener(this);
            }
        }
        AbstractC16549ely abstractC16549ely5 = this.AhwBna;
        if (abstractC16549ely5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely5 = null;
        }
        abstractC16549ely5.AhwBna.setOnClickListener(this);
        AbstractC16549ely abstractC16549ely6 = this.AhwBna;
        if (abstractC16549ely6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely6 = null;
        }
        abstractC16549ely6.copydefault.setOnClickListener(this);
        AbstractC16549ely abstractC16549ely7 = this.AhwBna;
        if (abstractC16549ely7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely7 = null;
        }
        abstractC16549ely7.AYXKKw.setOnClickListener(this);
        AbstractC16549ely abstractC16549ely8 = this.AhwBna;
        if (abstractC16549ely8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16549ely2 = abstractC16549ely8;
        }
        abstractC16549ely2.gEmmrt.setOnClickListener(this);
    }

    public final void AhwBna() {
        AkhnZx();
        if (djBIcL()) {
            return;
        }
        valueOf();
    }

    public static final void OLrzqt(ViewOnClickListenerC21274gwf viewOnClickListenerC21274gwf, AbstractC16843era abstractC16843era, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3) {
        if (!z2) {
            abstractC16843era.getRoot().setVisibility(8);
            return;
        }
        abstractC16843era.getRoot().setVisibility(0);
        abstractC16843era.AEQbTJ.setImageResource(i2);
        abstractC16843era.OLrzqt.setText(viewOnClickListenerC21274gwf.getString(i));
        abstractC16843era.KWHzl.setText(str);
        AbstractC17075evu abstractC17075evu = abstractC16843era.EZpvd;
        abstractC17075evu.AEQbTJ.setText(str3);
        abstractC17075evu.OLrzqt.setText(str4);
        C9225bRa.Activity activity = viewOnClickListenerC21274gwf.OLrzqt;
        C9225bRa.Activity activity2 = null;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        java.lang.String strKWHzl = activity.KWHzl(str2, false);
        C9225bRa.Activity activity3 = viewOnClickListenerC21274gwf.OLrzqt;
        if (activity3 == null) {
            Intrinsics.gEmmrt("");
            activity3 = null;
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(strKWHzl, activity3.OLrzqt(str2, true));
        java.lang.String str5 = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str6 = (java.lang.String) pairOLrzqt.component2();
        C9225bRa.Activity activity4 = viewOnClickListenerC21274gwf.OLrzqt;
        if (activity4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            activity2 = activity4;
        }
        java.lang.String str7 = " " + activity2.copydefault().fJNWhG();
        if (z) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str5);
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(str7);
            spannableStringBuilder2.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableStringBuilder2.length(), 33);
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder(str6);
            spannableStringBuilder3.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableStringBuilder3.length(), 33);
            abstractC17075evu.gEmmrt.setText(spannableStringBuilder);
            abstractC17075evu.EZpvd.setText(spannableStringBuilder2);
            abstractC17075evu.KWHzl.setText(spannableStringBuilder3);
            abstractC17075evu.copydefault.setVisibility(0);
            abstractC17075evu.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getShuffleMode));
            if (!z3) {
                abstractC16843era.getRoot().setAlpha(0.5f);
                abstractC16843era.getRoot().setEnabled(false);
                return;
            } else {
                abstractC16843era.getRoot().setAlpha(1.0f);
                abstractC16843era.getRoot().setEnabled(true);
                return;
            }
        }
        abstractC17075evu.copydefault.setVisibility(8);
        abstractC17075evu.copydefault.setText("");
        abstractC17075evu.gEmmrt.setText(str5);
        abstractC17075evu.EZpvd.setText(str7);
        abstractC17075evu.KWHzl.setText(str6);
    }

    public final void AkhnZx() {
        C9225bRa c9225bRa = this.valueOf;
        if (c9225bRa == null) {
            Intrinsics.gEmmrt("");
            c9225bRa = null;
        }
        for (C9165bQT c9165bQT : c9225bRa.OLrzqt()) {
            java.lang.String formatCost = c9165bQT.getFormatCost();
            java.lang.String strWeiToGwei$default = C54869xYi.weiToGwei$default(c9165bQT.djBIcL().AEQbTJ(), java.lang.Integer.valueOf(AuCTel()), true, null, false, 8, null);
            java.lang.String str = " " + c9165bQT.getFeeUnit();
            switch (c9165bQT.getFeeType()) {
                case 31:
                    AbstractC16549ely abstractC16549ely = this.AhwBna;
                    if (abstractC16549ely == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16549ely = null;
                    }
                    AbstractC16843era abstractC16843era = abstractC16549ely.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(abstractC16843era, "");
                    int i = C13754dXa.FragmentManager.fdt;
                    int i2 = C57406yhn.Activity.QbewEr;
                    C9225bRa.Activity activity = this.OLrzqt;
                    if (activity == null) {
                        Intrinsics.gEmmrt("");
                        activity = null;
                    }
                    java.lang.String strFetchVPNInfo = activity.fetchVPNInfo();
                    C9225bRa.Activity activity2 = this.OLrzqt;
                    if (activity2 == null) {
                        Intrinsics.gEmmrt("");
                        activity2 = null;
                    }
                    boolean zAuCTel = activity2.AuCTel();
                    C9225bRa.Activity activity3 = this.OLrzqt;
                    if (activity3 == null) {
                        Intrinsics.gEmmrt("");
                        activity3 = null;
                    }
                    OLrzqt(this, abstractC16843era, i, i2, formatCost, strFetchVPNInfo, strWeiToGwei$default, str, zAuCTel, true, activity3.getFieldNames());
                    break;
                case 32:
                    AbstractC16549ely abstractC16549ely2 = this.AhwBna;
                    if (abstractC16549ely2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16549ely2 = null;
                    }
                    AbstractC16843era abstractC16843era2 = abstractC16549ely2.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(abstractC16843era2, "");
                    int i3 = C13754dXa.FragmentManager.invokespecialDaTmkG;
                    int i4 = C57406yhn.Activity.RJOkX;
                    C9225bRa.Activity activity4 = this.OLrzqt;
                    if (activity4 == null) {
                        Intrinsics.gEmmrt("");
                        activity4 = null;
                    }
                    java.lang.String strValueOf = activity4.valueOf();
                    C9225bRa.Activity activity5 = this.OLrzqt;
                    if (activity5 == null) {
                        Intrinsics.gEmmrt("");
                        activity5 = null;
                    }
                    boolean zValues = activity5.values();
                    C9225bRa.Activity activity6 = this.OLrzqt;
                    if (activity6 == null) {
                        Intrinsics.gEmmrt("");
                        activity6 = null;
                    }
                    OLrzqt(this, abstractC16843era2, i3, i4, formatCost, strValueOf, strWeiToGwei$default, str, zValues, true, activity6.getNewProxyInstance());
                    break;
                case 33:
                    AbstractC16549ely abstractC16549ely3 = this.AhwBna;
                    if (abstractC16549ely3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16549ely3 = null;
                    }
                    AbstractC16843era abstractC16843era3 = abstractC16549ely3.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(abstractC16843era3, "");
                    int i5 = C13754dXa.FragmentManager.FYtjSf;
                    int i6 = C57406yhn.Activity.QfsBiF;
                    C9225bRa.Activity activity7 = this.OLrzqt;
                    if (activity7 == null) {
                        Intrinsics.gEmmrt("");
                        activity7 = null;
                    }
                    java.lang.String strOLrzqt = activity7.OLrzqt();
                    C9225bRa.Activity activity8 = this.OLrzqt;
                    if (activity8 == null) {
                        Intrinsics.gEmmrt("");
                        activity8 = null;
                    }
                    boolean zDjBIcL = activity8.djBIcL();
                    C9225bRa.Activity activity9 = this.OLrzqt;
                    if (activity9 == null) {
                        Intrinsics.gEmmrt("");
                        activity9 = null;
                    }
                    OLrzqt(this, abstractC16843era3, i5, i6, formatCost, strOLrzqt, strWeiToGwei$default, str, zDjBIcL, true, activity9.hDKMBd());
                    break;
            }
        }
    }

    public final void valueOf() {
        C9225bRa c9225bRa = this.valueOf;
        AbstractC16549ely abstractC16549ely = null;
        if (c9225bRa == null) {
            Intrinsics.gEmmrt("");
            c9225bRa = null;
        }
        switch (c9225bRa.DbNXlk()) {
            case 31:
                AbstractC16549ely abstractC16549ely2 = this.AhwBna;
                if (abstractC16549ely2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16549ely = abstractC16549ely2;
                }
                abstractC16549ely.djBIcL.getRoot().setSelected(true);
                break;
            case 32:
                AbstractC16549ely abstractC16549ely3 = this.AhwBna;
                if (abstractC16549ely3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16549ely = abstractC16549ely3;
                }
                abstractC16549ely.fetchVPNInfo.getRoot().setSelected(true);
                break;
            case 33:
                AbstractC16549ely abstractC16549ely4 = this.AhwBna;
                if (abstractC16549ely4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16549ely = abstractC16549ely4;
                }
                abstractC16549ely.OLrzqt.getRoot().setSelected(true);
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        C9225bRa c9225bRaIsConnected;
        InterfaceC9041bOB interfaceC9041bOB = this.isConnected;
        if (interfaceC9041bOB == null || (c9225bRaIsConnected = interfaceC9041bOB.isConnected()) == null) {
            return;
        }
        C9225bRa c9225bRa = null;
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.getAudioAttributes;
        if (numValueOf != null && numValueOf.intValue() == i) {
            EZpvd(c9225bRaIsConnected);
            return;
        }
        int i2 = C13754dXa.ActionBar.hTAtCx;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            AuCTelauCTel();
            return;
        }
        int i3 = C13754dXa.ActionBar.ITrustedWebActivityCallback;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            C21282gwn.StateListAnimator stateListAnimator = C21282gwn.Companion;
            InterfaceC9041bOB interfaceC9041bOB2 = this.isConnected;
            C9225bRa.Activity activity = this.OLrzqt;
            if (activity == null) {
                Intrinsics.gEmmrt("");
                activity = null;
            }
            C9225bRa c9225bRa2 = this.valueOf;
            if (c9225bRa2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c9225bRa = c9225bRa2;
            }
            OLrzqt(stateListAnimator.EZpvd(interfaceC9041bOB2, activity, c9225bRa.zsXlph(), EZpvd()), 1000, true, true);
            return;
        }
        int i4 = C13754dXa.ActionBar.ICustomTabsCallbackStubProxy;
        if (numValueOf != null && numValueOf.intValue() == i4) {
            C9225bRa c9225bRa3 = this.valueOf;
            if (c9225bRa3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c9225bRa = c9225bRa3;
            }
            C9165bQT c9165bQTKWHzl = c9225bRa.KWHzl();
            ViewOnClickListenerC21275gwg.StateListAnimator stateListAnimator2 = ViewOnClickListenerC21275gwg.Companion;
            C9745bbQ c9745bbQKWHzl = c9165bQTKWHzl.KWHzl();
            stateListAnimator2.AEQbTJ(c9745bbQKWHzl != null && c9745bbQKWHzl.OLrzqt() == 3).show(getChildFragmentManager(), getTAG());
            return;
        }
        java.util.List<? extends android.view.View> list = this.copydefault;
        if (list != null) {
            for (android.view.View view2 : list) {
                view2.setSelected(Intrinsics.EZpvd(view2, view));
            }
        }
        AYXKKw();
        fIwbmz();
    }

    public final void EZpvd(C9225bRa c9225bRa) {
        AbstractC16549ely abstractC16549ely = this.AhwBna;
        C9225bRa.Activity activity = null;
        if (abstractC16549ely == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely = null;
        }
        if (abstractC16549ely.djBIcL.getRoot().isSelected()) {
            c9225bRa.copydefault(31);
            C9225bRa.Activity activity2 = this.OLrzqt;
            if (activity2 == null) {
                Intrinsics.gEmmrt("");
                activity2 = null;
            }
            EZpvd(activity2.copydefault().fJNWhG(), "slow");
        } else {
            AbstractC16549ely abstractC16549ely2 = this.AhwBna;
            if (abstractC16549ely2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16549ely2 = null;
            }
            if (abstractC16549ely2.fetchVPNInfo.getRoot().isSelected()) {
                c9225bRa.copydefault(32);
                C9225bRa.Activity activity3 = this.OLrzqt;
                if (activity3 == null) {
                    Intrinsics.gEmmrt("");
                    activity3 = null;
                }
                EZpvd(activity3.copydefault().fJNWhG(), "average");
            } else {
                AbstractC16549ely abstractC16549ely3 = this.AhwBna;
                if (abstractC16549ely3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16549ely3 = null;
                }
                if (!abstractC16549ely3.OLrzqt.getRoot().isSelected()) {
                    return;
                }
                c9225bRa.copydefault(33);
                C9225bRa.Activity activity4 = this.OLrzqt;
                if (activity4 == null) {
                    Intrinsics.gEmmrt("");
                    activity4 = null;
                }
                EZpvd(activity4.copydefault().fJNWhG(), "fast");
            }
        }
        C9225bRa.Activity activity5 = this.OLrzqt;
        if (activity5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            activity = activity5;
        }
        c9225bRa.AEQbTJ(activity.copydefault());
        if (this.EZpvd) {
            isConnected();
        }
        AuCTelauCTel();
    }

    public final void EZpvd(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("NetworkFee_Sheet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.gwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC21274gwf.copydefault(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("payment_crypto", str, false));
        eventParamsList.add(new EventParam("network_speed", str2, true));
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(600L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC16549ely abstractC16549ely = this.AhwBna;
        AbstractC16549ely abstractC16549ely2 = null;
        if (abstractC16549ely == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely = null;
        }
        arrayList.add(android.animation.ObjectAnimator.ofFloat(abstractC16549ely.djBIcL.KWHzl, "alpha", 1.0f, 0.0f, 1.0f));
        AbstractC16549ely abstractC16549ely3 = this.AhwBna;
        if (abstractC16549ely3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely3 = null;
        }
        arrayList.add(android.animation.ObjectAnimator.ofFloat(abstractC16549ely3.djBIcL.copydefault, "alpha", 1.0f, 0.0f, 1.0f));
        AbstractC16549ely abstractC16549ely4 = this.AhwBna;
        if (abstractC16549ely4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely4 = null;
        }
        arrayList.add(android.animation.ObjectAnimator.ofFloat(abstractC16549ely4.fetchVPNInfo.KWHzl, "alpha", 1.0f, 0.0f, 1.0f));
        AbstractC16549ely abstractC16549ely5 = this.AhwBna;
        if (abstractC16549ely5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely5 = null;
        }
        arrayList.add(android.animation.ObjectAnimator.ofFloat(abstractC16549ely5.fetchVPNInfo.copydefault, "alpha", 1.0f, 0.0f, 1.0f));
        AbstractC16549ely abstractC16549ely6 = this.AhwBna;
        if (abstractC16549ely6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely6 = null;
        }
        arrayList.add(android.animation.ObjectAnimator.ofFloat(abstractC16549ely6.OLrzqt.KWHzl, "alpha", 1.0f, 0.0f, 1.0f));
        AbstractC16549ely abstractC16549ely7 = this.AhwBna;
        if (abstractC16549ely7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16549ely2 = abstractC16549ely7;
        }
        arrayList.add(android.animation.ObjectAnimator.ofFloat(abstractC16549ely2.OLrzqt.copydefault, "alpha", 1.0f, 0.0f, 1.0f));
        duration.playTogether(arrayList);
        duration.start();
    }

    private final void fIwbmz() {
        boolean fieldNames;
        AbstractC16549ely abstractC16549ely = this.AhwBna;
        C9225bRa.Activity activity = null;
        if (abstractC16549ely == null) {
            Intrinsics.gEmmrt("");
            abstractC16549ely = null;
        }
        C52794wYp c52794wYp = abstractC16549ely.AhwBna;
        switch (EZpvd()) {
            case 31:
                C9225bRa.Activity activity2 = this.OLrzqt;
                if (activity2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    activity = activity2;
                }
                fieldNames = activity.getFieldNames();
                break;
            case 32:
                C9225bRa.Activity activity3 = this.OLrzqt;
                if (activity3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    activity = activity3;
                }
                fieldNames = activity.getNewProxyInstance();
                break;
            case 33:
                C9225bRa.Activity activity4 = this.OLrzqt;
                if (activity4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    activity = activity4;
                }
                fieldNames = activity.hDKMBd();
                break;
            default:
                fieldNames = false;
                break;
        }
        c52794wYp.setEnabled(fieldNames);
    }

    public final void gEmmrt() {
        AYXKKw();
        values();
        fJNWhG();
        AhwBna();
        C9225bRa c9225bRa = this.valueOf;
        AbstractC16549ely abstractC16549ely = null;
        if (c9225bRa == null) {
            Intrinsics.gEmmrt("");
            c9225bRa = null;
        }
        C9165bQT c9165bQTKWHzl = c9225bRa.KWHzl();
        AbstractC16549ely abstractC16549ely2 = this.AhwBna;
        if (abstractC16549ely2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16549ely = abstractC16549ely2;
        }
        abstractC16549ely.gEmmrt.setVisibility((c9165bQTKWHzl.KWHzl() == null || c9165bQTKWHzl.KWHzl().OLrzqt() == -1) ? 8 : 0);
        fIwbmz();
    }

    private final int AuCTel() {
        C9225bRa.Activity activity = this.OLrzqt;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        InterfaceC9731bbC interfaceC9731bbCKWHzl = activity.copydefault().KWHzl();
        if (interfaceC9731bbCKWHzl != null) {
            return interfaceC9731bbCKWHzl.valueOf();
        }
        return 0;
    }

    @Override // o.AbstractC57212yeE
    public void AEQbTJ(int i, int i2, android.content.Intent intent) {
        super.AEQbTJ(i, i2, intent);
        if (i == 1000 && i2 == -1) {
            java.lang.Object obj = null;
            java.lang.Long lValueOf = intent != null ? java.lang.Long.valueOf(intent.getLongExtra("coinId", -1L)) : null;
            this.EZpvd = intent != null ? intent.getBooleanExtra("result", false) : false;
            C9225bRa c9225bRa = this.valueOf;
            if (c9225bRa == null) {
                Intrinsics.gEmmrt("");
                c9225bRa = null;
            }
            java.util.Iterator<T> it = c9225bRa.zsXlph().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                long jAhwBna = ((C9225bRa.Activity) next).copydefault().AhwBna();
                if (lValueOf != null && jAhwBna == lValueOf.longValue()) {
                    obj = next;
                    break;
                }
            }
            C9225bRa.Activity activity = (C9225bRa.Activity) obj;
            if (activity != null) {
                this.OLrzqt = activity;
                gEmmrt();
            }
        }
    }

    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        c55097xdX.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setNeutralButton));
        c55097xdX.setState(2);
        c55097xdX.setType(1);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setMessage(null);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public final boolean djBIcL() {
        java.util.List<? extends android.view.View> list = this.copydefault;
        if (list == null) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((android.view.View) it.next()).isSelected()) {
                return true;
            }
        }
        return false;
    }
}
