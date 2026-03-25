package o;

import com.okinc.business.defi.assets.utxo.widget.UtxoAssetDisplayItem;
import com.okinc.business.defi.assets.utxo.widget.UtxoAssetItemBinder$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xWD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10328bmQ extends AbstractC19608gIr<UtxoAssetDisplayItem, C16765eqB> {
    public final Function1<UtxoAssetDisplayItem, java.lang.Boolean> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.assets.utxo.widget.UtxoAssetDisplayItem, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10328bmQ(@NotNull Function1<? super UtxoAssetDisplayItem, java.lang.Boolean> function1) {
        super(UtxoAssetItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C16765eqB c16765eqB, @NotNull UtxoAssetDisplayItem utxoAssetDisplayItem) {
        Intrinsics.checkNotNullParameter(c16765eqB, "");
        Intrinsics.checkNotNullParameter(utxoAssetDisplayItem, "");
        c16765eqB.AEQbTJ.setText(utxoAssetDisplayItem.KWHzl());
        C55251xgS c55251xgS = c16765eqB.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(utxoAssetDisplayItem.AEQbTJ().length() > 0 ? 0 : 8);
        c16765eqB.EZpvd.setText(utxoAssetDisplayItem.AEQbTJ());
        c16765eqB.AhwBna.setText(utxoAssetDisplayItem.EZpvd());
        c16765eqB.copydefault.setVisibility(this.AEQbTJ.invoke(utxoAssetDisplayItem).booleanValue() ? 4 : 0);
        C10353bmp c10353bmp = C10353bmp.OLrzqt;
        java.lang.String strAEQbTJ = c10353bmp.AEQbTJ(utxoAssetDisplayItem.OLrzqt());
        C5448Sc c5448ScKWHzl = strAEQbTJ != null ? c10353bmp.KWHzl(strAEQbTJ) : null;
        C33608mzf c33608mzf = c16765eqB.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33608mzf, "");
        c10353bmp.KWHzl(c33608mzf, strAEQbTJ, xWD.Activity.AEQbTJ, (16 & 8) != 0 ? null : c5448ScKWHzl, (16 & 16) != 0 ? null : null);
    }
}
