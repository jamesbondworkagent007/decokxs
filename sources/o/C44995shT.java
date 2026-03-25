package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.LandingTransactionDisplayModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.shT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44995shT extends AbstractC45381soi<LandingTransactionDisplayModel, StateListAnimator> {
    public ActionBar AEQbTJ;

    /* JADX INFO: renamed from: o.shT$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void EZpvd(@NotNull TransactionDisplayModel transactionDisplayModel);

        void OLrzqt(@NotNull SelfServiceToolBean selfServiceToolBean, java.lang.Object obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AEQbTJ = actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull LandingTransactionDisplayModel landingTransactionDisplayModel, @NotNull LandingTransactionDisplayModel landingTransactionDisplayModel2) {
        Intrinsics.checkNotNullParameter(landingTransactionDisplayModel, "");
        Intrinsics.checkNotNullParameter(landingTransactionDisplayModel2, "");
        TransactionBean transaction = landingTransactionDisplayModel.getTransaction();
        java.lang.String id = transaction != null ? transaction.getId() : null;
        TransactionBean transaction2 = landingTransactionDisplayModel2.getTransaction();
        return Intrinsics.EZpvd((java.lang.Object) id, (java.lang.Object) (transaction2 != null ? transaction2.getId() : null));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull LandingTransactionDisplayModel landingTransactionDisplayModel, @NotNull LandingTransactionDisplayModel landingTransactionDisplayModel2) {
        Intrinsics.checkNotNullParameter(landingTransactionDisplayModel, "");
        Intrinsics.checkNotNullParameter(landingTransactionDisplayModel2, "");
        TransactionBean transaction = landingTransactionDisplayModel.getTransaction();
        TransactionBean transaction2 = landingTransactionDisplayModel2.getTransaction();
        return transaction != null && transaction2 != null && transaction.getTransactionType() == transaction2.getTransactionType() && Intrinsics.EZpvd((java.lang.Object) transaction.getDisplayedStatus(), (java.lang.Object) transaction2.getDisplayedStatus()) && Intrinsics.EZpvd((java.lang.Object) transaction.getDisplayedDescription(), (java.lang.Object) transaction2.getDisplayedDescription()) && Intrinsics.EZpvd((java.lang.Object) transaction.getId(), (java.lang.Object) transaction2.getId());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C47435tpw c47435tpwCopydefault = C47435tpw.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c47435tpwCopydefault, "");
        return new StateListAnimator(this, c47435tpwCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        LandingTransactionDisplayModel landingTransactionDisplayModel = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(landingTransactionDisplayModel, "");
        stateListAnimator.EZpvd(landingTransactionDisplayModel);
    }

    /* JADX INFO: renamed from: o.shT$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C44995shT EZpvd;
        public final C47435tpw KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C44995shT c44995shT, C47435tpw c47435tpw) {
            super(c47435tpw.getRoot());
            Intrinsics.checkNotNullParameter(c47435tpw, "");
            this.EZpvd = c44995shT;
            this.KWHzl = c47435tpw;
        }

        public final void EZpvd(@NotNull LandingTransactionDisplayModel landingTransactionDisplayModel) {
            Intrinsics.checkNotNullParameter(landingTransactionDisplayModel, "");
            C47435tpw c47435tpw = this.KWHzl;
            C44995shT c44995shT = this.EZpvd;
            TransactionBean transaction = landingTransactionDisplayModel.getTransaction();
            TransactionDisplayModel transactionDisplayModel$default = transaction != null ? C45073sis.toTransactionDisplayModel$default(transaction, landingTransactionDisplayModel.getContextualScenario(), null, 2, null) : null;
            if (transactionDisplayModel$default != null) {
                android.widget.TextView textView = c47435tpw.AhwBna;
                java.lang.String label = transactionDisplayModel$default.getLabel();
                if (label == null) {
                    label = "";
                }
                textView.setText(label);
                android.widget.TextView textView2 = c47435tpw.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                java.lang.String labelColor = transactionDisplayModel$default.getLabelColor();
                if (labelColor == null) {
                    labelColor = "";
                }
                AEQbTJ(textView2, labelColor);
                c47435tpw.OLrzqt.setText(transactionDisplayModel$default.getDisplayAmount());
                c47435tpw.AYXKKw.setText(transactionDisplayModel$default.getDisplayDescription());
                if (C33129mqd.KWHzl((java.util.Collection) landingTransactionDisplayModel.getSelfServiceTools())) {
                    java.util.List<SelfServiceToolBean> selfServiceTools = landingTransactionDisplayModel.getSelfServiceTools();
                    Intrinsics.copydefault(selfServiceTools);
                    SelfServiceToolBean selfServiceToolBean = (SelfServiceToolBean) CollectionsKt___CollectionsKt.AuCTelauCTel(selfServiceTools);
                    C52794wYp c52794wYp = c47435tpw.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                    c52794wYp.setVisibility(0);
                    c47435tpw.EZpvd.setText(selfServiceToolBean.getTitle());
                    if (Intrinsics.EZpvd(selfServiceToolBean.getPrimary(), java.lang.Boolean.TRUE)) {
                        c47435tpw.EZpvd.setOKDSType(259);
                    } else {
                        c47435tpw.EZpvd.setOKDSType(260);
                    }
                    C52794wYp c52794wYp2 = c47435tpw.EZpvd;
                    c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, transactionDisplayModel$default, selfServiceToolBean, c44995shT));
                } else {
                    C52794wYp c52794wYp3 = c47435tpw.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                    c52794wYp3.setVisibility(8);
                }
                ConstraintLayout constraintLayoutEZpvd = c47435tpw.getRoot();
                constraintLayoutEZpvd.setOnClickListener(new Application(constraintLayoutEZpvd, 1000L, c44995shT, transactionDisplayModel$default));
            }
        }

        /* JADX INFO: renamed from: o.shT$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0944StateListAnimator implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ TransactionDisplayModel KWHzl;
            public final /* synthetic */ SelfServiceToolBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0944StateListAnimator(TransactionDisplayModel transactionDisplayModel, SelfServiceToolBean selfServiceToolBean) {
                this.KWHzl = transactionDisplayModel;
                this.copydefault = selfServiceToolBean;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                AEQbTJ(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "transaction_type", this.KWHzl.getTransactionType().getValue(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "transaction_status", this.KWHzl.getStatusValue(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "label", this.KWHzl.getTransactionTag().getValue(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "click_area", "cta_button", false, 4, null);
                EventParamsList.put$default(eventParamsList, "cta_button_index", this.copydefault.getDataTrackingKey(), false, 4, null);
                EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, this.KWHzl.getId(), false, 4, null);
            }
        }

        /* JADX INFO: renamed from: o.shT$StateListAnimator$ActionBar */
        public static final class ActionBar implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ TransactionDisplayModel KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(TransactionDisplayModel transactionDisplayModel) {
                this.KWHzl = transactionDisplayModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                EZpvd(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void EZpvd(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "transaction_type", this.KWHzl.getTransactionType().getValue(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "transaction_status", this.KWHzl.getStatusValue(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "label", this.KWHzl.getTransactionTag().getValue(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "click_area", "entire_card", false, 4, null);
                EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, this.KWHzl.getId(), false, 4, null);
            }
        }

        public final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "red")) {
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gsvlRV));
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "green")) {
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.finishInit));
            } else {
                textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gqOnQv));
            }
        }

        /* JADX INFO: renamed from: o.shT$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C44995shT EZpvd;
            public final /* synthetic */ TransactionDisplayModel KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ SelfServiceToolBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, TransactionDisplayModel transactionDisplayModel, SelfServiceToolBean selfServiceToolBean, C44995shT c44995shT) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.KWHzl = transactionDisplayModel;
                this.copydefault = selfServiceToolBean;
                this.EZpvd = c44995shT;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    C45363soQ.onSessionIdEvent$default("SupportCenter_Transaction_LandingPage_Click", false, new C0944StateListAnimator(this.KWHzl, this.copydefault), 1, null);
                    java.lang.Object objKWHzl = C45073sis.KWHzl(this.KWHzl, this.copydefault);
                    ActionBar actionBar = this.EZpvd.AEQbTJ;
                    if (actionBar != null) {
                        actionBar.OLrzqt(this.copydefault, objKWHzl);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.shT$StateListAnimator$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C44995shT EZpvd;
            public final /* synthetic */ TransactionDisplayModel OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C44995shT c44995shT, TransactionDisplayModel transactionDisplayModel) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.EZpvd = c44995shT;
                this.OLrzqt = transactionDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    C45363soQ.onSessionIdEvent$default("SupportCenter_Transaction_LandingPage_Click", false, new ActionBar(this.OLrzqt), 1, null);
                    ActionBar actionBar = this.EZpvd.AEQbTJ;
                    if (actionBar != null) {
                        actionBar.EZpvd(this.OLrzqt);
                    }
                }
            }
        }
    }
}
