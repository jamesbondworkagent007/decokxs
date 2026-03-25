package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iau, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24285iau extends android.widget.FrameLayout {
    public C22025hVc AEQbTJ;
    public hWF KWHzl;
    public RecyclerView OLrzqt;
    public hWF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24285iau(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24285iau(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.iau.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24285iau(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24285iau(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    public final void copydefault(OrderDetailBean orderDetailBean) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (orderDetailBean != null) {
            hWF hwf = this.KWHzl;
            if (hwf != null) {
                hwf.setAddressValue(orderDetailBean.getFrom(), orderDetailBean.getChainId());
            }
            java.lang.String receiveWalletAddress = orderDetailBean.getReceiveWalletAddress();
            if (receiveWalletAddress == null || receiveWalletAddress.length() <= 0) {
                hWF hwf2 = this.copydefault;
                if (hwf2 != null) {
                    hwf2.setVisibility(8);
                }
            } else {
                hWF hwf3 = this.copydefault;
                if (hwf3 != null) {
                    hwf3.setVisibility(0);
                }
                hWF hwf4 = this.copydefault;
                if (hwf4 != null) {
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChPHhYHK);
                    java.lang.String receiveWalletAddress2 = orderDetailBean.getReceiveWalletAddress();
                    if (receiveWalletAddress2 == null) {
                        receiveWalletAddress2 = "";
                    }
                    hwf4.setAddressValue(strAYXKKw, receiveWalletAddress2, orderDetailBean.getToChainId());
                }
            }
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_CREATE_TIME.getValue()));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SWAP_TYPE.getValue()));
            arrayList.add(new hUY(orderDetailBean, ItemType.ITEM_TYPE_SWAP_TIME.getValue()));
            arrayList.add(new C22027hVe(orderDetailBean, ItemType.ITEM_TYPE_NETWORK.getValue()));
            arrayList.add(new C22029hVg(orderDetailBean, ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_FROM.getValue()));
            if (orderDetailBean.isDisplayServiceFeeSection()) {
                arrayList.add(new C22033hVk(orderDetailBean, ItemType.ITEM_TYPE_SERVICE_FEE.getValue()));
            }
            arrayList.add(new C22028hVf(orderDetailBean, false, ItemType.ITEM_TYPE_SWAP_RADIO.getValue()));
            if (Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getStatus(), (java.lang.Object) "1")) {
                arrayList.add(new C22032hVj(orderDetailBean, ItemType.ITEM_TYPE_TX_HASH.getValue()));
            }
        }
        C22025hVc c22025hVc = this.AEQbTJ;
        if (c22025hVc != null) {
            c22025hVc.OLrzqt(arrayList);
        }
    }

    public final void AEQbTJ() {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.HJWChPfvRMlC, (android.view.ViewGroup) this, true);
        this.OLrzqt = (RecyclerView) viewInflate.findViewById(C23274hvD.Application.setPipParamsSourceRectHint);
        this.KWHzl = (hWF) viewInflate.findViewById(C23274hvD.Application.getAlphabeticShortcut);
        this.copydefault = (hWF) viewInflate.findViewById(C23274hvD.Application.getGroupId);
        C22025hVc c22025hVc = new C22025hVc("default_trade");
        this.AEQbTJ = c22025hVc;
        c22025hVc.AEQbTJ();
        RecyclerView recyclerView = this.OLrzqt;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(C33047mpA.KWHzl(getContext()));
        }
        RecyclerView recyclerView2 = this.OLrzqt;
        if (recyclerView2 != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView2.addItemDecoration(new C24290iaz(C55298xhM.OLrzqt(24, context), false, 2, null));
        }
        RecyclerView recyclerView3 = this.OLrzqt;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.AEQbTJ);
        }
    }
}
