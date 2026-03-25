package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.qrcode.GroupQrActivity$initViewModel$1;
import com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.TagColorMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nZV extends AbstractActivityC36419oac {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.oaa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(nZV.AYXKKw(this.copydefault));
        }
    });
    public final InterfaceC56387yDm KWHzl;
    public ViewOnClickListenerC54939xaY OLrzqt;

    public nZV() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(GroupQrViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.qrcode.GroupQrActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.qrcode.GroupQrActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.qrcode.GroupQrActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.oac.OLrzqt()V */
    public final GroupQrViewModel OLrzqt() {
        return (GroupQrViewModel) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long wlaJM() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).longValue();
    }

    public static final long AYXKKw(nZV nzv) {
        return nzv.getIntent().getLongExtra("ARG_GROUP_ID", -1L);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) nZV.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_GROUP_ID", l)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC36419oac, com.okinc.im.imui.qrcode.BaseQrDisplayActivity, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AuCTelauCTel();
        AubY();
    }

    @Override // o.AbstractActivityC36419oac, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        this.OLrzqt = null;
        super.onDestroy();
    }

    private final void AuCTelauCTel() {
        copydefault(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OEgNct));
        isConnected().setImageDrawable(IMImageHelper.OLrzqt.AhwBna());
    }

    private final void AubY() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupQrActivity$initViewModel$1(this, null), 3, null);
        OLrzqt().KWHzl(wlaJM());
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, OfficialTagInfo officialTagInfo, boolean z) {
        C35891oHn.loadGroupAvatar$default(isConnected(), str, null, 2, null);
        C37717ozB.KWHzl.AEQbTJ(ejfBZ(), officialTagInfo, (124 & 4) != 0 ? 4 : 0, (124 & 8) != 0 ? TagColorMode.NORMAL : null, (124 & 16) != 0 ? false : false, (124 & 32) != 0 ? false : false, (124 & 64) != 0 ? false : false);
        uzCIH().setText(str2);
        OLrzqt(z ? new Function0() { // from class: o.nZU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nZV.valueOf(this.AEQbTJ);
            }
        } : null);
    }

    public static final Unit valueOf(nZV nzv) {
        nzv.EZpvd();
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        C6995aZr.setContent$default(AuCTel(), str, false, 0.0f, 6, (java.lang.Object) null);
        KWHzl(C33069mpW.copydefault(C35399nuc.LoaderManager.FQMcgE, C56424yEw.gEmmrt(C56390yDp.OLrzqt("groupName", uzCIH().getText().toString()), C56390yDp.OLrzqt("inviteLink", str))));
    }

    public final void EZpvd() {
        if (this.OLrzqt == null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
            viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.dSJNDS);
            viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.DcMfJKffREWX);
            viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.hDKMBd, new View.OnClickListener() { // from class: o.nZT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nZV.OLrzqt(this.copydefault, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.iwGUEr, new View.OnClickListener() { // from class: o.nZW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nZV.KWHzl(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(false);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.OLrzqt;
        if (viewOnClickListenerC54939xaY2 != null) {
            viewOnClickListenerC54939xaY2.show();
        }
    }

    public static final void OLrzqt(nZV nzv, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        nzv.OLrzqt(false);
        nzv.OLrzqt().copydefault(nzv.wlaJM());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC36419oac, com.okinc.im.imui.qrcode.BaseQrDisplayActivity, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC36419oac, com.okinc.im.imui.qrcode.BaseQrDisplayActivity, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC36419oac, com.okinc.im.imui.qrcode.BaseQrDisplayActivity, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC36419oac, com.okinc.im.imui.qrcode.BaseQrDisplayActivity, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
