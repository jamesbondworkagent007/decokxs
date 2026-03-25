package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19927gUm extends ConstraintLayout {
    public Application EZpvd;
    public final C23527hzs KWHzl;

    /* JADX INFO: renamed from: o.gUm$Application */
    public interface Application {
        void AhwBna();

        void EZpvd();

        void valueOf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(Application application) {
        this.EZpvd = application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19927gUm(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C23527hzs c23527hzsAEQbTJ = C23527hzs.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23527hzsAEQbTJ, "");
        this.KWHzl = c23527hzsAEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt = C55298xhM.OLrzqt(8, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        setPaddingRelative(getPaddingStart(), iOLrzqt, getPaddingEnd(), C55298xhM.OLrzqt(8, context3));
        android.widget.TextView textViewCopydefault = copydefault().copydefault();
        ViewGroup.LayoutParams layoutParams = textViewCopydefault.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            marginLayoutParams.topMargin = C55298xhM.OLrzqt(8, context4);
            textViewCopydefault.setLayoutParams(marginLayoutParams);
            c23527hzsAEQbTJ.valueOf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gUk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C19927gUm.EZpvd(this.AEQbTJ, compoundButton, z);
                }
            });
            C55320xhi c55320xhi = c23527hzsAEQbTJ.AEQbTJ;
            c55320xhi.setOnClickListener(new TaskDescription(c55320xhi, 1000L, this));
            C55320xhi c55320xhi2 = c23527hzsAEQbTJ.KWHzl;
            c55320xhi2.setOnClickListener(new ActionBar(c55320xhi2, 1000L, this));
            c23527hzsAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gUn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19927gUm.AEQbTJ(this.copydefault, view);
                }
            });
            setExpanded(true);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19927gUm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23527hzs c23527hzsAEQbTJ = C23527hzs.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23527hzsAEQbTJ, "");
        this.KWHzl = c23527hzsAEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt = C55298xhM.OLrzqt(8, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        setPaddingRelative(getPaddingStart(), iOLrzqt, getPaddingEnd(), C55298xhM.OLrzqt(8, context3));
        android.widget.TextView textViewCopydefault = copydefault().copydefault();
        ViewGroup.LayoutParams layoutParams = textViewCopydefault.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            marginLayoutParams.topMargin = C55298xhM.OLrzqt(8, context4);
            textViewCopydefault.setLayoutParams(marginLayoutParams);
            c23527hzsAEQbTJ.valueOf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gUk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C19927gUm.EZpvd(this.AEQbTJ, compoundButton, z);
                }
            });
            C55320xhi c55320xhi = c23527hzsAEQbTJ.AEQbTJ;
            c55320xhi.setOnClickListener(new StateListAnimator(c55320xhi, 1000L, this));
            C55320xhi c55320xhi2 = c23527hzsAEQbTJ.KWHzl;
            c55320xhi2.setOnClickListener(new Activity(c55320xhi2, 1000L, this));
            c23527hzsAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gUn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19927gUm.AEQbTJ(this.copydefault, view);
                }
            });
            setExpanded(true);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19927gUm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C23527hzs c23527hzsAEQbTJ = C23527hzs.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23527hzsAEQbTJ, "");
        this.KWHzl = c23527hzsAEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt = C55298xhM.OLrzqt(8, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        setPaddingRelative(getPaddingStart(), iOLrzqt, getPaddingEnd(), C55298xhM.OLrzqt(8, context3));
        android.widget.TextView textViewCopydefault = copydefault().copydefault();
        ViewGroup.LayoutParams layoutParams = textViewCopydefault.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            marginLayoutParams.topMargin = C55298xhM.OLrzqt(8, context4);
            textViewCopydefault.setLayoutParams(marginLayoutParams);
            c23527hzsAEQbTJ.valueOf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gUk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C19927gUm.EZpvd(this.AEQbTJ, compoundButton, z);
                }
            });
            C55320xhi c55320xhi = c23527hzsAEQbTJ.AEQbTJ;
            c55320xhi.setOnClickListener(new PendingIntent(c55320xhi, 1000L, this));
            C55320xhi c55320xhi2 = c23527hzsAEQbTJ.KWHzl;
            c55320xhi2.setOnClickListener(new Fragment(c55320xhi2, 1000L, this));
            c23527hzsAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gUn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19927gUm.AEQbTJ(this.copydefault, view);
                }
            });
            setExpanded(true);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final C19938gUx copydefault() {
        C19938gUx c19938gUx = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c19938gUx, "");
        return c19938gUx;
    }

    public final C55239xgG AEQbTJ() {
        C55239xgG c55239xgG = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
        return c55239xgG;
    }

    public final C55239xgG KWHzl() {
        C55239xgG c55239xgG = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
        return c55239xgG;
    }

    public final C19919gUe OLrzqt() {
        C19919gUe c19919gUe = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c19919gUe, "");
        return c19919gUe;
    }

    public final boolean AhwBna() {
        C55320xhi c55320xhi = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55320xhi, "");
        return c55320xhi.getVisibility() == 0;
    }

    public final void setExpanded(boolean z) {
        Application application;
        if (z && (application = this.EZpvd) != null) {
            application.AhwBna();
        }
        this.KWHzl.copydefault.setRotation(z ? 0.0f : 180.0f);
        C55320xhi c55320xhi = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55320xhi, "");
        c55320xhi.setVisibility(z ? 0 : 8);
        C55239xgG c55239xgG = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
        c55239xgG.setVisibility(z ? 0 : 8);
        C55320xhi c55320xhi2 = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55320xhi2, "");
        c55320xhi2.setVisibility(z ? 0 : 8);
        C55239xgG c55239xgG2 = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55239xgG2, "");
        c55239xgG2.setVisibility(z ? 0 : 8);
        copydefault().setVisibility((z && this.KWHzl.valueOf.isChecked()) ? 0 : 8);
        android.widget.TextView textView = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        C19919gUe c19919gUe = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c19919gUe, "");
        c19919gUe.setVisibility(z ? 0 : 8);
    }

    public static final void EZpvd(C19927gUm c19927gUm, android.widget.CompoundButton compoundButton, boolean z) {
        c19927gUm.copydefault().setVisibility(z ? 0 : 8);
    }

    public static final void AEQbTJ(C19927gUm c19927gUm, android.view.View view) {
        c19927gUm.setExpanded(!c19927gUm.AhwBna());
    }

    /* JADX INFO: renamed from: o.gUm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C19927gUm AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19927gUm c19927gUm) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c19927gUm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.EZpvd;
                Application applicationEZpvd = this.AEQbTJ.EZpvd();
                if (applicationEZpvd != null) {
                    applicationEZpvd.EZpvd();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ORmwhf), C33069mpW.copydefault(C23274hvD.Fragment.zDGrpR, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "7")))), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUm$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C19927gUm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19927gUm c19927gUm) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c19927gUm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.OLrzqt;
                Application applicationEZpvd = this.copydefault.EZpvd();
                if (applicationEZpvd != null) {
                    applicationEZpvd.EZpvd();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ORmwhf), C33069mpW.copydefault(C23274hvD.Fragment.zDGrpR, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "7")))), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUm$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C19927gUm EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C19927gUm c19927gUm) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c19927gUm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.AEQbTJ;
                Application applicationEZpvd = this.EZpvd.EZpvd();
                if (applicationEZpvd != null) {
                    applicationEZpvd.EZpvd();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.ORmwhf), C33069mpW.copydefault(C23274hvD.Fragment.zDGrpR, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "7")))), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUm$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C19927gUm KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C19927gUm c19927gUm) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c19927gUm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.AEQbTJ;
                Application applicationEZpvd = this.KWHzl.EZpvd();
                if (applicationEZpvd != null) {
                    applicationEZpvd.valueOf();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.gCNefq), c55320xhi.getContext().getString(C23274hvD.Fragment.FQMcgEfQMcgE)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUm$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C19927gUm OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19927gUm c19927gUm) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c19927gUm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.AEQbTJ;
                Application applicationEZpvd = this.OLrzqt.EZpvd();
                if (applicationEZpvd != null) {
                    applicationEZpvd.valueOf();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.gCNefq), c55320xhi.getContext().getString(C23274hvD.Fragment.FQMcgEfQMcgE)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C19927gUm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C19927gUm c19927gUm) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c19927gUm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.EZpvd;
                Application applicationEZpvd = this.copydefault.EZpvd();
                if (applicationEZpvd != null) {
                    applicationEZpvd.valueOf();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.gCNefq), c55320xhi.getContext().getString(C23274hvD.Fragment.FQMcgEfQMcgE)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }
}
