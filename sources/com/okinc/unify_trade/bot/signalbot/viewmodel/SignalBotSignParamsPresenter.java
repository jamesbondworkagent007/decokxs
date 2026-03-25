package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import com.google.gson.GsonBuilder;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.SignalBotSignParamsResult;
import com.okinc.unify_trade.biz.SignalBotTradingSign;
import com.okinc.unify_trade.bot.config.SignalBotActionType;
import com.okinc.unify_trade.bot.config.SignalBotTradingSignType;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C54507xKz;
import o.C56111xwe;
import o.C56402yEa;
import o.xAV;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotSignParamsPresenter extends AbsPresenter {
    public final xAV AEQbTJ;
    public final ArrayList<Fragment> EZpvd;
    public List<SignalBotTradingSign> KWHzl;
    public final C56111xwe<SignalBotSignParamsResult> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Fragment> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<SignalBotSignParamsResult> copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotSignParamsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new xAV();
        this.copydefault = new C56111xwe<>();
        this.EZpvd = new ArrayList<>();
    }

    public final void EZpvd(String str) {
        xAV xav = this.AEQbTJ;
        xav.AEQbTJ(str);
        xav.OLrzqt(this.copydefault, new C54507xKz());
        xKK.Activity.execute$default(xav, 0L, 1, null);
    }

    public final String OLrzqt(@NotNull String str, @NotNull String str2, SignalBotSignParamsResult signalBotSignParamsResult) {
        String strKWHzl;
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((Object) str, (Object) SignalBotActionType.ACTION_MAPS.getConst())) {
            Iterator<T> it = copydefault(signalBotSignParamsResult).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((SignalBotTradingSign) next).getAction(), (Object) str2)) {
                    break;
                }
            }
            SignalBotTradingSign signalBotTradingSign = (SignalBotTradingSign) next;
            if (signalBotTradingSign == null || (strKWHzl = signalBotTradingSign.getParamsJson()) == null) {
                return "";
            }
        } else {
            strKWHzl = KWHzl(signalBotSignParamsResult);
            if (strKWHzl == null) {
                return "";
            }
        }
        return strKWHzl;
    }

    public final String KWHzl(SignalBotSignParamsResult signalBotSignParamsResult) {
        List<Map<String, String>> tvActionMap;
        Map<String, String> map = (signalBotSignParamsResult == null || (tvActionMap = signalBotSignParamsResult.getTvActionMap()) == null) ? null : (Map) CollectionsKt___CollectionsKt.firstOrNull(tvActionMap);
        if (map != null) {
            return KWHzl(map);
        }
        return null;
    }

    public static /* synthetic */ List buildTradingSignList$default(SignalBotSignParamsPresenter signalBotSignParamsPresenter, SignalBotSignParamsResult signalBotSignParamsResult, int i, Object obj) {
        if ((i & 1) != 0) {
            signalBotSignParamsResult = null;
        }
        return signalBotSignParamsPresenter.copydefault(signalBotSignParamsResult);
    }

    public final List<SignalBotTradingSign> copydefault(SignalBotSignParamsResult signalBotSignParamsResult) {
        Map<String, String> map;
        List<Map<String, String>> actionMaps;
        Object next;
        List<SignalBotTradingSign> list = this.KWHzl;
        if (list == null || list.isEmpty()) {
            SignalBotTradingSignType[] signalBotTradingSignTypeArrValues = SignalBotTradingSignType.values();
            ArrayList arrayList = new ArrayList();
            for (SignalBotTradingSignType signalBotTradingSignType : signalBotTradingSignTypeArrValues) {
                if (signalBotSignParamsResult == null || (actionMaps = signalBotSignParamsResult.getActionMaps()) == null) {
                    map = null;
                } else {
                    Iterator<T> it = actionMaps.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd(((Map) next).get(BotWebHook.KEY_ACTION), (Object) signalBotTradingSignType.getConst())) {
                            break;
                        }
                    }
                    map = (Map) next;
                }
                SignalBotTradingSign signalBotTradingSign = map != null ? new SignalBotTradingSign(C33070mpX.AYXKKw(signalBotTradingSignType.getShowName()), KWHzl(map)) : null;
                if (signalBotTradingSign != null) {
                    arrayList.add(signalBotTradingSign);
                }
            }
            this.KWHzl = arrayList;
        }
        List<SignalBotTradingSign> list2 = this.KWHzl;
        return list2 == null ? yDY.AhwBna() : list2;
    }

    public final String KWHzl(Map<String, String> map) {
        try {
            String json = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create().toJson(map);
            Intrinsics.copydefault((Object) json);
            return json;
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.AEQbTJ);
    }
}
