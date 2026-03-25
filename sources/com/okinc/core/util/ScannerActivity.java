package com.okinc.core.util;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.MyCodeLanding;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.core.util.model.ScanViewType;
import com.okinc.core.util.qrcode.decode.ScanType;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractActivityC33483mxM;
import o.AbstractC55115xdp;
import o.C32866mlf;
import o.C32868mlh;
import o.C33492mxV;
import o.C33524myA;
import o.C33532myI;
import o.C33567myr;
import o.C33570myu;
import o.C43251rlk;
import o.C52761wXj;
import o.C55119xdt;
import o.C55249xgQ;
import o.C55296xhK;
import o.C55326xho;
import o.C56391yDq;
import o.C56392yDr;
import o.C6993aZp;
import o.InterfaceC33525myB;
import o.InterfaceC33528myE;
import o.InterfaceC33530myG;
import o.InterfaceC56387yDm;
import o.mAO;
import o.mAQ;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ScannerActivity extends AbstractActivityC33483mxM {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public mAO AYXKKw;
    public InterfaceC33528myE AhwBna;
    public InterfaceC33525myB DbNXlk;

    @yCM
    public C33532myI cameraxUtil;
    public final ActivityResultLauncher<String> djBIcL;
    public final AbstractC55115xdp gEmmrt;
    public Job isConnected;
    public View valueOf;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.myd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ScannerActivity.AYXKKw(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.myc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ScannerActivity.djBIcL(this.KWHzl);
        }
    });

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.util.ScannerActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void start$default(Activity activity, Context context, List list, ScanConfig scanConfig, int i, Object obj) {
            Activity activity2;
            Context context2;
            List list2;
            ScanConfig scanConfig2;
            if ((i & 4) != 0) {
                scanConfig2 = new ScanConfig(false, null, null, null, null, false, null, false, false, null, false, null, 4095, null);
                activity2 = activity;
                context2 = context;
                list2 = list;
            } else {
                activity2 = activity;
                context2 = context;
                list2 = list;
                scanConfig2 = scanConfig;
            }
            activity2.KWHzl(context2, list2, scanConfig2);
        }

        public final void KWHzl(@NotNull Context context, @NotNull List<? extends ScanType> list, @NotNull ScanConfig scanConfig) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(scanConfig, "");
            OLrzqt(scanConfig.values());
            Intent intent = new Intent(context, (Class<?>) ScannerActivity.class);
            intent.putParcelableArrayListExtra("EXTRA_SCAN_TYPE", new ArrayList<>(list));
            intent.putExtra("EXTRA_SCAN_CONFIG", scanConfig);
            context.startActivity(intent);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivityResultContract getResultContract$default(Activity activity, ScanConfig scanConfig, List list, Bundle bundle, int i, Object obj) {
            Activity activity2;
            Bundle bundleBundleOf;
            ScanConfig scanConfig2 = (i & 1) != 0 ? new ScanConfig(false, null, null, null, null, false, null, false, false, null, false, null, 4095, null) : scanConfig;
            List listAhwBna = (i & 2) != 0 ? yDY.AhwBna() : list;
            if ((i & 4) != 0) {
                bundleBundleOf = BundleKt.bundleOf();
                activity2 = activity;
            } else {
                activity2 = activity;
                bundleBundleOf = bundle;
            }
            return activity2.OLrzqt(scanConfig2, listAhwBna, bundleBundleOf);
        }

        /* JADX INFO: renamed from: com.okinc.core.util.ScannerActivity$Activity$Activity, reason: collision with other inner class name */
        public static final class C0393Activity extends ActivityResultContract<Unit, String> {
            public final /* synthetic */ ScanConfig EZpvd;
            public final /* synthetic */ Bundle KWHzl;
            public final /* synthetic */ List<ScanType> copydefault;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.core.util.qrcode.decode.ScanType> */
            /* JADX WARN: Multi-variable type inference failed */
            public C0393Activity(List<? extends ScanType> list, ScanConfig scanConfig, Bundle bundle) {
                this.copydefault = list;
                this.EZpvd = scanConfig;
                this.KWHzl = bundle;
            }

            /* JADX DEBUG: Class process forced to load method for inline: com.okinc.core.util.model.ScanConfig.copy$default(com.okinc.core.util.model.ScanConfig, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, com.okinc.core.util.model.ScanViewType, boolean, com.okinc.core.util.model.MyCodeLanding, int, java.lang.Object):com.okinc.core.util.model.ScanConfig */
            /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
            @Override // androidx.activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, Unit unit) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(unit, "");
                Intent intent = new Intent(context, (Class<?>) ScannerActivity.class);
                List<ScanType> list = this.copydefault;
                ScanConfig scanConfig = this.EZpvd;
                Bundle bundle = this.KWHzl;
                intent.putParcelableArrayListExtra("EXTRA_SCAN_TYPE", new ArrayList<>(list));
                intent.putExtra("EXTRA_SCAN_CONFIG", scanConfig.OLrzqt((3967 & 1) != 0 ? scanConfig.AEQbTJ : false, (3967 & 2) != 0 ? scanConfig.values : null, (3967 & 4) != 0 ? scanConfig.DbNXlk : null, (3967 & 8) != 0 ? scanConfig.AYXKKw : null, (3967 & 16) != 0 ? scanConfig.AhwBna : null, (3967 & 32) != 0 ? scanConfig.copydefault : false, (3967 & 64) != 0 ? scanConfig.EZpvd : null, (3967 & 128) != 0 ? scanConfig.OLrzqt : true, (3967 & 256) != 0 ? scanConfig.gEmmrt : false, (3967 & 512) != 0 ? scanConfig.valueOf : null, (3967 & 1024) != 0 ? scanConfig.KWHzl : false, (3967 & 2048) != 0 ? scanConfig.djBIcL : null));
                intent.putExtra("EXTRA_SCAN_BUNDLE", bundle);
                return intent;
            }

            /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
            @Override // androidx.activity.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public String parseResult(int i, Intent intent) {
                String stringExtra;
                return (i != -1 || intent == null || (stringExtra = intent.getStringExtra("EXTRA_SCAN_RESULT")) == null) ? "" : stringExtra;
            }
        }

        public final ActivityResultContract<Unit, String> OLrzqt(@NotNull ScanConfig scanConfig, @NotNull List<? extends ScanType> list, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(scanConfig, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            OLrzqt(scanConfig.values());
            return new C0393Activity(list, scanConfig, bundle);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.okinc.core.util.ScannerActivity$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intent getIntent$default(Activity activity, Context context, List list, ScanConfig scanConfig, int i, Object obj) {
            Activity activity2;
            Context context2;
            List list2;
            ScanConfig scanConfig2;
            if ((i & 4) != 0) {
                scanConfig2 = new ScanConfig(false, null, null, null, null, false, null, false, false, null, false, null, 4095, null);
                activity2 = activity;
                context2 = context;
                list2 = list;
            } else {
                activity2 = activity;
                context2 = context;
                list2 = list;
                scanConfig2 = scanConfig;
            }
            return activity2.EZpvd(context2, list2, scanConfig2);
        }

        public final Intent EZpvd(@NotNull Context context, @NotNull List<? extends ScanType> list, @NotNull ScanConfig scanConfig) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(scanConfig, "");
            OLrzqt(scanConfig.values());
            Intent intent = new Intent(context, (Class<?>) ScannerActivity.class);
            intent.putParcelableArrayListExtra("EXTRA_SCAN_TYPE", new ArrayList<>(list));
            intent.putExtra("EXTRA_SCAN_CONFIG", scanConfig);
            return intent;
        }

        public final void OLrzqt(boolean z) {
            List listKWHzl = C43251rlk.KWHzl(InterfaceC33530myG.class);
            if (listKWHzl == null) {
                listKWHzl = yDY.AhwBna();
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listKWHzl) {
                if (hashSet.add(((InterfaceC33530myG) obj).KWHzl())) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != listKWHzl.size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : listKWHzl) {
                    ScanType scanTypeKWHzl = ((InterfaceC33530myG) obj2).KWHzl();
                    Object arrayList2 = linkedHashMap.get(scanTypeKWHzl);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(scanTypeKWHzl, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((List) entry.getValue()).size() > 1) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    pUU.copydefault("ScannerActivity", "ScanType " + ((Map.Entry) it.next()).getKey() + " is not unique");
                }
                if (z) {
                    throw new IllegalArgumentException("ScanType must be unique");
                }
            }
        }
    }

    public ScannerActivity() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: o.mye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ScannerActivity.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
        this.gEmmrt = C55119xdt.AEQbTJ.KWHzl(this, new ActivityResultCallback() { // from class: o.myf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ScannerActivity.OLrzqt(this.AEQbTJ, (android.net.Uri) obj);
            }
        });
    }

    public final List<ScanType> AhwBna() {
        return (List) this.values.getValue();
    }

    public static final List AYXKKw(ScannerActivity scannerActivity) {
        ArrayList parcelableArrayListExtra = scannerActivity.getIntent().getParcelableArrayListExtra("EXTRA_SCAN_TYPE");
        return parcelableArrayListExtra != null ? parcelableArrayListExtra : yDY.AhwBna();
    }

    /* JADX DEBUG: Possible override for method o.mxM.valueOf()V */
    public final ScanConfig valueOf() {
        return (ScanConfig) this.AkhnZx.getValue();
    }

    public static final ScanConfig djBIcL(ScannerActivity scannerActivity) {
        ScanConfig scanConfig = (ScanConfig) scannerActivity.getIntent().getParcelableExtra("EXTRA_SCAN_CONFIG");
        return scanConfig == null ? new ScanConfig(false, null, null, null, null, false, null, false, false, null, false, null, 4095, null) : scanConfig;
    }

    public static final void OLrzqt(ScannerActivity scannerActivity, Boolean bool) {
        scannerActivity.djBIcL();
    }

    public static final void OLrzqt(final ScannerActivity scannerActivity, Uri uri) {
        Object objM7377constructorimpl;
        if (uri != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(BitmapFactory.decodeStream(scannerActivity.getContentResolver().openInputStream(uri)));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            Bitmap bitmap = (Bitmap) objM7377constructorimpl;
            if (bitmap == null) {
                return;
            }
            C6993aZp.KWHzl.copydefault(bitmap, new Function1() { // from class: o.myn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ScannerActivity.KWHzl(this.copydefault, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(ScannerActivity scannerActivity, String str) {
        if (scannerActivity.isDestroyed()) {
            return Unit.INSTANCE;
        }
        if (str != null) {
            scannerActivity.AEQbTJ(str);
        } else {
            C55326xho.toastWithFailedIcon$default(mAQ.Activity.valueOf, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.mxM.EZpvd()V */
    public final C33532myI EZpvd() {
        C33532myI c33532myI = this.cameraxUtil;
        if (c33532myI != null) {
            return c33532myI;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ScannerActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, ScannerActivity scannerActivity) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = scannerActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.finish();
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.onEvent$default("app_qr_back_click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ScannerActivity EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, ScannerActivity scannerActivity) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = scannerActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.gEmmrt.KWHzl();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ ScannerActivity KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, ScannerActivity scannerActivity) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = scannerActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.KWHzl.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    this.KWHzl.values();
                } else {
                    this.KWHzl.getPermissionHelper().KWHzl(this.KWHzl);
                }
            }
        }
    }

    @Override // o.AbstractActivityC33483mxM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mAO maoOLrzqt = mAO.OLrzqt(getLayoutInflater());
        this.AYXKKw = maoOLrzqt;
        if (maoOLrzqt == null) {
            Intrinsics.gEmmrt("");
            maoOLrzqt = null;
        }
        setContentView(maoOLrzqt.getRoot());
        AYXKKw();
        gEmmrt();
        fetchVPNInfo();
        if (AkhnZx() && !DbNXlk()) {
            values();
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("app_qr_page_view", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
    }

    public final void AYXKKw() {
        InterfaceC33528myE interfaceC33528myE;
        Object next;
        mAO mao = null;
        if (valueOf().AEQbTJ() != null) {
            List listKWHzl = C43251rlk.KWHzl(InterfaceC33528myE.class);
            if (listKWHzl != null) {
                Iterator it = listKWHzl.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((InterfaceC33528myE) next).copydefault(), (Object) valueOf().AEQbTJ())) {
                            break;
                        }
                    }
                }
                interfaceC33528myE = (InterfaceC33528myE) next;
            } else {
                interfaceC33528myE = null;
            }
            this.AhwBna = interfaceC33528myE;
            if (interfaceC33528myE != null) {
                mAO mao2 = this.AYXKKw;
                if (mao2 == null) {
                    Intrinsics.gEmmrt("");
                    mao2 = null;
                }
                mao2.KWHzl.removeAllViews();
                LayoutInflater layoutInflater = getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                mAO mao3 = this.AYXKKw;
                if (mao3 == null) {
                    Intrinsics.gEmmrt("");
                    mao3 = null;
                }
                LinearLayout linearLayout = mao3.KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                this.valueOf = interfaceC33528myE.AEQbTJ(layoutInflater, linearLayout);
                mAO mao4 = this.AYXKKw;
                if (mao4 == null) {
                    Intrinsics.gEmmrt("");
                    mao4 = null;
                }
                mao4.KWHzl.addView(this.valueOf);
                View view = this.valueOf;
                if (view != null) {
                    interfaceC33528myE.EZpvd(view);
                }
            }
        }
        if (valueOf().DbNXlk()) {
            List listKWHzl2 = C43251rlk.KWHzl(InterfaceC33525myB.class);
            InterfaceC33525myB interfaceC33525myB = listKWHzl2 != null ? (InterfaceC33525myB) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl2) : null;
            this.DbNXlk = interfaceC33525myB;
            if (interfaceC33525myB != null) {
                LayoutInflater layoutInflater2 = getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
                Fragment fragmentKWHzl = interfaceC33525myB.KWHzl(layoutInflater2, valueOf());
                if (fragmentKWHzl != null) {
                    FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                    fragmentTransactionBeginTransaction.replace(mAQ.TaskDescription.values, fragmentKWHzl);
                    fragmentTransactionBeginTransaction.commit();
                    C32866mlf.onEvent$default("UserCenter_UserProfileInfo_Scanswitch_View", (TrackChannel[]) null, new Function1() { // from class: o.myi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ScannerActivity.KWHzl((EventParamsList) obj);
                        }
                    }, 1, (Object) null);
                    int i = valueOf().OLrzqt() == MyCodeLanding.PAY_ONLY ? mAQ.Activity.djBIcL : mAQ.Activity.copydefault;
                    mAO mao5 = this.AYXKKw;
                    if (mao5 == null) {
                        Intrinsics.gEmmrt("");
                        mao5 = null;
                    }
                    C55249xgQ c55249xgQ = mao5.isConnected;
                    c55249xgQ.addTab(c55249xgQ.newTab().setText(mAQ.Activity.AEQbTJ).setContentDescription("Scan"));
                    c55249xgQ.addTab(c55249xgQ.newTab().setText(i).setContentDescription("My code"));
                    c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription());
                    mAO mao6 = this.AYXKKw;
                    if (mao6 == null) {
                        Intrinsics.gEmmrt("");
                        mao6 = null;
                    }
                    C55249xgQ c55249xgQ2 = mao6.isConnected;
                    Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
                    c55249xgQ2.setVisibility(0);
                    mAO mao7 = this.AYXKKw;
                    if (mao7 == null) {
                        Intrinsics.gEmmrt("");
                        mao7 = null;
                    }
                    TextView textView = mao7.fIwbmz;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(8);
                    if (valueOf().KWHzl() == ScanViewType.QR_CODE) {
                        mAO mao8 = this.AYXKKw;
                        if (mao8 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            mao = mao8;
                        }
                        TabLayout.Tab tabAt = mao.isConnected.getTabAt(1);
                        if (tabAt != null) {
                            tabAt.select();
                        }
                    }
                }
            }
        }
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            mAO mao = null;
            if (tab != null && tab.getPosition() == 0) {
                C32866mlf.onEvent$default("UserCenter_UserProfileInfo_Scan_Click", (TrackChannel[]) null, new Function1() { // from class: o.myk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ScannerActivity.TaskDescription.copydefault((EventParamsList) obj);
                    }
                }, 1, (Object) null);
                mAO mao2 = ScannerActivity.this.AYXKKw;
                if (mao2 == null) {
                    Intrinsics.gEmmrt("");
                    mao2 = null;
                }
                mao2.gEmmrt.setImageTintList(ContextCompat.getColorStateList(ScannerActivity.this, C52761wXj.Activity.zblBkD));
                mAO mao3 = ScannerActivity.this.AYXKKw;
                if (mao3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    mao = mao3;
                }
                ConstraintLayout constraintLayout = mao.values;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(8);
                InterfaceC33525myB interfaceC33525myB = ScannerActivity.this.DbNXlk;
                if (interfaceC33525myB != null) {
                    interfaceC33525myB.copydefault(ScannerActivity.this);
                }
                if (ScannerActivity.this.DbNXlk()) {
                    ScannerActivity.this.djBIcL();
                    return;
                } else {
                    ScannerActivity.this.values();
                    return;
                }
            }
            C32866mlf.onEvent$default("UserCenter_UserProfileInfo_Scan_Click", (TrackChannel[]) null, new Function1() { // from class: o.myj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ScannerActivity.TaskDescription.OLrzqt((EventParamsList) obj);
                }
            }, 1, (Object) null);
            mAO mao4 = ScannerActivity.this.AYXKKw;
            if (mao4 == null) {
                Intrinsics.gEmmrt("");
                mao4 = null;
            }
            mao4.gEmmrt.setImageTintList(ContextCompat.getColorStateList(ScannerActivity.this, C52761wXj.Activity.fdOvFl));
            mAO mao5 = ScannerActivity.this.AYXKKw;
            if (mao5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                mao = mao5;
            }
            ConstraintLayout constraintLayout2 = mao.values;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            InterfaceC33525myB interfaceC33525myB2 = ScannerActivity.this.DbNXlk;
            if (interfaceC33525myB2 != null) {
                interfaceC33525myB2.EZpvd(ScannerActivity.this);
            }
            ScannerActivity.this.EZpvd().copydefault();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "scan", false, 4, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "myqr", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        isConnected();
        mAO mao = null;
        updateLaserState$default(this, false, null, 2, null);
        mAO mao2 = this.AYXKKw;
        if (mao2 == null) {
            Intrinsics.gEmmrt("");
            mao2 = null;
        }
        ConstraintLayout constraintLayout = mao2.fARcdN;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), C33570myu.gEmmrt(this), constraintLayout.getPaddingEnd(), constraintLayout.getPaddingBottom());
        mAO mao3 = this.AYXKKw;
        if (mao3 == null) {
            Intrinsics.gEmmrt("");
            mao3 = null;
        }
        mao3.fIwbmz.setText(valueOf().AYXKKw());
        mAO mao4 = this.AYXKKw;
        if (mao4 == null) {
            Intrinsics.gEmmrt("");
            mao4 = null;
        }
        LinearLayout linearLayout = mao4.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(valueOf().gEmmrt() ^ true ? 4 : 0);
        mAO mao5 = this.AYXKKw;
        if (mao5 == null) {
            Intrinsics.gEmmrt("");
            mao5 = null;
        }
        TextView textView = mao5.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(valueOf().valueOf().length() <= 0 ? 8 : 0);
        mAO mao6 = this.AYXKKw;
        if (mao6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            mao = mao6;
        }
        mao.ejfBZ.setText(valueOf().valueOf());
    }

    public static final class PendingIntent implements ViewTreeObserver.OnGlobalLayoutListener {
        public PendingIntent() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            mAO mao = ScannerActivity.this.AYXKKw;
            mAO mao2 = null;
            if (mao == null) {
                Intrinsics.gEmmrt("");
                mao = null;
            }
            mao.AkhnZx.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            mAO mao3 = ScannerActivity.this.AYXKKw;
            if (mao3 == null) {
                Intrinsics.gEmmrt("");
                mao3 = null;
            }
            C33524myA c33524myA = mao3.valueOf;
            mAO mao4 = ScannerActivity.this.AYXKKw;
            if (mao4 == null) {
                Intrinsics.gEmmrt("");
                mao4 = null;
            }
            int left = mao4.AkhnZx.getLeft();
            mAO mao5 = ScannerActivity.this.AYXKKw;
            if (mao5 == null) {
                Intrinsics.gEmmrt("");
                mao5 = null;
            }
            int top = mao5.AkhnZx.getTop();
            mAO mao6 = ScannerActivity.this.AYXKKw;
            if (mao6 == null) {
                Intrinsics.gEmmrt("");
                mao6 = null;
            }
            int right = mao6.AkhnZx.getRight();
            mAO mao7 = ScannerActivity.this.AYXKKw;
            if (mao7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                mao2 = mao7;
            }
            c33524myA.setTargetPosition(left, top, right, mao2.AkhnZx.getBottom());
        }
    }

    public final void isConnected() {
        PendingIntent pendingIntent = new PendingIntent();
        mAO mao = this.AYXKKw;
        if (mao == null) {
            Intrinsics.gEmmrt("");
            mao = null;
        }
        mao.AkhnZx.getViewTreeObserver().addOnGlobalLayoutListener(pendingIntent);
    }

    private final void fetchVPNInfo() {
        mAO mao = this.AYXKKw;
        mAO mao2 = null;
        if (mao == null) {
            Intrinsics.gEmmrt("");
            mao = null;
        }
        ImageView imageView = mao.gEmmrt;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        mAO mao3 = this.AYXKKw;
        if (mao3 == null) {
            Intrinsics.gEmmrt("");
            mao3 = null;
        }
        LinearLayout linearLayout = mao3.copydefault;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
        mAO mao4 = this.AYXKKw;
        if (mao4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            mao2 = mao4;
        }
        Button button = mao2.EZpvd;
        button.setOnClickListener(new StateListAnimator(button, 1000L, this));
    }

    public static /* synthetic */ void updateLaserState$default(ScannerActivity scannerActivity, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        scannerActivity.AEQbTJ(z, str);
    }

    public final void AEQbTJ(boolean z, String str) {
        int color = ContextCompat.getColor(this, z ? C52761wXj.Activity.ihnvzI : C52761wXj.Activity.WS);
        mAO mao = this.AYXKKw;
        mAO mao2 = null;
        if (mao == null) {
            Intrinsics.gEmmrt("");
            mao = null;
        }
        mao.valueOf.setError(z);
        mAO mao3 = this.AYXKKw;
        if (mao3 == null) {
            Intrinsics.gEmmrt("");
            mao3 = null;
        }
        mao3.fJNWhG.setTextColor(color);
        mAO mao4 = this.AYXKKw;
        if (mao4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            mao2 = mao4;
        }
        TextView textView = mao2.fJNWhG;
        if (!z) {
            str = valueOf().copydefault();
        } else if (str == null) {
            str = valueOf().EZpvd();
        }
        textView.setText(str);
    }

    public final boolean DbNXlk() {
        return ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0;
    }

    public final void values() {
        this.djBIcL.launch("android.permission.CAMERA");
    }

    public final void djBIcL() {
        if (AkhnZx()) {
            boolean zDbNXlk = DbNXlk();
            mAO mao = this.AYXKKw;
            mAO mao2 = null;
            if (mao == null) {
                Intrinsics.gEmmrt("");
                mao = null;
            }
            ConstraintLayout constraintLayout = mao.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(zDbNXlk ? 4 : 0);
            mAO mao3 = this.AYXKKw;
            if (mao3 == null) {
                Intrinsics.gEmmrt("");
                mao3 = null;
            }
            PreviewView previewView = mao3.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(previewView, "");
            previewView.setVisibility(zDbNXlk ? 0 : 8);
            mAO mao4 = this.AYXKKw;
            if (mao4 == null) {
                Intrinsics.gEmmrt("");
                mao4 = null;
            }
            TextView textView = mao4.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility((zDbNXlk && this.valueOf == null) ? 0 : 8);
            mAO mao5 = this.AYXKKw;
            if (mao5 == null) {
                Intrinsics.gEmmrt("");
                mao5 = null;
            }
            LinearLayout linearLayout = mao5.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility((!zDbNXlk || this.valueOf == null) ? 8 : 0);
            mAO mao6 = this.AYXKKw;
            if (mao6 == null) {
                Intrinsics.gEmmrt("");
                mao6 = null;
            }
            C33524myA c33524myA = mao6.valueOf;
            Intrinsics.checkNotNullExpressionValue(c33524myA, "");
            c33524myA.setVisibility(zDbNXlk ? 0 : 8);
            mAO mao7 = this.AYXKKw;
            if (mao7 == null) {
                Intrinsics.gEmmrt("");
                mao7 = null;
            }
            mao7.getRoot().setBackgroundColor(ContextCompat.getColor(this, zDbNXlk ? C52761wXj.Activity.aBDePw : C52761wXj.Activity.valueOf));
            if (zDbNXlk) {
                C33532myI c33532myIEZpvd = EZpvd();
                mAO mao8 = this.AYXKKw;
                if (mao8 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    mao2 = mao8;
                }
                PreviewView previewView2 = mao2.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(previewView2, "");
                c33532myIEZpvd.OLrzqt(this, previewView2, new Function1() { // from class: o.myg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ScannerActivity.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
                    }
                });
            }
        }
    }

    public static final Unit AEQbTJ(final ScannerActivity scannerActivity, final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        scannerActivity.runOnUiThread(new Runnable() { // from class: o.myh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ScannerActivity.KWHzl(str, scannerActivity);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(String str, ScannerActivity scannerActivity) {
        pUU.KWHzl("ScannerActivity", "QRCode Result: " + str);
        scannerActivity.AEQbTJ(str);
    }

    public final void AEQbTJ(String str) {
        Bundle bundleBundleOf;
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return;
        }
        if (this.AhwBna != null) {
            View view = this.valueOf;
            if (view != null) {
                pUU.KWHzl("ScannerActivity", "CustomViewExtension onData: " + str);
                InterfaceC33528myE interfaceC33528myE = this.AhwBna;
                if (interfaceC33528myE != null) {
                    Intent intent = getIntent();
                    if (intent == null || (bundleBundleOf = intent.getBundleExtra("EXTRA_SCAN_BUNDLE")) == null) {
                        bundleBundleOf = BundleKt.bundleOf();
                    }
                    interfaceC33528myE.OLrzqt(this, str, view, bundleBundleOf);
                }
                if (valueOf().djBIcL()) {
                    EZpvd().KWHzl();
                    return;
                }
                return;
            }
            return;
        }
        if (valueOf().AhwBna()) {
            pUU.KWHzl("ScannerActivity", "isActivityResult onData: " + str);
            if (AhwBna().isEmpty()) {
                KWHzl(str);
                return;
            } else if (OLrzqt(str) != null) {
                KWHzl(str);
                return;
            } else {
                onContentFailToHandle$default(this, null, 1, null);
                return;
            }
        }
        pUU.KWHzl("ScannerActivity", "Extensions onData: " + str);
        InterfaceC33530myG interfaceC33530myGOLrzqt = OLrzqt(str);
        if (interfaceC33530myGOLrzqt != null) {
            pUU.KWHzl("ScannerActivity", "target Extension : " + interfaceC33530myGOLrzqt);
            updateLaserState$default(this, false, null, 2, null);
            interfaceC33530myGOLrzqt.KWHzl(this, str);
            if (valueOf().djBIcL()) {
                EZpvd().KWHzl();
                return;
            }
            return;
        }
        onContentFailToHandle$default(this, null, 1, null);
    }

    public final void KWHzl(String str) {
        Bundle bundleExtra;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SCAN_RESULT", str);
        Intent intent2 = getIntent();
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("EXTRA_SCAN_BUNDLE")) != null) {
            intent.putExtra("EXTRA_SCAN_BUNDLE", bundleExtra);
        }
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    public final InterfaceC33530myG OLrzqt(String str) {
        Object obj;
        List listKWHzl = C43251rlk.KWHzl(InterfaceC33530myG.class);
        List<ScanType> listAhwBna = AhwBna();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAhwBna.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            ScanType scanType = (ScanType) it.next();
            if (listKWHzl != null) {
                Iterator it2 = listKWHzl.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((InterfaceC33530myG) next).KWHzl() == scanType) {
                        obj = next;
                        break;
                    }
                }
                obj = (InterfaceC33530myG) obj;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (((InterfaceC33530myG) next2).copydefault(this, str)) {
                obj = next2;
                break;
            }
        }
        return (InterfaceC33530myG) obj;
    }

    public static /* synthetic */ void onContentFailToHandle$default(ScannerActivity scannerActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scannerActivity.EZpvd(str);
    }

    public final void EZpvd(String str) {
        AEQbTJ(true, str);
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.isConnected = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ScannerActivity$onContentFailToHandle$1(this, null), 3, null);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("app_qr_error_non_okex_code", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
    }

    public final boolean AkhnZx() {
        mAO mao = this.AYXKKw;
        if (mao == null) {
            Intrinsics.gEmmrt("");
            mao = null;
        }
        ConstraintLayout constraintLayout = mao.values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return !(constraintLayout.getVisibility() == 0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.core.splashscreen.SplashScreen$Impl31$$ExternalSyntheticApiModelOutline4.m(android.view.Window, boolean):void */
    /* JADX DEBUG: Class process forced to load method for inline: androidx.core.splashscreen.SplashScreen$Impl31$$ExternalSyntheticApiModelOutline5.m(android.view.Window, boolean):void */
    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        boolean z = !C33492mxV.OLrzqt();
        C33567myr.AEQbTJ(this, z);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    @Override // o.AbstractActivityC33483mxM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        InterfaceC33525myB interfaceC33525myB;
        super.onResume();
        djBIcL();
        if (AkhnZx() || (interfaceC33525myB = this.DbNXlk) == null) {
            return;
        }
        interfaceC33525myB.EZpvd(this);
    }

    @Override // o.AbstractActivityC33483mxM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        InterfaceC33525myB interfaceC33525myB;
        super.onPause();
        if (AkhnZx() || (interfaceC33525myB = this.DbNXlk) == null) {
            return;
        }
        interfaceC33525myB.copydefault(this);
    }

    @Override // o.AbstractActivityC33483mxM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EZpvd().copydefault();
        EZpvd().OLrzqt();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        djBIcL();
        pUU.KWHzl("ScannerActivity", "onConfigurationChanged: " + configuration);
        isConnected();
    }

    @Override // o.AbstractActivityC33483mxM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33483mxM, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
