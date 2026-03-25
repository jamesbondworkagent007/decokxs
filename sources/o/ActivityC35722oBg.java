package o;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.picker.PickerSelectionType;
import com.okinc.im.picker.MediaPickerActivity$onCreate$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC35722oBg extends AppCompatActivity {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.oBj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC35722oBg.EZpvd(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.oBg$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PickerSelectionType.values().length];
            try {
                iArr[PickerSelectionType.PHOTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PickerSelectionType.VIDEO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PickerSelectionType.ALL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public final PickerSelectionType AEQbTJ() {
        return (PickerSelectionType) this.AEQbTJ.getValue();
    }

    public static final PickerSelectionType EZpvd(ActivityC35722oBg activityC35722oBg) {
        android.content.Intent intent = activityC35722oBg.getIntent();
        if (intent != null) {
            PickerSelectionType pickerSelectionType = (PickerSelectionType) yDV.gEmmrt(PickerSelectionType.values(), intent.getIntExtra("arg_picker_selection_type", -1));
            if (pickerSelectionType != null) {
                return pickerSelectionType;
            }
        }
        return PickerSelectionType.ALL;
    }

    /* JADX INFO: renamed from: o.oBg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oBg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(Application application, android.content.Context context, PickerSelectionType pickerSelectionType, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                pickerSelectionType = PickerSelectionType.ALL;
            }
            return application.AEQbTJ(context, pickerSelectionType);
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull PickerSelectionType pickerSelectionType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(pickerSelectionType, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC35722oBg.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_picker_selection_type", java.lang.Integer.valueOf(pickerSelectionType.ordinal()))));
            return intent;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType;
        super.onCreate(bundle);
        int i = ActionBar.EZpvd[AEQbTJ().ordinal()];
        if (i == 1) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
        } else if (i == 2) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MediaPickerActivity$onCreate$1(oBC.AEQbTJ(this, new C35724oBi(0, false, 0, false, visualMediaType, 15, null)), this, null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
