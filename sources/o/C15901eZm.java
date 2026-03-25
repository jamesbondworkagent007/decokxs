package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15901eZm extends AbstractC59533zio<C15904eZp, ActionBar> {
    public final Function0<Unit> AEQbTJ;
    public final Function0<Unit> KWHzl;
    public final Function0<Unit> OLrzqt;

    public C15901eZm(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.OLrzqt = function0;
        this.KWHzl = function02;
        this.AEQbTJ = function03;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.OAhWiU, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull C15904eZp c15904eZp) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(c15904eZp, "");
        actionBar.OLrzqt(c15904eZp, this.OLrzqt, this.KWHzl, this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.eZm$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.ComponentActivity22);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C13754dXa.ActionBar.Cancellable);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C13754dXa.ActionBar.onRetainNonConfigurationInstance);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById3;
        }

        public final void AEQbTJ(int i, boolean z) {
            android.graphics.drawable.Drawable drawable;
            android.content.Context context = this.itemView.getContext();
            boolean zOLrzqt = C33492mxV.OLrzqt();
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(context, z ? zOLrzqt ? C13754dXa.Activity.fERRXa : C13754dXa.Activity.fdOvFl : zOLrzqt ? C13754dXa.Activity.aUsmxb : C13754dXa.Activity.dUDNAs);
            android.graphics.drawable.Drawable drawable3 = ContextCompat.getDrawable(context, C13754dXa.Activity.igXuih);
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = this.EZpvd.getCompoundDrawablesRelative();
            Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "");
            int length = compoundDrawablesRelative.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    drawable = null;
                    break;
                }
                drawable = compoundDrawablesRelative[i2];
                if (drawable != null) {
                    break;
                } else {
                    i2++;
                }
            }
            int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : C55298xhM.dp2px$default(6.0f, null, 1, null);
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : C55298xhM.dp2px$default(10.0f, null, 1, null);
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            }
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            }
            if (i == 1) {
                this.EZpvd.setCompoundDrawablesRelative(null, null, drawable2, null);
                this.OLrzqt.setCompoundDrawablesRelative(null, null, drawable3, null);
                this.AEQbTJ.setCompoundDrawablesRelative(null, null, drawable3, null);
            } else if (i == 2) {
                this.EZpvd.setCompoundDrawablesRelative(null, null, drawable3, null);
                this.OLrzqt.setCompoundDrawablesRelative(null, null, drawable2, null);
                this.AEQbTJ.setCompoundDrawablesRelative(null, null, drawable3, null);
            } else {
                if (i != 5) {
                    return;
                }
                this.EZpvd.setCompoundDrawablesRelative(null, null, drawable3, null);
                this.OLrzqt.setCompoundDrawablesRelative(null, null, drawable3, null);
                this.AEQbTJ.setCompoundDrawablesRelative(null, null, drawable2, null);
            }
        }

        public final void OLrzqt(@NotNull C15904eZp c15904eZp, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
            Intrinsics.checkNotNullParameter(c15904eZp, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            android.widget.TextView textView = this.EZpvd;
            textView.setOnClickListener(new TaskDescription(textView, 1000L, function0));
            android.widget.TextView textView2 = this.OLrzqt;
            textView2.setOnClickListener(new Activity(textView2, 1000L, function02));
            android.widget.TextView textView3 = this.AEQbTJ;
            textView3.setOnClickListener(new ViewOnClickListenerC0836ActionBar(textView3, 1000L, function03));
            AEQbTJ(c15904eZp.AEQbTJ(), c15904eZp.KWHzl());
        }

        /* JADX INFO: renamed from: o.eZm$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0836ActionBar implements View.OnClickListener {
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ Function0 OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0836ActionBar(android.view.View view, long j, Function0 function0) {
                this.copydefault = view;
                this.KWHzl = j;
                this.OLrzqt = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.OLrzqt.invoke();
                }
            }
        }

        /* JADX INFO: renamed from: o.eZm$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ Function0 KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, Function0 function0) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.KWHzl = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.KWHzl.invoke();
                }
            }
        }

        /* JADX INFO: renamed from: o.eZm$ActionBar$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ Function0 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Function0 function0) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.copydefault = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.copydefault.invoke();
                }
            }
        }
    }
}
