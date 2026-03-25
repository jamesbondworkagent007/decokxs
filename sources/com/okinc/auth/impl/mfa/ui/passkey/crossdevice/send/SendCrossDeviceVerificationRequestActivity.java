package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC5884aEr;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.C5843aEC;
import o.C5845aEE;
import o.C5887aEu;
import o.C6690aUB;
import o.C8206ayP;
import o.C8278azi;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SendCrossDeviceVerificationRequestActivity extends AbstractActivityC5884aEr {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C8278azi AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.djBIcL;
    }

    public SendCrossDeviceVerificationRequestActivity() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(SendCrossDeviceVerificationRequestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aEr.AEQbTJ()V */
    public final SendCrossDeviceVerificationRequestViewModel AEQbTJ() {
        return (SendCrossDeviceVerificationRequestViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractActivityC5884aEr, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, 0);
        C8278azi c8278aziKWHzl = C8278azi.KWHzl(getLayoutInflater());
        this.AYXKKw = c8278aziKWHzl;
        if (c8278aziKWHzl == null) {
            Intrinsics.gEmmrt("");
            c8278aziKWHzl = null;
        }
        setContentView(c8278aziKWHzl.getRoot());
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.djSkpj, C5887aEu.Companion.AEQbTJ()).addToBackStack(C5887aEu.class.getName()).commitAllowingStateLoss();
        }
        C6690aUB.AEQbTJ(AEQbTJ().copydefault(), this, new AnonymousClass1(null));
        C6690aUB.AEQbTJ(AEQbTJ().AEQbTJ(), this, new AnonymousClass2(null));
        C6690aUB.AEQbTJ(AEQbTJ().EZpvd(), this, new AnonymousClass3(null));
        C6690aUB.AEQbTJ(AEQbTJ().KWHzl(), this, new AnonymousClass4(null));
        C6690aUB.AEQbTJ(AEQbTJ().djBIcL(), this, new AnonymousClass5(null));
        C6690aUB.AEQbTJ(AEQbTJ().gEmmrt(), this, new AnonymousClass6(null));
        C6690aUB.AEQbTJ(AEQbTJ().AhwBna(), this, new AnonymousClass7(null));
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$onCreate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SendCrossDeviceVerificationRequestActivity.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SendCrossDeviceVerificationRequestActivity.this.gEmmrt();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$onCreate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SendCrossDeviceVerificationRequestActivity.this.new AnonymousClass2(continuation);
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
                SendCrossDeviceVerificationRequestActivity.this.AEQbTJ(Result.Success.copydefault);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$onCreate$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SendCrossDeviceVerificationRequestActivity.this.new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SendCrossDeviceVerificationRequestActivity.this.AEQbTJ(Result.Cancelled.EZpvd);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$onCreate$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SendCrossDeviceVerificationRequestActivity.this.new AnonymousClass4(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SendCrossDeviceVerificationRequestActivity.this.onBackPressed();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$onCreate$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SendCrossDeviceVerificationRequestActivity.this.new AnonymousClass5(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SendCrossDeviceVerificationRequestActivity.this.AEQbTJ(Result.ResetPasskey.EZpvd);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$onCreate$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SendCrossDeviceVerificationRequestActivity.this.new AnonymousClass6(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SendCrossDeviceVerificationRequestActivity.this.djBIcL();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity$onCreate$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<MfaFailure, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = SendCrossDeviceVerificationRequestActivity.this.new AnonymousClass7(continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MfaFailure mfaFailure, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(mfaFailure, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SendCrossDeviceVerificationRequestActivity.this.AEQbTJ(new Result.MfaError((MfaFailure) this.L$0));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void AEQbTJ(Result result) {
        Intent intent = new Intent();
        intent.putExtra("RESULT", result);
        setResult(-1, intent);
        finish();
    }

    public final void gEmmrt() {
        getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.djSkpj, C5845aEE.Companion.KWHzl()).addToBackStack(C5845aEE.class.getName()).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.djSkpj, C5843aEC.Companion.EZpvd()).addToBackStack(C5843aEC.class.getName()).commitAllowingStateLoss();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C52761wXj.Application.valueOf);
    }

    public static final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final String AEQbTJ;
        public final AuthenticationStartResponse KWHzl;

        public static final class Creator implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Input(parcel.readString(), AuthenticationStartResponse.CREATOR.createFromParcel(parcel));
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
        public static /* synthetic */ Input copy$default(Input input, String str, AuthenticationStartResponse authenticationStartResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                str = input.AEQbTJ;
            }
            if ((i & 2) != 0) {
                authenticationStartResponse = input.KWHzl;
            }
            return input.EZpvd(str, authenticationStartResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Input EZpvd(@NotNull String str, @NotNull AuthenticationStartResponse authenticationStartResponse) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
            return new Input(str, authenticationStartResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationStartResponse OLrzqt() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) input.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, input.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(challenge=" + this.AEQbTJ + ", authenticationStartResponse=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            this.KWHzl.writeToParcel(parcel, i);
        }

        public Input(@NotNull String str, @NotNull AuthenticationStartResponse authenticationStartResponse) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
            this.AEQbTJ = str;
            this.KWHzl = authenticationStartResponse;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface Result extends Parcelable {

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Success implements Result {
            public static final Success copydefault = new Success();
            public static final Parcelable.Creator<Success> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Success.copydefault;
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

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Cancelled implements Result {
            public static final Cancelled EZpvd = new Cancelled();
            public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Cancelled> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Cancelled.EZpvd;
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

        /* JADX INFO: loaded from: classes17.dex */
        public static final class ResetPasskey implements Result {
            public static final ResetPasskey EZpvd = new ResetPasskey();
            public static final Parcelable.Creator<ResetPasskey> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<ResetPasskey> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ResetPasskey createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return ResetPasskey.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ResetPasskey[] newArray(int i) {
                    return new ResetPasskey[i];
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

            private ResetPasskey() {
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class MfaError implements Result {
            public static final Parcelable.Creator<MfaError> CREATOR = new Creator();
            public final MfaFailure EZpvd;

            public static final class Creator implements Parcelable.Creator<MfaError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MfaError createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new MfaError((MfaFailure) parcel.readParcelable(MfaError.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MfaError[] newArray(int i) {
                    return new MfaError[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ MfaError copy$default(MfaError mfaError, MfaFailure mfaFailure, int i, Object obj) {
                if ((i & 1) != 0) {
                    mfaFailure = mfaError.EZpvd;
                }
                return mfaError.AEQbTJ(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaError AEQbTJ(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                return new MfaError(mfaFailure);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MfaFailure KWHzl() {
                return this.EZpvd;
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
                return (obj instanceof MfaError) && Intrinsics.EZpvd(this.EZpvd, ((MfaError) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MfaError(error=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.EZpvd, i);
            }

            public MfaError(@NotNull MfaFailure mfaFailure) {
                Intrinsics.checkNotNullParameter(mfaFailure, "");
                this.EZpvd = mfaFailure;
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application extends ActivityResultContract<Input, Result> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Input input) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(input, "");
            return SendCrossDeviceVerificationRequestActivity.Companion.KWHzl(context, input);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Result parseResult(int i, Intent intent) {
            Result result;
            return (intent == null || (result = (Result) intent.getParcelableExtra("RESULT")) == null) ? Result.Cancelled.EZpvd : result;
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.copy$default(com.okinc.auth.impl.passkey.model.AuthenticationStartResponse, com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$PublicKey, java.util.List, java.lang.String, int, java.lang.Object):com.okinc.auth.impl.passkey.model.AuthenticationStartResponse */
        public final Intent KWHzl(@NotNull Context context, @NotNull Input input) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(input, "");
            Intent intent = new Intent(context, (Class<?>) SendCrossDeviceVerificationRequestActivity.class);
            List<AuthenticationStartResponse.AdditionalData> additionalData = input.OLrzqt().getAdditionalData();
            if (additionalData != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : additionalData) {
                    if (Intrinsics.EZpvd(((AuthenticationStartResponse.AdditionalData) obj).getInHouse(), Boolean.TRUE)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            intent.putExtra("ARG_INPUT", Input.copy$default(input, null, AuthenticationStartResponse.copy$default(input.OLrzqt(), null, arrayList, null, 5, null), 1, null));
            return intent;
        }
    }

    @Override // o.AbstractActivityC5884aEr, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC5884aEr, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC5884aEr, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC5884aEr, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
