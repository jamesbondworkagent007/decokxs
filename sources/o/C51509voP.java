package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.RecommendBulletItem;
import com.okinc.unify_trade.biz.RecommendBulletMPData;
import com.okinc.unify_trade.biz.RecommendInvestItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51509voP extends AbstractC59533zio<RecommendBulletMPData, StateListAnimator> {
    public final Function0<Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51509voP() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: o.voP$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j) {
            this.OLrzqt = view;
            this.copydefault = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.OLrzqt;
                Intrinsics.copydefault(constraintLayout);
                android.app.Activity activityKWHzl = C35334ntP.KWHzl(constraintLayout);
                C55867xrz.clickForNewNmpRecommend$default(C55867xrz.KWHzl, null, 1, null);
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activityKWHzl, "social/trade/community?location=HOT&channel=trade_bot_main_page_smartpicks_card", null, ActionBar.EZpvd, 4, null);
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:302) call: o.voP.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C51509voP(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public C51509voP(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uWF uwfEZpvd = uWF.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(uwfEZpvd, "");
        return new StateListAnimator(uwfEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull RecommendBulletMPData recommendBulletMPData) {
        java.util.List listValueOf;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(recommendBulletMPData, "");
        stateListAnimator.OLrzqt().EZpvd.removeAllViews();
        java.util.List<RecommendBulletItem> bulletChatInfo = recommendBulletMPData.getBulletChatInfo();
        if (bulletChatInfo != null && (!bulletChatInfo.isEmpty())) {
            int iCeil = (int) java.lang.Math.ceil(((double) bulletChatInfo.size()) / 3.0d);
            java.util.List<RecommendBulletItem> bulletChatInfo2 = recommendBulletMPData.getBulletChatInfo();
            if (bulletChatInfo2 != null && (listValueOf = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) bulletChatInfo2, iCeil)) != null) {
                java.util.Iterator it = listValueOf.iterator();
                while (it.hasNext()) {
                    C51649vqx c51649vqx = new C51649vqx((java.util.List) it.next());
                    android.content.Context context = stateListAnimator.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C51603vqD c51603vqD = new C51603vqD(context, null, "h");
                    c51603vqD.setAdapter(c51649vqx);
                    c51603vqD.setLayoutManager(new LinearLayoutManager(stateListAnimator.itemView.getContext(), 0, false));
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, C55298xhM.dp2px$default(16.0f, null, 1, null), 0, 0);
                    stateListAnimator.OLrzqt().EZpvd.addView(c51603vqD, layoutParams);
                }
            }
        }
        java.util.List<RecommendInvestItem> latestInvestors = recommendBulletMPData.getLatestInvestors();
        if (latestInvestors != null) {
            C51648vqw.refreshCircleCoins$default(stateListAnimator.OLrzqt().copydefault, CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) latestInvestors, 3), 0, 0, 6, null);
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.invokespecialRtjmuc);
        android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw + " ");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(stateListAnimator.itemView.getContext(), C52761wXj.TaskDescription.DlmWDR);
        Intrinsics.copydefault(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        try {
            android.content.Context context2 = stateListAnimator.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (C55296xhK.OLrzqt(context2)) {
                DrawableCompat.setLayoutDirection(drawable, 1);
            }
        } catch (java.lang.Exception unused) {
        }
        spannableString.setSpan(new C51602vqC(drawable), strAYXKKw.length(), strAYXKKw.length() + 1, 17);
        stateListAnimator.OLrzqt().gEmmrt.setText(spannableString);
        ConstraintLayout constraintLayout = stateListAnimator.OLrzqt().OLrzqt;
        constraintLayout.setOnClickListener(new Activity(constraintLayout, 1000L));
    }

    /* JADX INFO: renamed from: o.voP$ActionBar */
    public static final class ActionBar implements Function1<AbstractC43238rlX, Unit> {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            copydefault(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.voP$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final uWF OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uWF OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull uWF uwf) {
            super(uwf.getRoot());
            Intrinsics.checkNotNullParameter(uwf, "");
            this.OLrzqt = uwf;
        }
    }
}
