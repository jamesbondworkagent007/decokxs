package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core.util.KycCommonUtil$showDynamicFeatureToast$1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.rSF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rTu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42463rTu {
    public static Job AEQbTJ;
    public static final C42463rTu KWHzl = new C42463rTu();
    public static final int EZpvd = 8;

    private C42463rTu() {
    }

    public static /* synthetic */ kotlin.Pair resolveCorAndLanguage$default(C42463rTu c42463rTu, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c42463rTu.copydefault(str);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objM7377constructorimpl3;
        try {
            Result.Application application = Result.Companion;
            java.lang.String str2 = C33129mqd.OLrzqt((java.lang.CharSequence) str) ? str : null;
            if (str2 == null) {
                try {
                    objM7377constructorimpl2 = Result.m7377constructorimpl(((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph());
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                    objM7377constructorimpl2 = null;
                }
                str2 = (java.lang.String) objM7377constructorimpl2;
            }
            try {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl3 = Result.m7377constructorimpl(SPUtils.getString("sp_lang_setting", null, C33139mqn.OLrzqt.KWHzl()));
            } catch (java.lang.Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                objM7377constructorimpl3 = null;
            }
            java.lang.String str3 = (java.lang.String) objM7377constructorimpl3;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                str3 = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt(str2, str3));
        } catch (java.lang.Throwable th3) {
            Result.Application application5 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                str = null;
            }
            objM7377constructorimpl = C56390yDp.OLrzqt(str, null);
        }
        return (kotlin.Pair) objM7377constructorimpl;
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AEQbTJ == null) {
            android.content.ComponentCallbacks2 componentCallbacks2OLrzqt = C33569myt.OLrzqt(context);
            if (componentCallbacks2OLrzqt == null) {
                componentCallbacks2OLrzqt = C54819xWm.KWHzl().AEQbTJ();
            }
            if (componentCallbacks2OLrzqt instanceof AppCompatActivity) {
                AEQbTJ = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2OLrzqt), Dispatchers.getIO(), null, new KycCommonUtil$showDynamicFeatureToast$1(null), 2, null);
            }
        }
    }

    public final void OLrzqt() {
        Job job = AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        AEQbTJ = null;
    }

    public static /* synthetic */ void deepLinkJump$default(C42463rTu c42463rTu, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        c42463rTu.EZpvd(context, str, str2);
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.endsWith$default(str, "main/home", false, 2, null)) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "hyperlink")) {
                C43693ruB.OLrzqt("KYC_Processing_Back_Home");
                C43693ruB.OLrzqt("KYC_Processing_BackHome_View");
            }
            rSF.Application.gotoMain$default((rSF) C43251rlk.copydefault(rSF.class), context, null, 2, null);
            return;
        }
        kotlin.Pair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> pairKWHzl = C33568mys.AEQbTJ.KWHzl(C59449zhJ.replace$default(str, C34704nhP.copydefault.AEQbTJ() + "://", "", false, 4, (java.lang.Object) null));
        java.lang.String first = pairKWHzl.getFirst();
        java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = pairKWHzl.getSecond().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(setEntrySet, 10)), 16));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(context, first, linkedHashMap, new Function1() { // from class: o.rTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42463rTu.AEQbTJ((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
