package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.okex.center.bean.RecommendationCard;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C45001shZ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.shZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45001shZ extends AbstractC45381soi<RecommendCardDisplayModel, StateListAnimator> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public Activity OLrzqt;
    public java.util.List<RecommendCardDisplayModel.CommonDisplayModel> EZpvd = new java.util.ArrayList();
    public java.util.List<RecommendCardDisplayModel.VideoMeetingCardDisplayModel> AEQbTJ = new java.util.ArrayList();

    /* JADX INFO: renamed from: o.shZ$Activity */
    public interface Activity {
        void OLrzqt(@NotNull SelfServiceToolBean selfServiceToolBean, java.lang.Object obj);

        void OLrzqt(@NotNull RecommendCardDisplayModel.VideoMeetingCardDisplayModel videoMeetingCardDisplayModel);

        void copydefault(int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX INFO: renamed from: o.shZ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.shZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.shZ$StateListAnimator */
    public static abstract class StateListAnimator extends RecyclerView.ViewHolder {
        public abstract void AEQbTJ(@NotNull RecommendCardDisplayModel recommendCardDisplayModel);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    public final void KWHzl(@NotNull java.util.List<RecommendCardDisplayModel.CommonDisplayModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!C33129mqd.KWHzl((java.util.Collection) this.AEQbTJ)) {
            arrayList.addAll(this.EZpvd);
        } else {
            java.util.List<RecommendCardDisplayModel.VideoMeetingCardDisplayModel> list = this.AEQbTJ;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((RecommendCardDisplayModel.VideoMeetingCardDisplayModel) obj).isOngoing()) {
                    arrayList2.add(obj);
                }
            }
            java.util.List<RecommendCardDisplayModel.VideoMeetingCardDisplayModel> list2 = this.AEQbTJ;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (!((RecommendCardDisplayModel.VideoMeetingCardDisplayModel) obj2).isOngoing()) {
                    arrayList3.add(obj2);
                }
            }
            arrayList.addAll(arrayList2);
            arrayList.addAll(this.EZpvd);
            arrayList.addAll(arrayList3);
        }
        Activity activity = this.OLrzqt;
        if (activity != null) {
            activity.copydefault(arrayList.size());
        }
        AEQbTJ(arrayList);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    public boolean KWHzl(@NotNull RecommendCardDisplayModel recommendCardDisplayModel, @NotNull RecommendCardDisplayModel recommendCardDisplayModel2) {
        Intrinsics.checkNotNullParameter(recommendCardDisplayModel, "");
        Intrinsics.checkNotNullParameter(recommendCardDisplayModel2, "");
        if ((recommendCardDisplayModel instanceof RecommendCardDisplayModel.CommonDisplayModel) && (recommendCardDisplayModel2 instanceof RecommendCardDisplayModel.CommonDisplayModel)) {
            return Intrinsics.EZpvd((java.lang.Object) ((RecommendCardDisplayModel.CommonDisplayModel) recommendCardDisplayModel).getSourceBean().getId(), (java.lang.Object) ((RecommendCardDisplayModel.CommonDisplayModel) recommendCardDisplayModel2).getSourceBean().getId());
        }
        if ((recommendCardDisplayModel instanceof RecommendCardDisplayModel.VideoMeetingCardDisplayModel) && (recommendCardDisplayModel2 instanceof RecommendCardDisplayModel.VideoMeetingCardDisplayModel)) {
            return Intrinsics.EZpvd((java.lang.Object) ((RecommendCardDisplayModel.VideoMeetingCardDisplayModel) recommendCardDisplayModel).getId(), (java.lang.Object) ((RecommendCardDisplayModel.VideoMeetingCardDisplayModel) recommendCardDisplayModel2).getId());
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    public boolean copydefault(@NotNull RecommendCardDisplayModel recommendCardDisplayModel, @NotNull RecommendCardDisplayModel recommendCardDisplayModel2) {
        Intrinsics.checkNotNullParameter(recommendCardDisplayModel, "");
        Intrinsics.checkNotNullParameter(recommendCardDisplayModel2, "");
        if ((recommendCardDisplayModel instanceof RecommendCardDisplayModel.CommonDisplayModel) && (recommendCardDisplayModel2 instanceof RecommendCardDisplayModel.CommonDisplayModel)) {
            RecommendationCard sourceBean = ((RecommendCardDisplayModel.CommonDisplayModel) recommendCardDisplayModel).getSourceBean();
            RecommendationCard sourceBean2 = ((RecommendCardDisplayModel.CommonDisplayModel) recommendCardDisplayModel2).getSourceBean();
            if (Intrinsics.EZpvd((java.lang.Object) sourceBean.getId(), (java.lang.Object) sourceBean2.getId()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getDataTrackingKey(), (java.lang.Object) sourceBean2.getDataTrackingKey()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getIconBright(), (java.lang.Object) sourceBean2.getIconBright()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getIconDark(), (java.lang.Object) sourceBean2.getIconDark()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getScenario(), (java.lang.Object) sourceBean2.getScenario()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getSlug(), (java.lang.Object) sourceBean2.getSlug()) && Intrinsics.EZpvd(sourceBean.getTags(), sourceBean2.getTags()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getTitle(), (java.lang.Object) sourceBean2.getTitle()) && Intrinsics.EZpvd((java.lang.Object) sourceBean.getTitleListMode(), (java.lang.Object) sourceBean2.getTitleListMode())) {
                return true;
            }
        } else if ((recommendCardDisplayModel instanceof RecommendCardDisplayModel.VideoMeetingCardDisplayModel) && (recommendCardDisplayModel2 instanceof RecommendCardDisplayModel.VideoMeetingCardDisplayModel)) {
            return Intrinsics.EZpvd(recommendCardDisplayModel, recommendCardDisplayModel2);
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (2 == i) {
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C45149skO c45149skO = new C45149skO(context, null, 0, 6, null);
            c45149skO.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            return new ActionBar(this, c45149skO);
        }
        android.content.Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C45148skN c45148skN = new C45148skN(context2, null, 0, 6, null);
        c45148skN.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        return new Application(this, c45148skN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return copydefault().getCurrentList().get(i) instanceof RecommendCardDisplayModel.CommonDisplayModel ? 1 : 2;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        RecommendCardDisplayModel recommendCardDisplayModel = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(recommendCardDisplayModel, "");
        stateListAnimator.AEQbTJ(recommendCardDisplayModel);
    }

    public final void EZpvd() {
        Activity activity = this.OLrzqt;
        if (activity != null) {
            activity.copydefault(getItemCount());
        }
    }

    public final RecommendCardDisplayModel EZpvd(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return copydefault().getCurrentList().get(i);
    }

    /* JADX INFO: renamed from: o.shZ$Application */
    public final class Application extends StateListAnimator {
        public final /* synthetic */ C45001shZ AEQbTJ;
        public final C45148skN copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C45001shZ c45001shZ, C45148skN c45148skN) {
            super(c45148skN);
            Intrinsics.checkNotNullParameter(c45148skN, "");
            this.AEQbTJ = c45001shZ;
            this.copydefault = c45148skN;
        }

        @Override // o.C45001shZ.StateListAnimator
        public void AEQbTJ(@NotNull final RecommendCardDisplayModel recommendCardDisplayModel) {
            Intrinsics.checkNotNullParameter(recommendCardDisplayModel, "");
            int iOLrzqt = this.AEQbTJ.getItemCount() <= 1 ? -1 : (int) (C33097mpy.OLrzqt(C32979mnm.EZpvd.OLrzqt()) * 0.75f);
            ConstraintLayout constraintLayoutKWHzl = this.copydefault.KWHzl();
            ViewGroup.LayoutParams layoutParams = constraintLayoutKWHzl.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iOLrzqt;
                layoutParams.height = -1;
                constraintLayoutKWHzl.setLayoutParams(layoutParams);
                C45148skN c45148skN = this.copydefault;
                final C45001shZ c45001shZ = this.AEQbTJ;
                if (recommendCardDisplayModel instanceof RecommendCardDisplayModel.CommonDisplayModel) {
                    RecommendCardDisplayModel.CommonDisplayModel commonDisplayModel = (RecommendCardDisplayModel.CommonDisplayModel) recommendCardDisplayModel;
                    Glide.KWHzl(c45148skN).EZpvd(commonDisplayModel.getIconUrl()).EZpvd(c45148skN.EZpvd());
                    c45148skN.AYXKKw().setText(commonDisplayModel.getLabel());
                    RecommendCardDisplayModel.CommonDisplayModel.CardTag statusTag = commonDisplayModel.getStatusTag();
                    c45148skN.OLrzqt().setVisibility(statusTag == null ? 8 : 0);
                    if (statusTag != null) {
                        c45148skN.setTagStatus(statusTag.getText(), java.lang.Integer.valueOf(statusTag.getTagStyle()));
                    }
                    c45148skN.djBIcL().setText(commonDisplayModel.getTitle());
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) commonDisplayModel.getAmount())) {
                        c45148skN.AEQbTJ().setVisibility(0);
                        c45148skN.AEQbTJ().setText(commonDisplayModel.getAmount());
                    } else {
                        c45148skN.AEQbTJ().setVisibility(8);
                    }
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) commonDisplayModel.getDescribe())) {
                        c45148skN.gEmmrt().setVisibility(0);
                        c45148skN.gEmmrt().setText(commonDisplayModel.getDescribe());
                    } else {
                        c45148skN.gEmmrt().setVisibility(8);
                    }
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) commonDisplayModel.getIdNumber())) {
                        c45148skN.AhwBna().setVisibility(0);
                        android.widget.TextView textViewAhwBna = c45148skN.AhwBna();
                        int color = textViewAhwBna.getContext().getColor(C52761wXj.Activity.DCUTEIddSDPG);
                        java.lang.String idNumber = commonDisplayModel.getIdNumber();
                        Intrinsics.copydefault((java.lang.Object) idNumber);
                        textViewAhwBna.setText(OLrzqt(idNumber, color, new Function0() { // from class: o.shW
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C45001shZ.Application.copydefault(recommendCardDisplayModel, c45001shZ);
                            }
                        }));
                        textViewAhwBna.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                        textViewAhwBna.setHighlightColor(0);
                        C45148skN c45148skN2 = this.copydefault;
                        c45148skN2.setOnClickListener(new ActionBar(c45148skN2, 1000L, recommendCardDisplayModel, c45001shZ));
                    } else {
                        c45148skN.AhwBna().setVisibility(8);
                    }
                    if (commonDisplayModel.getCreateData() != null) {
                        c45148skN.valueOf().setVisibility(0);
                        c45148skN.valueOf().setText(pTA.formatDate$default(new Date(commonDisplayModel.getCreateData().longValue()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null));
                    } else {
                        c45148skN.valueOf().setVisibility(8);
                    }
                    C52794wYp c52794wYpCopydefault = c45148skN.copydefault();
                    SelfServiceDisplayModel selfServiceItem = commonDisplayModel.getSelfServiceItem();
                    if (selfServiceItem != null) {
                        c52794wYpCopydefault.setText(selfServiceItem.getTitle());
                        c52794wYpCopydefault.setVisibility(0);
                        c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, recommendCardDisplayModel, selfServiceItem, c45001shZ));
                        return;
                    }
                    c52794wYpCopydefault.setVisibility(8);
                    return;
                }
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }

        /* JADX INFO: renamed from: o.shZ$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C45001shZ EZpvd;
            public final /* synthetic */ RecommendCardDisplayModel KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, RecommendCardDisplayModel recommendCardDisplayModel, C45001shZ c45001shZ) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.KWHzl = recommendCardDisplayModel;
                this.EZpvd = c45001shZ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                TransactionDisplayModel transactionDisplayModel$default;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C44901sff c44901sff = C44901sff.copydefault;
                    java.lang.String scenario = ((RecommendCardDisplayModel.CommonDisplayModel) this.KWHzl).getSourceBean().getScenario();
                    if (scenario == null) {
                        scenario = "";
                    }
                    java.lang.String dataTrackingKey = ((RecommendCardDisplayModel.CommonDisplayModel) this.KWHzl).getSourceBean().getDataTrackingKey();
                    if (dataTrackingKey == null) {
                        dataTrackingKey = "";
                    }
                    RecommendCardDisplayModel.CommonDisplayModel.CardTag statusTag = ((RecommendCardDisplayModel.CommonDisplayModel) this.KWHzl).getStatusTag();
                    java.lang.Object objKWHzl = null;
                    java.lang.String text = statusTag != null ? statusTag.getText() : null;
                    if (text == null) {
                        text = "";
                    }
                    C44901sff.eventOnRecommendationCardClicked$default(c44901sff, scenario, dataTrackingKey, text, "entire_card", null, 16, null);
                    SelfServiceToolBean primaryAction = ((RecommendCardDisplayModel.CommonDisplayModel) this.KWHzl).getPrimaryAction();
                    if (primaryAction != null) {
                        TransactionBean transactionBean = ((RecommendCardDisplayModel.CommonDisplayModel) this.KWHzl).getTransactionBean();
                        if (transactionBean != null && (transactionDisplayModel$default = C45073sis.toTransactionDisplayModel$default(transactionBean, null, null, 3, null)) != null) {
                            objKWHzl = C45073sis.KWHzl(transactionDisplayModel$default, primaryAction);
                        }
                        Activity activity = this.EZpvd.OLrzqt;
                        if (activity != null) {
                            activity.OLrzqt(primaryAction, objKWHzl);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.shZ$Application$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ C45001shZ KWHzl;
            public final /* synthetic */ SelfServiceDisplayModel OLrzqt;
            public final /* synthetic */ RecommendCardDisplayModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, RecommendCardDisplayModel recommendCardDisplayModel, SelfServiceDisplayModel selfServiceDisplayModel, C45001shZ c45001shZ) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.copydefault = recommendCardDisplayModel;
                this.OLrzqt = selfServiceDisplayModel;
                this.KWHzl = c45001shZ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                TransactionDisplayModel transactionDisplayModel$default;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C44901sff c44901sff = C44901sff.copydefault;
                    java.lang.String scenario = ((RecommendCardDisplayModel.CommonDisplayModel) this.copydefault).getSourceBean().getScenario();
                    if (scenario == null) {
                        scenario = "";
                    }
                    java.lang.String dataTrackingKey = ((RecommendCardDisplayModel.CommonDisplayModel) this.copydefault).getSourceBean().getDataTrackingKey();
                    if (dataTrackingKey == null) {
                        dataTrackingKey = "";
                    }
                    RecommendCardDisplayModel.CommonDisplayModel.CardTag statusTag = ((RecommendCardDisplayModel.CommonDisplayModel) this.copydefault).getStatusTag();
                    java.lang.Object objKWHzl = null;
                    java.lang.String text = statusTag != null ? statusTag.getText() : null;
                    if (text == null) {
                        text = "";
                    }
                    c44901sff.KWHzl(scenario, dataTrackingKey, text, "cta_button", this.OLrzqt.getSourceBean().getDataTrackingKey());
                    TransactionBean transactionBean = ((RecommendCardDisplayModel.CommonDisplayModel) this.copydefault).getTransactionBean();
                    if (transactionBean != null && (transactionDisplayModel$default = C45073sis.toTransactionDisplayModel$default(transactionBean, null, null, 3, null)) != null) {
                        objKWHzl = C45073sis.KWHzl(transactionDisplayModel$default, this.OLrzqt.getSourceBean());
                    }
                    Activity activity = this.KWHzl.OLrzqt;
                    if (activity != null) {
                        activity.OLrzqt(this.OLrzqt.getSourceBean(), objKWHzl);
                    }
                }
            }
        }

        public static final Unit copydefault(RecommendCardDisplayModel recommendCardDisplayModel, C45001shZ c45001shZ) {
            TransactionDisplayModel transactionDisplayModel$default;
            C44901sff c44901sff = C44901sff.copydefault;
            RecommendCardDisplayModel.CommonDisplayModel commonDisplayModel = (RecommendCardDisplayModel.CommonDisplayModel) recommendCardDisplayModel;
            java.lang.String scenario = commonDisplayModel.getSourceBean().getScenario();
            if (scenario == null) {
                scenario = "";
            }
            java.lang.String dataTrackingKey = commonDisplayModel.getSourceBean().getDataTrackingKey();
            if (dataTrackingKey == null) {
                dataTrackingKey = "";
            }
            RecommendCardDisplayModel.CommonDisplayModel.CardTag statusTag = commonDisplayModel.getStatusTag();
            java.lang.Object objKWHzl = null;
            java.lang.String text = statusTag != null ? statusTag.getText() : null;
            if (text == null) {
                text = "";
            }
            C44901sff.eventOnRecommendationCardClicked$default(c44901sff, scenario, dataTrackingKey, text, "transaction_id", null, 16, null);
            SelfServiceToolBean primaryAction = commonDisplayModel.getPrimaryAction();
            if (primaryAction != null) {
                TransactionBean transactionBean = commonDisplayModel.getTransactionBean();
                if (transactionBean != null && (transactionDisplayModel$default = C45073sis.toTransactionDisplayModel$default(transactionBean, null, null, 3, null)) != null) {
                    objKWHzl = C45073sis.KWHzl(transactionDisplayModel$default, primaryAction);
                }
                Activity activity = c45001shZ.OLrzqt;
                if (activity != null) {
                    activity.OLrzqt(primaryAction, objKWHzl);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.shZ$Application$Application, reason: collision with other inner class name */
        public static final class C0945Application extends android.text.style.ClickableSpan {
            public final /* synthetic */ int EZpvd;
            public final /* synthetic */ Function0<Unit> OLrzqt;

            public C0945Application(Function0<Unit> function0, int i) {
                this.OLrzqt = function0;
                this.EZpvd = i;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                this.OLrzqt.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(android.text.TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "");
                textPaint.setColor(this.EZpvd);
                textPaint.setUnderlineText(true);
                if (Build.VERSION.SDK_INT >= 29) {
                    textPaint.underlineColor = this.EZpvd;
                } else {
                    textPaint.setShadowLayer(1.0f, 0.0f, 1.0f, this.EZpvd);
                }
            }
        }

        public final java.lang.CharSequence OLrzqt(java.lang.String str, final int i, final Function0<Unit> function0) {
            return C33061mpO.setupSpanStyles$default(new android.text.SpannableString(str), new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.shX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45001shZ.Application.copydefault(function0, i, (java.util.List) obj);
                }
            }, 14, null);
        }

        public static final Unit copydefault(Function0 function0, int i, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new C0945Application(function0, i));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.shZ$ActionBar */
    public final class ActionBar extends StateListAnimator {
        public final /* synthetic */ C45001shZ AEQbTJ;
        public final C45149skO copydefault;

        /* JADX INFO: renamed from: o.shZ$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C45001shZ EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ RecommendCardDisplayModel OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, RecommendCardDisplayModel recommendCardDisplayModel, C45001shZ c45001shZ) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.OLrzqt = recommendCardDisplayModel;
                this.EZpvd = c45001shZ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C44901sff c44901sff = C44901sff.copydefault;
                    java.lang.String tagText = ((RecommendCardDisplayModel.VideoMeetingCardDisplayModel) this.OLrzqt).getTagText();
                    if (tagText == null) {
                        tagText = "";
                    }
                    c44901sff.KWHzl("", "", tagText, "cta_button", "");
                    Activity activity = this.EZpvd.OLrzqt;
                    if (activity != null) {
                        activity.OLrzqt((RecommendCardDisplayModel.VideoMeetingCardDisplayModel) this.OLrzqt);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C45001shZ c45001shZ, C45149skO c45149skO) {
            super(c45149skO);
            Intrinsics.checkNotNullParameter(c45149skO, "");
            this.AEQbTJ = c45001shZ;
            this.copydefault = c45149skO;
        }

        @Override // o.C45001shZ.StateListAnimator
        public void AEQbTJ(@NotNull RecommendCardDisplayModel recommendCardDisplayModel) {
            Intrinsics.checkNotNullParameter(recommendCardDisplayModel, "");
            int iOLrzqt = this.AEQbTJ.getItemCount() <= 1 ? -1 : (int) (C33097mpy.OLrzqt(C32979mnm.EZpvd.OLrzqt()) * 0.75f);
            ConstraintLayout constraintLayoutOLrzqt = this.copydefault.OLrzqt();
            ViewGroup.LayoutParams layoutParams = constraintLayoutOLrzqt.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iOLrzqt;
                layoutParams.height = -1;
                constraintLayoutOLrzqt.setLayoutParams(layoutParams);
                if (recommendCardDisplayModel instanceof RecommendCardDisplayModel.VideoMeetingCardDisplayModel) {
                    C45149skO c45149skO = this.copydefault;
                    C45001shZ c45001shZ = this.AEQbTJ;
                    RecommendCardDisplayModel.VideoMeetingCardDisplayModel videoMeetingCardDisplayModel = (RecommendCardDisplayModel.VideoMeetingCardDisplayModel) recommendCardDisplayModel;
                    c45149skO.KWHzl().setText(videoMeetingCardDisplayModel.getTitle());
                    c45149skO.AEQbTJ().setText(videoMeetingCardDisplayModel.getDescribe());
                    c45149skO.setServiceIcon(videoMeetingCardDisplayModel.getIcon());
                    c45149skO.setTagProperties(videoMeetingCardDisplayModel.getTagText(), videoMeetingCardDisplayModel.getTagStyle());
                    c45149skO.AhwBna().setText(videoMeetingCardDisplayModel.getCtaButtonText());
                    c45149skO.AhwBna().setEnabled(videoMeetingCardDisplayModel.isCtaButtonClickable());
                    C52794wYp c52794wYpAhwBna = c45149skO.AhwBna();
                    c52794wYpAhwBna.setOnClickListener(new Activity(c52794wYpAhwBna, 1000L, recommendCardDisplayModel, c45001shZ));
                    return;
                }
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
