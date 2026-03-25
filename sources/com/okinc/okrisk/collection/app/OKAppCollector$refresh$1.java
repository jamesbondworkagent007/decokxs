package com.okinc.okrisk.collection.app;

import android.content.Context;
import com.okinc.okrisk.OKRiskPayloadManager;
import com.okinc.okrisk.collection.app.OKAppCollector$refresh$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C32979mnm;
import o.C46983thU;
import o.C47000thl;
import o.C47136tkO;
import o.C47212tll;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;

/* JADX INFO: loaded from: classes10.dex */
public final class OKAppCollector$refresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKAppCollector$refresh$1(Context context, Continuation<? super OKAppCollector$refresh$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONST_STR  "App collection disabled by config" */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$2() {
        return "App collection disabled by config";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKAppCollector$refresh$1(this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKAppCollector$refresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[Catch: Exception -> 0x0010, TRY_LEAVE, TryCatch #0 {Exception -> 0x0010, blocks: (B:5:0x000b, B:21:0x0044, B:23:0x004c, B:25:0x0059, B:27:0x007b, B:31:0x0081, B:33:0x0084, B:36:0x00a5, B:19:0x0038, B:12:0x001e), top: B:41:0x0007, inners: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    strAEQbTJ = C47000thl.KWHzl.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), "app_list_collection.enabled");
                    if (strAEQbTJ.length() <= 0) {
                        strAEQbTJ = null;
                    }
                } catch (Exception e) {
                    OKRiskPayloadManager.copydefault.copydefault(new Function0() { // from class: o.tih
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKAppCollector$refresh$1.invokeSuspend$lambda$1(e);
                        }
                    });
                }
                if (strAEQbTJ == null) {
                    strAEQbTJ = "false";
                }
                if (!Intrinsics.EZpvd((Object) strAEQbTJ, (Object) "true")) {
                    OKRiskPayloadManager.copydefault.copydefault(new Function0() { // from class: o.tij
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKAppCollector$refresh$1.invokeSuspend$lambda$2();
                        }
                    });
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullExpressionValue(this.$context.getPackageManager(), "");
                OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                C46983thU c46983thU = oKRiskPayloadManager.fARcdN().get();
                final int iEZpvd = c46983thU.EZpvd();
                final byte[] bArrAEQbTJ = c46983thU.AEQbTJ();
                if (iEZpvd <= 0) {
                    oKRiskPayloadManager.copydefault(new Function0() { // from class: o.tik
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKAppCollector$refresh$1.invokeSuspend$lambda$3(iEZpvd, bArrAEQbTJ);
                        }
                    });
                } else {
                    if (!(bArrAEQbTJ.length == 0)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, String.valueOf(jCurrentTimeMillis), iEZpvd, bArrAEQbTJ, c46983thU, null);
                        this.label = 1;
                        if (BuildersKt.withContext(io2, anonymousClass2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e2) {
            OKRiskPayloadManager.copydefault.copydefault(new Function0() { // from class: o.tip
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKAppCollector$refresh$1.invokeSuspend$lambda$4(e2);
                }
            });
            e2.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1(Exception exc) {
        return "Failed to get app_list_collection.enabled config: " + exc.getMessage();
    }

    /* JADX INFO: renamed from: com.okinc.okrisk.collection.app.OKAppCollector$refresh$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ C46983thU $currentPvParams;
        final /* synthetic */ int $pv;
        final /* synthetic */ String $timestamp;
        final /* synthetic */ byte[] $ts;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, int i, byte[] bArr, C46983thU c46983thU, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$timestamp = str;
            this.$pv = i;
            this.$ts = bArr;
            this.$currentPvParams = c46983thU;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONST_STR  "RSD invoke failed or ignored for app data (code != 0)" */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1() {
            return "RSD invoke failed or ignored for app data (code != 0)";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$timestamp, this.$pv, this.$ts, this.$currentPvParams, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objRsdInvoke$default;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C47000thl c47000thl = C47000thl.KWHzl;
                Context context = this.$context;
                C47136tkO c47136tkO = C47136tkO.AEQbTJ;
                String strGEmmrt = c47136tkO.gEmmrt(context);
                String str = this.$timestamp;
                C47212tll.StateListAnimator stateListAnimator = C47212tll.Companion;
                Object obj2 = stateListAnimator.OLrzqt().get("version");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 == null) {
                    str2 = "1.0";
                }
                Object obj3 = stateListAnimator.OLrzqt().get("sv");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                String str4 = str3 != null ? str3 : "1.0";
                int i2 = this.$pv;
                byte[] bArr = this.$ts;
                OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                String strAEQbTJ = c47000thl.AEQbTJ(context, strGEmmrt, str, 2, str2, str4, i2, bArr, C56548yJl.copydefault(oKRiskPayloadManager.ejfBZ().copydefault(), 1));
                if (strAEQbTJ.length() > 0) {
                    String strKWHzl = this.$currentPvParams.KWHzl();
                    String str5 = this.$timestamp;
                    String strAhwBna = c47136tkO.AhwBna(this.$context);
                    int i3 = this.$pv;
                    String strAuCTel = oKRiskPayloadManager.AuCTel();
                    this.label = 1;
                    objRsdInvoke$default = OKRiskPayloadManager.rsdInvoke$default(oKRiskPayloadManager, str5, strAhwBna, strAEQbTJ, i3, strAuCTel, strKWHzl, "APP_START", 0, this, 128, null);
                    if (objRsdInvoke$default == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    oKRiskPayloadManager.AEQbTJ("collectFilterAndProcess", "Encrypted app data is empty");
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objRsdInvoke$default = obj;
            }
            final String str6 = (String) objRsdInvoke$default;
            if (str6 != null) {
                OKRiskPayloadManager.copydefault.copydefault(new Function0() { // from class: o.tio
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return OKAppCollector$refresh$1.AnonymousClass2.invokeSuspend$lambda$0(str6);
                    }
                });
            } else {
                OKRiskPayloadManager.copydefault.copydefault(new Function0() { // from class: o.tin
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return OKAppCollector$refresh$1.AnonymousClass2.invokeSuspend$lambda$1();
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0(String str) {
            return "RSD invoke successful for app data, et: " + str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$3(int i, byte[] bArr) {
        return "Skipping app collection - invalid pv or ts (pv=" + i + ", ts.size=" + bArr.length + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$4(Exception exc) {
        return "App collection refresh failed: " + exc.getMessage();
    }
}
