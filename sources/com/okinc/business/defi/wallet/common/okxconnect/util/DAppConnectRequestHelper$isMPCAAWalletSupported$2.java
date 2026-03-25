package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.CheckDappResonse;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$isMPCAAWalletSupported$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C16013ebs;
import o.C43423rox;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectRequestHelper$isMPCAAWalletSupported$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $dAppUrl;
    final /* synthetic */ AbstractC12782ctV $wallet;
    boolean Z$0;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$isMPCAAWalletSupported$2(AbstractC12782ctV abstractC12782ctV, C16013ebs c16013ebs, String str, Continuation<? super DAppConnectRequestHelper$isMPCAAWalletSupported$2> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = c16013ebs;
        this.$dAppUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$isMPCAAWalletSupported$2(this.$wallet, this.this$0, this.$dAppUrl, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DAppConnectRequestHelper$isMPCAAWalletSupported$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0011, B:42:0x00a9, B:44:0x00b4, B:12:0x0020, B:34:0x0079, B:36:0x0081, B:38:0x0087, B:43:0x00ac, B:31:0x0059, B:35:0x007c), top: B:52:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0011, B:42:0x00a9, B:44:0x00b4, B:12:0x0020, B:34:0x0079, B:36:0x0081, B:38:0x0087, B:43:0x00ac, B:31:0x0059, B:35:0x007c), top: B:52:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean fieldNames;
        CheckDappResonse checkDappResonse;
        boolean z;
        CheckDappResonse checkDappResonse2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z2 = true;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to get ton address: " + e.getMessage(), e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$wallet.htlTjW()) {
                return C56443yFo.KWHzl(false);
            }
            boolean z3 = this.$wallet.ORxRYg() || this.$wallet.AEQbTJ(WalletType.MPCWallet);
            fieldNames = this.$wallet.getFieldNames();
            if (fieldNames || z3) {
                if (z3) {
                    AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(this.this$0.values.AEQbTJ(this.$dAppUrl), new Function1() { // from class: o.ebx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(DAppConnectRequestHelper$isMPCAAWalletSupported$2.invokeSuspend$lambda$0((ResponseData) obj2));
                        }
                    });
                    this.Z$0 = fieldNames;
                    this.label = 1;
                    obj = AwaitKt.awaitFirst(abstractC58185ywXOLrzqt, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    checkDappResonse = new CheckDappResonse(true);
                    boolean result = checkDappResonse.getResult();
                    if (!fieldNames) {
                        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C43423rox.OLrzqt(this.this$0.values.copydefault(this.$dAppUrl), new Function1() { // from class: o.ebw
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return java.lang.Boolean.valueOf(DAppConnectRequestHelper$isMPCAAWalletSupported$2.invokeSuspend$lambda$1((ResponseData) obj2));
                            }
                        });
                        this.Z$0 = result;
                        this.label = 2;
                        Object objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXOLrzqt2, this);
                        if (objAwaitFirst == objCopydefault) {
                            return objCopydefault;
                        }
                        z = result;
                        obj = objAwaitFirst;
                        checkDappResonse2 = (CheckDappResonse) obj;
                        if (!checkDappResonse2.getResult()) {
                            z2 = false;
                        }
                    } else {
                        z = result;
                        checkDappResonse2 = new CheckDappResonse(true);
                        if (!checkDappResonse2.getResult()) {
                        }
                    }
                }
            }
            return C56443yFo.KWHzl(z2);
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            C56391yDq.AEQbTJ(obj);
            checkDappResonse2 = (CheckDappResonse) obj;
            if (!checkDappResonse2.getResult() || !z) {
                z2 = false;
            }
            return C56443yFo.KWHzl(z2);
        }
        fieldNames = this.Z$0;
        C56391yDq.AEQbTJ(obj);
        checkDappResonse = (CheckDappResonse) obj;
        boolean result2 = checkDappResonse.getResult();
        if (!fieldNames) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(ResponseData responseData) {
        return responseData.getCode() == 0 && responseData.getData() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(ResponseData responseData) {
        return responseData.getCode() == 0 && responseData.getData() != null;
    }
}
