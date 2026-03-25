package com.okinc.components.track.common.whitelist;

import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JvmStreamsKt;
import o.C32895mmH;
import o.C33056mpJ;
import o.C56391yDq;
import o.C56442yFn;
import o.yFA;

/* JADX INFO: loaded from: classes7.dex */
public final class WhiteListController$saveWhitelistLocallyAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonElement $jsonData;
    int label;
    final /* synthetic */ C32895mmH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteListController$saveWhitelistLocallyAsync$1(C32895mmH c32895mmH, JsonElement jsonElement, Continuation<? super WhiteListController$saveWhitelistLocallyAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = c32895mmH;
        this.$jsonData = jsonElement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WhiteListController$saveWhitelistLocallyAsync$1(this.this$0, this.$jsonData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WhiteListController$saveWhitelistLocallyAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C33056mpJ.AEQbTJ(this.this$0.valueOf)) {
                FileOutputStream fileOutputStream = new FileOutputStream(this.this$0.valueOf);
                JsonElement jsonElement = this.$jsonData;
                try {
                    Json jsonAEQbTJ = C32895mmH.Companion.AEQbTJ();
                    jsonAEQbTJ.getSerializersModule();
                    JvmStreamsKt.encodeToStream(jsonAEQbTJ, JsonElement.Companion.serializer(), jsonElement, fileOutputStream);
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(fileOutputStream, null);
                } finally {
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
