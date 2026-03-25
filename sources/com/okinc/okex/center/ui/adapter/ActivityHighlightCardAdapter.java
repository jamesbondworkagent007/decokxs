package com.okinc.okex.center.ui.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.HighlightBean;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter;
import com.okinc.okex.center.ui.displaymodels.HighlightArticleDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC45384sol;
import o.AbstractC47447tqH;
import o.AbstractC47460tqU;
import o.AbstractC47483tqr;
import o.AbstractC47488tqw;
import o.AbstractC5449Sd;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C45363soQ;
import o.C47315tni;
import o.C52761wXj;
import o.C55251xgS;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56444yFp;
import o.C56529yIt;
import o.InterfaceC5460So;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ActivityHighlightCardAdapter extends AbstractC45384sol<RecyclerView.ViewHolder> {
    public boolean AEQbTJ;
    public TaskDescription EZpvd;
    public final boolean OLrzqt;
    public StateListAnimator copydefault;

    public interface StateListAnimator {
        void EZpvd(@NotNull String str, @NotNull TransactionType transactionType);

        void copydefault(SelfServiceToolBean selfServiceToolBean);
    }

    public static abstract class TaskDescription {
        public static final int $stable = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivityHighlightCardAdapter() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault = stateListAnimator;
    }

    public ActivityHighlightCardAdapter(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:33) call: com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter.<init>(boolean):void type: THIS */
    public /* synthetic */ ActivityHighlightCardAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HighlightType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ HighlightType[] $VALUES;
        public static final HighlightType TRANSACTION_DETAILS = new HighlightType("TRANSACTION_DETAILS", 0);
        public static final HighlightType ARTICLE = new HighlightType("ARTICLE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ HighlightType[] $values() {
            return new HighlightType[]{TRANSACTION_DETAILS, ARTICLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<HighlightType> getEntries() {
            return $ENTRIES;
        }

        private HighlightType(String str, int i) {
        }

        static {
            HighlightType[] highlightTypeArr$values = $values();
            $VALUES = highlightTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(highlightTypeArr$values);
        }

        public static HighlightType valueOf(String str) {
            return (HighlightType) Enum.valueOf(HighlightType.class, str);
        }

        public static HighlightType[] values() {
            return (HighlightType[]) $VALUES.clone();
        }
    }

    public final void AEQbTJ(TaskDescription taskDescription) {
        if (Intrinsics.EZpvd(this.EZpvd, taskDescription)) {
            return;
        }
        this.EZpvd = taskDescription;
        notifyItemChanged(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == HighlightType.TRANSACTION_DETAILS.ordinal()) {
            AbstractC47447tqH abstractC47447tqHKWHzl = AbstractC47447tqH.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47447tqHKWHzl, "");
            return new ActionBar(this, abstractC47447tqHKWHzl);
        }
        if (i != HighlightType.ARTICLE.ordinal()) {
            throw new IllegalArgumentException("Invalid viewType: " + i);
        }
        if (this.OLrzqt) {
            AbstractC47488tqw abstractC47488tqwCopydefault = AbstractC47488tqw.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47488tqwCopydefault, "");
            return new Application(this, abstractC47488tqwCopydefault);
        }
        AbstractC47483tqr abstractC47483tqrOLrzqt = AbstractC47483tqr.OLrzqt(layoutInflaterFrom, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47483tqrOLrzqt, "");
        return new Activity(this, abstractC47483tqrOLrzqt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) throws Exception {
        TaskDescription taskDescription = this.EZpvd;
        if (taskDescription instanceof TransactionDisplayModel) {
            return HighlightType.TRANSACTION_DETAILS.ordinal();
        }
        if (taskDescription instanceof HighlightArticleDisplayModel) {
            return HighlightType.ARTICLE.ordinal();
        }
        throw new Exception("Unrecognised display model: " + taskDescription);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof ActionBar) {
            ((ActionBar) viewHolder).AEQbTJ();
        } else if (viewHolder instanceof Activity) {
            ((Activity) viewHolder).AEQbTJ();
        } else if (viewHolder instanceof Application) {
            ((Application) viewHolder).AEQbTJ();
        }
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ ActivityHighlightCardAdapter AEQbTJ;
        public final InterfaceC56387yDm EZpvd;
        public final AbstractC47447tqH OLrzqt;

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TransactionType.values().length];
                try {
                    iArr[TransactionType.P2P.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ActivityHighlightCardAdapter activityHighlightCardAdapter, AbstractC47447tqH abstractC47447tqH) {
            super(abstractC47447tqH.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47447tqH, "");
            this.AEQbTJ = activityHighlightCardAdapter;
            this.OLrzqt = abstractC47447tqH;
            this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.shN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityHighlightCardAdapter.ActionBar.AEQbTJ(this.OLrzqt);
                }
            });
        }

        private final LayoutInflater copydefault() {
            return (LayoutInflater) this.EZpvd.getValue();
        }

        public static final LayoutInflater AEQbTJ(ActionBar actionBar) {
            return LayoutInflater.from(actionBar.OLrzqt.getRoot().getContext());
        }

        public final void AEQbTJ() {
            String contextualCause;
            TaskDescription taskDescriptionOLrzqt = this.AEQbTJ.OLrzqt();
            TransactionDisplayModel transactionDisplayModel = taskDescriptionOLrzqt instanceof TransactionDisplayModel ? (TransactionDisplayModel) taskDescriptionOLrzqt : null;
            if (transactionDisplayModel != null) {
                ActivityHighlightCardAdapter activityHighlightCardAdapter = this.AEQbTJ;
                AbstractC47447tqH abstractC47447tqH = this.OLrzqt;
                TextView textView = abstractC47447tqH.KWHzl;
                if (Activity.AEQbTJ[transactionDisplayModel.getTransactionType().ordinal()] == 1) {
                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                    Object[] objArr = new Object[2];
                    Integer displayStringResId = transactionDisplayModel.getTransactionType().getDisplayStringResId();
                    objArr[0] = displayStringResId != null ? C33070mpX.AYXKKw(displayStringResId.intValue()) : null;
                    objArr[1] = transactionDisplayModel.getContextualCause();
                    contextualCause = String.format("%s - %s", Arrays.copyOf(objArr, 2));
                    Intrinsics.checkNotNullExpressionValue(contextualCause, "");
                } else {
                    contextualCause = transactionDisplayModel.getContextualCause();
                }
                textView.setText(contextualCause);
                EZpvd(transactionDisplayModel.getContextualIconUrl());
                abstractC47447tqH.gEmmrt.setText(transactionDisplayModel.getDisplayAmountHeader());
                abstractC47447tqH.gEmmrt.setEnabled(transactionDisplayModel.getDisplayAmountFullColour());
                C55251xgS c55251xgS = abstractC47447tqH.djBIcL;
                HighlightBean highlightBean = transactionDisplayModel.getHighlightBean();
                c55251xgS.setOKDSStyle(C33129mqd.OLrzqt((CharSequence) (highlightBean != null ? highlightBean.getLabel() : null)) ? 9 : 0);
                c55251xgS.setText(transactionDisplayModel.getDisplayTransactionTag());
                Intrinsics.copydefault(c55251xgS);
                c55251xgS.setVisibility(StringsKt__StringsKt.fARcdN((CharSequence) transactionDisplayModel.getDisplayTransactionTag()) ^ true ? 0 : 8);
                TextView textView2 = abstractC47447tqH.valueOf;
                textView2.setText(transactionDisplayModel.getDisplayStatus());
                HighlightBean highlightBean2 = transactionDisplayModel.getHighlightBean();
                textView2.setTextColor(C33070mpX.copydefault(C33129mqd.OLrzqt((CharSequence) (highlightBean2 != null ? highlightBean2.getStatus() : null)) ? C52761wXj.Activity.DQzvGN : C52761wXj.Activity.DCUTEIddSDPG));
                abstractC47447tqH.AkhnZx.setText(transactionDisplayModel.getDisplayDescription());
                TextView textView3 = abstractC47447tqH.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(StringsKt__StringsKt.fARcdN((CharSequence) transactionDisplayModel.getDisplayDescription()) ^ true ? 0 : 8);
                abstractC47447tqH.values.setText(transactionDisplayModel.getDisplayDateTime());
                TextView textView4 = abstractC47447tqH.copydefault;
                textView4.setOnClickListener(new Application(textView4, 1000L, activityHighlightCardAdapter, transactionDisplayModel));
                KWHzl(transactionDisplayModel.getTransactionBanners());
                LinearLayout linearLayout = abstractC47447tqH.AhwBna;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                activityHighlightCardAdapter.OLrzqt(linearLayout.getVisibility() == 0);
            }
        }

        public final void KWHzl(List<TransactionBannerDisplayModel> list) {
            AbstractC47447tqH abstractC47447tqH = this.OLrzqt;
            abstractC47447tqH.AhwBna.removeAllViews();
            LinearLayout linearLayout = abstractC47447tqH.AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(list.isEmpty() ^ true ? 0 : 8);
            for (TransactionBannerDisplayModel transactionBannerDisplayModel : list) {
                AbstractC47460tqU abstractC47460tqUAEQbTJ = AbstractC47460tqU.AEQbTJ(copydefault(), abstractC47447tqH.AhwBna, false);
                Intrinsics.checkNotNullExpressionValue(abstractC47460tqUAEQbTJ, "");
                TextView textView = abstractC47460tqUAEQbTJ.KWHzl;
                Intrinsics.copydefault(textView);
                textView.setVisibility(StringsKt__StringsKt.fARcdN((CharSequence) transactionBannerDisplayModel.getBannerTitle()) ^ true ? 0 : 8);
                textView.setText(transactionBannerDisplayModel.getBannerTitle());
                TextView textView2 = abstractC47460tqUAEQbTJ.copydefault;
                Intrinsics.copydefault(textView2);
                textView2.setVisibility(StringsKt__StringsKt.fARcdN((CharSequence) transactionBannerDisplayModel.getBannerDetails()) ^ true ? 0 : 8);
                textView2.setText(transactionBannerDisplayModel.getBannerDetails());
                if (transactionBannerDisplayModel.getWithdrawRelease() != null && (!StringsKt__StringsKt.fARcdN((CharSequence) r7))) {
                    abstractC47460tqUAEQbTJ.OLrzqt.setText(C33069mpW.copydefault(C47315tni.PendingIntent.ihnvzI, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", transactionBannerDisplayModel.getWithdrawRelease()))));
                    TextView textView3 = abstractC47460tqUAEQbTJ.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setVisibility(0);
                } else {
                    TextView textView4 = abstractC47460tqUAEQbTJ.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    textView4.setVisibility(8);
                }
                abstractC47447tqH.AhwBna.addView(abstractC47460tqUAEQbTJ.getRoot());
            }
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ ActivityHighlightCardAdapter EZpvd;
            public final /* synthetic */ TransactionDisplayModel OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(View view, long j, ActivityHighlightCardAdapter activityHighlightCardAdapter, TransactionDisplayModel transactionDisplayModel) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.EZpvd = activityHighlightCardAdapter;
                this.OLrzqt = transactionDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    StateListAnimator stateListAnimator = this.EZpvd.copydefault;
                    if (stateListAnimator != null) {
                        stateListAnimator.EZpvd(this.OLrzqt.getId(), this.OLrzqt.getTransactionType());
                    }
                }
            }
        }

        public final void EZpvd(String str) {
            if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
                AbstractC47447tqH abstractC47447tqH = this.OLrzqt;
            }
        }

        public static final class TaskDescription extends AbstractC5449Sd<Drawable> {
            public final /* synthetic */ AbstractC47447tqH KWHzl;

            @Override // o.InterfaceC5462Sq
            public void a_(Drawable drawable) {
            }

            public TaskDescription(AbstractC47447tqH abstractC47447tqH) {
                this.KWHzl = abstractC47447tqH;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
            @Override // o.InterfaceC5462Sq
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void copydefault(Drawable drawable, InterfaceC5460So<? super Drawable> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(drawable, "");
                TextView textView = this.KWHzl.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (!C55296xhK.AEQbTJ(textView)) {
                    this.KWHzl.KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    this.KWHzl.KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        }
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ ActivityHighlightCardAdapter KWHzl;
        public final AbstractC47483tqr OLrzqt;

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ HighlightArticleDisplayModel AEQbTJ;
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ ActivityHighlightCardAdapter KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, ActivityHighlightCardAdapter activityHighlightCardAdapter, HighlightArticleDisplayModel highlightArticleDisplayModel) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.KWHzl = activityHighlightCardAdapter;
                this.AEQbTJ = highlightArticleDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    StateListAnimator stateListAnimator = this.KWHzl.copydefault;
                    if (stateListAnimator != null) {
                        stateListAnimator.copydefault(this.AEQbTJ.getSelfServiceTool());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ActivityHighlightCardAdapter activityHighlightCardAdapter, AbstractC47483tqr abstractC47483tqr) {
            super(abstractC47483tqr.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47483tqr, "");
            this.KWHzl = activityHighlightCardAdapter;
            this.OLrzqt = abstractC47483tqr;
        }

        public final void AEQbTJ() {
            TaskDescription taskDescriptionOLrzqt = this.KWHzl.OLrzqt();
            HighlightArticleDisplayModel highlightArticleDisplayModel = taskDescriptionOLrzqt instanceof HighlightArticleDisplayModel ? (HighlightArticleDisplayModel) taskDescriptionOLrzqt : null;
            if (highlightArticleDisplayModel != null) {
                ActivityHighlightCardAdapter activityHighlightCardAdapter = this.KWHzl;
                AbstractC47483tqr abstractC47483tqr = this.OLrzqt;
                abstractC47483tqr.copydefault.setText(highlightArticleDisplayModel.getTitle());
                abstractC47483tqr.EZpvd.setText(highlightArticleDisplayModel.getDescription());
                View root = abstractC47483tqr.getRoot();
                root.setOnClickListener(new TaskDescription(root, 1000L, activityHighlightCardAdapter, highlightArticleDisplayModel));
            }
        }
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final AbstractC47488tqw EZpvd;
        public final /* synthetic */ ActivityHighlightCardAdapter copydefault;

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ ActivityHighlightCardAdapter AEQbTJ;
            public final /* synthetic */ HighlightArticleDisplayModel EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, ActivityHighlightCardAdapter activityHighlightCardAdapter, HighlightArticleDisplayModel highlightArticleDisplayModel) {
                this.OLrzqt = view;
                this.KWHzl = j;
                this.AEQbTJ = activityHighlightCardAdapter;
                this.EZpvd = highlightArticleDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    StateListAnimator stateListAnimator = this.AEQbTJ.copydefault;
                    if (stateListAnimator != null) {
                        stateListAnimator.copydefault(this.EZpvd.getSelfServiceTool());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ActivityHighlightCardAdapter activityHighlightCardAdapter, AbstractC47488tqw abstractC47488tqw) {
            super(abstractC47488tqw.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47488tqw, "");
            this.copydefault = activityHighlightCardAdapter;
            this.EZpvd = abstractC47488tqw;
        }

        public final void AEQbTJ() {
            TaskDescription taskDescriptionOLrzqt = this.copydefault.OLrzqt();
            HighlightArticleDisplayModel highlightArticleDisplayModel = taskDescriptionOLrzqt instanceof HighlightArticleDisplayModel ? (HighlightArticleDisplayModel) taskDescriptionOLrzqt : null;
            if (highlightArticleDisplayModel != null) {
                ActivityHighlightCardAdapter activityHighlightCardAdapter = this.copydefault;
                AbstractC47488tqw abstractC47488tqw = this.EZpvd;
                abstractC47488tqw.KWHzl.setText(highlightArticleDisplayModel.getTitle());
                abstractC47488tqw.OLrzqt.setText(highlightArticleDisplayModel.getDescription());
                View root = abstractC47488tqw.getRoot();
                root.setOnClickListener(new TaskDescription(root, 1000L, activityHighlightCardAdapter, highlightArticleDisplayModel));
            }
        }
    }

    public final void OLrzqt(final boolean z) {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        C45363soQ.onSessionIdEvent$default("SupportCenter_Transaction_IntegratedSolutionPage_View", false, new Function1() { // from class: o.shP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityHighlightCardAdapter.AEQbTJ(z, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "result_card", z ? "yes" : "no", false, 4, null);
        return Unit.INSTANCE;
    }
}
