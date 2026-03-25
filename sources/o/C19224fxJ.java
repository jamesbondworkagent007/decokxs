package o;

import android.view.ViewGroup;
import com.okinc.business.defi.wallet.mine.data.WalletSearchEmpty;
import com.okinc.business.defi.wallet.mine.viewholder.SendAndReceiveSearchEmptyBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19224fxJ extends AbstractC19608gIr<WalletSearchEmpty, C17133ewz> {
    public C19224fxJ() {
        super(SendAndReceiveSearchEmptyBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C17133ewz c17133ewz, @NotNull WalletSearchEmpty walletSearchEmpty) {
        Intrinsics.checkNotNullParameter(c17133ewz, "");
        Intrinsics.checkNotNullParameter(walletSearchEmpty, "");
        C55173xeu c55173xeu = c17133ewz.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C55298xhM.dp2px$default(76.0f, null, 1, null);
            c55173xeu.setLayoutParams(marginLayoutParams);
            final C55173xeu c55173xeu2 = c17133ewz.OLrzqt;
            c55173xeu2.setEmptyTypeImage(7);
            c55173xeu2.setSubTitle(C33061mpO.KWHzl(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMimeType), C56424yEw.AYXKKw(C56390yDp.OLrzqt("token", walletSearchEmpty.getSearchText()))), walletSearchEmpty.getSearchText(), new Function1() { // from class: o.fxK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19224fxJ.AEQbTJ(c55173xeu2, (java.util.List) obj);
                }
            }));
            c55173xeu2.AEQbTJ().setVisibility(8);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final Unit AEQbTJ(C55173xeu c55173xeu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c55173xeu.getContext(), C32113mPz.Dialog.fetchVPNInfo));
        return Unit.INSTANCE;
    }
}
