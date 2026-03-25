package o;

import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexui.main.swap.widget.SettingItemData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24469ieS extends ViewOnClickListenerC25336ium {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24469ieS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24469ieS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24469ieS(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void setSlippagePanel$default(C24469ieS c24469ieS, boolean z, AbstractC23101hrq abstractC23101hrq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c24469ieS.setSlippagePanel(z, abstractC23101hrq);
    }

    public final void setSlippagePanel(boolean z, @NotNull AbstractC23101hrq abstractC23101hrq) {
        QuotePriceRes quotePriceResAxsJAYsNCnLh;
        java.lang.String strAutoSlippage;
        DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        setClickable(z);
        QuotePriceRes quotePriceResAxsJAYsNCnLh2 = abstractC23101hrq.AxsJAYsNCnLh();
        if ((quotePriceResAxsJAYsNCnLh2 != null && quotePriceResAxsJAYsNCnLh2.isRiskToken()) || ((quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh()) != null && quotePriceResAxsJAYsNCnLh.crossChainAndOnlyBridge())) {
            setClickable(false);
        }
        C25416iwM c25416iwMDCUTEI = abstractC23101hrq.DCUTEI();
        QuotePriceRes quotePriceResAxsJAYsNCnLh3 = abstractC23101hrq.AxsJAYsNCnLh();
        java.lang.String referenceSlippage = null;
        java.lang.String strOLrzqt = c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh3 != null ? quotePriceResAxsJAYsNCnLh3.autoSlippage() : null);
        QuotePriceRes quotePriceResAxsJAYsNCnLh4 = abstractC23101hrq.AxsJAYsNCnLh();
        java.lang.String strAutoSlippage2 = quotePriceResAxsJAYsNCnLh4 != null ? quotePriceResAxsJAYsNCnLh4.autoSlippage() : null;
        if (strAutoSlippage2 == null) {
            strAutoSlippage2 = "";
        }
        boolean zEZpvd = abstractC23101hrq.DCUTEI().EZpvd();
        QuotePriceRes quotePriceResAxsJAYsNCnLh5 = abstractC23101hrq.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh5 != null && (dexAutoSlippageInfoParamAutoSlippageInfo = quotePriceResAxsJAYsNCnLh5.autoSlippageInfo()) != null) {
            referenceSlippage = dexAutoSlippageInfoParamAutoSlippageInfo.getReferenceSlippage();
        }
        if (referenceSlippage != null && referenceSlippage.length() != 0) {
            strAutoSlippage2 = referenceSlippage;
        }
        setSlipSettingTokenType(abstractC23101hrq.QUSxYX().values(), (C23313hvq.OLrzqt(strAutoSlippage2, abstractC23101hrq.DCUTEI().OLrzqt()) && !zEZpvd) || (zEZpvd && C23313hvq.KWHzl(strOLrzqt, strAutoSlippage2)) || ((zEZpvd && !(C23313hvq.EZpvd(strOLrzqt, strAutoSlippage2) && C23313hvq.KWHzl(strOLrzqt, java.lang.Double.valueOf(0.1d)))) || (zEZpvd && C23313hvq.EZpvd(strOLrzqt, java.lang.Double.valueOf(0.1d)))), abstractC23101hrq.QUSxYX().AYXKKw());
        QuotePriceRes quotePriceResAxsJAYsNCnLh6 = abstractC23101hrq.AxsJAYsNCnLh();
        setShowSlipPriceFluctuation(quotePriceResAxsJAYsNCnLh6 != null && quotePriceResAxsJAYsNCnLh6.isShowFluctuateTipsColor());
        SettingItemData settingItemDataOLrzqt = OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        ConsumeData consumeDataEZpvd = C22332hdP.EZpvd(strOLrzqt);
        ConsumeData consumeDataEZpvd2 = C22332hdP.EZpvd(java.lang.Boolean.valueOf(isClickable()));
        ConsumeData consumeDataEZpvd3 = C22332hdP.EZpvd(abstractC23101hrq.QVAiDq().KWHzl());
        QuotePriceRes quotePriceResAxsJAYsNCnLh7 = abstractC23101hrq.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh7 != null && (strAutoSlippage = quotePriceResAxsJAYsNCnLh7.autoSlippage()) != null) {
            str = strAutoSlippage;
        }
        setSettingItemData(settingItemDataOLrzqt.copy((393 & 1) != 0 ? settingItemDataOLrzqt.title : null, (393 & 2) != 0 ? settingItemDataOLrzqt.content : consumeDataEZpvd, (393 & 4) != 0 ? settingItemDataOLrzqt.type : SettingItemData.SettingType.SLIPPAGE, (393 & 8) != 0 ? settingItemDataOLrzqt.isTitleHintImg : null, (393 & 16) != 0 ? settingItemDataOLrzqt.isTagImg : consumeDataEZpvd2, (393 & 32) != 0 ? settingItemDataOLrzqt.autoSlip : C22332hdP.EZpvd(str), (393 & 64) != 0 ? settingItemDataOLrzqt.minSlip : consumeDataEZpvd3, (393 & 128) != 0 ? settingItemDataOLrzqt.data : null, (393 & 256) != 0 ? settingItemDataOLrzqt.isShowUnderLine : null, (393 & 512) != 0 ? settingItemDataOLrzqt.minimumReceived : abstractC23101hrq.fFgQHt(), (393 & 1024) != 0 ? settingItemDataOLrzqt.isSingleChain : abstractC23101hrq.Dmq(), (393 & 2048) != 0 ? settingItemDataOLrzqt.mevSupportedChainUrl : abstractC23101hrq.dxcTrN()), zEZpvd);
    }
}
