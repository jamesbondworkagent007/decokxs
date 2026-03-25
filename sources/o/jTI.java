package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC40510qYn;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jTI extends AbstractC40510qYn<C26170jUn, C42813rdW> {
    public final Function1<RecyclerView.ViewHolder, Unit> AEQbTJ;
    public final Function2<java.lang.Integer, C26170jUn, Unit> EZpvd;
    public final yHO<java.lang.Integer, java.lang.Boolean, C26170jUn, Unit> KWHzl;
    public final Function2<java.lang.Integer, C26170jUn, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42813rdW c42813rdW, int i, @NotNull C26170jUn c26170jUn) {
        Intrinsics.checkNotNullParameter(c42813rdW, "");
        Intrinsics.checkNotNullParameter(c26170jUn, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super o.jUn, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.jUn, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.recyclerview.widget.RecyclerView$ViewHolder, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.jUn, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jTI(@NotNull yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super C26170jUn, Unit> yho, @NotNull Function2<? super java.lang.Integer, ? super C26170jUn, Unit> function2, @NotNull Function1<? super RecyclerView.ViewHolder, Unit> function1, @NotNull Function2<? super java.lang.Integer, ? super C26170jUn, Unit> function22) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.KWHzl = yho;
        this.EZpvd = function2;
        this.AEQbTJ = function1;
        this.copydefault = function22;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42813rdW AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42813rdW c42813rdWEZpvd = C42813rdW.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42813rdWEZpvd, "");
        return c42813rdWEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/qYn$Application;Lo/qYt;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC40510qYn, o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC40510qYn.Application<C42813rdW> application, @NotNull C26170jUn c26170jUn) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c26170jUn, "");
        OLrzqt((C42813rdW) application.KWHzl(), application, application.getBindingAdapterPosition(), c26170jUn);
    }

    public final void OLrzqt(C42813rdW c42813rdW, final AbstractC40510qYn.Application<C42813rdW> application, int i, final C26170jUn c26170jUn) {
        c42813rdW.OLrzqt.setText(c26170jUn.KWHzl());
        AppCompatImageView appCompatImageView = c42813rdW.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(c26170jUn.AhwBna() ^ true ? 0 : 8);
        AppCompatImageView appCompatImageView2 = c42813rdW.AEQbTJ;
        appCompatImageView2.setOnClickListener(new TaskDescription(appCompatImageView2, 1000L, this, i, c26170jUn));
        AppCompatImageView appCompatImageView3 = c42813rdW.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        appCompatImageView3.setVisibility(c26170jUn.EZpvd() ^ true ? 0 : 8);
        AppCompatImageView appCompatImageView4 = c42813rdW.copydefault;
        appCompatImageView4.setOnClickListener(new Application(appCompatImageView4, 1000L, this, i, c26170jUn));
        c42813rdW.copydefault.setImageResource(c26170jUn.OLrzqt() ? qZH.Activity.zsXlph : qZH.Activity.AuCTelauCTel);
        c42813rdW.EZpvd.setEnabled(!c26170jUn.OLrzqt());
        c42813rdW.EZpvd.setOnTouchListener(new View.OnTouchListener() { // from class: o.jTM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return jTI.OLrzqt(c26170jUn, this, application, view, motionEvent);
            }
        });
        android.widget.LinearLayout root = c42813rdW.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, i, c26170jUn));
    }

    public static final boolean OLrzqt(C26170jUn c26170jUn, jTI jti, AbstractC40510qYn.Application application, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!c26170jUn.OLrzqt() && motionEvent.getAction() == 0) {
            jti.AEQbTJ.invoke(application);
        }
        return false;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ jTI EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C26170jUn OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, jTI jti, int i, C26170jUn c26170jUn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = jti;
            this.KWHzl = i;
            this.OLrzqt = c26170jUn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault.invoke(java.lang.Integer.valueOf(this.KWHzl), this.OLrzqt);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26170jUn EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ jTI OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jTI jti, int i, C26170jUn c26170jUn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = jti;
            this.KWHzl = i;
            this.EZpvd = c26170jUn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.invoke(java.lang.Integer.valueOf(this.KWHzl), java.lang.Boolean.valueOf(!this.EZpvd.OLrzqt()), this.EZpvd);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26170jUn EZpvd;
        public final /* synthetic */ jTI KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jTI jti, int i, C26170jUn c26170jUn) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = jti;
            this.copydefault = i;
            this.EZpvd = c26170jUn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.EZpvd.invoke(java.lang.Integer.valueOf(this.copydefault), this.EZpvd);
            }
        }
    }
}
