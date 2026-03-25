package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.shR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44993shR extends AbstractC45381soi<TransactionDisplayModelV2, Application> {
    public ActionBar EZpvd;
    public final android.content.Context KWHzl;

    /* JADX INFO: renamed from: o.shR$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void EZpvd(@NotNull SelfServiceToolBean selfServiceToolBean, java.lang.Object obj);

        void KWHzl(@NotNull TransactionDisplayModel transactionDisplayModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.EZpvd = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context OLrzqt() {
        return this.KWHzl;
    }

    public C44993shR(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull TransactionDisplayModelV2 transactionDisplayModelV2, @NotNull TransactionDisplayModelV2 transactionDisplayModelV22) {
        Intrinsics.checkNotNullParameter(transactionDisplayModelV2, "");
        Intrinsics.checkNotNullParameter(transactionDisplayModelV22, "");
        TransactionDisplayModel transaction = transactionDisplayModelV2.getTransaction();
        java.lang.String id = transaction != null ? transaction.getId() : null;
        TransactionDisplayModel transaction2 = transactionDisplayModelV22.getTransaction();
        return Intrinsics.EZpvd((java.lang.Object) id, (java.lang.Object) (transaction2 != null ? transaction2.getId() : null));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull TransactionDisplayModelV2 transactionDisplayModelV2, @NotNull TransactionDisplayModelV2 transactionDisplayModelV22) {
        Intrinsics.checkNotNullParameter(transactionDisplayModelV2, "");
        Intrinsics.checkNotNullParameter(transactionDisplayModelV22, "");
        TransactionDisplayModel transaction = transactionDisplayModelV2.getTransaction();
        TransactionDisplayModel transaction2 = transactionDisplayModelV22.getTransaction();
        return transaction != null && transaction2 != null && transaction.getTransactionType() == transaction2.getTransactionType() && Intrinsics.EZpvd((java.lang.Object) transaction.getDisplayDescription(), (java.lang.Object) transaction2.getDisplayDescription()) && Intrinsics.EZpvd((java.lang.Object) transaction.getDisplayStatus(), (java.lang.Object) transaction2.getDisplayStatus()) && Intrinsics.EZpvd((java.lang.Object) transaction.getDisplayAmount(), (java.lang.Object) transaction2.getDisplayAmount()) && Intrinsics.EZpvd((java.lang.Object) transaction.getDisplayDateTime(), (java.lang.Object) transaction2.getDisplayDateTime());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C47387tpA c47387tpAEZpvd = C47387tpA.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c47387tpAEZpvd, "");
        return new Application(this, c47387tpAEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        TransactionDisplayModelV2 transactionDisplayModelV2 = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(transactionDisplayModelV2, "");
        application.copydefault(transactionDisplayModelV2);
    }

    /* JADX INFO: renamed from: o.shR$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final C47387tpA KWHzl;
        public final /* synthetic */ C44993shR OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C44993shR c44993shR, C47387tpA c47387tpA) {
            super(c47387tpA.getRoot());
            Intrinsics.checkNotNullParameter(c47387tpA, "");
            this.OLrzqt = c44993shR;
            this.KWHzl = c47387tpA;
        }

        public final void copydefault(@NotNull TransactionDisplayModelV2 transactionDisplayModelV2) {
            Intrinsics.checkNotNullParameter(transactionDisplayModelV2, "");
            C47387tpA c47387tpA = this.KWHzl;
            C44993shR c44993shR = this.OLrzqt;
            TransactionDisplayModel transaction = transactionDisplayModelV2.getTransaction();
            if (transaction != null) {
                c47387tpA.AYXKKw.setText(transaction.getDisplayDescription());
                c47387tpA.AhwBna.setText(transaction.getDisplayDate());
                android.widget.ImageView imageView = c47387tpA.OLrzqt;
                java.lang.Integer iconResId = transaction.getTransactionType().getIconResId();
                imageView.setImageResource(iconResId != null ? iconResId.intValue() : 0);
                c47387tpA.gEmmrt.setText(transaction.getDisplayAmountHeader());
                C55251xgS c55251xgS = c47387tpA.EZpvd;
                java.lang.String label = transaction.getLabel();
                Intrinsics.copydefault(c55251xgS);
                c55251xgS.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) label) ? 0 : 8);
                c55251xgS.setText(label);
                java.lang.String labelColor = transaction.getLabelColor();
                if (labelColor == null) {
                    labelColor = "";
                }
                c55251xgS.setOKDSStyle(EZpvd(labelColor));
                ConstraintLayout root = c47387tpA.getRoot();
                root.setOnClickListener(new Activity(root, 1000L, c44993shR, transaction));
            }
            FlexboxLayout flexboxLayout = c47387tpA.copydefault;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
            AEQbTJ(flexboxLayout, transaction, transactionDisplayModelV2.getSelfServiceTools());
        }

        public final int EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -734239628) {
                if (iHashCode != 112785) {
                    if (iHashCode == 98619139 && str.equals("green")) {
                        return 8;
                    }
                } else if (str.equals("red")) {
                    return 9;
                }
            } else if (str.equals("yellow")) {
                return 10;
            }
            return 11;
        }

        public final void AEQbTJ(@NotNull FlexboxLayout flexboxLayout, TransactionDisplayModel transactionDisplayModel, java.util.List<SelfServiceToolBean> list) {
            Intrinsics.checkNotNullParameter(flexboxLayout, "");
            boolean zKWHzl = C33129mqd.KWHzl((java.util.Collection) list);
            int i = 0;
            flexboxLayout.setVisibility(C33129mqd.KWHzl((java.util.Collection) list) ? 0 : 8);
            if (zKWHzl) {
                int i2 = 1;
                int iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
                flexboxLayout.removeAllViews();
                Intrinsics.copydefault(list);
                java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 4);
                int size = listAhwBna.size();
                C44993shR c44993shR = this.OLrzqt;
                int i3 = 0;
                for (java.lang.Object obj : listAhwBna) {
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    SelfServiceToolBean selfServiceToolBean = (SelfServiceToolBean) obj;
                    C52794wYp c52794wYp = new C52794wYp(c44993shR.OLrzqt(), null, 0, 6, null);
                    c52794wYp.setText(selfServiceToolBean.getTitle());
                    c52794wYp.setOKDSSize(32);
                    if (Intrinsics.EZpvd(selfServiceToolBean.getPrimary(), java.lang.Boolean.TRUE)) {
                        c52794wYp.setOKDSType(259);
                    } else {
                        c52794wYp.setOKDSType(260);
                    }
                    FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(i, c52794wYp.AkhnZx());
                    layoutParams.setFlexBasisPercent((size <= i2 || ((size % 2 != i2 || i3 != size + (-1)) ? i : i2) != 0) ? 1.0f : 0.48f);
                    layoutParams.setMargins(i, i3 < 2 ? i : iDp2px$default, i, i);
                    c52794wYp.setLayoutParams(layoutParams);
                    c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, transactionDisplayModel, selfServiceToolBean, c44993shR));
                    flexboxLayout.addView(c52794wYp);
                    i3++;
                    i = 0;
                    i2 = 1;
                }
            }
        }

        /* JADX INFO: renamed from: o.shR$Application$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C44993shR EZpvd;
            public final /* synthetic */ TransactionDisplayModel KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C44993shR c44993shR, TransactionDisplayModel transactionDisplayModel) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.EZpvd = c44993shR;
                this.KWHzl = transactionDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    ActionBar actionBar = this.EZpvd.EZpvd;
                    if (actionBar != null) {
                        actionBar.KWHzl(this.KWHzl);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.shR$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ SelfServiceToolBean EZpvd;
            public final /* synthetic */ C44993shR KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ TransactionDisplayModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, TransactionDisplayModel transactionDisplayModel, SelfServiceToolBean selfServiceToolBean, C44993shR c44993shR) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.copydefault = transactionDisplayModel;
                this.EZpvd = selfServiceToolBean;
                this.KWHzl = c44993shR;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    TransactionDisplayModel transactionDisplayModel = this.copydefault;
                    java.lang.Object objKWHzl = transactionDisplayModel != null ? C45073sis.KWHzl(transactionDisplayModel, this.EZpvd) : null;
                    ActionBar actionBar = this.KWHzl.EZpvd;
                    if (actionBar != null) {
                        actionBar.EZpvd(this.EZpvd, objKWHzl);
                    }
                }
            }
        }
    }
}
