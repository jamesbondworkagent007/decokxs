package o;

import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.im.picker.MediaPickerPreviewActivity$initViewModel$1;
import com.okinc.im.picker.adapter.MediaPickerPreviewAdapter;
import com.okinc.im.picker.viewmodel.MediaPickerPreviewViewModel;
import com.okinc.im.widgets.drawable.VerticalVignetteDrawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oBk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC35726oBk extends AbstractActivityC35720oBe implements MediaPickerPreviewAdapter.ActionBar {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AhwBna;
    public nIF djBIcL;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.oBm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC35726oBk.gEmmrt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oBl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC35726oBk.AYXKKw(this.KWHzl);
        }
    });
    public final ActionBar gEmmrt = new ActionBar();

    public ActivityC35726oBk() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(MediaPickerPreviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.picker.MediaPickerPreviewActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.picker.MediaPickerPreviewActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.picker.MediaPickerPreviewActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.oBe.gEmmrt()V */
    public final MediaPickerPreviewViewModel gEmmrt() {
        return (MediaPickerPreviewViewModel) this.AhwBna.getValue();
    }

    public final MediaPickerPreviewAdapter AhwBna() {
        return (MediaPickerPreviewAdapter) this.valueOf.getValue();
    }

    public static final MediaPickerPreviewAdapter gEmmrt(ActivityC35726oBk activityC35726oBk) {
        MediaPickerPreviewAdapter mediaPickerPreviewAdapter = new MediaPickerPreviewAdapter();
        mediaPickerPreviewAdapter.AEQbTJ(activityC35726oBk);
        return mediaPickerPreviewAdapter;
    }

    public final java.util.List<android.net.Uri> AYXKKw() {
        return (java.util.List) this.AYXKKw.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List AYXKKw(ActivityC35726oBk activityC35726oBk) {
        java.util.ArrayList parcelableArrayListExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            android.content.Intent intent = activityC35726oBk.getIntent();
            parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("selected_media", android.net.Uri.class) : null;
        } else {
            android.content.Intent intent2 = activityC35726oBk.getIntent();
            if (intent2 != null) {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("selected_media");
            }
        }
        return parcelableArrayListExtra != null ? parcelableArrayListExtra : yDY.AhwBna();
    }

    /* JADX INFO: renamed from: o.oBk$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oBk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<? extends android.net.Uri> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC35726oBk.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("selected_media", list), C56390yDp.OLrzqt("TRANSITION_ANIM", new int[]{C35399nuc.Activity.OLrzqt, C52761wXj.Application.copydefault})));
            return intent;
        }
    }

    @Override // o.AbstractActivityC35720oBe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        getDelegate().setLocalNightMode(2);
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC35720oBe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        copydefault(bundle);
        valueOf();
    }

    /* JADX INFO: renamed from: o.oBk$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            ActivityC35726oBk.this.AhwBna().EZpvd();
            nIF nif = ActivityC35726oBk.this.djBIcL;
            if (nif != null) {
                ActivityC35726oBk activityC35726oBk = ActivityC35726oBk.this;
                wYK wyk = nif.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(wyk, "");
                wyk.setVisibility(activityC35726oBk.gEmmrt().AEQbTJ(i) ^ true ? 0 : 8);
                nif.OLrzqt.setChecked(activityC35726oBk.gEmmrt().KWHzl(i));
            }
        }
    }

    private final void copydefault(android.os.Bundle bundle) {
        java.util.HashMap map;
        final nIF nifEZpvd = nIF.EZpvd(getLayoutInflater());
        this.djBIcL = nifEZpvd;
        if (nifEZpvd != null) {
            setContentView(nifEZpvd.getRoot());
            android.view.View view = null;
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    map = (java.util.HashMap) bundle.getSerializable("KEY_VIDEO_POSITIONS", java.util.HashMap.class);
                } else {
                    java.io.Serializable serializable = bundle.getSerializable("KEY_VIDEO_POSITIONS");
                    map = serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null;
                }
                if (map != null) {
                    OLrzqt(map);
                }
            }
            nifEZpvd.copydefault.setImageDrawable(new VerticalVignetteDrawable(this, 0, 0.0f, 6, null));
            nifEZpvd.AhwBna.setAdapter(AhwBna());
            ViewPager2 viewPager2 = nifEZpvd.AhwBna;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "");
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(viewPager2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.view.View next = it.next();
                if (next instanceof RecyclerView) {
                    view = next;
                    break;
                }
            }
            android.view.View view2 = view;
            if (view2 != null) {
                view2.setOverScrollMode(2);
            }
            nifEZpvd.AhwBna.registerOnPageChangeCallback(this.gEmmrt);
            C52794wYp c52794wYp = nifEZpvd.EZpvd;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
            nifEZpvd.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oBn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    ActivityC35726oBk.KWHzl(this.copydefault, nifEZpvd, compoundButton, z);
                }
            });
        }
    }

    public static final void KWHzl(ActivityC35726oBk activityC35726oBk, nIF nif, android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            activityC35726oBk.gEmmrt().AEQbTJ(nif.AhwBna.getCurrentItem(), z);
        }
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MediaPickerPreviewActivity$initViewModel$1(this, null), 3, null);
        gEmmrt().AEQbTJ(AYXKKw());
    }

    /* JADX INFO: renamed from: o.oBk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC35726oBk AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC35726oBk activityC35726oBk) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC35726oBk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl();
            }
        }
    }

    @Override // com.okinc.im.picker.adapter.MediaPickerPreviewAdapter.ActionBar
    public void KWHzl(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        gEmmrt().EZpvd(uri);
    }

    public final void OLrzqt(java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        AhwBna().OLrzqt(map);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.Map<java.lang.Integer, java.lang.Integer> mapOLrzqt = AhwBna().OLrzqt();
        bundle.putSerializable("KEY_VIDEO_POSITIONS", mapOLrzqt instanceof java.util.HashMap ? (java.util.HashMap) mapOLrzqt : null);
        super.onSaveInstanceState(bundle);
    }

    @Override // o.AbstractActivityC35720oBe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        AhwBna().EZpvd();
        super.onPause();
    }

    @Override // o.AbstractActivityC35720oBe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        nIF nif = this.djBIcL;
        if (nif != null) {
            nif.AhwBna.unregisterOnPageChangeCallback(this.gEmmrt);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        setResult(0);
        finish();
    }

    public final void KWHzl() {
        java.util.List<android.net.Uri> listOLrzqt = gEmmrt().OLrzqt();
        java.util.List<android.net.Uri> listEZpvd = gEmmrt().EZpvd();
        android.content.Intent intent = new android.content.Intent();
        intent.putParcelableArrayListExtra("selected_media", new java.util.ArrayList<>(listOLrzqt));
        intent.putParcelableArrayListExtra("use_original_image", new java.util.ArrayList<>(listEZpvd));
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC35720oBe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC35720oBe, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
