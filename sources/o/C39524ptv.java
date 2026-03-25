package o;

import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39524ptv extends AbstractC59533zio<DrawLineData.DrawLineFiboBean, Activity> {
    public final Function2<java.lang.Integer, java.lang.Float, Unit> AEQbTJ;
    public final android.content.Context KWHzl;
    public final Function2<java.lang.Integer, java.lang.Boolean, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39524ptv(@NotNull android.content.Context context, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Boolean, Unit> function2, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Float, Unit> function22) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.KWHzl = context;
        this.OLrzqt = function2;
        this.AEQbTJ = function22;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DCUTEI, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final Activity activity, @NotNull DrawLineData.DrawLineFiboBean drawLineFiboBean) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(drawLineFiboBean, "");
        activity.setIsRecyclable(false);
        activity.KWHzl().setChecked(drawLineFiboBean.isSelected());
        activity.copydefault().setText(pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Float.valueOf(drawLineFiboBean.getPercent())), null, 1, null));
        activity.copydefault().setTextColor(C33070mpX.copydefault(drawLineFiboBean.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.Dff));
        activity.copydefault().setMaxDecimalValue(3);
        activity.KWHzl().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.ptB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C39524ptv.EZpvd(this.KWHzl, activity, compoundButton, z);
            }
        });
        android.text.TextWatcher textWatcherAEQbTJ = activity.AEQbTJ();
        if (textWatcherAEQbTJ != null) {
            activity.copydefault().removeTextChangedListener(textWatcherAEQbTJ);
        }
        C55001xbh c55001xbhCopydefault = activity.copydefault();
        TaskDescription taskDescription = new TaskDescription(activity);
        c55001xbhCopydefault.addTextChangedListener(taskDescription);
        activity.KWHzl(taskDescription);
    }

    public static final void EZpvd(C39524ptv c39524ptv, Activity activity, android.widget.CompoundButton compoundButton, boolean z) {
        c39524ptv.OLrzqt.invoke(java.lang.Integer.valueOf(activity.getAbsoluteAdapterPosition()), java.lang.Boolean.valueOf(z));
        activity.copydefault().setTextColor(C33070mpX.copydefault(z ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.Dff));
    }

    /* JADX INFO: renamed from: o.ptv$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public android.text.TextWatcher EZpvd;
        public final android.widget.CheckBox KWHzl;
        public final C55001xbh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.text.TextWatcher AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.CheckBox KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(android.text.TextWatcher textWatcher) {
            this.EZpvd = textWatcher;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55001xbh copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.OTwTPd);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.CheckBox) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.invokespecialdPnHjp);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (C55001xbh) viewFindViewById2;
        }
    }

    /* JADX INFO: renamed from: o.ptv$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        public final /* synthetic */ Activity KWHzl;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(Activity activity) {
            this.KWHzl = activity;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C39524ptv.this.AEQbTJ.invoke(java.lang.Integer.valueOf(this.KWHzl.getAbsoluteAdapterPosition()), java.lang.Float.valueOf(C33129mqd.djBIcL(this.KWHzl.copydefault().isConnected())));
        }
    }
}
