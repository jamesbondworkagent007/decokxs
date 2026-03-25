package com.okinc.im.imui.impl;

import android.content.Context;
import android.content.Intent;
import com.okinc.im.bean.BroadcastMessageRequest;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelRequest;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sDN;
import o.sDZ;
import o.sKH;

/* JADX INFO: loaded from: classes23.dex */
public final class OKIMServiceImpl$createBroadcastMessagePageIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Intent>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BroadcastMessageRequest $request;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMServiceImpl$createBroadcastMessagePageIntent$2(BroadcastMessageRequest broadcastMessageRequest, Context context, Continuation<? super OKIMServiceImpl$createBroadcastMessagePageIntent$2> continuation) {
        super(2, continuation);
        this.$request = broadcastMessageRequest;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMServiceImpl$createBroadcastMessagePageIntent$2 oKIMServiceImpl$createBroadcastMessagePageIntent$2 = new OKIMServiceImpl$createBroadcastMessagePageIntent$2(this.$request, this.$context, continuation);
        oKIMServiceImpl$createBroadcastMessagePageIntent$2.L$0 = obj;
        return oKIMServiceImpl$createBroadcastMessagePageIntent$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Intent> continuation) {
        return ((OKIMServiceImpl$createBroadcastMessagePageIntent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (!(!this.$request.EZpvd().isEmpty())) {
                        throw new IllegalArgumentException("no recipients provided".toString());
                    }
                    int iAEQbTJ = this.$request.AEQbTJ();
                    List<Long> listEZpvd = this.$request.EZpvd();
                    GroupScenarioType groupScenarioTypeKWHzl = this.$request.KWHzl();
                    Json.Default r15 = Json.Default;
                    String strCopydefault = this.$request.copydefault();
                    r15.getSerializersModule();
                    CreateBroadcastChannelRequest createBroadcastChannelRequest = new CreateBroadcastChannelRequest(iAEQbTJ, listEZpvd, (List) null, groupScenarioTypeKWHzl, (JsonObject) r15.decodeFromString(JsonObject.Companion.serializer(), strCopydefault), 4, (DefaultConstructorMarker) null);
                    sKH skhFARcdN = sDZ.AEQbTJ.fARcdN();
                    this.label = 1;
                    obj = skhFARcdN.AEQbTJ(createBroadcastChannelRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        throw th;
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                ResponseData responseData = (ResponseData) obj;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th2) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th2);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th2));
            }
            return BroadcastMessagesActivity.Companion.AEQbTJ(this.$context, new BroadcastMessagePageParam((CreateBroadcastChannelResponse) actionBar.AEQbTJ()));
        } catch (Throwable th3) {
            MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(th3, null);
            this.L$0 = th3;
            this.label = 2;
            if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.impl.OKIMServiceImpl$createBroadcastMessagePageIntent$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $e;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$e = th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$e, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                String message = this.$e.getMessage();
                if (message == null) {
                    return null;
                }
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
