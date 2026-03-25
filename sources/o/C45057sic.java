package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45057sic extends RecyclerView.Adapter<ActionBar> {
    public Application AEQbTJ;
    public java.util.List<SelfServiceDisplayModel> EZpvd;
    public boolean OLrzqt;
    public int copydefault;

    /* JADX INFO: renamed from: o.sic$Application */
    public interface Application {
        void OLrzqt(@NotNull SelfServiceToolBean selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = application;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r3v0 java.util.List))
 A[MD:(boolean, int, java.util.List<com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel>):void (m)] (LINE:17) call: o.sic.<init>(boolean, int, java.util.List):void type: THIS */
    public /* synthetic */ C45057sic(boolean z, int i, java.util.List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? yDY.AhwBna() : list);
    }

    public C45057sic(boolean z, int i, @NotNull java.util.List<SelfServiceDisplayModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = z;
        this.copydefault = i;
        this.EZpvd = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C47392tpF c47392tpFEZpvd = C47392tpF.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c47392tpFEZpvd, "");
        if (this.OLrzqt) {
            FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(this.copydefault, -2);
            layoutParams.setFlexShrink(0.0f);
            c47392tpFEZpvd.getRoot().setLayoutParams(layoutParams);
        }
        return new ActionBar(this, c47392tpFEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.copydefault(this.EZpvd.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX INFO: renamed from: o.sic$Activity */
    public static final class Activity extends DiffUtil.Callback {
        public final /* synthetic */ java.util.List<SelfServiceDisplayModel> OLrzqt;

        public Activity(java.util.List<SelfServiceDisplayModel> list) {
            this.OLrzqt = list;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return C45057sic.this.EZpvd.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.OLrzqt.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return Intrinsics.EZpvd((java.lang.Object) ((SelfServiceDisplayModel) C45057sic.this.EZpvd.get(i)).getSourceBean().getId(), (java.lang.Object) this.OLrzqt.get(i2).getSourceBean().getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            SelfServiceToolBean sourceBean = ((SelfServiceDisplayModel) C45057sic.this.EZpvd.get(i)).getSourceBean();
            SelfServiceToolBean sourceBean2 = this.OLrzqt.get(i2).getSourceBean();
            return Intrinsics.EZpvd((java.lang.Object) sourceBean.getTitle(), (java.lang.Object) sourceBean2.getTitle()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getDeeplink(), (java.lang.Object) sourceBean2.getDeeplink()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getDescription(), (java.lang.Object) sourceBean2.getDescription()) && sourceBean.getScenario() == sourceBean2.getScenario() && Intrinsics.EZpvd(sourceBean.getExtra(), sourceBean2.getExtra());
        }
    }

    public final void copydefault(@NotNull java.util.List<SelfServiceDisplayModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Activity(list));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
        this.EZpvd = list;
        diffResultCalculateDiff.dispatchUpdatesTo(this);
        if (C33129mqd.KWHzl((java.util.Collection) this.EZpvd)) {
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.sib
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45057sic.copydefault((SelfServiceDisplayModel) obj);
                }
            }, 30, null);
            C44901sff.copydefault.EZpvd(CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.sij
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45057sic.EZpvd((SelfServiceDisplayModel) obj);
                }
            }, 30, null), strJoinToString$default, this.OLrzqt, true);
        }
    }

    public static final java.lang.CharSequence copydefault(SelfServiceDisplayModel selfServiceDisplayModel) {
        Intrinsics.checkNotNullParameter(selfServiceDisplayModel, "");
        return selfServiceDisplayModel.getSourceBean().getDataTrackingKey();
    }

    public static final java.lang.CharSequence EZpvd(SelfServiceDisplayModel selfServiceDisplayModel) {
        Intrinsics.checkNotNullParameter(selfServiceDisplayModel, "");
        return selfServiceDisplayModel.getSourceBean().getScenario().getValue();
    }

    /* JADX INFO: renamed from: o.sic$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final C47392tpF KWHzl;
        public final /* synthetic */ C45057sic OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C45057sic c45057sic, C47392tpF c47392tpF) {
            super(c47392tpF.getRoot());
            Intrinsics.checkNotNullParameter(c47392tpF, "");
            this.OLrzqt = c45057sic;
            this.KWHzl = c47392tpF;
        }

        public final void copydefault(@NotNull SelfServiceDisplayModel selfServiceDisplayModel) {
            Intrinsics.checkNotNullParameter(selfServiceDisplayModel, "");
            C47392tpF c47392tpF = this.KWHzl;
            C45057sic c45057sic = this.OLrzqt;
            c47392tpF.EZpvd.setText(selfServiceDisplayModel.getTitle());
            android.widget.ImageView imageView = c47392tpF.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(selfServiceDisplayModel.getShowRedDot() ? 0 : 8);
            Glide.AEQbTJ(c47392tpF.getRoot().getContext()).EZpvd(selfServiceDisplayModel.getIconUrl()).EZpvd(c47392tpF.AEQbTJ);
            ConstraintLayout root = c47392tpF.getRoot();
            root.setOnClickListener(new Application(root, 1000L, selfServiceDisplayModel, c45057sic));
        }

        /* JADX INFO: renamed from: o.sic$ActionBar$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C45057sic EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ SelfServiceDisplayModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, SelfServiceDisplayModel selfServiceDisplayModel, C45057sic c45057sic) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.copydefault = selfServiceDisplayModel;
                this.EZpvd = c45057sic;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C44901sff.copydefault.EZpvd(this.copydefault.getSourceBean().getScenario().getValue(), this.copydefault.getSourceBean().getDataTrackingKey(), this.EZpvd.OLrzqt, false);
                    Application application = this.EZpvd.AEQbTJ;
                    if (application != null) {
                        application.OLrzqt(this.copydefault.getSourceBean());
                    }
                }
            }
        }
    }
}
