package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C42597rYt;
import o.C42608rZd;
import o.C43251rlk;
import o.C44629saY;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rXE;
import o.rXL;
import o.rXO;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class UnReadCountManagerImpl$refreshUnreadCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ C44629saY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnReadCountManagerImpl$refreshUnreadCount$1(C44629saY c44629saY, Continuation<? super UnReadCountManagerImpl$refreshUnreadCount$1> continuation) {
        super(2, continuation);
        this.this$0 = c44629saY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnReadCountManagerImpl$refreshUnreadCount$1 unReadCountManagerImpl$refreshUnreadCount$1 = new UnReadCountManagerImpl$refreshUnreadCount$1(this.this$0, continuation);
        unReadCountManagerImpl$refreshUnreadCount$1.L$0 = obj;
        return unReadCountManagerImpl$refreshUnreadCount$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnReadCountManagerImpl$refreshUnreadCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(2:93|7)|65|66|97|68|73|(1:75)|76|(1:78)|49|(4:51|(1:53)(1:54)|55|(9:67|97|68|73|(0)|76|(0)|49|(4:79|(1:88)|89|90)(0))(4:57|(1:59)(1:60)|61|(1:63)(11:64|65|66|97|68|73|(0)|76|(0)|49|(0)(0))))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019f, code lost:
    
        r1 = r2;
        r2 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0246  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0191 -> B:65:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0198 -> B:97:0x0199). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objInvoke$default;
        CoroutineScope coroutineScope2;
        Object objM7377constructorimpl;
        C44629saY c44629saY;
        Ref.IntRef intRef;
        rXE rxe;
        Iterator<Map.Entry<String, Integer>> it;
        Object obj2;
        CoroutineScope coroutineScope3;
        C44629saY c44629saY2;
        Ref.IntRef intRef2;
        rXE rxe2;
        Object objM7377constructorimpl2;
        String str;
        int iIntValue;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            C44629saY c44629saY3 = this.this$0;
            try {
                Result.Application application = Result.Companion;
                List listGEmmrt = yDY.gEmmrt(new rXL(false, null, NotificationCategory.AllExceptPriceAlert.getValue(), null, 0, "", 27, null), new rXL(false, null, NotificationCategory.PriceAlerts.getValue(), null, 0, "", 27, null));
                C42608rZd c42608rZd = c44629saY3.valueOf;
                this.L$0 = coroutineScope;
                this.label = 1;
                objInvoke$default = C42608rZd.invoke$default(c42608rZd, listGEmmrt, null, this, 2, null);
                if (objInvoke$default == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope2 = coroutineScope;
            } catch (Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                coroutineScope2 = coroutineScope;
            }
        } else if (i == 1) {
            coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objInvoke$default = obj;
            } catch (Throwable th2) {
                th = th2;
                coroutineScope = coroutineScope2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                coroutineScope2 = coroutineScope;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.I$0;
            String str2 = (String) this.L$6;
            it = (Iterator) this.L$5;
            rxe2 = (rXE) this.L$4;
            intRef2 = (Ref.IntRef) this.L$3;
            c44629saY2 = (C44629saY) this.L$2;
            obj2 = this.L$1;
            coroutineScope3 = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str = str2;
                iIntValue = i2;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (!it.hasNext()) {
                }
            }
            Unit unit = Unit.INSTANCE;
            str = str2;
            iIntValue = i2;
            objM7377constructorimpl2 = Result.m7377constructorimpl(unit);
            if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                pUU.KWHzl("UnReadCountManager", "storeNotificationUnreadCount success for channelId: " + str + ", unreadCount: " + iIntValue);
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault("UnReadCountManager", "storeNotificationUnreadCount error for channelId: " + str + ", error: " + C33129mqd.gEmmrt(thM7380exceptionOrNullimpl.getMessage()));
            }
            if (!it.hasNext()) {
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                iIntValue = next.getValue().intValue();
                NotificationCategory notificationCategory = NotificationCategory.AllExceptPriceAlert;
                str = Intrinsics.EZpvd((Object) key, (Object) notificationCategory.getValue()) ? "Notifications" : "_NOTIFICATION_CHANNEL_PRICE_ALERTS";
                Result.Application application4 = Result.Companion;
                rXO rxo = (rXO) C43251rlk.OLrzqt(rXO.class);
                if (rxo == null) {
                    unit = null;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(unit);
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    if (!it.hasNext()) {
                        c44629saY = c44629saY2;
                        Ref.IntRef intRef3 = intRef2;
                        rxe = rxe2;
                        intRef = intRef3;
                        if (rxe != null || !rxe.OLrzqt()) {
                            c44629saY.OLrzqt(intRef.element);
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    InHouseIMChannelType inHouseIMChannelType = Intrinsics.EZpvd((Object) key, (Object) notificationCategory.getValue()) ? InHouseIMChannelType.SystemNotification : InHouseIMChannelType.SystemNotification;
                    this.L$0 = coroutineScope3;
                    this.L$1 = obj2;
                    this.L$2 = c44629saY2;
                    this.L$3 = intRef2;
                    this.L$4 = rxe2;
                    this.L$5 = it;
                    this.L$6 = str;
                    this.I$0 = iIntValue;
                    this.label = 2;
                    if (rxo.AEQbTJ(str, inHouseIMChannelType, iIntValue, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    i2 = iIntValue;
                    str2 = str;
                    Unit unit2 = Unit.INSTANCE;
                    str = str2;
                    iIntValue = i2;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(unit2);
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((UnViewedNotificationResp) objInvoke$default);
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl2 != null) {
            String message = thM7380exceptionOrNullimpl2.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("UnReadCountManager", "refreshUnreadCount error: " + message);
        }
        c44629saY = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            UnViewedNotificationResp unViewedNotificationResp = (UnViewedNotificationResp) objM7377constructorimpl;
            intRef = new Ref.IntRef();
            List listKWHzl = C43251rlk.KWHzl(rXE.class);
            rxe = listKWHzl != null ? (rXE) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
            Map<String, Integer> unviewMap = unViewedNotificationResp.getUnviewMap();
            if (unviewMap != null) {
                if ((rxe != null && rxe.OLrzqt()) || C42597rYt.copydefault()) {
                    it = unviewMap.entrySet().iterator();
                    obj2 = objM7377constructorimpl;
                    coroutineScope3 = coroutineScope2;
                    c44629saY2 = c44629saY;
                    rXE rxe3 = rxe;
                    intRef2 = intRef;
                    rxe2 = rxe3;
                    if (!it.hasNext()) {
                    }
                } else {
                    Iterator it2 = yDY.gEmmrt(NotificationCategory.AllExceptPriceAlert.getValue(), NotificationCategory.PriceAlerts.getValue()).iterator();
                    while (it2.hasNext()) {
                        intRef.element += unviewMap.getOrDefault((String) it2.next(), C56443yFo.AEQbTJ(0)).intValue();
                    }
                }
            }
            if (rxe != null) {
                c44629saY.OLrzqt(intRef.element);
            }
        }
        return Unit.INSTANCE;
    }
}
