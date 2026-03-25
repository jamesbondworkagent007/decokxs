package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.tradeuilib.imgs.OKRemoteImageResource;
import com.okinc.tradeuilib.imgs.RemoteSupportedScaleType;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.wYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vSY extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.Integer, Unit> AEQbTJ;
    public C48426uRI KWHzl;
    public int OLrzqt;
    public float copydefault = 0.94f;
    public java.util.ArrayList<vSX> AhwBna = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vSY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String AEQbTJ() {
            C55697xoo c55697xoo = C55697xoo.OLrzqt;
            return "simple_option_guide_pop_key-" + c55697xoo.copydefault() + "-" + c55697xoo.AkhnZx();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vSY$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ vSY newInstance$default(TaskDescription taskDescription, java.util.ArrayList arrayList, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return taskDescription.copydefault(arrayList, function1);
        }

        public final vSY copydefault(@NotNull java.util.ArrayList<vSX> arrayList, Function1<? super java.lang.Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.os.Bundle bundle = new android.os.Bundle();
            vSY vsy = new vSY();
            vsy.setArguments(bundle);
            vsy.AhwBna = arrayList;
            vsy.AEQbTJ = function1;
            return vsy;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(-1);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = C48426uRI.EZpvd(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        AEQbTJ();
    }

    private final void AEQbTJ() {
        C48426uRI c48426uRI = this.KWHzl;
        if (c48426uRI == null) {
            Intrinsics.gEmmrt("");
            c48426uRI = null;
        }
        android.widget.ImageView imageView = c48426uRI.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C49721utr.OLrzqt(imageView, OKRemoteImageResource.Resource.IC_KOL_LEAD_SETTING, getContext(), (2044 & 4) != 0 ? 0 : 0, (2044 & 8) != 0 ? RemoteSupportedScaleType.CENTER_INSIDE : null, (2044 & 16) != 0 ? null : null, (2044 & 32) != 0 ? -1 : 0, (2044 & 64) != 0 ? -1 : 0, (2044 & 128) != 0 ? null : null, (2044 & 256) != 0 ? null : null, (2044 & 512) != 0 ? false : false, (2044 & 1024) != 0 ? OKRemoteImageResource.EZpvd.getClass().getSimpleName() : "KolLeadingSettingFragment");
        EZpvd();
        KWHzl();
    }

    public final void EZpvd() {
        C48426uRI c48426uRI = null;
        if (this.AhwBna.isEmpty()) {
            C48426uRI c48426uRI2 = this.KWHzl;
            if (c48426uRI2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48426uRI = c48426uRI2;
            }
            c48426uRI.copydefault.setVisibility(8);
            return;
        }
        int i = 0;
        for (java.lang.Object obj : this.AhwBna) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (((vSX) obj).KWHzl()) {
                this.OLrzqt = i;
            }
            i++;
        }
        java.util.ArrayList<vSX> arrayList = this.AhwBna;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (vSX vsx : arrayList) {
            arrayList2.add(new wYO(xMR.formatPercent$default(xMR.copydefault, vsx.AEQbTJ(), 0, null, 4, null), 36, vsx.KWHzl(), true));
        }
        C48426uRI c48426uRI3 = this.KWHzl;
        if (c48426uRI3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48426uRI = c48426uRI3;
        }
        wYX wyx = c48426uRI.copydefault;
        wyx.setColumnCount(C56548yJl.valueOf(this.AhwBna.size(), 6));
        wyx.setSelectionChipBeans(arrayList2);
        wyx.setOnChipClickListener(new ActionBar());
        wyx.setOnChipSelectionChangeListener(new StateListAnimator(wyx, this));
    }

    public static final class ActionBar implements wYX.ActionBar {
        @Override // o.wYX.ActionBar
        public void OLrzqt(wYS wys) {
            Intrinsics.checkNotNullParameter(wys, "");
            wys.setSelected(!wys.isSelected());
        }
    }

    public static final class StateListAnimator implements wYX.TaskDescription {
        public final /* synthetic */ wYX EZpvd;
        public final /* synthetic */ vSY copydefault;

        public StateListAnimator(wYX wyx, vSY vsy) {
            this.EZpvd = wyx;
            this.copydefault = vsy;
        }

        @Override // o.wYX.TaskDescription
        public void copydefault(wYS wys, wYO wyo, boolean z) {
            int i;
            Intrinsics.checkNotNullParameter(wys, "");
            Intrinsics.checkNotNullParameter(wyo, "");
            if (z) {
                java.util.Iterator<T> it = this.EZpvd.EZpvd().iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    wYS wys2 = (wYS) it.next();
                    if (!Intrinsics.EZpvd(wys2, wys)) {
                        wys2.setSelected(false);
                    }
                }
                java.util.Iterator<wYO> it2 = this.EZpvd.OLrzqt().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.EZpvd(it2.next().EZpvd(), wyo.EZpvd())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0 || i >= this.copydefault.AhwBna.size()) {
                    return;
                }
                this.copydefault.OLrzqt = i;
            }
        }
    }

    private final void KWHzl() {
        C48426uRI c48426uRI = this.KWHzl;
        C48426uRI c48426uRI2 = null;
        if (c48426uRI == null) {
            Intrinsics.gEmmrt("");
            c48426uRI = null;
        }
        ShapeableImageView shapeableImageView = c48426uRI.KWHzl;
        shapeableImageView.setOnClickListener(new Application(shapeableImageView, 1000L, this));
        C48426uRI c48426uRI3 = this.KWHzl;
        if (c48426uRI3 == null) {
            Intrinsics.gEmmrt("");
            c48426uRI3 = null;
        }
        C52794wYp c52794wYp = c48426uRI3.EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C48426uRI c48426uRI4 = this.KWHzl;
        if (c48426uRI4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48426uRI2 = c48426uRI4;
        }
        wYE wye = c48426uRI2.valueOf;
        wye.setOnClickListener(new Fragment(wye, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vSY OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vSY vsy) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = vsy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(java.lang.Integer.valueOf(this.OLrzqt.OLrzqt));
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vSY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vSY vsy) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = vsy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vSY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, vSY vsy) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = vsy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.getCurrentControllerInfo)), C56390yDp.OLrzqt("title", C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialsiEkQe)));
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity != null) {
                    WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, bundleBundleOf, null, 4, null);
                }
            }
        }
    }
}
