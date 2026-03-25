package o;

import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityC42040rEc extends AbstractActivityC33041mov {
    public AbstractC43765rvU EZpvd;
    public java.lang.String[] copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.rEc$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.rEc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rEc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void start$default(Application application, android.content.Context context, java.lang.String[] strArr, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                strArr = null;
            }
            application.AEQbTJ(context, strArr, activityResultLauncher);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, java.lang.String[] strArr, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC42040rEc.class);
            intent.putExtra("permissions", strArr);
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(intent);
            } else {
                context.startActivity(intent);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        OKReminder oKReminder;
        AbstractC43977rzU abstractC43977rzU;
        super.onCreate(bundle);
        rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        ComplianceTheme complianceThemeCopydefault = rsf != null ? rsf.copydefault() : null;
        int i = complianceThemeCopydefault == null ? -1 : ActionBar.EZpvd[complianceThemeCopydefault.ordinal()];
        if (i == 1) {
            setTheme(C43662rtX.FragmentManager.copydefault);
        } else if (i == 2) {
            setTheme(C43662rtX.FragmentManager.EZpvd);
        }
        this.copydefault = getIntent().getStringArrayExtra("permissions");
        AbstractC43765rvU abstractC43765rvU = (AbstractC43765rvU) DataBindingUtil.setContentView(this, C43662rtX.TaskDescription.AkhnZx);
        this.EZpvd = abstractC43765rvU;
        if (abstractC43765rvU != null && (abstractC43977rzU = abstractC43765rvU.OLrzqt) != null) {
            android.widget.ImageView imageView = abstractC43977rzU.AEQbTJ;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            android.widget.ImageButton imageButton = abstractC43977rzU.KWHzl;
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
            android.widget.ImageButton imageButton2 = abstractC43977rzU.KWHzl;
            if (imageButton2 != null) {
                imageButton2.setOnClickListener(new View.OnClickListener() { // from class: o.rEe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC42040rEc.AEQbTJ(this.copydefault, view);
                    }
                });
            }
        }
        AbstractC43765rvU abstractC43765rvU2 = this.EZpvd;
        if (abstractC43765rvU2 != null && (oKReminder = abstractC43765rvU2.KWHzl) != null) {
            oKReminder.setStyle(2);
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setLeadingIconVisibility(true);
            oKReminder.setMessage(C33070mpX.AYXKKw(C43662rtX.Dialog.QHmsKR));
        }
        AbstractC43765rvU abstractC43765rvU3 = this.EZpvd;
        if (abstractC43765rvU3 != null && (c52794wYp2 = abstractC43765rvU3.copydefault) != null) {
            c52794wYp2.setOKDSType(257);
        }
        AbstractC43765rvU abstractC43765rvU4 = this.EZpvd;
        if (abstractC43765rvU4 != null && (c52794wYp = abstractC43765rvU4.copydefault) != null) {
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        }
        C32866mlf.onEvent$default("KYC_Vendor_Permissions_View", (TrackChannel[]) null, new Function1() { // from class: o.rEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42040rEc.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final void AEQbTJ(ActivityC42040rEc activityC42040rEc, android.view.View view) {
        C32866mlf.onEvent$default("KYC_Vendor_PermissionsClose_Click", (TrackChannel[]) null, new Function1() { // from class: o.rEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42040rEc.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC42040rEc.setResult(-1, new android.content.Intent());
        activityC42040rEc.finish();
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rEc$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rEc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC42040rEc OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC42040rEc activityC42040rEc) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = activityC42040rEc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("KYC_Vendor_Permissions_Click", (TrackChannel[]) null, Activity.AEQbTJ, 1, (java.lang.Object) null);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("vendor_permission", this.OLrzqt.copydefault);
                this.OLrzqt.setResult(-1, intent);
                this.OLrzqt.finish();
            }
        }
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
