package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMCommand;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSPushIndicator;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonObject;
import o.C33129mqd;
import o.C44124sEe;
import o.C44169sFw;
import o.C44302sKu;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sHW;
import o.sQS;
import o.sRX;
import o.sSR;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InHouseIMResponse $response;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44302sKu this$0;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMCommand.values().length];
            try {
                iArr[InHouseIMCommand.WSPushMsg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMCommand.WSPushIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InHouseIMCommand.WSPushReaction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1(InHouseIMResponse inHouseIMResponse, C44302sKu c44302sKu, Continuation<? super InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1> continuation) {
        super(2, continuation);
        this.$response = inHouseIMResponse;
        this.this$0 = c44302sKu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1 inHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1 = new InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1(this.$response, this.this$0, continuation);
        inHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        JsonObject jsonObjectOLrzqt;
        Object objDecodeFromJsonElement;
        List<WSSendMessageDetailData> listEZpvd;
        Object objKWHzl;
        long j;
        Object objDecodeFromJsonElement2;
        List<WSSendMessageDetailData> listKWHzl;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InHouseIMResponse inHouseIMResponse = this.$response;
            C44302sKu c44302sKu = this.this$0;
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Result.Application application = Result.Companion;
                jsonObjectOLrzqt = inHouseIMResponse.OLrzqt();
            } catch (Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (jsonObjectOLrzqt != null) {
                int i2 = Application.KWHzl[inHouseIMResponse.AYXKKw().ordinal()];
                if (i2 == 1) {
                    try {
                        objDecodeFromJsonElement = sHW.copydefault().KWHzl().decodeFromJsonElement(WSMessageListResponse.Companion.serializer(), jsonObjectOLrzqt);
                    } catch (SerializationException e) {
                        pUU.copydefault("SafeJson", "decodeFromJsonElement SerializationException: " + e.getMessage());
                        sSR.copydefault("decodeFromJsonElement SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                        objDecodeFromJsonElement = null;
                    } catch (Exception e2) {
                        pUU.copydefault("SafeJson", "decodeFromJsonElement error: " + e2.getMessage());
                        sSR.copydefault("decodeFromJsonElement Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                        objDecodeFromJsonElement = null;
                    }
                    WSMessageListResponse wSMessageListResponse = (WSMessageListResponse) objDecodeFromJsonElement;
                    if (wSMessageListResponse == null || (listEZpvd = wSMessageListResponse.EZpvd()) == null) {
                        return Unit.INSTANCE;
                    }
                    WSSendMessageDetailData wSSendMessageDetailData = (WSSendMessageDetailData) CollectionsKt___CollectionsKt.AkhnZx(listEZpvd, 0);
                    if (wSSendMessageDetailData != null) {
                        sRX.OLrzqt.copydefault(c44302sKu.AhwBna(), wSSendMessageDetailData);
                    }
                    objKWHzl = C56443yFo.KWHzl(c44302sKu.isConnected().addAll(listEZpvd));
                } else if (i2 == 2) {
                    try {
                        objDecodeFromJsonElement2 = sHW.copydefault().KWHzl().decodeFromJsonElement(WSPushIndicator.Companion.serializer(), jsonObjectOLrzqt);
                    } catch (SerializationException e3) {
                        pUU.copydefault("SafeJson", "decodeFromJsonElement SerializationException: " + e3.getMessage());
                        sSR.copydefault("decodeFromJsonElement SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e3.getMessage()))));
                        objDecodeFromJsonElement2 = null;
                    } catch (Exception e4) {
                        pUU.copydefault("SafeJson", "decodeFromJsonElement error: " + e4.getMessage());
                        sSR.copydefault("decodeFromJsonElement Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e4.getMessage()))));
                        objDecodeFromJsonElement2 = null;
                    }
                    WSPushIndicator wSPushIndicator = (WSPushIndicator) objDecodeFromJsonElement2;
                    if (wSPushIndicator == null || (listKWHzl = wSPushIndicator.KWHzl()) == null) {
                        return Unit.INSTANCE;
                    }
                    Iterator<T> it = listKWHzl.iterator();
                    while (it.hasNext()) {
                        OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(sQS.toInHouseIMMessageEntity$default((WSSendMessageDetailData) it.next(), 0, 1, null));
                        if (oKMessageAEQbTJ != null) {
                            c44302sKu.ejfBZ().KWHzl(new InHouseIMWebSocketSyncManagerImpl$handleIncomingResponse$1$totalTime$1$1$2$1(c44302sKu, oKMessageAEQbTJ, null));
                        }
                    }
                    objKWHzl = Unit.INSTANCE;
                } else if (i2 == 3) {
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    if (c44302sKu.KWHzl(jsonObjectOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    j = jCurrentTimeMillis;
                } else {
                    objKWHzl = Unit.INSTANCE;
                }
                j = jCurrentTimeMillis;
                objM7377constructorimpl = Result.m7377constructorimpl(objKWHzl);
                jCurrentTimeMillis = j;
            } else {
                C44124sEe.imLogSync$default("incoming message => total insertion time in ms=" + (System.currentTimeMillis() - jCurrentTimeMillis), null, null, 6, null);
                return Unit.INSTANCE;
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.imLogSync$default("incoming message => failed to insert messages", thM7380exceptionOrNullimpl, null, 4, null);
            }
            C44124sEe.imLogSync$default("incoming message => total insertion time in ms=" + (System.currentTimeMillis() - jCurrentTimeMillis), null, null, 6, null);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = this.J$0;
        try {
            C56391yDq.AEQbTJ(obj);
        } catch (Throwable th2) {
            th = th2;
            jCurrentTimeMillis = j;
            Result.Application application22 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        objKWHzl = Unit.INSTANCE;
        objM7377constructorimpl = Result.m7377constructorimpl(objKWHzl);
        jCurrentTimeMillis = j;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        C44124sEe.imLogSync$default("incoming message => total insertion time in ms=" + (System.currentTimeMillis() - jCurrentTimeMillis), null, null, 6, null);
        return Unit.INSTANCE;
    }
}
