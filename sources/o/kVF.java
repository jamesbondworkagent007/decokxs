package o;

import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import com.okinc.business.trade.features.home.ui.meme.data.Preset;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kVF {
    public static final C2297AGi copydefault(@NotNull PresetUserParams presetUserParams) {
        Intrinsics.checkNotNullParameter(presetUserParams, "");
        java.lang.String accountId = presetUserParams.getAccountId();
        java.lang.String chainId = presetUserParams.getChainId();
        java.util.List<Preset> presets = presetUserParams.getPresets();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(presets, 10));
        java.util.Iterator<T> it = presets.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((Preset) it.next()));
        }
        return new C2297AGi(accountId, chainId, arrayList, presetUserParams.getSceneType(), presetUserParams.getUserWalletAddress());
    }

    public static final C2293AGe copydefault(Preset preset) {
        return new C2293AGe(preset.getId(), preset.getName(), preset.getPresetType(), copydefault(preset.getBuyPreset()), copydefault(preset.getSellPreset()));
    }

    public static final C4148AzQ copydefault(BuySellPresetParam buySellPresetParam) {
        return new C4148AzQ(buySellPresetParam.getFeeLevel(), buySellPresetParam.getFeeValue(), buySellPresetParam.getRouterModeType(), buySellPresetParam.getSlippageLevel() != null ? java.lang.Long.valueOf(r0.intValue()) : null, buySellPresetParam.getSlippageValue(), buySellPresetParam.getSlippageType(), buySellPresetParam.getDynamicMaxSlippageValue());
    }

    public static final PresetUserConfigBean EZpvd(@NotNull C2294AGf c2294AGf) {
        Intrinsics.checkNotNullParameter(c2294AGf, "");
        BuySellPreset buySellPresetKWHzl = KWHzl(c2294AGf.OLrzqt());
        java.lang.String strKWHzl = c2294AGf.KWHzl();
        int iEZpvd = (int) c2294AGf.EZpvd();
        java.lang.String strCopydefault = c2294AGf.copydefault();
        long jAEQbTJ = c2294AGf.AEQbTJ();
        return new PresetUserConfigBean(buySellPresetKWHzl, strKWHzl, iEZpvd, strCopydefault, java.lang.String.valueOf(jAEQbTJ), KWHzl(c2294AGf.valueOf()), c2294AGf.gEmmrt());
    }

    public static final BuySellPreset KWHzl(C2295AGg c2295AGg) {
        return new BuySellPreset(OLrzqt(c2295AGg.EZpvd()), OLrzqt(c2295AGg.KWHzl()), OLrzqt(c2295AGg.OLrzqt()));
    }

    public static final FeeConfig OLrzqt(ABG abg) {
        java.util.List<ABL> listAEQbTJ = abg.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((ABL) it.next()));
        }
        java.util.List<ABL> listKWHzl = abg.KWHzl();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it2 = listKWHzl.iterator();
        while (it2.hasNext()) {
            arrayList2.add(copydefault((ABL) it2.next()));
        }
        return new FeeConfig(arrayList, arrayList2, abg.EZpvd(), abg.gEmmrt(), abg.OLrzqt(), abg.copydefault());
    }

    public static final FeeOption copydefault(ABL abl) {
        return new FeeOption((int) abl.OLrzqt(), abl.KWHzl(), abl.EZpvd());
    }

    public static final RouteConfig OLrzqt(C2305AGq c2305AGq) {
        return new RouteConfig(java.lang.String.valueOf(c2305AGq.EZpvd()));
    }

    public static final SlippageConfigPreset OLrzqt(AGC agc) {
        java.lang.String strAEQbTJ = agc.AEQbTJ();
        java.lang.String strKWHzl = agc.KWHzl();
        java.lang.String strCopydefault = agc.copydefault();
        java.lang.String strOLrzqt = agc.OLrzqt();
        java.lang.String strEZpvd = agc.EZpvd();
        java.lang.String strAYXKKw = agc.AYXKKw();
        java.lang.String strGEmmrt = agc.gEmmrt();
        java.lang.String strValueOf = agc.valueOf();
        java.lang.String strDjBIcL = agc.djBIcL();
        java.util.List<AGB> listAhwBna = agc.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((AGB) it.next()));
        }
        return new SlippageConfigPreset(strAEQbTJ, strKWHzl, strCopydefault, strOLrzqt, strEZpvd, strAYXKKw, strGEmmrt, strValueOf, strDjBIcL, arrayList, (int) agc.isConnected());
    }

    public static final SlippageRange OLrzqt(AGB agb) {
        return new SlippageRange(agb.copydefault(), (int) agb.EZpvd(), agb.OLrzqt());
    }
}
