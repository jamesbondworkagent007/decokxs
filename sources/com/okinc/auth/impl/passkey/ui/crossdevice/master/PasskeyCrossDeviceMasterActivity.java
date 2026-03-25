package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC6087aIi;
import o.C33129mqd;
import o.C43251rlk;
import o.C55326xho;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.C58893zTh;
import o.C6545aRP;
import o.C6690aUB;
import o.C8206ayP;
import o.InterfaceC56387yDm;
import o.InterfaceC8196ayF;
import o.pUU;
import o.yCM;
import o.zAT;
import o.zPA;
import o.zPB;
import o.zPD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceMasterActivity extends AbstractActivityC6087aIi {
    public final InterfaceC56387yDm AkhnZx;

    @yCM
    public zPA journey;

    @yCM
    public C58893zTh passkeyTracker;
    public ActivityResultLauncher<PasskeyResetRemoveRequest> valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public String gEmmrt = "PasskeyCrossDeviceMasterActivity";
    public final C6545aRP AYXKKw = new C6545aRP(this, new Function0() { // from class: o.aIs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyCrossDeviceMasterActivity.gEmmrt(this.AEQbTJ);
        }
    }, new Function0() { // from class: o.aIt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyCrossDeviceMasterActivity.AYXKKw(this.copydefault);
        }
    });
    public final StateListAnimator djBIcL = new StateListAnimator();
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.aIu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyCrossDeviceMasterActivity.valueOf(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    public PasskeyCrossDeviceMasterActivity() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyCrossDeviceMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity$special$$inlined$viewModels$default$3
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

    public final C58893zTh valueOf() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final PasskeyCrossDeviceMasterViewModel gEmmrt() {
        return (PasskeyCrossDeviceMasterViewModel) this.AkhnZx.getValue();
    }

    public static final Unit gEmmrt(PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity) {
        passkeyCrossDeviceMasterActivity.AhwBna().EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity) {
        passkeyCrossDeviceMasterActivity.finish();
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Intent OLrzqt(@NotNull Context context, @NotNull Input input) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(input, "");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) PasskeyCrossDeviceMasterActivity.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_INPUT", input)));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.aIi.AhwBna()V */
    public final zPA AhwBna() {
        zPA zpa = this.journey;
        if (zpa != null) {
            return zpa;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator implements zPB {
        public StateListAnimator() {
        }

        @Override // o.zPB
        public void OLrzqt(zPD zpd) {
            Intrinsics.checkNotNullParameter(zpd, "");
            pUU.KWHzl(PasskeyCrossDeviceMasterActivity.this.getTAG(), "journey onStepChanged: " + zpd);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(PasskeyCrossDeviceMasterActivity.this), Dispatchers.getMain(), null, new PasskeyCrossDeviceMasterActivity$stepCallback$1$onStepChanged$1(zpd, PasskeyCrossDeviceMasterActivity.this, null), 2, null);
        }
    }

    public final Input AYXKKw() {
        return (Input) this.AhwBna.getValue();
    }

    public static final Input valueOf(PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity) {
        Bundle extras = passkeyCrossDeviceMasterActivity.getIntent().getExtras();
        if (extras != null) {
            return (Input) extras.getParcelable("KEY_INPUT");
        }
        return null;
    }

    @Override // o.AbstractActivityC6087aIi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        zAT zatEZpvd;
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.KWHzl);
        this.valueOf = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(this), new ActivityResultCallback() { // from class: o.aIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                PasskeyCrossDeviceMasterActivity.KWHzl(this.KWHzl, (PasskeyResetRemoveState) obj);
            }
        });
        Input inputAYXKKw = AYXKKw();
        if (inputAYXKKw != null && (zatEZpvd = inputAYXKKw.EZpvd()) != null) {
            AhwBna().EZpvd(zatEZpvd);
            AhwBna().copydefault(this.djBIcL);
            gEmmrt().valueOf();
            djBIcL();
            if (zatEZpvd instanceof zAT.Activity) {
                pUU.KWHzl(getTAG(), "Web scan flow - skipping Bluetooth setup");
                AhwBna().EZpvd();
                return;
            } else {
                this.AYXKKw.AEQbTJ();
                return;
            }
        }
        pUU.copydefault(getTAG(), "null input");
        C55326xho.toastWithFailedIcon$default("null input", 0, 1, (Object) null);
        finish();
    }

    public static final void KWHzl(PasskeyCrossDeviceMasterActivity passkeyCrossDeviceMasterActivity, PasskeyResetRemoveState passkeyResetRemoveState) {
        pUU.EZpvd(passkeyCrossDeviceMasterActivity.getTAG(), "resetRemovePasskeyState: " + passkeyResetRemoveState);
    }

    public final void KWHzl() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C8206ayP.StateListAnimator.hBpjJd);
        if (fragmentFindFragmentById != null) {
            getSupportFragmentManager().beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
        }
    }

    private final void djBIcL() {
        C6690aUB.AEQbTJ(gEmmrt().KWHzl(), this, new PasskeyCrossDeviceMasterActivity$observeViewModel$1(this, null));
        C6690aUB.AEQbTJ(gEmmrt().EZpvd(), this, new PasskeyCrossDeviceMasterActivity$observeViewModel$2(this, null));
    }

    public static final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Input(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i) {
                return new Input[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Input copy$default(Input input, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = input.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = input.copydefault;
            }
            if ((i & 4) != 0) {
                z = input.OLrzqt;
            }
            return input.OLrzqt(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Input OLrzqt(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Input(str, str2, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) input.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) input.copydefault) && this.OLrzqt == input.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(bleServiceUuid=" + this.AEQbTJ + ", crossDeviceSessionId=" + this.copydefault + ", isSync=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.copydefault);
            parcel.writeInt(this.OLrzqt ? 1 : 0);
        }

        public Input(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.OLrzqt = z;
        }

        public final zAT EZpvd() {
            if (C33129mqd.OLrzqt((CharSequence) this.AEQbTJ)) {
                return new zAT.ActionBar(this.AEQbTJ);
            }
            return new zAT.Activity(this.copydefault);
        }
    }

    @Override // o.AbstractActivityC6087aIi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6087aIi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6087aIi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6087aIi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
