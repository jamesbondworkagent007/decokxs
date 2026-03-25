package o;

import android.os.Build;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.urlvendor.OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rTl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC42454rTl extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public java.lang.String[] EZpvd;
    public AbstractC43763rvS KWHzl;

    /* JADX INFO: renamed from: o.rTl$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ComplianceTheme.values().length];
            try {
                iArr[ComplianceTheme.OKX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ComplianceTheme.OKX_LITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.rTl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rTl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull UrlVendorTokenResp urlVendorTokenResp, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(urlVendorTokenResp, "");
            EZpvd(context, urlVendorTokenResp);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC42454rTl.class);
            intent.putExtra("url_vendor_data", urlVendorTokenResp);
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(intent);
            } else {
                context.startActivity(intent);
            }
        }

        public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, java.lang.Long l, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1(fragmentActivity, str, l, function1, null), 3, null);
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull UrlVendorTokenResp urlVendorTokenResp) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(urlVendorTokenResp, "");
            java.util.HashMap map = new java.util.HashMap();
            map.put("vendor_type", C33129mqd.gEmmrt(urlVendorTokenResp.getVendorType()));
            if (ClientLibraryUtils.getPackageInfo(context, "sg.ndi.sp") != null) {
                map.put("singpass_installed", "yes");
                pUU.EZpvd("OKComplianceServiceImpl", "zhouzhouzhou-----getPackageManager>  singpass 已安装");
            } else {
                map.put("singpass_installed", "no");
            }
            if (ClientLibraryUtils.getPackageInfo(context, "be.bmid.itsme") != null) {
                map.put("itsme_installed", "yes");
                pUU.EZpvd("OKComplianceServiceImpl", "zhouzhouzhou-----getPackageManager>  itsme 已安装");
            } else {
                map.put("itsme_installed", "no");
            }
            if (ClientLibraryUtils.getPackageInfo(context, "com.governikus.ausweisapp2") != null) {
                map.put("ausweisapp_installed", "yes");
                pUU.EZpvd("OKComplianceServiceImpl", "zhouzhouzhou-----getPackageManager>  ausweisapp 已安装");
            } else {
                map.put("ausweisapp_installed", "no");
            }
            C43693ruB.copydefault("API_URL_VendorStart_View", map);
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(urlVendorTokenResp.getUrl()));
            try {
                context.startActivity(intent);
            } catch (java.lang.Exception e) {
                java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
                C43296rmc.KWHzl("ProcessingFragment", stackTraceString);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String pollingUrl;
        LottieAnimationView lottieAnimationView;
        AbstractC43977rzU abstractC43977rzU;
        super.onCreate(bundle);
        rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        ComplianceTheme complianceThemeCopydefault = rsf != null ? rsf.copydefault() : null;
        int i = complianceThemeCopydefault == null ? -1 : ActionBar.copydefault[complianceThemeCopydefault.ordinal()];
        if (i == 1) {
            setTheme(C43662rtX.FragmentManager.copydefault);
        } else if (i == 2) {
            setTheme(C43662rtX.FragmentManager.EZpvd);
        }
        this.EZpvd = getIntent().getStringArrayExtra("url_vendor_data");
        AbstractC43763rvS abstractC43763rvS = (AbstractC43763rvS) DataBindingUtil.setContentView(this, C43662rtX.TaskDescription.values);
        this.KWHzl = abstractC43763rvS;
        if (abstractC43763rvS != null && (abstractC43977rzU = abstractC43763rvS.AEQbTJ) != null) {
            android.widget.ImageButton imageButton = abstractC43977rzU.KWHzl;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            android.widget.ImageView imageView = abstractC43977rzU.AEQbTJ;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            android.widget.ImageView imageView2 = abstractC43977rzU.AEQbTJ;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.rTo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC42454rTl.OLrzqt(this.AEQbTJ, view);
                    }
                });
            }
        }
        getOnBackPressedDispatcher().addCallback(this, new TaskDescription());
        AbstractC43763rvS abstractC43763rvS2 = this.KWHzl;
        if (abstractC43763rvS2 != null && (lottieAnimationView = abstractC43763rvS2.KWHzl) != null) {
            lottieAnimationView.setAnimation(C52761wXj.PendingIntent.fIwbmz);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.playAnimation();
        }
        C32866mlf.onEvent$default("KYC_Vendor_Permissions_View", (TrackChannel[]) null, new Function1() { // from class: o.rTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42454rTl.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.rTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC42454rTl.OLrzqt(this.KWHzl);
            }
        });
        UrlVendorTokenResp urlVendorTokenRespEZpvd = EZpvd(interfaceC56387yDmCopydefault);
        if (urlVendorTokenRespEZpvd == null || (pollingUrl = urlVendorTokenRespEZpvd.getPollingUrl()) == null) {
            return;
        }
        Application application = Companion;
        UrlVendorTokenResp urlVendorTokenRespEZpvd2 = EZpvd(interfaceC56387yDmCopydefault);
        application.KWHzl(this, pollingUrl, urlVendorTokenRespEZpvd2 != null ? urlVendorTokenRespEZpvd2.getPollingTimeout() : null, new Function1() { // from class: o.rTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42454rTl.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final void OLrzqt(ActivityC42454rTl activityC42454rTl, android.view.View view) {
        activityC42454rTl.finish();
    }

    /* JADX INFO: renamed from: o.rTl$TaskDescription */
    public static final class TaskDescription extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public TaskDescription() {
            super(true);
        }
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public static final UrlVendorTokenResp EZpvd(InterfaceC56387yDm<UrlVendorTokenResp> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final UrlVendorTokenResp OLrzqt(ActivityC42454rTl activityC42454rTl) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (UrlVendorTokenResp) activityC42454rTl.getIntent().getParcelableExtra("url_vendor_data", UrlVendorTokenResp.class);
        }
        return (UrlVendorTokenResp) activityC42454rTl.getIntent().getParcelableExtra("conversation");
    }

    public static final Unit copydefault(ActivityC42454rTl activityC42454rTl, boolean z) {
        activityC42454rTl.setResult(-1, new android.content.Intent());
        activityC42454rTl.finish();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
