package o;

import android.app.ActivityManager;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.eop.activity.EopLivenessActivity$efrLauncher$1$1$1;
import com.okinc.liveness.eop.activity.EopLivenessActivity$efrLauncher$1$1$2;
import com.okinc.liveness.eop.activity.EopLivenessActivity$efrLauncher$1$2$1;
import com.okinc.liveness.eop.activity.EopLivenessActivity$setListener$4$1;
import com.okinc.liveness.eop.activity.EopLivenessActivity$startLcaLiveness$1;
import com.okinc.liveness.eop.bean.LivenessRouter;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.EopSessionError;
import com.okinc.ok_kyc_core.data.efr.EFRData;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core.service.VerifyFlowType;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;
import pub.devrel.easypermissions.AppSettingsDialog;

/* JADX INFO: renamed from: o.pQc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ActivityC38205pQc extends AbstractActivityC33044moy<AbstractC43761rvQ> {
    public boolean AYXKKw;
    public pRY EZpvd;
    public EopLivenessBasicViewModel KWHzl;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public pRZ djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final int AhwBna = C43662rtX.TaskDescription.AhwBna;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.pQd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC38205pQc.ejfBZ();
        }
    });

    /* JADX INFO: renamed from: o.pQc$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EopLivenessBasicViewModel.EopPageNode.values().length];
            try {
                iArr[EopLivenessBasicViewModel.EopPageNode.FaceGuide.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EopLivenessBasicViewModel.EopPageNode.FaceScan.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EopLivenessBasicViewModel.EopPageNode.FaceResult.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityResultLauncher<android.content.Intent> OLrzqt() {
        return this.OLrzqt;
    }

    public ActivityC38205pQc() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.pQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC38205pQc.AEQbTJ(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        this.AYXKKw = true;
    }

    /* JADX INFO: renamed from: o.pQc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pQc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull VendorConfig vendorConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(vendorConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(activityResultLauncher, "");
            try {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38205pQc.class);
                intent.putExtra("EXTRA_CONFIG", vendorConfig);
                intent.putExtra("EXTRA_SESSION_ID", str);
                intent.putExtra("EXTRA_KYC_COR", str2);
                intent.addFlags(65536);
                activityResultLauncher.launch(intent);
            } catch (java.lang.Exception e) {
                pUU.KWHzl("kyc_in_house", "startEopActivity e=" + e);
            }
        }

        public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, FacialExtParams facialExtParams) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(activityResultLauncher, "");
            try {
                android.content.Intent intent = new android.content.Intent(fragmentActivity, (java.lang.Class<?>) ActivityC38205pQc.class);
                intent.putExtra("EXTRA_FACIAL_VERIFICATION", true);
                intent.putExtra("EXTRA_SESSION_ID", str);
                intent.putExtra("EXTRA_EXT_PARAMS", facialExtParams);
                intent.addFlags(65536);
                activityResultLauncher.launch(intent);
            } catch (java.lang.Exception e) {
                pUU.copydefault("kyc_in_house", "startOKFace e=" + e.getMessage());
            }
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, FacialExtParams facialExtParams) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38205pQc.class);
            intent.putExtra("EXTRA_FACIAL_VERIFICATION", true);
            intent.putExtra("EXTRA_SESSION_ID", str);
            intent.putExtra("EXTRA_EXT_PARAMS", facialExtParams);
            intent.addFlags(65536);
            context.startActivity(intent);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38205pQc.class);
            intent.putExtra("EXTRA_FACIAL_VERIFICATION", true);
            intent.putExtra("EXTRA_SESSION_ID", str);
            intent.putExtra("EXTRA_FEATURE_LIST", new int[]{VerifyFlowType.LIVE_FACE.getVerifyType()});
            intent.addFlags(65536);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43739ruv ejfBZ() {
        return new C43739ruv();
    }

    private final C43739ruv fJNWhG() {
        return (C43739ruv) this.valueOf.getValue();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        C34717nhc.Companion.copydefault(this);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel.initTaskLink$default(com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel, com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel$EopPageNode, int, java.lang.Object):void */
    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String sourceCode;
        VendorConfig vendorConfigQKVWgx;
        java.lang.String sourceCode2;
        VendorConfig vendorConfigQKVWgx2;
        FacialExtParams facialExtParamsFJNWhG;
        java.lang.String sourceType;
        java.lang.String sourceType2;
        FacialExtParams facialExtParamsFJNWhG2;
        java.lang.String strOcIXYQ;
        super.onCreate(bundle);
        this.KWHzl = (EopLivenessBasicViewModel) new ViewModelProvider(this).get(EopLivenessBasicViewModel.class);
        this.djBIcL = (pRZ) new ViewModelProvider(this).get(pRZ.class);
        pRY pry = (pRY) new ViewModelProvider(this).get(pRY.class);
        this.EZpvd = pry;
        if (pry != null) {
            pry.copydefault((FacialExtParams) getIntent().getParcelableExtra("EXTRA_EXT_PARAMS"));
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        if (eopLivenessBasicViewModel != null) {
            eopLivenessBasicViewModel.OLrzqt((VendorConfig) getIntent().getParcelableExtra("EXTRA_CONFIG"));
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
        str = "";
        if (eopLivenessBasicViewModel2 != null) {
            java.lang.String stringExtra = getIntent().getStringExtra("EXTRA_SESSION_ID");
            if (stringExtra == null) {
                stringExtra = "";
            }
            eopLivenessBasicViewModel2.gEmmrt(stringExtra);
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.KWHzl;
        if (eopLivenessBasicViewModel3 != null) {
            eopLivenessBasicViewModel3.KWHzl(getIntent().getBooleanExtra("EXTRA_FACIAL_VERIFICATION", false));
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = this.KWHzl;
        if (eopLivenessBasicViewModel4 != null) {
            eopLivenessBasicViewModel4.OLrzqt((FacialExtParams) getIntent().getParcelableExtra("EXTRA_EXT_PARAMS"));
        }
        if (bundle != null) {
            java.lang.String string = bundle.getString("EXTRA_LIVENESS_ID");
            if (string == null) {
                string = "";
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                EopLivenessBasicViewModel eopLivenessBasicViewModel5 = this.KWHzl;
                if (eopLivenessBasicViewModel5 != null) {
                    eopLivenessBasicViewModel5.AhwBna(string);
                }
                java.lang.String string2 = bundle.getString("EXTRA_FACE_CHECK_TYPE");
                if (string2 == null) {
                    string2 = "";
                }
                EopLivenessBasicViewModel eopLivenessBasicViewModel6 = this.KWHzl;
                if (eopLivenessBasicViewModel6 != null) {
                    eopLivenessBasicViewModel6.fetchVPNInfo(string2);
                }
                pRZ prz = this.djBIcL;
                if (prz != null) {
                    prz.OLrzqt((EopImageInfo) bundle.getParcelable("EXTRA_FRONT_IMG_INFO"));
                }
                pRZ prz2 = this.djBIcL;
                if (prz2 != null) {
                    prz2.KWHzl((EopImageInfo) bundle.getParcelable("EXTRA_BACK_IMG_INFO"));
                }
                pRZ prz3 = this.djBIcL;
                if (prz3 != null) {
                    prz3.AEQbTJ((EopImageInfo) bundle.getParcelable("EXTRA_FACE_IMG_INFO"));
                }
            }
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel7 = this.KWHzl;
        if (eopLivenessBasicViewModel7 != null) {
            EopLivenessBasicViewModel.initTaskLink$default(eopLivenessBasicViewModel7, null, 1, null);
        }
        pRY pry2 = this.EZpvd;
        if (pry2 != null) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel8 = this.KWHzl;
            if (eopLivenessBasicViewModel8 == null || (strOcIXYQ = eopLivenessBasicViewModel8.OcIXYQ()) == null) {
                strOcIXYQ = "";
            }
            pry2.copydefault(strOcIXYQ);
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel9 = this.KWHzl;
        if (eopLivenessBasicViewModel9 != null && eopLivenessBasicViewModel9.RJOkX()) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel10 = this.KWHzl;
            if (eopLivenessBasicViewModel10 != null) {
                if (eopLivenessBasicViewModel10 == null || (facialExtParamsFJNWhG2 = eopLivenessBasicViewModel10.fJNWhG()) == null || (sourceType2 = facialExtParamsFJNWhG2.getSourceType()) == null) {
                    sourceType2 = "";
                }
                eopLivenessBasicViewModel10.DbNXlk(sourceType2);
            }
            pRY pry3 = this.EZpvd;
            if (pry3 != null) {
                EopLivenessBasicViewModel eopLivenessBasicViewModel11 = this.KWHzl;
                if (eopLivenessBasicViewModel11 != null && (facialExtParamsFJNWhG = eopLivenessBasicViewModel11.fJNWhG()) != null && (sourceType = facialExtParamsFJNWhG.getSourceType()) != null) {
                    str = sourceType;
                }
                pry3.copydefault(str);
            }
            java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
            EopLivenessBasicViewModel eopLivenessBasicViewModel12 = this.KWHzl;
            if (eopLivenessBasicViewModel12 != null) {
                eopLivenessBasicViewModel12.EZpvd(strZsXlph);
            }
            pRY pry4 = this.EZpvd;
            if (pry4 != null) {
                pry4.KWHzl(strZsXlph);
            }
        } else {
            EopLivenessBasicViewModel eopLivenessBasicViewModel13 = this.KWHzl;
            if (eopLivenessBasicViewModel13 != null) {
                if (eopLivenessBasicViewModel13 == null || (vendorConfigQKVWgx2 = eopLivenessBasicViewModel13.QKVWgx()) == null || (sourceCode2 = vendorConfigQKVWgx2.getSourceCode()) == null) {
                    sourceCode2 = "";
                }
                eopLivenessBasicViewModel13.DbNXlk(sourceCode2);
            }
            pRY pry5 = this.EZpvd;
            if (pry5 != null) {
                EopLivenessBasicViewModel eopLivenessBasicViewModel14 = this.KWHzl;
                if (eopLivenessBasicViewModel14 == null || (vendorConfigQKVWgx = eopLivenessBasicViewModel14.QKVWgx()) == null || (sourceCode = vendorConfigQKVWgx.getSourceCode()) == null) {
                    sourceCode = "";
                }
                pry5.copydefault(sourceCode);
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("EXTRA_KYC_COR");
            str = stringExtra2 != null ? stringExtra2 : "";
            EopLivenessBasicViewModel eopLivenessBasicViewModel15 = this.KWHzl;
            if (eopLivenessBasicViewModel15 != null) {
                eopLivenessBasicViewModel15.EZpvd(str);
            }
            pRY pry6 = this.EZpvd;
            if (pry6 != null) {
                pry6.KWHzl(str);
            }
        }
        routePage$default(this, false, false, 3, null);
        iwGUEr();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        EopLivenessBasicViewModel eopLivenessBasicViewModel;
        pRV<java.lang.String> prvFARcdN;
        java.lang.String value;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
        EopLivenessBasicViewModel.EopPageNode eopPageNodeAkhnZx = eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.AkhnZx() : null;
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.KWHzl;
        pUU.KWHzl("kyc_in_house", "eop onSaveInstanceState,currentPageNode = " + eopPageNodeAkhnZx + ",isVendorCheckType = " + (eopLivenessBasicViewModel3 != null ? java.lang.Boolean.valueOf(eopLivenessBasicViewModel3.QVAiDq()) : null));
        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = this.KWHzl;
        EopLivenessBasicViewModel.EopPageNode eopPageNodeAkhnZx2 = eopLivenessBasicViewModel4 != null ? eopLivenessBasicViewModel4.AkhnZx() : null;
        int i = eopPageNodeAkhnZx2 == null ? -1 : StateListAnimator.copydefault[eopPageNodeAkhnZx2.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel5 = this.KWHzl;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (eopLivenessBasicViewModel5 != null ? eopLivenessBasicViewModel5.uzCIH() : null)) && (eopLivenessBasicViewModel = this.KWHzl) != null && eopLivenessBasicViewModel.QVAiDq()) {
                pRZ prz = this.djBIcL;
                bundle.putParcelable("EXTRA_FRONT_IMG_INFO", prz != null ? prz.AEQbTJ() : null);
                pRZ prz2 = this.djBIcL;
                bundle.putParcelable("EXTRA_BACK_IMG_INFO", prz2 != null ? prz2.OLrzqt() : null);
                pRZ prz3 = this.djBIcL;
                bundle.putParcelable("EXTRA_FACE_IMG_INFO", prz3 != null ? prz3.EZpvd() : null);
                EopLivenessBasicViewModel eopLivenessBasicViewModel6 = this.KWHzl;
                bundle.putString("EXTRA_LIVENESS_ID", eopLivenessBasicViewModel6 != null ? eopLivenessBasicViewModel6.uzCIH() : null);
                EopLivenessBasicViewModel eopLivenessBasicViewModel7 = this.KWHzl;
                if (eopLivenessBasicViewModel7 != null && (prvFARcdN = eopLivenessBasicViewModel7.fARcdN()) != null && (value = prvFARcdN.getValue()) != null) {
                    str = value;
                }
                bundle.putString("EXTRA_FACE_CHECK_TYPE", str);
            }
        }
    }

    public static final void AEQbTJ(final ActivityC38205pQc activityC38205pQc, ActivityResult activityResult) {
        android.os.Bundle extras;
        android.os.Bundle extras2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
            if (eopLivenessBasicViewModel != null) {
                eopLivenessBasicViewModel.AhwBna();
            }
            android.content.Intent data = activityResult.getData();
            if (data == null || (extras2 = data.getExtras()) == null) {
                return;
            }
            boolean z = extras2.getBoolean("EXTRA_RESULT_SUCCESS");
            java.lang.String string = extras2.getString("EXTRA_EFR_IMAGE");
            java.lang.String string2 = extras2.getString("EXTRA_EFR_THUMBNAIL");
            java.lang.String string3 = extras2.getString("EXTRA_EFR_IMAGEHASH");
            java.lang.String string4 = extras2.getString("EXTRA_EFR_STATUS");
            if (z) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc), null, null, new EopLivenessActivity$efrLauncher$1$1$1(activityC38205pQc, string, string3, string2, string4, null), 3, null);
                return;
            } else {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc), null, null, new EopLivenessActivity$efrLauncher$1$1$2(activityC38205pQc, string4, null), 3, null);
                return;
            }
        }
        if (activityResult.getResultCode() == 0) {
            android.content.Intent data2 = activityResult.getData();
            if (data2 != null && (extras = data2.getExtras()) != null) {
                if (BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc), null, null, new EopLivenessActivity$efrLauncher$1$2$1(extras.getString("EXTRA_EFR_STATUS"), activityC38205pQc, extras.getString("EXTRA_RESULT_MESSAGE"), null), 3, null) != null) {
                    return;
                }
            }
            new Function0() { // from class: o.pQo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC38205pQc.AYXKKw(this.KWHzl);
                }
            };
        }
    }

    public static final Unit AYXKKw(ActivityC38205pQc activityC38205pQc) {
        EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
        if (eopLivenessBasicViewModel == null) {
            return null;
        }
        eopLivenessBasicViewModel.OLrzqt();
        return Unit.INSTANCE;
    }

    private final void iwGUEr() {
        pRV<java.lang.String> prvFIwbmz;
        pRV<java.lang.String> prvIwGUEr;
        pRV<EFRData> prvFetchVPNInfo;
        pRV<kotlin.Pair<java.lang.Integer, android.content.Intent>> prvEjfBZ;
        pRV<java.lang.String> prvAYXKKw;
        pRV<java.lang.String> prvAuCTelauCTel;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        if (eopLivenessBasicViewModel != null && (prvAuCTelauCTel = eopLivenessBasicViewModel.AuCTelauCTel()) != null) {
            C43733rup.copydefault(prvAuCTelauCTel, this, new Function1() { // from class: o.pQv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.gEmmrt(this.KWHzl, (java.lang.String) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
        if (eopLivenessBasicViewModel2 != null && (prvAYXKKw = eopLivenessBasicViewModel2.AYXKKw()) != null) {
            C43733rup.copydefault(prvAYXKKw, this, new Function1() { // from class: o.pQs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.djBIcL(this.OLrzqt, (java.lang.String) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.KWHzl;
        if (eopLivenessBasicViewModel3 != null && (prvEjfBZ = eopLivenessBasicViewModel3.ejfBZ()) != null) {
            C43733rup.copydefault(prvEjfBZ, this, new Function1() { // from class: o.pQt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = this.KWHzl;
        if (eopLivenessBasicViewModel4 != null && (prvFetchVPNInfo = eopLivenessBasicViewModel4.fetchVPNInfo()) != null) {
            C43733rup.copydefault(prvFetchVPNInfo, this, new Function1() { // from class: o.pQr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.copydefault(this.OLrzqt, (EFRData) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel5 = this.KWHzl;
        if (eopLivenessBasicViewModel5 != null && (prvIwGUEr = eopLivenessBasicViewModel5.iwGUEr()) != null) {
            C43733rup.copydefault(prvIwGUEr, this, new Function1() { // from class: o.pQu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.copydefault(this.KWHzl, (java.lang.String) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel6 = this.KWHzl;
        if (eopLivenessBasicViewModel6 != null && (prvFIwbmz = eopLivenessBasicViewModel6.fIwbmz()) != null) {
            C43733rup.copydefault(prvFIwbmz, this, new Function1() { // from class: o.pQA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.AhwBna(this.AEQbTJ, (java.lang.String) obj);
                }
            });
        }
        AYXKKw();
    }

    public static final Unit gEmmrt(ActivityC38205pQc activityC38205pQc, java.lang.String str) {
        pRZ prz;
        pUU.KWHzl("qjf", "page tag = " + str);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "RESULT_SUCCESS") && (prz = activityC38205pQc.djBIcL) != null) {
            prz.AEQbTJ(new EopImageInfo(-1L, Constant.UploadFileType.LIVE_FACE_AWS.getImageTypeVal(), "", (java.lang.String) null, (java.lang.String) null, 24, (DefaultConstructorMarker) null));
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "AWS_SCAN_ON_ERROR_RETRY")) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
            if (eopLivenessBasicViewModel != null) {
                eopLivenessBasicViewModel.EZpvd();
            }
            activityC38205pQc.AEQbTJ(new pQQ());
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "AWS_SCAN_ON_ERROR_RETRY_WITH_LCA")) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel2 = activityC38205pQc.KWHzl;
            if (eopLivenessBasicViewModel2 != null) {
                eopLivenessBasicViewModel2.EZpvd();
            }
            EopLivenessBasicViewModel eopLivenessBasicViewModel3 = activityC38205pQc.KWHzl;
            if (eopLivenessBasicViewModel3 != null) {
                eopLivenessBasicViewModel3.EZpvd();
            }
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = activityC38205pQc.KWHzl;
        if (eopLivenessBasicViewModel4 != null) {
            eopLivenessBasicViewModel4.dNCPSb();
        }
        routePage$default(activityC38205pQc, false, false, 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ActivityC38205pQc activityC38205pQc, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        activityC38205pQc.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC38205pQc activityC38205pQc, kotlin.Pair pair) {
        activityC38205pQc.setResult(((java.lang.Number) pair.getFirst()).intValue(), (android.content.Intent) pair.getSecond());
        activityC38205pQc.finish();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC38205pQc activityC38205pQc, EFRData eFRData) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc), null, null, new EopLivenessActivity$setListener$4$1(activityC38205pQc, eFRData, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC38205pQc activityC38205pQc, java.lang.String str) {
        activityC38205pQc.values();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ActivityC38205pQc activityC38205pQc, java.lang.String str) {
        pRY pry;
        java.lang.String strDTwDnp;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FACIAL_VERIFICATION_RESULT_SUCCESS") && (pry = activityC38205pQc.EZpvd) != null) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
            if (eopLivenessBasicViewModel == null || (strDTwDnp = eopLivenessBasicViewModel.DTwDnp()) == null) {
                strDTwDnp = "";
            }
            pry.AEQbTJ(activityC38205pQc, strDTwDnp);
        }
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        pRV<java.lang.Throwable> prvAEQbTJ;
        pRV<java.lang.Throwable> prvAEQbTJ2;
        pRV<FacialInfoResult> prvEZpvd;
        pRV<FacialInfoResult> prvEZpvd2;
        pRY pry = this.EZpvd;
        if (pry != null && (prvEZpvd2 = pry.EZpvd()) != null) {
            prvEZpvd2.removeObservers(this);
        }
        pRY pry2 = this.EZpvd;
        if (pry2 != null && (prvEZpvd = pry2.EZpvd()) != null) {
            C43733rup.copydefault(prvEZpvd, this, new Function1() { // from class: o.pQi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.AEQbTJ(this.copydefault, (FacialInfoResult) obj);
                }
            });
        }
        pRY pry3 = this.EZpvd;
        if (pry3 != null && (prvAEQbTJ2 = pry3.AEQbTJ()) != null) {
            prvAEQbTJ2.removeObservers(this);
        }
        pRY pry4 = this.EZpvd;
        if (pry4 == null || (prvAEQbTJ = pry4.AEQbTJ()) == null) {
            return;
        }
        C43733rup.copydefault(prvAEQbTJ, this, new Function1() { // from class: o.pQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38205pQc.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC38205pQc activityC38205pQc, FacialInfoResult facialInfoResult) {
        if (facialInfoResult != null) {
            pUU.KWHzl("qjf", "observerFacialVerifyEvent facialResultLiveData success");
            android.content.Intent intent = new android.content.Intent();
            facialInfoResult.setSuccess(true);
            Unit unit = Unit.INSTANCE;
            intent.putExtra("EXTRA_FACIAL_VERIFICATION_DATA", facialInfoResult);
            EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
            if (eopLivenessBasicViewModel != null) {
                eopLivenessBasicViewModel.KWHzl(new kotlin.Pair<>(-1, intent));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final ActivityC38205pQc activityC38205pQc, final java.lang.Throwable th) {
        java.lang.String message;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("AWS_FACIAL_VERIFICATION_VERIFY_Error", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38205pQc.OLrzqt(th, activityC38205pQc, (EventParamsList) obj);
            }
        });
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            pUU.KWHzl("qjf", "observerFacialVerifyEvent errorLiveData code = " + oKServerException.getCode() + " ,msg = " + oKServerException.getMessage());
            int code = oKServerException.getCode();
            if (code == 3902 || code == 35051) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("EXTRA_FACIAL_VERIFICATION_DATA", new FacialInfoResult(false, oKServerException.getCode(), oKServerException.getMessage()));
                EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
                if (eopLivenessBasicViewModel != null) {
                    eopLivenessBasicViewModel.KWHzl(new kotlin.Pair<>(-1, intent));
                }
            } else {
                java.lang.String message2 = oKServerException.getMessage();
                if (message2 != null) {
                    C55326xho.toast$default(message2, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
                EopLivenessBasicViewModel eopLivenessBasicViewModel2 = activityC38205pQc.KWHzl;
                java.lang.String strQbewEr = eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.QbewEr() : null;
                if (Intrinsics.EZpvd((java.lang.Object) strQbewEr, (java.lang.Object) LivenessRouter.AWS.getVendorName())) {
                    EopLivenessBasicViewModel eopLivenessBasicViewModel3 = activityC38205pQc.KWHzl;
                    if (eopLivenessBasicViewModel3 != null) {
                        eopLivenessBasicViewModel3.copydefault(activityC38205pQc.getTAG());
                    }
                } else {
                    Intrinsics.EZpvd((java.lang.Object) strQbewEr, (java.lang.Object) LivenessRouter.ALI.getVendorName());
                }
            }
        } else {
            pUU.KWHzl("qjf", "observerFacialVerifyEvent errorLiveData throwable = " + th);
            if (th != null && (message = th.getMessage()) != null) {
                C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            EopLivenessBasicViewModel eopLivenessBasicViewModel4 = activityC38205pQc.KWHzl;
            if (eopLivenessBasicViewModel4 != null) {
                eopLivenessBasicViewModel4.copydefault(activityC38205pQc.getTAG());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th, ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        java.lang.String message;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (th == null || (message = th.getMessage()) == null) {
            message = "unknown error";
        }
        eventParamsList.put("message", message, false);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> copydefault(android.content.Context context) {
        try {
            java.lang.Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
            Intrinsics.copydefault(systemService, "");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return C56424yEw.AYXKKw(C56390yDp.OLrzqt("memory_state_is_low", java.lang.String.valueOf(memoryInfo.lowMemory)), C56390yDp.OLrzqt("memory_avail_mb", java.lang.String.valueOf(memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)), C56390yDp.OLrzqt("memory_total_mb", java.lang.String.valueOf(memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)), C56390yDp.OLrzqt("memory_threshold_mb", java.lang.String.valueOf(memoryInfo.threshold / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)));
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("Failed to log memory state", th);
            return new java.util.HashMap<>();
        }
    }

    private final void AEQbTJ(androidx.fragment.app.Fragment fragment) {
        pUU.KWHzl("qjf", "replaceFragment-tag = " + fragment.getClass().getName());
        getSupportFragmentManager().beginTransaction().replace(C43662rtX.ActionBar.QIZEnU, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    public static /* synthetic */ void routePage$default(ActivityC38205pQc activityC38205pQc, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        activityC38205pQc.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        EopImageInfo eopImageInfoEZpvd;
        EopImageInfo eopImageInfoOLrzqt;
        EopImageInfo eopImageInfoAEQbTJ;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        EopLivenessBasicViewModel.EopPageNode eopPageNodeAkhnZx = eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.AkhnZx() : null;
        if (z2) {
            eopPageNodeAkhnZx = null;
        }
        pUU.KWHzl("qjf", "routePage--existInAdvance = " + z2 + ",currentPageNode = " + eopPageNodeAkhnZx + " flow_source=" + AuCTel());
        int i = eopPageNodeAkhnZx == null ? -1 : StateListAnimator.copydefault[eopPageNodeAkhnZx.ordinal()];
        if (i == 1) {
            valueOf();
            return;
        }
        if (i == 2) {
            java.lang.String tag = getTAG();
            EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
            pUU.KWHzl(tag, "routePage--face scan page node, checkType = " + (eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.QbewEr() : null));
            DbNXlk();
            return;
        }
        if (i == 3) {
            java.lang.String tag2 = getTAG();
            EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.KWHzl;
            pUU.KWHzl(tag2, "routePage--face result page node, checkType = " + (eopLivenessBasicViewModel3 != null ? eopLivenessBasicViewModel3.QbewEr() : null));
            isConnected();
            return;
        }
        java.util.ArrayList<EopImageInfo> arrayList = new java.util.ArrayList<>();
        pRZ prz = this.djBIcL;
        if (prz != null && (eopImageInfoAEQbTJ = prz.AEQbTJ()) != null) {
            arrayList.add(eopImageInfoAEQbTJ);
        }
        pRZ prz2 = this.djBIcL;
        if (prz2 != null && (eopImageInfoOLrzqt = prz2.OLrzqt()) != null) {
            arrayList.add(eopImageInfoOLrzqt);
        }
        pRZ prz3 = this.djBIcL;
        if (prz3 != null && (eopImageInfoEZpvd = prz3.EZpvd()) != null) {
            arrayList.add(eopImageInfoEZpvd);
        }
        if (z || z2 || arrayList.isEmpty()) {
            fetchVPNInfo();
        } else {
            AEQbTJ(arrayList);
        }
    }

    public final void DbNXlk() {
        djBIcL();
    }

    public final void isConnected() {
        AEQbTJ(new C38231pRb());
    }

    public final void valueOf() {
        AEQbTJ(new pQT());
    }

    public final void djBIcL() {
        AEQbTJ(new pQD());
    }

    public final void values() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EopLivenessActivity$startLcaLiveness$1(this, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pQg.reportKycFlow$default(o.pQg, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.Object):void */
    private final void AEQbTJ(java.util.ArrayList<EopImageInfo> arrayList) {
        java.lang.String strDTwDnp;
        VendorConfig vendorConfigQKVWgx;
        java.lang.String certificateTypeOnboarding;
        C38209pQg c38209pQg = C38209pQg.copydefault;
        java.lang.String strFIwbmz = fIwbmz();
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        java.lang.String str = "";
        C38209pQg.reportKycFlow$default(c38209pQg, "submit", strFIwbmz, (eopLivenessBasicViewModel == null || (vendorConfigQKVWgx = eopLivenessBasicViewModel.QKVWgx()) == null || (certificateTypeOnboarding = vendorConfigQKVWgx.getCertificateTypeOnboarding()) == null) ? "" : certificateTypeOnboarding, false, null, 24, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("EXTRA_RESULT_IMAGE_LIST", arrayList);
        intent.putExtra("EXTRA_RESULT_SUCCESS", true);
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
        intent.putExtra("EXTRA_RESULT_VENDOR_TYPE", eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.QbewEr() : null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.KWHzl;
        if (eopLivenessBasicViewModel3 != null && (strDTwDnp = eopLivenessBasicViewModel3.DTwDnp()) != null) {
            str = strDTwDnp;
        }
        intent.putExtra("EXTRA_SESSION_ID", str);
        setResult(-1, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    private final void AkhnZx() {
        android.content.Intent intent = new android.content.Intent();
        EopSessionError eopSessionError = EopSessionError.CANCELLED_BY_USER;
        intent.putExtra("EXTRA_RESULT_CODE", eopSessionError.getCode());
        intent.putExtra("EXTRA_RESULT_MESSAGE", eopSessionError.getMessage());
        intent.putExtra("EXTRA_RESULT_SUCCESS", false);
        setResult(0, intent);
        finish();
    }

    private final void fetchVPNInfo() {
        android.content.Intent intent = new android.content.Intent();
        EopSessionError eopSessionError = EopSessionError.CANCELLED_BY_USER;
        intent.putExtra("EXTRA_RESULT_CODE", eopSessionError.getCode());
        intent.putExtra("EXTRA_RESULT_MESSAGE", eopSessionError.getMessage());
        intent.putExtra("EXTRA_RESULT_SUCCESS", false);
        setResult(-1, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC33041mov
    public void setRequestedOrientation(@NotNull android.app.Activity activity, @NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        activity.setRequestedOrientation(1);
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        pUU.KWHzl("kyc_in_house", "eop onConfigurationChanged");
        recreate();
    }

    private final void uzCIH() {
        java.lang.String strAubY;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        EopLivenessBasicViewModel.EopPageNode eopPageNodeAkhnZx = eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.AkhnZx() : null;
        int i = eopPageNodeAkhnZx == null ? -1 : StateListAnimator.copydefault[eopPageNodeAkhnZx.ordinal()];
        if (i == 1) {
            C43739ruv c43739ruvFJNWhG = fJNWhG();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            c43739ruvFJNWhG.KWHzl("ReadyTakeSelfie_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Function1() { // from class: o.pQm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.isConnected(this.copydefault, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "ReadyTakeSelfie_Full_Button_Click back");
            return;
        }
        if (i == 2) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("AWSCaptureSelfie_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.values(this.EZpvd, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "AWSCaptureSelfie_Full_Button_Click back");
        } else {
            if (i != 3) {
                return;
            }
            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("AWSSelfieCaptured_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.DbNXlk(this.OLrzqt, (EventParamsList) obj);
                }
            });
            EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
            if (eopLivenessBasicViewModel2 == null || (strAubY = eopLivenessBasicViewModel2.AubY()) == null) {
                strAubY = "";
            }
            pUU.KWHzl("kyc_in_house", "AWSSelfieCaptured_Full_Button_Click close " + strAubY);
        }
    }

    public static final Unit isConnected(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit values(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "back", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        java.lang.String strAubY;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, EopTrackEvent.CLOSE, false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
        EventParamsList.put$default(eventParamsList, "status", (eopLivenessBasicViewModel == null || (strAubY = eopLivenessBasicViewModel.AubY()) == null) ? "" : strAubY, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = activityC38205pQc.KWHzl;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel2 == null || !eopLivenessBasicViewModel2.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        EopLivenessBasicViewModel.EopPageNode eopPageNodeAkhnZx = eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.AkhnZx() : null;
        if (eopPageNodeAkhnZx != null && StateListAnimator.copydefault[eopPageNodeAkhnZx.ordinal()] == 1) {
            C43739ruv c43739ruvFJNWhG = fJNWhG();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            c43739ruvFJNWhG.KWHzl("ReadyTakeSelfie_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Function1() { // from class: o.pQk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.AkhnZx(this.AEQbTJ, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "ReadyTakeSelfie_Full_Page_View backToGuide");
        }
    }

    public static final Unit AkhnZx(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRANCE, "backToGuide", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        if (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.QfsBiF()) {
            onBackOperation$default(this, null, 1, null);
        }
    }

    public static /* synthetic */ void onBackOperation$default(ActivityC38205pQc activityC38205pQc, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        activityC38205pQc.OLrzqt(str);
    }

    private final void OLrzqt(java.lang.String str) {
        EopLivenessBasicViewModel eopLivenessBasicViewModel;
        uzCIH();
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
        boolean z = (eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.AkhnZx() : null) == EopLivenessBasicViewModel.EopPageNode.FaceGuide || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "AWS_RESULT_CLOSE");
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.KWHzl;
        if ((eopLivenessBasicViewModel3 != null ? eopLivenessBasicViewModel3.AkhnZx() : null) == EopLivenessBasicViewModel.EopPageNode.FaceResult && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "AWS_RESULT_RETRY") && (eopLivenessBasicViewModel = this.KWHzl) != null) {
            eopLivenessBasicViewModel.EZpvd();
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = this.KWHzl;
        if (eopLivenessBasicViewModel4 != null) {
            eopLivenessBasicViewModel4.EZpvd();
        }
        gEmmrt();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FACE_USER_CANCEL") && AhwBna()) {
            AkhnZx();
        } else {
            AEQbTJ(true, z);
        }
    }

    public final boolean AhwBna() {
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        if (eopLivenessBasicViewModel != null) {
            return eopLivenessBasicViewModel.RJOkX();
        }
        return false;
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        java.lang.String strAubY;
        super.onStart();
        if (this.AYXKKw) {
            this.AYXKKw = false;
            return;
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        EopLivenessBasicViewModel.EopPageNode eopPageNodeAkhnZx = eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.AkhnZx() : null;
        int i = eopPageNodeAkhnZx == null ? -1 : StateListAnimator.copydefault[eopPageNodeAkhnZx.ordinal()];
        if (i == 1) {
            C43739ruv c43739ruvFJNWhG = fJNWhG();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            c43739ruvFJNWhG.KWHzl("ReadyTakeSelfie_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Function1() { // from class: o.pQy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.gEmmrt(this.OLrzqt, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "ReadyTakeSelfie_Full_Page_View onStart");
            return;
        }
        if (i == 2) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("AWSCaptureSelfie_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38205pQc.AhwBna(this.EZpvd, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "AWSCaptureSelfie_Full_Page_View onStart " + fIwbmz());
            return;
        }
        if (i != 3) {
            return;
        }
        TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("AWSSelfieCaptured_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38205pQc.djBIcL(this.KWHzl, (EventParamsList) obj);
            }
        });
        java.lang.String strFIwbmz = fIwbmz();
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.KWHzl;
        if (eopLivenessBasicViewModel2 == null || (strAubY = eopLivenessBasicViewModel2.AubY()) == null) {
            strAubY = "";
        }
        pUU.KWHzl("kyc_in_house", "AWSSelfieCaptured_Full_Page_View onStart " + strFIwbmz + " " + strAubY);
    }

    public static final Unit gEmmrt(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRANCE, "onStart", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRANCE, "onStart", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        java.lang.String strAubY;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRANCE, "onStart", false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
        EventParamsList.put$default(eventParamsList, "status", (eopLivenessBasicViewModel == null || (strAubY = eopLivenessBasicViewModel.AubY()) == null) ? "" : strAubY, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = activityC38205pQc.KWHzl;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel2 == null || !eopLivenessBasicViewModel2.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String fIwbmz() {
        java.lang.String strIsConnected;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        return (eopLivenessBasicViewModel == null || (strIsConnected = eopLivenessBasicViewModel.isConnected()) == null) ? "" : strIsConnected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AuCTel() {
        java.lang.String strOcIXYQ;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        return (eopLivenessBasicViewModel == null || (strOcIXYQ = eopLivenessBasicViewModel.OcIXYQ()) == null) ? "" : strOcIXYQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String fARcdN() {
        java.lang.String strORxRYg;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        return (eopLivenessBasicViewModel == null || (strORxRYg = eopLivenessBasicViewModel.ORxRYg()) == null) ? "" : strORxRYg;
    }

    public final java.lang.String copydefault() {
        java.lang.String strHDKMBd;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.KWHzl;
        return (eopLivenessBasicViewModel == null || (strHDKMBd = eopLivenessBasicViewModel.hDKMBd()) == null) ? "" : strHDKMBd;
    }

    @Override // o.AbstractActivityC33041mov, o.C60121zwJ.Activity
    public void onPermissionsDenied(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsDenied(i, list);
        if (i == 3 && C60121zwJ.copydefault(this, list)) {
            new AppSettingsDialog.ActionBar(this).AEQbTJ().AEQbTJ();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C38278pSw.KWHzl.OLrzqt(new java.lang.Runnable() { // from class: o.pQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC38205pQc.valueOf(this.copydefault);
            }
        });
        super.onDestroy();
    }

    public static final void valueOf(ActivityC38205pQc activityC38205pQc) {
        C38275pSt.AEQbTJ.EZpvd(activityC38205pQc);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
