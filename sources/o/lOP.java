package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C30193lPh;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lOP extends C33005moL {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public int AhwBna;
    public java.lang.Integer KWHzl;
    public java.lang.String copydefault;
    public AbstractC31457luQ djBIcL;
    public java.util.List<? extends C52794wYp> valueOf = yDY.AhwBna();
    public java.util.List<? extends C52794wYp> EZpvd = yDY.AhwBna();
    public java.util.List<? extends C52794wYp> gEmmrt = yDY.AhwBna();
    public java.util.List<? extends C52794wYp> AYXKKw = yDY.AhwBna();

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lOP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final lOP EZpvd(int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("index", i);
            lOP lop = new lOP();
            lop.setArguments(bundle);
            return lop;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault;
        android.view.Window window;
        android.view.ViewGroup viewGroup;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (viewGroup = (android.view.ViewGroup) window.findViewById(com.google.android.material.R.id.design_bottom_sheet)) != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C57676yms.KWHzl(viewGroup.getContext()) - 120;
            }
            viewGroup.setBackgroundResource(android.R.color.transparent);
        }
        DialogC33577mzA dialogC33577mzAValueOf = valueOf();
        if (dialogC33577mzAValueOf == null || (bottomSheetBehaviorCopydefault = dialogC33577mzAValueOf.copydefault()) == null) {
            return;
        }
        bottomSheetBehaviorCopydefault.setDraggable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.djBIcL = AbstractC31457luQ.KWHzl(layoutInflater, viewGroup, true);
        KWHzl(false);
        AbstractC31457luQ abstractC31457luQ = this.djBIcL;
        if (abstractC31457luQ != null) {
            return abstractC31457luQ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.AhwBna = requireArguments().getInt("index", 0);
        AEQbTJ();
        AbstractC31457luQ abstractC31457luQ = this.djBIcL;
        if (abstractC31457luQ != null) {
            AppCompatImageView appCompatImageView = abstractC31457luQ.gEmmrt;
            appCompatImageView.setOnClickListener(new ActionBar(appCompatImageView, 1000L, this));
            C52794wYp c52794wYp = abstractC31457luQ.EZpvd;
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = abstractC31457luQ.copydefault;
            c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
            OLrzqt();
            EZpvd();
        }
    }

    public final void AEQbTJ() {
        AbstractC31457luQ abstractC31457luQ = this.djBIcL;
        if (abstractC31457luQ != null) {
            abstractC31457luQ.AYXKKw.getRoot().setVisibility(0);
            abstractC31457luQ.OLrzqt.getRoot().setVisibility(0);
            abstractC31457luQ.KWHzl.getRoot().setVisibility(8);
            abstractC31457luQ.valueOf.getRoot().setVisibility(0);
        }
    }

    public final void OLrzqt() {
        AbstractC31457luQ abstractC31457luQ = this.djBIcL;
        if (abstractC31457luQ != null) {
            AbstractC31619lxu abstractC31619lxu = abstractC31457luQ.OLrzqt;
            java.util.List<? extends C52794wYp> listGEmmrt = yDY.gEmmrt(abstractC31619lxu.EZpvd, abstractC31619lxu.AYXKKw, abstractC31619lxu.OLrzqt, abstractC31619lxu.copydefault, abstractC31619lxu.AEQbTJ, abstractC31619lxu.valueOf, abstractC31619lxu.KWHzl);
            this.valueOf = listGEmmrt;
            for (C52794wYp c52794wYp : listGEmmrt) {
                c52794wYp.setTypeface(C55051xce.OLrzqt.valueOf());
                c52794wYp.setSingleLine(false);
                c52794wYp.setMaxLines(2);
                AEQbTJ(c52794wYp, this.valueOf);
            }
            AbstractC31617lxs abstractC31617lxs = abstractC31457luQ.KWHzl;
            java.util.List<? extends C52794wYp> listGEmmrt2 = yDY.gEmmrt(abstractC31617lxs.AEQbTJ, abstractC31617lxs.OLrzqt, abstractC31617lxs.KWHzl);
            this.EZpvd = listGEmmrt2;
            for (C52794wYp c52794wYp2 : listGEmmrt2) {
                c52794wYp2.setTypeface(C55051xce.OLrzqt.valueOf());
                c52794wYp2.setSingleLine(false);
                c52794wYp2.setMaxLines(2);
                AEQbTJ(c52794wYp2, this.EZpvd);
            }
            lxD lxd = abstractC31457luQ.AYXKKw;
            java.util.List<? extends C52794wYp> listGEmmrt3 = yDY.gEmmrt(lxd.EZpvd, lxd.AEQbTJ);
            this.gEmmrt = listGEmmrt3;
            for (C52794wYp c52794wYp3 : listGEmmrt3) {
                c52794wYp3.setTypeface(C55051xce.OLrzqt.valueOf());
                c52794wYp3.setSingleLine(false);
                c52794wYp3.setMaxLines(2);
                AEQbTJ(c52794wYp3, this.gEmmrt);
            }
            AbstractC31623lxy abstractC31623lxy = abstractC31457luQ.valueOf;
            C52794wYp c52794wYp4 = abstractC31623lxy.copydefault;
            c52794wYp4.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.zLAIeZ));
            Unit unit = Unit.INSTANCE;
            C52794wYp c52794wYp5 = abstractC31623lxy.EZpvd;
            c52794wYp5.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.RvdRAu));
            C52794wYp c52794wYp6 = abstractC31623lxy.AEQbTJ;
            c52794wYp6.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.reset));
            C52794wYp c52794wYp7 = abstractC31623lxy.KWHzl;
            c52794wYp7.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.ihnvzI));
            java.util.List<? extends C52794wYp> listGEmmrt4 = yDY.gEmmrt(c52794wYp4, c52794wYp5, c52794wYp6, c52794wYp7);
            this.AYXKKw = listGEmmrt4;
            for (C52794wYp c52794wYp8 : listGEmmrt4) {
                c52794wYp8.setTypeface(C55051xce.OLrzqt.valueOf());
                c52794wYp8.setSingleLine(false);
                c52794wYp8.setMaxLines(2);
                AEQbTJ(c52794wYp8, this.AYXKKw);
            }
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ lOP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, lOP lop) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = lop;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ lOP KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, lOP lop) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = lop;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String str;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C30193lPh.copydefault.KWHzl(new C30193lPh.StateListAnimator(this.KWHzl.copydefault, this.KWHzl.AEQbTJ, this.KWHzl.KWHzl));
                java.lang.String str2 = this.KWHzl.AEQbTJ;
                RxBus.KWHzl(((str2 == null || str2.length() == 0) && ((str = this.KWHzl.copydefault) == null || str.length() == 0) && this.KWHzl.KWHzl == null) ? "event_fiat_order_list_clear_filter" : "event_fiat_order_list_applied_filter");
                RxBus.KWHzl("event_fiat_order_list_filter_change");
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ lOP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, lOP lop) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = lop;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.KWHzl();
            }
        }
    }

    public final void AEQbTJ(final C52794wYp c52794wYp, final java.util.List<? extends C52794wYp> list) {
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lOQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lOP.AEQbTJ(list, c52794wYp, this, view);
            }
        });
    }

    public final void AEQbTJ(C52794wYp c52794wYp, java.util.List<? extends C52794wYp> list, boolean z) {
        if (Intrinsics.EZpvd(list, this.valueOf)) {
            this.AEQbTJ = z ? C33129mqd.gEmmrt(c52794wYp.getTag()) : null;
            return;
        }
        if (Intrinsics.EZpvd(list, this.EZpvd)) {
            this.AEQbTJ = z ? C33129mqd.gEmmrt(c52794wYp.getTag()) : null;
        } else if (Intrinsics.EZpvd(list, this.gEmmrt)) {
            this.copydefault = z ? C33129mqd.gEmmrt(c52794wYp.getTag()) : null;
        } else if (Intrinsics.EZpvd(list, this.AYXKKw)) {
            this.KWHzl = z ? java.lang.Integer.valueOf(C33129mqd.AhwBna(c52794wYp.getTag())) : null;
        }
    }

    public final void KWHzl() {
        if (this.djBIcL != null) {
            for (C52794wYp c52794wYp : this.valueOf) {
                c52794wYp.setOKDSType(258);
                c52794wYp.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            for (C52794wYp c52794wYp2 : this.EZpvd) {
                c52794wYp2.setOKDSType(258);
                c52794wYp2.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            for (C52794wYp c52794wYp3 : this.gEmmrt) {
                c52794wYp3.setOKDSType(258);
                c52794wYp3.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            for (C52794wYp c52794wYp4 : this.AYXKKw) {
                c52794wYp4.setOKDSType(258);
                c52794wYp4.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            this.AEQbTJ = null;
            this.KWHzl = null;
            this.copydefault = null;
            C30193lPh.copydefault.KWHzl(new C30193lPh.StateListAnimator(this.copydefault, this.AEQbTJ, this.KWHzl));
            RxBus.KWHzl("event_fiat_order_list_clear_filter");
            RxBus.KWHzl("event_fiat_order_list_filter_change");
            dismissAllowingStateLoss();
        }
    }

    public final void EZpvd() {
        for (C52794wYp c52794wYp : this.valueOf) {
            if (Intrinsics.EZpvd(c52794wYp.getTag(), (java.lang.Object) C30193lPh.copydefault.copydefault())) {
                c52794wYp.setOKDSType(34);
                c52794wYp.setTypeface(C55051xce.OLrzqt.OLrzqt());
                AEQbTJ(c52794wYp, this.valueOf, true);
            }
        }
        for (C52794wYp c52794wYp2 : this.EZpvd) {
            if (Intrinsics.EZpvd(c52794wYp2.getTag(), (java.lang.Object) C30193lPh.copydefault.copydefault())) {
                c52794wYp2.setOKDSType(34);
                c52794wYp2.setTypeface(C55051xce.OLrzqt.OLrzqt());
                AEQbTJ(c52794wYp2, this.EZpvd, true);
            }
        }
        for (C52794wYp c52794wYp3 : this.gEmmrt) {
            if (Intrinsics.EZpvd(c52794wYp3.getTag(), (java.lang.Object) C30193lPh.copydefault.OLrzqt())) {
                c52794wYp3.setOKDSType(34);
                c52794wYp3.setTypeface(C55051xce.OLrzqt.OLrzqt());
                AEQbTJ(c52794wYp3, this.gEmmrt, true);
            }
        }
        for (C52794wYp c52794wYp4 : this.AYXKKw) {
            int iAhwBna = C33129mqd.AhwBna(c52794wYp4.getTag());
            java.lang.Integer numEZpvd = C30193lPh.copydefault.EZpvd();
            if (numEZpvd != null && iAhwBna == numEZpvd.intValue()) {
                c52794wYp4.setOKDSType(34);
                c52794wYp4.setTypeface(C55051xce.OLrzqt.OLrzqt());
                AEQbTJ(c52794wYp4, this.AYXKKw, true);
            }
        }
    }

    public static final void AEQbTJ(java.util.List list, C52794wYp c52794wYp, lOP lop, android.view.View view) {
        java.util.ArrayList<C52794wYp> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (true ^ Intrinsics.EZpvd((C52794wYp) obj, c52794wYp)) {
                arrayList.add(obj);
            }
        }
        for (C52794wYp c52794wYp2 : arrayList) {
            c52794wYp2.setOKDSType(258);
            c52794wYp2.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        if (c52794wYp.values() == 34) {
            c52794wYp.setOKDSType(258);
            c52794wYp.setTypeface(C55051xce.OLrzqt.valueOf());
            lop.AEQbTJ(c52794wYp, list, false);
        } else {
            c52794wYp.setOKDSType(34);
            c52794wYp.setTypeface(C55051xce.OLrzqt.OLrzqt());
            lop.AEQbTJ(c52794wYp, list, true);
        }
    }
}
