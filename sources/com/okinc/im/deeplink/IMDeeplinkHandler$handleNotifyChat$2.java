package com.okinc.im.deeplink;

import android.app.Activity;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.pUU;
import o.sDN;
import o.sGF;

/* JADX INFO: loaded from: classes8.dex */
public final class IMDeeplinkHandler$handleNotifyChat$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Map<String, Object> $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMDeeplinkHandler$handleNotifyChat$2(Map<String, ? extends Object> map, Activity activity, Continuation<? super IMDeeplinkHandler$handleNotifyChat$2> continuation) {
        super(2, continuation);
        this.$params = map;
        this.$activity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IMDeeplinkHandler$handleNotifyChat$2 iMDeeplinkHandler$handleNotifyChat$2 = new IMDeeplinkHandler$handleNotifyChat$2(this.$params, this.$activity, continuation);
        iMDeeplinkHandler$handleNotifyChat$2.L$0 = obj;
        return iMDeeplinkHandler$handleNotifyChat$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMDeeplinkHandler$handleNotifyChat$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:10:0x0025, B:41:0x00d3, B:13:0x0036, B:24:0x008c, B:26:0x0095, B:28:0x009f, B:31:0x00a5, B:38:0x00b6, B:37:0x00b0, B:16:0x0045, B:18:0x0072, B:20:0x0078), top: B:54:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:10:0x0025, B:41:0x00d3, B:13:0x0036, B:24:0x008c, B:26:0x0095, B:28:0x009f, B:31:0x00a5, B:38:0x00b6, B:37:0x00b0, B:16:0x0045, B:18:0x0072, B:20:0x0078), top: B:54:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0 A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:10:0x0025, B:41:0x00d3, B:13:0x0036, B:24:0x008c, B:26:0x0095, B:28:0x009f, B:31:0x00a5, B:38:0x00b6, B:37:0x00b0, B:16:0x0045, B:18:0x0072, B:20:0x0078), top: B:54:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Throwable th;
        Map<String, Object> map;
        Activity activity;
        InterfaceC35180nqU interfaceC35180nqU;
        OKConversation oKConversation;
        sGF sgfKWHzl;
        Activity activity2;
        InterfaceC35180nqU interfaceC35180nqU2;
        String value;
        MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ;
        IMDeeplinkHandler$handleNotifyChat$2$1$1 iMDeeplinkHandler$handleNotifyChat$2$1$1;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            map = this.$params;
            Activity activity3 = this.$activity;
            Result.Application application2 = Result.Companion;
            Object obj2 = map.get("conversation");
            Intrinsics.copydefault(obj2, "");
            String str = (String) obj2;
            pUU.KWHzl("IMDeeplinkHandler", "handleNotifyChat => start getting conversation:" + str);
            InterfaceC35180nqU interfaceC35180nqU3 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU3 != null && (sgfKWHzl = interfaceC35180nqU3.KWHzl()) != null) {
                CacheStrategy cacheStrategy = CacheStrategy.CacheFirst;
                this.L$0 = map;
                this.L$1 = activity3;
                this.L$2 = interfaceC35180nqU3;
                this.label = 1;
                Object objCopydefault2 = sgfKWHzl.copydefault(str, cacheStrategy, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                activity2 = activity3;
                obj = objCopydefault2;
                interfaceC35180nqU2 = interfaceC35180nqU3;
            } else {
                activity = activity3;
                interfaceC35180nqU = interfaceC35180nqU3;
                oKConversation = null;
                Object obj3 = map.get("utm_medium");
                value = !(obj3 instanceof String) ? (String) obj3 : null;
                if (value != null) {
                    if (value.length() <= 0) {
                        value = null;
                    }
                    if (value != null) {
                    }
                    String str2 = value;
                    mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                    iMDeeplinkHandler$handleNotifyChat$2$1$1 = new IMDeeplinkHandler$handleNotifyChat$2$1$1(oKConversation, interfaceC35180nqU, activity, str2, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, iMDeeplinkHandler$handleNotifyChat$2$1$1, this) == objCopydefault) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    Activity activity4 = this.$activity;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                } else {
                    value = ChatOrigin.DEEPLINK.getValue();
                    String str22 = value;
                    mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                    iMDeeplinkHandler$handleNotifyChat$2$1$1 = new IMDeeplinkHandler$handleNotifyChat$2$1$1(oKConversation, interfaceC35180nqU, activity, str22, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, iMDeeplinkHandler$handleNotifyChat$2$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    Activity activity42 = this.$activity;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    pUU.copydefault("IMDeeplinkHandler", "Handle deeplink exception: " + th.getMessage());
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                Activity activity422 = this.$activity;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ2 = sDN.copydefault.AEQbTJ();
                    IMDeeplinkHandler$handleNotifyChat$2$2$1 iMDeeplinkHandler$handleNotifyChat$2$2$1 = new IMDeeplinkHandler$handleNotifyChat$2$2$1(activity422, null);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = thM7380exceptionOrNullimpl;
                    this.L$2 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ2, iMDeeplinkHandler$handleNotifyChat$2$2$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    th = thM7380exceptionOrNullimpl;
                    pUU.copydefault("IMDeeplinkHandler", "Handle deeplink exception: " + th.getMessage());
                }
                return Unit.INSTANCE;
            }
            interfaceC35180nqU2 = (InterfaceC35180nqU) this.L$2;
            activity2 = (Activity) this.L$1;
            map = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        oKConversation = (OKConversation) obj;
        interfaceC35180nqU = interfaceC35180nqU2;
        activity = activity2;
        Object obj32 = map.get("utm_medium");
        if (!(obj32 instanceof String)) {
        }
        if (value != null) {
        }
        return Unit.INSTANCE;
    }
}
