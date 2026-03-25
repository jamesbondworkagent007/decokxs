package o;

import com.okinc.business.market.features.smart_money.signal.ui.binder.SignalGemsItemBinder$1;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29532kvS extends AbstractC25436iwg<SignalGemsCardsUiModel, C21596hFf> {
    public final Function1<SignalGemsCardsUiModel, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29532kvS() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel, kotlin.Unit>):void (m)] (LINE:9) call: o.kvS.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C29532kvS(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C29532kvS(Function1<? super SignalGemsCardsUiModel, Unit> function1) {
        super(SignalGemsItemBinder$1.INSTANCE);
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21596hFf> c25435iwf, @NotNull SignalGemsCardsUiModel signalGemsCardsUiModel) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(signalGemsCardsUiModel, "");
        C29574kwH.OLrzqt((C21596hFf) c25435iwf.EZpvd(), signalGemsCardsUiModel, this.KWHzl);
    }
}
