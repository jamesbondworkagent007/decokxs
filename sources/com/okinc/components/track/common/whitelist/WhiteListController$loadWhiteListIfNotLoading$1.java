package com.okinc.components.track.common.whitelist;

import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.response.ResponseData;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JvmStreamsKt;
import o.C32895mmH;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32892mmE;
import o.InterfaceC6941aYq;
import o.yFA;

/* JADX INFO: loaded from: classes7.dex */
public final class WhiteListController$loadWhiteListIfNotLoading$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C32895mmH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteListController$loadWhiteListIfNotLoading$1(C32895mmH c32895mmH, Continuation<? super WhiteListController$loadWhiteListIfNotLoading$1> continuation) {
        super(2, continuation);
        this.this$0 = c32895mmH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WhiteListController$loadWhiteListIfNotLoading$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WhiteListController$loadWhiteListIfNotLoading$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        JsonElement jsonElement;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        JsonElement jsonElement2 = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC6941aYq interfaceC6941aYq = this.this$0.KWHzl;
                this.label = 1;
                obj = InterfaceC6941aYq.StateListAnimator.getAmplitudeList$default(interfaceC6941aYq, null, this, 1, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData2 = (ResponseData) obj;
            if (responseData2.getCode() != 0 || responseData2.getData() == null) {
                obj = null;
            }
            responseData = (ResponseData) obj;
        } catch (Exception unused) {
            File file = this.this$0.valueOf;
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                Json jsonAEQbTJ = C32895mmH.Companion.AEQbTJ();
                try {
                    jsonAEQbTJ.getSerializersModule();
                    jsonElement = (JsonElement) JvmStreamsKt.decodeFromStream(jsonAEQbTJ, BuiltinSerializersKt.getNullable(JsonElement.Companion.serializer()), fileInputStream);
                    yFA.copydefault(fileInputStream, null);
                } finally {
                }
            }
        }
        if (responseData != null && (jsonElement = (JsonElement) responseData.getData()) != null) {
            this.this$0.OLrzqt(jsonElement);
            this.this$0.copydefault(jsonElement);
            jsonElement2 = jsonElement;
        }
        if (jsonElement2 != null) {
            Map map = this.this$0.EZpvd;
            C32895mmH c32895mmH = this.this$0;
            for (Map.Entry entry : map.entrySet()) {
                ((InterfaceC32892mmE) entry.getValue()).copydefault(c32895mmH.copydefault((TrackChannel) entry.getKey(), JsonElementKt.getJsonObject(jsonElement2)));
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
