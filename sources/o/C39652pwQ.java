package o;

import com.okinc.kline.ui.unlock.data.po.UnlockProgressInfoPo;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pwQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39652pwQ extends AbstractC49400uno<UnlockProgressInfoPo, C39706pxR> {
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C39652pwQ(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull UnlockProgressInfoPo unlockProgressInfoPo, @NotNull Continuation<? super C39706pxR> continuation) {
        double dAEQbTJ = C33129mqd.AEQbTJ(unlockProgressInfoPo.getMaxSupply());
        double dAEQbTJ2 = C33129mqd.AEQbTJ(unlockProgressInfoPo.getLocked());
        float f = (float) (dAEQbTJ2 / dAEQbTJ);
        java.lang.Double dAEQbTJ3 = C56443yFo.AEQbTJ(dAEQbTJ2);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        C39711pxW c39711pxW = new C39711pxW(pTB.formatICUCompact$default(dAEQbTJ3, roundingMode, null, null, null, 14, null), f * 100.0f);
        double dAEQbTJ4 = C33129mqd.AEQbTJ(unlockProgressInfoPo.getUnlocked());
        C39711pxW c39711pxW2 = new C39711pxW(pTB.formatICUCompact$default(C56443yFo.AEQbTJ(dAEQbTJ4), roundingMode, null, null, null, 14, null), ((float) (dAEQbTJ4 / dAEQbTJ)) * 100.0f);
        double dAEQbTJ5 = C33129mqd.AEQbTJ(unlockProgressInfoPo.getUntracked());
        C39711pxW c39711pxW3 = new C39711pxW(pTB.formatICUCompact$default(C56443yFo.AEQbTJ(dAEQbTJ5), roundingMode, null, null, null, 14, null), ((float) (dAEQbTJ5 / dAEQbTJ)) * 100.0f);
        java.lang.String notes = unlockProgressInfoPo.getNotes();
        java.lang.String dataSourceInfo = unlockProgressInfoPo.getDataSourceInfo();
        if (dataSourceInfo == null) {
            dataSourceInfo = "--";
        }
        return new C39706pxR(c39711pxW2, c39711pxW, c39711pxW3, notes, dataSourceInfo);
    }
}
