package o;

import android.view.ViewGroup;
import com.okinc.business.defi.wallet.transfer.receive.exchange.ExchangeSearchEmptyBinding$1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gtg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21116gtg extends AbstractC19608gIr<C14316djE, C17133ewz> {
    public C21116gtg() {
        super(ExchangeSearchEmptyBinding$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C17133ewz c17133ewz, @NotNull C14316djE c14316djE) {
        Intrinsics.checkNotNullParameter(c17133ewz, "");
        Intrinsics.checkNotNullParameter(c14316djE, "");
        ViewGroup.LayoutParams layoutParams = c17133ewz.OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = C55298xhM.dp2px$default(96.0f, null, 1, null);
        c17133ewz.OLrzqt.setLayoutParams(marginLayoutParams);
        C55173xeu c55173xeu = c17133ewz.OLrzqt;
        java.lang.String string = c55173xeu.getContext().getString(C13754dXa.FragmentManager.trackPipAnimationHintViewpositionInWindow);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string);
        c55173xeu.AEQbTJ().setVisibility(8);
    }
}
