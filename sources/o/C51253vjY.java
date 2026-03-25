package o;

import android.widget.CompoundButton;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51253vjY extends AbstractC59533zio<NoConfirmData, C51251vjW> {
    public final Function1<java.lang.Boolean, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51253vjY(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51251vjW onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RbVjfb, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51251vjW(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51251vjW c51251vjW, @NotNull NoConfirmData noConfirmData) {
        Intrinsics.checkNotNullParameter(c51251vjW, "");
        Intrinsics.checkNotNullParameter(noConfirmData, "");
        c51251vjW.KWHzl().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51253vjY.OLrzqt(this.AEQbTJ, compoundButton, z);
            }
        });
    }

    public static final void OLrzqt(C51253vjY c51253vjY, android.widget.CompoundButton compoundButton, boolean z) {
        c51253vjY.EZpvd.invoke(java.lang.Boolean.valueOf(z));
    }
}
