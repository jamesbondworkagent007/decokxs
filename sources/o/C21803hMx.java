package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.ItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hMx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21803hMx extends AbstractC21793hMn {
    public final DetailSection AEQbTJ;
    public final OrderDetailResult EZpvd;
    public final boolean KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C21803hMx copy$default(C21803hMx c21803hMx, OrderDetailResult orderDetailResult, DetailSection detailSection, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            orderDetailResult = c21803hMx.EZpvd;
        }
        if ((i & 2) != 0) {
            detailSection = c21803hMx.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = c21803hMx.KWHzl;
        }
        return c21803hMx.AEQbTJ(orderDetailResult, detailSection, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC21793hMn
    public java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21803hMx AEQbTJ(@NotNull OrderDetailResult orderDetailResult, @NotNull DetailSection detailSection, boolean z) {
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        Intrinsics.checkNotNullParameter(detailSection, "");
        return new C21803hMx(orderDetailResult, detailSection, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC21793hMn
    public OrderDetailResult OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DetailSection copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21803hMx)) {
            return false;
        }
        C21803hMx c21803hMx = (C21803hMx) obj;
        return Intrinsics.EZpvd(this.EZpvd, c21803hMx.EZpvd) && this.AEQbTJ == c21803hMx.AEQbTJ && this.KWHzl == c21803hMx.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SectionTitleLimitOrderItem(detailBean=" + this.EZpvd + ", section=" + this.AEQbTJ + ", isExpanded=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult)
  (r2v0 com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult, com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection, boolean):void (m)] (LINE:41) call: o.hMx.<init>(com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult, com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection, boolean):void type: THIS */
    public /* synthetic */ C21803hMx(OrderDetailResult orderDetailResult, DetailSection detailSection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetailResult, detailSection, (i & 4) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21803hMx(@NotNull OrderDetailResult orderDetailResult, @NotNull DetailSection detailSection, boolean z) {
        super(orderDetailResult);
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        Intrinsics.checkNotNullParameter(detailSection, "");
        this.EZpvd = orderDetailResult;
        this.AEQbTJ = detailSection;
        this.KWHzl = z;
        this.copydefault = ItemType.ITEM_TYPE_SECTION_TITLE.getValue();
    }
}
