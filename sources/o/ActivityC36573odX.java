package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.glide.ImageSize;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.imui.managerV2.AudioRecordManager;
import com.okinc.im.imui.messageV2.view.ChatActivity$initViewModel$3;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeConnectionStatusBanner$2;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeConversation$2;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeInitAgentBotFail$2;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeMenuProvider$2;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeSubtitle$2;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeTitle$2;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeToolbarMemberCount$2;
import com.okinc.im.imui.messageV2.view.ChatActivity$observeToolbarTagSection$2;
import com.okinc.im.imui.messageV2.view.ChatActivityViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.ActivityC35548nxT;
import o.C35399nuc;
import o.C36609oeG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC36573odX extends AbstractActivityC36604oeB<nHP> {
    public long AYXKKw;
    public java.lang.CharSequence AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final ActivityResultLauncher<android.content.Intent> EZpvd;
    public boolean KWHzl;
    public ViewOnClickListenerC54939xaY OLrzqt;
    public MenuProvider djBIcL;
    public final int gEmmrt = C35399nuc.Dialog.KWHzl;
    public final ActivityResultLauncher<android.content.Intent> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    public ActivityC36573odX() {
        final Function0 function0 = null;
        this.DbNXlk = new ViewModelLazy(C56524yIo.AEQbTJ(ChatActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.ChatActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.ChatActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.ChatActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.oeb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC36573odX.OLrzqt(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.oec
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC36573odX.AEQbTJ(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: renamed from: o.odX$ActionBar */
    public static final class ActionBar {
        public static final int EZpvd = OKMessage.$stable;
        public final ChatOrigin AEQbTJ;
        public final java.lang.String AYXKKw;
        public final OKMessage AhwBna;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final IMPageType copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChatOrigin AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessage AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(java.lang.String str, OKMessage oKMessage, java.lang.String str2, ChatOrigin chatOrigin, java.lang.String str3, IMPageType iMPageType, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            return new ActionBar(str, oKMessage, str2, chatOrigin, str3, iMPageType, str4, str5, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IMPageType copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, actionBar.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) actionBar.djBIcL) && this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) actionBar.valueOf) && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            OKMessage oKMessage = this.AhwBna;
            int iHashCode2 = oKMessage == null ? 0 : oKMessage.hashCode();
            java.lang.String str2 = this.djBIcL;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            ChatOrigin chatOrigin = this.AEQbTJ;
            int iHashCode4 = chatOrigin == null ? 0 : chatOrigin.hashCode();
            java.lang.String str3 = this.valueOf;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            IMPageType iMPageType = this.copydefault;
            int iHashCode6 = iMPageType == null ? 0 : iMPageType.hashCode();
            java.lang.String str4 = this.AYXKKw;
            int iHashCode7 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.KWHzl;
            int iHashCode8 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.gEmmrt;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChatIntentRequest(channelId=" + this.OLrzqt + ", targetMessage=" + this.AhwBna + ", searchKey=" + this.djBIcL + ", chatOrigin=" + this.AEQbTJ + ", relationId=" + this.valueOf + ", pageType=" + this.copydefault + ", prefilledInputMessage=" + this.AYXKKw + ", memberOfGroup=" + this.KWHzl + ", trackerSource=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        public ActionBar(java.lang.String str, OKMessage oKMessage, java.lang.String str2, ChatOrigin chatOrigin, java.lang.String str3, IMPageType iMPageType, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            this.OLrzqt = str;
            this.AhwBna = oKMessage;
            this.djBIcL = str2;
            this.AEQbTJ = chatOrigin;
            this.valueOf = str3;
            this.copydefault = iMPageType;
            this.AYXKKw = str4;
            this.KWHzl = str5;
            this.gEmmrt = str6;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.OKMessage:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessage) : (r12v0 com.okinc.okimcore.model.im.OKMessage))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:com.okinc.im.bean.ChatOrigin:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.bean.ChatOrigin) : (r14v0 com.okinc.im.bean.ChatOrigin))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.im.config.page.IMPageType:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.config.page.IMPageType) : (r16v0 com.okinc.im.config.page.IMPageType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, com.okinc.okimcore.model.im.OKMessage, java.lang.String, com.okinc.im.bean.ChatOrigin, java.lang.String, com.okinc.im.config.page.IMPageType, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:85) call: o.odX.ActionBar.<init>(java.lang.String, com.okinc.okimcore.model.im.OKMessage, java.lang.String, com.okinc.im.bean.ChatOrigin, java.lang.String, com.okinc.im.config.page.IMPageType, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, OKMessage oKMessage, java.lang.String str2, ChatOrigin chatOrigin, java.lang.String str3, IMPageType iMPageType, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : oKMessage, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : chatOrigin, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : iMPageType, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null);
        }
    }

    /* JADX INFO: renamed from: o.odX$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.odX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC36573odX.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("key_channel_id", actionBar.OLrzqt()), C56390yDp.OLrzqt("key_page_type", actionBar.copydefault()), C56390yDp.OLrzqt("message", actionBar.AhwBna()), C56390yDp.OLrzqt(JwtUtilsKt.DID_METHOD_KEY, actionBar.valueOf()), C56390yDp.OLrzqt("chatOrigin", actionBar.AEQbTJ()), C56390yDp.OLrzqt("relationId", actionBar.gEmmrt()), C56390yDp.OLrzqt("prefilledInputMsg", actionBar.KWHzl()), C56390yDp.OLrzqt("groupId", actionBar.EZpvd()), C56390yDp.OLrzqt("trackerSource", actionBar.djBIcL())));
            return intent;
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, java.lang.String str, OKMessage oKMessage, java.lang.String str2, ChatOrigin chatOrigin, java.lang.String str3, IMPageType iMPageType, java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(context, "");
            return EZpvd(context, new ActionBar(str, oKMessage, str2, chatOrigin, str3, iMPageType, str4, str5, null, 256, null));
        }
    }

    /* JADX DEBUG: Possible override for method o.oeB.OLrzqt()V */
    public final ChatActivityViewModel OLrzqt() {
        return (ChatActivityViewModel) this.DbNXlk.getValue();
    }

    public static final void OLrzqt(ActivityC36573odX activityC36573odX, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            activityC36573odX.finish();
        }
    }

    public static final void AEQbTJ(ActivityC36573odX activityC36573odX, ActivityResult activityResult) {
        android.content.Intent data;
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data2 = activityResult.getData();
            if ((data2 == null || !data2.hasExtra("RESULT_KEY_EXIT_GROUP")) && ((data = activityResult.getData()) == null || !data.hasExtra("RESULT_KEY_DISBAND_GROUP"))) {
                return;
            }
            activityC36573odX.finish();
        }
    }

    /* JADX INFO: renamed from: o.odX$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC36573odX EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC36573odX activityC36573odX) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = activityC36573odX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.odX$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC36573odX EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC36573odX activityC36573odX) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC36573odX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                pUU.KWHzl("ChatActivity", "toolbar title clicked");
                this.EZpvd.OLrzqt().zLjUOn();
            }
        }
    }

    @Override // o.AbstractActivityC36604oeB, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.AYXKKw = java.lang.System.currentTimeMillis();
        pUU.KWHzl("ChatActivity", "onResume - started tracking view time");
        OLrzqt().getFieldNames();
    }

    @Override // o.AbstractActivityC36604oeB, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gEmmrt();
    }

    @Override // o.AbstractActivityC36604oeB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        MenuProvider menuProvider = this.djBIcL;
        if (menuProvider != null) {
            removeMenuProvider(menuProvider);
        }
        this.djBIcL = null;
        AudioRecordManager.Companion.OLrzqt().OLrzqt();
        C36501ocE.OLrzqt().KWHzl();
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        for (androidx.fragment.app.Fragment fragment : fragments) {
            if (fragment.isAdded()) {
                try {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("ChatActivity", "Error removing fragment", e);
                }
            }
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY != null) {
            C33062mpP.OLrzqt(viewOnClickListenerC54939xaY);
        }
        super.onDestroy();
    }

    @Override // o.AbstractActivityC36604oeB, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        values();
        AkhnZx();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.oej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC36573odX.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final void gEmmrt(ActivityC36573odX activityC36573odX) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC36573odX, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        djBIcL();
        ViewCompat.setOnApplyWindowInsetsListener(((nHP) KWHzl()).getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.oei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC36573odX.AEQbTJ(view, windowInsetsCompat);
            }
        });
        ((nHP) KWHzl()).getRoot().post(new java.lang.Runnable() { // from class: o.oeg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC36573odX.KWHzl(this.EZpvd);
            }
        });
        android.widget.LinearLayout linearLayout = ((nHP) KWHzl()).valueOf;
        linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this));
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        AEQbTJ(intent);
        EZpvd();
    }

    public static final WindowInsetsCompat AEQbTJ(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActivityC36573odX activityC36573odX) {
        ViewCompat.requestApplyInsets(((nHP) activityC36573odX.KWHzl()).getRoot());
    }

    private final void AkhnZx() {
        OLrzqt().values().observe(this, new C32991mny(new Function1() { // from class: o.oea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC36573odX.AEQbTJ(this.EZpvd, (GeneralAction) obj);
            }
        }));
        OLrzqt().AuCTel().observe(this, new C32991mny(new Function1() { // from class: o.oed
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC36573odX.KWHzl(this.AEQbTJ, (ChatActivityViewModel.Activity) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChatActivity$initViewModel$3(this, null), 3, null);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("app_okim_conversation_currency", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oef
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC36573odX.EZpvd(this.KWHzl, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC36573odX activityC36573odX, GeneralAction generalAction) {
        Intrinsics.checkNotNullParameter(generalAction, "");
        C35290nsY.KWHzl(activityC36573odX, generalAction);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC36573odX activityC36573odX, ChatActivityViewModel.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.KWHzl("ChatActivity", "navigationEvent update: " + activity);
        activityC36573odX.AEQbTJ(activity);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC36573odX activityC36573odX, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.OPERATOR_ID, activityC36573odX.OLrzqt().gEmmrt(), false);
        eventParamsList.put("isC2C", "false", true);
        return Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(OLrzqt().AubY(), new ChatActivity$observeConnectionStatusBanner$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(OLrzqt().fJNWhG(), new ChatActivity$observeMenuProvider$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object AYXKKw(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(OLrzqt().getNewProxyInstance(), new ChatActivity$observeTitle$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object gEmmrt(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(OLrzqt().iwGUEr(), new ChatActivity$observeToolbarTagSection$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(OLrzqt().ejfBZ(), new ChatActivity$observeSubtitle$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object AhwBna(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(OLrzqt().hDKMBd(), new ChatActivity$observeToolbarMemberCount$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.filterNotNull(OLrzqt().valueOf()), new ChatActivity$observeConversation$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(OLrzqt().isConnected(), new ChatActivity$observeInitAgentBotFail$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final void AEQbTJ(MenuProvider menuProvider) {
        MenuProvider menuProvider2 = this.djBIcL;
        if (menuProvider2 != null) {
            removeMenuProvider(menuProvider2);
        }
        this.djBIcL = menuProvider;
        if (menuProvider != null) {
            addMenuProvider(menuProvider);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.nxT.ActionBar.createIntent$default(o.nxT$ActionBar, android.content.Context, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.OKConversation, boolean, int, java.lang.Object):android.content.Intent */
    public final void AEQbTJ(ChatActivityViewModel.Activity activity) {
        if (activity instanceof ChatActivityViewModel.Activity.C0455Activity) {
            this.EZpvd.launch(nSR.Companion.KWHzl(this, ((ChatActivityViewModel.Activity.C0455Activity) activity).AEQbTJ()));
        } else {
            if (!(activity instanceof ChatActivityViewModel.Activity.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityC35548nxT.ActionBar actionBar = ActivityC35548nxT.Companion;
            android.content.Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            ChatActivityViewModel.Activity.StateListAnimator stateListAnimator = (ChatActivityViewModel.Activity.StateListAnimator) activity;
            this.valueOf.launch(ActivityC35548nxT.ActionBar.createIntent$default(actionBar, applicationContext, stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl(), stateListAnimator.OLrzqt(), false, 16, null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        setSupportActionBar(((nHP) KWHzl()).gEmmrt);
        androidx.appcompat.widget.Toolbar toolbar = ((nHP) KWHzl()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, ((nHP) KWHzl()).fetchVPNInfo, "");
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
        }
        wYC wyc = ((nHP) KWHzl()).OLrzqt;
        wyc.setOnClickListener(new Application(wyc, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(oFS ofs) {
        Function1<android.content.Context, android.graphics.drawable.Drawable> function1Copydefault;
        nHP nhp = (nHP) KWHzl();
        android.widget.TextView textView = nhp.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(ofs != null ? 0 : 8);
        nhp.DbNXlk.setText(ofs != null ? ofs.AEQbTJ() : null);
        android.graphics.drawable.Drawable drawableInvoke = (ofs == null || (function1Copydefault = ofs.copydefault()) == null) ? null : function1Copydefault.invoke(this);
        java.lang.Integer numOLrzqt = ofs != null ? ofs.OLrzqt() : null;
        if (ofs != null) {
            if (numOLrzqt != null) {
                C33092mpt.OLrzqt(nhp.DbNXlk, drawableInvoke, numOLrzqt.intValue(), ImageSize.create());
                return;
            }
            android.widget.TextView textView2 = nhp.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C37716ozA.OLrzqt(textView2, drawableInvoke);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.Integer num) {
        nHP nhp = (nHP) KWHzl();
        if (this.KWHzl) {
            android.widget.TextView textView = nhp.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        OKConversation value = OLrzqt().valueOf().getValue();
        if (value != null && C44170sFx.AEQbTJ(value)) {
            android.widget.TextView textView2 = nhp.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            nhp.AkhnZx.setText(getString(C35399nuc.LoaderManager.ICustomTabsCallbackDefault));
            return;
        }
        if (num != null) {
            android.widget.TextView textView3 = nhp.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            nhp.AkhnZx.setText(C59449zhJ.replace$default(C33070mpX.EZpvd(C35399nuc.Fragment.wlaJM, num.intValue()), "{num}", pTB.formatLocalized$default(num.toString(), null, 1, null), false, 4, (java.lang.Object) null));
            return;
        }
        android.widget.TextView textView4 = nhp.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(@NotNull java.util.List<java.lang.String> list) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        nHP nhp = (nHP) KWHzl();
        OKConversation value = OLrzqt().valueOf().getValue();
        boolean z = (value != null ? value.getConversationType() : null) == OKConversationType.PRIVATE;
        if (OLrzqt().AubY().getValue().booleanValue() || z || list.isEmpty()) {
            copydefault(nhp);
            return;
        }
        if (list.size() == 1) {
            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.resume), C56423yEv.EZpvd(C56390yDp.OLrzqt("user", (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(list))));
        } else {
            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fhUrPt), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(java.lang.String.valueOf(list.size()), null, 1, null))));
        }
        if (!this.KWHzl || !Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) strOLrzqt)) {
            android.widget.TextView textView = nhp.values;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            nhp.values.setText(strOLrzqt);
            this.AhwBna = strOLrzqt;
        }
        this.KWHzl = true;
        android.widget.TextView textView2 = nhp.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    public final void copydefault(nHP nhp) {
        android.widget.TextView textView = nhp.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        nhp.values.setText("");
        this.AhwBna = null;
        this.KWHzl = false;
        if (OLrzqt().AubY().getValue().booleanValue()) {
            return;
        }
        KWHzl(OLrzqt().hDKMBd().getValue());
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        OLrzqt().copydefault(KWHzl(intent), getPageType$default(this, intent, (IMPageType) null, 1, (java.lang.Object) null));
        AEQbTJ(intent);
    }

    public final void AEQbTJ(android.content.Intent intent) {
        ChatOrigin chatOrigin;
        C36609oeG.Application application = C36609oeG.Companion;
        java.lang.String stringExtra = intent.getStringExtra("key_channel_id");
        java.lang.String stringExtra2 = intent.getStringExtra("relationId");
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || (chatOrigin = (ChatOrigin) BundleCompat.getParcelable(extras, "chatOrigin", ChatOrigin.class)) == null) {
            chatOrigin = ChatOrigin.OKIM_SERVICE;
        }
        ChatOrigin chatOrigin2 = chatOrigin;
        android.os.Bundle extras2 = intent.getExtras();
        java.io.Serializable serializable = extras2 != null ? extras2.getSerializable("key_page_type") : null;
        IMPageType iMPageType = serializable instanceof IMPageType ? (IMPageType) serializable : null;
        android.os.Bundle extras3 = intent.getExtras();
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.ExKek, application.EZpvd(new C35241nrc(stringExtra, stringExtra2, chatOrigin2, iMPageType, null, null, null, null, null, extras3 != null ? (OKMessage) BundleCompat.getParcelable(extras3, "message", OKMessage.class) : null, intent.getStringExtra(JwtUtilsKt.DID_METHOD_KEY), intent.getStringExtra("prefilledInputMsg"), false, false, false, false, false, intent.getStringExtra("groupId"), intent.getStringExtra("trackerSource"), 127472, null))).commitAllowingStateLoss();
    }

    public final void EZpvd() {
        getSupportFragmentManager().setFragmentResultListener("KEY_MESSAGE_LIST_REQUEST", this, new FragmentResultListener() { // from class: o.oee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC36573odX.copydefault(this.copydefault, str, bundle);
            }
        });
    }

    public static final void copydefault(ActivityC36573odX activityC36573odX, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean z = bundle.getBoolean("KEY_INIT_SUCCESS");
        pUU.KWHzl("ChatActivity", "fragment result listener: key->" + str + ", isSuccess -> " + z);
        if (!z) {
            pUU.KWHzl("ChatActivity", "init conversation failed");
            return;
        }
        OKConversation oKConversation = (OKConversation) BundleCompat.getParcelable(bundle, "KEY_CONVERSATION", OKConversation.class);
        pUU.KWHzl("ChatActivity", "init conversation success: conversation -> " + (oKConversation != null ? oKConversation.getTargetId() : null));
        if (oKConversation != null) {
            activityC36573odX.KWHzl(oKConversation);
        }
        activityC36573odX.OLrzqt().copydefault(oKConversation != null ? oKConversation.getTargetId() : null, activityC36573odX.EZpvd(bundle, activityC36573odX.OLrzqt().fIwbmz().getValue()));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oIV.setIcons$default(o.oIV, java.util.List, boolean, boolean, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Class process forced to load method for inline: o.ozA.updateTagViewWithTagInfo$default(android.widget.TextView, com.okinc.okimcore.model.remote.OfficialTagInfo, int, com.okinc.okimcore.model.remote.TagColorMode, boolean, boolean, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(OKConversation oKConversation) {
        nHP nhp = (nHP) KWHzl();
        if (C44170sFx.AEQbTJ(oKConversation)) {
            C35893oHp c35893oHp = nhp.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.OLrzqt(c35893oHp, oKConversation);
            android.widget.TextView textView = nhp.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.ImageView imageView = nhp.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            oIV.setIcons$default(nhp.djBIcL, oKConversation.getConversationIcons(), false, false, false, 14, null);
            return;
        }
        C35893oHp c35893oHp2 = nhp.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
        C35891oHn.AEQbTJ(c35893oHp2, oKConversation);
        android.widget.TextView textView2 = nhp.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView2, oKConversation.getOfficialTagInfo(), 8, null, false, false, false, 60, null);
        oIV.setIcons$default(nhp.djBIcL, oKConversation.getConversationIcons(), oKConversation.getGroupType() == GroupTagType.PAID_GROUP, false, false, 12, null);
    }

    public final void gEmmrt() {
        OKConversationType conversationType;
        if (this.AYXKKw == 0) {
            return;
        }
        final java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Float.valueOf((java.lang.System.currentTimeMillis() - this.AYXKKw) / 1000.0f));
        OKConversation value = OLrzqt().valueOf().getValue();
        java.lang.String strCopydefault = null;
        final java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(value != null ? value.getTargetId() : null);
        if (value != null && (conversationType = value.getConversationType()) != null) {
            strCopydefault = sNN.copydefault(conversationType);
        }
        final java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(strCopydefault);
        pUU.KWHzl("ChatActivity", "trackStayViewEvent - channelId: " + strGEmmrt2 + ", channelType: " + strGEmmrt3 + ", viewTime: " + strGEmmrt + com.ibm.icu.text.DateFormat.SECOND);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Full_Stay_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oeh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC36573odX.AEQbTJ(strGEmmrt2, strGEmmrt3, strGEmmrt, (EventParamsList) obj);
            }
        });
        this.AYXKKw = 0L;
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "channel_id", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_type", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "view_time", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(android.content.Intent intent) {
        return intent.getStringExtra("key_channel_id");
    }

    public static /* synthetic */ IMPageType getPageType$default(ActivityC36573odX activityC36573odX, android.content.Intent intent, IMPageType iMPageType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iMPageType = null;
        }
        return activityC36573odX.OLrzqt(intent, iMPageType);
    }

    public final IMPageType OLrzqt(android.content.Intent intent, IMPageType iMPageType) {
        android.os.Bundle extras = intent.getExtras();
        java.io.Serializable serializable = extras != null ? extras.getSerializable("key_page_type") : null;
        IMPageType iMPageType2 = serializable instanceof IMPageType ? (IMPageType) serializable : null;
        return iMPageType2 == null ? iMPageType : iMPageType2;
    }

    public static /* synthetic */ IMPageType getPageType$default(ActivityC36573odX activityC36573odX, android.os.Bundle bundle, IMPageType iMPageType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iMPageType = null;
        }
        return activityC36573odX.EZpvd(bundle, iMPageType);
    }

    public final IMPageType EZpvd(android.os.Bundle bundle, IMPageType iMPageType) {
        java.io.Serializable serializable = bundle.getSerializable("KEY_PAGE_TYPE");
        IMPageType iMPageType2 = serializable instanceof IMPageType ? (IMPageType) serializable : null;
        return iMPageType2 == null ? iMPageType : iMPageType2;
    }

    @Override // o.AbstractActivityC36604oeB, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC36604oeB, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
