package o;

import android.view.View;
import com.okinc.business.defi.biz.net.bean.MoreFunctionInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C18625flt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.flp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18621flp extends AbstractActivityC33013moT implements C18625flt.TaskDescription {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public AbstractC16396ejD OLrzqt;

    /* JADX INFO: renamed from: o.flp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.flp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ void startActivity$default(Activity activity, android.app.Activity activity2, int i, MoreFunctionInfo moreFunctionInfo, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            activity.copydefault(activity2, i, moreFunctionInfo);
        }

        public final void copydefault(@NotNull android.app.Activity activity, int i, MoreFunctionInfo moreFunctionInfo) {
            Intrinsics.checkNotNullParameter(activity, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC18621flp.class);
            intent.putExtra("scanFunctionInfo", moreFunctionInfo);
            if (i == -1) {
                activity.startActivity(intent);
            } else {
                activity.startActivityForResult(intent, i);
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16396ejD abstractC16396ejDKWHzl = AbstractC16396ejD.KWHzl(getLayoutInflater());
        this.OLrzqt = abstractC16396ejDKWHzl;
        AbstractC16396ejD abstractC16396ejD = null;
        if (abstractC16396ejDKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC16396ejDKWHzl = null;
        }
        setContentView(abstractC16396ejDKWHzl.getRoot());
        AbstractC16396ejD abstractC16396ejD2 = this.OLrzqt;
        if (abstractC16396ejD2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16396ejD2 = null;
        }
        android.widget.ImageView imageView = abstractC16396ejD2.OLrzqt;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C13754dXa.ActionBar.OxbLUn;
        C18625flt c18625flt = new C18625flt();
        c18625flt.AEQbTJ(this);
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(i, c18625flt);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        MoreFunctionInfo moreFunctionInfo = (MoreFunctionInfo) getIntent().getParcelableExtra("scanFunctionInfo");
        if (moreFunctionInfo == null) {
            AbstractC16396ejD abstractC16396ejD3 = this.OLrzqt;
            if (abstractC16396ejD3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16396ejD = abstractC16396ejD3;
            }
            wYC wyc = abstractC16396ejD.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(8);
        } else {
            AbstractC16396ejD abstractC16396ejD4 = this.OLrzqt;
            if (abstractC16396ejD4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16396ejD4 = null;
            }
            wYC wyc2 = abstractC16396ejD4.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyc2, "");
            wyc2.setVisibility(0);
            AbstractC16396ejD abstractC16396ejD5 = this.OLrzqt;
            if (abstractC16396ejD5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16396ejD = abstractC16396ejD5;
            }
            wYC wyc3 = abstractC16396ejD.copydefault;
            wyc3.setOnClickListener(new Application(wyc3, 1000L, moreFunctionInfo, this));
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.flv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18621flp.KWHzl(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.flp$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "scan", false));
        }
    }

    public static final void KWHzl(ActivityC18621flp activityC18621flp) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18621flp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C18625flt.TaskDescription
    public wYC KWHzl() {
        AbstractC16396ejD abstractC16396ejD = this.OLrzqt;
        if (abstractC16396ejD == null) {
            Intrinsics.gEmmrt("");
            abstractC16396ejD = null;
        }
        wYC wyc = abstractC16396ejD.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        return wyc;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C13754dXa.ActionBar.OxbLUn);
        C18625flt c18625flt = fragmentFindFragmentById instanceof C18625flt ? (C18625flt) fragmentFindFragmentById : null;
        if (c18625flt != null) {
            c18625flt.AEQbTJ((C18625flt.TaskDescription) null);
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: o.flp$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC18621flp EZpvd;
        public final /* synthetic */ MoreFunctionInfo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, MoreFunctionInfo moreFunctionInfo, ActivityC18621flp activityC18621flp) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = moreFunctionInfo;
            this.EZpvd = activityC18621flp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3WalletSetting_Top_Button_Click", (TrackChannel[]) null, StateListAnimator.copydefault, 1, (java.lang.Object) null);
                C18061fbL.copydefault(this.KWHzl, this.EZpvd, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.flp$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC18621flp AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC18621flp activityC18621flp) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = activityC18621flp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.finish();
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
