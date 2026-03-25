package o;

import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hVi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22031hVi extends hUT {
    public final OrderDetailBean AEQbTJ;
    public final DetailSection AYXKKw;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C22031hVi copy$default(C22031hVi c22031hVi, OrderDetailBean orderDetailBean, DetailSection detailSection, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            orderDetailBean = c22031hVi.AEQbTJ;
        }
        if ((i & 2) != 0) {
            detailSection = c22031hVi.AYXKKw;
        }
        if ((i & 4) != 0) {
            z = c22031hVi.KWHzl;
        }
        if ((i & 8) != 0) {
            z2 = c22031hVi.copydefault;
        }
        return c22031hVi.copydefault(orderDetailBean, detailSection, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DetailSection EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hUT
    public OrderDetailBean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hUT
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22031hVi copydefault(@NotNull OrderDetailBean orderDetailBean, @NotNull DetailSection detailSection, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(detailSection, "");
        return new C22031hVi(orderDetailBean, detailSection, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22031hVi)) {
            return false;
        }
        C22031hVi c22031hVi = (C22031hVi) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c22031hVi.AEQbTJ) && this.AYXKKw == c22031hVi.AYXKKw && this.KWHzl == c22031hVi.KWHzl && this.copydefault == c22031hVi.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SectionTitleOrderItem(detailBean=" + this.AEQbTJ + ", section=" + this.AYXKKw + ", isExpanded=" + this.KWHzl + ", canExpand=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.business.dexlogic.bean.OrderDetailBean)
  (r3v0 com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
 A[MD:(com.okinc.business.dexlogic.bean.OrderDetailBean, com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection, boolean, boolean):void (m)] (LINE:46) call: o.hVi.<init>(com.okinc.business.dexlogic.bean.OrderDetailBean, com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection, boolean, boolean):void type: THIS */
    public /* synthetic */ C22031hVi(OrderDetailBean orderDetailBean, DetailSection detailSection, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderDetailBean, detailSection, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22031hVi(@NotNull OrderDetailBean orderDetailBean, @NotNull DetailSection detailSection, boolean z, boolean z2) {
        super(orderDetailBean);
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(detailSection, "");
        this.AEQbTJ = orderDetailBean;
        this.AYXKKw = detailSection;
        this.KWHzl = z;
        this.copydefault = z2;
        this.OLrzqt = ItemType.ITEM_TYPE_SECTION_TITLE.getValue();
    }
}
