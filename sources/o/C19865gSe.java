package o;

import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyCacheDataSourceImpl$getBuySettings$$inlined$getSetting$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyCacheDataSourceImpl$getSellSettings$$inlined$getSetting$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyCacheDataSourceImpl$getTokenFilter$$inlined$getSetting$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyCacheDataSourceImpl$saveBuySettings$$inlined$saveSetting$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyCacheDataSourceImpl$saveSellSettings$$inlined$saveSetting$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyCacheDataSourceImpl$saveTokenFilter$$inlined$saveSetting$1;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class C19865gSe implements InterfaceC19867gSg {
    public final android.content.SharedPreferences AEQbTJ;
    public final CoroutineContext EZpvd;
    public final Json KWHzl;

    public C19865gSe(@NotNull android.content.SharedPreferences sharedPreferences, @NotNull Json json, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.AEQbTJ = sharedPreferences;
        this.KWHzl = json;
        this.EZpvd = coroutineContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yCM
    public C19865gSe(@NotNull android.content.Context context, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("dex_trading_local_config", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this(sharedPreferences, json, coroutineDispatcher);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    @Override // o.InterfaceC19867gSg
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super BuySettings> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CopyTradingEditStrategyCacheDataSourceImpl$getBuySettings$$inlined$getSetting$1(this, "key_copy_trading_buy_settings_", str, null), continuation);
    }

    @Override // o.InterfaceC19867gSg
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull BuySettings buySettings, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new CopyTradingEditStrategyCacheDataSourceImpl$saveBuySettings$$inlined$saveSetting$1(this, "key_copy_trading_buy_settings_", str, buySettings, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC19867gSg
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super SellSettings> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CopyTradingEditStrategyCacheDataSourceImpl$getSellSettings$$inlined$getSetting$1(this, "key_copy_trading_sell_settings_", str, null), continuation);
    }

    @Override // o.InterfaceC19867gSg
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull SellSettings sellSettings, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new CopyTradingEditStrategyCacheDataSourceImpl$saveSellSettings$$inlined$saveSetting$1(this, "key_copy_trading_sell_settings_", str, sellSettings, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC19867gSg
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super TokenFilter> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CopyTradingEditStrategyCacheDataSourceImpl$getTokenFilter$$inlined$getSetting$1(this, "key_copy_trading_token_filter_", str, null), continuation);
    }

    @Override // o.InterfaceC19867gSg
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new CopyTradingEditStrategyCacheDataSourceImpl$saveTokenFilter$$inlined$saveSetting$1(this, "key_copy_trading_token_filter_", str, tokenFilter, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
