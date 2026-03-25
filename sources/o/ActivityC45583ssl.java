package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.feedback.FeedbackBountyActivity$learnMoreSlogan$2$1$1$onClick$1;
import com.okinc.okex.feedback.FeedbackStatus;
import com.okinc.okex.feedback.viewmodel.FeedbackBountyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC45549ssD;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ssl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC45583ssl extends AbstractActivityC45603stE {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public AbstractC47322tnp AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final java.lang.String copydefault = "images/customer_genius/android/ic_feedback_bounty_report.webp";
    public final java.lang.String EZpvd = "images/customer_genius/android/ic_feedback_bounty_feedback.webp";
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ssn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC45583ssl.isConnected(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sst
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45583ssl.gEmmrt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ssp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45583ssl.AkhnZx(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ssq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45583ssl.DbNXlk(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sss
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45583ssl.values(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ssr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45583ssl.valueOf(this.KWHzl);
        }
    });

    public ActivityC45583ssl() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(FeedbackBountyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.feedback.FeedbackBountyActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.feedback.FeedbackBountyActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.feedback.FeedbackBountyActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.ssl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ssl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC45583ssl.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_IS_WHITELISTED", java.lang.Boolean.valueOf(z))));
            return intent;
        }
    }

    public final FeedbackBountyViewModel AYXKKw() {
        return (FeedbackBountyViewModel) this.AkhnZx.getValue();
    }

    public final boolean valueOf() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean isConnected(ActivityC45583ssl activityC45583ssl) {
        android.content.Intent intent = activityC45583ssl.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("KEY_IS_WHITELISTED", false);
        }
        return false;
    }

    /* JADX DEBUG: Possible override for method o.stE.AEQbTJ()V */
    public final java.lang.CharSequence AEQbTJ() {
        return (java.lang.CharSequence) this.AEQbTJ.getValue();
    }

    public static final java.lang.CharSequence gEmmrt(final ActivityC45583ssl activityC45583ssl) {
        java.lang.String string = activityC45583ssl.getString(C47315tni.PendingIntent.zSsVtY);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C33061mpO.setupSpanStyles$default(C33069mpW.KWHzl(activityC45583ssl, C47315tni.PendingIntent.fBE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", string))), new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.sso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45583ssl.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit AEQbTJ(ActivityC45583ssl activityC45583ssl, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new C45375soc(ContextCompat.getColor(activityC45583ssl, C47315tni.Activity.gEmmrt), ContextCompat.getColor(activityC45583ssl, C52761wXj.Activity.DeEinT), 4.0f, ResourcesCompat.getFont(activityC45583ssl.getApplicationContext(), C52761wXj.Dialog.OLrzqt)));
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence EZpvd() {
        return (java.lang.CharSequence) this.gEmmrt.getValue();
    }

    public static final java.lang.CharSequence AkhnZx(final ActivityC45583ssl activityC45583ssl) {
        java.lang.String string = activityC45583ssl.getString(C47315tni.PendingIntent.cBPFI);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C33061mpO.setupSpanStyles$default(C33069mpW.KWHzl(activityC45583ssl, C47315tni.PendingIntent.gtdfxv, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", string))), new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.ssk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45583ssl.valueOf(this.copydefault, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit valueOf(ActivityC45583ssl activityC45583ssl, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new C45375soc(ContextCompat.getColor(activityC45583ssl, C47315tni.Activity.gEmmrt), ContextCompat.getColor(activityC45583ssl, C52761wXj.Activity.DeEinT), 4.0f, ResourcesCompat.getFont(activityC45583ssl.getApplicationContext(), C52761wXj.Dialog.OLrzqt)));
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence OLrzqt() {
        return (java.lang.CharSequence) this.valueOf.getValue();
    }

    public static final java.lang.CharSequence DbNXlk(final ActivityC45583ssl activityC45583ssl) {
        java.lang.String string = activityC45583ssl.getString(C47315tni.PendingIntent.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(activityC45583ssl.getString(activityC45583ssl.valueOf() ? C47315tni.PendingIntent.zhUgOk : C47315tni.PendingIntent.dUDNAs));
        sb.append(" ");
        sb.append(string);
        return C33061mpO.setupSpanStyles$default(sb.toString(), new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.ssm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45583ssl.EZpvd(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null);
    }

    /* JADX INFO: renamed from: o.ssl$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ActivityC45583ssl.this), null, null, new FeedbackBountyActivity$learnMoreSlogan$2$1$1$onClick$1(ActivityC45583ssl.this, null), 3, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(ActivityC45583ssl.this, C52761wXj.Activity.DeEinT));
        }
    }

    public static final Unit EZpvd(ActivityC45583ssl activityC45583ssl, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(activityC45583ssl.new Activity());
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(activityC45583ssl, C52761wXj.Activity.DeEinT)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ssl$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC45583ssl KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC45583ssl activityC45583ssl) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC45583ssl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("app_support_feedback_landing_page_category_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), LoaderManager.EZpvd);
                ActivityC45583ssl activityC45583ssl = this.KWHzl;
                activityC45583ssl.startActivity(ActivityC45628std.Companion.AEQbTJ(activityC45583ssl, activityC45583ssl.valueOf(), 1));
            }
        }
    }

    /* JADX INFO: renamed from: o.ssl$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC45583ssl KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC45583ssl activityC45583ssl) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = activityC45583ssl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC45583ssl activityC45583ssl = this.KWHzl;
                activityC45583ssl.startActivity(ActivityC45628std.Companion.AEQbTJ(activityC45583ssl, activityC45583ssl.valueOf(), 4));
            }
        }
    }

    /* JADX INFO: renamed from: o.ssl$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ActivityC45583ssl AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC45583ssl activityC45583ssl) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC45583ssl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("app_support_feedback_landing_page_category_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), Dialog.KWHzl);
                ActivityC45583ssl activityC45583ssl = this.AEQbTJ;
                activityC45583ssl.startActivity(ActivityC45628std.Companion.AEQbTJ(activityC45583ssl, activityC45583ssl.valueOf(), 2));
            }
        }
    }

    /* JADX INFO: renamed from: o.ssl$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC45583ssl AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC45583ssl activityC45583ssl) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC45583ssl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("app_support_feedback_landing_page_category_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), Fragment.AEQbTJ);
                ActivityC45583ssl activityC45583ssl = this.AEQbTJ;
                activityC45583ssl.startActivity(ActivityC45628std.Companion.AEQbTJ(activityC45583ssl, activityC45583ssl.valueOf(), 3));
            }
        }
    }

    /* JADX INFO: renamed from: o.ssl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC45583ssl EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC45583ssl activityC45583ssl) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC45583ssl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityC45549ssD.Activity activity = ActivityC45549ssD.Companion;
                ActivityC45583ssl activityC45583ssl = this.EZpvd;
                this.EZpvd.startActivity(activity.AEQbTJ(activityC45583ssl, java.lang.Boolean.valueOf(activityC45583ssl.valueOf()), null, java.lang.Integer.valueOf(FeedbackStatus.PENDING_YOUR_APPROVAL.getStatus()), null));
            }
        }
    }

    /* JADX INFO: renamed from: o.ssl$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC45583ssl KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, ActivityC45583ssl activityC45583ssl) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = activityC45583ssl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.onEvent$default("app_support_feedback_history_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
                ActivityC45549ssD.Activity activity = ActivityC45549ssD.Companion;
                ActivityC45583ssl activityC45583ssl = this.KWHzl;
                this.KWHzl.startActivity(activity.AEQbTJ(activityC45583ssl, java.lang.Boolean.valueOf(activityC45583ssl.valueOf()), null, null, null));
            }
        }
    }

    public final MutableLiveData<java.lang.Boolean> djBIcL() {
        return (MutableLiveData) this.AhwBna.getValue();
    }

    public static final MutableLiveData values(ActivityC45583ssl activityC45583ssl) {
        return C32942mnB.OLrzqt(activityC45583ssl.AYXKKw().KWHzl(), new Function1() { // from class: o.ssv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45583ssl.copydefault((java.lang.Integer) obj);
            }
        });
    }

    public static final java.lang.Boolean copydefault(java.lang.Integer num) {
        return java.lang.Boolean.valueOf(num != null && num.intValue() > 0);
    }

    /* JADX DEBUG: Possible override for method o.stE.KWHzl()V */
    public final MutableLiveData<java.lang.String> KWHzl() {
        return (MutableLiveData) this.OLrzqt.getValue();
    }

    public static final MutableLiveData valueOf(final ActivityC45583ssl activityC45583ssl) {
        return C32942mnB.OLrzqt(activityC45583ssl.AYXKKw().KWHzl(), new Function1() { // from class: o.ssx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45583ssl.AEQbTJ(this.copydefault, (java.lang.Integer) obj);
            }
        });
    }

    public static final java.lang.String AEQbTJ(ActivityC45583ssl activityC45583ssl, java.lang.Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        return C33069mpW.KWHzl(activityC45583ssl, num.intValue() == 1 ? C47315tni.PendingIntent.DbNXlk : C47315tni.PendingIntent.AkhnZx, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, num)));
    }

    @Override // o.AbstractActivityC45603stE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AYXKKw = null;
    }

    @Override // o.AbstractActivityC45603stE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.widget.TextView textView;
        AbstractC47480tqo abstractC47480tqo;
        android.view.View root;
        AbstractC47480tqo abstractC47480tqo2;
        android.view.View root2;
        AbstractC47480tqo abstractC47480tqo3;
        android.view.View root3;
        AbstractC47480tqo abstractC47480tqo4;
        android.view.View root4;
        android.widget.TextView textView2;
        C33537myN c33537myN;
        android.widget.ImageView doImage;
        super.onCreate(bundle);
        AbstractC47322tnp abstractC47322tnp = (AbstractC47322tnp) DataBindingUtil.setContentView(this, C47315tni.ActionBar.AEQbTJ);
        this.AYXKKw = abstractC47322tnp;
        if (abstractC47322tnp != null) {
            abstractC47322tnp.setLifecycleOwner(this);
            abstractC47322tnp.AEQbTJ(getString(valueOf() ? C47315tni.PendingIntent.WS : C47315tni.PendingIntent.aUsmxb));
            abstractC47322tnp.AEQbTJ(djBIcL());
            abstractC47322tnp.EZpvd(KWHzl());
            abstractC47322tnp.KWHzl(java.lang.Boolean.valueOf(valueOf()));
            abstractC47322tnp.EZpvd(AEQbTJ());
            abstractC47322tnp.OLrzqt(EZpvd());
            abstractC47322tnp.KWHzl(OLrzqt());
        }
        AbstractC47322tnp abstractC47322tnp2 = this.AYXKKw;
        if (abstractC47322tnp2 != null && (c33537myN = abstractC47322tnp2.OLrzqt) != null && (doImage = c33537myN.getDoImage()) != null) {
            android.graphics.drawable.Drawable drawable = doImage.getDrawable();
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            doImage.setOnClickListener(new TaskStackBuilder(doImage, 1000L, this));
        }
        AbstractC47322tnp abstractC47322tnp3 = this.AYXKKw;
        if (abstractC47322tnp3 != null && (textView2 = abstractC47322tnp3.AEQbTJ) != null) {
            textView2.setOnClickListener(new TaskDescription(textView2, 1000L, this));
        }
        AbstractC47322tnp abstractC47322tnp4 = this.AYXKKw;
        if (abstractC47322tnp4 != null && (abstractC47480tqo4 = abstractC47322tnp4.copydefault) != null && (root4 = abstractC47480tqo4.getRoot()) != null) {
            root4.setOnClickListener(new Application(root4, 1000L, this));
        }
        AbstractC47322tnp abstractC47322tnp5 = this.AYXKKw;
        if (abstractC47322tnp5 != null && (abstractC47480tqo3 = abstractC47322tnp5.AhwBna) != null && (root3 = abstractC47480tqo3.getRoot()) != null) {
            root3.setOnClickListener(new StateListAnimator(root3, 1000L, this));
        }
        AbstractC47322tnp abstractC47322tnp6 = this.AYXKKw;
        if (abstractC47322tnp6 != null && (abstractC47480tqo2 = abstractC47322tnp6.ejfBZ) != null && (root2 = abstractC47480tqo2.getRoot()) != null) {
            root2.setOnClickListener(new PendingIntent(root2, 1000L, this));
        }
        AbstractC47322tnp abstractC47322tnp7 = this.AYXKKw;
        if (abstractC47322tnp7 != null && (abstractC47480tqo = abstractC47322tnp7.DbNXlk) != null && (root = abstractC47480tqo.getRoot()) != null) {
            root.setOnClickListener(new FragmentManager(root, 1000L, this));
        }
        AbstractC47322tnp abstractC47322tnp8 = this.AYXKKw;
        if (abstractC47322tnp8 != null && (textView = abstractC47322tnp8.AYXKKw) != null) {
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        gEmmrt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ssu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45583ssl.fetchVPNInfo(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.ssl$LoaderManager */
    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager EZpvd = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("value", "defects", true);
        }
    }

    /* JADX INFO: renamed from: o.ssl$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public static final Fragment AEQbTJ = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("value", "languages", true);
        }
    }

    /* JADX INFO: renamed from: o.ssl$Dialog */
    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog KWHzl = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("value", "suggestions", true);
        }
    }

    public static final void fetchVPNInfo(ActivityC45583ssl activityC45583ssl) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45583ssl, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC45603stE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AYXKKw().KWHzl(valueOf());
        gEmmrt();
    }

    public final void gEmmrt() {
        AbstractC47476tqk abstractC47476tqk;
        android.widget.ImageView imageView;
        android.content.Context context;
        AbstractC47476tqk abstractC47476tqk2;
        android.widget.ImageView imageView2;
        android.content.Context context2;
        AbstractC47322tnp abstractC47322tnp = this.AYXKKw;
        java.lang.String strCopydefault = null;
        if (abstractC47322tnp != null && (abstractC47476tqk2 = abstractC47322tnp.KWHzl) != null && (imageView2 = abstractC47476tqk2.KWHzl) != null) {
            C33054mpH.loadUrl$default(imageView2, (abstractC47322tnp == null || abstractC47476tqk2 == null || imageView2 == null || (context2 = imageView2.getContext()) == null) ? null : C43454rpb.copydefault(this.copydefault, context2, true), null, 0, 0, 14, null);
        }
        AbstractC47322tnp abstractC47322tnp2 = this.AYXKKw;
        if (abstractC47322tnp2 == null || (abstractC47476tqk = abstractC47322tnp2.EZpvd) == null || (imageView = abstractC47476tqk.KWHzl) == null) {
            return;
        }
        if (abstractC47322tnp2 != null && abstractC47476tqk != null && imageView != null && (context = imageView.getContext()) != null) {
            strCopydefault = C43454rpb.copydefault(this.EZpvd, context, true);
        }
        C33054mpH.loadUrl$default(imageView, strCopydefault, null, 0, 0, 14, null);
    }

    @Override // o.AbstractActivityC45603stE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45603stE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45603stE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
