package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kYw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28369kYw implements InterfaceC28370kYx {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.kYw$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.Map<java.lang.String, ? extends java.lang.String>> {
    }

    /* JADX INFO: renamed from: o.kYw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kYw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @yCM
    public C28369kYw() {
    }

    @Override // o.InterfaceC28370kYx
    public TradingType copydefault() {
        TradingType tradingType = TradingType.Swap;
        java.lang.String string = SPUtils.getString("tradingType_", tradingType.getTypeValue(), "dex_trading_local_config");
        TradingType.TaskDescription taskDescription = TradingType.Companion;
        Intrinsics.copydefault((java.lang.Object) string);
        TradingType tradingTypeKWHzl = taskDescription.KWHzl(string);
        if (!tradingTypeKWHzl.getNeedCache()) {
            tradingTypeKWHzl = null;
        }
        return tradingTypeKWHzl == null ? tradingType : tradingTypeKWHzl;
    }

    @Override // o.InterfaceC28370kYx
    public void copydefault(@NotNull TradingType tradingType) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        if (tradingType.getNeedCache()) {
            SPUtils.put("tradingType_", tradingType.getTypeValue(), "dex_trading_local_config");
        }
    }

    @Override // o.InterfaceC28370kYx
    public void KWHzl(boolean z) {
        SPUtils.put("isTradingModeSelectionGuideShown1", java.lang.Boolean.valueOf(z), "dex_trading_local_config");
    }

    public boolean KWHzl() {
        return SPUtils.getBoolean("key_dex_show_meme_preset_guide", true, "dex_trading_local_config");
    }

    public void EZpvd(boolean z) {
        SPUtils.put("key_dex_show_meme_preset_guide", java.lang.Boolean.valueOf(z), "dex_trading_local_config");
    }

    @Override // o.InterfaceC28370kYx
    public java.util.List<java.lang.String> AEQbTJ() {
        java.lang.String string = SPUtils.getString("tokenListCustomChainTabList", "", "dex_trading_local_config");
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC28370kYx
    public void copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.put("tokenListCustomChainTabList", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), "dex_trading_local_config");
    }

    @Override // o.InterfaceC28370kYx
    public java.lang.String EZpvd() {
        java.lang.String string = SPUtils.getString("orderAndPositionTab", "", "dex_trading_local_config");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC28370kYx
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("orderAndPositionTab", str, "dex_trading_local_config");
    }

    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string = SPUtils.getString("valuationToken", "{}", "dex_trading_local_config");
        if (string == null) {
            objM7377constructorimpl = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C23316hvt.KWHzl().fromJson(string, new TaskDescription().getType()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JsonExt", "fromJson parse error", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = null;
            }
        }
        java.util.Map<java.lang.String, java.lang.String> map = (java.util.Map) objM7377constructorimpl;
        return map == null ? C56424yEw.KWHzl() : map;
    }

    @Override // o.InterfaceC28370kYx
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = OLrzqt().get(str);
        return str2 == null ? "" : str2;
    }

    @Override // o.InterfaceC28370kYx
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.Map mapIsConnected = C56424yEw.isConnected(OLrzqt());
        mapIsConnected.put(str, str2);
        SPUtils.put("valuationToken", C23316hvt.OLrzqt(mapIsConnected), "dex_trading_local_config");
    }
}
