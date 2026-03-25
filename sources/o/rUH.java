package o;

import com.google.gson.JsonObject;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.rUH;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class rUH extends AbstractC43215rlA implements OKComplianceRestrictionService {
    public static rUH KWHzl;
    public final pHH EZpvd;
    public final SharedFlow<Unit> OLrzqt;
    public final SharedFlow<FeatureRestrictionDiffSet> copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public SharedFlow<Unit> AxsJAY() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.pHH
    public SharedFlow<FeatureRestrictionDiffSet> gHZMYf() {
        return this.copydefault;
    }

    public rUH(@NotNull pHH phh) {
        Intrinsics.checkNotNullParameter(phh, "");
        this.EZpvd = phh;
        this.OLrzqt = phh.AxsJAY();
        this.copydefault = phh.gHZMYf();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rUH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final rUH copydefault() {
            pHH rus;
            if (rUH.KWHzl == null) {
                java.lang.Integer numAEQbTJ = rUV.EZpvd.AEQbTJ();
                if (numAEQbTJ != null && numAEQbTJ.intValue() == 2) {
                    rus = new FeatureRestrictionCoreRepository(C43246rlf.OLrzqt.valueOf(), Dispatchers.getIO().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)), new AJR());
                } else {
                    rus = new rUS(C43246rlf.OLrzqt.valueOf(), Dispatchers.getIO().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)), rUP.Companion.AEQbTJ(), C56392yDr.copydefault(new Function0() { // from class: o.rUK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return rUH.Application.OLrzqt();
                        }
                    }), new pTO());
                }
                rUH.KWHzl = new rUH(rus);
            }
            rUH ruh = rUH.KWHzl;
            Intrinsics.copydefault(ruh);
            return ruh;
        }

        public static final InterfaceC47278tmy OLrzqt() {
            return C42503rVg.KWHzl.copydefault();
        }
    }

    @Override // o.pHH
    public void RcXXUw() {
        this.EZpvd.RcXXUw();
    }

    @Override // o.pHH
    public java.lang.String hDKMBd() {
        return this.EZpvd.hDKMBd();
    }

    @Override // o.pHH
    public JSONObject KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return this.EZpvd.KWHzl(arrayList);
    }

    @Override // o.pHH
    public FeatureRestrictionInfo EZpvd(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        return this.EZpvd.EZpvd(feature);
    }

    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        return this.EZpvd.AEQbTJ(feature);
    }

    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "");
        return this.EZpvd.OLrzqt(feature);
    }

    @Override // o.pHH
    public java.lang.String AuCTelauCTel() {
        return this.EZpvd.AuCTelauCTel();
    }

    @Override // o.pHH
    public java.lang.String zsXlph() {
        return this.EZpvd.zsXlph();
    }

    @Override // o.pHH
    public boolean djSkpj() {
        return this.EZpvd.djSkpj();
    }

    @Override // o.pHH
    public boolean AEQbTJ(@NotNull OKComplianceRestrictionService.CefiMode cefiMode) {
        Intrinsics.checkNotNullParameter(cefiMode, "");
        return this.EZpvd.AEQbTJ(cefiMode);
    }

    @Override // o.pHH
    public boolean OLrzqt(@NotNull OKComplianceRestrictionService.AppMode appMode) {
        Intrinsics.checkNotNullParameter(appMode, "");
        return this.EZpvd.OLrzqt(appMode);
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> AuCTel() {
        return this.EZpvd.AuCTel();
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> fIwbmz() {
        return this.EZpvd.fIwbmz();
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> ejfBZ() {
        return this.EZpvd.ejfBZ();
    }

    @Override // o.pHH
    public java.util.List<java.lang.String> getNewProxyInstance() {
        return this.EZpvd.getNewProxyInstance();
    }

    @Override // o.pHH
    public boolean dNCPSb() {
        return this.EZpvd.dNCPSb();
    }

    @Override // o.pHH
    public void getFieldNames() {
        this.EZpvd.getFieldNames();
    }

    @Override // o.pHH
    public JsonObject AwvSrB() {
        return this.EZpvd.AwvSrB();
    }

    @Override // o.pHH
    public void EZpvd(@NotNull CoroutineScope coroutineScope, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.EZpvd.EZpvd(coroutineScope, function1);
    }

    @Override // o.pHH
    public void AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull OKComplianceRestrictionService.UserEvent userEvent, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(userEvent, "");
        this.EZpvd.AEQbTJ(coroutineScope, userEvent, function1);
    }

    @Override // o.pHH
    public void KWHzl(@NotNull CoroutineScope coroutineScope, java.lang.Boolean bool, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.EZpvd.KWHzl(coroutineScope, bool, function1);
    }

    @Override // o.pHH
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.EZpvd.copydefault(continuation);
    }
}
