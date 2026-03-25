package com.okinc.business.defi.wallet.common.okxconnect.storage;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import o.C16011ebq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C59462zhW;
import o.C59519zia;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectCacheManager$getExpiredSessionClientIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ int $expiryDurationInDays;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ C16011ebq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectCacheManager$getExpiredSessionClientIds$2(C16011ebq c16011ebq, int i, Continuation<? super OKXConnectCacheManager$getExpiredSessionClientIds$2> continuation) {
        super(2, continuation);
        this.this$0 = c16011ebq;
        this.$expiryDurationInDays = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectCacheManager$getExpiredSessionClientIds$2(this.this$0, this.$expiryDurationInDays, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return ((OKXConnectCacheManager$getExpiredSessionClientIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[LOOP:3: B:29:0x00a2->B:31:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151 A[LOOP:1: B:52:0x014b->B:54:0x0151, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object objKWHzl;
        SharedPreferences sharedPreferences;
        Object objOLrzqt;
        Object objOLrzqt2;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            C16011ebq c16011ebq = this.this$0;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            objKWHzl = c16011ebq.KWHzl((Continuation<? super SharedPreferences>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = this.J$0;
                    C56391yDq.AEQbTJ(obj);
                    jCurrentTimeMillis = j;
                    objOLrzqt2 = obj;
                    List listQOLQEE = C56403yEb.QOLQEE(((Map) objOLrzqt2).values());
                    int i2 = this.$expiryDurationInDays;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listQOLQEE) {
                        Long lastActiveTimestamp = ((DAppSession) obj2).getLastActiveTimestamp();
                        long jLongValue = lastActiveTimestamp != null ? lastActiveTimestamp.longValue() : jCurrentTimeMillis;
                        C59462zhW.Activity activity = C59462zhW.OLrzqt;
                        if (jCurrentTimeMillis - jLongValue >= C59462zhW.gEmmrt(C59519zia.EZpvd(i2, DurationUnit.DAYS))) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((DAppSession) it.next()).getClientId());
                    }
                    return arrayList2;
                }
                jCurrentTimeMillis = this.J$0;
                sharedPreferences = (SharedPreferences) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                List listQOLQEE2 = C56403yEb.QOLQEE(((Map) objOLrzqt).values());
                ArrayList<DAppSession> arrayList3 = new ArrayList();
                for (Object obj3 : listQOLQEE2) {
                    if (((DAppSession) obj3).getLastActiveTimestamp() == null) {
                        arrayList3.add(obj3);
                    }
                }
                C16011ebq c16011ebq2 = this.this$0;
                for (DAppSession dAppSession : arrayList3) {
                    c16011ebq2.copydefault(dAppSession.getWalletId(), dAppSession.copy((2047 & 1) != 0 ? dAppSession.clientId : null, (2047 & 2) != 0 ? dAppSession.topic : null, (2047 & 4) != 0 ? dAppSession.walletId : null, (2047 & 8) != 0 ? dAppSession.keyPair : null, (2047 & 16) != 0 ? dAppSession.dAppInfo : null, (2047 & 32) != 0 ? dAppSession.isTonConnected : false, (2047 & 64) != 0 ? dAppSession.connectedCaipChains : null, (2047 & 128) != 0 ? dAppSession.hasCosmosChainConnected : null, (2047 & 256) != 0 ? dAppSession.redirect : null, (2047 & 512) != 0 ? dAppSession.timestamp : 0L, (2047 & 1024) != 0 ? dAppSession.protocalVersion : null, (2047 & 2048) != 0 ? dAppSession.lastActiveTimestamp : C56443yFo.KWHzl(jCurrentTimeMillis)));
                }
                if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("KEY_OKXC_SESSION_LAST_ACTIVE_INIT", true)) != null) {
                    editorPutBoolean.apply();
                }
                C16011ebq c16011ebq3 = this.this$0;
                this.L$0 = null;
                this.J$0 = jCurrentTimeMillis;
                this.label = 3;
                objOLrzqt2 = c16011ebq3.OLrzqt(this);
                if (objOLrzqt2 == objCopydefault) {
                    return objCopydefault;
                }
                List listQOLQEE3 = C56403yEb.QOLQEE(((Map) objOLrzqt2).values());
                int i22 = this.$expiryDurationInDays;
                ArrayList arrayList4 = new ArrayList();
                while (r1.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                }
                return arrayList22;
            }
            jCurrentTimeMillis = this.J$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        sharedPreferences = (SharedPreferences) objKWHzl;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("KEY_OKXC_SESSION_LAST_ACTIVE_INIT", false)) {
            pUU.KWHzl("OKXConnectCacheManager", "Init lastActiveTimestamp");
            C16011ebq c16011ebq4 = this.this$0;
            this.L$0 = sharedPreferences;
            this.J$0 = jCurrentTimeMillis;
            this.label = 2;
            objOLrzqt = c16011ebq4.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            List listQOLQEE22 = C56403yEb.QOLQEE(((Map) objOLrzqt).values());
            ArrayList<DAppSession> arrayList32 = new ArrayList();
            while (r5.hasNext()) {
            }
            C16011ebq c16011ebq22 = this.this$0;
            while (r9.hasNext()) {
            }
            if (sharedPreferences != null) {
                editorPutBoolean.apply();
            }
        }
        C16011ebq c16011ebq32 = this.this$0;
        this.L$0 = null;
        this.J$0 = jCurrentTimeMillis;
        this.label = 3;
        objOLrzqt2 = c16011ebq32.OLrzqt(this);
        if (objOLrzqt2 == objCopydefault) {
        }
        List listQOLQEE32 = C56403yEb.QOLQEE(((Map) objOLrzqt2).values());
        int i222 = this.$expiryDurationInDays;
        ArrayList arrayList42 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList222 = new ArrayList(C56403yEb.AYXKKw(arrayList42, 10));
        it = arrayList42.iterator();
        while (it.hasNext()) {
        }
        return arrayList222;
    }
}
