package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.picker.ConfirmationDialogConfig;
import com.okinc.im.imui.picker.ImageCropConfig;
import com.okinc.im.imui.sticker.view.StickerImageCropActivity$observeViewModel$1;
import com.okinc.im.imui.sticker.view.StickerImageCropActivity$observeViewModel$2;
import com.okinc.im.imui.sticker.view.StickerImageCropActivity$observeViewModel$3;
import com.okinc.im.imui.sticker.viewmodel.StickerCreationViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37621oxL extends AbstractActivityC37615oxF {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm gEmmrt;

    public ActivityC37621oxL() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(StickerCreationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.sticker.view.StickerImageCropActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.sticker.view.StickerImageCropActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.sticker.view.StickerImageCropActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final StickerCreationViewModel gEmmrt() {
        return (StickerCreationViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractActivityC37615oxF, o.ActivityC37150ooR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerImageCropActivity$observeViewModel$1(this, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().EZpvd(), new StickerImageCropActivity$observeViewModel$2(null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().KWHzl(), new StickerImageCropActivity$observeViewModel$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // o.ActivityC37150ooR
    public void KWHzl(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageCropConfig imageCropConfigEZpvd = EZpvd();
        if (imageCropConfigEZpvd == null) {
            return;
        }
        if (imageCropConfigEZpvd.EZpvd() != null) {
            copydefault(file, imageCropConfigEZpvd.EZpvd());
        } else {
            copydefault(file);
        }
    }

    public final void copydefault(final java.io.File file, ConfirmationDialogConfig confirmationDialogConfig) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(confirmationDialogConfig.OLrzqt());
        viewOnClickListenerC54939xaY.copydefault(confirmationDialogConfig.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(confirmationDialogConfig.EZpvd(), new View.OnClickListener() { // from class: o.oxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC37621oxL.copydefault(viewOnClickListenerC54939xaY, this, file, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, confirmationDialogConfig.copydefault(), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC37621oxL activityC37621oxL, java.io.File file, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        activityC37621oxL.copydefault(file);
    }

    public final void copydefault(java.io.File file) {
        gEmmrt().OLrzqt(file);
    }

    /* JADX INFO: renamed from: o.oxL$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull ImageCropConfig imageCropConfig) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(imageCropConfig, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC37621oxL.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_crop_config", imageCropConfig)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC37615oxF, o.ActivityC37150ooR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37615oxF, o.ActivityC37150ooR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37615oxF, o.ActivityC37150ooR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37615oxF, o.ActivityC37150ooR, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
