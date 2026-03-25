package o;

import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.app.ActivityCompat;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55124xdy;

/* JADX INFO: renamed from: o.ykN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ActivityC57539ykN extends ActivityC52757wXf {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final java.lang.String copydefault = java.lang.System.currentTimeMillis() + "_okx_vip.png";
    public InterfaceC55124xdy KWHzl;

    /* JADX INFO: renamed from: o.ykN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        AEQbTJ();
    }

    public final void AEQbTJ() {
        int intExtra = getIntent().getIntExtra("imageMode", 0);
        this.KWHzl = InterfaceC55124xdy.Companion.EZpvd(this);
        if (intExtra == 1) {
            EZpvd();
        } else if (intExtra == 2) {
            OLrzqt();
        } else {
            if (intExtra != 3) {
                return;
            }
            KWHzl();
        }
    }

    public final void EZpvd() {
        Function1<? super android.net.Uri, Unit> function1 = new Function1() { // from class: o.ykP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC57539ykN.OLrzqt(this.copydefault, (android.net.Uri) obj);
            }
        };
        Function1<? super java.lang.String[], Unit> function12 = new Function1() { // from class: o.ykM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC57539ykN.copydefault((java.lang.String[]) obj);
            }
        };
        InterfaceC55124xdy interfaceC55124xdy = this.KWHzl;
        if (interfaceC55124xdy == null) {
            Intrinsics.gEmmrt("");
            interfaceC55124xdy = null;
        }
        interfaceC55124xdy.KWHzl(this, function1, function12);
    }

    public static final Unit OLrzqt(ActivityC57539ykN activityC57539ykN, android.net.Uri uri) {
        pUU.KWHzl("GrowthImagePickerActivity", "initSinglePicker choose success: " + (uri != null ? uri.toString() : null));
        java.lang.String strAEQbTJ = activityC57539ykN.AEQbTJ((android.content.Context) activityC57539ykN, uri);
        if (strAEQbTJ == null) {
            strAEQbTJ = copydefault;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(strAEQbTJ, uri != null ? uri.toString() : null);
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("imagePickerEvent", null, linkedHashMap);
        }
        activityC57539ykN.finish();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        final int intExtra = getIntent().getIntExtra("maxImages", 0);
        if (intExtra <= 1) {
            pUU.KWHzl("GrowthImagePickerActivity", "maxImages：" + intExtra);
            return;
        }
        C55119xdt.AEQbTJ.KWHzl(this, java.lang.Integer.valueOf(intExtra), new ActivityResultCallback() { // from class: o.ykT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC57539ykN.KWHzl(this.OLrzqt, intExtra, (java.util.List) obj);
            }
        }).KWHzl();
    }

    public static final void KWHzl(ActivityC57539ykN activityC57539ykN, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("GrowthImagePickerActivity", "initMultiPicker choose success: " + list.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (android.net.Uri uri : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, i)) {
            java.lang.String strAEQbTJ = activityC57539ykN.AEQbTJ((android.content.Context) activityC57539ykN, uri);
            if (strAEQbTJ == null) {
                strAEQbTJ = copydefault;
            }
            linkedHashMap.put(strAEQbTJ, uri.toString());
        }
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("imagePickerEvent", null, linkedHashMap);
        }
        activityC57539ykN.finish();
    }

    public final void KWHzl() {
        Function1 function1 = new Function1() { // from class: o.ykU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC57539ykN.AEQbTJ(this.copydefault, (android.net.Uri) obj);
            }
        };
        Function1 function12 = new Function1() { // from class: o.ykS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC57539ykN.AEQbTJ(this.AEQbTJ, (java.lang.String[]) obj);
            }
        };
        InterfaceC55124xdy interfaceC55124xdy = this.KWHzl;
        if (interfaceC55124xdy == null) {
            Intrinsics.gEmmrt("");
            interfaceC55124xdy = null;
        }
        InterfaceC55124xdy.StateListAnimator.takePicture$default(interfaceC55124xdy, this, null, function1, function12, 2, null);
    }

    public static final Unit AEQbTJ(ActivityC57539ykN activityC57539ykN, android.net.Uri uri) {
        pUU.KWHzl("GrowthImagePickerActivity", "initCameraPicker choose success: " + (uri != null ? uri.toString() : null));
        java.lang.String strAEQbTJ = activityC57539ykN.AEQbTJ((android.content.Context) activityC57539ykN, uri);
        if (strAEQbTJ == null) {
            strAEQbTJ = copydefault;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(strAEQbTJ, uri != null ? uri.toString() : null);
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("imagePickerEvent", null, linkedHashMap);
        }
        activityC57539ykN.finish();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC57539ykN activityC57539ykN, java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        pUU.KWHzl("GrowthImagePickerActivity", "initCameraPicker Camera permission denied");
        if ((!(strArr.length == 0)) && !ActivityCompat.shouldShowRequestPermissionRationale(activityC57539ykN, strArr[0])) {
            new C33625mzw().KWHzl(activityC57539ykN);
        }
        activityC57539ykN.finish();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String AEQbTJ(android.content.Context context, android.net.Uri uri) {
        java.lang.String path;
        int columnIndex;
        if (uri == null) {
            return null;
        }
        if (C59449zhJ.gEmmrt("content", uri.getScheme(), true)) {
            android.database.Cursor cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{"_display_name"}, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                java.lang.String string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) == -1) ? null : cursorQuery.getString(columnIndex);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(cursorQuery, null);
                return string;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    yFA.copydefault(cursorQuery, th);
                    throw th2;
                }
            }
        }
        if (!C59449zhJ.gEmmrt("file", uri.getScheme(), true) || (path = uri.getPath()) == null) {
            return null;
        }
        return new java.io.File(path).getName();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
