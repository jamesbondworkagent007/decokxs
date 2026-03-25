package o;

import com.okinc.business.market.data.constant.TokenGroupActionType;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27775kCx implements InterfaceC55196xfQ<C55276xgr, C55104xde<C21524hCo>> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55104xde<C21524hCo> AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21524hCo c21524hCoKWHzl = C21524hCo.KWHzl(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c21524hCoKWHzl, "");
        return new C55104xde<>(c21524hCoKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C55104xde<C21524hCo> c55104xde, @NotNull C55276xgr c55276xgr, boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(c55104xde, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        C21524hCo c21524hCo = (C21524hCo) c55104xde.OLrzqt();
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        TokenGroupActionType tokenGroupActionType = objOLrzqt instanceof TokenGroupActionType ? (TokenGroupActionType) objOLrzqt : null;
        if (tokenGroupActionType == null) {
            tokenGroupActionType = TokenGroupActionType.EDIT;
        }
        if (tokenGroupActionType == TokenGroupActionType.EDIT) {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DPhTBN);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dTTfOR);
        }
        c21524hCo.EZpvd.setText(c55276xgr.AhwBna());
        c21524hCo.AEQbTJ.setImageDrawable(drawableKWHzl);
    }
}
