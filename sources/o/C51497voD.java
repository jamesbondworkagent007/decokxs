package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BotCreateContentItem;
import com.okinc.unify_trade.biz.CategoryTag;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51497voD extends AbstractC59533zio<BotCreateContentItem, Activity> {
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51497voD() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:154) call: o.voD.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51497voD(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51497voD(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC50842vbl abstractC50842vblAEQbTJ = AbstractC50842vbl.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC50842vblAEQbTJ, "");
        return new Activity(abstractC50842vblAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull BotCreateContentItem botCreateContentItem) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(botCreateContentItem, "");
        AbstractC50842vbl abstractC50842vblOLrzqt = activity.OLrzqt();
        AppCompatImageView appCompatImageView = abstractC50842vblOLrzqt.EZpvd;
        java.lang.Integer iconRes = botCreateContentItem.getIconRes();
        appCompatImageView.setImageResource(iconRes != null ? iconRes.intValue() : 0);
        abstractC50842vblOLrzqt.AhwBna.setText(botCreateContentItem.getBotName());
        AppCompatTextView appCompatTextView = abstractC50842vblOLrzqt.djBIcL;
        appCompatTextView.setText(botCreateContentItem.getBotDesc());
        Intrinsics.copydefault(appCompatTextView);
        appCompatTextView.setVisibility(botCreateContentItem.getBotDesc().length() > 0 ? 0 : 8);
        java.util.List<CategoryTag> tags = botCreateContentItem.getTags();
        CategoryTag categoryTag = tags != null ? (CategoryTag) CollectionsKt___CollectionsKt.firstOrNull(tags) : null;
        C55251xgS c55251xgS = abstractC50842vblOLrzqt.KWHzl;
        if (categoryTag == null) {
            Intrinsics.copydefault(c55251xgS);
            c55251xgS.setVisibility(8);
        } else {
            Intrinsics.copydefault(c55251xgS);
            c55251xgS.setVisibility(0);
            c55251xgS.setText(categoryTag.getName());
        }
        android.view.View root = abstractC50842vblOLrzqt.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, botCreateContentItem));
    }

    /* JADX INFO: renamed from: o.voD$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ BotCreateContentItem EZpvd;
        public final /* synthetic */ C51497voD KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51497voD c51497voD, BotCreateContentItem botCreateContentItem) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c51497voD;
            this.EZpvd = botCreateContentItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1KWHzl = this.KWHzl.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke(this.EZpvd.getBotType());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.voD$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final AbstractC50842vbl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50842vbl OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AbstractC50842vbl abstractC50842vbl) {
            super(abstractC50842vbl.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50842vbl, "");
            this.copydefault = abstractC50842vbl;
        }
    }
}
