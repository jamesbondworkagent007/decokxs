package com.okinc.im.imui.messages.audio.call;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel;
import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.im.imui.messages.audio.call.model.CallRequest;
import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.TagColorMode;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC37125ont;
import o.AbstractC37162ood;
import o.ActivityC37592owj;
import o.C33069mpW;
import o.C33070mpX;
import o.C35399nuc;
import o.C35891oHn;
import o.C35893oHp;
import o.C37093onN;
import o.C37127onv;
import o.C37170ool;
import o.C37683oyU;
import o.C37716ozA;
import o.C37724ozI;
import o.C44124sEe;
import o.C44157sFk;
import o.C44170sFx;
import o.C52761wXj;
import o.C55296xhK;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56444yFp;
import o.C56524yIo;
import o.C56529yIt;
import o.C60121zwJ;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.ServiceC37177oos;
import o.ViewOnClickListenerC54939xaY;
import o.nII;
import o.pTD;
import o.rVN;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallViewActivity extends AbstractActivityC37125ont {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public nII AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final ActivityResultLauncher<Intent> djBIcL;
    public PermissionDialogState valueOf;
    public final int gEmmrt = 1001;
    public final int AYXKKw = 1002;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CallStatus.values().length];
            try {
                iArr[CallStatus.DIALING_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallStatus.DIALING_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallStatus.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallStatus.NOT_ON_CALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CallStatus.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CallStatus.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    public OKIMAudioCallViewActivity() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(OKIMAudioCallViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.onw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                OKIMAudioCallViewActivity.AEQbTJ(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
        this.valueOf = PermissionDialogState.NONE;
    }

    /* JADX DEBUG: Possible override for method o.ont.gEmmrt()V */
    public final OKIMAudioCallViewModel gEmmrt() {
        return (OKIMAudioCallViewModel) this.AkhnZx.getValue();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Intent copydefault(@NotNull Context context, @NotNull CallRequest callRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(callRequest, "");
            Intent intent = new Intent(context, (Class<?>) OKIMAudioCallViewActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("key_audio_call_request", callRequest);
            return intent;
        }
    }

    public static final void AEQbTJ(OKIMAudioCallViewActivity oKIMAudioCallViewActivity, ActivityResult activityResult) {
        Intent data = activityResult.getData();
        if (activityResult.getResultCode() != -1 || data == null) {
            return;
        }
        List<String> stringArrayListExtra = data.getStringArrayListExtra("LIST_FINAL_RESULT");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = yDY.AhwBna();
        }
        if (!stringArrayListExtra.isEmpty()) {
            C44124sEe.imLogVoiceCall$default("service_activity: inviting members - " + stringArrayListExtra, null, 2, null);
            oKIMAudioCallViewActivity.gEmmrt().KWHzl(stringArrayListExtra);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PermissionDialogState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PermissionDialogState[] $VALUES;
        public static final PermissionDialogState NONE = new PermissionDialogState("NONE", 0);
        public static final PermissionDialogState SHOWING_OVERLAY_DIALOG = new PermissionDialogState("SHOWING_OVERLAY_DIALOG", 1);
        public static final PermissionDialogState NAVIGATING_TO_OVERLAY_SETTINGS = new PermissionDialogState("NAVIGATING_TO_OVERLAY_SETTINGS", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PermissionDialogState[] $values() {
            return new PermissionDialogState[]{NONE, SHOWING_OVERLAY_DIALOG, NAVIGATING_TO_OVERLAY_SETTINGS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PermissionDialogState> getEntries() {
            return $ENTRIES;
        }

        private PermissionDialogState(String str, int i) {
        }

        static {
            PermissionDialogState[] permissionDialogStateArr$values = $values();
            $VALUES = permissionDialogStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(permissionDialogStateArr$values);
        }

        public static PermissionDialogState valueOf(String str) {
            return (PermissionDialogState) Enum.valueOf(PermissionDialogState.class, str);
        }

        public static PermissionDialogState[] values() {
            return (PermissionDialogState[]) $VALUES.clone();
        }
    }

    @Override // o.AbstractActivityC37125ont, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nII niiAEQbTJ = nII.AEQbTJ(getLayoutInflater());
        this.AhwBna = niiAEQbTJ;
        if (niiAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            niiAEQbTJ = null;
        }
        setContentView(niiAEQbTJ.getRoot());
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(2621440);
        }
        C44124sEe.imLogVoiceCall$default("service_activity:onCreate => handleIntentInfo", null, 2, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        KWHzl(intent);
        ejfBZ();
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "");
        EZpvd(intent2);
        if (!gEmmrt().DbNXlk()) {
            C44124sEe.imLogVoiceCall$default("service_activity:initViews, hasValidIds: false => hanging up", null, 2, null);
            AhwBna();
        } else {
            AuCTel();
            fIwbmz();
            getWindow().getDecorView().post(new Runnable() { // from class: o.onF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    OKIMAudioCallViewActivity.isConnected(this.KWHzl);
                }
            });
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ OKIMAudioCallViewActivity KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = oKIMAudioCallViewActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.gEmmrt().OcIXYQ();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ OKIMAudioCallViewActivity EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = oKIMAudioCallViewActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault("action_audio_call_deny");
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ OKIMAudioCallViewActivity AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = oKIMAudioCallViewActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.copydefault("action_audio_call_hang_up");
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ OKIMAudioCallViewActivity EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = oKIMAudioCallViewActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.EZpvd.valueOf()) {
                    this.EZpvd.fJNWhG();
                    this.EZpvd.finish();
                }
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ OKIMAudioCallViewActivity OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = oKIMAudioCallViewActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                String strValueOf = this.OLrzqt.gEmmrt().valueOf();
                if (strValueOf != null) {
                    C37093onN.Companion.KWHzl(strValueOf).show(this.OLrzqt.getSupportFragmentManager(), "CallMembersBottomSheet");
                }
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ OKIMAudioCallViewActivity AEQbTJ;
        public final /* synthetic */ nII EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, nII nii, OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = nii;
            this.AEQbTJ = oKIMAudioCallViewActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.valueOf.setEnabled(false);
                this.EZpvd.KWHzl.setVisibility(0);
                this.EZpvd.EZpvd.setVisibility(8);
                C44124sEe.imLogVoiceCall$default("service_activity:send_command_accept_call", null, 2, null);
                this.AEQbTJ.gEmmrt().AxsJAY();
                C37127onv c37127onv = C37127onv.AEQbTJ;
                String string = this.AEQbTJ.getString(C35399nuc.LoaderManager.swzYdv);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c37127onv.copydefault(string);
                nII nii = this.EZpvd;
                nii.valueOf.postDelayed(new Application(nii), 500L);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ OKIMAudioCallViewActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = oKIMAudioCallViewActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.gEmmrt().ORxRYg();
            }
        }
    }

    public static final void isConnected(OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
        rVN.reportFullyDrawn$default((android.app.Activity) oKIMAudioCallViewActivity, true, (String) null, 2, (Object) null);
    }

    public final void fIwbmz() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKIMAudioCallViewActivity$subscribeToStatusEvents$1(this, null), 3, null);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        C44124sEe.imLogVoiceCall$default("service_activity:onNewIntent => handleIntentInfo", null, 2, null);
        KWHzl(intent);
    }

    private final void ejfBZ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKIMAudioCallViewActivity$initViewModel$1(this, null), 3, null);
    }

    public final void KWHzl(CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeCallUIState$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeCallUIState$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeCallUIState$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeCallUIState$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeCallUIState$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeCallUIState$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeCallUIState$7(this, null), 3, null);
    }

    public final void EZpvd(CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeAudioControlState$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKIMAudioCallViewActivity$observeAudioControlState$2(this, null), 3, null);
    }

    public final void KWHzl(String str) {
        OKConversationType oKConversationType;
        if (gEmmrt().hDKMBd()) {
            nII nii = this.AhwBna;
            if (nii == null) {
                Intrinsics.gEmmrt("");
                nii = null;
            }
            nii.AYXKKw.setImageResource(C35399nuc.ActionBar.DbNXlk);
        } else if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            if (gEmmrt().AuCTelauCTel()) {
                nII nii2 = this.AhwBna;
                if (nii2 == null) {
                    Intrinsics.gEmmrt("");
                    nii2 = null;
                }
                C35893oHp c35893oHp = nii2.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
                OKConversationType oKConversationType2 = OKConversationType.GROUP;
                String value = gEmmrt().AhwBna().getValue();
                C35891oHn.OLrzqt(c35893oHp, null, oKConversationType2, value != null ? value : "");
            } else {
                nII nii3 = this.AhwBna;
                if (nii3 == null) {
                    Intrinsics.gEmmrt("");
                    nii3 = null;
                }
                nii3.AYXKKw.setImageResource(C35399nuc.ActionBar.DbNXlk);
            }
        } else {
            if (gEmmrt().AuCTelauCTel()) {
                oKConversationType = OKConversationType.GROUP;
            } else {
                oKConversationType = OKConversationType.PRIVATE;
            }
            nII nii4 = this.AhwBna;
            if (nii4 == null) {
                Intrinsics.gEmmrt("");
                nii4 = null;
            }
            C35893oHp c35893oHp2 = nii4.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            String value2 = gEmmrt().AhwBna().getValue();
            C35891oHn.OLrzqt(c35893oHp2, str, oKConversationType, value2 != null ? value2 : "");
        }
        C44124sEe.imLogVoiceCall$default("service_activity: avatar updated, isGroupCall=" + gEmmrt().AuCTelauCTel() + ", url=" + str, null, 2, null);
    }

    public final void AEQbTJ(OfficialTagInfo officialTagInfo) {
        nII nii = null;
        if (gEmmrt().hDKMBd()) {
            nII nii2 = this.AhwBna;
            if (nii2 == null) {
                Intrinsics.gEmmrt("");
                nii2 = null;
            }
            TextView textView = nii2.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            nII nii3 = this.AhwBna;
            if (nii3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                nii = nii3;
            }
            TextView textView2 = nii.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView2, new OfficialTagInfo(yDY.AhwBna(), C56402yEa.EZpvd(-1), yDY.AhwBna(), C56402yEa.EZpvd(OfficialTagType.Official)), 0, TagColorMode.DARK, false, false, false, 58, null);
            return;
        }
        if (officialTagInfo != null) {
            if (C44170sFx.KWHzl(officialTagInfo)) {
                nII nii4 = this.AhwBna;
                if (nii4 == null) {
                    Intrinsics.gEmmrt("");
                    nii4 = null;
                }
                nii4.isConnected.setText(C37683oyU.KWHzl(officialTagInfo));
                nII nii5 = this.AhwBna;
                if (nii5 == null) {
                    Intrinsics.gEmmrt("");
                    nii5 = null;
                }
                TextView textView3 = nii5.isConnected;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                C37716ozA.OLrzqt(textView3, officialTagInfo, TagColorMode.DARK);
                nII nii6 = this.AhwBna;
                if (nii6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    nii = nii6;
                }
                TextView textView4 = nii.isConnected;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                return;
            }
            nII nii7 = this.AhwBna;
            if (nii7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                nii = nii7;
            }
            TextView textView5 = nii.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView5, officialTagInfo, 0, TagColorMode.DARK, false, false, false, 58, null);
            return;
        }
        nII nii8 = this.AhwBna;
        if (nii8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            nii = nii8;
        }
        TextView textView6 = nii.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(8);
    }

    private final void AuCTel() {
        fetchVPNInfo();
        DbNXlk();
        isConnected();
        values();
    }

    public final void fetchVPNInfo() {
        C44124sEe.imLogVoiceCall$default("service_activity:on_create micEnabled[" + gEmmrt().isConnected().getValue() + "] speakerEnabled[" + gEmmrt().AuCTel().getValue() + "] isOnActiveCall[" + gEmmrt().zsXlph() + "] actualCallStatus[" + gEmmrt().AYXKKw() + "]", null, 2, null);
    }

    public final void DbNXlk() {
        nII nii = this.AhwBna;
        nII nii2 = null;
        if (nii == null) {
            Intrinsics.gEmmrt("");
            nii = null;
        }
        ImageView imageView = nii.values;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        nII nii3 = this.AhwBna;
        if (nii3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            nii2 = nii3;
        }
        ImageView imageView2 = nii2.AhwBna;
        imageView2.setOnClickListener(new StateListAnimator(imageView2, 1000L, this));
    }

    public final void AEQbTJ(boolean z) {
        nII nii = this.AhwBna;
        if (nii == null) {
            Intrinsics.gEmmrt("");
            nii = null;
        }
        ImageView imageView = nii.AhwBna;
        imageView.setImageResource(z ? C35399nuc.ActionBar.UeEOUB : C35399nuc.ActionBar.djSkpj);
        imageView.setContentDescription(getString(z ? C35399nuc.LoaderManager.ULRxlR : C35399nuc.LoaderManager.Ufzxmz));
    }

    public final void KWHzl(boolean z) {
        nII nii = this.AhwBna;
        if (nii == null) {
            Intrinsics.gEmmrt("");
            nii = null;
        }
        ImageView imageView = nii.values;
        imageView.setImageResource(z ? C35399nuc.ActionBar.dvKsVJ : C35399nuc.ActionBar.RcXXUw);
        imageView.setContentDescription(getString(z ? C35399nuc.LoaderManager.aJFbMH : C35399nuc.LoaderManager.UscePu));
    }

    public final void isConnected() {
        nII nii = this.AhwBna;
        if (nii == null) {
            Intrinsics.gEmmrt("");
            nii = null;
        }
        ImageView imageView = nii.djBIcL;
        imageView.setOnClickListener(new FragmentManager(imageView, 1000L, this));
        ImageView imageView2 = nii.gEmmrt;
        imageView2.setOnClickListener(new LoaderManager(imageView2, 1000L, this));
        TextView textView = nii.AEQbTJ;
        textView.setOnClickListener(new PendingIntent(textView, 1000L, nii, this));
        ImageView imageView3 = nii.valueOf;
        imageView3.setOnClickListener(new Fragment(imageView3, 1000L, this));
        TextView textView2 = nii.copydefault;
        textView2.setOnClickListener(new Dialog(textView2, 1000L, this));
    }

    public static final class Application implements Runnable {
        public final /* synthetic */ nII EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(nII nii) {
            this.EZpvd = nii;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.EZpvd.valueOf.setEnabled(true);
        }
    }

    public final void values() {
        nII nii = this.AhwBna;
        if (nii == null) {
            Intrinsics.gEmmrt("");
            nii = null;
        }
        String value = gEmmrt().AhwBna().getValue();
        if (value != null && !StringsKt__StringsKt.fARcdN((CharSequence) value)) {
            nii.fJNWhG.setText(value);
            C44124sEe.imLogVoiceCall$default("service_activity:initViews, using provided callerName: " + value, null, 2, null);
        }
        KWHzl(gEmmrt().OLrzqt().getValue());
        if (gEmmrt().hDKMBd()) {
            AEQbTJ((OfficialTagInfo) null);
        }
    }

    public final void AEQbTJ(GroupVoiceCallData groupVoiceCallData) {
        nII nii = this.AhwBna;
        if (nii == null) {
            Intrinsics.gEmmrt("");
            nii = null;
        }
        if (!gEmmrt().AuCTelauCTel()) {
            ImageView imageView = nii.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            return;
        }
        if (Intrinsics.EZpvd((Object) (groupVoiceCallData != null ? groupVoiceCallData.getInitiatorUid() : null), (Object) C44157sFk.KWHzl())) {
            nii.gEmmrt.setImageResource(C52761wXj.TaskDescription.registerUser);
            ImageView imageView2 = nii.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            return;
        }
        if (groupVoiceCallData != null) {
            nii.gEmmrt.setImageResource(C52761wXj.TaskDescription.vLaW);
            ImageView imageView3 = nii.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(0);
            return;
        }
        ImageView imageView4 = nii.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        imageView4.setVisibility(8);
    }

    public final void AkhnZx() {
        String strValueOf = gEmmrt().valueOf();
        if (strValueOf == null) {
            return;
        }
        List<String> listEZpvd = gEmmrt().EZpvd();
        C44124sEe.imLogVoiceCall$default("service_activity: launching member selector - groupId=" + strValueOf + ", activeUserIds=" + listEZpvd, null, 2, null);
        this.djBIcL.launch(ActivityC37592owj.Companion.OLrzqt(this, listEZpvd, strValueOf));
    }

    public final void AEQbTJ(OKIMAudioCallViewModel.StateListAnimator stateListAnimator) {
        nII nii = this.AhwBna;
        if (nii == null) {
            Intrinsics.gEmmrt("");
            nii = null;
        }
        if (stateListAnimator instanceof OKIMAudioCallViewModel.StateListAnimator.TaskDescription) {
            nii.AuCTel.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.sTzBva));
            TextView textView = nii.AuCTel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            C44124sEe.imLogVoiceCall$default("service_activity: subheader = Calling..", null, 2, null);
            return;
        }
        if (stateListAnimator instanceof OKIMAudioCallViewModel.StateListAnimator.Activity) {
            OKIMAudioCallViewModel.StateListAnimator.Activity activity = (OKIMAudioCallViewModel.StateListAnimator.Activity) stateListAnimator;
            nii.AuCTel.setText(activity.KWHzl());
            TextView textView2 = nii.AuCTel;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            C44124sEe.imLogVoiceCall$default("service_activity: subheader = " + activity.KWHzl(), null, 2, null);
            return;
        }
        if (stateListAnimator instanceof OKIMAudioCallViewModel.StateListAnimator.Application) {
            OKIMAudioCallViewModel.StateListAnimator.Application application = (OKIMAudioCallViewModel.StateListAnimator.Application) stateListAnimator;
            nii.AuCTel.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.DPhTBN, C56424yEw.gEmmrt(C56390yDp.OLrzqt("user1", application.AEQbTJ()), C56390yDp.OLrzqt("user2", application.EZpvd()))));
            TextView textView3 = nii.AuCTel;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            C44124sEe.imLogVoiceCall$default("service_activity: subheader = " + application.AEQbTJ() + ", " + application.EZpvd(), null, 2, null);
            return;
        }
        if (stateListAnimator instanceof OKIMAudioCallViewModel.StateListAnimator.C0466StateListAnimator) {
            OKIMAudioCallViewModel.StateListAnimator.C0466StateListAnimator c0466StateListAnimator = (OKIMAudioCallViewModel.StateListAnimator.C0466StateListAnimator) stateListAnimator;
            nii.AuCTel.setText(pTD.copydefault(getResources(), C35399nuc.Fragment.AEQbTJ, c0466StateListAnimator.AEQbTJ(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("user1", c0466StateListAnimator.KWHzl()), C56390yDp.OLrzqt("user2", c0466StateListAnimator.OLrzqt()), C56390yDp.OLrzqt("num", Integer.valueOf(c0466StateListAnimator.AEQbTJ())))));
            TextView textView4 = nii.AuCTel;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            C44124sEe.imLogVoiceCall$default("service_activity: subheader = " + c0466StateListAnimator.KWHzl() + ", " + c0466StateListAnimator.OLrzqt() + " and " + c0466StateListAnimator.AEQbTJ() + " others", null, 2, null);
            return;
        }
        if (!(stateListAnimator instanceof OKIMAudioCallViewModel.StateListAnimator.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        TextView textView5 = nii.AuCTel;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
        C44124sEe.imLogVoiceCall$default("service_activity: subheader = Hidden", null, 2, null);
    }

    public final void EZpvd(Intent intent) {
        Object objM7377constructorimpl;
        if (!intent.getBooleanExtra("KEY_FROM_FULL_SCREEN_INTENT", false)) {
            C44124sEe.imLogVoiceCall$default("service_activity:handleFullScreenIntentLaunch: not from full-screen intent, skip", null, 2, null);
            return;
        }
        ServiceC37177oos.StateListAnimator stateListAnimator = ServiceC37177oos.Companion;
        if (stateListAnimator.AEQbTJ()) {
            C44124sEe.imLogVoiceCall$default("service_activity:handleFullScreenIntentLaunch: service already started, skip", null, 2, null);
            return;
        }
        C44124sEe.imLogVoiceCall$default("service_activity:handleFullScreenIntentLaunch: starting service from activity", null, 2, null);
        OKCallSession oKCallSession = (OKCallSession) IntentCompat.getParcelableExtra(intent, "key_audio_call_call_session_event", OKCallSession.class);
        if (oKCallSession == null) {
            C44124sEe.imLogVoiceCall$default("service_activity:handleFullScreenIntentLaunch: no call session in intent, skip", null, 2, null);
            return;
        }
        Intent intentCopydefault = stateListAnimator.copydefault(this, new AbstractC37162ood.Activity("action_audio_call_call_in", null, null, oKCallSession, new AudioCallUIParams(false, false, false, null, null, false, gEmmrt().iwGUEr(), false, 191, null), null, null, 102, null));
        try {
            Result.Application application = Result.Companion;
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intentCopydefault);
            } else {
                startService(intentCopydefault);
            }
            C44124sEe.imLogVoiceCall$default("service_activity:handleFullScreenIntentLaunch: service started successfully", null, 2, null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.fIwbmz("service_activity:handleFullScreenIntentLaunch: error starting service", thM7380exceptionOrNullimpl);
        }
    }

    public final void KWHzl(Intent intent) {
        if (!gEmmrt().DbNXlk()) {
            C44124sEe.imLogVoiceCall$default("service_activity:handleIntentInfo, hasValidIds: false => hanging up", null, 2, null);
            AhwBna();
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("key_is_from_notification", false);
        CallStatus value = gEmmrt().fIwbmz().getValue();
        C44124sEe.imLogVoiceCall$default("service_activity:handleIntentInfo isCheckPermissions[" + gEmmrt().iwGUEr() + "] isFromNoticeView[" + gEmmrt().zLjUOn() + "] isFromBackgroundPush[" + gEmmrt().AubY() + "] callStatus[" + value + "] isFromNotification[" + booleanExtra + "]", null, 2, null);
        KWHzl(value, false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.valueOf == PermissionDialogState.SHOWING_OVERLAY_DIALOG) {
                return true;
            }
            return !valueOf();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void KWHzl(CallStatus callStatus, boolean z) {
        nII nii = null;
        switch (TaskDescription.AEQbTJ[callStatus.ordinal()]) {
            case 1:
                nII nii2 = this.AhwBna;
                if (nii2 == null) {
                    Intrinsics.gEmmrt("");
                    nii2 = null;
                }
                nii2.KWHzl.setVisibility(0);
                nII nii3 = this.AhwBna;
                if (nii3 == null) {
                    Intrinsics.gEmmrt("");
                    nii3 = null;
                }
                nii3.EZpvd.setVisibility(8);
                nII nii4 = this.AhwBna;
                if (nii4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    nii = nii4;
                }
                nii.fetchVPNInfo.setText(getString(C35399nuc.LoaderManager.sTzBva));
                return;
            case 2:
                nII nii5 = this.AhwBna;
                if (nii5 == null) {
                    Intrinsics.gEmmrt("");
                    nii5 = null;
                }
                nii5.KWHzl.setVisibility(8);
                nII nii6 = this.AhwBna;
                if (nii6 == null) {
                    Intrinsics.gEmmrt("");
                    nii6 = null;
                }
                nii6.EZpvd.setVisibility(0);
                nII nii7 = this.AhwBna;
                if (nii7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    nii = nii7;
                }
                nii.fetchVPNInfo.setText(getString(C35399nuc.LoaderManager.fXHmeK));
                return;
            case 3:
                nII nii8 = this.AhwBna;
                if (nii8 == null) {
                    Intrinsics.gEmmrt("");
                    nii8 = null;
                }
                nii8.KWHzl.setVisibility(0);
                nII nii9 = this.AhwBna;
                if (nii9 == null) {
                    Intrinsics.gEmmrt("");
                    nii9 = null;
                }
                nii9.EZpvd.setVisibility(8);
                postDelay(new Runnable() { // from class: o.onC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        OKIMAudioCallViewActivity.gEmmrt(this.KWHzl);
                    }
                }, 800L);
                if (z || !gEmmrt().zLjUOn()) {
                    startCounting$default(this, false, 1, null);
                    return;
                }
                return;
            case 4:
            case 5:
            case 6:
                postDelay(new Runnable() { // from class: o.onD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        OKIMAudioCallViewActivity.AhwBna(this.OLrzqt);
                    }
                }, 1000L);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void gEmmrt(OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
        oKIMAudioCallViewActivity.gEmmrt().QKVWgx();
    }

    public static final void AhwBna(OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
        oKIMAudioCallViewActivity.finish();
    }

    public static /* synthetic */ void startCounting$default(OKIMAudioCallViewActivity oKIMAudioCallViewActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        oKIMAudioCallViewActivity.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        if (z) {
            C44124sEe.imLogVoiceCall$default("service_activity:send_command_accept_call_after_permission", null, 2, null);
            gEmmrt().AxsJAY();
        }
        if (!C37170ool.AEQbTJ.OLrzqt()) {
            gEmmrt().QOLQEE();
            C44124sEe.imLogVoiceCall$default("service_activity:startCounting - CallTimer started", null, 2, null);
        } else {
            C44124sEe.imLogVoiceCall$default("service_activity:startCounting - CallTimer already running, skipping start", null, 2, null);
        }
    }

    public final String KWHzl(long j) {
        long j2 = IMarketApiService.SIXTY_MINUTES;
        long j3 = j / j2;
        long j4 = 60;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        if (j3 > 0) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        C56529yIt c56529yIt2 = C56529yIt.KWHzl;
        String str2 = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final void AhwBna() {
        if (this.valueOf == PermissionDialogState.SHOWING_OVERLAY_DIALOG) {
            C44124sEe.imLogVoiceCall$default("service_activity:hangUpAudioCallImmediately blocked - permission dialog is showing", null, 2, null);
            return;
        }
        C44124sEe.imLogVoiceCall$default("service_activity:send_command_hang_up_immediately", null, 2, null);
        gEmmrt().zuBGHE();
        finish();
    }

    public final void copydefault(String str) {
        String callId;
        C44124sEe.imLogVoiceCall$default("activity:hangUpAudioCall: reason[" + str + "]", null, 2, null);
        OKCallSession oKCallSessionGEmmrt = gEmmrt().gEmmrt();
        C44124sEe.imLogVoiceCall$default("activity:hangUpAudioCall: callType[" + (oKCallSessionGEmmrt != null ? oKCallSessionGEmmrt.getCallType() : null) + "]", null, 2, null);
        if (ServiceC37177oos.Companion.AEQbTJ()) {
            C44124sEe.imLogVoiceCall$default("service_activity:send_command_hang_up via service", null, 2, null);
            gEmmrt().zuBGHE();
        } else {
            C44124sEe.imLogVoiceCall$default("activity:hangUpAudioCall: service not started, ending call via manager: " + (oKCallSessionGEmmrt != null ? oKCallSessionGEmmrt.getCallId() : null), null, 2, null);
            if (oKCallSessionGEmmrt != null && (callId = oKCallSessionGEmmrt.getCallId()) != null) {
                String str2 = StringsKt__StringsKt.fARcdN((CharSequence) callId) ^ true ? callId : null;
                if (str2 != null) {
                    gEmmrt().EZpvd(str2, gEmmrt().AEQbTJ().getValue().longValue(), false);
                }
            }
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "action_audio_call_hang_up")) {
            if (gEmmrt().AEQbTJ().getValue().longValue() <= 0) {
                C37127onv c37127onv = C37127onv.AEQbTJ;
                String string = getString(C35399nuc.LoaderManager.iPSTqm);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c37127onv.copydefault(string);
            } else {
                C37127onv c37127onv2 = C37127onv.AEQbTJ;
                String string2 = getString(C35399nuc.LoaderManager.hvKCwS);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c37127onv2.copydefault(string2);
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) "action_audio_call_deny")) {
            C37127onv c37127onv3 = C37127onv.AEQbTJ;
            String string3 = getString(C35399nuc.LoaderManager.fhwtiV);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c37127onv3.copydefault(string3);
        }
        postDelay(new Runnable() { // from class: o.onE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKIMAudioCallViewActivity.values(this.KWHzl);
            }
        }, 1000L);
    }

    public static final void values(OKIMAudioCallViewActivity oKIMAudioCallViewActivity) {
        oKIMAudioCallViewActivity.finish();
    }

    /* JADX DEBUG: Possible override for method o.ont.KWHzl()V */
    public final boolean KWHzl() {
        return Settings.canDrawOverlays(this);
    }

    public final boolean valueOf() {
        if (KWHzl()) {
            return true;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QhsCdE));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.GVpNrs));
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialhrnhsO), new View.OnClickListener() { // from class: o.onx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKIMAudioCallViewActivity.AEQbTJ(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
        this.valueOf = PermissionDialogState.SHOWING_OVERLAY_DIALOG;
        return false;
    }

    public static final void AEQbTJ(OKIMAudioCallViewActivity oKIMAudioCallViewActivity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        oKIMAudioCallViewActivity.valueOf = PermissionDialogState.NAVIGATING_TO_OVERLAY_SETTINGS;
        Uri uri = Uri.parse("package:" + oKIMAudioCallViewActivity.getPackageName());
        Intrinsics.checkNotNullExpressionValue(uri, "");
        oKIMAudioCallViewActivity.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", uri), oKIMAudioCallViewActivity.gEmmrt);
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.gEmmrt) {
            this.valueOf = PermissionDialogState.NONE;
        }
    }

    @Override // o.AbstractActivityC37125ont, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C44124sEe.imLogVoiceCall$default("service_activity:send_command_call_view_shown", null, 2, null);
        gEmmrt().gHZMYf();
    }

    @Override // o.AbstractActivityC37125ont, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        djBIcL();
        AYXKKw();
        gEmmrt().QKVWgx();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.valueOf != PermissionDialogState.NAVIGATING_TO_OVERLAY_SETTINGS) {
            valueOf();
        }
        super.onUserLeaveHint();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (gEmmrt().uzCIH() && KWHzl()) {
            fJNWhG();
        }
        super.onStop();
    }

    @Override // o.AbstractActivityC37125ont, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    public final void djBIcL() {
        if (gEmmrt().iwGUEr()) {
            String[] strArr = {"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE", "android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};
            if (C60121zwJ.KWHzl(this, (String[]) Arrays.copyOf(strArr, 6))) {
                gEmmrt().EZpvd(true);
                if (gEmmrt().zLjUOn()) {
                    EZpvd(true);
                    return;
                }
                return;
            }
            C37724ozI.EZpvd.AEQbTJ(this, strArr, this.AYXKKw);
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (valueOf()) {
            if (C60121zwJ.KWHzl(this, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                gEmmrt().EZpvd(true);
                if (gEmmrt().zLjUOn()) {
                    EZpvd(true);
                    return;
                }
                return;
            }
            gEmmrt().EZpvd(false);
            copydefault("action_audio_call_hang_up");
        }
    }

    public final void fJNWhG() {
        if (Settings.canDrawOverlays(this)) {
            C44124sEe.imLogVoiceCall$default("service_activity:send_command_show_floating", null, 2, null);
            gEmmrt().DTwDnp();
        }
    }

    public final void AYXKKw() {
        C44124sEe.imLogVoiceCall$default("service_activity:send_command_dismiss_floating", null, 2, null);
        gEmmrt().sSMYrx();
    }

    @Override // o.AbstractActivityC37125ont, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37125ont, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
