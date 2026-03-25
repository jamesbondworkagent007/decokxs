package o;

import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.google.common.util.concurrent.ListenableFuture;
import com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean;
import com.okinc.ok_kyc_core.camera.PreviewerMode;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;
import pub.devrel.easypermissions.AppSettingsDialog;

/* JADX INFO: renamed from: o.rtW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityC43661rtW extends AbstractActivityC33044moy<AbstractC43751rvG> {
    public final java.lang.String[] AhwBna;
    public long AkhnZx;
    public java.io.File AuCTel;
    public ImageCapture DbNXlk;
    public PreviewView ejfBZ;
    public Preview fARcdN;
    public final Function1<java.lang.String[], Unit> fIwbmz;
    public InterfaceC55124xdy fJNWhG;
    public androidx.camera.core.Camera fetchVPNInfo;
    public POACameraGalleryOutputBean gEmmrt;
    public AbstractC55115xdp isConnected;
    public final ActivityResultLauncher<android.content.Intent> uzCIH;
    public final ExecutorService valueOf;
    public ProcessCameraProvider values;
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static double OLrzqt = 1.3333333333333333d;
    public static double AEQbTJ = 1.7777777777777777d;
    public static boolean djBIcL = true;
    public static int EZpvd = 1;
    public static java.lang.String[] AYXKKw = new java.lang.String[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return C43662rtX.TaskDescription.EZpvd;
    }

    public ActivityC43661rtW() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "");
        this.valueOf = executorServiceNewCachedThreadPool;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.ruj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC43661rtW.OLrzqt(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.uzCIH = activityResultLauncherRegisterForActivityResult;
        this.fIwbmz = new Function1() { // from class: o.ruf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC43661rtW.copydefault(this.AEQbTJ, (java.lang.String[]) obj);
            }
        };
        java.util.List listAhwBna = yDY.AhwBna("android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE");
        if (Build.VERSION.SDK_INT <= 28) {
            listAhwBna.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        this.AhwBna = (java.lang.String[]) listAhwBna.toArray(new java.lang.String[0]);
    }

    /* JADX INFO: renamed from: o.rtW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rtW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, java.lang.Integer> map, @NotNull java.lang.String[] strArr, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(activityResultLauncher, "");
            try {
                java.lang.Integer num = map.get("SHOULD_SHOW_FILE_SELECTOR");
                ActivityC43661rtW.djBIcL = num != null && num.intValue() == 1;
                java.lang.Integer num2 = map.get("LIMIT");
                if (num2 != null && 1 <= (iIntValue = num2.intValue()) && iIntValue < 10) {
                    Activity activity = ActivityC43661rtW.Companion;
                    ActivityC43661rtW.EZpvd = iIntValue;
                }
                if (!(strArr.length == 0)) {
                    ActivityC43661rtW.AYXKKw = strArr;
                }
                activityResultLauncher.launch(new android.content.Intent(context, (java.lang.Class<?>) ActivityC43661rtW.class));
            } catch (java.lang.Exception e) {
                pUU.copydefault("NotificationServiceExtension", "launcher error=" + e);
            }
        }
    }

    public final void copydefault(POACameraGalleryOutputBean pOACameraGalleryOutputBean) {
        this.gEmmrt = pOACameraGalleryOutputBean;
        if (pOACameraGalleryOutputBean != null) {
            OLrzqt(pOACameraGalleryOutputBean, PreviewerMode.Camera);
        }
    }

    public static final void OLrzqt(ActivityC43661rtW activityC43661rtW, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent intent = new android.content.Intent();
            android.content.Intent data = activityResult.getData();
            activityC43661rtW.setResult(-1, intent.putParcelableArrayListExtra(POACameraGalleryOutputBean.KEY, data != null ? data.getParcelableArrayListExtra(POACameraGalleryOutputBean.KEY) : null));
            activityC43661rtW.OLrzqt();
        }
    }

    public final void OLrzqt(POACameraGalleryOutputBean pOACameraGalleryOutputBean, PreviewerMode previewerMode) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) ActivityC43724rug.class);
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("FileName", pOACameraGalleryOutputBean.getFileName());
        pairArr[1] = C56390yDp.OLrzqt("FileType", previewerMode == PreviewerMode.DirectShow ? "application/pdf" : "image/*");
        pairArr[2] = C56390yDp.OLrzqt("URI", pOACameraGalleryOutputBean.getUri().toString());
        pairArr[3] = C56390yDp.OLrzqt("PreviewerMode", previewerMode.name());
        intent.putExtras(BundleKt.bundleOf(pairArr));
        this.uzCIH.launch(intent);
    }

    public final java.io.File AYXKKw() {
        java.io.File file;
        java.io.File[] externalMediaDirs = getExternalMediaDirs();
        Intrinsics.checkNotNullExpressionValue(externalMediaDirs, "");
        java.io.File file2 = (java.io.File) yDV.zsXlph(externalMediaDirs);
        if (file2 != null) {
            file = new java.io.File(file2, "OKX_POA");
            file.mkdirs();
        } else {
            file = null;
        }
        if (file != null && file.exists()) {
            return file;
        }
        java.io.File filesDir = getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "");
        return filesDir;
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        fetchVPNInfo();
        this.fJNWhG = InterfaceC55124xdy.Companion.EZpvd(this);
        this.AuCTel = AYXKKw();
        overridePendingTransition(C32113mPz.Activity.KWHzl, 0);
        ActivityCompat.requestPermissions(this, this.AhwBna, 102);
    }

    private final void fetchVPNInfo() {
        if (EZpvd == 1) {
            this.isConnected = C55119xdt.AEQbTJ.KWHzl(this, new ActivityResultCallback() { // from class: o.ruc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    ActivityC43661rtW.KWHzl(this.KWHzl, (android.net.Uri) obj);
                }
            });
        } else {
            this.isConnected = C55119xdt.AEQbTJ.KWHzl(this, java.lang.Integer.valueOf(EZpvd), new ActivityResultCallback() { // from class: o.rue
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    ActivityC43661rtW.copydefault(this.copydefault, (java.util.List) obj);
                }
            });
        }
        AbstractC43751rvG abstractC43751rvGKWHzl = KWHzl();
        if (djBIcL) {
            abstractC43751rvGKWHzl.AhwBna.setVisibility(0);
        } else {
            abstractC43751rvGKWHzl.AhwBna.setVisibility(8);
            android.widget.LinearLayout linearLayout = abstractC43751rvGKWHzl.djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C55298xhM.dp2px$default(16.0f, null, 1, null);
                marginLayoutParams.bottomMargin = C55298xhM.dp2px$default(16.0f, null, 1, null);
                linearLayout.setLayoutParams(marginLayoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        abstractC43751rvGKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43661rtW.OLrzqt(this.copydefault, view);
            }
        });
        abstractC43751rvGKWHzl.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.rua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43661rtW.AhwBna(this.copydefault, view);
            }
        });
        abstractC43751rvGKWHzl.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.rud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43661rtW.AYXKKw(this.EZpvd, view);
            }
        });
        abstractC43751rvGKWHzl.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.ruh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC43661rtW.djBIcL(this.KWHzl, view);
            }
        });
    }

    public static final void KWHzl(ActivityC43661rtW activityC43661rtW, android.net.Uri uri) {
        activityC43661rtW.overridePendingTransition(0, C32113mPz.Activity.AEQbTJ);
        if (uri != null) {
            activityC43661rtW.setResult(-1, new android.content.Intent().putParcelableArrayListExtra(POACameraGalleryOutputBean.KEY, yDY.copydefault(new POACameraGalleryOutputBean(uri, activityC43661rtW.AEQbTJ(uri, true), "image/*"))));
            activityC43661rtW.OLrzqt();
        }
    }

    public static final void copydefault(ActivityC43661rtW activityC43661rtW, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        activityC43661rtW.overridePendingTransition(0, C32113mPz.Activity.AEQbTJ);
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.net.Uri uri = (android.net.Uri) it.next();
                arrayList.add(new POACameraGalleryOutputBean(uri, activityC43661rtW.AEQbTJ(uri, true), "image/*"));
            }
            activityC43661rtW.setResult(-1, new android.content.Intent().putParcelableArrayListExtra(POACameraGalleryOutputBean.KEY, new java.util.ArrayList<>(arrayList)));
            activityC43661rtW.OLrzqt();
        }
    }

    public static final void OLrzqt(ActivityC43661rtW activityC43661rtW, android.view.View view) {
        activityC43661rtW.OLrzqt();
    }

    public static final void AhwBna(ActivityC43661rtW activityC43661rtW, android.view.View view) {
        if (android.os.SystemClock.elapsedRealtime() - activityC43661rtW.AkhnZx < 1000) {
            return;
        }
        activityC43661rtW.AkhnZx = android.os.SystemClock.elapsedRealtime();
        AbstractC55115xdp abstractC55115xdp = activityC43661rtW.isConnected;
        if (abstractC55115xdp == null) {
            Intrinsics.gEmmrt("");
            abstractC55115xdp = null;
        }
        abstractC55115xdp.KWHzl();
        activityC43661rtW.overridePendingTransition(C32113mPz.Activity.KWHzl, 0);
    }

    public static final void AYXKKw(ActivityC43661rtW activityC43661rtW, android.view.View view) {
        activityC43661rtW.djBIcL();
    }

    public static final void djBIcL(ActivityC43661rtW activityC43661rtW, android.view.View view) {
        activityC43661rtW.gEmmrt();
    }

    @Override // o.AbstractActivityC33041mov, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 102) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                valueOf();
            } else {
                this.fIwbmz.invoke(strArr);
            }
        }
    }

    public static final Unit copydefault(ActivityC43661rtW activityC43661rtW, java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        activityC43661rtW.OLrzqt();
        new AppSettingsDialog.ActionBar(activityC43661rtW).AEQbTJ().AEQbTJ();
        pUU.copydefault(activityC43661rtW.getTAG(), "Account Grant Camera Permissions Denied");
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        Function1<? super android.net.Uri, Unit> function1 = new Function1() { // from class: o.rtV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC43661rtW.EZpvd(this.OLrzqt, (android.net.Uri) obj);
            }
        };
        InterfaceC55124xdy interfaceC55124xdy = this.fJNWhG;
        if (interfaceC55124xdy == null) {
            Intrinsics.gEmmrt("");
            interfaceC55124xdy = null;
        }
        interfaceC55124xdy.EZpvd(this, AYXKKw, function1);
    }

    public static final Unit EZpvd(ActivityC43661rtW activityC43661rtW, android.net.Uri uri) {
        if (uri != null) {
            pUU.KWHzl(activityC43661rtW.getTAG(), "File picked | path = " + uri);
            java.lang.String filenameByUri$default = getFilenameByUri$default(activityC43661rtW, uri, false, 2, null);
            java.lang.String type = activityC43661rtW.getContentResolver().getType(uri);
            if (type == null) {
                type = "*/*";
            }
            POACameraGalleryOutputBean pOACameraGalleryOutputBean = new POACameraGalleryOutputBean(uri, filenameByUri$default, type);
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra(POACameraGalleryOutputBean.KEY, yDY.copydefault(pOACameraGalleryOutputBean));
            Unit unit = Unit.INSTANCE;
            activityC43661rtW.setResult(-1, intent);
            activityC43661rtW.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        finish();
        overridePendingTransition(0, C32113mPz.Activity.AEQbTJ);
    }

    public static /* synthetic */ java.lang.String getFilenameByUri$default(ActivityC43661rtW activityC43661rtW, android.net.Uri uri, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return activityC43661rtW.AEQbTJ(uri, z);
    }

    public final java.lang.String AEQbTJ(android.net.Uri uri, boolean z) {
        java.util.List listSplit$default;
        java.lang.String str;
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "FILE";
        }
        java.lang.String strKWHzl = C42462rTt.AEQbTJ.KWHzl(this, uri, z);
        return (strKWHzl == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strKWHzl, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null)) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AubY(listSplit$default)) == null) ? lastPathSegment : str;
    }

    public final void gEmmrt() {
        ImageCapture imageCapture = this.DbNXlk;
        if (imageCapture == null) {
            return;
        }
        java.lang.String str = "OKX_POA_" + new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", java.util.Locale.getDefault()).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (Build.VERSION.SDK_INT >= 29) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("relative_path", "Pictures/CameraX-Image");
            ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues).build();
            Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "");
            imageCapture.lambda$takePicture$2(outputFileOptionsBuild, ContextCompat.getMainExecutor(this), new Application());
            return;
        }
        java.io.File file = this.AuCTel;
        if (file == null) {
            Intrinsics.gEmmrt("");
            file = null;
        }
        java.io.File file2 = new java.io.File(file, str + ".jpg");
        ImageCapture.OutputFileOptions outputFileOptionsBuild2 = new ImageCapture.OutputFileOptions.Builder(file2).build();
        Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild2, "");
        imageCapture.lambda$takePicture$2(outputFileOptionsBuild2, ContextCompat.getMainExecutor(this), new TaskDescription(file2, this));
    }

    /* JADX INFO: renamed from: o.rtW$Application */
    public static final class Application implements ImageCapture.OnImageSavedCallback {
        public Application() {
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "");
            android.net.Uri savedUri = outputFileResults.getSavedUri();
            Intrinsics.copydefault(savedUri);
            ActivityC43661rtW activityC43661rtW = ActivityC43661rtW.this;
            activityC43661rtW.copydefault(new POACameraGalleryOutputBean(savedUri, ActivityC43661rtW.getFilenameByUri$default(activityC43661rtW, savedUri, false, 2, null), "image/*"));
            pUU.KWHzl(ActivityC43661rtW.this.getTAG(), "Photo capture succeeded from MediaStore: " + savedUri);
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(ImageCaptureException imageCaptureException) {
            Intrinsics.checkNotNullParameter(imageCaptureException, "");
            pUU.AEQbTJ(ActivityC43661rtW.this.getTAG(), "Photo capture failed: " + imageCaptureException.getMessage(), imageCaptureException);
        }
    }

    /* JADX INFO: renamed from: o.rtW$TaskDescription */
    public static final class TaskDescription implements ImageCapture.OnImageSavedCallback {
        public final /* synthetic */ ActivityC43661rtW AEQbTJ;
        public final /* synthetic */ java.io.File KWHzl;

        public TaskDescription(java.io.File file, ActivityC43661rtW activityC43661rtW) {
            this.KWHzl = file;
            this.AEQbTJ = activityC43661rtW;
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "");
            android.net.Uri savedUri = outputFileResults.getSavedUri();
            if (savedUri == null) {
                savedUri = android.net.Uri.fromFile(this.KWHzl);
            }
            ActivityC43661rtW activityC43661rtW = this.AEQbTJ;
            Intrinsics.copydefault(savedUri);
            activityC43661rtW.copydefault(new POACameraGalleryOutputBean(savedUri, ActivityC43661rtW.getFilenameByUri$default(this.AEQbTJ, savedUri, false, 2, null), "image/*"));
            pUU.KWHzl(this.AEQbTJ.getTAG(), "Photo capture succeeded from File: " + savedUri);
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(ImageCaptureException imageCaptureException) {
            Intrinsics.checkNotNullParameter(imageCaptureException, "");
            pUU.AEQbTJ(this.AEQbTJ.getTAG(), "Photo capture failed: " + imageCaptureException.getMessage(), imageCaptureException);
        }
    }

    public final void valueOf() {
        this.ejfBZ = KWHzl().AYXKKw;
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(this);
        companion.addListener(new java.lang.Runnable() { // from class: o.rtY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC43661rtW.AEQbTJ(this.KWHzl, companion);
            }
        }, ContextCompat.getMainExecutor(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(ActivityC43661rtW activityC43661rtW, ListenableFuture listenableFuture) {
        if (activityC43661rtW.isDestroyed() || activityC43661rtW.isFinishing()) {
            return;
        }
        try {
            activityC43661rtW.values = (ProcessCameraProvider) listenableFuture.get();
            activityC43661rtW.EZpvd();
        } catch (java.lang.Exception e) {
            pUU.copydefault(activityC43661rtW.getTAG(), "createCamera error=" + e);
        }
    }

    public final void EZpvd() {
        if (this.values != null) {
            pUU.KWHzl(getTAG(), "bindAllCameraUseCases start");
            ProcessCameraProvider processCameraProvider = this.values;
            Intrinsics.copydefault(processCameraProvider);
            processCameraProvider.unbindAll();
            copydefault();
        }
    }

    public final void copydefault() {
        ProcessCameraProvider processCameraProvider = this.values;
        if (processCameraProvider == null) {
            return;
        }
        int rotation = 0;
        if (this.fARcdN != null) {
            Intrinsics.copydefault(processCameraProvider);
            processCameraProvider.unbind(this.fARcdN);
        }
        if (this.DbNXlk != null) {
            ProcessCameraProvider processCameraProvider2 = this.values;
            Intrinsics.copydefault(processCameraProvider2);
            processCameraProvider2.unbind(this.DbNXlk);
        }
        Preview previewBuild = new Preview.Builder().build();
        this.fARcdN = previewBuild;
        Intrinsics.copydefault(previewBuild);
        PreviewView previewView = this.ejfBZ;
        PreviewView previewView2 = null;
        if (previewView == null) {
            Intrinsics.gEmmrt("");
            previewView = null;
        }
        previewBuild.setSurfaceProvider(previewView.getSurfaceProvider());
        PreviewView previewView3 = this.ejfBZ;
        if (previewView3 == null) {
            Intrinsics.gEmmrt("");
            previewView3 = null;
        }
        if (previewView3.getDisplay() != null) {
            PreviewView previewView4 = this.ejfBZ;
            if (previewView4 == null) {
                Intrinsics.gEmmrt("");
                previewView4 = null;
            }
            rotation = previewView4.getDisplay().getRotation();
        }
        this.DbNXlk = new ImageCapture.Builder().setTargetResolution(new android.util.Size(1080, 1920)).setTargetRotation(rotation).setCaptureMode(1).build();
        UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
        Preview preview = this.fARcdN;
        Intrinsics.copydefault(preview);
        UseCaseGroup.Builder builderAddUseCase = builder.addUseCase(preview);
        ImageCapture imageCapture = this.DbNXlk;
        Intrinsics.copydefault(imageCapture);
        UseCaseGroup.Builder builderAddUseCase2 = builderAddUseCase.addUseCase(imageCapture);
        Intrinsics.checkNotNullExpressionValue(builderAddUseCase2, "");
        PreviewView previewView5 = this.ejfBZ;
        if (previewView5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            previewView2 = previewView5;
        }
        ViewPort viewPort = previewView2.getViewPort();
        if (viewPort != null) {
            builderAddUseCase2.setViewPort(viewPort);
        }
        UseCaseGroup useCaseGroupBuild = builderAddUseCase2.build();
        Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "");
        try {
            ProcessCameraProvider processCameraProvider3 = this.values;
            Intrinsics.copydefault(processCameraProvider3);
            CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
            this.fetchVPNInfo = processCameraProvider3.bindToLifecycle(this, cameraSelector, useCaseGroupBuild);
        } catch (java.lang.Exception e) {
            pUU.KWHzl(getTAG(), "bind failed " + e);
        }
    }

    public final void AhwBna() {
        pUU.KWHzl(getTAG(), "unbindCamera");
        try {
            ProcessCameraProvider processCameraProvider = this.values;
            if (processCameraProvider != null) {
                processCameraProvider.unbindAll();
            }
        } catch (java.lang.Exception e) {
            pUU.KWHzl(getTAG(), "unbindCamera e=" + e);
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        EZpvd();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        AhwBna();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
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
