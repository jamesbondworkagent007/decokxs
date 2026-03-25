package o;

import com.okinc.business.defi.biz.database.extra.repository.ReferralInfoRepository$deleteReferralInfo$1;
import com.okinc.business.defi.biz.database.extra.repository.ReferralInfoRepository$getAllReferralInfo$1;
import com.okinc.business.defi.biz.database.extra.repository.ReferralInfoRepository$getReferralInfo$1;
import com.okinc.business.defi.biz.database.extra.repository.ReferralInfoRepository$saveReferralInfo$1;
import com.okinc.business.defi.biz.database.extra.repository.ReferralInfoRepository$updateReferralInfo$1;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11286cIp {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final cHP EZpvd;

    public C11286cIp(@NotNull cHP chp) {
        Intrinsics.checkNotNullParameter(chp, "");
        this.EZpvd = chp;
    }

    /* JADX INFO: renamed from: o.cIp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cIp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ReferralInfoRepository$saveReferralInfo$1 referralInfoRepository$saveReferralInfo$1;
        if (continuation instanceof ReferralInfoRepository$saveReferralInfo$1) {
            referralInfoRepository$saveReferralInfo$1 = (ReferralInfoRepository$saveReferralInfo$1) continuation;
            int i = referralInfoRepository$saveReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralInfoRepository$saveReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                referralInfoRepository$saveReferralInfo$1 = new ReferralInfoRepository$saveReferralInfo$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = referralInfoRepository$saveReferralInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralInfoRepository$saveReferralInfo$1.label;
        boolean z = false;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                try {
                    C11276cIf c11276cIf = new C11276cIf(str, str2, C14645dpP.OLrzqt.AEQbTJ(str3), 0L, java.lang.System.currentTimeMillis(), 8, null);
                    cHP chp = this.EZpvd;
                    referralInfoRepository$saveReferralInfo$1.label = 1;
                    objAEQbTJ = chp.AEQbTJ(c11276cIf, referralInfoRepository$saveReferralInfo$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("DexReferral", "ReferralInfoRepository Failed to encrypt referral info", e);
                    return C56443yFo.KWHzl(false);
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            if (((java.lang.Number) objAEQbTJ).longValue() > 0) {
                z = true;
            }
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("DexReferral", "ReferralInfoRepository Failed to save referral info", e2);
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation) {
        ReferralInfoRepository$getReferralInfo$1 referralInfoRepository$getReferralInfo$1;
        if (continuation instanceof ReferralInfoRepository$getReferralInfo$1) {
            referralInfoRepository$getReferralInfo$1 = (ReferralInfoRepository$getReferralInfo$1) continuation;
            int i = referralInfoRepository$getReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralInfoRepository$getReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                referralInfoRepository$getReferralInfo$1 = new ReferralInfoRepository$getReferralInfo$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = referralInfoRepository$getReferralInfo$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = referralInfoRepository$getReferralInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                cHP chp = this.EZpvd;
                referralInfoRepository$getReferralInfo$1.label = 1;
                objCopydefault = chp.copydefault(str, str2, referralInfoRepository$getReferralInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            C11276cIf c11276cIf = (C11276cIf) objCopydefault;
            if (c11276cIf != null) {
                try {
                    return C14645dpP.OLrzqt.copydefault(c11276cIf.OLrzqt());
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("DexReferral", "ReferralInfoRepository: Failed to decrypt referral info", e);
                    return null;
                }
            }
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("DexReferral", "ReferralInfoRepository: Failed to get referral info", e2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<Triple<java.lang.String, java.lang.String, java.lang.String>>> continuation) {
        ReferralInfoRepository$getAllReferralInfo$1 referralInfoRepository$getAllReferralInfo$1;
        Triple triple;
        if (continuation instanceof ReferralInfoRepository$getAllReferralInfo$1) {
            referralInfoRepository$getAllReferralInfo$1 = (ReferralInfoRepository$getAllReferralInfo$1) continuation;
            int i = referralInfoRepository$getAllReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralInfoRepository$getAllReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                referralInfoRepository$getAllReferralInfo$1 = new ReferralInfoRepository$getAllReferralInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = referralInfoRepository$getAllReferralInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralInfoRepository$getAllReferralInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                cHP chp = this.EZpvd;
                referralInfoRepository$getAllReferralInfo$1.label = 1;
                objKWHzl = chp.KWHzl(referralInfoRepository$getAllReferralInfo$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (C11276cIf c11276cIf : (java.lang.Iterable) objKWHzl) {
                try {
                    triple = new Triple(c11276cIf.copydefault(), c11276cIf.KWHzl(), C14645dpP.OLrzqt.copydefault(c11276cIf.OLrzqt()));
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("DexReferral", "ReferralInfoRepository Failed to decrypt referral info for " + c11276cIf.KWHzl(), e);
                    triple = null;
                }
                if (triple != null) {
                    arrayList.add(triple);
                }
            }
            return arrayList;
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("DexReferral", "ReferralInfoRepository Failed to get all referral info", e2);
            return yDY.AhwBna();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ReferralInfoRepository$deleteReferralInfo$1 referralInfoRepository$deleteReferralInfo$1;
        if (continuation instanceof ReferralInfoRepository$deleteReferralInfo$1) {
            referralInfoRepository$deleteReferralInfo$1 = (ReferralInfoRepository$deleteReferralInfo$1) continuation;
            int i = referralInfoRepository$deleteReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralInfoRepository$deleteReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                referralInfoRepository$deleteReferralInfo$1 = new ReferralInfoRepository$deleteReferralInfo$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = referralInfoRepository$deleteReferralInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralInfoRepository$deleteReferralInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                cHP chp = this.EZpvd;
                referralInfoRepository$deleteReferralInfo$1.label = 1;
                objOLrzqt = chp.OLrzqt(str, str2, referralInfoRepository$deleteReferralInfo$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "ReferralInfoRepository: Failed to delete referral info", e);
        }
        boolean z = ((java.lang.Number) objOLrzqt).intValue() > 0;
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        ReferralInfoRepository$updateReferralInfo$1 referralInfoRepository$updateReferralInfo$1;
        if (continuation instanceof ReferralInfoRepository$updateReferralInfo$1) {
            referralInfoRepository$updateReferralInfo$1 = (ReferralInfoRepository$updateReferralInfo$1) continuation;
            int i = referralInfoRepository$updateReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralInfoRepository$updateReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                referralInfoRepository$updateReferralInfo$1 = new ReferralInfoRepository$updateReferralInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = referralInfoRepository$updateReferralInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralInfoRepository$updateReferralInfo$1.label;
        boolean z = false;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                try {
                    C11276cIf c11276cIf = new C11276cIf(str, str2, C14645dpP.OLrzqt.AEQbTJ(str3), 0L, java.lang.System.currentTimeMillis(), 8, null);
                    cHP chp = this.EZpvd;
                    referralInfoRepository$updateReferralInfo$1.label = 1;
                    objKWHzl = chp.KWHzl(c11276cIf, referralInfoRepository$updateReferralInfo$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("DexReferral", "ReferralInfoRepository Failed to encrypt referral info", e);
                    return C56443yFo.KWHzl(false);
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            if (((java.lang.Number) objKWHzl).intValue() > 0) {
                z = true;
            }
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("DexReferral", "ReferralInfoRepository Failed to update referral info", e2);
        }
        return C56443yFo.KWHzl(z);
    }
}
