package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27174jqH extends ConstraintLayout {
    public TaskDescription EZpvd;
    public final iMJ KWHzl;

    /* JADX INFO: renamed from: o.jqH$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.jqH$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements TaskDescription {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ToBeConfirmed";
            }

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.jqH$TaskDescription$Application */
        public static final class Application implements TaskDescription {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.KWHzl;
                }
                return application.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Confirmed(address=" + this.KWHzl + ")";
            }

            public Application(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27174jqH(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        iMJ imjKWHzl = iMJ.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(imjKWHzl, "");
        this.KWHzl = imjKWHzl;
        this.EZpvd = TaskDescription.StateListAnimator.OLrzqt;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context3));
        } else {
            drawable = null;
        }
        imjKWHzl.OLrzqt.setCompoundDrawablesRelative(null, null, drawable, null);
        android.widget.TextView textView = imjKWHzl.OLrzqt;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27174jqH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        iMJ imjKWHzl = iMJ.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(imjKWHzl, "");
        this.KWHzl = imjKWHzl;
        this.EZpvd = TaskDescription.StateListAnimator.OLrzqt;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context3));
        } else {
            drawable = null;
        }
        imjKWHzl.OLrzqt.setCompoundDrawablesRelative(null, null, drawable, null);
        android.widget.TextView textView = imjKWHzl.OLrzqt;
        textView.setOnClickListener(new Activity(textView, 1000L, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27174jqH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        iMJ imjKWHzl = iMJ.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(imjKWHzl, "");
        this.KWHzl = imjKWHzl;
        this.EZpvd = TaskDescription.StateListAnimator.OLrzqt;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context3));
        } else {
            drawable = null;
        }
        imjKWHzl.OLrzqt.setCompoundDrawablesRelative(null, null, drawable, null);
        android.widget.TextView textView = imjKWHzl.OLrzqt;
        textView.setOnClickListener(new Application(textView, 1000L, this));
    }

    public final void setState(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd = taskDescription;
        if (Intrinsics.EZpvd(taskDescription, TaskDescription.StateListAnimator.OLrzqt)) {
            android.widget.TextView textView = this.KWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            this.KWHzl.EZpvd.setText(C25493ixk.FragmentManager.jh);
            this.KWHzl.EZpvd.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.aKhcqp));
            return;
        }
        if (!(taskDescription instanceof TaskDescription.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        android.widget.TextView textView2 = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        this.KWHzl.AEQbTJ.setText(((TaskDescription.Application) taskDescription).copydefault());
        this.KWHzl.EZpvd.setText(C25493ixk.FragmentManager.DcMfJKDSqxTE);
        this.KWHzl.EZpvd.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChPRAkuRW));
    }

    public final java.lang.String EZpvd() {
        TaskDescription taskDescription = this.EZpvd;
        TaskDescription.Application application = taskDescription instanceof TaskDescription.Application ? (TaskDescription.Application) taskDescription : null;
        if (application != null) {
            return application.copydefault();
        }
        return null;
    }

    public final void setOnStatusClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        C55296xhK.singleClick$default(this.KWHzl.EZpvd, onClickListener, 0L, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.jqH$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C27174jqH KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27174jqH c27174jqH) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c27174jqH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.copydefault(C25493ixk.FragmentManager.DPHsZd);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.gwwfep, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.jqH$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C27174jqH EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C27174jqH c27174jqH) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c27174jqH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.copydefault(C25493ixk.FragmentManager.DPHsZd);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.gwwfep, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.jqH$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C27174jqH AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C27174jqH c27174jqH) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c27174jqH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.copydefault(C25493ixk.FragmentManager.DPHsZd);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.gwwfep, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
