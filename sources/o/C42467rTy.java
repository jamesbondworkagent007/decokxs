package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadAliFaceDynamic$2;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadAmaniDynamic$2;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadEFRDynamic$2;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadEopCardDynamic$3;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadEopCardJniLibs$1$failure$1;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadEopLivenessDynamic$3;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadJumioDynamic$2;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadLcaDynamic$3;
import com.okinc.ok_kyc_core.util.KycDynamicUtil$loadPDFDecoderDynamic$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C42467rTy;
import o.C43662rtX;
import o.YG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42467rTy {
    public static boolean AEQbTJ;
    public static boolean AYXKKw;
    public static boolean AhwBna;
    public static boolean AkhnZx;
    public static boolean AuCTel;
    public static boolean AubY;
    public static boolean DbNXlk;
    public static boolean EZpvd;
    public static boolean copydefault;
    public static boolean djBIcL;
    public static boolean ejfBZ;
    public static boolean fIwbmz;
    public static boolean fJNWhG;
    public static boolean fetchVPNInfo;
    public static boolean gEmmrt;
    public static boolean getFieldNames;
    public static boolean hDKMBd;
    public static boolean isConnected;
    public static boolean iwGUEr;
    public static boolean sSMYrx;
    public static boolean values;
    public static boolean wlaJM;
    public static boolean zLjUOn;
    public static boolean zsXlph;
    public static final C42467rTy KWHzl = new C42467rTy();
    public static final InterfaceC56387yDm uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.rTE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C42467rTy.copydefault();
        }
    });
    public static final Mutex AuCTelauCTel = MutexKt.Mutex$default(false, 1, null);
    public static final java.util.ArrayList<java.lang.String> getNewProxyInstance = yDY.copydefault("cpuinfo", "aleInterface", "yuv_android", "tensorflowlite_jni");
    public static final java.util.ArrayList<java.lang.String> fARcdN = yDY.copydefault("card_edge_detector", "mlkitcommonpipeline", "tensorflowlite_jni", "image_processing_util_jni", "yuvhelper");
    public static final java.util.ArrayList<java.lang.String> valueOf = yDY.copydefault("MNN", "algorithm_core", "toyger", "identityutils", "facedevice");
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AkhnZx(boolean z) {
        isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AuCTel(boolean z) {
        wlaJM = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mutex AubY() {
        return AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk(boolean z) {
        DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        EZpvd = z;
    }

    public final boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void ejfBZ(boolean z) {
        fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fARcdN(boolean z) {
        hDKMBd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fIwbmz(boolean z) {
        getFieldNames = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fJNWhG(boolean z) {
        iwGUEr = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(boolean z) {
        ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void getFieldNames(boolean z) {
        sSMYrx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void getNewProxyInstance(boolean z) {
        zsXlph = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void isConnected(boolean z) {
        fIwbmz = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void iwGUEr(boolean z) {
        AubY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void uzCIH(boolean z) {
        zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean uzCIH() {
        return hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values(boolean z) {
        AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph() {
        return zsXlph;
    }

    private C42467rTy() {
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$4(ClassGen.java:366)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:367)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:329)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
     */
    public static final /* synthetic */ void copydefault(C42467rTy c42467rTy) throws java.lang.Exception {
        c42467rTy.UeEOUB();
    }

    public static final C43739ruv copydefault() {
        return new C43739ruv();
    }

    public final C43739ruv getNewProxyInstance() {
        return (C43739ruv) uzCIH.getValue();
    }

    public final java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("kyc_in_house", "loadEFRDynamic check");
        if (values) {
            return C56443yFo.KWHzl(true);
        }
        boolean zAwvSrB = AwvSrB();
        pUU.KWHzl("kyc_in_house", "EFR isDynamic: " + zAwvSrB);
        if (!zAwvSrB) {
            pUU.KWHzl("kyc_in_house", "EFR in base APK, skipping FeatureManager");
            values = true;
            return C56443yFo.KWHzl(true);
        }
        if (!gHZMYf()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadEFRDynamic$2(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public final java.lang.Object djBIcL(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("qjf", "loadPDFDecoderDynamic isGoogleApiAvailable = " + OcIXYQ() + ",pdfDecoderContinuationSuccessResumed = " + sSMYrx);
        if (sSMYrx) {
            return C56443yFo.KWHzl(true);
        }
        if (RcXXUw() && !RJOkX()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadPDFDecoderDynamic$2(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public final java.lang.Object valueOf(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (hDKMBd) {
            return C56443yFo.KWHzl(true);
        }
        if (QbewEr() && !QUSxYX()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        pUU.KWHzl("qjf", "loadJumioDynamic-isGoogleApiAvailable = " + OcIXYQ());
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadJumioDynamic$2(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("kyc_in_house", "loadAmaniDynamic check");
        if (djBIcL) {
            return C56443yFo.KWHzl(true);
        }
        boolean zSSMYrx = sSMYrx();
        pUU.KWHzl("kyc_in_house", "Amani isDynamic: " + zSSMYrx);
        if (!zSSMYrx) {
            pUU.KWHzl("kyc_in_house", "Amani in base APK, skipping FeatureManager");
            djBIcL = true;
            return C56443yFo.KWHzl(true);
        }
        if (!AxsJAY()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadAmaniDynamic$2(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("qjf", "startAliFace isGoogleApiAvailable = " + OcIXYQ() + ",alifaceContinuationSuccessResumed = " + AEQbTJ);
        if (AEQbTJ) {
            return C56443yFo.KWHzl(true);
        }
        if (zuBGHE() && !wlaJM()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadAliFaceDynamic$2(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        try {
            java.lang.Class.forName("androidx.camera.core.ImageProcessingUtil");
        } catch (java.lang.Throwable th) {
            pUU.KWHzl("ImageProcessingUtil", "error=" + th + "-" + th.getCause());
        }
        pUU.KWHzl("qjf", "loadEopCardDynamic-isGoogleApiAvailable = " + OcIXYQ() + ",eopCardContinuationSuccessResumed = " + DbNXlk);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_DEVICE_SPACE_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42467rTy.OLrzqt((EventParamsList) obj);
            }
        });
        if (DbNXlk) {
            return C56443yFo.KWHzl(true);
        }
        if (QKVWgx() && !ORxRYg()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadEopCardDynamic$3(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("module_name", "ok_compliance_dynamic_eop_card_impl", false);
        eventParamsList.put("type", "eopCard", false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("kyc_in_house", "loadEopLivenessDynamic check");
        if (ejfBZ) {
            return C56443yFo.KWHzl(true);
        }
        boolean zDTwDnp = DTwDnp();
        pUU.KWHzl("kyc_in_house", "EOP Liveness isDynamic: " + zDTwDnp);
        if (!zDTwDnp) {
            pUU.KWHzl("kyc_in_house", "EOP Liveness in base APK, skipping FeatureManager");
            ejfBZ = true;
            return C56443yFo.KWHzl(true);
        }
        try {
            java.lang.Class.forName("androidx.camera.core.ImageProcessingUtil");
        } catch (java.lang.Throwable th) {
            pUU.KWHzl("ImageProcessingUtil", "error=" + th + "-" + th.getCause());
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_DEVICE_SPACE_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42467rTy.KWHzl((EventParamsList) obj);
            }
        });
        if (!QOLQEE()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadEopLivenessDynamic$3(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("module_name", "ok_compliance_dynamic_eop_liveness_impl", false);
        eventParamsList.put("type", "eopLiveness", false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public final java.lang.Object AYXKKw(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("kyc_in_house", "loadLcaDynamic check");
        if (zLjUOn) {
            return C56443yFo.KWHzl(true);
        }
        boolean zQVAiDq = QVAiDq();
        pUU.KWHzl("kyc_in_house", "LCA isDynamic: " + zQVAiDq);
        if (!zQVAiDq) {
            pUU.KWHzl("kyc_in_house", "LCA in base APK, skipping FeatureManager");
            zLjUOn = true;
            return C56443yFo.KWHzl(true);
        }
        try {
            java.lang.Class.forName("androidx.camera.core.ImageProcessingUtil");
        } catch (java.lang.Throwable th) {
            pUU.KWHzl("ImageProcessingUtil", "error=" + th + "-" + th.getCause());
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_DEVICE_SPACE_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42467rTy.gEmmrt((EventParamsList) obj);
            }
        });
        if (!QfsBiF()) {
            C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new KycDynamicUtil$loadLcaDynamic$3(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("module_name", "ok_compliance_dynamic_lca_impl", false);
        eventParamsList.put("type", "lca", false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public final void dNCPSb() {
        pUU.KWHzl("qjf", "jumio isDynamicModule = " + C34733nhs.Companion.EZpvd("ok_compliance_dynamic_jumio_impl"));
        if (QbewEr()) {
            java.util.Iterator<java.lang.String> it = getNewProxyInstance.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.lang.String str = next;
                try {
                    pUU.KWHzl("qjf", "jumio lib" + str + ".so load start");
                    C32979mnm c32979mnm = C32979mnm.EZpvd;
                    SplitInstallHelper.loadLibrary(c32979mnm.OLrzqt(), str);
                    YG.AEQbTJ(c32979mnm.OLrzqt(), str);
                    pUU.KWHzl("qjf", "jumio lib" + str + ".so load finish");
                } catch (java.lang.UnsatisfiedLinkError e) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KYC_FD_LOAD_JNI_ERROR_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42467rTy.AEQbTJ(e, (EventParamsList) obj);
                        }
                    });
                    YG.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), str);
                    pUU.copydefault("qjf", "jumio lib" + str + ".so load UnsatisfiedLinkError-->" + e.getMessage());
                } catch (java.lang.Throwable th) {
                    TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KYC_FD_LOAD_JNI_ERROR_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42467rTy.copydefault(th, (EventParamsList) obj);
                        }
                    });
                    YG.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), str);
                    pUU.copydefault("qjf", "jumio lib" + str + ".so load throwable-->" + th.getMessage());
                }
            }
            pUU.KWHzl("qjf", "jumio have load all so----->");
        }
    }

    public static final Unit AEQbTJ(java.lang.UnsatisfiedLinkError unsatisfiedLinkError, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "jumio", false);
        eventParamsList.put("msg", java.lang.String.valueOf(unsatisfiedLinkError.getMessage()), false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "jumio", false);
        eventParamsList.put("msg", java.lang.String.valueOf(th.getMessage()), false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        return Unit.INSTANCE;
    }

    public final void djSkpj() {
        if (QKVWgx()) {
            java.util.Iterator<java.lang.String> it = fARcdN.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.lang.String str = next;
                try {
                    pUU.KWHzl("qjf", "eop lib" + str + ".so load start");
                    YG.AEQbTJ().copydefault(C32979mnm.EZpvd.OLrzqt(), str, new Application(str));
                } catch (java.lang.Exception e) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KYC_FD_LOAD_JNI_ERROR_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42467rTy.AEQbTJ(e, (EventParamsList) obj);
                        }
                    });
                    C55326xho.toast$default(C43662rtX.Dialog.QOLQEE, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    pUU.copydefault("qjf", "eop lib" + str + ".so load exception-->" + e.getMessage());
                }
            }
            pUU.KWHzl("qjf", "eop have load all so----->");
        }
    }

    /* JADX INFO: renamed from: o.rTy$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application implements YG.Application {
        public final /* synthetic */ java.lang.String copydefault;

        public Application(java.lang.String str) {
            this.copydefault = str;
        }

        @Override // o.YG.Application
        public void success() {
            pUU.KWHzl("qjf", "eop lib" + this.copydefault + ".so load finish");
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_FD_LOAD_JNI_ERROR_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42467rTy.Application.AEQbTJ((EventParamsList) obj);
                }
            });
        }

        public static final Unit AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("status", "success", false);
            eventParamsList.put("type", "eop", false);
            eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
            eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
            return Unit.INSTANCE;
        }

        @Override // o.YG.Application
        public void failure(final java.lang.Throwable th) {
            android.content.ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (componentCallbacks2AEQbTJ != null && (componentCallbacks2AEQbTJ instanceof AppCompatActivity)) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2AEQbTJ), Dispatchers.getIO(), null, new KycDynamicUtil$loadEopCardJniLibs$1$failure$1(null), 2, null);
            }
            pUU.copydefault("qjf", "eop lib" + this.copydefault + ".so load exception-->" + (th != null ? th.getMessage() : null));
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_FD_LOAD_JNI_ERROR_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42467rTy.Application.AEQbTJ(th, (EventParamsList) obj);
                }
            });
        }

        public static final Unit AEQbTJ(java.lang.Throwable th, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("status", EopTrackEvent.KEY_RESULT_FAILED, false);
            eventParamsList.put("type", "eop", false);
            eventParamsList.put("msg", java.lang.String.valueOf(th != null ? th.getMessage() : null), false);
            eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
            eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
            return Unit.INSTANCE;
        }
    }

    public static final Unit AEQbTJ(java.lang.Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", EopTrackEvent.KEY_RESULT_FAILED, false);
        eventParamsList.put("type", "eop", false);
        eventParamsList.put("msg", java.lang.String.valueOf(exc.getMessage()), false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public final void aKErDB() {
        pUU.KWHzl("qjf", "aliface isDynamicModule = " + zuBGHE());
        if (zuBGHE()) {
            java.util.Iterator<java.lang.String> it = valueOf.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.lang.String str = next;
                try {
                    pUU.KWHzl("qjf", "aliface lib" + str + ".so load start");
                    C32979mnm c32979mnm = C32979mnm.EZpvd;
                    SplitInstallHelper.loadLibrary(c32979mnm.OLrzqt(), str);
                    YG.AEQbTJ(c32979mnm.OLrzqt(), str);
                    pUU.KWHzl("qjf", "aliface lib" + str + ".so load finish");
                } catch (java.lang.UnsatisfiedLinkError e) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KYC_FD_LOAD_JNI_ERROR_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42467rTy.OLrzqt(e, (EventParamsList) obj);
                        }
                    });
                    YG.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), str);
                    pUU.copydefault("qjf", "aliface lib" + str + ".so load UnsatisfiedLinkError-->" + e.getMessage());
                } catch (java.lang.Throwable th) {
                    TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KYC_FD_LOAD_JNI_ERROR_EVENT", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rTA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42467rTy.EZpvd(th, (EventParamsList) obj);
                        }
                    });
                    YG.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), str);
                    pUU.copydefault("qjf", "aliface lib" + str + ".so load exception-->" + th.getMessage());
                }
            }
            pUU.KWHzl("qjf", "aliface have load all so----->");
        }
    }

    public static final Unit OLrzqt(java.lang.UnsatisfiedLinkError unsatisfiedLinkError, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "aliface", false);
        eventParamsList.put("msg", java.lang.String.valueOf(unsatisfiedLinkError.getMessage()), false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Throwable th, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "aliface", false);
        eventParamsList.put("msg", java.lang.String.valueOf(th.getMessage()), false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, C33129mqd.gEmmrt(C33482mxL.KWHzl), true);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public final boolean QbewEr() {
        return C34733nhs.Companion.EZpvd("ok_compliance_dynamic_jumio_impl");
    }

    public final boolean sSMYrx() {
        return C34733nhs.Companion.EZpvd("ok_compliance_dynamic_amani_impl");
    }

    public final boolean QUSxYX() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "ok_compliance_dynamic_jumio_impl");
    }

    public final boolean AxsJAY() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "ok_compliance_dynamic_amani_impl");
    }

    public final boolean QKVWgx() {
        return C34733nhs.Companion.EZpvd("ok_compliance_dynamic_eop_card_impl");
    }

    public final boolean DTwDnp() {
        return C34733nhs.Companion.EZpvd("ok_compliance_dynamic_eop_liveness_impl");
    }

    public final boolean zuBGHE() {
        return C34733nhs.Companion.EZpvd("kyc_dynamic_impl");
    }

    public final boolean AwvSrB() {
        return C34733nhs.Companion.EZpvd("ok_compliance_dynamic_efr_impl");
    }

    public final boolean gHZMYf() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "ok_compliance_dynamic_efr_impl");
    }

    public final boolean QVAiDq() {
        return C34733nhs.Companion.EZpvd("ok_compliance_dynamic_lca_impl");
    }

    public final boolean QfsBiF() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "ok_compliance_dynamic_lca_impl");
    }

    public final boolean RcXXUw() {
        return C34733nhs.Companion.EZpvd("ok_compliance_dynamic_pdfdecoder_impl");
    }

    public final boolean RJOkX() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "ok_compliance_dynamic_pdfdecoder_impl");
    }

    public final boolean wlaJM() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "kyc_dynamic_impl");
    }

    public final boolean ORxRYg() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "ok_compliance_dynamic_eop_card_impl");
    }

    public final boolean QOLQEE() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "ok_compliance_dynamic_eop_liveness_impl");
    }

    public final boolean OcIXYQ() {
        try {
            boolean z = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(C32979mnm.EZpvd.OLrzqt()) == 0;
            getNewProxyInstance().copydefault("google_service_available", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(z)));
            return z;
        } catch (java.lang.Exception e) {
            pUU.copydefault("qjf", "isGoogleApiAvailable-exception = " + e.getMessage());
            return false;
        }
    }

    public final void UeEOUB() throws java.lang.Exception {
        if (KWHzl()) {
            throw new java.lang.Exception("test exception");
        }
    }
}
