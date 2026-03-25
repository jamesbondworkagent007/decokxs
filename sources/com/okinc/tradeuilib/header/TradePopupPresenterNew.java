package com.okinc.tradeuilib.header;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.ibm.icu.text.DateFormat;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradeuilib.header.TradePopupPresenterNew;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.header.CacheSource;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.C33129mqd;
import o.C43251rlk;
import o.C49673usw;
import o.C54586xNw;
import o.C54589xNz;
import o.C55697xoo;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC49425uoM;
import o.InterfaceC49429uoQ;
import o.InterfaceC49497upf;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.pUU;
import o.xKK;
import o.xLY;
import o.xND;
import o.xOU;
import o.xVL;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TradePopupPresenterNew extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public ArrayList<TokenBusinessData> AYXKKw;
    public final CacheSource AhwBna;
    public String AkhnZx;
    public final boolean DbNXlk;
    public ArrayList<TokenBusinessData> EZpvd;
    public TokenBusinessData KWHzl;
    public Function2<? super ArrayList<TokenBusinessData>, ? super Boolean, Unit> copydefault;
    public ArrayList<TokenBusinessData> djBIcL;
    public final InterfaceC56387yDm fJNWhG;
    public final TokenBusinessData fetchVPNInfo;
    public TokenBusinessData gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final C49673usw values;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CacheSource.values().length];
            try {
                iArr[CacheSource.HEADER_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheSource.POPUP_WINDOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheSource.POPUP_WINDOW_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheSource.HEADER_VIEW_LITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TokenBusinessData> DbNXlk() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function2<? super ArrayList<TokenBusinessData>, ? super Boolean, Unit> function2) {
        this.copydefault = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return "[\n  {\n    \"available\": true,\n    \"instrumentName\": \"\",\n    \"instType\": \"CONVERT\",\n    \"baseSymbol\": \"\",\n    \"quoteSymbol\": \"\",\n    \"index\": \"\",\n    \"isPositive\": true,\n    \"leverage\": \"\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false,\n    \"isDefaultDisplayList\": true\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"BTC-USD\",\n    \"instType\": \"SPOT\",\n    \"baseSymbol\": \"BTC\",\n    \"quoteSymbol\": \"USD\",\n    \"index\": \"BTC-USD\",\n    \"isPositive\": false,\n    \"leverage\": \"BTC-USDⓈ\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false,\n    \"isDefaultDisplayList\": true\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"BTC-USD-SWAP\",\n    \"instType\": \"SWAP\",\n    \"baseSymbol\": \"BTC\",\n    \"quoteSymbol\": \"USD\",\n    \"index\": \"BTC-USD\",\n    \"isPositive\": false,\n    \"leverage\": \"BTC-USD-SWAP\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false,\n    \"isDefaultDisplayList\": true\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"\",\n    \"instType\": \"BOTS\",\n    \"baseSymbol\": \"\",\n    \"quoteSymbol\": \"\",\n    \"index\": \"\",\n    \"isPositive\": true,\n    \"leverage\": \"\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false,\n    \"isDefaultDisplayList\": true\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"\",\n    \"instType\": \"COPYTRADING\",\n    \"baseSymbol\": \"\",\n    \"quoteSymbol\": \"\",\n    \"index\": \"\",\n    \"isPositive\": true,\n    \"leverage\": \"\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false,\n    \"isDefaultDisplayList\": true\n  },\n  {\n    \"available\": true,\n    \"instType\": \"OPTION\",\n    \"baseSymbol\": \"BTC\",\n    \"quoteSymbol\": \"USD\",\n    \"index\": \"BTC-USD\",\n    \"isPositive\": false,\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false,\n    \"isDefaultDisplayList\": true\n  }\n]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return "[\n  {\n    \"available\": true,\n    \"instrumentName\": \"BTC-USD\",\n    \"instType\": \"SPOT\",\n    \"baseSymbol\": \"BTC\",\n    \"quoteSymbol\": \"USD\",\n    \"index\": \"BTC-USD\",\n    \"isPositive\": false,\n    \"leverage\": \"BTC-USDⓈ\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false,\n    \"isDefaultDisplayList\": true\n  }\n]";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.app.Application)
  (r2v0 androidx.lifecycle.SavedStateHandle)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:com.okinc.unify_trade.header.CacheSource:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.header.CacheSource:0x0009: SGET  A[WRAPPED] (LINE:67) com.okinc.unify_trade.header.CacheSource.POPUP_WINDOW com.okinc.unify_trade.header.CacheSource) : (r4v0 com.okinc.unify_trade.header.CacheSource))
 A[MD:(android.app.Application, androidx.lifecycle.SavedStateHandle, boolean, com.okinc.unify_trade.header.CacheSource):void (m)] (LINE:63) call: com.okinc.tradeuilib.header.TradePopupPresenterNew.<init>(android.app.Application, androidx.lifecycle.SavedStateHandle, boolean, com.okinc.unify_trade.header.CacheSource):void type: THIS */
    public /* synthetic */ TradePopupPresenterNew(android.app.Application application, SavedStateHandle savedStateHandle, boolean z, CacheSource cacheSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, savedStateHandle, (i & 4) != 0 ? true : z, (i & 8) != 0 ? CacheSource.POPUP_WINDOW : cacheSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradePopupPresenterNew(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle, boolean z, CacheSource cacheSource) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.DbNXlk = z;
        this.AhwBna = cacheSource;
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.usQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradePopupPresenterNew.AEQbTJ();
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.usZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradePopupPresenterNew.djBIcL();
            }
        });
        this.values = new C49673usw(application, z);
        this.AkhnZx = "SPOT";
        this.EZpvd = new ArrayList<>();
        this.djBIcL = new ArrayList<>();
        this.AYXKKw = new ArrayList<>();
        this.KWHzl = new TokenBusinessData(true, (String) null, "BOTS", (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131066, (DefaultConstructorMarker) null);
        this.gEmmrt = new TokenBusinessData(true, (String) null, "CONVERT", (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131066, (DefaultConstructorMarker) null);
        this.fetchVPNInfo = new TokenBusinessData(true, (String) null, "COPYTRADING", (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131066, (DefaultConstructorMarker) null);
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.usN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradePopupPresenterNew.EZpvd();
            }
        });
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.header.TradePopupPresenterNew.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final xLY values() {
        return (xLY) this.isConnected.getValue();
    }

    public static final xLY AEQbTJ() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    private final InterfaceC49429uoQ hDKMBd() {
        return (InterfaceC49429uoQ) this.fJNWhG.getValue();
    }

    public static final InterfaceC49429uoQ djBIcL() {
        return (InterfaceC49429uoQ) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_SWITCH);
    }

    @Serializable
    public static final class BizLineCacheItem {
        public static final Companion Companion = new Companion(null);
        private final boolean available;
        private final String baseSymbol;
        private final String changePercent;
        private final String coinUrl;
        private final String index;
        private final String instType;
        private final String instrumentName;
        private final boolean isDefaultDisplayList;
        private final boolean isPositive;
        private final boolean isPreMarket;
        private final boolean isWatching;
        private final String leverage;
        private final int pos;
        private final String price;
        private final String quoteSymbol;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BizLineCacheItem() {
            this(false, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, 0, false, false, 32767, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.available;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.changePercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.coinUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component13() {
            return this.pos;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component14() {
            return this.isPreMarket;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component15() {
            return this.isDefaultDisplayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.instrumentName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.baseSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.quoteSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.isPositive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.leverage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isWatching;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BizLineCacheItem copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, boolean z3, @NotNull String str7, @NotNull String str8, String str9, int i, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new BizLineCacheItem(z, str, str2, str3, str4, str5, z2, str6, z3, str7, str8, str9, i, z4, z5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BizLineCacheItem)) {
                return false;
            }
            BizLineCacheItem bizLineCacheItem = (BizLineCacheItem) obj;
            return this.available == bizLineCacheItem.available && Intrinsics.EZpvd((Object) this.instrumentName, (Object) bizLineCacheItem.instrumentName) && Intrinsics.EZpvd((Object) this.instType, (Object) bizLineCacheItem.instType) && Intrinsics.EZpvd((Object) this.baseSymbol, (Object) bizLineCacheItem.baseSymbol) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) bizLineCacheItem.quoteSymbol) && Intrinsics.EZpvd((Object) this.index, (Object) bizLineCacheItem.index) && this.isPositive == bizLineCacheItem.isPositive && Intrinsics.EZpvd((Object) this.leverage, (Object) bizLineCacheItem.leverage) && this.isWatching == bizLineCacheItem.isWatching && Intrinsics.EZpvd((Object) this.price, (Object) bizLineCacheItem.price) && Intrinsics.EZpvd((Object) this.changePercent, (Object) bizLineCacheItem.changePercent) && Intrinsics.EZpvd((Object) this.coinUrl, (Object) bizLineCacheItem.coinUrl) && this.pos == bizLineCacheItem.pos && this.isPreMarket == bizLineCacheItem.isPreMarket && this.isDefaultDisplayList == bizLineCacheItem.isDefaultDisplayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getAvailable() {
            return this.available;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseSymbol() {
            return this.baseSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChangePercent() {
            return this.changePercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinUrl() {
            return this.coinUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIndex() {
            return this.index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstType() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstrumentName() {
            return this.instrumentName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLeverage() {
            return this.leverage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPos() {
            return this.pos;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteSymbol() {
            return this.quoteSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.available);
            int iHashCode2 = this.instrumentName.hashCode();
            int iHashCode3 = this.instType.hashCode();
            int iHashCode4 = this.baseSymbol.hashCode();
            int iHashCode5 = this.quoteSymbol.hashCode();
            int iHashCode6 = this.index.hashCode();
            int iHashCode7 = Boolean.hashCode(this.isPositive);
            int iHashCode8 = this.leverage.hashCode();
            int iHashCode9 = Boolean.hashCode(this.isWatching);
            int iHashCode10 = this.price.hashCode();
            int iHashCode11 = this.changePercent.hashCode();
            String str = this.coinUrl;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.pos)) * 31) + Boolean.hashCode(this.isPreMarket)) * 31) + Boolean.hashCode(this.isDefaultDisplayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isDefaultDisplayList() {
            return this.isDefaultDisplayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isPositive() {
            return this.isPositive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isPreMarket() {
            return this.isPreMarket;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWatching() {
            return this.isWatching;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BizLineCacheItem(available=" + this.available + ", instrumentName=" + this.instrumentName + ", instType=" + this.instType + ", baseSymbol=" + this.baseSymbol + ", quoteSymbol=" + this.quoteSymbol + ", index=" + this.index + ", isPositive=" + this.isPositive + ", leverage=" + this.leverage + ", isWatching=" + this.isWatching + ", price=" + this.price + ", changePercent=" + this.changePercent + ", coinUrl=" + this.coinUrl + ", pos=" + this.pos + ", isPreMarket=" + this.isPreMarket + ", isDefaultDisplayList=" + this.isDefaultDisplayList + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.header.TradePopupPresenterNew.BizLineCacheItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BizLineCacheItem> serializer() {
                return TradePopupPresenterNew$BizLineCacheItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BizLineCacheItem(int i, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, String str8, String str9, int i2, boolean z4, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.available = false;
            } else {
                this.available = z;
            }
            if ((i & 2) == 0) {
                this.instrumentName = "";
            } else {
                this.instrumentName = str;
            }
            if ((i & 4) == 0) {
                this.instType = "";
            } else {
                this.instType = str2;
            }
            if ((i & 8) == 0) {
                this.baseSymbol = "";
            } else {
                this.baseSymbol = str3;
            }
            if ((i & 16) == 0) {
                this.quoteSymbol = "";
            } else {
                this.quoteSymbol = str4;
            }
            if ((i & 32) == 0) {
                this.index = "";
            } else {
                this.index = str5;
            }
            this.isPositive = (i & 64) == 0 ? true : z2;
            if ((i & 128) == 0) {
                this.leverage = "";
            } else {
                this.leverage = str6;
            }
            if ((i & 256) == 0) {
                this.isWatching = false;
            } else {
                this.isWatching = z3;
            }
            if ((i & 512) == 0) {
                this.price = "- -";
            } else {
                this.price = str7;
            }
            if ((i & 1024) == 0) {
                this.changePercent = "- -";
            } else {
                this.changePercent = str8;
            }
            if ((i & 2048) == 0) {
                this.coinUrl = "";
            } else {
                this.coinUrl = str9;
            }
            if ((i & 4096) == 0) {
                this.pos = 0;
            } else {
                this.pos = i2;
            }
            if ((i & 8192) == 0) {
                this.isPreMarket = false;
            } else {
                this.isPreMarket = z4;
            }
            if ((i & 16384) == 0) {
                this.isDefaultDisplayList = false;
            } else {
                this.isDefaultDisplayList = z5;
            }
        }

        public static final /* synthetic */ void write$Self$OKTradeUILib_trade_ui(BizLineCacheItem bizLineCacheItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bizLineCacheItem.available) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, bizLineCacheItem.available);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bizLineCacheItem.instrumentName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, bizLineCacheItem.instrumentName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bizLineCacheItem.instType, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, bizLineCacheItem.instType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bizLineCacheItem.baseSymbol, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, bizLineCacheItem.baseSymbol);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bizLineCacheItem.quoteSymbol, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, bizLineCacheItem.quoteSymbol);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) bizLineCacheItem.index, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 5, bizLineCacheItem.index);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !bizLineCacheItem.isPositive) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 6, bizLineCacheItem.isPositive);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) bizLineCacheItem.leverage, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 7, bizLineCacheItem.leverage);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || bizLineCacheItem.isWatching) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 8, bizLineCacheItem.isWatching);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) bizLineCacheItem.price, (Object) "- -")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 9, bizLineCacheItem.price);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) bizLineCacheItem.changePercent, (Object) "- -")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 10, bizLineCacheItem.changePercent);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) bizLineCacheItem.coinUrl, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, bizLineCacheItem.coinUrl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || bizLineCacheItem.pos != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 12, bizLineCacheItem.pos);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || bizLineCacheItem.isPreMarket) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 13, bizLineCacheItem.isPreMarket);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || bizLineCacheItem.isDefaultDisplayList) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 14, bizLineCacheItem.isDefaultDisplayList);
            }
        }

        public BizLineCacheItem(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, boolean z3, @NotNull String str7, @NotNull String str8, String str9, int i, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.available = z;
            this.instrumentName = str;
            this.instType = str2;
            this.baseSymbol = str3;
            this.quoteSymbol = str4;
            this.index = str5;
            this.isPositive = z2;
            this.leverage = str6;
            this.isWatching = z3;
            this.price = str7;
            this.changePercent = str8;
            this.coinUrl = str9;
            this.pos = i;
            this.isPreMarket = z4;
            this.isDefaultDisplayList = z5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("- -") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : ("- -"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0075: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 boolean) : false)
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void (m)] (LINE:100) call: com.okinc.tradeuilib.header.TradePopupPresenterNew.BizLineCacheItem.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void type: THIS */
        public /* synthetic */ BizLineCacheItem(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, String str8, String str9, int i, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? "- -" : str7, (i2 & 1024) == 0 ? str8 : "- -", (i2 & 2048) == 0 ? str9 : "", (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) == 0 ? z5 : false);
        }
    }

    public final Json fetchVPNInfo() {
        return (Json) this.valueOf.getValue();
    }

    public static final Json EZpvd() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.usS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradePopupPresenterNew.copydefault((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setEncodeDefaults(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AYXKKw() {
        String str;
        CacheSource cacheSource = this.AhwBna;
        int i = cacheSource == null ? -1 : TaskDescription.AEQbTJ[cacheSource.ordinal()];
        if (i == 1) {
            str = "key_trade_switch_biz_list_cache";
        } else if (i == 2) {
            str = "key_trade_popup_biz_list_cache";
        } else if (i == 3) {
            str = "key_trade_popup_biz_list_cache_lite";
        } else if (i == 4) {
            str = "key_trade_switch_biz_list_cache_lite";
        }
        String str2 = (this.DbNXlk && this.AhwBna == CacheSource.POPUP_WINDOW) ? "-premarket" : "";
        return str + "-" + C55697xoo.OLrzqt.gEmmrt() + str2;
    }

    public static final class StateListAnimator {
        public final ArrayList<TokenBusinessData> EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradeuilib.header.TradePopupPresenterNew$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, ArrayList arrayList, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayList = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(arrayList, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<TokenBusinessData> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull ArrayList<TokenBusinessData> arrayList, boolean z) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            return new StateListAnimator(arrayList, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CachedBusinessListResult(list=" + this.EZpvd + ", isDefaultDisplayList=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull ArrayList<TokenBusinessData> arrayList, boolean z) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.EZpvd = arrayList;
            this.OLrzqt = z;
        }
    }

    public final StateListAnimator getFieldNames() {
        String string = SPUtils.getString(AYXKKw(), "");
        String str = string != null ? string : "";
        String strGEmmrt = gEmmrt();
        String strIsConnected = isConnected();
        boolean z = true;
        if (str.length() == 0 || Intrinsics.EZpvd((Object) str, (Object) strGEmmrt) || Intrinsics.EZpvd((Object) str, (Object) strIsConnected)) {
            if (fARcdN()) {
                ArrayList<TokenBusinessData> arrayListAuCTel = AuCTel();
                if (arrayListAuCTel != null) {
                    return new StateListAnimator(arrayListAuCTel, true);
                }
                return null;
            }
            ArrayList<TokenBusinessData> arrayListFIwbmz = fIwbmz();
            if (arrayListFIwbmz != null) {
                return new StateListAnimator(arrayListFIwbmz, true);
            }
            return null;
        }
        try {
            List<BizLineCacheItem> list = (List) fetchVPNInfo().decodeFromString(BuiltinSerializersKt.ListSerializer(BizLineCacheItem.Companion.serializer()), str);
            BizLineCacheItem bizLineCacheItem = (BizLineCacheItem) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (bizLineCacheItem == null || !bizLineCacheItem.isDefaultDisplayList()) {
                z = false;
            }
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (BizLineCacheItem bizLineCacheItem2 : list) {
                arrayList.add(new TokenBusinessData(bizLineCacheItem2.getAvailable(), bizLineCacheItem2.getInstrumentName(), bizLineCacheItem2.getInstType(), bizLineCacheItem2.getBaseSymbol(), bizLineCacheItem2.getQuoteSymbol(), bizLineCacheItem2.getIndex(), bizLineCacheItem2.isPositive(), bizLineCacheItem2.getLeverage(), bizLineCacheItem2.isWatching(), bizLineCacheItem2.getPrice(), bizLineCacheItem2.getChangePercent(), bizLineCacheItem2.getCoinUrl(), (BizInstrument) null, false, bizLineCacheItem2.getPos(), bizLineCacheItem2.isPreMarket(), (String) null, 65536, (DefaultConstructorMarker) null));
            }
            return new StateListAnimator(new ArrayList(arrayList), z);
        } catch (Throwable th) {
            pUU.AEQbTJ("TradePopupPresenterNew", "readCachedBusinessList: failed to parse cache", th);
            return null;
        }
    }

    public final boolean fARcdN() {
        CacheSource cacheSource = this.AhwBna;
        return cacheSource == CacheSource.POPUP_WINDOW_LITE || cacheSource == CacheSource.HEADER_VIEW_LITE;
    }

    public final ArrayList<TokenBusinessData> AEQbTJ(String str, String str2) {
        try {
            List list = (List) fetchVPNInfo().decodeFromString(BuiltinSerializersKt.ListSerializer(BizLineCacheItem.Companion.serializer()), str);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                BizLineCacheItem bizLineCacheItem = (BizLineCacheItem) it.next();
                arrayList.add(new TokenBusinessData(bizLineCacheItem.getAvailable(), bizLineCacheItem.getInstrumentName(), bizLineCacheItem.getInstType(), bizLineCacheItem.getBaseSymbol(), bizLineCacheItem.getQuoteSymbol(), bizLineCacheItem.getIndex(), bizLineCacheItem.isPositive(), bizLineCacheItem.getLeverage(), bizLineCacheItem.isWatching(), bizLineCacheItem.getPrice(), bizLineCacheItem.getChangePercent(), bizLineCacheItem.getCoinUrl(), (BizInstrument) null, false, bizLineCacheItem.getPos(), bizLineCacheItem.isPreMarket(), (String) null, 65536, (DefaultConstructorMarker) null));
            }
            ArrayList<TokenBusinessData> arrayList2 = new ArrayList<>(arrayList);
            pUU.KWHzl("TradePopupPresenterNew", str2 + ": success, size=" + arrayList2.size());
            return arrayList2;
        } catch (Throwable th) {
            pUU.AEQbTJ("TradePopupPresenterNew", str2 + ": failed to parse", th);
            return null;
        }
    }

    public final ArrayList<TokenBusinessData> AuCTel() {
        return AEQbTJ(isConnected(), "parseDefaultLiteBizList");
    }

    public final ArrayList<TokenBusinessData> fIwbmz() {
        return AEQbTJ(gEmmrt(), "parseDefaultBizList");
    }

    public final void OLrzqt(List<TokenBusinessData> list) {
        try {
            String strAYXKKw = AYXKKw();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                TokenBusinessData tokenBusinessData = (TokenBusinessData) it.next();
                arrayList.add(new BizLineCacheItem(tokenBusinessData.getAvailable(), tokenBusinessData.getInstrumentName(), tokenBusinessData.getInstType(), tokenBusinessData.getBaseSymbol(), tokenBusinessData.getQuoteSymbol(), tokenBusinessData.getIndex(), tokenBusinessData.isPositive(), tokenBusinessData.getLeverage(), tokenBusinessData.isWatching(), tokenBusinessData.getPrice(), tokenBusinessData.getChangePercent(), tokenBusinessData.getCoinUrl(), tokenBusinessData.getPos(), tokenBusinessData.isPreMarket(), false, 16384, (DefaultConstructorMarker) null));
            }
            SPUtils.put(strAYXKKw, fetchVPNInfo().encodeToString(BuiltinSerializersKt.ListSerializer(BizLineCacheItem.Companion.serializer()), arrayList));
        } catch (Throwable th) {
            pUU.AEQbTJ("TradePopupPresenterNew", "writeCachedBusinessList: failed to write cache", th);
        }
    }

    public static /* synthetic */ void initData$default(TradePopupPresenterNew tradePopupPresenterNew, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        tradePopupPresenterNew.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        StateListAnimator fieldNames;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        pUU.KWHzl("TradePopupPresenterNew", "initData start, cacheOnly=" + z + ", uid=" + C55697xoo.OLrzqt.gEmmrt());
        if (this.EZpvd.isEmpty() && (fieldNames = getFieldNames()) != null) {
            if (!(!fieldNames.AEQbTJ().isEmpty())) {
                fieldNames = null;
            }
            if (fieldNames != null) {
                ArrayList<TokenBusinessData> arrayListAEQbTJ = fieldNames.AEQbTJ();
                Iterator<T> it = arrayListAEQbTJ.iterator();
                while (it.hasNext()) {
                    ((TokenBusinessData) it.next()).setSelect(false);
                }
                this.EZpvd = new ArrayList<>(arrayListAEQbTJ);
                Function2<? super ArrayList<TokenBusinessData>, ? super Boolean, Unit> function2 = this.copydefault;
                if (function2 != null) {
                    function2.invoke(new ArrayList(arrayListAEQbTJ), Boolean.TRUE);
                }
                boolean zCopydefault = fieldNames.copydefault();
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayListAEQbTJ, ", ", null, null, 0, null, new Function1() { // from class: o.usL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return TradePopupPresenterNew.OLrzqt((TokenBusinessData) obj);
                    }
                }, 30, null);
                pUU.KWHzl("TradePopupPresenterNew", "cache loaded: size=" + arrayListAEQbTJ.size() + ", isDefaultDisplayList=" + zCopydefault + ", list=[" + strJoinToString$default + "]");
                if (z) {
                    pUU.KWHzl("TradePopupPresenterNew", "initData end (cacheOnly), totalDuration=" + (System.currentTimeMillis() - jCurrentTimeMillis) + DateFormat.MINUTE_SECOND);
                    return;
                }
                if (!zCopydefault) {
                    valueOf();
                }
            }
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        final String strGEmmrt = C55697xoo.OLrzqt.gEmmrt();
        final C49673usw c49673usw = this.values;
        c49673usw.OLrzqt("", "");
        c49673usw.copydefault(new Function0() { // from class: o.usM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradePopupPresenterNew.copydefault(this.KWHzl, c49673usw);
            }
        });
        c49673usw.copydefault(new Function1() { // from class: o.usO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradePopupPresenterNew.AEQbTJ(jCurrentTimeMillis2, this, strGEmmrt, c49673usw, jCurrentTimeMillis, (java.util.ArrayList) obj);
            }
        });
    }

    public static final CharSequence OLrzqt(TokenBusinessData tokenBusinessData) {
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        return tokenBusinessData.getInstType() + ":" + tokenBusinessData.getInstrumentName();
    }

    public static final Unit copydefault(TradePopupPresenterNew tradePopupPresenterNew, C49673usw c49673usw) {
        BizInstrument bizInstrumentEZpvd = tradePopupPresenterNew.values().EZpvd();
        if (bizInstrumentEZpvd != null) {
            c49673usw.copydefault(bizInstrumentEZpvd.getInstId(), bizInstrumentEZpvd.getInstType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(long j, TradePopupPresenterNew tradePopupPresenterNew, String str, C49673usw c49673usw, long j2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        String strGEmmrt = c55697xoo.gEmmrt();
        tradePopupPresenterNew.AhwBna();
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, new Function1() { // from class: o.usR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradePopupPresenterNew.copydefault((TokenBusinessData) obj);
            }
        }, 30, null);
        pUU.KWHzl("TradePopupPresenterNew", "API response: size=" + arrayList.size() + ", duration=" + (jCurrentTimeMillis - j) + "ms, list=[" + strJoinToString$default + "]");
        if (!Intrinsics.EZpvd((Object) str, (Object) strGEmmrt)) {
            pUU.valueOf("TradePopupPresenterNew", "API response: UID changed during request! requestUid=" + str + ", responseUid=" + strGEmmrt);
        }
        if (C33129mqd.KWHzl((Collection) arrayList)) {
            System.currentTimeMillis();
            tradePopupPresenterNew.AkhnZx();
            tradePopupPresenterNew.KWHzl(arrayList);
            tradePopupPresenterNew.fJNWhG();
            String strGEmmrt2 = c55697xoo.gEmmrt();
            if (Intrinsics.EZpvd((Object) str, (Object) strGEmmrt2)) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(c49673usw), null, null, new TradePopupPresenterNew$initData$3$2$1(tradePopupPresenterNew, null), 3, null);
            } else {
                pUU.valueOf("TradePopupPresenterNew", "assemble: UID changed! requestUid=" + str + ", finalUid=" + strGEmmrt2 + ", skip cache write");
            }
            Function2<? super ArrayList<TokenBusinessData>, ? super Boolean, Unit> function2 = tradePopupPresenterNew.copydefault;
            if (function2 != null) {
                function2.invoke(tradePopupPresenterNew.EZpvd, Boolean.FALSE);
            }
            pUU.KWHzl("TradePopupPresenterNew", "initData end: totalDuration=" + (System.currentTimeMillis() - j2) + DateFormat.MINUTE_SECOND);
        }
        return Unit.INSTANCE;
    }

    public static final CharSequence copydefault(TokenBusinessData tokenBusinessData) {
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        return tokenBusinessData.getInstType() + ":" + tokenBusinessData.getInstrumentName();
    }

    public final void EZpvd(@NotNull TokenBusinessData tokenBusinessData) {
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        this.AkhnZx = tokenBusinessData.getInstType();
        KWHzl(new ParamBuilder.ActionBar().KWHzl(true).copydefault(tokenBusinessData.getInstrumentName()).KWHzl(tokenBusinessData.getInstType()).AEQbTJ("trade_home_pop").OLrzqt(tokenBusinessData.isPreMarket()).copydefault(true).EZpvd());
    }

    public final void KWHzl(@NotNull ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        hDKMBd().KWHzl(paramBuilder);
    }

    public final void AkhnZx() {
        if (C55697xoo.OLrzqt.AkhnZx()) {
            return;
        }
        this.djBIcL.add(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [597=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fJNWhG() {
        boolean zEZpvd;
        String instType;
        xOU xouWlaJM;
        Object next;
        Object next2;
        InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
        xND xndAEQbTJ = interfaceC49497upf.AEQbTJ();
        if (xndAEQbTJ != null && Intrinsics.EZpvd(xndAEQbTJ.gEmmrt(), Boolean.TRUE) && this.KWHzl.getAvailable()) {
            Iterator<T> it = this.djBIcL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (Intrinsics.EZpvd((Object) ((TokenBusinessData) next2).getInstType(), (Object) "OPTION")) {
                        break;
                    }
                }
            }
            if (((TokenBusinessData) next2) != null) {
                ArrayList<TokenBusinessData> arrayList = this.djBIcL;
                arrayList.add(arrayList.size() - 1, this.KWHzl);
            } else {
                this.djBIcL.add(this.KWHzl);
            }
        }
        getNewProxyInstance();
        xND xndAEQbTJ2 = interfaceC49497upf.AEQbTJ();
        if (xndAEQbTJ2 != null) {
            Boolean boolAYXKKw = xndAEQbTJ2.AYXKKw();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.EZpvd(boolAYXKKw, bool) && Intrinsics.EZpvd(interfaceC49497upf.EZpvd(), bool)) {
                Iterator<T> it2 = this.djBIcL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.EZpvd((Object) ((TokenBusinessData) next).getInstType(), (Object) "OPTION")) {
                            break;
                        }
                    }
                }
                if (((TokenBusinessData) next) != null) {
                    ArrayList<TokenBusinessData> arrayList2 = this.djBIcL;
                    arrayList2.add(arrayList2.size() - 1, this.fetchVPNInfo);
                } else {
                    this.djBIcL.add(this.fetchVPNInfo);
                }
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String strKWHzl = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.KWHzl();
        if (strKWHzl != null) {
            switch (strKWHzl.hashCode()) {
                case -1676013096:
                    if (strKWHzl.equals("trade_convert")) {
                        for (TokenBusinessData tokenBusinessData : this.djBIcL) {
                            tokenBusinessData.setSelect(Intrinsics.EZpvd((Object) tokenBusinessData.getInstType(), (Object) "CONVERT"));
                        }
                    } else {
                        BizInstrument bizInstrumentEZpvd = values().EZpvd();
                        for (TokenBusinessData tokenBusinessData2 : this.djBIcL) {
                            xVL xvl = xVL.EZpvd;
                            if (xvl.KWHzl(tokenBusinessData2.getInstType())) {
                                if (bizInstrumentEZpvd == null || (instType = bizInstrumentEZpvd.getInstType()) == null) {
                                    instType = "";
                                }
                                zEZpvd = xvl.copydefault(instType) && bizInstrumentEZpvd != null && tokenBusinessData2.isPreMarket() == bizInstrumentEZpvd.isPreMarketPair();
                            } else if (Intrinsics.EZpvd((Object) tokenBusinessData2.getInstType(), (Object) "FUTURES")) {
                                if (!Intrinsics.EZpvd((Object) tokenBusinessData2.getInstType(), (Object) (bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null)) || !bizInstrumentEZpvd.isPreMarketPair()) {
                                }
                            } else if (!Intrinsics.EZpvd((Object) tokenBusinessData2.getInstType(), (Object) "SPOT")) {
                                zEZpvd = Intrinsics.EZpvd((Object) tokenBusinessData2.getInstType(), (Object) (bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null));
                            } else if (!Intrinsics.EZpvd((Object) tokenBusinessData2.getInstType(), (Object) (bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null))) {
                                if (Intrinsics.EZpvd((Object) "MARGIN", (Object) (bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null))) {
                                }
                            }
                            tokenBusinessData2.setSelect(zEZpvd);
                        }
                    }
                    break;
                case -1510540368:
                    if (strKWHzl.equals("trade_option")) {
                        for (TokenBusinessData tokenBusinessData3 : this.djBIcL) {
                            tokenBusinessData3.setSelect(Intrinsics.EZpvd((Object) tokenBusinessData3.getInstType(), (Object) "OPTION"));
                        }
                        for (TokenBusinessData tokenBusinessData4 : this.AYXKKw) {
                            tokenBusinessData4.setSelect(Intrinsics.EZpvd((Object) tokenBusinessData4.getInstType(), (Object) "OPTION"));
                        }
                        break;
                    }
                    break;
                case 115624544:
                    if (strKWHzl.equals("trade_tactics")) {
                        for (TokenBusinessData tokenBusinessData5 : this.djBIcL) {
                            tokenBusinessData5.setSelect(Intrinsics.EZpvd((Object) tokenBusinessData5.getInstType(), (Object) "BOTS"));
                        }
                        break;
                    }
                    break;
                case 940128268:
                    if (strKWHzl.equals("copytrading")) {
                        for (TokenBusinessData tokenBusinessData6 : this.djBIcL) {
                            tokenBusinessData6.setSelect(Intrinsics.EZpvd((Object) tokenBusinessData6.getInstType(), (Object) "COPYTRADING"));
                        }
                        break;
                    }
                    break;
                case 1647212153:
                    if (strKWHzl.equals("trade_cedefi_dex")) {
                        for (TokenBusinessData tokenBusinessData7 : this.djBIcL) {
                            tokenBusinessData7.setSelect(Intrinsics.EZpvd((Object) tokenBusinessData7.getInstType(), (Object) "CEDEFI"));
                        }
                        break;
                    }
                    break;
            }
        }
        this.EZpvd.addAll(this.djBIcL);
        this.EZpvd.addAll(this.AYXKKw);
    }

    public final void getNewProxyInstance() {
        if (C54586xNw.OLrzqt.EZpvd()) {
            TokenBusinessData tokenBusinessData = new TokenBusinessData(true, (String) null, "CEDEFI", (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131066, (DefaultConstructorMarker) null);
            Iterator<TokenBusinessData> it = this.djBIcL.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((Object) it.next().getInstType(), (Object) "BOTS")) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                this.djBIcL.add(tokenBusinessData);
            } else {
                this.djBIcL.add(i, tokenBusinessData);
            }
        }
    }

    public final void AhwBna() {
        this.EZpvd.clear();
        this.djBIcL.clear();
        this.AYXKKw.clear();
    }

    public final void valueOf() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradePopupPresenterNew$backupRequestImmediate$1(this, null), 3, null);
    }

    public final void ejfBZ() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strGEmmrt = C55697xoo.OLrzqt.gEmmrt();
        pUU.KWHzl("TradePopupPresenterNew", "backupRequest: start network refresh in background, uid=" + strGEmmrt);
        final C49673usw c49673usw = this.values;
        c49673usw.OLrzqt("", "");
        c49673usw.copydefault(new Function0() { // from class: o.usT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradePopupPresenterNew.AEQbTJ(this.KWHzl, c49673usw);
            }
        });
        c49673usw.copydefault(new Function1() { // from class: o.usU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradePopupPresenterNew.KWHzl(jCurrentTimeMillis, this, strGEmmrt, c49673usw, (java.util.ArrayList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(TradePopupPresenterNew tradePopupPresenterNew, C49673usw c49673usw) {
        BizInstrument bizInstrumentEZpvd = tradePopupPresenterNew.values().EZpvd();
        if (bizInstrumentEZpvd != null) {
            c49673usw.copydefault(bizInstrumentEZpvd.getInstId(), bizInstrumentEZpvd.getInstType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(long j, TradePopupPresenterNew tradePopupPresenterNew, String str, C49673usw c49673usw, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        System.currentTimeMillis();
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        String strGEmmrt = c55697xoo.gEmmrt();
        tradePopupPresenterNew.AhwBna();
        if (!Intrinsics.EZpvd((Object) str, (Object) strGEmmrt)) {
            pUU.valueOf("TradePopupPresenterNew", "backupRequest: UID changed during request! requestUid=" + str + ", responseUid=" + strGEmmrt);
        }
        if (C33129mqd.KWHzl((Collection) arrayList)) {
            System.currentTimeMillis();
            tradePopupPresenterNew.AkhnZx();
            tradePopupPresenterNew.KWHzl(arrayList);
            tradePopupPresenterNew.fJNWhG();
            String strGEmmrt2 = c55697xoo.gEmmrt();
            if (Intrinsics.EZpvd((Object) str, (Object) strGEmmrt2)) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(c49673usw), null, null, new TradePopupPresenterNew$initDataNetworkOnly$1$2$1(tradePopupPresenterNew, null), 3, null);
            } else {
                pUU.valueOf("TradePopupPresenterNew", "backupRequest: UID changed! requestUid=" + str + ", finalUid=" + strGEmmrt2 + ", skip cache write");
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = tradePopupPresenterNew.copydefault == null;
            pUU.KWHzl("TradePopupPresenterNew", "backupRequest: invoking callback, bizCallback is null=" + z + ", size=" + tradePopupPresenterNew.EZpvd.size() + ", totalDuration=" + (jCurrentTimeMillis - j) + DateFormat.MINUTE_SECOND);
            Function2<? super ArrayList<TokenBusinessData>, ? super Boolean, Unit> function2 = tradePopupPresenterNew.copydefault;
            if (function2 != null) {
                function2.invoke(tradePopupPresenterNew.EZpvd, Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    public final void KWHzl(List<TokenBusinessData> list) {
        for (TokenBusinessData tokenBusinessData : list) {
            if (C33129mqd.OLrzqt((CharSequence) tokenBusinessData.getInstType())) {
                if (tokenBusinessData.getAvailable()) {
                    this.djBIcL.add(tokenBusinessData);
                } else {
                    this.AYXKKw.add(tokenBusinessData);
                }
            }
        }
    }
}
