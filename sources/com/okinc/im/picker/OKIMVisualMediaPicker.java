package com.okinc.im.picker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.picker.OKIMVisualMediaPicker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C32979mnm;
import o.C35445nvW;
import o.C35724oBi;
import o.C35773oDd;
import o.C44156sFj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.C58113yvE;
import o.InterfaceC35331ntM;
import o.InterfaceC35332ntN;
import o.InterfaceC56387yDm;
import o.oCS;
import o.pUU;
import o.sFB;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class OKIMVisualMediaPicker implements DefaultLifecycleObserver {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final C35724oBi AYXKKw;
    public Function1<? super Activity, Unit> AhwBna;
    public final androidx.fragment.app.FragmentManager KWHzl;
    public final LifecycleOwner OLrzqt;
    public ActivityResultLauncher<Intent> copydefault;
    public final InterfaceC56387yDm djBIcL;
    public ActivityResultLauncher<PickVisualMediaRequest> gEmmrt;
    public ActivityResultLauncher<Intent> valueOf;

    public OKIMVisualMediaPicker(@NotNull LifecycleOwner lifecycleOwner, @NotNull ActivityResultRegistryOwner activityResultRegistryOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C35724oBi c35724oBi) {
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncherRegister;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c35724oBi, "");
        this.OLrzqt = lifecycleOwner;
        this.KWHzl = fragmentManager;
        this.AYXKKw = c35724oBi;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.oBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKIMVisualMediaPicker.AYXKKw(this.KWHzl);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.oBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKIMVisualMediaPicker.valueOf(this.OLrzqt);
            }
        });
        lifecycleOwner.getLifecycle().addObserver(this);
        pUU.KWHzl("OKIMVisualMediaPicker", "Register launchers");
        String str = "key_visual_media_picker_" + hashCode();
        String str2 = "key_preview_launcher_" + hashCode();
        String str3 = "key_fallback_launcher_" + hashCode();
        if (c35724oBi.EZpvd() > 1) {
            activityResultLauncherRegister = activityResultRegistryOwner.getActivityResultRegistry().register(str, new ActivityResultContracts.PickMultipleVisualMedia(c35724oBi.EZpvd()), new ActivityResultCallback() { // from class: o.oBw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    OKIMVisualMediaPicker.OLrzqt(this.KWHzl, (java.util.List) obj);
                }
            });
        } else {
            activityResultLauncherRegister = activityResultRegistryOwner.getActivityResultRegistry().register(str, new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: o.oBv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    OKIMVisualMediaPicker.OLrzqt(this.OLrzqt, (android.net.Uri) obj);
                }
            });
        }
        this.gEmmrt = activityResultLauncherRegister;
        this.valueOf = activityResultRegistryOwner.getActivityResultRegistry().register(str2, new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.oBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                OKIMVisualMediaPicker.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        this.copydefault = activityResultRegistryOwner.getActivityResultRegistry().register(str3, new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.oBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                OKIMVisualMediaPicker.OLrzqt(this.copydefault, (ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context KWHzl() {
        return C32979mnm.EZpvd.OLrzqt();
    }

    public final CoroutineDispatcher copydefault() {
        return (CoroutineDispatcher) this.AEQbTJ.getValue();
    }

    public static final CoroutineDispatcher AYXKKw(OKIMVisualMediaPicker oKIMVisualMediaPicker) {
        return ((InterfaceC35332ntN) C58113yvE.copydefault(oKIMVisualMediaPicker.KWHzl(), InterfaceC35332ntN.class)).ODWQjV();
    }

    public final oCS AEQbTJ() {
        return (oCS) this.djBIcL.getValue();
    }

    public static final oCS valueOf(OKIMVisualMediaPicker oKIMVisualMediaPicker) {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(oKIMVisualMediaPicker.KWHzl(), InterfaceC35331ntM.class)).RKDWNf();
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.picker.OKIMVisualMediaPicker.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final class TaskDescription extends Activity {
            public final List<Uri> AEQbTJ;
            public final List<Uri> EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.picker.OKIMVisualMediaPicker$Activity$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = taskDescription.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    list2 = taskDescription.EZpvd;
                }
                return taskDescription.KWHzl(list, list2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull List<? extends Uri> list, @NotNull List<? extends Uri> list2) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(list2, "");
                return new TaskDescription(list, list2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Uri> OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Uri> copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Ok(selectedMedia=" + this.AEQbTJ + ", useOriginal=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.net.Uri> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends android.net.Uri> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(@NotNull List<? extends Uri> list, @NotNull List<? extends Uri> list2) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(list2, "");
                this.AEQbTJ = list;
                this.EZpvd = list2;
            }
        }

        public static final class ActionBar extends Activity {
            public static final ActionBar AEQbTJ = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        public static final class StateListAnimator extends Activity {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                return stateListAnimator.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(message=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.picker.OKIMVisualMediaPicker.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final void OLrzqt(OKIMVisualMediaPicker oKIMVisualMediaPicker, List list) {
        Intrinsics.copydefault(list);
        oKIMVisualMediaPicker.copydefault((List<? extends Uri>) list);
    }

    public static final void OLrzqt(OKIMVisualMediaPicker oKIMVisualMediaPicker, Uri uri) {
        oKIMVisualMediaPicker.copydefault(yDY.OLrzqt(uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(OKIMVisualMediaPicker oKIMVisualMediaPicker, ActivityResult activityResult) {
        Pair pairOLrzqt;
        pUU.EZpvd("OKIMVisualMediaPicker", "result: " + activityResult);
        if (activityResult == null) {
            finishWithResult$default(oKIMVisualMediaPicker, yDY.AhwBna(), null, 2, null);
            return;
        }
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            if (data != null) {
                Object parcelableArrayListExtra = IntentCompat.getParcelableArrayListExtra(data, "selected_media", Uri.class);
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = yDY.AhwBna();
                }
                Object parcelableArrayListExtra2 = IntentCompat.getParcelableArrayListExtra(data, "use_original_image", Uri.class);
                if (parcelableArrayListExtra2 == null) {
                    parcelableArrayListExtra2 = yDY.AhwBna();
                }
                pairOLrzqt = C56390yDp.OLrzqt(parcelableArrayListExtra, parcelableArrayListExtra2);
                if (pairOLrzqt == null) {
                }
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(yDY.AhwBna(), yDY.AhwBna());
            }
            oKIMVisualMediaPicker.AEQbTJ(CollectionsKt___CollectionsKt.QfsBiF((List) pairOLrzqt.component1()), CollectionsKt___CollectionsKt.QfsBiF((List) pairOLrzqt.component2()));
            return;
        }
        finishWithResult$default(oKIMVisualMediaPicker, yDY.AhwBna(), null, 2, null);
    }

    public static final void OLrzqt(OKIMVisualMediaPicker oKIMVisualMediaPicker, ActivityResult activityResult) {
        pUU.EZpvd("OKIMVisualMediaPicker", "Fallback launcher result: " + activityResult);
        if (activityResult == null) {
            finishWithResult$default(oKIMVisualMediaPicker, yDY.AhwBna(), null, 2, null);
            return;
        }
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Uri data2 = data != null ? data.getData() : null;
            if (data2 != null) {
                oKIMVisualMediaPicker.copydefault(C56402yEa.EZpvd(data2));
                return;
            } else {
                finishWithResult$default(oKIMVisualMediaPicker, yDY.AhwBna(), null, 2, null);
                return;
            }
        }
        finishWithResult$default(oKIMVisualMediaPicker, yDY.AhwBna(), null, 2, null);
    }

    public final Object copydefault(@NotNull Continuation<? super Activity> continuation) {
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = this.gEmmrt;
        if (activityResultLauncher == null) {
            return Activity.ActionBar.AEQbTJ;
        }
        if (!EZpvd()) {
            pUU.valueOf("OKIMVisualMediaPicker", "Photo picker not available on this device, launching fallback.");
            return OLrzqt(continuation);
        }
        PickVisualMediaRequest PickVisualMediaRequest = PickVisualMediaRequestKt.PickVisualMediaRequest(this.AYXKKw.copydefault());
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.AhwBna = new TaskDescription(cancellableContinuationImpl);
        cancellableContinuationImpl.invokeOnCancellation(new ActionBar());
        try {
            activityResultLauncher.launch(PickVisualMediaRequest);
        } catch (Exception e) {
            pUU.AEQbTJ("OKIMVisualMediaPicker", "Failed to launch photo picker", e);
            this.AhwBna = null;
            Result.Application application = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(new Activity.StateListAnimator("Failed to launch photo picker: " + e.getMessage())));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final class TaskDescription implements Function1<Activity, Unit> {
        public final /* synthetic */ CancellableContinuation<Activity> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.im.picker.OKIMVisualMediaPicker$Activity> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super Activity> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Activity activity) {
            AEQbTJ(activity);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            CancellableContinuation<Activity> cancellableContinuation = this.EZpvd;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(activity));
        }
    }

    public static final class ActionBar implements Function1<Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Throwable th) {
            OKIMVisualMediaPicker.this.AhwBna = null;
        }
    }

    public final Object AEQbTJ(@NotNull List<? extends Uri> list, @NotNull Continuation<? super Activity> continuation) {
        if (list.isEmpty()) {
            return Activity.ActionBar.AEQbTJ;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.AhwBna = new Dialog(cancellableContinuationImpl);
        cancellableContinuationImpl.invokeOnCancellation(new FragmentManager());
        try {
            copydefault(list);
        } catch (Exception e) {
            pUU.AEQbTJ("OKIMVisualMediaPicker", "Failed to process pre-selected URIs", e);
            this.AhwBna = null;
            Result.Application application = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(new Activity.StateListAnimator("Failed to process pre-selected URIs: " + e.getMessage())));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final class Dialog implements Function1<Activity, Unit> {
        public final /* synthetic */ CancellableContinuation<Activity> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.im.picker.OKIMVisualMediaPicker$Activity> */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(CancellableContinuation<? super Activity> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Activity activity) {
            copydefault(activity);
            return Unit.INSTANCE;
        }

        public final void copydefault(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            CancellableContinuation<Activity> cancellableContinuation = this.copydefault;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(activity));
        }
    }

    public static final class FragmentManager implements Function1<Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Throwable th) {
            OKIMVisualMediaPicker.this.AhwBna = null;
        }
    }

    public final Object OLrzqt(Continuation<? super Activity> continuation) {
        ActivityResultLauncher<Intent> activityResultLauncher = this.copydefault;
        if (activityResultLauncher == null) {
            return new Activity.StateListAnimator("Fallback launcher not available");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.AhwBna = new Application(cancellableContinuationImpl);
        cancellableContinuationImpl.invokeOnCancellation(new PendingIntent());
        try {
            activityResultLauncher.launch(OLrzqt());
        } catch (Exception e) {
            pUU.AEQbTJ("OKIMVisualMediaPicker", "Failed to launch fallback picker", e);
            this.AhwBna = null;
            Result.Application application = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(new Activity.StateListAnimator("Failed to launch fallback picker: " + e.getMessage())));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final class Application implements Function1<Activity, Unit> {
        public final /* synthetic */ CancellableContinuation<Activity> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.im.picker.OKIMVisualMediaPicker$Activity> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super Activity> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Activity activity) {
            KWHzl(activity);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            CancellableContinuation<Activity> cancellableContinuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(activity));
        }
    }

    public static final class PendingIntent implements Function1<Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Throwable th) {
            OKIMVisualMediaPicker.this.AhwBna = null;
        }
    }

    public final void copydefault(List<? extends Uri> list) {
        pUU.KWHzl("OKIMVisualMediaPicker", "Selected paths: " + list);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new OKIMVisualMediaPicker$handleSelectedMedia$1(this, list, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(final List<? extends Uri> list, Continuation<? super Unit> continuation) throws Throwable {
        OKIMVisualMediaPicker$handleBroadcastRequest$1 oKIMVisualMediaPicker$handleBroadcastRequest$1;
        final OKIMVisualMediaPicker oKIMVisualMediaPicker;
        if (continuation instanceof OKIMVisualMediaPicker$handleBroadcastRequest$1) {
            oKIMVisualMediaPicker$handleBroadcastRequest$1 = (OKIMVisualMediaPicker$handleBroadcastRequest$1) continuation;
            int i = oKIMVisualMediaPicker$handleBroadcastRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMVisualMediaPicker$handleBroadcastRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMVisualMediaPicker$handleBroadcastRequest$1 = new OKIMVisualMediaPicker$handleBroadcastRequest$1(this, continuation);
            }
        }
        Object objOLrzqt = oKIMVisualMediaPicker$handleBroadcastRequest$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMVisualMediaPicker$handleBroadcastRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            oCS ocsAEQbTJ = AEQbTJ();
            oKIMVisualMediaPicker$handleBroadcastRequest$1.L$0 = this;
            oKIMVisualMediaPicker$handleBroadcastRequest$1.L$1 = list;
            oKIMVisualMediaPicker$handleBroadcastRequest$1.label = 1;
            objOLrzqt = ocsAEQbTJ.OLrzqt(oKIMVisualMediaPicker$handleBroadcastRequest$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            oKIMVisualMediaPicker = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) oKIMVisualMediaPicker$handleBroadcastRequest$1.L$1;
            oKIMVisualMediaPicker = (OKIMVisualMediaPicker) oKIMVisualMediaPicker$handleBroadcastRequest$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        C35773oDd c35773oDd = (C35773oDd) objOLrzqt;
        Function2 function2 = new Function2() { // from class: o.oBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OKIMVisualMediaPicker.OLrzqt(this.OLrzqt, list, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        };
        if (c35773oDd != null) {
            C35445nvW.Activity activity = C35445nvW.Companion;
            C35445nvW c35445nvWOLrzqt = activity.OLrzqt("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION", oKIMVisualMediaPicker.AYXKKw.OLrzqt());
            c35445nvWOLrzqt.show(oKIMVisualMediaPicker.KWHzl, (String) null);
            FragmentKt.setFragmentResultListener(c35445nvWOLrzqt, activity.EZpvd("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION"), function2);
            Function2 function22 = new Function2() { // from class: o.oBr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return OKIMVisualMediaPicker.KWHzl(this.AEQbTJ, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            };
            FragmentKt.setFragmentResultListener(c35445nvWOLrzqt, activity.AEQbTJ("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION"), function22);
            FragmentKt.setFragmentResultListener(c35445nvWOLrzqt, activity.KWHzl("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION"), function22);
        } else {
            function2.invoke("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION", BundleKt.bundleOf());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OKIMVisualMediaPicker oKIMVisualMediaPicker, List list, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        finishWithResult$default(oKIMVisualMediaPicker, list, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(OKIMVisualMediaPicker oKIMVisualMediaPicker, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        finishWithResult$default(oKIMVisualMediaPicker, yDY.AhwBna(), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.picker.OKIMVisualMediaPicker */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void finishWithResult$default(OKIMVisualMediaPicker oKIMVisualMediaPicker, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = yDY.AhwBna();
        }
        oKIMVisualMediaPicker.AEQbTJ((List<? extends Uri>) list, (List<? extends Uri>) list2);
    }

    public final void AEQbTJ(List<? extends Uri> list, List<? extends Uri> list2) {
        Activity.TaskDescription taskDescription = new Activity.TaskDescription(list, list2);
        Function1<? super Activity, Unit> function1 = this.AhwBna;
        if (function1 != null) {
            function1.invoke(taskDescription);
        }
        this.AhwBna = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        pUU.KWHzl("OKIMVisualMediaPicker", "Cleaning up launcher.");
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = this.gEmmrt;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.gEmmrt = null;
        ActivityResultLauncher<Intent> activityResultLauncher2 = this.valueOf;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        this.valueOf = null;
        ActivityResultLauncher<Intent> activityResultLauncher3 = this.copydefault;
        if (activityResultLauncher3 != null) {
            activityResultLauncher3.unregister();
        }
        this.copydefault = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(List<? extends Uri> list, Continuation<? super List<? extends Uri>> continuation) throws Throwable {
        OKIMVisualMediaPicker$getCachedUris$1 oKIMVisualMediaPicker$getCachedUris$1;
        Iterator it;
        OKIMVisualMediaPicker oKIMVisualMediaPicker;
        Collection collection;
        List list2;
        if (continuation instanceof OKIMVisualMediaPicker$getCachedUris$1) {
            oKIMVisualMediaPicker$getCachedUris$1 = (OKIMVisualMediaPicker$getCachedUris$1) continuation;
            int i = oKIMVisualMediaPicker$getCachedUris$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKIMVisualMediaPicker$getCachedUris$1.label = i - Integer.MIN_VALUE;
            } else {
                oKIMVisualMediaPicker$getCachedUris$1 = new OKIMVisualMediaPicker$getCachedUris$1(this, continuation);
            }
        }
        Object obj = oKIMVisualMediaPicker$getCachedUris$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKIMVisualMediaPicker$getCachedUris$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            oKIMVisualMediaPicker = this;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) oKIMVisualMediaPicker$getCachedUris$1.L$0;
                C56391yDq.AEQbTJ(obj);
                return list2;
            }
            Uri uri = (Uri) oKIMVisualMediaPicker$getCachedUris$1.L$4;
            it = (Iterator) oKIMVisualMediaPicker$getCachedUris$1.L$3;
            collection = (Collection) oKIMVisualMediaPicker$getCachedUris$1.L$2;
            List<? extends Uri> list3 = (List) oKIMVisualMediaPicker$getCachedUris$1.L$1;
            oKIMVisualMediaPicker = (OKIMVisualMediaPicker) oKIMVisualMediaPicker$getCachedUris$1.L$0;
            C56391yDq.AEQbTJ(obj);
            C44156sFj c44156sFj = (C44156sFj) obj;
            Uri uriOLrzqt = c44156sFj == null ? c44156sFj.OLrzqt() : null;
            if (uriOLrzqt == null) {
                pUU.KWHzl("OKIMVisualMediaPicker", "Failed to cache: " + uri);
            }
            if (uriOLrzqt != null) {
                collection.add(uriOLrzqt);
            }
            list = list3;
            if (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                Context contextKWHzl = oKIMVisualMediaPicker.KWHzl();
                oKIMVisualMediaPicker$getCachedUris$1.L$0 = oKIMVisualMediaPicker;
                oKIMVisualMediaPicker$getCachedUris$1.L$1 = list;
                oKIMVisualMediaPicker$getCachedUris$1.L$2 = collection;
                oKIMVisualMediaPicker$getCachedUris$1.L$3 = it;
                oKIMVisualMediaPicker$getCachedUris$1.L$4 = uri2;
                oKIMVisualMediaPicker$getCachedUris$1.label = 1;
                Object objDbNXlk = sFB.DbNXlk(uri2, contextKWHzl, oKIMVisualMediaPicker$getCachedUris$1);
                if (objDbNXlk == objCopydefault) {
                    return objCopydefault;
                }
                list3 = list;
                uri = uri2;
                obj = objDbNXlk;
                C44156sFj c44156sFj2 = (C44156sFj) obj;
                if (c44156sFj2 == null) {
                }
                if (uriOLrzqt == null) {
                }
                if (uriOLrzqt != null) {
                }
                list = list3;
                if (it.hasNext()) {
                    List list4 = (List) collection;
                    if (list4.size() == list.size()) {
                        return list4;
                    }
                    CoroutineDispatcher coroutineDispatcherCopydefault = oKIMVisualMediaPicker.copydefault();
                    OKIMVisualMediaPicker$getCachedUris$2 oKIMVisualMediaPicker$getCachedUris$2 = new OKIMVisualMediaPicker$getCachedUris$2(null);
                    oKIMVisualMediaPicker$getCachedUris$1.L$0 = list4;
                    oKIMVisualMediaPicker$getCachedUris$1.L$1 = null;
                    oKIMVisualMediaPicker$getCachedUris$1.L$2 = null;
                    oKIMVisualMediaPicker$getCachedUris$1.L$3 = null;
                    oKIMVisualMediaPicker$getCachedUris$1.L$4 = null;
                    oKIMVisualMediaPicker$getCachedUris$1.label = 2;
                    if (BuildersKt.withContext(coroutineDispatcherCopydefault, oKIMVisualMediaPicker$getCachedUris$2, oKIMVisualMediaPicker$getCachedUris$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    list2 = list4;
                    return list2;
                }
            }
        }
    }

    public final boolean EZpvd() {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            PackageManager packageManager = KWHzl().getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L));
            } else {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            }
            Intrinsics.copydefault(listQueryIntentActivities);
            return !listQueryIntentActivities.isEmpty();
        } catch (Exception e) {
            pUU.AEQbTJ("OKIMVisualMediaPicker", "Error checking photo picker availability", e);
            return false;
        }
    }

    public final Intent OLrzqt() {
        String str;
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaTypeCopydefault = this.AYXKKw.copydefault();
        if (visualMediaTypeCopydefault instanceof ActivityResultContracts.PickVisualMedia.ImageOnly) {
            str = "image/*";
        } else {
            str = visualMediaTypeCopydefault instanceof ActivityResultContracts.PickVisualMedia.VideoOnly ? "video/*" : "image/*,video/*";
        }
        intent.setType(str);
        return intent;
    }

    public final void KWHzl(List<? extends Uri> list) {
        for (Uri uri : list) {
            try {
                KWHzl().getContentResolver().takePersistableUriPermission(uri, 1);
                pUU.KWHzl("OKIMVisualMediaPicker", "Successfully took persistent permission for: " + uri);
            } catch (SecurityException e) {
                pUU.KWHzl("OKIMVisualMediaPicker", "(PhotoPicker URIs may not support persistent permissions on all devices)");
                pUU.OLrzqt("OKIMVisualMediaPicker", "Could not take persistent permission for URI: " + uri, e);
            } catch (Exception e2) {
                pUU.OLrzqt("OKIMVisualMediaPicker", "Unexpected error taking persistent permission for URI: " + uri, e2);
            }
        }
    }
}
