package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetailsUser;
import com.okinc.unify_trade.biz.BotLeadProfitProfitUserListDetails;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vje, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51259vje extends AbstractC59533zio<BotLeadProfitProfitUserListDetails, C51265vjk> {
    public Function0<java.lang.String> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51259vje() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C51259vje(Function0<java.lang.String> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<java.lang.String>):void (m)] (LINE:172) call: o.vje.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C51259vje(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C51265vjk onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RIuxYh, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51265vjk(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51265vjk c51265vjk, @NotNull BotLeadProfitProfitUserListDetails botLeadProfitProfitUserListDetails) {
        Intrinsics.checkNotNullParameter(c51265vjk, "");
        Intrinsics.checkNotNullParameter(botLeadProfitProfitUserListDetails, "");
        RecyclerView recyclerViewKWHzl = c51265vjk.KWHzl();
        if (recyclerViewKWHzl != null) {
            recyclerViewKWHzl.setNestedScrollingEnabled(false);
        }
        RecyclerView recyclerViewKWHzl2 = c51265vjk.KWHzl();
        if (recyclerViewKWHzl2 != null) {
            recyclerViewKWHzl2.setLayoutManager(new LinearLayoutManager(c51265vjk.itemView.getContext(), 1, false));
        }
        C43316rmw c43316rmw = new C43316rmw();
        RecyclerView recyclerViewKWHzl3 = c51265vjk.KWHzl();
        if (recyclerViewKWHzl3 != null) {
            recyclerViewKWHzl3.setAdapter(c43316rmw);
        }
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        c43316rmw.register(BotLeadProfitProfitDetailsUser.class, new C51257vjc(this.KWHzl));
        java.util.ArrayList<BotLeadProfitProfitDetailsUser> details = botLeadProfitProfitUserListDetails.getDetails();
        if (details == null) {
            details = new java.util.ArrayList<>();
        }
        C49952uyJ.updateDataOrEmpty$default(c43316rmw, details, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryOwner), 40, null, null, false, 56, null);
        c43316rmw.notifyDataSetChanged();
    }
}
