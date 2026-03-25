package com.okinc.okrisk;

import android.util.Base64;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okrisk.service.DidBody;
import com.okinc.okrisk.service.DidResponse;
import com.okinc.okrisk.service.DidResponseTmp;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43419rot;
import o.C32979mnm;
import o.C33129mqd;
import o.C43401rob;
import o.C43422row;
import o.C46983thU;
import o.C46997thi;
import o.C47004thp;
import o.C47212tll;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46999thk;
import o.InterfaceC47028tiM;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskPayloadManager$didInvoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DidResponse>, Object> {
    final /* synthetic */ int $currentAttempt;
    final /* synthetic */ int $cv;
    final /* synthetic */ String $dataMessage;
    final /* synthetic */ String $did;
    final /* synthetic */ int $pv;
    final /* synthetic */ String $rid;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ boolean $shouldForceRetry;
    final /* synthetic */ String $sv;
    final /* synthetic */ String $timestamp;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskPayloadManager$didInvoke$2(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, int i3, boolean z, Continuation<? super OKRiskPayloadManager$didInvoke$2> continuation) {
        super(2, continuation);
        this.$sessionId = str;
        this.$dataMessage = str2;
        this.$timestamp = str3;
        this.$cv = i;
        this.$pv = i2;
        this.$rid = str4;
        this.$did = str5;
        this.$sv = str6;
        this.$currentAttempt = i3;
        this.$shouldForceRetry = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKRiskPayloadManager$didInvoke$2 oKRiskPayloadManager$didInvoke$2 = new OKRiskPayloadManager$didInvoke$2(this.$sessionId, this.$dataMessage, this.$timestamp, this.$cv, this.$pv, this.$rid, this.$did, this.$sv, this.$currentAttempt, this.$shouldForceRetry, continuation);
        oKRiskPayloadManager$didInvoke$2.L$0 = obj;
        return oKRiskPayloadManager$didInvoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DidResponse> continuation) {
        return ((OKRiskPayloadManager$didInvoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:181|(1:(1:(1:(3:7|8|169)(2:9|10))(3:11|160|(2:166|(1:168)(1:191))(2:164|165)))(3:13|14|15))(3:16|17|(1:19))|20|185|21|(2:26|27)(1:25)|184|30|(7:32|(4:189|34|(1:36)|37)|42|(1:44)|45|(10:47|(1:60)(1:59)|61|(1:69)(1:68)|(1:73)|74|(2:76|(11:78|(1:80)(1:81)|82|(1:84)(1:85)|86|(1:92)(1:91)|93|(1:99)(1:98)|100|(1:106)(1:105)|107)(1:108))(3:109|(1:111)|(1:113))|114|2f4|138)(1:142)|143)(2:144|(2:146|(5:148|179|149|153|154)(2:155|(6:157|(1:159)|160|(1:162)|166|(0)(0))(2:170|171)))(2:172|173))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        o.pUU.copydefault(o.AbstractC43419rot.TAG, "Error: " + r0);
        r2 = new o.AbstractC43419rot.ActionBar(o.C43422row.OLrzqt(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0512 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objPostDid$default;
        AbstractC43419rot actionBar;
        String cg;
        String rid;
        String ts;
        String cg2;
        String rid2;
        String ts2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                InterfaceC47028tiM interfaceC47028tiMEZpvd = InterfaceC47028tiM.Companion.EZpvd();
                DidBody didBody = new DidBody(this.$sessionId, this.$dataMessage, this.$timestamp, 1, this.$cv, this.$pv, this.$rid, this.$did, this.$sv);
                this.L$0 = coroutineScope;
                this.label = 1;
                objPostDid$default = InterfaceC47028tiM.Application.postDid$default(interfaceC47028tiMEZpvd, didBody, null, this, 2, null);
                if (objPostDid$default == objCopydefault) {
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
                    if (C47004thp.EZpvd.valueOf() != FingerprintIdStatus.SUCCESS && !this.$shouldForceRetry) {
                        return new DidResponse(FingerprintIdStatus.INTERNAL_NETWORK_ABORT, "", (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
                    }
                    OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                    String str = this.$timestamp;
                    String str2 = this.$sessionId;
                    String str3 = this.$dataMessage;
                    int i2 = this.$currentAttempt;
                    boolean z2 = this.$shouldForceRetry;
                    int i3 = this.$cv;
                    int i4 = this.$pv;
                    String str4 = this.$rid;
                    String str5 = this.$did;
                    String str6 = this.$sv;
                    this.label = 3;
                    Object objCopydefault2 = oKRiskPayloadManager.copydefault(str, str2, str3, i2 + 1, z2, i3, i4, str4, str5, str6, this);
                    return objCopydefault2 != objCopydefault ? objCopydefault : objCopydefault2;
                }
                C56391yDq.AEQbTJ(obj);
                objPostDid$default = obj;
            }
            ResponseData responseData = (ResponseData) objPostDid$default;
            int code = responseData.getCode();
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                OKRiskPayloadManager oKRiskPayloadManager2 = OKRiskPayloadManager.copydefault;
                OKRiskPayloadManager.fIwbmz = false;
                DidResponseTmp didResponseTmp = (DidResponseTmp) ((AbstractC43419rot.StateListAnimator) actionBar).AEQbTJ();
                DidResponse didResponse = new DidResponse(FingerprintIdStatus.Companion.AEQbTJ(didResponseTmp.getStatus()), didResponseTmp.getFingerprintId(), didResponseTmp.getEfp(), didResponseTmp.getE_deviceToken(), (String) null, 16, (DefaultConstructorMarker) null);
                if (!OKRiskPayloadManager.DbNXlk) {
                    try {
                        try {
                            InterfaceC46999thk interfaceC46999thkFJNWhG = oKRiskPayloadManager2.fJNWhG();
                            if (interfaceC46999thkFJNWhG != null) {
                                interfaceC46999thkFJNWhG.KWHzl();
                            }
                            OKRiskPayloadManager.DbNXlk = true;
                        } catch (Exception e) {
                            pUU.valueOf("OKRiskPayloadManager", "didInvoke DEBUG - Error calling markTargetAppInfoApiSuccess: " + e.getMessage());
                        }
                    } catch (UnsatisfiedLinkError unused) {
                        pUU.valueOf("OKRiskPayloadManager", "didInvoke DEBUG - Native library not loaded, skipping markTargetAppInfoApiSuccess. Future requests will send full data instead of abbreviated data.");
                    }
                }
                if (didResponseTmp.getCv() != 0) {
                    OKRiskPayloadManager.fJNWhG.set(true);
                }
                if (OKRiskPayloadManager.AYXKKw) {
                    C47212tll.StateListAnimator stateListAnimator = C47212tll.Companion;
                    C47212tll c47212tllAEQbTJ = stateListAnimator.copydefault(C32979mnm.EZpvd.OLrzqt()).AEQbTJ();
                    boolean z3 = (didResponseTmp.getPv() == 0 || (rid2 = didResponseTmp.getRid()) == null || rid2.length() == 0 || (ts2 = didResponseTmp.getTs()) == null || ts2.length() == 0) ? false : true;
                    boolean z4 = (didResponseTmp.getCv() == 0 || (cg2 = didResponseTmp.getCg()) == null || cg2.length() == 0) ? false : true;
                    if (!z3 && !z4) {
                        z = false;
                    }
                    if (OKRiskPayloadManager.djBIcL) {
                        pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Taking isAppUpdated=true branch");
                        if (z) {
                            C47212tll c47212tllCopydefault = c47212tllAEQbTJ.copydefault("pv", didResponseTmp.getPv() != 0 ? didResponseTmp.getPv() : C33129mqd.AhwBna(stateListAnimator.OLrzqt().get("pv"))).copydefault("cv", didResponseTmp.getCv() != 0 ? didResponseTmp.getCv() : C33129mqd.AhwBna(stateListAnimator.OLrzqt().get("cv")));
                            String cg3 = didResponseTmp.getCg();
                            if (cg3 == null || cg3.length() == 0) {
                                Object obj2 = stateListAnimator.OLrzqt().get("cg");
                                Intrinsics.copydefault(obj2, "");
                                cg = (String) obj2;
                            } else {
                                cg = didResponseTmp.getCg();
                            }
                            C47212tll c47212tllKWHzl = c47212tllCopydefault.KWHzl("cg", cg);
                            String rid3 = didResponseTmp.getRid();
                            if (rid3 == null || rid3.length() == 0) {
                                Object obj3 = stateListAnimator.OLrzqt().get("rid");
                                Intrinsics.copydefault(obj3, "");
                                rid = (String) obj3;
                            } else {
                                rid = didResponseTmp.getRid();
                            }
                            C47212tll c47212tllCopydefault2 = c47212tllKWHzl.KWHzl("rid", rid).copydefault("OKRiskVersion", C33129mqd.AhwBna(stateListAnimator.OLrzqt().get("OKRiskVersion")));
                            String ts3 = didResponseTmp.getTs();
                            if (ts3 == null || ts3.length() == 0) {
                                Object obj4 = stateListAnimator.OLrzqt().get("ts");
                                Intrinsics.copydefault(obj4, "");
                                ts = (String) obj4;
                            } else {
                                ts = didResponseTmp.getTs();
                            }
                            c47212tllCopydefault2.EZpvd("ts", ts);
                            pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Saving parameters: hasCompletePvSet=" + z3 + ", hasCompleteCvSet=" + z4);
                        } else {
                            pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Skipping all parameter saves: no complete parameter set received");
                        }
                    } else {
                        pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Taking isAppUpdated=false branch");
                        if (z3) {
                            c47212tllAEQbTJ.copydefault("pv", didResponseTmp.getPv());
                            c47212tllAEQbTJ.KWHzl("rid", didResponseTmp.getRid());
                            c47212tllAEQbTJ.EZpvd("ts", didResponseTmp.getTs());
                        }
                        if (z4) {
                            c47212tllAEQbTJ.copydefault("cv", didResponseTmp.getCv());
                            c47212tllAEQbTJ.KWHzl("cg", didResponseTmp.getCg());
                        }
                    }
                    synchronized (OKRiskPayloadManager.AEQbTJ) {
                        if (!z) {
                            pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Skipping commit: no parameters saved to persistent storage");
                        } else if (c47212tllAEQbTJ.KWHzl()) {
                            pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Cache commit successful, updating in-memory cache");
                            if (z3) {
                                try {
                                    String ts4 = didResponseTmp.getTs();
                                    Intrinsics.copydefault((Object) ts4);
                                    byte[] bArrDecode = Base64.decode(ts4, 0);
                                    AtomicReference<C46983thU> atomicReferenceFARcdN = OKRiskPayloadManager.copydefault.fARcdN();
                                    int pv = didResponseTmp.getPv();
                                    String rid4 = didResponseTmp.getRid();
                                    Intrinsics.copydefault((Object) rid4);
                                    Intrinsics.copydefault(bArrDecode);
                                    atomicReferenceFARcdN.set(new C46983thU(pv, rid4, bArrDecode));
                                    pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Updated in-memory pv cache: pv=" + didResponseTmp.getPv() + ", rid=" + didResponseTmp.getRid());
                                } catch (IllegalArgumentException e2) {
                                    pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Failed to decode server ts data: " + e2.getMessage(), e2);
                                }
                            }
                            if (z4) {
                                try {
                                    String cg4 = didResponseTmp.getCg();
                                    Intrinsics.copydefault((Object) cg4);
                                    byte[] bArrDecode2 = Base64.decode(cg4, 0);
                                    AtomicReference<C46997thi> atomicReferenceFIwbmz = OKRiskPayloadManager.copydefault.fIwbmz();
                                    int cv = didResponseTmp.getCv();
                                    Intrinsics.copydefault(bArrDecode2);
                                    atomicReferenceFIwbmz.set(new C46997thi(cv, bArrDecode2));
                                    pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Updated in-memory cv cache: cv=" + didResponseTmp.getCv());
                                } catch (IllegalArgumentException e3) {
                                    pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Failed to decode server cg data: " + e3.getMessage(), e3);
                                }
                            }
                            if (OKRiskPayloadManager.djBIcL && z) {
                                C47212tll c47212tllCopydefault3 = C47212tll.Companion.copydefault(C32979mnm.EZpvd.OLrzqt());
                                OKRiskPayloadManager oKRiskPayloadManager3 = OKRiskPayloadManager.copydefault;
                                OKRiskPayloadManager.djBIcL = c47212tllCopydefault3.copydefault();
                                pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Updated cachedisAppUpdated: " + OKRiskPayloadManager.djBIcL + " (OKRiskVersion was saved)");
                            }
                        } else {
                            pUU.valueOf("OKRiskPayloadManager", "didInvoke DEBUG - Cache commit failed, skipping in-memory updates");
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    pUU.KWHzl("OKRiskPayloadManager", "didInvoke DEBUG - Dynamic config disabled, skipping cache updates");
                }
                return didResponse;
            }
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (code == 1) {
                OKRiskPayloadManager oKRiskPayloadManager4 = OKRiskPayloadManager.copydefault;
                OKRiskPayloadManager.fIwbmz = true;
                try {
                    C47212tll.Companion.copydefault(C32979mnm.EZpvd.OLrzqt()).AEQbTJ(true);
                    oKRiskPayloadManager4.fARcdN().set(new C46983thU(0, null, null, 7, null));
                    oKRiskPayloadManager4.fIwbmz().set(new C46997thi(0, null, 3, null));
                    pUU.KWHzl("OKRiskPayloadManager", "didInvoke - Cleared in-memory cache due to decryption failure (responseCode=" + code + "). No retry.");
                } catch (Exception e4) {
                    pUU.AEQbTJ("OKRiskPayloadManager", "Failed to clear in-memory cache: " + e4.getMessage(), e4);
                }
                return new DidResponse(FingerprintIdStatus.FAIL, "", (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
            }
            if (this.$currentAttempt < OKRiskPayloadManager.AkhnZx) {
                long jPow = (long) (Math.pow(2.0d, this.$currentAttempt) * 1000);
                this.L$0 = null;
                this.label = 2;
                if (DelayKt.delay(jPow, this) == objCopydefault) {
                    return objCopydefault;
                }
                if (C47004thp.EZpvd.valueOf() != FingerprintIdStatus.SUCCESS) {
                }
                OKRiskPayloadManager oKRiskPayloadManager5 = OKRiskPayloadManager.copydefault;
                String str7 = this.$timestamp;
                String str22 = this.$sessionId;
                String str32 = this.$dataMessage;
                int i22 = this.$currentAttempt;
                boolean z22 = this.$shouldForceRetry;
                int i32 = this.$cv;
                int i42 = this.$pv;
                String str42 = this.$rid;
                String str52 = this.$did;
                String str62 = this.$sv;
                this.label = 3;
                Object objCopydefault22 = oKRiskPayloadManager5.copydefault(str7, str22, str32, i22 + 1, z22, i32, i42, str42, str52, str62, this);
                if (objCopydefault22 != objCopydefault) {
                }
            } else {
                return new DidResponse(FingerprintIdStatus.FAIL, "", (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
            }
        } catch (Exception e5) {
            pUU.AEQbTJ("OKRiskPayloadManager", "didInvoke DEBUG - Exception occurred: " + e5.getMessage(), e5);
            return new DidResponse(FingerprintIdStatus.FAIL, "", (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
        }
        pUU.AEQbTJ("OKRiskPayloadManager", "didInvoke DEBUG - Exception occurred: " + e5.getMessage(), e5);
        return new DidResponse(FingerprintIdStatus.FAIL, "", (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
    }
}
