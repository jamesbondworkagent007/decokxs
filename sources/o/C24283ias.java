package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ias, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24283ias extends android.widget.FrameLayout {
    public C22025hVc AEQbTJ;
    public RecyclerView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24283ias(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24283ias(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdapter(C22025hVc c22025hVc) {
        this.AEQbTJ = c22025hVc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.ias.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24283ias(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24283ias(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    public final void EZpvd(OrderDetailBean orderDetailBean) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (orderDetailBean != null) {
            arrayList.add(new C22031hVi(orderDetailBean, DetailSection.TradeInfo, false, false, 4, null));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SWAP_TYPE.getValue()));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_CREATE_TIME.getValue()));
            arrayList.add(new C22027hVe(orderDetailBean, ItemType.ITEM_TYPE_NETWORK.getValue()));
            if (!orderDetailBean.isGasStation()) {
                arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SLIPPAGE.getValue()));
            }
            arrayList.add(new C22029hVg(orderDetailBean, ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_FROM.getValue()));
            if (orderDetailBean.getHiddenOtherFee()) {
                if (!orderDetailBean.isFreeGas()) {
                    if (!orderDetailBean.isEstimatedBridgeFeesEmpty()) {
                        arrayList.add(new C22029hVg(orderDetailBean, ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_BRIDGE.getValue()));
                    }
                    arrayList.add(new C22029hVg(orderDetailBean, ItemType.ITEM_TYPE_SWAP_FEE_BRIDGE.getValue()));
                }
            } else {
                arrayList.add(new C22029hVg(orderDetailBean, ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_OTHER.getValue()));
            }
            if (orderDetailBean.isOpenServiceFee()) {
                arrayList.add(new C22033hVk(orderDetailBean, ItemType.ITEM_TYPE_SERVICE_FEE.getValue()));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getMevInfo())) {
                arrayList.add(new C22026hVd(orderDetailBean, ItemType.ITEM_TYPE_SWAP_MEV.getValue()));
            }
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SWAP_TIME.getValue()));
            arrayList.add(new C22028hVf(orderDetailBean, true, ItemType.ITEM_TYPE_SWAP_RADIO.getValue()));
            arrayList.add(new hUX(orderDetailBean, orderDetailBean.getFrom(), orderDetailBean.getFromChainId(), 0, 8, null));
            java.lang.String receiveWalletAddress = orderDetailBean.getReceiveWalletAddress();
            if (receiveWalletAddress != null && receiveWalletAddress.length() != 0) {
                arrayList.add(new hUX(orderDetailBean, receiveWalletAddress, orderDetailBean.getToChainId(), C23274hvD.Fragment.HJWChPHhYHK));
            }
            if (!orderDetailBean.isHideGasDropView()) {
                arrayList.add(new C22023hVa(orderDetailBean, ItemType.ITEM_TYPE_SWAP_GAS.getValue()));
            }
        }
        C22025hVc c22025hVc = this.AEQbTJ;
        if (c22025hVc != null) {
            c22025hVc.OLrzqt(arrayList);
        }
    }

    public final void EZpvd() {
        hGG hggKWHzl = hGG.KWHzl(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(hggKWHzl, "");
        this.EZpvd = hggKWHzl.EZpvd;
        C22025hVc c22025hVc = new C22025hVc("default_trade");
        this.AEQbTJ = c22025hVc;
        c22025hVc.AEQbTJ();
        RecyclerView recyclerView = this.EZpvd;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(C33047mpA.KWHzl(getContext()));
        }
        RecyclerView recyclerView2 = this.EZpvd;
        if (recyclerView2 != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView2.addItemDecoration(new C24290iaz(C55298xhM.OLrzqt(24, context), true));
        }
        RecyclerView recyclerView3 = this.EZpvd;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.AEQbTJ);
        }
    }
}
