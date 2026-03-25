package com.okinc.unify_trade.bot.signalbot.viewmodel;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalPublishInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.BotSignalPublishPresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C54507xKz;
import o.C54799xVt;
import o.C55983xuI;
import o.C56193xyG;
import o.C56235xyw;
import o.C56403yEb;
import o.C59449zhJ;
import o.xAY;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotSignalPublishPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final C56193xyG AEQbTJ;
    public final xAY AYXKKw;
    public SignalPublishInfo AhwBna;
    public String AkhnZx;
    public final TradeLiveData<ArrayList<SignalCoinPairItemData>> EZpvd;
    public final TradeLiveData<StrategyConfigInfo> KWHzl;
    public final C56235xyw copydefault;
    public final TradeLiveData<SignalListItem> djBIcL;
    public boolean gEmmrt;
    public final ArrayList<SignalCoinPairItemData> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalCoinPairItemData> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<SignalCoinPairItemData>> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(SignalPublishInfo signalPublishInfo) {
        this.AhwBna = signalPublishInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.AkhnZx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAY djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SignalListItem> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalPublishInfo valueOf() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotSignalPublishPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new C56193xyG();
        this.EZpvd = new TradeLiveData<>();
        this.AYXKKw = new xAY();
        this.djBIcL = new TradeLiveData<>();
        this.copydefault = new C56235xyw();
        this.KWHzl = new TradeLiveData<>();
        this.valueOf = new ArrayList<>();
    }

    public final void OLrzqt() {
        ArrayList<SignalCoinPairItemData> value = this.EZpvd.getValue();
        if (C33129mqd.KWHzl((Collection) value)) {
            TradeLiveData<ArrayList<SignalCoinPairItemData>> tradeLiveData = this.EZpvd;
            if (value == null) {
                value = new ArrayList<>();
            }
            tradeLiveData.postValue(value);
            return;
        }
        C56193xyG c56193xyG = this.AEQbTJ;
        c56193xyG.copydefault("SWAP");
        c56193xyG.OLrzqt(this.EZpvd, new C55983xuI());
        xKK.Activity.execute$default(c56193xyG, 0L, 1, null);
    }

    public final ArrayList<SignalMultiCoinPairSelectItemData> OLrzqt(@NotNull String str) {
        ArrayList<SignalMultiCoinPairSelectItemData> arrayList;
        boolean z;
        String name;
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<SignalCoinPairItemData> value = this.EZpvd.getValue();
        if (value != null) {
            arrayList = new ArrayList<>(C56403yEb.AYXKKw(value, 10));
            for (SignalCoinPairItemData signalCoinPairItemData : value) {
                TradeCoinInfo tradeCoinInfoOLrzqt = C54799xVt.AEQbTJ.OLrzqt(signalCoinPairItemData.getCcy());
                String title = signalCoinPairItemData.getTitle();
                String titleUrl = signalCoinPairItemData.getTitleUrl();
                String instId = signalCoinPairItemData.getInstId();
                String instType = signalCoinPairItemData.getInstType();
                ArrayList<SignalCoinPairItemData> arrayList2 = this.valueOf;
                if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((SignalCoinPairItemData) it.next()).getInstId(), (Object) signalCoinPairItemData.getInstId())) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                arrayList.add(new SignalMultiCoinPairSelectItemData(title, titleUrl, instId, instType, signalCoinPairItemData.getMaxLever(), z, C33129mqd.valueOf(str, signalCoinPairItemData.getMaxLever()), null, AudioStats.AUDIO_AMPLITUDE_NONE, (tradeCoinInfoOLrzqt == null || (name = tradeCoinInfoOLrzqt.getName()) == null) ? signalCoinPairItemData.getTitle() : name, AudioStats.AUDIO_AMPLITUDE_NONE, 1408, null));
            }
        } else {
            arrayList = null;
        }
        ArrayList<SignalMultiCoinPairSelectItemData> arrayList3 = arrayList instanceof ArrayList ? arrayList : null;
        return arrayList3 == null ? new ArrayList<>() : arrayList3;
    }

    public final void copydefault(@NotNull List<? extends SignalCoinPairItemData> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf.clear();
        this.valueOf.addAll(list);
        this.gEmmrt = z;
    }

    public final void AEQbTJ(@NotNull SignalCoinPairItemData signalCoinPairItemData) {
        Intrinsics.checkNotNullParameter(signalCoinPairItemData, "");
        this.valueOf.remove(signalCoinPairItemData);
    }

    public static final CharSequence OLrzqt(SignalCoinPairItemData signalCoinPairItemData) {
        Intrinsics.checkNotNullParameter(signalCoinPairItemData, "");
        return signalCoinPairItemData.getInstId();
    }

    public final String KWHzl() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.valueOf, ",", null, null, 0, null, new Function1() { // from class: o.xuH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotSignalPublishPresenter.OLrzqt((SignalCoinPairItemData) obj);
            }
        }, 30, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        xAY xay = this.AYXKKw;
        SignalPublishInfo signalPublishInfo = this.AhwBna;
        xay.copydefault(new SignalPublishInfo(signalPublishInfo != null ? signalPublishInfo.getSignalChanId() : null, str, str2, this.AkhnZx, str3, str4, KWHzl(), (String) null, this.gEmmrt ? "1" : "2", str6, str5, 128, (DefaultConstructorMarker) null));
        xay.OLrzqt(this.djBIcL, new C54507xKz());
        xKK.Activity.execute$default(xay, 0L, 1, null);
    }

    public final void AEQbTJ() {
        C56235xyw c56235xyw = this.copydefault;
        c56235xyw.KWHzl("signal_bot");
        c56235xyw.AEQbTJ("BTC-USDT-SWAP");
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final boolean AEQbTJ(@NotNull String str) {
        Pair pair;
        Intrinsics.checkNotNullParameter(str, "");
        String string = StringsKt__StringsKt.hDKMBd((CharSequence) str).toString();
        if (string.length() == 0) {
            return false;
        }
        boolean zStartsWith$default = C59449zhJ.startsWith$default(str, "[", false, 2, null);
        boolean zStartsWith$default2 = C59449zhJ.startsWith$default(str, "【", false, 2, null);
        boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "]", false, 2, (Object) null);
        boolean zContains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "】", false, 2, (Object) null);
        boolean z = zStartsWith$default && zContains$default;
        boolean z2 = zStartsWith$default2 && zContains$default2;
        if (zStartsWith$default && zContains$default2) {
            return false;
        }
        if (zStartsWith$default2 && zContains$default) {
            return false;
        }
        if (z) {
            pair = new Pair("[", "]");
        } else {
            if (!z2) {
                return false;
            }
            pair = new Pair("【", "】");
        }
        String str2 = (String) pair.component1();
        String str3 = (String) pair.component2();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str3, 0, false, 6, (Object) null);
        if (iIndexOf$default <= 1) {
            return false;
        }
        String strSubstring = str.substring(str2.length(), iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        if (StringsKt__StringsKt.hDKMBd((CharSequence) strSubstring).toString().length() == 0) {
            return false;
        }
        String strSubstring2 = str.substring(iIndexOf$default + str3.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        if (StringsKt__StringsKt.hDKMBd((CharSequence) strSubstring2).toString().length() == 0) {
            return false;
        }
        return new Regex("^\\Q" + str2 + "\\E[^\\Q" + str2 + "\\E\\Q" + str3 + "\\E]+\\Q" + str3 + "\\E\\s*\\S+.*$").matches(string);
    }

    public final void OLrzqt(@NotNull ArrayList<SignalCoinPairItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.valueOf.removeAll(CollectionsKt___CollectionsKt.OqFWZa(arrayList));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.AYXKKw, this.copydefault);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.BotSignalPublishPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final String values() {
        ArrayList<SignalCoinPairItemData> arrayList = this.valueOf;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SignalCoinPairItemData signalCoinPairItemData : arrayList) {
            arrayList2.add(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, signalCoinPairItemData.getInstId(), signalCoinPairItemData.getInstType(), false, false, 12, null));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null);
    }
}
