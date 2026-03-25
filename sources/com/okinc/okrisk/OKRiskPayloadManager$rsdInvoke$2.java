package com.okinc.okrisk;

import android.app.Application;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okrisk.OKRiskPayloadManager$rsdInvoke$2;
import com.okinc.okrisk.service.CommonBody;
import com.okinc.okrisk.service.RsdResponseData;
import com.okinc.okrisk.util.OssManagerUtil;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43419rot;
import o.C32979mnm;
import o.C43401rob;
import o.C43422row;
import o.C47213tlm;
import o.C47214tln;
import o.C47218tlr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46999thk;
import o.InterfaceC47028tiM;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskPayloadManager$rsdInvoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $biometricMessage;
    final /* synthetic */ int $currentAttempt;
    final /* synthetic */ int $pv;
    final /* synthetic */ String $rid;
    final /* synthetic */ String $scene;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $sv;
    final /* synthetic */ String $timestamp;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskPayloadManager$rsdInvoke$2(String str, int i, String str2, String str3, String str4, int i2, String str5, String str6, Continuation<? super OKRiskPayloadManager$rsdInvoke$2> continuation) {
        super(2, continuation);
        this.$scene = str;
        this.$currentAttempt = i;
        this.$timestamp = str2;
        this.$sessionId = str3;
        this.$biometricMessage = str4;
        this.$pv = i2;
        this.$sv = str5;
        this.$rid = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONST_STR  "rsdInvoke DEBUG - RSD config missing upload info or app_list empty" */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1() {
        return "rsdInvoke DEBUG - RSD config missing upload info or app_list empty";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONST_STR  "rsdInvoke DEBUG - RSD config decryption returned empty" */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$2() {
        return "rsdInvoke DEBUG - RSD config decryption returned empty";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKRiskPayloadManager$rsdInvoke$2 oKRiskPayloadManager$rsdInvoke$2 = new OKRiskPayloadManager$rsdInvoke$2(this.$scene, this.$currentAttempt, this.$timestamp, this.$sessionId, this.$biometricMessage, this.$pv, this.$sv, this.$rid, continuation);
        oKRiskPayloadManager$rsdInvoke$2.L$0 = obj;
        return oKRiskPayloadManager$rsdInvoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OKRiskPayloadManager$rsdInvoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        OssManagerUtil.NetworkUploadPolicy networkUploadPolicy;
        String strCopydefault;
        Object objPostRsd$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$sessionId;
            String str2 = this.$biometricMessage;
            String str3 = this.$timestamp;
            String str4 = this.$sv;
            int i2 = this.$pv;
            String str5 = this.$rid;
            String str6 = this.$scene;
            InterfaceC47028tiM interfaceC47028tiMEZpvd = InterfaceC47028tiM.Companion.EZpvd();
            CommonBody commonBody = new CommonBody(str, str2, str3, 1, str4, i2, str5, str6);
            this.label = 1;
            objPostRsd$default = InterfaceC47028tiM.Application.postRsd$default(interfaceC47028tiMEZpvd, commonBody, null, this, 2, null);
            if (objPostRsd$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                C56391yDq.AEQbTJ(obj);
                OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                String str7 = this.$timestamp;
                String str8 = this.$sessionId;
                String str9 = this.$biometricMessage;
                int i3 = this.$pv;
                String str10 = this.$sv;
                String str11 = this.$rid;
                String str12 = this.$scene;
                int i4 = this.$currentAttempt;
                this.label = 3;
                Object objAEQbTJ = oKRiskPayloadManager.AEQbTJ(str7, str8, str9, i3, str10, str11, str12, i4 + 1, this);
                return objAEQbTJ != objCopydefault ? objCopydefault : objAEQbTJ;
            }
            C56391yDq.AEQbTJ(obj);
            objPostRsd$default = obj;
        }
        ResponseData responseData = (ResponseData) objPostRsd$default;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar = new AbstractC43419rot.StateListAnimator(data);
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            String et = ((RsdResponseData) ((AbstractC43419rot.StateListAnimator) actionBar).AEQbTJ()).getEt();
            if (et.length() <= 0 || !Intrinsics.EZpvd((Object) this.$scene, (Object) "APP_START")) {
                return et;
            }
            OKRiskPayloadManager oKRiskPayloadManager2 = OKRiskPayloadManager.copydefault;
            if (!oKRiskPayloadManager2.iwGUEr()) {
                return et;
            }
            try {
                Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                InterfaceC46999thk interfaceC46999thkFJNWhG = oKRiskPayloadManager2.fJNWhG();
                String str13 = "";
                if (interfaceC46999thkFJNWhG != null && (strCopydefault = interfaceC46999thkFJNWhG.copydefault(applicationOLrzqt, et, "")) != null) {
                    str13 = strCopydefault;
                }
                if (str13.length() <= 0) {
                    oKRiskPayloadManager2.EZpvd((Function0<String>) new Function0() { // from class: o.thP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKRiskPayloadManager$rsdInvoke$2.invokeSuspend$lambda$2();
                        }
                    });
                    return et;
                }
                C47218tlr c47218tlrCopydefault = C47214tln.copydefault(str13);
                if (c47218tlrCopydefault == null || !(!c47218tlrCopydefault.EZpvd().isEmpty())) {
                    oKRiskPayloadManager2.EZpvd((Function0<String>) new Function0() { // from class: o.thN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OKRiskPayloadManager$rsdInvoke$2.invokeSuspend$lambda$1();
                        }
                    });
                    return et;
                }
                if (oKRiskPayloadManager2.hDKMBd()) {
                    networkUploadPolicy = OssManagerUtil.NetworkUploadPolicy.WIFI_OR_MOBILE;
                } else {
                    networkUploadPolicy = OssManagerUtil.NetworkUploadPolicy.WIFI_ONLY;
                }
                C47213tlm.copydefault.KWHzl(applicationOLrzqt, c47218tlrCopydefault, networkUploadPolicy);
                return et;
            } catch (Exception e) {
                OKRiskPayloadManager.copydefault.EZpvd((Function0<String>) new Function0() { // from class: o.thM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return OKRiskPayloadManager$rsdInvoke$2.invokeSuspend$lambda$3(e);
                    }
                });
                return et;
            }
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.$currentAttempt >= OKRiskPayloadManager.AkhnZx) {
            return null;
        }
        long jPow = (long) (Math.pow(2.0d, this.$currentAttempt) * 1000);
        this.label = 2;
        if (DelayKt.delay(jPow, this) == objCopydefault) {
            return objCopydefault;
        }
        OKRiskPayloadManager oKRiskPayloadManager3 = OKRiskPayloadManager.copydefault;
        String str72 = this.$timestamp;
        String str82 = this.$sessionId;
        String str92 = this.$biometricMessage;
        int i32 = this.$pv;
        String str102 = this.$sv;
        String str112 = this.$rid;
        String str122 = this.$scene;
        int i42 = this.$currentAttempt;
        this.label = 3;
        Object objAEQbTJ2 = oKRiskPayloadManager3.AEQbTJ(str72, str82, str92, i32, str102, str112, str122, i42 + 1, this);
        if (objAEQbTJ2 != objCopydefault) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$3(Exception exc) {
        return "rsdInvoke DEBUG - Failed to decrypt RSD config: " + exc.getMessage();
    }
}
