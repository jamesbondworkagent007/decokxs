package o;

import com.okinc.business.trade.features.home.advanced.datasource.AdvancedAutoSellStrategiesDataSourceImpl$getAutoSellEnabled$2;
import com.okinc.business.trade.features.home.advanced.datasource.AdvancedAutoSellStrategiesDataSourceImpl$getStrategies$2;
import com.okinc.business.trade.features.home.advanced.datasource.AdvancedAutoSellStrategiesDataSourceImpl$isFirstUse$2;
import com.okinc.business.trade.features.home.advanced.datasource.AdvancedAutoSellStrategiesDataSourceImpl$saveAutoSellEnabled$2;
import com.okinc.business.trade.features.home.advanced.datasource.AdvancedAutoSellStrategiesDataSourceImpl$saveStrategies$2;
import com.okinc.business.trade.features.home.advanced.datasource.AdvancedAutoSellStrategiesDataSourceImpl$setFirstUse$2;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class kPP implements kPM {
    public final CoroutineContext KWHzl;
    public final android.content.SharedPreferences OLrzqt;
    public final Json copydefault;

    public kPP(@NotNull android.content.SharedPreferences sharedPreferences, @NotNull Json json, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.OLrzqt = sharedPreferences;
        this.copydefault = json;
        this.KWHzl = coroutineContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yCM
    public kPP(@NotNull android.content.Context context, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("dex_trading_local_config", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this(sharedPreferences, JsonKt.Json(json, new Function1() { // from class: o.kPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kPP.AEQbTJ((JsonBuilder) obj);
            }
        }), coroutineDispatcher);
    }

    public static final Unit AEQbTJ(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setUseArrayPolymorphism(false);
        return Unit.INSTANCE;
    }

    @Override // o.kPM
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends AdvancedAutoSellStrategy>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new AdvancedAutoSellStrategiesDataSourceImpl$getStrategies$2(this, null), continuation);
    }

    @Override // o.kPM
    public java.lang.Object copydefault(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new AdvancedAutoSellStrategiesDataSourceImpl$saveStrategies$2(this, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.kPM
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.KWHzl, new AdvancedAutoSellStrategiesDataSourceImpl$isFirstUse$2(this, null), continuation);
    }

    @Override // o.kPM
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new AdvancedAutoSellStrategiesDataSourceImpl$setFirstUse$2(this, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.kPM
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.KWHzl, new AdvancedAutoSellStrategiesDataSourceImpl$getAutoSellEnabled$2(this, null), continuation);
    }

    @Override // o.kPM
    public java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new AdvancedAutoSellStrategiesDataSourceImpl$saveAutoSellEnabled$2(this, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
