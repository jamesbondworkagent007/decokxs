package o;

import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39923qCu implements InterfaceC39921qCs<Product> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.util.ArrayList<Product> OLrzqt = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.qCu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public C39923qCu() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("finanical_product_history", Product.class);
        arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
        if (arrayList.size() != 0) {
            this.OLrzqt.addAll(arrayList);
        }
    }

    public java.util.List<Product> KWHzl() {
        return (!(((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.SIMPLE_EARN) ^ true) || C40386qTy.KWHzl()) ? yDY.AhwBna() : this.OLrzqt;
    }

    public void AEQbTJ(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "");
        if (!this.OLrzqt.contains(product)) {
            this.OLrzqt.add(0, product);
        } else {
            this.OLrzqt.remove(product);
            this.OLrzqt.add(0, product);
        }
        EZpvd();
    }

    public void copydefault() {
        this.OLrzqt.clear();
        SPUtils.put("finanical_product_history", this.OLrzqt);
    }

    public void EZpvd() {
        SPUtils.put("finanical_product_history", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.OLrzqt, 20));
    }
}
