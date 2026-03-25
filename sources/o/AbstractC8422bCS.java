package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bCS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8422bCS extends AbstractC8426bCW<C8484bDb> {
    public final FeeType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8426bCW
    public FeeType copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8422bCS(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        this.OLrzqt = FeeType.FEE_TYPE_FIXED;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/bDd; */
    @Override // o.AbstractC8426bCW
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C8484bDb KWHzl() {
        return new C8484bDb(AYXKKw(), AEQbTJ());
    }

    @Override // o.AbstractC8426bCW
    public java.util.List<C8484bDb> OLrzqt() {
        return C56402yEa.EZpvd(KWHzl());
    }
}
