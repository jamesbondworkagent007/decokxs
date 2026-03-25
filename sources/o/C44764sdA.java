package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C47315tni;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sdA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44764sdA extends AbstractC45381soi<CampaignDisplayModel, StateListAnimator> {
    public static final Application Companion = new Application(null);
    public final Function1<CampaignDisplayModel, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okex.campaign.ui.displaymodels.CampaignDisplayModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C44764sdA(@NotNull Function1<? super CampaignDisplayModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.sdA$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C44764sdA AEQbTJ;
        public final AbstractC47427tpo KWHzl;

        /* JADX INFO: renamed from: o.sdA$StateListAnimator$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[CampaignStatus.values().length];
                try {
                    iArr[CampaignStatus.ENDED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[CampaignStatus.ONGOING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C44764sdA c44764sdA, AbstractC47427tpo abstractC47427tpo) {
            super(abstractC47427tpo.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47427tpo, "");
            this.AEQbTJ = c44764sdA;
            this.KWHzl = abstractC47427tpo;
        }

        public final void OLrzqt(@NotNull CampaignDisplayModel campaignDisplayModel) {
            Intrinsics.checkNotNullParameter(campaignDisplayModel, "");
            AbstractC47427tpo abstractC47427tpo = this.KWHzl;
            C44764sdA c44764sdA = this.AEQbTJ;
            abstractC47427tpo.EZpvd.setText(campaignDisplayModel.getTitle());
            android.widget.TextView textView = abstractC47427tpo.AEQbTJ;
            android.content.Context context = abstractC47427tpo.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(EZpvd(campaignDisplayModel, context));
            android.view.View root = abstractC47427tpo.getRoot();
            root.setOnClickListener(new Activity(root, 1000L, c44764sdA, campaignDisplayModel));
        }

        public final java.lang.String EZpvd(CampaignDisplayModel campaignDisplayModel, android.content.Context context) {
            Date date = new Date(campaignDisplayModel.getEndTime());
            int i = ActionBar.OLrzqt[campaignDisplayModel.getStatus().ordinal()];
            if (i == 1) {
                return AEQbTJ(context, date);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return EZpvd(date, context);
        }

        public final java.lang.String AEQbTJ(android.content.Context context, Date date) {
            return C33069mpW.KWHzl(context, C47315tni.PendingIntent.QVAiDq, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.formatStandardDate$default(date, null, 1, null))));
        }

        public final java.lang.String EZpvd(Date date, android.content.Context context) {
            long time = date.getTime() - java.lang.System.currentTimeMillis();
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            long jGEmmrt = time / C59462zhW.gEmmrt(C59519zia.EZpvd(1, DurationUnit.DAYS));
            if (jGEmmrt > 13) {
                return C33069mpW.KWHzl(context, C47315tni.PendingIntent.UeEOUB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.formatStandardDate$default(date, null, 1, null))));
            }
            return C33069mpW.KWHzl(context, C47315tni.PendingIntent.RcXXUw, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("days", java.lang.Long.valueOf(jGEmmrt)), C56390yDp.OLrzqt("hours", java.lang.Long.valueOf((time / C59462zhW.gEmmrt(C59519zia.EZpvd(1, DurationUnit.HOURS))) % ((long) 24))), C56390yDp.OLrzqt("minutes", java.lang.Long.valueOf((time / C59462zhW.gEmmrt(C59519zia.EZpvd(1, DurationUnit.MINUTES))) % ((long) 60)))));
        }

        /* JADX INFO: renamed from: o.sdA$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ CampaignDisplayModel AEQbTJ;
            public final /* synthetic */ C44764sdA EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C44764sdA c44764sdA, CampaignDisplayModel campaignDisplayModel) {
                this.KWHzl = view;
                this.copydefault = j;
                this.EZpvd = c44764sdA;
                this.AEQbTJ = campaignDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.EZpvd.OLrzqt.invoke(this.AEQbTJ);
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    public boolean KWHzl(@NotNull CampaignDisplayModel campaignDisplayModel, @NotNull CampaignDisplayModel campaignDisplayModel2) {
        Intrinsics.checkNotNullParameter(campaignDisplayModel, "");
        Intrinsics.checkNotNullParameter(campaignDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) campaignDisplayModel.getSlug(), (java.lang.Object) campaignDisplayModel2.getSlug());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull CampaignDisplayModel campaignDisplayModel, @NotNull CampaignDisplayModel campaignDisplayModel2) {
        Intrinsics.checkNotNullParameter(campaignDisplayModel, "");
        Intrinsics.checkNotNullParameter(campaignDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) campaignDisplayModel.getSlug(), (java.lang.Object) campaignDisplayModel2.getSlug()) && Intrinsics.EZpvd((java.lang.Object) campaignDisplayModel.getTitle(), (java.lang.Object) campaignDisplayModel2.getTitle()) && campaignDisplayModel.getEndTime() == campaignDisplayModel2.getEndTime() && campaignDisplayModel.getStatus() == campaignDisplayModel2.getStatus();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47427tpo abstractC47427tpoAEQbTJ = AbstractC47427tpo.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47427tpoAEQbTJ, "");
        return new StateListAnimator(this, abstractC47427tpoAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        CampaignDisplayModel campaignDisplayModel = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(campaignDisplayModel, "");
        stateListAnimator.OLrzqt(campaignDisplayModel);
    }

    /* JADX INFO: renamed from: o.sdA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sdA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
