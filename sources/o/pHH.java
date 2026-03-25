package o;

import com.google.gson.JsonObject;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public interface pHH {
    void AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull OKComplianceRestrictionService.UserEvent userEvent, Function1<? super java.lang.Boolean, Unit> function1);

    boolean AEQbTJ(@NotNull OKComplianceRestrictionService.CefiMode cefiMode);

    boolean AEQbTJ(@NotNull OKComplianceRestrictionService.Feature feature);

    java.util.List<java.lang.String> AuCTel();

    java.lang.String AuCTelauCTel();

    JsonObject AwvSrB();

    SharedFlow<Unit> AxsJAY();

    FeatureRestrictionInfo EZpvd(@NotNull OKComplianceRestrictionService.Feature feature);

    void EZpvd(@NotNull CoroutineScope coroutineScope, Function1<? super java.lang.Boolean, Unit> function1);

    JSONObject KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList);

    void KWHzl(@NotNull CoroutineScope coroutineScope, java.lang.Boolean bool, Function1<? super java.lang.Boolean, Unit> function1);

    boolean OLrzqt(@NotNull OKComplianceRestrictionService.AppMode appMode);

    boolean OLrzqt(@NotNull OKComplianceRestrictionService.Feature feature);

    void RcXXUw();

    java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation);

    boolean dNCPSb();

    boolean djSkpj();

    java.util.List<java.lang.String> ejfBZ();

    java.util.List<java.lang.String> fIwbmz();

    SharedFlow<FeatureRestrictionDiffSet> gHZMYf();

    void getFieldNames();

    java.util.List<java.lang.String> getNewProxyInstance();

    java.lang.String hDKMBd();

    java.lang.String zsXlph();

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHH */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void forceRefreshFeatureRestrictionWhithKyc$default(pHH phh, CoroutineScope coroutineScope, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceRefreshFeatureRestrictionWhithKyc");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            phh.EZpvd(coroutineScope, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHH */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void forceRefreshFeatureRestrictionWhithAccount$default(pHH phh, CoroutineScope coroutineScope, OKComplianceRestrictionService.UserEvent userEvent, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceRefreshFeatureRestrictionWhithAccount");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            phh.AEQbTJ(coroutineScope, userEvent, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHH */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void fetchLatestFeatureRestrictionStatus$default(pHH phh, CoroutineScope coroutineScope, java.lang.Boolean bool, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLatestFeatureRestrictionStatus");
            }
            if ((i & 2) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            phh.KWHzl(coroutineScope, bool, function1);
        }
    }
}
