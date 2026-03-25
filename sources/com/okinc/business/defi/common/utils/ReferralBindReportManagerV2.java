package com.okinc.business.defi.common.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.okinc.business.defi.common.utils.ReferralBindReportManagerV2;
import com.okinc.core.util.SPUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.AbstractC12782ctV;
import o.C13458dMb;
import o.C13934dbu;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C9678baC;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralBindReportManagerV2 {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C13934dbu AEQbTJ;
    public final Json EZpvd;
    public final CoroutineDispatcher KWHzl;

    public ReferralBindReportManagerV2(@NotNull C13934dbu c13934dbu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c13934dbu;
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = JsonKt.Json$default(null, new Function1() { // from class: o.dpN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReferralBindReportManagerV2.OLrzqt((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.common.utils.ReferralBindReportManagerV2.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ ReferralManager getInstance$default(StateListAnimator stateListAnimator, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.KWHzl(context);
        }

        public final ReferralManager KWHzl(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).getNewProxyInstance();
        }
    }

    public static final Unit OLrzqt(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final Object OLrzqt(@NotNull String str, @NotNull Map<String, String> map, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull String str2, @NotNull String str3, int i, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ReferralBindReportManagerV2$report$2(abstractC12782ctV, str, str2, str3, map, i, z, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x002f, B:28:0x00af, B:30:0x00b7, B:31:0x00cf), top: B:43:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x002f, B:28:0x00af, B:30:0x00b7, B:31:0x00cf), top: B:43:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralBindReportManagerV2$submitCurrentWalletReports$1 referralBindReportManagerV2$submitCurrentWalletReports$1;
        String strDbNXlk;
        ReferralBindReportManagerV2 referralBindReportManagerV2;
        String str;
        if (continuation instanceof ReferralBindReportManagerV2$submitCurrentWalletReports$1) {
            referralBindReportManagerV2$submitCurrentWalletReports$1 = (ReferralBindReportManagerV2$submitCurrentWalletReports$1) continuation;
            int i = referralBindReportManagerV2$submitCurrentWalletReports$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralBindReportManagerV2$submitCurrentWalletReports$1.label = i - Integer.MIN_VALUE;
            } else {
                referralBindReportManagerV2$submitCurrentWalletReports$1 = new ReferralBindReportManagerV2$submitCurrentWalletReports$1(this, continuation);
            }
        }
        Object obj = referralBindReportManagerV2$submitCurrentWalletReports$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralBindReportManagerV2$submitCurrentWalletReports$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                strDbNXlk = abstractC12782ctV.DbNXlk();
                ReferralBindReportDataV2 referralBindReportDataV2 = KWHzl().get(strDbNXlk);
                if (referralBindReportDataV2 == null) {
                    pUU.KWHzl("ReferralBindReportManagerV2", "No pending report found for current wallet: " + strDbNXlk);
                    return Unit.INSTANCE;
                }
                pUU.KWHzl("ReferralBindReportManagerV2", "Found pending report for current wallet: " + strDbNXlk + ", starting to submit");
                try {
                    pUU.KWHzl("ReferralBindReportManagerV2", "Submitting report for current wallet: " + strDbNXlk + ", currentWalletReport: " + referralBindReportDataV2);
                    referralBindReportManagerV2$submitCurrentWalletReports$1.L$0 = this;
                    referralBindReportManagerV2$submitCurrentWalletReports$1.L$1 = strDbNXlk;
                    referralBindReportManagerV2$submitCurrentWalletReports$1.label = 1;
                    Object objCopydefault2 = copydefault(referralBindReportDataV2, abstractC12782ctV, referralBindReportManagerV2$submitCurrentWalletReports$1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    referralBindReportManagerV2 = this;
                    obj = objCopydefault2;
                    str = strDbNXlk;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                } catch (Exception e) {
                    e = e;
                    pUU.AEQbTJ("ReferralBindReportManagerV2", "Error submitting report for current wallet: " + strDbNXlk, e);
                }
            } catch (Exception e2) {
                pUU.AEQbTJ("ReferralBindReportManagerV2", "Error in submitCurrentWalletReports: " + e2.getMessage(), e2);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) referralBindReportManagerV2$submitCurrentWalletReports$1.L$1;
            referralBindReportManagerV2 = (ReferralBindReportManagerV2) referralBindReportManagerV2$submitCurrentWalletReports$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                    referralBindReportManagerV2.OLrzqt(str);
                    pUU.KWHzl("ReferralBindReportManagerV2", "Report submitted successfully and removed from SP for current wallet: " + str);
                } else {
                    pUU.valueOf("ReferralBindReportManagerV2", "Report submission failed for current wallet: " + str + ", will retry later");
                }
            } catch (Exception e3) {
                strDbNXlk = str;
                e = e3;
                pUU.AEQbTJ("ReferralBindReportManagerV2", "Error submitting report for current wallet: " + strDbNXlk, e);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[Catch: Exception -> 0x014d, TRY_LEAVE, TryCatch #2 {Exception -> 0x014d, blocks: (B:28:0x009c, B:30:0x00a2, B:46:0x0135, B:23:0x0064, B:25:0x006e, B:27:0x0076), top: B:56:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[Catch: Exception -> 0x005e, TryCatch #1 {Exception -> 0x005e, blocks: (B:13:0x003a, B:35:0x00df, B:37:0x00e7, B:39:0x0118, B:38:0x00ff, B:18:0x0059), top: B:54:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff A[Catch: Exception -> 0x005e, TryCatch #1 {Exception -> 0x005e, blocks: (B:13:0x003a, B:35:0x00df, B:37:0x00e7, B:39:0x0118, B:38:0x00ff, B:18:0x0059), top: B:54:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v0, types: [o.ctV] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, o.ctV] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.okinc.business.defi.common.utils.ReferralBindReportManagerV2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.okinc.business.defi.common.utils.ReferralBindReportManagerV2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0128 -> B:14:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0149 -> B:28:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralBindReportManagerV2$submitAllPendingReports$1 referralBindReportManagerV2$submitAllPendingReports$1;
        ?? r10;
        ?? r7;
        ?? r12;
        ?? r2;
        ?? it;
        ?? r22;
        ?? r72;
        ?? r6;
        ?? r122;
        ?? r73;
        ?? r62;
        ?? r23;
        Map<String, ReferralBindReportDataV2> mapKWHzl;
        if (continuation instanceof ReferralBindReportManagerV2$submitAllPendingReports$1) {
            referralBindReportManagerV2$submitAllPendingReports$1 = (ReferralBindReportManagerV2$submitAllPendingReports$1) continuation;
            int i = referralBindReportManagerV2$submitAllPendingReports$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralBindReportManagerV2$submitAllPendingReports$1.label = i - Integer.MIN_VALUE;
            } else {
                referralBindReportManagerV2$submitAllPendingReports$1 = new ReferralBindReportManagerV2$submitAllPendingReports$1(this, continuation);
            }
        }
        Object obj = referralBindReportManagerV2$submitAllPendingReports$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r24 = referralBindReportManagerV2$submitAllPendingReports$1.label;
        try {
        } catch (Exception e) {
            e = e;
            r10 = r72;
            r7 = abstractC12782ctV;
            r12 = r6;
            r2 = r24;
            ?? r63 = r10;
            pUU.AEQbTJ("ReferralBindReportManagerV2", "Error submitting report for accountId: " + r7, e);
            it = r2;
            r22 = r63;
            r122 = r12;
        }
        if (r24 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                mapKWHzl = KWHzl();
            } catch (Exception e2) {
                pUU.AEQbTJ("ReferralBindReportManagerV2", "Error in submitAllPendingReports: " + e2.getMessage(), e2);
            }
            if (mapKWHzl.isEmpty()) {
                pUU.KWHzl("ReferralBindReportManagerV2", "No pending reports to submit");
                return Unit.INSTANCE;
            }
            pUU.KWHzl("ReferralBindReportManagerV2", "Found " + mapKWHzl.size() + " pending reports, starting to submit");
            r22 = this;
            r122 = abstractC12782ctV;
            it = mapKWHzl.entrySet().iterator();
            if (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (r24 == 1) {
            String str = (String) referralBindReportManagerV2$submitAllPendingReports$1.L$3;
            Iterator it2 = (Iterator) referralBindReportManagerV2$submitAllPendingReports$1.L$2;
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) referralBindReportManagerV2$submitAllPendingReports$1.L$1;
            ReferralBindReportManagerV2 referralBindReportManagerV2 = (ReferralBindReportManagerV2) referralBindReportManagerV2$submitAllPendingReports$1.L$0;
            C56391yDq.AEQbTJ(obj);
            r24 = it2;
            r6 = abstractC12782ctV2;
            r72 = referralBindReportManagerV2;
            abstractC12782ctV = str;
            if (!((Boolean) obj).booleanValue()) {
            }
            referralBindReportManagerV2$submitAllPendingReports$1.L$0 = r72;
            referralBindReportManagerV2$submitAllPendingReports$1.L$1 = r6;
            referralBindReportManagerV2$submitAllPendingReports$1.L$2 = r24;
            referralBindReportManagerV2$submitAllPendingReports$1.L$3 = abstractC12782ctV;
            referralBindReportManagerV2$submitAllPendingReports$1.label = 2;
            r23 = r24;
            r62 = r6;
            r73 = r72;
            if (DelayKt.delay(500L, referralBindReportManagerV2$submitAllPendingReports$1) == objCopydefault) {
            }
            it = r23;
            r122 = r62;
            r22 = r73;
            if (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (r24 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it3 = (Iterator) referralBindReportManagerV2$submitAllPendingReports$1.L$2;
        AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) referralBindReportManagerV2$submitAllPendingReports$1.L$1;
        ReferralBindReportManagerV2 referralBindReportManagerV22 = (ReferralBindReportManagerV2) referralBindReportManagerV2$submitAllPendingReports$1.L$0;
        C56391yDq.AEQbTJ(obj);
        r23 = it3;
        r62 = abstractC12782ctV3;
        r73 = referralBindReportManagerV22;
        it = r23;
        r122 = r62;
        r22 = r73;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            ReferralBindReportDataV2 referralBindReportDataV2 = (ReferralBindReportDataV2) entry.getValue();
            try {
            } catch (Exception e3) {
                r10 = r22;
                r2 = it;
                e = e3;
                r7 = str2;
                r12 = r122;
                ?? r632 = r10;
                pUU.AEQbTJ("ReferralBindReportManagerV2", "Error submitting report for accountId: " + r7, e);
                it = r2;
                r22 = r632;
                r122 = r12;
                if (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            pUU.KWHzl("ReferralBindReportManagerV2", "Submitting report for accountId: " + str2);
            referralBindReportManagerV2$submitAllPendingReports$1.L$0 = r22;
            referralBindReportManagerV2$submitAllPendingReports$1.L$1 = r122;
            referralBindReportManagerV2$submitAllPendingReports$1.L$2 = it;
            referralBindReportManagerV2$submitAllPendingReports$1.L$3 = str2;
            referralBindReportManagerV2$submitAllPendingReports$1.label = 1;
            Object objCopydefault2 = r22.copydefault(referralBindReportDataV2, r122, referralBindReportManagerV2$submitAllPendingReports$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            r6 = r122;
            abstractC12782ctV = str2;
            r72 = r22;
            r24 = it;
            obj = objCopydefault2;
            if (!((Boolean) obj).booleanValue()) {
                r72.OLrzqt(abstractC12782ctV);
                pUU.KWHzl("ReferralBindReportManagerV2", "Report submitted successfully and removed from SP for accountId: " + abstractC12782ctV);
            } else {
                pUU.valueOf("ReferralBindReportManagerV2", "Report submission failed for accountId: " + abstractC12782ctV + ", will retry later");
            }
            referralBindReportManagerV2$submitAllPendingReports$1.L$0 = r72;
            referralBindReportManagerV2$submitAllPendingReports$1.L$1 = r6;
            referralBindReportManagerV2$submitAllPendingReports$1.L$2 = r24;
            referralBindReportManagerV2$submitAllPendingReports$1.L$3 = abstractC12782ctV;
            referralBindReportManagerV2$submitAllPendingReports$1.label = 2;
            r23 = r24;
            r62 = r6;
            r73 = r72;
            if (DelayKt.delay(500L, referralBindReportManagerV2$submitAllPendingReports$1) == objCopydefault) {
                return objCopydefault;
            }
            it = r23;
            r122 = r62;
            r22 = r73;
            if (it.hasNext()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0 A[Catch: Exception -> 0x0069, TryCatch #1 {Exception -> 0x0069, blocks: (B:32:0x00d8, B:34:0x00e0, B:37:0x00e7, B:17:0x0064), top: B:55:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0130 -> B:48:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013a -> B:50:0x0141). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(ReferralBindReportDataV2 referralBindReportDataV2, AbstractC12782ctV abstractC12782ctV, Continuation<? super Boolean> continuation) throws Throwable {
        ReferralBindReportManagerV2$submitReportWithRetry$1 referralBindReportManagerV2$submitReportWithRetry$1;
        ReferralBindReportManagerV2 referralBindReportManagerV2;
        AbstractC12782ctV abstractC12782ctV2;
        ReferralBindReportManagerV2$submitReportWithRetry$1 referralBindReportManagerV2$submitReportWithRetry$12;
        ReferralBindReportManagerV2 referralBindReportManagerV22;
        int i;
        int i2;
        ReferralBindReportDataV2 referralBindReportDataV22;
        ReferralBindReportDataV2 referralBindReportDataV23;
        AbstractC12782ctV abstractC12782ctV3;
        ReferralBindReportManagerV2 referralBindReportManagerV23;
        int i3;
        int i4;
        AbstractC12782ctV abstractC12782ctV4;
        boolean z;
        int i5;
        Exception e;
        ReferralBindReportDataV2 referralBindReportDataV24;
        ReferralBindReportManagerV2 referralBindReportManagerV24;
        if (continuation instanceof ReferralBindReportManagerV2$submitReportWithRetry$1) {
            referralBindReportManagerV2$submitReportWithRetry$1 = (ReferralBindReportManagerV2$submitReportWithRetry$1) continuation;
            int i6 = referralBindReportManagerV2$submitReportWithRetry$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                referralBindReportManagerV2$submitReportWithRetry$1.label = i6 - Integer.MIN_VALUE;
                referralBindReportManagerV2 = this;
            } else {
                referralBindReportManagerV2 = this;
                referralBindReportManagerV2$submitReportWithRetry$1 = new ReferralBindReportManagerV2$submitReportWithRetry$1(referralBindReportManagerV2, continuation);
            }
        }
        Object objCopydefault = referralBindReportManagerV2$submitReportWithRetry$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i7 = referralBindReportManagerV2$submitReportWithRetry$1.label;
        int i8 = 2;
        boolean z2 = true;
        z2 = true;
        if (i7 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            abstractC12782ctV2 = abstractC12782ctV;
            referralBindReportManagerV2$submitReportWithRetry$12 = referralBindReportManagerV2$submitReportWithRetry$1;
            referralBindReportManagerV22 = referralBindReportManagerV2;
            i = 1;
            i2 = 0;
            referralBindReportDataV22 = referralBindReportDataV2;
            if (i2 < i) {
            }
        } else if (i7 == 1) {
            i5 = referralBindReportManagerV2$submitReportWithRetry$1.I$2;
            int i9 = referralBindReportManagerV2$submitReportWithRetry$1.I$1;
            int i10 = referralBindReportManagerV2$submitReportWithRetry$1.I$0;
            AbstractC12782ctV abstractC12782ctV5 = (AbstractC12782ctV) referralBindReportManagerV2$submitReportWithRetry$1.L$2;
            ReferralBindReportDataV2 referralBindReportDataV25 = (ReferralBindReportDataV2) referralBindReportManagerV2$submitReportWithRetry$1.L$1;
            ReferralBindReportManagerV2 referralBindReportManagerV25 = (ReferralBindReportManagerV2) referralBindReportManagerV2$submitReportWithRetry$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                i2 = i9;
                referralBindReportManagerV23 = referralBindReportManagerV25;
                referralBindReportDataV23 = referralBindReportDataV25;
                abstractC12782ctV3 = abstractC12782ctV5;
                i = i10;
            } catch (Exception e2) {
                e = e2;
                i2 = i9;
                referralBindReportManagerV23 = referralBindReportManagerV25;
                referralBindReportDataV23 = referralBindReportDataV25;
                abstractC12782ctV3 = abstractC12782ctV5;
                i = i10;
                pUU.AEQbTJ("ReferralBindReportManagerV2", "Error in submitReportWithRetry, retry count: " + i5, e);
                if (i5 < 0) {
                    referralBindReportManagerV2$submitReportWithRetry$1.L$0 = referralBindReportManagerV23;
                    referralBindReportManagerV2$submitReportWithRetry$1.L$1 = referralBindReportDataV23;
                    referralBindReportManagerV2$submitReportWithRetry$1.L$2 = abstractC12782ctV3;
                    referralBindReportManagerV2$submitReportWithRetry$1.I$0 = i;
                    referralBindReportManagerV2$submitReportWithRetry$1.I$1 = i2;
                    referralBindReportManagerV2$submitReportWithRetry$1.label = 3;
                    if (DelayKt.delay(500L, referralBindReportManagerV2$submitReportWithRetry$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    i3 = i2;
                    i4 = i;
                    abstractC12782ctV4 = abstractC12782ctV3;
                    referralBindReportDataV24 = referralBindReportDataV23;
                    referralBindReportManagerV24 = referralBindReportManagerV23;
                    referralBindReportManagerV2$submitReportWithRetry$12 = referralBindReportManagerV2$submitReportWithRetry$1;
                    referralBindReportDataV22 = referralBindReportDataV24;
                    referralBindReportManagerV22 = referralBindReportManagerV24;
                    z = true;
                    int i11 = i3 + 1;
                    z2 = z;
                    abstractC12782ctV2 = abstractC12782ctV4;
                    i8 = 2;
                    i = i4;
                    i2 = i11;
                    if (i2 < i) {
                    }
                }
                i3 = i2;
                i4 = i;
                abstractC12782ctV4 = abstractC12782ctV3;
                z = true;
                referralBindReportManagerV22 = referralBindReportManagerV23;
                referralBindReportManagerV2$submitReportWithRetry$12 = referralBindReportManagerV2$submitReportWithRetry$1;
                referralBindReportDataV22 = referralBindReportDataV23;
                int i112 = i3 + 1;
                z2 = z;
                abstractC12782ctV2 = abstractC12782ctV4;
                i8 = 2;
                i = i4;
                i2 = i112;
                if (i2 < i) {
                }
            }
            if (((Boolean) objCopydefault).booleanValue()) {
            }
        } else if (i7 == 2) {
            i5 = referralBindReportManagerV2$submitReportWithRetry$1.I$2;
            i2 = referralBindReportManagerV2$submitReportWithRetry$1.I$1;
            i = referralBindReportManagerV2$submitReportWithRetry$1.I$0;
            abstractC12782ctV3 = (AbstractC12782ctV) referralBindReportManagerV2$submitReportWithRetry$1.L$2;
            referralBindReportDataV23 = (ReferralBindReportDataV2) referralBindReportManagerV2$submitReportWithRetry$1.L$1;
            referralBindReportManagerV23 = (ReferralBindReportManagerV2) referralBindReportManagerV2$submitReportWithRetry$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
            } catch (Exception e3) {
                e = e3;
                pUU.AEQbTJ("ReferralBindReportManagerV2", "Error in submitReportWithRetry, retry count: " + i5, e);
                if (i5 < 0) {
                }
            }
            i3 = i2;
            i4 = i;
            abstractC12782ctV4 = abstractC12782ctV3;
            z = true;
            referralBindReportManagerV22 = referralBindReportManagerV23;
            referralBindReportManagerV2$submitReportWithRetry$12 = referralBindReportManagerV2$submitReportWithRetry$1;
            referralBindReportDataV22 = referralBindReportDataV23;
            int i1122 = i3 + 1;
            z2 = z;
            abstractC12782ctV2 = abstractC12782ctV4;
            i8 = 2;
            i = i4;
            i2 = i1122;
            if (i2 < i) {
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = referralBindReportManagerV2$submitReportWithRetry$1.I$1;
            i4 = referralBindReportManagerV2$submitReportWithRetry$1.I$0;
            abstractC12782ctV4 = (AbstractC12782ctV) referralBindReportManagerV2$submitReportWithRetry$1.L$2;
            referralBindReportDataV24 = (ReferralBindReportDataV2) referralBindReportManagerV2$submitReportWithRetry$1.L$1;
            referralBindReportManagerV24 = (ReferralBindReportManagerV2) referralBindReportManagerV2$submitReportWithRetry$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            referralBindReportManagerV2$submitReportWithRetry$12 = referralBindReportManagerV2$submitReportWithRetry$1;
            referralBindReportDataV22 = referralBindReportDataV24;
            referralBindReportManagerV22 = referralBindReportManagerV24;
            z = true;
            int i11222 = i3 + 1;
            z2 = z;
            abstractC12782ctV2 = abstractC12782ctV4;
            i8 = 2;
            i = i4;
            i2 = i11222;
            if (i2 < i) {
                try {
                } catch (Exception e4) {
                    e = e4;
                    referralBindReportDataV23 = referralBindReportDataV22;
                    referralBindReportManagerV2$submitReportWithRetry$1 = referralBindReportManagerV2$submitReportWithRetry$12;
                    referralBindReportManagerV23 = referralBindReportManagerV22;
                    abstractC12782ctV3 = abstractC12782ctV2;
                    i5 = i2;
                    pUU.AEQbTJ("ReferralBindReportManagerV2", "Error in submitReportWithRetry, retry count: " + i5, e);
                    if (i5 < 0) {
                    }
                    i3 = i2;
                    i4 = i;
                    abstractC12782ctV4 = abstractC12782ctV3;
                    z = true;
                    referralBindReportManagerV22 = referralBindReportManagerV23;
                    referralBindReportManagerV2$submitReportWithRetry$12 = referralBindReportManagerV2$submitReportWithRetry$1;
                    referralBindReportDataV22 = referralBindReportDataV23;
                    int i112222 = i3 + 1;
                    z2 = z;
                    abstractC12782ctV2 = abstractC12782ctV4;
                    i8 = 2;
                    i = i4;
                    i2 = i112222;
                    if (i2 < i) {
                    }
                }
                pUU.KWHzl("ReferralBindReportManagerV2", "Attempting to submit report, retry count: " + i2);
                String strUSBtdM = abstractC12782ctV2.USBtdM();
                String strDbNXlk = abstractC12782ctV2.DbNXlk();
                referralBindReportManagerV2$submitReportWithRetry$12.L$0 = referralBindReportManagerV22;
                referralBindReportManagerV2$submitReportWithRetry$12.L$1 = referralBindReportDataV22;
                referralBindReportManagerV2$submitReportWithRetry$12.L$2 = abstractC12782ctV2;
                referralBindReportManagerV2$submitReportWithRetry$12.I$0 = i;
                referralBindReportManagerV2$submitReportWithRetry$12.I$1 = i2;
                referralBindReportManagerV2$submitReportWithRetry$12.I$2 = i2;
                referralBindReportManagerV2$submitReportWithRetry$12.label = z2 ? 1 : 0;
                objCopydefault = referralBindReportManagerV22.copydefault(strUSBtdM, strDbNXlk, referralBindReportDataV22, referralBindReportManagerV2$submitReportWithRetry$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                referralBindReportDataV23 = referralBindReportDataV22;
                referralBindReportManagerV2$submitReportWithRetry$1 = referralBindReportManagerV2$submitReportWithRetry$12;
                referralBindReportManagerV23 = referralBindReportManagerV22;
                abstractC12782ctV3 = abstractC12782ctV2;
                i5 = i2;
                if (((Boolean) objCopydefault).booleanValue()) {
                    return C56443yFo.KWHzl(z2);
                }
                if (i5 < 0) {
                    pUU.KWHzl("ReferralBindReportManagerV2", "Submission failed, retrying in 500ms...");
                    referralBindReportManagerV2$submitReportWithRetry$1.L$0 = referralBindReportManagerV23;
                    referralBindReportManagerV2$submitReportWithRetry$1.L$1 = referralBindReportDataV23;
                    referralBindReportManagerV2$submitReportWithRetry$1.L$2 = abstractC12782ctV3;
                    referralBindReportManagerV2$submitReportWithRetry$1.I$0 = i;
                    referralBindReportManagerV2$submitReportWithRetry$1.I$1 = i2;
                    referralBindReportManagerV2$submitReportWithRetry$1.I$2 = i5;
                    referralBindReportManagerV2$submitReportWithRetry$1.label = i8;
                    if (DelayKt.delay(500L, referralBindReportManagerV2$submitReportWithRetry$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                i3 = i2;
                i4 = i;
                abstractC12782ctV4 = abstractC12782ctV3;
                z = true;
                referralBindReportManagerV22 = referralBindReportManagerV23;
                referralBindReportManagerV2$submitReportWithRetry$12 = referralBindReportManagerV2$submitReportWithRetry$1;
                referralBindReportDataV22 = referralBindReportDataV23;
                int i1122222 = i3 + 1;
                z2 = z;
                abstractC12782ctV2 = abstractC12782ctV4;
                i8 = 2;
                i = i4;
                i2 = i1122222;
                if (i2 < i) {
                    return C56443yFo.KWHzl(false);
                }
            }
        }
    }

    public final Object copydefault(String str, String str2, ReferralBindReportDataV2 referralBindReportDataV2, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.KWHzl, new ReferralBindReportManagerV2$submitReportToServer$2(this, str, str2, referralBindReportDataV2, null), continuation);
    }

    public final void EZpvd(String str, ReferralBindReportDataV2 referralBindReportDataV2) {
        try {
            Map mapIsConnected = C56424yEw.isConnected(KWHzl());
            mapIsConnected.put(str, referralBindReportDataV2);
            Json json = this.EZpvd;
            json.getSerializersModule();
            byte[] bytes = json.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, ReferralBindReportDataV2.Companion.serializer()), mapIsConnected).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            SPUtils.put("referral_pending_report_v2", Base64.encodeToString(bytes, 0), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            pUU.KWHzl("ReferralBindReportManagerV2", "Saved report to SP for accountId: " + str);
        } catch (Exception e) {
            pUU.AEQbTJ("ReferralBindReportManagerV2", "Error saving report to SP", e);
        }
    }

    public final Map<String, ReferralBindReportDataV2> KWHzl() {
        Map<String, ReferralBindReportDataV2> mapKWHzl;
        try {
            String string = SPUtils.getString("referral_pending_report_v2", "", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            Intrinsics.copydefault((Object) string);
            if (string.length() > 0) {
                try {
                    byte[] bArrDecode = Base64.decode(string, 0);
                    Intrinsics.copydefault(bArrDecode);
                    String str = new String(bArrDecode, Charsets.UTF_8);
                    Json json = this.EZpvd;
                    json.getSerializersModule();
                    mapKWHzl = (Map) json.decodeFromString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, ReferralBindReportDataV2.Companion.serializer()), str);
                } catch (Exception e) {
                    pUU.AEQbTJ("ReferralBindReportManagerV2", "Error decoding existing reports, using empty map", e);
                    mapKWHzl = C56424yEw.KWHzl();
                }
            } else {
                mapKWHzl = C56424yEw.KWHzl();
            }
            return mapKWHzl;
        } catch (Exception e2) {
            pUU.AEQbTJ("ReferralBindReportManagerV2", "Error loading reports from SP", e2);
            return C56424yEw.KWHzl();
        }
    }

    public final void OLrzqt(String str) {
        try {
            Map mapIsConnected = C56424yEw.isConnected(KWHzl());
            mapIsConnected.remove(str);
            if (mapIsConnected.isEmpty()) {
                SPUtils.remove("referral_pending_report_v2", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
                pUU.KWHzl("ReferralBindReportManagerV2", "All reports submitted, cleared SP");
            } else {
                Json json = this.EZpvd;
                json.getSerializersModule();
                byte[] bytes = json.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, ReferralBindReportDataV2.Companion.serializer()), mapIsConnected).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                SPUtils.put("referral_pending_report_v2", Base64.encodeToString(bytes, 0), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
                pUU.KWHzl("ReferralBindReportManagerV2", "Removed report from SP for accountId: " + str);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("ReferralBindReportManagerV2", "Error removing report from SP", e);
        }
    }

    @Serializable
    public static final class ReferralBindReportDataV2 implements Parcelable {
        private static final KSerializer<Object>[] $childSerializers;
        private final String accountId;
        private final Map<String, String> address;
        private final String code;
        private final boolean restore;
        private final String signMsg;
        private final String signature;
        private final int source;
        private final long timestamp;
        private final String walletType;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<ReferralBindReportDataV2> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ReferralBindReportDataV2> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReferralBindReportDataV2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new ReferralBindReportDataV2(string, string2, string3, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReferralBindReportDataV2[] newArray(int i) {
                return new ReferralBindReportDataV2[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.signMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component4() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.accountId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.walletType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component7() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component8() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.restore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReferralBindReportDataV2 copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull String str4, @NotNull String str5, long j, int i, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new ReferralBindReportDataV2(str, str2, str3, map, str4, str5, j, i, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReferralBindReportDataV2)) {
                return false;
            }
            ReferralBindReportDataV2 referralBindReportDataV2 = (ReferralBindReportDataV2) obj;
            return Intrinsics.EZpvd((Object) this.code, (Object) referralBindReportDataV2.code) && Intrinsics.EZpvd((Object) this.signMsg, (Object) referralBindReportDataV2.signMsg) && Intrinsics.EZpvd((Object) this.signature, (Object) referralBindReportDataV2.signature) && Intrinsics.EZpvd(this.address, referralBindReportDataV2.address) && Intrinsics.EZpvd((Object) this.accountId, (Object) referralBindReportDataV2.accountId) && Intrinsics.EZpvd((Object) this.walletType, (Object) referralBindReportDataV2.walletType) && this.timestamp == referralBindReportDataV2.timestamp && this.source == referralBindReportDataV2.source && this.restore == referralBindReportDataV2.restore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getRestore() {
            return this.restore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSignMsg() {
            return this.signMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSignature() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWalletType() {
            return this.walletType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.code.hashCode() * 31) + this.signMsg.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.address.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.walletType.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.source)) * 31) + Boolean.hashCode(this.restore);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ReferralBindReportDataV2(code=" + this.code + ", signMsg=" + this.signMsg + ", signature=" + this.signature + ", address=" + this.address + ", accountId=" + this.accountId + ", walletType=" + this.walletType + ", timestamp=" + this.timestamp + ", source=" + this.source + ", restore=" + this.restore + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.code);
            parcel.writeString(this.signMsg);
            parcel.writeString(this.signature);
            Map<String, String> map = this.address;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
            parcel.writeString(this.accountId);
            parcel.writeString(this.walletType);
            parcel.writeLong(this.timestamp);
            parcel.writeInt(this.source);
            parcel.writeInt(this.restore ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.common.utils.ReferralBindReportManagerV2.ReferralBindReportDataV2.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ReferralBindReportDataV2> serializer() {
                return ReferralBindReportManagerV2$ReferralBindReportDataV2$$serializer.INSTANCE;
            }
        }

        static {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            $childSerializers = new KSerializer[]{null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null};
        }

        public /* synthetic */ ReferralBindReportDataV2(int i, String str, String str2, String str3, Map map, String str4, String str5, long j, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (503 != (i & 503)) {
                PluginExceptionsKt.throwMissingFieldException(i, 503, ReferralBindReportManagerV2$ReferralBindReportDataV2$$serializer.INSTANCE.getDescriptor());
            }
            this.code = str;
            this.signMsg = str2;
            this.signature = str3;
            if ((i & 8) == 0) {
                this.address = C56424yEw.KWHzl();
            } else {
                this.address = map;
            }
            this.accountId = str4;
            this.walletType = str5;
            this.timestamp = j;
            this.source = i2;
            this.restore = z;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ReferralBindReportDataV2 referralBindReportDataV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, referralBindReportDataV2.code);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, referralBindReportDataV2.signMsg);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, referralBindReportDataV2.signature);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(referralBindReportDataV2.address, C56424yEw.KWHzl())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], referralBindReportDataV2.address);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 4, referralBindReportDataV2.accountId);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, referralBindReportDataV2.walletType);
            compositeEncoder.encodeLongElement(serialDescriptor, 6, referralBindReportDataV2.timestamp);
            compositeEncoder.encodeIntElement(serialDescriptor, 7, referralBindReportDataV2.source);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, referralBindReportDataV2.restore);
        }

        public ReferralBindReportDataV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull String str4, @NotNull String str5, long j, int i, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.code = str;
            this.signMsg = str2;
            this.signature = str3;
            this.address = map;
            this.accountId = str4;
            this.walletType = str5;
            this.timestamp = j;
            this.source = i;
            this.restore = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:297)) : (r16v0 java.util.Map))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 long)
  (r21v0 int)
  (r22v0 boolean)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, long, int, boolean):void (m)] (LINE:293) call: com.okinc.business.defi.common.utils.ReferralBindReportManagerV2.ReferralBindReportDataV2.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, long, int, boolean):void type: THIS */
        public /* synthetic */ ReferralBindReportDataV2(String str, String str2, String str3, Map map, String str4, String str5, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i2 & 8) != 0 ? C56424yEw.KWHzl() : map, str4, str5, j, i, z);
        }
    }
}
