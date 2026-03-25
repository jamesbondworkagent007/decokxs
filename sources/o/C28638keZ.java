package o;

import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.market.features.meme.data.model.NewTokenWsData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28638keZ {
    public static final C28638keZ copydefault = new C28638keZ();

    private C28638keZ() {
    }

    public final C28635keW AEQbTJ(@NotNull NewTokenWsData newTokenWsData) {
        Intrinsics.checkNotNullParameter(newTokenWsData, "");
        java.lang.String chainIndex = newTokenWsData.getChainIndex();
        java.lang.String tokenContractAddress = newTokenWsData.getTokenContractAddress();
        java.lang.String tokenSymbol = newTokenWsData.getTokenSymbol();
        return new C28635keW(chainIndex, newTokenWsData.getTokenName(), tokenSymbol, newTokenWsData.getTokenLogo(), null, false, newTokenWsData.getBigLogo(), tokenContractAddress, newTokenWsData.getCreateTime(), newTokenWsData.getCreator(), newTokenWsData.getTxs1h(), newTokenWsData.getTxsb1h(), newTokenWsData.getTxss1h(), newTokenWsData.getVol1h(), newTokenWsData.getMcap(), newTokenWsData.getFee(), newTokenWsData.getBots(), newTokenWsData.getHold(), newTokenWsData.getTop10HoldRto(), newTokenWsData.getDevHoldRto(), newTokenWsData.getSuspHoldRto(), newTokenWsData.getSniperBuy(), newTokenWsData.getSniperCnt(), newTokenWsData.getSniperHoldingRatio(), newTokenWsData.getBundHoldRto(), newTokenWsData.getFreshHoldRto(), newTokenWsData.getSuspPhishHoldRto(), newTokenWsData.getCreatorMigrCnt(), newTokenWsData.getTagData(), newTokenWsData.getMigrBegin(), newTokenWsData.getMigrEnd(), newTokenWsData.getProgress(), newTokenWsData.getProtocolId(), newTokenWsData.getExtProtocolId(), "0", "0", newTokenWsData.getProjectLink(), C28629keQ.KWHzl.copydefault(newTokenWsData.getMedia()), false, 0L, null, null, 48, FaceDetector.NUM_BOXES, null);
    }
}
