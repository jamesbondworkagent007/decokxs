package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.viW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51198viW extends AbstractC59533zio<BotCopyTraderInfoData, C51199viX> {
    public final Function1<BotCopyTraderInfoData, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51198viW() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51198viW(Function1<? super BotCopyTraderInfoData, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData, kotlin.Unit>):void (m)] (LINE:11) call: o.viW.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51198viW(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51199viX onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C51199viX(new C51289vkH(context, null, 0, this.copydefault, 6, null));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51199viX c51199viX, @NotNull BotCopyTraderInfoData botCopyTraderInfoData) {
        Intrinsics.checkNotNullParameter(c51199viX, "");
        Intrinsics.checkNotNullParameter(botCopyTraderInfoData, "");
        android.view.View view = c51199viX.itemView;
        C51289vkH c51289vkH = view instanceof C51289vkH ? (C51289vkH) view : null;
        if (c51289vkH != null) {
            c51289vkH.AEQbTJ(botCopyTraderInfoData);
        }
    }
}
