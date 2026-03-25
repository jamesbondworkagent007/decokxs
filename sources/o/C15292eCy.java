package o;

import android.view.View;
import com.okinc.business.defi.wallet.eip7702.ui.item.EIP7702NetworkErrorViewBinding$1;
import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15292eCy extends AbstractC19608gIr<EIP7702UIState.StateListAnimator, C17089ewH> {
    public final Function0<Unit> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15292eCy(@NotNull Function0<Unit> function0) {
        super(EIP7702NetworkErrorViewBinding$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C17089ewH c17089ewH, @NotNull EIP7702UIState.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c17089ewH, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C55173xeu c55173xeu = c17089ewH.OLrzqt;
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C15292eCy.KWHzl(this.KWHzl, view);
            }
        });
    }

    public static final void KWHzl(C15292eCy c15292eCy, android.view.View view) {
        c15292eCy.AEQbTJ.invoke();
    }
}
