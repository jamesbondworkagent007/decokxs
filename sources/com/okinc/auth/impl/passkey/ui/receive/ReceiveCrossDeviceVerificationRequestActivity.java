package com.okinc.auth.impl.passkey.ui.receive;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.TargetDeviceVerificationResult;
import com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC6218aLG;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.C58893zTh;
import o.C6071aIS;
import o.C6227aLP;
import o.C6232aLU;
import o.C6690aUB;
import o.C8206ayP;
import o.C8278azi;
import o.InterfaceC33040mou;
import o.InterfaceC56387yDm;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.account.UpgradeDevice;

/* JADX INFO: loaded from: classes14.dex */
public final class ReceiveCrossDeviceVerificationRequestActivity extends AbstractActivityC6218aLG {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final boolean AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public C8278azi gEmmrt;

    @yCM
    public C58893zTh passkeyTracker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.AhwBna;
    }

    public ReceiveCrossDeviceVerificationRequestActivity() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(ReceiveCrossDeviceVerificationRequestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aLG.KWHzl()V */
    public final C58893zTh KWHzl() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.aLG.djBIcL()V */
    public final ReceiveCrossDeviceVerificationRequestViewModel djBIcL() {
        return (ReceiveCrossDeviceVerificationRequestViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractActivityC6218aLG, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, 0);
        C8278azi c8278aziKWHzl = C8278azi.KWHzl(getLayoutInflater());
        this.gEmmrt = c8278aziKWHzl;
        if (c8278aziKWHzl == null) {
            Intrinsics.gEmmrt("");
            c8278aziKWHzl = null;
        }
        setContentView(c8278aziKWHzl.getRoot());
        if (bundle == null) {
            AhwBna();
        }
        C6690aUB.AEQbTJ(djBIcL().OLrzqt(), this, new AnonymousClass1(null));
        C6690aUB.AEQbTJ(djBIcL().valueOf(), this, new AnonymousClass2(null));
        C6690aUB.AEQbTJ(djBIcL().KWHzl(), this, new AnonymousClass3(null));
        C6690aUB.AEQbTJ(djBIcL().copydefault(), this, new AnonymousClass4(null));
        C6690aUB.AEQbTJ(djBIcL().EZpvd(), this, new AnonymousClass5(null));
        C6690aUB.AEQbTJ(djBIcL().gEmmrt(), this, new AnonymousClass6(null));
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$onCreate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ReceiveCrossDeviceVerificationRequestActivity.this.new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!this.Z$0) {
                    ReceiveCrossDeviceVerificationRequestActivity.this.EZpvd(TargetDeviceVerificationResult.Approved.copydefault);
                } else {
                    ReceiveCrossDeviceVerificationRequestActivity.this.KWHzl().copydefault(UpgradeDevice.CROSS_DEVICE);
                    C6071aIS c6071aISNewInstance$default = C6071aIS.ActionBar.newInstance$default(C6071aIS.Companion, null, 1, null);
                    final ReceiveCrossDeviceVerificationRequestActivity receiveCrossDeviceVerificationRequestActivity = ReceiveCrossDeviceVerificationRequestActivity.this;
                    c6071aISNewInstance$default.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aLJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            ReceiveCrossDeviceVerificationRequestActivity.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(receiveCrossDeviceVerificationRequestActivity, dialogInterface);
                        }
                    });
                    FragmentManager supportFragmentManager = receiveCrossDeviceVerificationRequestActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    c6071aISNewInstance$default.show(supportFragmentManager);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(ReceiveCrossDeviceVerificationRequestActivity receiveCrossDeviceVerificationRequestActivity, DialogInterface dialogInterface) {
            receiveCrossDeviceVerificationRequestActivity.EZpvd(TargetDeviceVerificationResult.Approved.copydefault);
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$onCreate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReceiveCrossDeviceVerificationRequestActivity.this.new AnonymousClass2(continuation);
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
                ReceiveCrossDeviceVerificationRequestActivity.this.getSupportFragmentManager().popBackStack();
                ReceiveCrossDeviceVerificationRequestActivity.this.gEmmrt();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$onCreate$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReceiveCrossDeviceVerificationRequestActivity.this.new AnonymousClass3(continuation);
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
                ReceiveCrossDeviceVerificationRequestActivity.this.EZpvd(TargetDeviceVerificationResult.KickOuted.AEQbTJ);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$onCreate$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReceiveCrossDeviceVerificationRequestActivity.this.new AnonymousClass4(continuation);
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
                ReceiveCrossDeviceVerificationRequestActivity.this.EZpvd(TargetDeviceVerificationResult.Cancelled.OLrzqt);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$onCreate$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReceiveCrossDeviceVerificationRequestActivity.this.new AnonymousClass5(continuation);
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
                ReceiveCrossDeviceVerificationRequestActivity.this.EZpvd(TargetDeviceVerificationResult.BiometricChanged.OLrzqt);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity$onCreate$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReceiveCrossDeviceVerificationRequestActivity.this.new AnonymousClass6(continuation);
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
                ReceiveCrossDeviceVerificationRequestActivity.this.EZpvd(TargetDeviceVerificationResult.SessionTimeout.AEQbTJ);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void AhwBna() {
        getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.djSkpj, C6227aLP.Companion.OLrzqt()).addToBackStack(C6227aLP.class.getName()).commitAllowingStateLoss();
    }

    public final void gEmmrt() {
        getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.djSkpj, C6232aLU.Companion.KWHzl()).addToBackStack(C6232aLU.class.getName()).commitAllowingStateLoss();
    }

    public final void EZpvd(TargetDeviceVerificationResult targetDeviceVerificationResult) {
        Intent intent = new Intent();
        intent.putExtra("RESULT_TARGET_DEVICE_VERIFICATION_RESULT", targetDeviceVerificationResult);
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C52761wXj.Application.valueOf);
    }

    @Override // o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AYXKKw()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // o.AbstractActivityC33001moH, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "");
        if (AYXKKw()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean AYXKKw() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        ActivityResultCaller activityResultCaller = (Fragment) CollectionsKt___CollectionsKt.firstOrNull(fragments);
        return (activityResultCaller == null || !(activityResultCaller instanceof InterfaceC33040mou) || ((InterfaceC33040mou) activityResultCaller).AhwBna()) ? false : true;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        Input input = (Input) intent.getParcelableExtra("ARG_INPUT");
        if (input == null) {
            return;
        }
        djBIcL().AEQbTJ(input);
        AhwBna();
    }

    public static final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final String KWHzl;

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Input(parcel.readString());
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
        public static /* synthetic */ Input copy$default(Input input, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = input.KWHzl;
            }
            return input.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Input KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Input(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
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
            return (obj instanceof Input) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((Input) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
        }

        public Input(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public String toString() {
            return "Input(sessionId=" + this.KWHzl + ")";
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Intent copydefault(@NotNull Context context, @NotNull Input input) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(input, "");
            Intent intent = new Intent(context, (Class<?>) ReceiveCrossDeviceVerificationRequestActivity.class);
            intent.putExtra("ARG_INPUT", input);
            return intent;
        }
    }

    @Override // o.AbstractActivityC6218aLG, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6218aLG, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6218aLG, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6218aLG, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
