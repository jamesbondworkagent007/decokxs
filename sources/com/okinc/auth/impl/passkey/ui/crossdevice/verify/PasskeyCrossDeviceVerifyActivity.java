package com.okinc.auth.impl.passkey.ui.crossdevice.verify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC6068aIP;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C58893zTh;
import o.C6545aRP;
import o.C6690aUB;
import o.C8206ayP;
import o.InterfaceC56387yDm;
import o.pUU;
import o.yCM;
import o.zQQ;
import o.zRK;
import o.zRS;
import o.zRW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceVerifyActivity extends AbstractActivityC6068aIP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public zRK journey;

    @yCM
    public C58893zTh passkeyTracker;
    public String valueOf = "PasskeyCrossDeviceVerifyActivity";
    public final C6545aRP AYXKKw = new C6545aRP(this, new Function0() { // from class: o.aIX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyCrossDeviceVerifyActivity.valueOf(this.AEQbTJ);
        }
    }, new Function0() { // from class: o.aIU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyCrossDeviceVerifyActivity.AhwBna(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.aIZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyCrossDeviceVerifyActivity.gEmmrt(this.EZpvd);
        }
    });
    public final Application gEmmrt = new Application();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    public PasskeyCrossDeviceVerifyActivity() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyCrossDeviceVerifyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity$special$$inlined$viewModels$default$3
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

    public final PasskeyCrossDeviceVerifyViewModel AYXKKw() {
        return (PasskeyCrossDeviceVerifyViewModel) this.djBIcL.getValue();
    }

    public static final Unit valueOf(PasskeyCrossDeviceVerifyActivity passkeyCrossDeviceVerifyActivity) {
        passkeyCrossDeviceVerifyActivity.AYXKKw().AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(PasskeyCrossDeviceVerifyActivity passkeyCrossDeviceVerifyActivity) {
        passkeyCrossDeviceVerifyActivity.EZpvd(Output.Cancelled.AEQbTJ);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Intent OLrzqt(@NotNull Context context, @NotNull Input input) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(input, "");
            Intent intentPutExtras = new Intent(context.getApplicationContext(), (Class<?>) PasskeyCrossDeviceVerifyActivity.class).putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_INPUT", input)));
            Intrinsics.checkNotNullExpressionValue(intentPutExtras, "");
            return intentPutExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Input AhwBna() {
        return (Input) this.AhwBna.getValue();
    }

    public static final Input gEmmrt(PasskeyCrossDeviceVerifyActivity passkeyCrossDeviceVerifyActivity) {
        Bundle extras = passkeyCrossDeviceVerifyActivity.getIntent().getExtras();
        if (extras != null) {
            return (Input) extras.getParcelable("KEY_INPUT");
        }
        return null;
    }

    /* JADX DEBUG: Possible override for method o.aIP.KWHzl()V */
    public final zRK KWHzl() {
        zRK zrk = this.journey;
        if (zrk != null) {
            return zrk;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application implements zRW {
        public Application() {
        }

        @Override // o.zRW
        public void EZpvd(zRS zrs) {
            Intrinsics.checkNotNullParameter(zrs, "");
            pUU.KWHzl(PasskeyCrossDeviceVerifyActivity.this.getTAG(), "journey onStepChanged: " + zrs);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(PasskeyCrossDeviceVerifyActivity.this), Dispatchers.getMain(), null, new PasskeyCrossDeviceVerifyActivity$stepCallback$1$onStepChanged$1(zrs, PasskeyCrossDeviceVerifyActivity.this, null), 2, null);
        }
    }

    @Override // o.AbstractActivityC6068aIP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(C8206ayP.Application.OLrzqt);
        KWHzl().KWHzl(this.gEmmrt);
        AYXKKw().djBIcL();
        C6690aUB.AEQbTJ(AYXKKw().gEmmrt(), this, new AnonymousClass1(null));
        C6690aUB.AEQbTJ(AYXKKw().OLrzqt(), this, new AnonymousClass2(null));
        this.AYXKKw.AEQbTJ();
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity$onCreate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<zQQ, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = PasskeyCrossDeviceVerifyActivity.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(zQQ zqq, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(zqq, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                zQQ zqq = (zQQ) this.L$0;
                if (!(zqq instanceof zQQ.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                zQQ.Activity activity = (zQQ.Activity) zqq;
                C55326xho.toastWithFailedIcon$default(activity.KWHzl(), 0, 1, (Object) null);
                PasskeyCrossDeviceVerifyActivity.this.EZpvd(new Output.Error(activity.KWHzl()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity$onCreate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PasskeyCrossDeviceVerifyActivity.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyCrossDeviceVerifyActivity.this.EZpvd(Output.Cancelled.AEQbTJ);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void EZpvd(Output output) {
        Intent intent = new Intent();
        intent.putExtra("KEY_OUTPUT", output);
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public static final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final boolean copydefault;

        public static final class Creator implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Input(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
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
        public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = input.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = input.OLrzqt;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = input.EZpvd;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = input.KWHzl;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                z = input.copydefault;
            }
            return input.AEQbTJ(str, str5, str6, str7, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Input AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Input(str, str2, str3, str4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) input.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) input.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) input.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) input.KWHzl) && this.copydefault == input.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(challenge=" + this.AEQbTJ + ", targetCredentialId=" + this.OLrzqt + ", rpId=" + this.EZpvd + ", userHandle=" + this.KWHzl + ", isSyncOnly=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.KWHzl);
            parcel.writeInt(this.copydefault ? 1 : 0);
        }

        public Input(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.EZpvd = str3;
            this.KWHzl = str4;
            this.copydefault = z;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface Output extends Parcelable {

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Success implements Output {
            public static final Success OLrzqt = new Success();
            public static final Parcelable.Creator<Success> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Success.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Success() {
            }
        }

        public static final class Cancelled implements Output {
            public static final Cancelled AEQbTJ = new Cancelled();
            public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

            /* JADX INFO: loaded from: classes18.dex */
            public static final class Creator implements Parcelable.Creator<Cancelled> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Cancelled.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled[] newArray(int i) {
                    return new Cancelled[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Cancelled() {
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Error implements Output {
            public static final Parcelable.Creator<Error> CREATOR = new Creator();
            public final String EZpvd;

            public static final class Creator implements Parcelable.Creator<Error> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Error(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.EZpvd;
                }
                return error.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Error(str);
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
                return (obj instanceof Error) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((Error) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(message=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd);
            }

            public Error(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar extends ActivityResultContract<Input, Output> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Input input) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(input, "");
            return PasskeyCrossDeviceVerifyActivity.Companion.OLrzqt(context, input);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Output parseResult(int i, Intent intent) {
            Output output;
            return (intent == null || (output = (Output) intent.getParcelableExtra("KEY_OUTPUT")) == null) ? Output.Cancelled.AEQbTJ : output;
        }
    }

    @Override // o.AbstractActivityC6068aIP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6068aIP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6068aIP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6068aIP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
