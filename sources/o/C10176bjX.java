package o;

import com.okinc.business.defi.assets.detail.biz.ItemType;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10176bjX extends AbstractC10170bjR {
    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return null;
    }

    @Override // o.AbstractC10170bjR
    public boolean AxsJAY() {
        return false;
    }

    @Override // o.AbstractC10170bjR
    public C10169bjQ fetchVPNInfo() {
        return null;
    }

    @Override // o.AbstractC10170bjR
    public boolean getFieldNames() {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: AuCTel()Ljava/lang/CharSequence; */
    @Override // o.AbstractC10170bjR
    /* JADX INFO: renamed from: sSMYrx, reason: merged with bridge method [inline-methods] */
    public java.lang.String AuCTel() {
        return null;
    }

    @Override // o.AbstractC10170bjR
    public C10169bjQ values() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10176bjX(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDefaultViewModelCreationExtras);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> AYXKKw() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC10170bjR
    public int gEmmrt() {
        return AYXKKw().size();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> DbNXlk() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC10170bjR
    public int isConnected() {
        return DbNXlk().size();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> KWHzl() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<ItemType> AubY() {
        java.util.List<ItemType> listAubY = super.AubY();
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(fJNWhG().getMainCoinId());
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.heceqZ()) {
            listAubY.remove(ItemType.ITEM_TYPE_NETWORK_FEE);
        }
        return listAubY;
    }
}
