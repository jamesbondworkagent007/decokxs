package com.okinc.components.track.common.whitelist;

import com.okinc.components.track.TrackChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.C32864mld;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class WhiteListController$assertWhitelistResponseAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonElement $whitelistJson;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteListController$assertWhitelistResponseAsync$1(JsonElement jsonElement, Continuation<? super WhiteListController$assertWhitelistResponseAsync$1> continuation) {
        super(2, continuation);
        this.$whitelistJson = jsonElement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WhiteListController$assertWhitelistResponseAsync$1(this.$whitelistJson, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WhiteListController$assertWhitelistResponseAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(this.$whitelistJson).get((Object) TrackChannel.Amplitude.getLowerTrackerName());
                yHO<String, Boolean, Map<String, String>, Unit> yhoDbNXlk = C32864mld.OLrzqt.DbNXlk();
                if (yhoDbNXlk == null) {
                    return null;
                }
                yhoDbNXlk.invoke("Amplitude whitelist is not a JsonObject", C56443yFo.KWHzl(jsonElement instanceof JsonObject), C56424yEw.KWHzl());
                return Unit.INSTANCE;
            } catch (Exception unused) {
                return Unit.INSTANCE;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
