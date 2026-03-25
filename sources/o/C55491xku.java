package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.unified.data.CeDeFiData;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55491xku {
    public static final C55491xku KWHzl = new C55491xku();

    private C55491xku() {
    }

    public final CeDeFiData OLrzqt(@NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        return new CeDeFiData(new TokenBase(dexInstrument.getChainId(), dexInstrument.getTokenContractAddress(), dexInstrument.getTokenLogoUrl(), dexInstrument.getChainLogoUrl(), (java.lang.String) null, dexInstrument.getTokenSymbol(), dexInstrument.getTokenName(), 0, C33129mqd.AhwBna(dexInstrument.getDecimals()), 0, 0, (java.lang.String) null, "default_trade", (java.lang.String) null, (java.lang.String) null, dexInstrument.getChainName(), (java.lang.String) null, 0, 0, false, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, 1073704592, (DefaultConstructorMarker) null), "CefiKline", null, "default_trade", false, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }
}
