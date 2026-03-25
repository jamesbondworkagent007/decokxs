package o;

import com.okinc.business.defi.assets.detail.biz.ItemType;
import com.okinc.business.defi.biz.net.bean.RegisterInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10244bkm extends AbstractC10170bjR {
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

    /* JADX DEBUG: Method merged with bridge method: AuCTel()Ljava/lang/CharSequence; */
    @Override // o.AbstractC10170bjR
    /* JADX INFO: renamed from: gHZMYf, reason: merged with bridge method [inline-methods] */
    public java.lang.String AuCTel() {
        return null;
    }

    @Override // o.AbstractC10170bjR
    public boolean getFieldNames() {
        return false;
    }

    @Override // o.AbstractC10170bjR
    public C10169bjQ values() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10244bkm(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    public final C10854bwM sSMYrx() {
        return C10954byG.EZpvd.valueOf().KWHzl(fJNWhG().getMainCoinId());
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        C10854bwM c10854bwMSSMYrx = sSMYrx();
        if (c10854bwMSSMYrx != null && c10854bwMSSMYrx.DCUTEIdCUTEI()) {
            int i = C13754dXa.FragmentManager.MediaDescriptionCompat;
            C10854bwM c10854bwMSSMYrx2 = sSMYrx();
            java.lang.String strDjBIcL = c10854bwMSSMYrx2 != null ? c10854bwMSSMYrx2.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("net", strDjBIcL)));
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.onScroll);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> AYXKKw() {
        java.lang.String icon;
        java.lang.String strAYXKKw;
        C10854bwM c10854bwMSSMYrx = sSMYrx();
        if (c10854bwMSSMYrx != null && c10854bwMSSMYrx.DCUTEIdCUTEI()) {
            return yDY.AhwBna();
        }
        RegisterInfo registerInfo = fJNWhG().getRegisterInfo();
        if (registerInfo == null || (icon = registerInfo.getIcon()) == null) {
            icon = "";
        }
        RegisterInfo registerInfo2 = fJNWhG().getRegisterInfo();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (registerInfo2 != null ? registerInfo2.getName() : null))) {
            RegisterInfo registerInfo3 = fJNWhG().getRegisterInfo();
            strAYXKKw = registerInfo3 != null ? registerInfo3.getName() : null;
            Intrinsics.copydefault((java.lang.Object) strAYXKKw);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLastCustomNonConfigurationInstance);
        }
        return C56402yEa.EZpvd(new AbstractC10168bjP.StateListAnimator(icon, strAYXKKw));
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
        int iIndexOf = listAubY.indexOf(ItemType.ITEM_TYPE_TRANSACTION_HASH);
        C10854bwM c10854bwMSSMYrx = sSMYrx();
        if (c10854bwMSSMYrx == null || !c10854bwMSSMYrx.DCUTEIdCUTEI()) {
            listAubY.add(iIndexOf + 1, ItemType.ITEM_TYPE_REGISTER_ADDRESS);
        }
        return listAubY;
    }
}
