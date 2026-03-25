package o;

import com.okinc.unify_trade.biz.BotLeadProfitProfitDetailsUser;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51257vjc extends AbstractC59533zio<BotLeadProfitProfitDetailsUser, C51258vjd> {
    public Function0<java.lang.String> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51257vjc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C51257vjc(Function0<java.lang.String> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<java.lang.String>):void (m)] (LINE:203) call: o.vjc.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C51257vjc(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C51258vjd onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RSDDiY, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51258vjd(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51258vjd c51258vjd, @NotNull BotLeadProfitProfitDetailsUser botLeadProfitProfitDetailsUser) {
        java.lang.String str;
        C51257vjc c51257vjc;
        java.lang.String strInvoke;
        Intrinsics.checkNotNullParameter(c51258vjd, "");
        Intrinsics.checkNotNullParameter(botLeadProfitProfitDetailsUser, "");
        android.widget.TextView textViewKWHzl = c51258vjd.KWHzl();
        if (textViewKWHzl != null) {
            textViewKWHzl.setText(pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(botLeadProfitProfitDetailsUser.getSettlementTime())), null, 1, null));
        }
        android.widget.TextView textViewOLrzqt = c51258vjd.OLrzqt();
        if (textViewOLrzqt != null) {
            java.lang.String amount = botLeadProfitProfitDetailsUser.getAmount();
            if (amount == null) {
                c51257vjc = this;
                str = "";
            } else {
                str = amount;
                c51257vjc = this;
            }
            Function0<java.lang.String> function0 = c51257vjc.AEQbTJ;
            textViewOLrzqt.setText(C56033xvF.getBotPnl$default("", "", str, (function0 == null || (strInvoke = function0.invoke()) == null) ? "" : strInvoke, true, false, null, false, null, null, null, 2016, null));
        }
        android.widget.TextView textViewAEQbTJ = c51258vjd.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.setText(botLeadProfitProfitDetailsUser.getUsername());
        }
        android.widget.ImageView imageViewEZpvd = c51258vjd.EZpvd();
        if (imageViewEZpvd != null) {
            wUE wue = wUE.OLrzqt;
            java.lang.String avatar = botLeadProfitProfitDetailsUser.getAvatar();
            wue.KWHzl(imageViewEZpvd, wUE.Application.m8784constructorimpl$default(avatar != null ? avatar : "", null, 2, null));
        }
        if (botLeadProfitProfitDetailsUser.isTopTime()) {
            android.widget.TextView textViewKWHzl2 = c51258vjd.KWHzl();
            if (textViewKWHzl2 != null) {
                textViewKWHzl2.setVisibility(0);
                return;
            }
            return;
        }
        android.widget.TextView textViewKWHzl3 = c51258vjd.KWHzl();
        if (textViewKWHzl3 != null) {
            textViewKWHzl3.setVisibility(8);
        }
    }
}
