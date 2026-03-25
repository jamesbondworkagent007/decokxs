package com.okinc.tradeuilib.header;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradeuilib.header.TradeSwitchBizHeaderPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
import o.C49668usr;
import o.C50029uzh;
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
public final class TradeSwitchBizHeaderPresenter extends AbsPresenter {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public ArrayList<TokenBusinessData> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public TokenBusinessData AhwBna;
    public final TokenBusinessData AkhnZx;
    public final C49668usr DbNXlk;
    public Function1<? super ArrayList<TokenBusinessData>, Unit> EZpvd;
    public boolean OLrzqt;
    public TokenBusinessData copydefault;
    public ArrayList<TokenBusinessData> djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public ArrayList<TokenBusinessData> gEmmrt;
    public String valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String gEmmrt() {
        return "[\n  {\n    \"available\": true,\n    \"instrumentName\": \"\",\n    \"instType\": \"CONVERT\",\n    \"baseSymbol\": \"\",\n    \"quoteSymbol\": \"\",\n    \"index\": \"\",\n    \"isPositive\": true,\n    \"leverage\": \"\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"BTC-USD\",\n    \"instType\": \"SPOT\",\n    \"baseSymbol\": \"BTC\",\n    \"quoteSymbol\": \"USD\",\n    \"index\": \"BTC-USD\",\n    \"isPositive\": false,\n    \"leverage\": \"BTC-USDⓈ\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"BTC-USD-SWAP\",\n    \"instType\": \"SWAP\",\n    \"baseSymbol\": \"BTC\",\n    \"quoteSymbol\": \"USD\",\n    \"index\": \"BTC-USD\",\n    \"isPositive\": false,\n    \"leverage\": \"BTC-USD-SWAP\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"\",\n    \"instType\": \"BOTS\",\n    \"baseSymbol\": \"\",\n    \"quoteSymbol\": \"\",\n    \"index\": \"\",\n    \"isPositive\": true,\n    \"leverage\": \"\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false\n  },\n  {\n    \"available\": true,\n    \"instrumentName\": \"\",\n    \"instType\": \"COPYTRADING\",\n    \"baseSymbol\": \"\",\n    \"quoteSymbol\": \"\",\n    \"index\": \"\",\n    \"isPositive\": true,\n    \"leverage\": \"\",\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false\n  },\n  {\n    \"available\": true,\n    \"instType\": \"OPTION\",\n    \"baseSymbol\": \"BTC\",\n    \"quoteSymbol\": \"USD\",\n    \"index\": \"BTC-USD\",\n    \"isPositive\": false,\n    \"isWatching\": false,\n    \"price\": \"- -\",\n    \"changePercent\": \"- -\",\n    \"coinUrl\": \"\",\n    \"pos\": 0,\n    \"isPreMarket\": false\n  }\n]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TokenBusinessData> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super ArrayList<TokenBusinessData>, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSwitchBizHeaderPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.usX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeSwitchBizHeaderPresenter.AuCTel();
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.usY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeSwitchBizHeaderPresenter.fARcdN();
            }
        });
        this.DbNXlk = new C49668usr(application);
        this.valueOf = "SPOT";
        this.AEQbTJ = new ArrayList<>();
        this.djBIcL = new ArrayList<>();
        this.gEmmrt = new ArrayList<>();
        this.copydefault = new TokenBusinessData(true, (String) null, "BOTS", (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131066, (DefaultConstructorMarker) null);
        this.AhwBna = new TokenBusinessData(true, (String) null, "CONVERT", (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131066, (DefaultConstructorMarker) null);
        this.AkhnZx = new TokenBusinessData(true, (String) null, "COPYTRADING", (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, (BizInstrument) null, false, 0, false, (String) null, 131066, (DefaultConstructorMarker) null);
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.usV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeSwitchBizHeaderPresenter.valueOf();
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.header.TradeSwitchBizHeaderPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final xLY DbNXlk() {
        return (xLY) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xLY AuCTel() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    private final InterfaceC49429uoQ values() {
        return (InterfaceC49429uoQ) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC49429uoQ fARcdN() {
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
        private final boolean isPositive;
        private final boolean isPreMarket;
        private final boolean isWatching;
        private final String leverage;
        private final int pos;
        private final String price;
        private final String quoteSymbol;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BizLineCacheItem() {
            this(false, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, (String) null, 0, false, 16383, (DefaultConstructorMarker) null);
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
        public final BizLineCacheItem copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, boolean z3, @NotNull String str7, @NotNull String str8, String str9, int i, boolean z4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new BizLineCacheItem(z, str, str2, str3, str4, str5, z2, str6, z3, str7, str8, str9, i, z4);
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
            return this.available == bizLineCacheItem.available && Intrinsics.EZpvd((Object) this.instrumentName, (Object) bizLineCacheItem.instrumentName) && Intrinsics.EZpvd((Object) this.instType, (Object) bizLineCacheItem.instType) && Intrinsics.EZpvd((Object) this.baseSymbol, (Object) bizLineCacheItem.baseSymbol) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) bizLineCacheItem.quoteSymbol) && Intrinsics.EZpvd((Object) this.index, (Object) bizLineCacheItem.index) && this.isPositive == bizLineCacheItem.isPositive && Intrinsics.EZpvd((Object) this.leverage, (Object) bizLineCacheItem.leverage) && this.isWatching == bizLineCacheItem.isWatching && Intrinsics.EZpvd((Object) this.price, (Object) bizLineCacheItem.price) && Intrinsics.EZpvd((Object) this.changePercent, (Object) bizLineCacheItem.changePercent) && Intrinsics.EZpvd((Object) this.coinUrl, (Object) bizLineCacheItem.coinUrl) && this.pos == bizLineCacheItem.pos && this.isPreMarket == bizLineCacheItem.isPreMarket;
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
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.pos)) * 31) + Boolean.hashCode(this.isPreMarket);
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
            return "BizLineCacheItem(available=" + this.available + ", instrumentName=" + this.instrumentName + ", instType=" + this.instType + ", baseSymbol=" + this.baseSymbol + ", quoteSymbol=" + this.quoteSymbol + ", index=" + this.index + ", isPositive=" + this.isPositive + ", leverage=" + this.leverage + ", isWatching=" + this.isWatching + ", price=" + this.price + ", changePercent=" + this.changePercent + ", coinUrl=" + this.coinUrl + ", pos=" + this.pos + ", isPreMarket=" + this.isPreMarket + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.header.TradeSwitchBizHeaderPresenter.BizLineCacheItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BizLineCacheItem> serializer() {
                return TradeSwitchBizHeaderPresenter$BizLineCacheItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BizLineCacheItem(int i, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, String str8, String str9, int i2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
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
        }

        public BizLineCacheItem(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, boolean z3, @NotNull String str7, @NotNull String str8, String str9, int i, boolean z4) {
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
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0092: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("- -") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : ("- -"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 boolean) : false)
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean):void (m)] (LINE:86) call: com.okinc.tradeuilib.header.TradeSwitchBizHeaderPresenter.BizLineCacheItem.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean):void type: THIS */
        public /* synthetic */ BizLineCacheItem(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, String str8, String str9, int i, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? "- -" : str7, (i2 & 1024) == 0 ? str8 : "- -", (i2 & 2048) == 0 ? str9 : "", (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) == 0 ? z4 : false);
        }
    }

    private final InterfaceC49497upf isConnected() {
        return (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
    }

    private final Json fetchVPNInfo() {
        return (Json) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Json valueOf() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.usW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeSwitchBizHeaderPresenter.KWHzl((JsonBuilder) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setEncodeDefaults(true);
        return Unit.INSTANCE;
    }

    private final String AhwBna() {
        return "key_trade_switch_biz_list_cache-" + C55697xoo.OLrzqt.gEmmrt();
    }

    public final ArrayList<TokenBusinessData> OLrzqt() {
        String string = SPUtils.getString(AhwBna(), gEmmrt());
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        try {
            List<BizLineCacheItem> list = (List) fetchVPNInfo().decodeFromString(BuiltinSerializersKt.ListSerializer(BizLineCacheItem.Companion.serializer()), string);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (BizLineCacheItem bizLineCacheItem : list) {
                arrayList.add(new TokenBusinessData(bizLineCacheItem.getAvailable(), bizLineCacheItem.getInstrumentName(), bizLineCacheItem.getInstType(), bizLineCacheItem.getBaseSymbol(), bizLineCacheItem.getQuoteSymbol(), bizLineCacheItem.getIndex(), bizLineCacheItem.isPositive(), bizLineCacheItem.getLeverage(), bizLineCacheItem.isWatching(), bizLineCacheItem.getPrice(), bizLineCacheItem.getChangePercent(), bizLineCacheItem.getCoinUrl(), (BizInstrument) null, false, bizLineCacheItem.getPos(), bizLineCacheItem.isPreMarket(), (String) null, 65536, (DefaultConstructorMarker) null));
            }
            return new ArrayList<>(arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void initData$default(TradeSwitchBizHeaderPresenter tradeSwitchBizHeaderPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        tradeSwitchBizHeaderPresenter.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        ArrayList<TokenBusinessData> arrayListOLrzqt;
        if (this.AEQbTJ.isEmpty() && (arrayListOLrzqt = OLrzqt()) != null) {
            if (!(!arrayListOLrzqt.isEmpty())) {
                arrayListOLrzqt = null;
            }
            if (arrayListOLrzqt != null) {
                Iterator<T> it = arrayListOLrzqt.iterator();
                while (it.hasNext()) {
                    ((TokenBusinessData) it.next()).setSelect(false);
                }
                this.AEQbTJ = new ArrayList<>(arrayListOLrzqt);
                Function1<? super ArrayList<TokenBusinessData>, Unit> function1 = this.EZpvd;
                if (function1 != null) {
                    function1.invoke(new ArrayList(arrayListOLrzqt));
                }
                AYXKKw();
                if (z) {
                    return;
                }
            }
        }
        final C49668usr c49668usr = this.DbNXlk;
        c49668usr.EZpvd(new Function0() { // from class: o.uta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradeSwitchBizHeaderPresenter.EZpvd(this.copydefault, c49668usr);
            }
        });
        c49668usr.copydefault(new Function1() { // from class: o.utc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeSwitchBizHeaderPresenter.KWHzl(this.KWHzl, (java.util.ArrayList) obj);
            }
        });
        c49668usr.EZpvd("", "");
    }

    public static final Unit EZpvd(TradeSwitchBizHeaderPresenter tradeSwitchBizHeaderPresenter, C49668usr c49668usr) {
        BizInstrument bizInstrumentEZpvd = tradeSwitchBizHeaderPresenter.DbNXlk().EZpvd();
        if (bizInstrumentEZpvd != null) {
            c49668usr.copydefault(bizInstrumentEZpvd.getInstId(), bizInstrumentEZpvd.getInstType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(TradeSwitchBizHeaderPresenter tradeSwitchBizHeaderPresenter, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        tradeSwitchBizHeaderPresenter.djBIcL();
        pUU.KWHzl("TradeSwitchBizHeaderPresenter", "require biz data " + arrayList.size() + ", convert now!");
        if (C33129mqd.KWHzl((Collection) arrayList)) {
            tradeSwitchBizHeaderPresenter.AkhnZx();
            tradeSwitchBizHeaderPresenter.OLrzqt(arrayList);
            tradeSwitchBizHeaderPresenter.ejfBZ();
            tradeSwitchBizHeaderPresenter.EZpvd(tradeSwitchBizHeaderPresenter.AEQbTJ);
            Function1<? super ArrayList<TokenBusinessData>, Unit> function1 = tradeSwitchBizHeaderPresenter.EZpvd;
            if (function1 != null) {
                function1.invoke(tradeSwitchBizHeaderPresenter.AEQbTJ);
            }
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        if (this.OLrzqt) {
            return;
        }
        C50029uzh.EZpvd.copydefault(new Runnable() { // from class: o.ute
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                TradeSwitchBizHeaderPresenter.copydefault(this.copydefault);
            }
        }, 3000L);
    }

    public static final void copydefault(TradeSwitchBizHeaderPresenter tradeSwitchBizHeaderPresenter) {
        tradeSwitchBizHeaderPresenter.OLrzqt = true;
        tradeSwitchBizHeaderPresenter.OLrzqt(false);
    }

    public final void OLrzqt(@NotNull TokenBusinessData tokenBusinessData) {
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        this.valueOf = tokenBusinessData.getInstType();
        KWHzl(new ParamBuilder.ActionBar().KWHzl(true).copydefault(tokenBusinessData.getInstrumentName()).KWHzl(tokenBusinessData.getInstType()).AEQbTJ("trade_top_header").OLrzqt(tokenBusinessData.isPreMarket()).copydefault(true).EZpvd());
    }

    public final void KWHzl(@NotNull ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        values().KWHzl(paramBuilder);
    }

    private final void AkhnZx() {
        if (C55697xoo.OLrzqt.AkhnZx()) {
            return;
        }
        this.djBIcL.add(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [390=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ejfBZ() {
        boolean zEZpvd;
        String instType;
        xOU xouWlaJM;
        Object next;
        Object next2;
        xND xndAEQbTJ = isConnected().AEQbTJ();
        if (xndAEQbTJ != null && Intrinsics.EZpvd(xndAEQbTJ.gEmmrt(), Boolean.TRUE) && this.copydefault.getAvailable()) {
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
                arrayList.add(arrayList.size() - 1, this.copydefault);
            } else {
                this.djBIcL.add(this.copydefault);
            }
        }
        fIwbmz();
        xND xndAEQbTJ2 = isConnected().AEQbTJ();
        if (xndAEQbTJ2 != null) {
            Boolean boolAYXKKw = xndAEQbTJ2.AYXKKw();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.EZpvd(boolAYXKKw, bool) && Intrinsics.EZpvd(isConnected().EZpvd(), bool)) {
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
                    arrayList2.add(arrayList2.size() - 1, this.AkhnZx);
                } else {
                    this.djBIcL.add(this.AkhnZx);
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
                        BizInstrument bizInstrumentEZpvd = DbNXlk().EZpvd();
                        for (TokenBusinessData tokenBusinessData2 : this.djBIcL) {
                            xVL xvl = xVL.EZpvd;
                            if (xvl.KWHzl(tokenBusinessData2.getInstType())) {
                                if (bizInstrumentEZpvd == null || (instType = bizInstrumentEZpvd.getInstType()) == null) {
                                    instType = "";
                                }
                                zEZpvd = xvl.copydefault(instType) && (bizInstrumentEZpvd == null || !bizInstrumentEZpvd.isPreMarketPair()) && (bizInstrumentEZpvd == null || !bizInstrumentEZpvd.isRebasePair());
                            } else if (Intrinsics.EZpvd((Object) tokenBusinessData2.getInstType(), (Object) "FUTURES")) {
                                if (!Intrinsics.EZpvd((Object) tokenBusinessData2.getInstType(), (Object) (bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null)) || ((bizInstrumentEZpvd != null && bizInstrumentEZpvd.isPreMarketPair()) || (bizInstrumentEZpvd != null && bizInstrumentEZpvd.isRebasePair()))) {
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
                        for (TokenBusinessData tokenBusinessData4 : this.gEmmrt) {
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
        this.AEQbTJ.addAll(this.djBIcL);
        this.AEQbTJ.addAll(this.gEmmrt);
    }

    private final void fIwbmz() {
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

    private final void djBIcL() {
        this.AEQbTJ.clear();
        this.djBIcL.clear();
        this.gEmmrt.clear();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    private final void EZpvd(List<TokenBusinessData> list) {
        try {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                TokenBusinessData tokenBusinessData = (TokenBusinessData) it.next();
                arrayList.add(new BizLineCacheItem(tokenBusinessData.getAvailable(), tokenBusinessData.getInstrumentName(), tokenBusinessData.getInstType(), tokenBusinessData.getBaseSymbol(), tokenBusinessData.getQuoteSymbol(), tokenBusinessData.getIndex(), tokenBusinessData.isPositive(), tokenBusinessData.getLeverage(), tokenBusinessData.isWatching(), tokenBusinessData.getPrice(), tokenBusinessData.getChangePercent(), tokenBusinessData.getCoinUrl(), tokenBusinessData.getPos(), tokenBusinessData.isPreMarket()));
            }
            SPUtils.put(AhwBna(), fetchVPNInfo().encodeToString(BuiltinSerializersKt.ListSerializer(BizLineCacheItem.Companion.serializer()), arrayList));
        } catch (Throwable unused) {
        }
    }

    private final void OLrzqt(List<TokenBusinessData> list) {
        for (TokenBusinessData tokenBusinessData : list) {
            if (C33129mqd.OLrzqt((CharSequence) tokenBusinessData.getInstType())) {
                if (tokenBusinessData.getAvailable()) {
                    this.djBIcL.add(tokenBusinessData);
                } else {
                    this.gEmmrt.add(tokenBusinessData);
                }
            }
        }
    }
}
