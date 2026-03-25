package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8483bDa extends AbstractC8426bCW<C8486bDd> {
    public final FeeType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8426bCW
    public FeeType copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8483bDa(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        this.OLrzqt = FeeType.FEE_TYPE_NO;
    }

    @Override // o.AbstractC8426bCW
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AhwBna() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8426bCW
    public C8486bDd KWHzl() {
        return new C8486bDd(AYXKKw(), "", "", "", "", 0, 32, null);
    }

    @Override // o.AbstractC8426bCW
    public java.util.List<C8486bDd> OLrzqt() {
        return yDY.AhwBna();
    }
}
