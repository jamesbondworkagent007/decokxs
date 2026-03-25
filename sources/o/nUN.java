package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.joinreview.displaymodel.JoinRequestDisplayModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import o.nUN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nUN extends AbstractC35894oHq<JoinRequestDisplayModel, Application> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ = true;
    public Activity OLrzqt;

    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {
        void AEQbTJ(@NotNull java.lang.String str);

        void EZpvd(@NotNull java.lang.String str);

        void copydefault(@NotNull java.lang.String str, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nUN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
        notifyItemRangeChanged(0, getItemCount(), "KEY_REFRESH_EDIT_MODE");
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    public boolean OLrzqt(@NotNull JoinRequestDisplayModel joinRequestDisplayModel, @NotNull JoinRequestDisplayModel joinRequestDisplayModel2) {
        Intrinsics.checkNotNullParameter(joinRequestDisplayModel, "");
        Intrinsics.checkNotNullParameter(joinRequestDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) joinRequestDisplayModel.AEQbTJ(), (java.lang.Object) joinRequestDisplayModel2.AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull JoinRequestDisplayModel joinRequestDisplayModel, @NotNull JoinRequestDisplayModel joinRequestDisplayModel2) {
        Intrinsics.checkNotNullParameter(joinRequestDisplayModel, "");
        Intrinsics.checkNotNullParameter(joinRequestDisplayModel2, "");
        return joinRequestDisplayModel.OLrzqt() == joinRequestDisplayModel2.OLrzqt() && joinRequestDisplayModel.AYXKKw() == joinRequestDisplayModel2.AYXKKw() && Intrinsics.EZpvd((java.lang.Object) joinRequestDisplayModel.EZpvd(), (java.lang.Object) joinRequestDisplayModel2.EZpvd()) && Intrinsics.EZpvd((java.lang.Object) joinRequestDisplayModel.KWHzl(), (java.lang.Object) joinRequestDisplayModel2.KWHzl()) && Intrinsics.EZpvd(joinRequestDisplayModel.copydefault(), joinRequestDisplayModel2.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object AEQbTJ(@NotNull JoinRequestDisplayModel joinRequestDisplayModel, @NotNull JoinRequestDisplayModel joinRequestDisplayModel2) {
        Intrinsics.checkNotNullParameter(joinRequestDisplayModel, "");
        Intrinsics.checkNotNullParameter(joinRequestDisplayModel2, "");
        if (joinRequestDisplayModel.OLrzqt() != joinRequestDisplayModel2.OLrzqt()) {
            return "KEY_REFRESH_LOADING";
        }
        if (joinRequestDisplayModel.AYXKKw() != joinRequestDisplayModel2.AYXKKw()) {
            return "KEY_REFRESH_SELECTED";
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nOG nogAEQbTJ = nOG.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nogAEQbTJ, "");
        return new Application(this, nogAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        JoinRequestDisplayModel joinRequestDisplayModel = KWHzl().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(joinRequestDisplayModel, "");
        application.EZpvd(joinRequestDisplayModel);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.contains("KEY_REFRESH_EDIT_MODE")) {
            application.OLrzqt();
            return;
        }
        if (list.contains("KEY_REFRESH_LOADING")) {
            JoinRequestDisplayModel joinRequestDisplayModel = KWHzl().getCurrentList().get(i);
            Intrinsics.checkNotNullExpressionValue(joinRequestDisplayModel, "");
            application.copydefault(joinRequestDisplayModel);
        } else {
            if (list.contains("KEY_REFRESH_SELECTED")) {
                JoinRequestDisplayModel joinRequestDisplayModel2 = KWHzl().getCurrentList().get(i);
                Intrinsics.checkNotNullExpressionValue(joinRequestDisplayModel2, "");
                application.KWHzl(joinRequestDisplayModel2);
                return;
            }
            onBindViewHolder(application, i);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.AEQbTJ();
        super.onViewRecycled(application);
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final nOG AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;
        public final /* synthetic */ nUN OLrzqt;
        public final int copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull nUN nun, nOG nog) {
            super(nog.getRoot());
            Intrinsics.checkNotNullParameter(nog, "");
            this.OLrzqt = nun;
            this.AEQbTJ = nog;
            this.KWHzl = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
            this.copydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            this.EZpvd = C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG);
        }

        public final void EZpvd(@NotNull JoinRequestDisplayModel joinRequestDisplayModel) {
            Intrinsics.checkNotNullParameter(joinRequestDisplayModel, "");
            nOG nog = this.AEQbTJ;
            nUN nun = this.OLrzqt;
            copydefault(joinRequestDisplayModel);
            OLrzqt();
            KWHzl(joinRequestDisplayModel);
            C35893oHp c35893oHp = nog.valueOf.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.KWHzl(c35893oHp, joinRequestDisplayModel.copydefault());
            nog.AYXKKw.setText(joinRequestDisplayModel.EZpvd());
            android.widget.TextView textView = nog.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, joinRequestDisplayModel.KWHzl());
            C35918oIn c35918oIn = nog.AEQbTJ;
            c35918oIn.setOnClickListener(new Activity(c35918oIn, 1000L, nun, joinRequestDisplayModel));
            C35918oIn c35918oIn2 = nog.copydefault;
            c35918oIn2.setOnClickListener(new ActionBar(c35918oIn2, 1000L, nun, joinRequestDisplayModel));
        }

        public final void KWHzl(@NotNull final JoinRequestDisplayModel joinRequestDisplayModel) {
            Intrinsics.checkNotNullParameter(joinRequestDisplayModel, "");
            nOG nog = this.AEQbTJ;
            final nUN nun = this.OLrzqt;
            nog.KWHzl.setOnCheckedChangeListener(null);
            nog.KWHzl.setChecked(joinRequestDisplayModel.AYXKKw());
            nog.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.nUM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    nUN.Application.AEQbTJ(nun, joinRequestDisplayModel, compoundButton, z);
                }
            });
        }

        public static final void AEQbTJ(nUN nun, JoinRequestDisplayModel joinRequestDisplayModel, android.widget.CompoundButton compoundButton, boolean z) {
            Activity activity = nun.OLrzqt;
            if (activity != null) {
                activity.copydefault(joinRequestDisplayModel.AEQbTJ(), z);
            }
        }

        public final void copydefault(@NotNull JoinRequestDisplayModel joinRequestDisplayModel) {
            Intrinsics.checkNotNullParameter(joinRequestDisplayModel, "");
            boolean zOLrzqt = joinRequestDisplayModel.OLrzqt();
            nOG nog = this.AEQbTJ;
            if (!zOLrzqt) {
                nog.AhwBna.setBackgroundResource(C35399nuc.ActionBar.AEQbTJ);
                nog.AYXKKw.setTextColor(this.copydefault);
                nog.djBIcL.setTextColor(this.EZpvd);
            } else {
                nog.AhwBna.setBackgroundResource(C52761wXj.Activity.UccSpe);
                nog.AYXKKw.setTextColor(this.KWHzl);
                nog.djBIcL.setTextColor(this.KWHzl);
            }
            android.widget.LinearLayout linearLayout = nog.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(linearLayout).iterator();
            while (it.hasNext()) {
                it.next().setClickable(!zOLrzqt);
            }
        }

        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ nUN AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ JoinRequestDisplayModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, nUN nun, JoinRequestDisplayModel joinRequestDisplayModel) {
                this.OLrzqt = view;
                this.KWHzl = j;
                this.AEQbTJ = nun;
                this.copydefault = joinRequestDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    Activity activity = this.AEQbTJ.OLrzqt;
                    if (activity != null) {
                        activity.AEQbTJ(this.copydefault.AEQbTJ());
                    }
                }
            }
        }

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ nUN KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ JoinRequestDisplayModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, nUN nun, JoinRequestDisplayModel joinRequestDisplayModel) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.KWHzl = nun;
                this.copydefault = joinRequestDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    Activity activity = this.KWHzl.OLrzqt;
                    if (activity != null) {
                        activity.EZpvd(this.copydefault.AEQbTJ());
                    }
                }
            }
        }

        public final void OLrzqt() {
            final nOG nog = this.AEQbTJ;
            if (this.OLrzqt.AEQbTJ) {
                C35918oIn c35918oIn = nog.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c35918oIn, "");
                c35918oIn.setVisibility(0);
                C35918oIn c35918oIn2 = nog.copydefault;
                Intrinsics.checkNotNullExpressionValue(c35918oIn2, "");
                c35918oIn2.setVisibility(0);
                android.widget.CheckBox checkBox = nog.KWHzl;
                Intrinsics.checkNotNullExpressionValue(checkBox, "");
                checkBox.setVisibility(8);
                nog.getRoot().setOnClickListener(null);
                nog.getRoot().setClickable(false);
                return;
            }
            C35918oIn c35918oIn3 = nog.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c35918oIn3, "");
            c35918oIn3.setVisibility(8);
            C35918oIn c35918oIn4 = nog.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35918oIn4, "");
            c35918oIn4.setVisibility(8);
            android.widget.CheckBox checkBox2 = nog.KWHzl;
            Intrinsics.checkNotNullExpressionValue(checkBox2, "");
            checkBox2.setVisibility(0);
            nog.getRoot().setClickable(true);
            nog.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.nUI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nUN.Application.EZpvd(nog, view);
                }
            });
        }

        public static final void EZpvd(nOG nog, android.view.View view) {
            nog.KWHzl.performClick();
        }

        public final void AEQbTJ() {
            nOG nog = this.AEQbTJ;
            nog.valueOf.copydefault.setImageDrawable(null);
            nog.AYXKKw.setText("");
            nog.djBIcL.setText("");
            nog.KWHzl.setOnCheckedChangeListener(null);
            nog.KWHzl.setChecked(false);
        }
    }
}
