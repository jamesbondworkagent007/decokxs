package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xrh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55849xrh implements InterfaceC54501xKt<java.util.List<? extends ProductItemResp>, java.util.ArrayList<TacticsInsideItemData>> {
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<TacticsInsideItemData> KWHzl(@NotNull java.util.List<ProductItemResp> list) {
        ProductItemResp productItemResp;
        Intrinsics.checkNotNullParameter(list, "");
        if (!C33129mqd.valueOf(java.lang.Integer.valueOf(list.size()), 0) && (productItemResp = (ProductItemResp) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
            java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
            TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DQzvGNdrmXxudrmXxu), C56033xvF.getBotPrice$default("SPOT", this.AEQbTJ, productItemResp.getStrike(), true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, C33070mpX.copydefault(C52761wXj.Activity.QHmsKR), 0, 0, C52761wXj.LoaderManager.zuBGHE, C52761wXj.LoaderManager.gHZMYf, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.QHmsKR)), null, null, null, null, null, null, 129844, null);
            TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.aKErDB), xMR.formatPercentWithSymbol$default(xMR.copydefault, productItemResp.getAnnualYieldPercentage(), 0, 0, null, 14, null), null, C33070mpX.copydefault(C52761wXj.Activity.QHmsKR), 0, 0, C52761wXj.LoaderManager.zuBGHE, C52761wXj.LoaderManager.gHZMYf, null, null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) productItemResp.getAnnualYieldPercentage())), null, null, null, null, null, null, 129844, null);
            TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.iHkeWl), C55861xrt.OLrzqt.EZpvd(productItemResp.getTerm()), null, C33070mpX.copydefault(C52761wXj.Activity.QHmsKR), 0, 0, C52761wXj.LoaderManager.zuBGHE, C52761wXj.LoaderManager.gHZMYf, null, null, null, null, null, null, null, null, null, 130868, null);
            arrayList.add(tacticsInsideItemData);
            arrayList.add(tacticsInsideItemData2);
            arrayList.add(tacticsInsideItemData3);
            return arrayList;
        }
        return new java.util.ArrayList<>();
    }
}
