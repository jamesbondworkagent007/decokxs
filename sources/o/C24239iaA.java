package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.OrderDetailDefiPlatformInfo;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24239iaA extends android.widget.FrameLayout {
    public RecyclerView AEQbTJ;
    public C22025hVc EZpvd;
    public hWF OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24239iaA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24239iaA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdapter(C22025hVc c22025hVc) {
        this.EZpvd = c22025hVc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: o.iaA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24239iaA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24239iaA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    public final void OLrzqt(OrderDetailBean orderDetailBean) {
        java.lang.String name;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (orderDetailBean != null) {
            arrayList.add(new C22031hVi(orderDetailBean, DetailSection.OrderInfo, false, false, 12, null));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_ORDER_TYPE.getValue()));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_CREATE_TIME.getValue()));
            arrayList.add(new C22027hVe(orderDetailBean, ItemType.ITEM_TYPE_NETWORK.getValue()));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SLIPPAGE.getValue()));
            arrayList.add(new C22029hVg(orderDetailBean, ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_FROM.getValue()));
            if (orderDetailBean.isDisplayServiceFeeSection()) {
                arrayList.add(new C22033hVk(orderDetailBean, ItemType.ITEM_TYPE_SERVICE_FEE.getValue()));
            }
            C19758gOf c19758gOf = C19758gOf.AEQbTJ;
            OrderDetailDefiPlatformInfo defiPlatformInfo = orderDetailBean.getDefiPlatformInfo();
            if (c19758gOf.copydefault(defiPlatformInfo != null ? defiPlatformInfo.getId() : null, orderDetailBean.getStatus(), false)) {
                arrayList.add(new C22024hVb(orderDetailBean, null, 2, null));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getMevInfo())) {
                arrayList.add(new C22026hVd(orderDetailBean, ItemType.ITEM_TYPE_SWAP_MEV.getValue()));
            }
            arrayList.add(new hUZ(orderDetailBean));
            arrayList.add(new C22031hVi(orderDetailBean, DetailSection.TradeInfo, false, false, 12, null));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_TRANSACTION_TYPE.getValue()));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SWAP_TIME.getValue()));
            arrayList.add(new C22028hVf(orderDetailBean, true, ItemType.ITEM_TYPE_SWAP_RADIO.getValue()));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_APPROVE_METHOD.getValue()));
            OrderDetailDefiPlatformInfo defiPlatformInfo2 = orderDetailBean.getDefiPlatformInfo();
            if (defiPlatformInfo2 != null && (name = defiPlatformInfo2.getName()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) name)) {
                arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SWAP_DE_FI_PLATFORM.getValue()));
            }
            arrayList.add(new hUX(orderDetailBean, orderDetailBean.getFrom(), orderDetailBean.getFromChainId(), 0, 8, null));
            arrayList.add(new C22032hVj(orderDetailBean, ItemType.ITEM_TYPE_TX_HASH.getValue()));
            if (orderDetailBean.needShowWithdrawalHash()) {
                arrayList.add(new C22032hVj(orderDetailBean, ItemType.ITEM_TYPE_WITHDRAW_HASH.getValue()));
            }
        }
        C22025hVc c22025hVc = this.EZpvd;
        if (c22025hVc != null) {
            c22025hVc.OLrzqt(arrayList);
        }
    }

    public final void copydefault() {
        hGH hghEZpvd = hGH.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(hghEZpvd, "");
        this.AEQbTJ = hghEZpvd.AEQbTJ;
        hWF hwf = hghEZpvd.copydefault;
        this.OLrzqt = hwf;
        if (hwf != null) {
            hwf.setVisibility(8);
        }
        C22025hVc c22025hVc = new C22025hVc("default_trade");
        this.EZpvd = c22025hVc;
        c22025hVc.AEQbTJ();
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(C33047mpA.KWHzl(getContext()));
        }
        RecyclerView recyclerView2 = this.AEQbTJ;
        if (recyclerView2 != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView2.addItemDecoration(new C24290iaz(C55298xhM.OLrzqt(24, context), true));
        }
        RecyclerView recyclerView3 = this.AEQbTJ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.EZpvd);
        }
    }
}
