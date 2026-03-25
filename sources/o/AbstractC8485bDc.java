package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import kotlin.jvm.internal.Intrinsics;
import o.C8491bDi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8485bDc<FeeItem extends C8491bDi> extends AbstractC8426bCW<FeeItem> {
    public final FeeType AhwBna;
    public int OLrzqt;

    public abstract void AEQbTJ(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.OLrzqt;
    }

    public abstract FeeItem EZpvd(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8426bCW
    public FeeType copydefault() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8485bDc(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        this.AhwBna = FeeType.FEE_TYPE_SELECTED;
        this.OLrzqt = 32;
    }

    public final void copydefault(int i) {
        this.OLrzqt = i;
        AEQbTJ(i);
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return KWHzl().getFeeAmount();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/bDd; */
    @Override // o.AbstractC8426bCW
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public FeeItem KWHzl() {
        return (FeeItem) EZpvd(this.OLrzqt);
    }

    public int fetchVPNInfo() {
        int iDbNXlk = DbNXlk();
        if (iDbNXlk == 4) {
            return 6;
        }
        if (iDbNXlk != 31) {
            return iDbNXlk != 33 ? 4 : 5;
        }
        return 3;
    }
}
