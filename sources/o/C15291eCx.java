package o;

import android.view.ViewGroup;
import com.okinc.business.defi.wallet.eip7702.ui.item.EIP7702EmptyViewBinding$1;
import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15291eCx extends AbstractC19608gIr<EIP7702UIState.Application, C17133ewz> {
    public C15291eCx() {
        super(EIP7702EmptyViewBinding$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C17133ewz c17133ewz, @NotNull EIP7702UIState.Application application) {
        Intrinsics.checkNotNullParameter(c17133ewz, "");
        Intrinsics.checkNotNullParameter(application, "");
        C55173xeu c55173xeu = c17133ewz.OLrzqt;
        Intrinsics.copydefault(c55173xeu);
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C55298xhM.dp2px$default(32.0f, null, 1, null);
            c55173xeu.setLayoutParams(marginLayoutParams);
            c55173xeu.setEmptyTypeImage(6);
            java.lang.String string = c55173xeu.getContext().getString(C13754dXa.FragmentManager.dxcTrN);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            c55173xeu.setSubTitle((java.lang.CharSequence) "");
            c55173xeu.AEQbTJ().setVisibility(8);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
