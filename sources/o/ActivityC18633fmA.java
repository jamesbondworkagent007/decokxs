package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.appupdate.api.IUpdateStateChange;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.uilab.item.OKRegularCell;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C13754dXa;
import o.C52761wXj;

/* JADX INFO: renamed from: o.fmA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC18633fmA extends AbstractActivityC33013moT implements InterfaceC35204nqs {
    public C16438ejt OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fmJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18633fmA.valueOf(this.AEQbTJ);
        }
    });
    public final AppUpdateService AYXKKw = (AppUpdateService) C43251rlk.copydefault(AppUpdateService.class);
    public final CoroutineDispatcher EZpvd = Dispatchers.getIO();
    public final MainCoroutineDispatcher copydefault = Dispatchers.getMain();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.fmH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18633fmA.copydefault();
        }
    });

    @Override // o.InterfaceC35204nqs
    public void fARcdN() {
    }

    public static final IUpdateStateChange valueOf(ActivityC18633fmA activityC18633fmA) {
        return activityC18633fmA.OLrzqt();
    }

    public final IUpdateStateChange EZpvd() {
        return (IUpdateStateChange) this.djBIcL.getValue();
    }

    public static final java.util.List copydefault() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC54844xXk.class));
    }

    public final java.util.List<InterfaceC54844xXk> KWHzl() {
        return (java.util.List) this.KWHzl.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16438ejt c16438ejtAEQbTJ = C16438ejt.AEQbTJ(getLayoutInflater());
        this.OLrzqt = c16438ejtAEQbTJ;
        if (c16438ejtAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c16438ejtAEQbTJ = null;
        }
        setContentView(c16438ejtAEQbTJ.getRoot());
        gEmmrt();
        AhwBna();
        this.AYXKKw.addUpdateStateChangeListener(EZpvd());
        AYXKKw();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18633fmA.djBIcL(this.OLrzqt);
            }
        });
    }

    public static final void djBIcL(ActivityC18633fmA activityC18633fmA) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18633fmA, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        android.graphics.drawable.Drawable drawable;
        final InterfaceC54844xXk interfaceC54844xXk;
        C16438ejt c16438ejt = this.OLrzqt;
        C16438ejt c16438ejt2 = null;
        if (c16438ejt == null) {
            Intrinsics.gEmmrt("");
            c16438ejt = null;
        }
        c16438ejt.DbNXlk.setText(getString(C13754dXa.FragmentManager.QOeQqh) + " " + C32979mnm.EZpvd.EZpvd());
        C16438ejt c16438ejt3 = this.OLrzqt;
        if (c16438ejt3 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt3 = null;
        }
        c16438ejt3.fetchVPNInfo.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaCompanionExternalSyntheticApiModelOutline0));
        C16438ejt c16438ejt4 = this.OLrzqt;
        if (c16438ejt4 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt4 = null;
        }
        c16438ejt4.fetchVPNInfo.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        C16438ejt c16438ejt5 = this.OLrzqt;
        if (c16438ejt5 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt5 = null;
        }
        c16438ejt5.gEmmrt.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        C16438ejt c16438ejt6 = this.OLrzqt;
        if (c16438ejt6 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt6 = null;
        }
        c16438ejt6.KWHzl.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        C16438ejt c16438ejt7 = this.OLrzqt;
        if (c16438ejt7 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt7 = null;
        }
        c16438ejt7.EZpvd.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        C16438ejt c16438ejt8 = this.OLrzqt;
        if (c16438ejt8 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt8 = null;
        }
        c16438ejt8.AYXKKw.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        C16438ejt c16438ejt9 = this.OLrzqt;
        if (c16438ejt9 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt9 = null;
        }
        c16438ejt9.values.setText(djBIcL());
        C16438ejt c16438ejt10 = this.OLrzqt;
        if (c16438ejt10 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt10 = null;
        }
        android.widget.ImageView imageView = c16438ejt10.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility((this.AYXKKw.hasNewVersion() && this.AYXKKw.getUpdateProgress() == null) ? 0 : 8);
        C16438ejt c16438ejt11 = this.OLrzqt;
        if (c16438ejt11 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt11 = null;
        }
        android.widget.ImageView imageView2 = c16438ejt11.djBIcL;
        if (C14728dqt.KWHzl.KWHzl()) {
            drawable = ContextCompat.getDrawable(this, C13754dXa.Activity.DNMMPQ);
        } else {
            drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.svhCHd);
        }
        imageView2.setImageDrawable(drawable);
        java.util.List<InterfaceC54844xXk> listKWHzl = KWHzl();
        if (listKWHzl == null || (interfaceC54844xXk = (InterfaceC54844xXk) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return;
        }
        C16438ejt c16438ejt12 = this.OLrzqt;
        if (c16438ejt12 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt12 = null;
        }
        c16438ejt12.AYXKKw.setVisibility(0);
        C16438ejt c16438ejt13 = this.OLrzqt;
        if (c16438ejt13 == null) {
            Intrinsics.gEmmrt("");
            c16438ejt13 = null;
        }
        c16438ejt13.AYXKKw.setTitle(interfaceC54844xXk.KWHzl());
        C16438ejt c16438ejt14 = this.OLrzqt;
        if (c16438ejt14 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16438ejt2 = c16438ejt14;
        }
        c16438ejt2.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.fmI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18633fmA.EZpvd(interfaceC54844xXk, view);
            }
        });
    }

    public static final void EZpvd(InterfaceC54844xXk interfaceC54844xXk, android.view.View view) {
        Intrinsics.copydefault(view);
        interfaceC54844xXk.EZpvd(view);
    }

    private final void AhwBna() {
        C16438ejt c16438ejt = this.OLrzqt;
        if (c16438ejt == null) {
            Intrinsics.gEmmrt("");
            c16438ejt = null;
        }
        OKRegularCell oKRegularCell = c16438ejt.KWHzl;
        oKRegularCell.setOnClickListener(new LoaderManager(oKRegularCell, 1000L, this));
        OKRegularCell oKRegularCell2 = c16438ejt.gEmmrt;
        oKRegularCell2.setOnClickListener(new PendingIntent(oKRegularCell2, 1000L, this));
        OKRegularCell oKRegularCell3 = c16438ejt.fetchVPNInfo;
        oKRegularCell3.setOnClickListener(new AssistContent(oKRegularCell3, 1000L, this));
        OKRegularCell oKRegularCell4 = c16438ejt.EZpvd;
        oKRegularCell4.setOnClickListener(new SharedElementCallback(oKRegularCell4, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fmA$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application KWHzl = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "Updates", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.fmA$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "Privacy", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.fmA$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public static final TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "Term_of_service", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.fmA$FragmentManager */
    public static final class FragmentManager implements Function1<EventParamsList, Unit> {
        public static final FragmentManager EZpvd = new FragmentManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "Clear_cache", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.fmA$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ActivityC18633fmA.this.showLoadingAtOnceCannotCancel();
            C30360lVm c30360lVm = C30360lVm.KWHzl;
            ActivityC18633fmA activityC18633fmA = ActivityC18633fmA.this;
            CoroutineDispatcher coroutineDispatcher = activityC18633fmA.EZpvd;
            MainCoroutineDispatcher mainCoroutineDispatcher = ActivityC18633fmA.this.copydefault;
            final ActivityC18633fmA activityC18633fmA2 = ActivityC18633fmA.this;
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.EZpvd;
            C30360lVm.clearCache$default(c30360lVm, activityC18633fmA, false, coroutineDispatcher, mainCoroutineDispatcher, new Function1<java.lang.Boolean, Unit>() { // from class: o.fmA.Fragment.2
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
                    EZpvd(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void EZpvd(boolean z) {
                    activityC18633fmA2.dismissLoading();
                    C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.OLrzqt, 0, 1, (java.lang.Object) null);
                    activityC18633fmA2.AYXKKw();
                    viewOnClickListenerC54939xaY.dismiss();
                }
            }, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.fmA$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        }
    }

    public final java.lang.String djBIcL() {
        if (!this.AYXKKw.hasNewVersion()) {
            return null;
        }
        if (this.AYXKKw.getUpdateProgress() == null) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.QfZsXX);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ejfBZ) + this.AYXKKw.getUpdateProgress() + "%";
    }

    public final void AYXKKw() {
        C30360lVm.KWHzl.copydefault(this, this.EZpvd, this.copydefault, new Function1() { // from class: o.fmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18633fmA.KWHzl(this.EZpvd, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit KWHzl(ActivityC18633fmA activityC18633fmA, long j) {
        double d = j / 1048576.0d;
        C16438ejt c16438ejt = activityC18633fmA.OLrzqt;
        if (c16438ejt == null) {
            Intrinsics.gEmmrt("");
            c16438ejt = null;
        }
        C55068xcv c55068xcv = c16438ejt.OLrzqt;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format("%.2f MB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        c55068xcv.setText(str);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.AYXKKw.onActivityResult(i, i2, intent);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AYXKKw.removeUpdateStateChangeListener(EZpvd());
        C30360lVm c30360lVm = C30360lVm.KWHzl;
        c30360lVm.OLrzqt();
        c30360lVm.KWHzl();
    }

    /* JADX INFO: renamed from: o.fmA$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC18633fmA KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, ActivityC18633fmA activityC18633fmA) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = activityC18633fmA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("AboutOKX_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), TaskDescription.KWHzl);
                this.KWHzl.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PickVisualMediaRequest));
            }
        }
    }

    /* JADX INFO: renamed from: o.fmA$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ActivityC18633fmA AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC18633fmA activityC18633fmA) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC18633fmA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("AboutOKX_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), Application.KWHzl);
                this.AEQbTJ.AYXKKw.checkUpdate(this.AEQbTJ, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.fmA$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC18633fmA OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC18633fmA activityC18633fmA) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC18633fmA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("AboutOKX_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), ActionBar.copydefault);
                this.OLrzqt.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.select));
            }
        }
    }

    /* JADX INFO: renamed from: o.fmA$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC18633fmA OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, ActivityC18633fmA activityC18633fmA) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = activityC18633fmA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("AboutOKX_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), FragmentManager.EZpvd);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
                viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.KWHzl);
                viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.EZpvd);
                viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.RJOkX, this.OLrzqt.new Fragment(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.AEQbTJ, new Dialog(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.fmA$StateListAnimator */
    public static final class StateListAnimator implements IUpdateStateChange {
        public StateListAnimator() {
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadProgressChange(int i) {
            C16438ejt c16438ejt = ActivityC18633fmA.this.OLrzqt;
            C16438ejt c16438ejt2 = null;
            if (c16438ejt == null) {
                Intrinsics.gEmmrt("");
                c16438ejt = null;
            }
            c16438ejt.values.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ejfBZ) + " " + i + "%");
            C16438ejt c16438ejt3 = ActivityC18633fmA.this.OLrzqt;
            if (c16438ejt3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16438ejt2 = c16438ejt3;
            }
            android.widget.ImageView imageView = c16438ejt2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadFailed() {
            C16438ejt c16438ejt = ActivityC18633fmA.this.OLrzqt;
            C16438ejt c16438ejt2 = null;
            if (c16438ejt == null) {
                Intrinsics.gEmmrt("");
                c16438ejt = null;
            }
            c16438ejt.values.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QfZsXX));
            C16438ejt c16438ejt3 = ActivityC18633fmA.this.OLrzqt;
            if (c16438ejt3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16438ejt2 = c16438ejt3;
            }
            android.widget.ImageView imageView = c16438ejt2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadSuccess() {
            C16438ejt c16438ejt = ActivityC18633fmA.this.OLrzqt;
            C16438ejt c16438ejt2 = null;
            if (c16438ejt == null) {
                Intrinsics.gEmmrt("");
                c16438ejt = null;
            }
            c16438ejt.values.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QfZsXX));
            C16438ejt c16438ejt3 = ActivityC18633fmA.this.OLrzqt;
            if (c16438ejt3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16438ejt2 = c16438ejt3;
            }
            android.widget.ImageView imageView = c16438ejt2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadCanceled() {
            C16438ejt c16438ejt = ActivityC18633fmA.this.OLrzqt;
            C16438ejt c16438ejt2 = null;
            if (c16438ejt == null) {
                Intrinsics.gEmmrt("");
                c16438ejt = null;
            }
            c16438ejt.values.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QfZsXX));
            C16438ejt c16438ejt3 = ActivityC18633fmA.this.OLrzqt;
            if (c16438ejt3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16438ejt2 = c16438ejt3;
            }
            android.widget.ImageView imageView = c16438ejt2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownLoadStart() {
            C16438ejt c16438ejt = ActivityC18633fmA.this.OLrzqt;
            C16438ejt c16438ejt2 = null;
            if (c16438ejt == null) {
                Intrinsics.gEmmrt("");
                c16438ejt = null;
            }
            c16438ejt.values.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ejfBZ) + " 0%");
            C16438ejt c16438ejt3 = ActivityC18633fmA.this.OLrzqt;
            if (c16438ejt3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16438ejt2 = c16438ejt3;
            }
            android.widget.ImageView imageView = c16438ejt2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
        }
    }

    public final IUpdateStateChange OLrzqt() {
        return new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.fmA$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fmA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
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
