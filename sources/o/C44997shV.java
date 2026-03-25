package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.shV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44997shV extends RecyclerView.Adapter<Application> {
    public java.util.List<SelfServiceDisplayModel> EZpvd;
    public ActionBar KWHzl;

    /* JADX INFO: renamed from: o.shV$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void copydefault(@NotNull SelfServiceToolBean selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C44997shV() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel>):void (m)] (LINE:20) call: o.shV.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C44997shV(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    public C44997shV(@NotNull java.util.List<SelfServiceDisplayModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C47436tpx c47436tpxAEQbTJ = C47436tpx.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c47436tpxAEQbTJ, "");
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(C55298xhM.dp2px$default(150.0f, null, 1, null), -2);
        layoutParams.setFlexShrink(0.0f);
        c47436tpxAEQbTJ.getRoot().setLayoutParams(layoutParams);
        return new Application(this, c47436tpxAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        application.copydefault(this.EZpvd.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX INFO: renamed from: o.shV$TaskDescription */
    public static final class TaskDescription extends DiffUtil.Callback {
        public final /* synthetic */ java.util.List<SelfServiceDisplayModel> EZpvd;

        public TaskDescription(java.util.List<SelfServiceDisplayModel> list) {
            this.EZpvd = list;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return C44997shV.this.EZpvd.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.EZpvd.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            return Intrinsics.EZpvd((java.lang.Object) ((SelfServiceDisplayModel) C44997shV.this.EZpvd.get(i)).getSourceBean().getId(), (java.lang.Object) this.EZpvd.get(i2).getSourceBean().getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            SelfServiceToolBean sourceBean = ((SelfServiceDisplayModel) C44997shV.this.EZpvd.get(i)).getSourceBean();
            SelfServiceToolBean sourceBean2 = this.EZpvd.get(i2).getSourceBean();
            return Intrinsics.EZpvd((java.lang.Object) sourceBean.getTitle(), (java.lang.Object) sourceBean2.getTitle()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getDeeplink(), (java.lang.Object) sourceBean2.getDeeplink()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getDescription(), (java.lang.Object) sourceBean2.getDescription()) && sourceBean.getScenario() == sourceBean2.getScenario() && Intrinsics.EZpvd(sourceBean.getExtra(), sourceBean2.getExtra());
        }
    }

    public final void EZpvd(@NotNull java.util.List<SelfServiceDisplayModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new TaskDescription(list));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
        this.EZpvd = list;
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    /* JADX INFO: renamed from: o.shV$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C44997shV KWHzl;
        public final C47436tpx copydefault;

        /* JADX INFO: renamed from: o.shV$Application$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SelfServiceScenario.values().length];
                try {
                    iArr[SelfServiceScenario.MY_TICKETS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C44997shV c44997shV, C47436tpx c47436tpx) {
            super(c47436tpx.getRoot());
            Intrinsics.checkNotNullParameter(c47436tpx, "");
            this.KWHzl = c44997shV;
            this.copydefault = c47436tpx;
        }

        public final void copydefault(@NotNull SelfServiceDisplayModel selfServiceDisplayModel) {
            Intrinsics.checkNotNullParameter(selfServiceDisplayModel, "");
            C47436tpx c47436tpx = this.copydefault;
            C44997shV c44997shV = this.KWHzl;
            c47436tpx.OLrzqt.setText(selfServiceDisplayModel.getTitle());
            if (C33129mqd.OLrzqt(selfServiceDisplayModel.getDescription())) {
                android.widget.TextView textView = c47436tpx.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                android.widget.TextView textView2 = c47436tpx.KWHzl;
                java.lang.CharSequence description = selfServiceDisplayModel.getDescription();
                if (description == null) {
                    description = "";
                }
                textView2.setText(description);
            } else {
                android.widget.TextView textView3 = c47436tpx.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
            }
            android.widget.ImageView imageView = c47436tpx.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(selfServiceDisplayModel.getShowRedDot() ? 0 : 8);
            Glide.AEQbTJ(c47436tpx.getRoot().getContext()).EZpvd(selfServiceDisplayModel.getIconUrl()).EZpvd(c47436tpx.EZpvd);
            ConstraintLayout root = c47436tpx.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, selfServiceDisplayModel, c44997shV));
        }

        /* JADX INFO: renamed from: o.shV$Application$Activity */
        public static final class Activity implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ SelfServiceDisplayModel EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(SelfServiceDisplayModel selfServiceDisplayModel) {
                this.EZpvd = selfServiceDisplayModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                copydefault(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void copydefault(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.put("index", this.EZpvd.getSourceBean().getDataTrackingKey(), false);
                eventParamsList.put("page", "landing", true);
                EventParamsList.put$default(eventParamsList, "page_topic_name", this.EZpvd.getSourceBean().getSlug(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "page_transaction_type", "", false, 4, null);
                EventParamsList.put$default(eventParamsList, "page_transaction_status", "", false, 4, null);
                eventParamsList.put("mini_support_page", "false", true);
            }
        }

        /* JADX INFO: renamed from: o.shV$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ SelfServiceDisplayModel OLrzqt;
            public final /* synthetic */ C44997shV copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, SelfServiceDisplayModel selfServiceDisplayModel, C44997shV c44997shV) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.OLrzqt = selfServiceDisplayModel;
                this.copydefault = c44997shV;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C45363soQ.onSessionIdEvent$default("SupportCenter_Top_SelfService_Click", false, new Activity(this.OLrzqt), 1, null);
                    if (TaskDescription.KWHzl[this.OLrzqt.getSourceBean().getScenario().ordinal()] == 1) {
                        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_MyTicket_Click", false, null, 3, null);
                    }
                    ActionBar actionBar = this.copydefault.KWHzl;
                    if (actionBar != null) {
                        actionBar.copydefault(this.OLrzqt.getSourceBean());
                    }
                }
            }
        }
    }
}
