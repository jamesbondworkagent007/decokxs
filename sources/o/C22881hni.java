package o;

import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22881hni extends AbstractC22818hmY {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22881hni(@NotNull AbstractC23101hrq abstractC23101hrq) {
        super(abstractC23101hrq);
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    @Override // o.AbstractC22818hmY
    public void KWHzl() {
        java.lang.String data;
        TradeInputGroup data2;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data3;
        EditTextData editData;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(gEmmrt().ffGIBT()).fARcdN().valueOf();
        java.lang.Boolean boolValueOf = interfaceC9738bbJValueOf != null ? java.lang.Boolean.valueOf(interfaceC9738bbJValueOf.getFieldNames()) : null;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = gEmmrt().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null && quotePriceResAxsJAYsNCnLh.checkNeedApprove() && Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.FALSE)) {
            ConsumeData<TradeInputGroup> value = gEmmrt().dmfpNf().getValue();
            if (value == null || (data2 = value.getData()) == null || (fromData = data2.getFromData()) == null || (data3 = fromData.getData()) == null || (editData = data3.getEditData()) == null || (data = editData.getData()) == null) {
                data = "";
            }
            gEmmrt().isConnected().checkApproveState(gEmmrt().QUSxYX().copydefault(), data, gEmmrt().dHguZz(), gEmmrt().ffGIBT(), gEmmrt().QUSxYX().valueOf(), gEmmrt().gEmmrt());
            return;
        }
        gEmmrt().isConnected().setApproveStatusGroup(null);
        gEmmrt().dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
    }
}
