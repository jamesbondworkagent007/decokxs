package o;

import android.widget.CompoundButton;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.BotItemSwitchData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51755vsx extends AbstractC59533zio<BotItemSwitchData, C51712vsG> {
    public final Function1<java.lang.Boolean, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51755vsx() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>):void (m)] (LINE:22) call: o.vsx.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C51755vsx(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51755vsx(Function1<? super java.lang.Boolean, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51712vsG onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RihMUf, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51712vsG(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51712vsG c51712vsG, @NotNull BotItemSwitchData botItemSwitchData) {
        Intrinsics.checkNotNullParameter(c51712vsG, "");
        Intrinsics.checkNotNullParameter(botItemSwitchData, "");
        c51712vsG.copydefault().setText(botItemSwitchData.AEQbTJ());
        c51712vsG.KWHzl().setChecked(botItemSwitchData.OLrzqt());
        c51712vsG.KWHzl().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vsF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51755vsx.KWHzl(this.AEQbTJ, compoundButton, z);
            }
        });
    }

    public static final void KWHzl(C51755vsx c51755vsx, android.widget.CompoundButton compoundButton, boolean z) {
        if (!z) {
            compoundButton.setChecked(true);
        }
        Function1<java.lang.Boolean, Unit> function1 = c51755vsx.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }
}
