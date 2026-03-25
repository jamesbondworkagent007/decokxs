package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BotCreateCardItem;
import com.okinc.unify_trade.biz.CategoryTag;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51495voB extends AbstractC59533zio<BotCreateCardItem, Application> {
    public final Function1<java.lang.String, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51495voB() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:67) call: o.voB.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51495voB(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51495voB(Function1<? super java.lang.String, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC50844vbn abstractC50844vbnOLrzqt = AbstractC50844vbn.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC50844vbnOLrzqt, "");
        return new Application(abstractC50844vbnOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull BotCreateCardItem botCreateCardItem) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(botCreateCardItem, "");
        AbstractC50844vbn abstractC50844vbnCopydefault = application.copydefault();
        android.widget.FrameLayout frameLayout = abstractC50844vbnCopydefault.EZpvd;
        java.lang.Integer bgTint = botCreateCardItem.getBgTint();
        frameLayout.setBackgroundTintList(bgTint != null ? C33070mpX.AEQbTJ(bgTint.intValue()) : null);
        AppCompatImageView appCompatImageView = abstractC50844vbnCopydefault.copydefault;
        java.lang.Integer ivTint = botCreateCardItem.getIvTint();
        appCompatImageView.setImageTintList(ivTint != null ? C33070mpX.AEQbTJ(ivTint.intValue()) : null);
        AppCompatImageView appCompatImageView2 = abstractC50844vbnCopydefault.copydefault;
        java.lang.Integer iconRes = botCreateCardItem.getIconRes();
        appCompatImageView2.setImageResource(iconRes != null ? iconRes.intValue() : 0);
        abstractC50844vbnCopydefault.djBIcL.setText(botCreateCardItem.getBotName());
        abstractC50844vbnCopydefault.KWHzl.removeAllViews();
        android.content.Context context = abstractC50844vbnCopydefault.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.view.View viewEZpvd = EZpvd(context, botCreateCardItem.getTags());
        if (viewEZpvd != null) {
            abstractC50844vbnCopydefault.KWHzl.addView(viewEZpvd);
        }
        android.widget.LinearLayout linearLayout = abstractC50844vbnCopydefault.AEQbTJ;
        linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this, botCreateCardItem));
    }

    public final android.view.View EZpvd(android.content.Context context, java.util.List<CategoryTag> list) {
        CategoryTag categoryTag;
        if (list == null || (categoryTag = (CategoryTag) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setOKDSStyle(7);
        c55251xgS.setOKDSSize(-5);
        c55251xgS.setText(categoryTag.getName());
        return c55251xgS;
    }

    /* JADX INFO: renamed from: o.voB$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final AbstractC50844vbn KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50844vbn copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC50844vbn abstractC50844vbn) {
            super(abstractC50844vbn.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50844vbn, "");
            this.KWHzl = abstractC50844vbn;
        }
    }

    /* JADX INFO: renamed from: o.voB$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ BotCreateCardItem AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C51495voB OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51495voB c51495voB, BotCreateCardItem botCreateCardItem) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c51495voB;
            this.AEQbTJ = botCreateCardItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1OLrzqt = this.OLrzqt.OLrzqt();
                if (function1OLrzqt != null) {
                    function1OLrzqt.invoke(this.AEQbTJ.getBotType());
                }
            }
        }
    }
}
