package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.im.camera.OKIMCaptureMode;
import com.okinc.im.imui.picker.CropShape;
import com.okinc.im.imui.picker.ImageCropConfig;
import com.okinc.im.imui.picker.PickerSelectionType;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC35723oBh;
import o.ActivityC35722oBg;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37152ooT extends AbstractC35723oBh {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public C33883nJj EZpvd;
    public java.lang.String OLrzqt = "PickImage";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.ooT$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ooT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AbstractC35723oBh copydefault(@NotNull java.lang.String str, boolean z, java.lang.CharSequence charSequence, boolean z2, java.lang.CharSequence charSequence2, PickerSelectionType pickerSelectionType) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("EXTRA_TITLE", str);
            bundle.putBoolean("EXTRA_ENABLE_CAMERA_ENTRY", z);
            if (charSequence == null) {
                charSequence = C32979mnm.EZpvd.OLrzqt().getString(C35399nuc.LoaderManager.DkIxYv);
                Intrinsics.checkNotNullExpressionValue(charSequence, "");
            }
            bundle.putCharSequence("EXTRA_CAMERA_TEXT", charSequence);
            bundle.putBoolean("EXTRA_ENABLE_GALLERY_ENTRY", z2);
            if (charSequence2 == null) {
                charSequence2 = C32979mnm.EZpvd.OLrzqt().getString(C35399nuc.LoaderManager.ZqidTP);
                Intrinsics.checkNotNullExpressionValue(charSequence2, "");
            }
            bundle.putCharSequence("EXTRA_GALLERY_TEXT", charSequence2);
            bundle.putSerializable("EXTRA_PICKER_SELECTION_TYPE", pickerSelectionType);
            C37152ooT c37152ooT = new C37152ooT();
            c37152ooT.setArguments(bundle);
            return c37152ooT;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C33883nJj c33883nJjAEQbTJ = C33883nJj.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c33883nJjAEQbTJ, "");
        this.EZpvd = c33883nJjAEQbTJ;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    public final boolean KWHzl() {
        return C6779aVn.copydefault(this).getBoolean("EXTRA_ENABLE_CAMERA_ENTRY", true);
    }

    public final boolean AYXKKw() {
        return C6779aVn.copydefault(this).getBoolean("EXTRA_ENABLE_GALLERY_ENTRY", true);
    }

    public final java.lang.CharSequence copydefault() {
        return C6779aVn.copydefault(this).getString("EXTRA_CAMERA_TEXT");
    }

    public final java.lang.CharSequence OLrzqt() {
        return C6779aVn.copydefault(this).getString("EXTRA_GALLERY_TEXT");
    }

    private final PickerSelectionType gEmmrt() {
        java.io.Serializable serializable = C6779aVn.copydefault(this).getSerializable("EXTRA_PICKER_SELECTION_TYPE");
        PickerSelectionType pickerSelectionType = serializable instanceof PickerSelectionType ? (PickerSelectionType) serializable : null;
        return pickerSelectionType == null ? PickerSelectionType.ALL : pickerSelectionType;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C33883nJj c33883nJj = this.EZpvd;
        if (c33883nJj != null) {
            c33883nJj.valueOf.setText(C6779aVn.copydefault(this).getString("EXTRA_TITLE"));
            if (KWHzl()) {
                c33883nJj.OLrzqt.setVisibility(0);
                java.lang.CharSequence charSequenceCopydefault = copydefault();
                if (charSequenceCopydefault != null) {
                    c33883nJj.OLrzqt.EZpvd().setText(charSequenceCopydefault);
                }
                c33883nJj.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.ooV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C37152ooT.OLrzqt(this.KWHzl, view2);
                    }
                });
            } else {
                c33883nJj.OLrzqt.setVisibility(8);
            }
            if (AYXKKw()) {
                c33883nJj.EZpvd.setVisibility(0);
                java.lang.CharSequence charSequenceOLrzqt = OLrzqt();
                if (charSequenceOLrzqt != null) {
                    c33883nJj.EZpvd.setTitle(charSequenceOLrzqt);
                }
                c33883nJj.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.ooX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C37152ooT.KWHzl(this.KWHzl, view2);
                    }
                });
            } else {
                c33883nJj.EZpvd.setVisibility(8);
            }
        }
        view.post(new java.lang.Runnable() { // from class: o.ooU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37152ooT.EZpvd(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(C37152ooT c37152ooT, android.view.View view) {
        c37152ooT.valueOf();
    }

    public static final void KWHzl(C37152ooT c37152ooT, android.view.View view) {
        c37152ooT.djBIcL();
    }

    public static final void EZpvd(C37152ooT c37152ooT) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37152ooT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void djBIcL() {
        ActivityC35722oBg.Application application = ActivityC35722oBg.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        startActivityForResult(application.AEQbTJ(contextRequireContext, gEmmrt()), 100);
    }

    public final void valueOf() {
        Function2<android.content.Context, OKIMCaptureMode, android.content.Intent> function2KWHzl = C36471obb.KWHzl();
        if (getActivity() == null) {
            pUU.copydefault(EZpvd(), "Fragment activity is null, cannot start sight record");
            return;
        }
        java.io.File externalFilesDir = C43246rlf.OLrzqt.valueOf().getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir == null || !externalFilesDir.mkdirs()) {
            pUU.KWHzl(EZpvd(), "Failed to create directory for saving media");
        } else {
            pUU.KWHzl(EZpvd(), "Media directory created successfully: " + (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null));
        }
        OKIMCaptureMode oKIMCaptureMode = OKIMCaptureMode.CAPTURE_ONLY;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        android.content.Intent intentInvoke = function2KWHzl.invoke(fragmentActivityRequireActivity, oKIMCaptureMode);
        if (externalFilesDir != null) {
            intentInvoke.putExtra("recordSightDir", externalFilesDir.getAbsolutePath());
        }
        startActivityForResult(intentInvoke, 101);
    }

    public final java.io.File AhwBna() {
        return new java.io.File(requireContext().getExternalCacheDir(), "photo_" + java.lang.System.currentTimeMillis() + ".jpg");
    }

    public final void EZpvd(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        pUU.EZpvd(EZpvd(), "handlePickResult() uri:" + uri);
        if (Intrinsics.EZpvd((java.lang.Object) scheme, (java.lang.Object) "content")) {
            AbstractC58247yxg map = AbstractC58247yxg.just(uri).map(new Activity());
            Intrinsics.checkNotNullExpressionValue(map, "");
            C58156yvv.copydefault(C33024moe.OLrzqt(map), this).subscribe(new TaskDescription(), new StateListAnimator());
        } else {
            if (scheme != null && C59449zhJ.startsWith$default(scheme, "file", false, 2, null)) {
                KWHzl(uri);
                return;
            }
            pUU.copydefault(EZpvd(), "handlePickResult() unknown uri:" + uri);
        }
    }

    /* JADX INFO: renamed from: o.ooT$Activity */
    public static final class Activity extends C33038mos<android.net.Uri, java.lang.String> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.C33038mos, o.InterfaceC58229yxO
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.String apply(android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            C44163sFq c44163sFq = C44163sFq.OLrzqt;
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            java.lang.String strKWHzl = c44163sFq.KWHzl(c32979mnm.OLrzqt(), uri, true);
            if (strKWHzl != null && strKWHzl.length() > 0 && C37152ooT.this.KWHzl(strKWHzl)) {
                return strKWHzl;
            }
            java.io.File fileAhwBna = C37152ooT.this.AhwBna();
            try {
                java.io.InputStream inputStreamOpenInputStream = c32979mnm.OLrzqt().getContentResolver().openInputStream(uri);
                if (C33486mxP.AEQbTJ(inputStreamOpenInputStream, fileAhwBna)) {
                    java.lang.String absolutePath = fileAhwBna.getAbsolutePath();
                    Intrinsics.copydefault((java.lang.Object) absolutePath);
                    C33486mxP.AEQbTJ(inputStreamOpenInputStream);
                    return absolutePath;
                }
                throw new java.io.IOException("Copy file failed");
            } catch (java.lang.Throwable th) {
                C33486mxP.AEQbTJ((java.io.InputStream) null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o.ooT$TaskDescription */
    public static final class TaskDescription extends C33031mol<java.lang.String> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // o.C33031mol, o.InterfaceC58227yxM
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void accept(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C37152ooT c37152ooT = C37152ooT.this;
            android.net.Uri uriFromFile = android.net.Uri.fromFile(new java.io.File(str));
            Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
            c37152ooT.KWHzl(uriFromFile);
        }
    }

    /* JADX INFO: renamed from: o.ooT$StateListAnimator */
    public static final class StateListAnimator extends C33027moh {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // o.C33027moh, o.InterfaceC58227yxM
        /* JADX INFO: renamed from: OLrzqt */
        public void accept(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.copydefault(C37152ooT.this.EZpvd(), "RxError:" + th.getMessage());
        }
    }

    public final boolean KWHzl(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        return file.exists() && file.isFile() && file.length() > 0;
    }

    public final void KWHzl(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            startActivityForResult(ActivityC37150ooR.Companion.KWHzl(activity, new ImageCropConfig(uri, 300.0f, CropShape.CIRCLE, java.lang.Math.min(C33570myu.EZpvd(activity, 360), 1080), java.lang.Math.min(C33570myu.EZpvd(activity, 360), 1080), null, null, null, 224, null)), 102);
        }
    }

    public final void copydefault(android.net.Uri uri) {
        pUU.KWHzl(EZpvd(), "handleCropResult:" + uri);
        OLrzqt(uri);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        pUU.KWHzl(EZpvd(), "Fragment-->onActivityResult() resultCode: " + i2 + " requestCode: " + i + " data: " + (intent != null ? intent.getData() : null));
        if (i2 == -1) {
            switch (i) {
                case 100:
                    if (intent == null) {
                        pUU.copydefault(EZpvd(), "Data is null, unable to retrieve selected media.");
                    } else {
                        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("selected_media");
                        if (parcelableArrayListExtra == null) {
                            pUU.copydefault(EZpvd(), "No selected media found in the data.");
                        } else if (parcelableArrayListExtra.isEmpty()) {
                            pUU.EZpvd(EZpvd(), "No media selected");
                        } else {
                            java.lang.Object obj = parcelableArrayListExtra.get(0);
                            Intrinsics.checkNotNullExpressionValue(obj, "");
                            EZpvd((android.net.Uri) obj);
                        }
                    }
                    break;
                case 101:
                    if (intent == null) {
                        pUU.copydefault(EZpvd(), "Data is null, unable to retrieve captured photo.");
                    } else {
                        java.lang.String stringExtra = intent.getStringExtra("capture_picture_uri");
                        if (stringExtra != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra))) {
                            android.net.Uri uri = android.net.Uri.parse(stringExtra);
                            Intrinsics.copydefault(uri);
                            EZpvd(uri);
                        } else {
                            pUU.valueOf(EZpvd(), "Captured file source is null or empty");
                        }
                    }
                    break;
                case 102:
                    android.net.Uri uri2 = intent != null ? (android.net.Uri) intent.getParcelableExtra("extra_result_uri") : null;
                    if (uri2 != null) {
                        copydefault(uri2);
                    } else {
                        pUU.valueOf(EZpvd(), "Crop result URI is null");
                    }
                    break;
                default:
                    pUU.valueOf(EZpvd(), "Unhandled request code: " + i);
                    break;
            }
        }
        pUU.valueOf(EZpvd(), "Pick canceled or result not OK: resultCode: " + i2);
    }

    public final void OLrzqt(android.net.Uri uri) {
        AbstractC35723oBh.Activity activityAEQbTJ = AEQbTJ();
        if (activityAEQbTJ != null) {
            activityAEQbTJ.copydefault(uri);
        }
        dismissAllowingStateLoss();
    }

    public AbstractC35723oBh.Activity AEQbTJ() {
        ActivityResultCaller parentFragment = getParentFragment();
        KeyEventDispatcher.Component activity = getActivity();
        if (parentFragment instanceof AbstractC35723oBh.Activity) {
            return (AbstractC35723oBh.Activity) parentFragment;
        }
        if (activity instanceof AbstractC35723oBh.Activity) {
            return (AbstractC35723oBh.Activity) activity;
        }
        return null;
    }
}
