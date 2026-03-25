package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45055sia extends AbstractC45381soi<SelfServiceToolBean, ActionBar> {
    public boolean AEQbTJ = true;
    public Activity copydefault;

    /* JADX INFO: renamed from: o.sia$Activity */
    public interface Activity {
        void EZpvd(@NotNull SelfServiceToolBean selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull SelfServiceToolBean selfServiceToolBean, @NotNull SelfServiceToolBean selfServiceToolBean2) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        Intrinsics.checkNotNullParameter(selfServiceToolBean2, "");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: copydefault, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull SelfServiceToolBean selfServiceToolBean, @NotNull SelfServiceToolBean selfServiceToolBean2) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        Intrinsics.checkNotNullParameter(selfServiceToolBean2, "");
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C47388tpB c47388tpBEZpvd = C47388tpB.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c47388tpBEZpvd, "");
        android.widget.TextView textView = c47388tpBEZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(this.AEQbTJ ? 0 : 8);
        return new ActionBar(this, c47388tpBEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        SelfServiceToolBean selfServiceToolBean = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(selfServiceToolBean, "");
        actionBar.OLrzqt(selfServiceToolBean);
    }

    /* JADX INFO: renamed from: o.sia$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ C45055sia KWHzl;
        public final C47388tpB OLrzqt;

        /* JADX INFO: renamed from: o.sia$ActionBar$Activity */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SelfServiceScenario.values().length];
                try {
                    iArr[SelfServiceScenario.MY_TICKETS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C45055sia c45055sia, C47388tpB c47388tpB) {
            super(c47388tpB.getRoot());
            Intrinsics.checkNotNullParameter(c47388tpB, "");
            this.KWHzl = c45055sia;
            this.OLrzqt = c47388tpB;
        }

        public final void OLrzqt(@NotNull SelfServiceToolBean selfServiceToolBean) {
            java.lang.String iconBright;
            java.lang.CharSequence description;
            Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
            C47388tpB c47388tpB = this.OLrzqt;
            C45055sia c45055sia = this.KWHzl;
            if (C33492mxV.OLrzqt()) {
                iconBright = selfServiceToolBean.getIconDark();
            } else {
                iconBright = selfServiceToolBean.getIconBright();
            }
            Glide.KWHzl(this.OLrzqt.copydefault).EZpvd(iconBright).EZpvd(this.OLrzqt.copydefault);
            c47388tpB.EZpvd.setText(selfServiceToolBean.getTitle());
            if (Activity.AEQbTJ[selfServiceToolBean.getScenario().ordinal()] == 1) {
                java.lang.Integer numKWHzl = C45361soO.KWHzl(selfServiceToolBean.getExtra(), "openTickets");
                description = C44855sem.AEQbTJ(numKWHzl != null ? numKWHzl.intValue() : 0);
            } else {
                description = selfServiceToolBean.getDescription();
            }
            c47388tpB.KWHzl.setText(description);
            ConstraintLayout root = c47388tpB.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0947ActionBar(root, 1000L, c45055sia, selfServiceToolBean));
        }

        /* JADX INFO: renamed from: o.sia$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0947ActionBar implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C45055sia OLrzqt;
            public final /* synthetic */ SelfServiceToolBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0947ActionBar(android.view.View view, long j, C45055sia c45055sia, SelfServiceToolBean selfServiceToolBean) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.OLrzqt = c45055sia;
                this.copydefault = selfServiceToolBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Activity activity = this.OLrzqt.copydefault;
                    if (activity != null) {
                        activity.EZpvd(this.copydefault);
                    }
                }
            }
        }
    }
}
