package o;

import android.os.Build;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.FileProvider;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C45364soR;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.slz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45239slz extends wXS {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<java.lang.String[]> AhwBna;
    public final ActivityResultLauncher<android.net.Uri> copydefault;
    public android.net.Uri djBIcL;
    public final AbstractC55115xdp gEmmrt;
    public android.net.Uri isConnected;
    public final boolean valueOf;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.slC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45239slz.OLrzqt(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sly
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45239slz.AhwBna(this.EZpvd);
        }
    });
    public final java.lang.CharSequence EZpvd = "";
    public final C45364soR AYXKKw = C45364soR.Companion.EZpvd(new C45364soR.ActionBar.StateListAnimator(this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXS
    public java.lang.CharSequence copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXS, o.wXX
    public boolean getHasFooter() {
        return this.valueOf;
    }

    public C45239slz() {
        ActivityResultLauncher<android.net.Uri> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: o.slA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C45239slz.OLrzqt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
        this.gEmmrt = C55119xdt.AEQbTJ.KWHzl(this, new ActivityResultCallback() { // from class: o.slB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C45239slz.copydefault(this.AEQbTJ, (android.net.Uri) obj);
            }
        });
        ActivityResultLauncher<java.lang.String[]> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.OpenDocument(), new ActivityResultCallback() { // from class: o.slE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C45239slz.EZpvd(this.KWHzl, (android.net.Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult2;
    }

    public final java.lang.String[] AEQbTJ() {
        return (java.lang.String[]) this.OLrzqt.getValue();
    }

    public static final java.lang.String[] OLrzqt(C45239slz c45239slz) {
        java.lang.String[] stringArray;
        android.os.Bundle arguments = c45239slz.getArguments();
        return (arguments == null || (stringArray = arguments.getStringArray("ARG_ACCEPT_TYPES")) == null) ? new java.lang.String[0] : stringArray;
    }

    public final java.lang.String[] KWHzl() {
        return (java.lang.String[]) this.AEQbTJ.getValue();
    }

    public static final java.lang.String[] AhwBna(C45239slz c45239slz) {
        java.util.List fieldNames = yDV.getFieldNames(c45239slz.AEQbTJ());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fieldNames) {
            java.lang.String str = (java.lang.String) obj;
            if (!C59449zhJ.startsWith$default(str, "image/", false, 2, null) || !C59449zhJ.startsWith$default(str, "video/", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    /* JADX INFO: renamed from: o.slz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.slz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C45239slz AEQbTJ(@NotNull java.lang.String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            C45239slz c45239slz = new C45239slz();
            c45239slz.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_ACCEPT_TYPES", strArr)));
            return c45239slz;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.slG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45239slz.AkhnZx(this.copydefault);
            }
        });
    }

    public static final void AkhnZx(C45239slz c45239slz) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45239slz, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(android.net.Uri uri) {
        this.isConnected = uri;
        dismissAllowingStateLoss();
    }

    public static final void OLrzqt(C45239slz c45239slz, java.lang.Boolean bool) {
        android.net.Uri uri;
        if (bool.booleanValue() && (uri = c45239slz.djBIcL) != null) {
            c45239slz.AEQbTJ(uri);
        } else {
            C44760scx.log$default("Camera pic not captured", null, 2, null);
            c45239slz.dismissAllowingStateLoss();
        }
    }

    public static final void copydefault(C45239slz c45239slz, android.net.Uri uri) {
        c45239slz.AEQbTJ(uri);
    }

    public static final void EZpvd(C45239slz c45239slz, android.net.Uri uri) {
        c45239slz.AEQbTJ(uri);
    }

    public final void EZpvd() {
        try {
            this.AhwBna.launch(KWHzl());
        } catch (java.lang.Exception unused) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXS
    public void copydefault(@NotNull LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
        android.widget.TextView textViewAEQbTJ = AEQbTJ(linearLayoutCompat, C33070mpX.AYXKKw(C47315tni.PendingIntent.Swccd));
        textViewAEQbTJ.setOnClickListener(new Fragment(textViewAEQbTJ, 1000L, this));
        for (java.lang.String str : AEQbTJ()) {
            Intrinsics.copydefault((java.lang.Object) str);
            if (C59449zhJ.startsWith$default(str, "image/", false, 2, null) || C59449zhJ.startsWith$default(str, "video/", false, 2, null)) {
                android.widget.TextView textViewAEQbTJ2 = AEQbTJ(linearLayoutCompat, C33070mpX.AYXKKw(C47315tni.PendingIntent.DQYQgr));
                textViewAEQbTJ2.setOnClickListener(new ActionBar(textViewAEQbTJ2, 1000L, this));
                break;
            }
        }
        if (!(KWHzl().length == 0)) {
            android.widget.TextView textViewAEQbTJ3 = AEQbTJ(linearLayoutCompat, C33070mpX.AYXKKw(C47315tni.PendingIntent.zLAIeZ));
            textViewAEQbTJ3.setOnClickListener(new Activity(textViewAEQbTJ3, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.slz$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            android.net.Uri uriOLrzqt = C45239slz.this.OLrzqt();
            if (uriOLrzqt != null) {
                C45239slz c45239slz = C45239slz.this;
                c45239slz.djBIcL = uriOLrzqt;
                try {
                    c45239slz.copydefault.launch(uriOLrzqt);
                } catch (java.lang.Exception unused) {
                    c45239slz.dismissAllowingStateLoss();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.slz$Application */
    public static final class Application implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C45239slz.this.EZpvd();
        }
    }

    public final void KWHzl(Function0<Unit> function0) {
        this.AYXKKw.EZpvd(new C45364soR.Application(C56402yEa.EZpvd("android.permission.READ_EXTERNAL_STORAGE"), C33070mpX.AYXKKw(C47315tni.PendingIntent.RVsVBY), C33070mpX.AYXKKw(C47315tni.PendingIntent.QIZEnU), null, function0, 8, null));
    }

    /* JADX INFO: renamed from: o.slz$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C45239slz AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C45239slz c45239slz) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c45239slz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.gEmmrt.EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.slz$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C45239slz AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C45239slz c45239slz) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c45239slz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (Build.VERSION.SDK_INT > 29) {
                    this.AEQbTJ.EZpvd();
                } else {
                    C45239slz c45239slz = this.AEQbTJ;
                    c45239slz.KWHzl(c45239slz.new Application());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.slz$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C45239slz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C45239slz c45239slz) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c45239slz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.AYXKKw.EZpvd(new C45364soR.Application(C56402yEa.EZpvd("android.permission.CAMERA"), C33070mpX.AYXKKw(C47315tni.PendingIntent.QDqgQU), C33070mpX.AYXKKw(C47315tni.PendingIntent.DaRZkR), null, this.copydefault.new StateListAnimator(), 8, null));
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        android.net.Uri uri = this.isConnected;
        FragmentKt.setFragmentResult(this, "REQUEST_KEY_FILE_PICKER", BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_FILE_URI", uri != null ? uri.toString() : null)));
        super.onDismiss(dialogInterface);
    }

    public final android.net.Uri OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        android.content.Context context = getContext();
        if (context == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            java.lang.String str = "tmp_" + java.lang.String.valueOf(java.lang.System.currentTimeMillis()) + "_";
            java.io.File externalCacheDir = context.getExternalCacheDir();
            objM7377constructorimpl = Result.m7377constructorimpl(FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", java.io.File.createTempFile(str, ".jpg", externalCacheDir)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        final java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.copydefault("Error creating temporary image file", new Function1() { // from class: o.slD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45239slz.EZpvd(thM7380exceptionOrNullimpl, (C44761scy) obj);
                }
            });
        }
        return (android.net.Uri) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public static final Unit EZpvd(java.lang.Throwable th, C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        c44761scy.KWHzl(th);
        return Unit.INSTANCE;
    }
}
