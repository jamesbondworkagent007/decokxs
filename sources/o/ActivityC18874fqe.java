package o;

import android.view.View;
import com.okinc.business.defi.biz.setting.SwitchType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fqe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC18874fqe extends AbstractActivityC33013moT {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fqd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18874fqe.valueOf();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fqg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18874fqe.KWHzl();
        }
    });
    public C16443ejy copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.fqe$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwitchType.values().length];
            try {
                iArr[SwitchType.TOUCH_SWITCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwitchType.SCREENSHOT_SHARING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    private final xWJ copydefault() {
        return (xWJ) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xWJ valueOf() {
        return (xWJ) C43251rlk.copydefault(xWJ.class);
    }

    private final InterfaceC48893ueK AEQbTJ() {
        return (InterfaceC48893ueK) this.OLrzqt.getValue();
    }

    public static final InterfaceC48893ueK KWHzl() {
        return (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
    }

    /* JADX INFO: renamed from: o.fqe$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fqe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC18874fqe.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16443ejy c16443ejyEZpvd = C16443ejy.EZpvd(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c16443ejyEZpvd, "");
        setContentView(c16443ejyEZpvd.getRoot());
        this.copydefault = c16443ejyEZpvd;
        gEmmrt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18874fqe.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(ActivityC18874fqe activityC18874fqe) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18874fqe, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        C16443ejy c16443ejy = this.copydefault;
        if (c16443ejy == null) {
            Intrinsics.gEmmrt("");
            c16443ejy = null;
        }
        C33537myN c33537myN = c16443ejy.AEQbTJ;
        c33537myN.setTitleTypeface("harmony_sans_bold.ttf");
        c33537myN.setTitleSize(18.0f);
        c33537myN.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.show));
        AbstractC17185exy abstractC17185exy = c16443ejy.copydefault;
        Intrinsics.checkNotNullExpressionValue(abstractC17185exy, "");
        OLrzqt(abstractC17185exy, SwitchType.TOUCH_SWITCH, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onTabReselected), false);
        AbstractC17185exy abstractC17185exy2 = c16443ejy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(abstractC17185exy2, "");
        OLrzqt(abstractC17185exy2, SwitchType.SCREENSHOT_SHARING, AEQbTJ().sSMYrx().toString(), true);
        djBIcL();
    }

    public final void OLrzqt(AbstractC17185exy abstractC17185exy, final SwitchType switchType, java.lang.String str, boolean z) {
        OKRegularCell oKRegularCell = abstractC17185exy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
        KWHzl(oKRegularCell, str, switchType, z);
        abstractC17185exy.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18874fqe.KWHzl(this.EZpvd, switchType, view);
            }
        });
    }

    public static final void KWHzl(ActivityC18874fqe activityC18874fqe, SwitchType switchType, android.view.View view) {
        activityC18874fqe.KWHzl(switchType);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dqw.buildSpannableStringWithIcon$default(o.dqw, java.lang.String, int, java.lang.Integer, int, android.content.Context, int, java.lang.Object):android.text.SpannableStringBuilder */
    public final void KWHzl(OKRegularCell oKRegularCell, java.lang.String str, final SwitchType switchType, boolean z) {
        oKRegularCell.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        if (!z) {
            oKRegularCell.setTitle(str);
        } else {
            oKRegularCell.setTitle(C14731dqw.buildSpannableStringWithIcon$default(C14731dqw.AEQbTJ, str, C52761wXj.TaskDescription.GGlJim, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), 0, this, 8, null));
            oKRegularCell.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.fqj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18874fqe.AEQbTJ(this.EZpvd, switchType, view);
                }
            });
        }
    }

    public static final void AEQbTJ(ActivityC18874fqe activityC18874fqe, SwitchType switchType, android.view.View view) {
        activityC18874fqe.AEQbTJ(switchType);
    }

    public final void KWHzl(SwitchType switchType) {
        C14724dqp.EZpvd.AEQbTJ(100L);
        int i = TaskDescription.copydefault[switchType.ordinal()];
        if (i == 1) {
            final boolean zAYXKKw = copydefault().AYXKKw();
            copydefault().copydefault(!zAYXKKw);
            djBIcL();
            C32866mlf.onEvent$default("Web3Settings_Preference_TactileFeedback_Click", (TrackChannel[]) null, new Function1() { // from class: o.fqm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18874fqe.AEQbTJ(zAYXKKw, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        if (i != 2) {
            return;
        }
        AEQbTJ().AEQbTJ(!AEQbTJ().UeEOUB(), new Function1() { // from class: o.fqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18874fqe.OLrzqt(((java.lang.Boolean) obj).booleanValue());
            }
        });
        djBIcL();
        C32866mlf.onEvent$default("Web3Settings_Preference_InteractionPrivacyShareScreenshot_Click", (TrackChannel[]) null, new Function1() { // from class: o.fql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18874fqe.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(SwitchType switchType) {
        if (TaskDescription.copydefault[switchType.ordinal()] == 2) {
            AEQbTJ().AEQbTJ(this);
        }
    }

    private final void djBIcL() {
        C16443ejy c16443ejy = this.copydefault;
        if (c16443ejy == null) {
            Intrinsics.gEmmrt("");
            c16443ejy = null;
        }
        c16443ejy.copydefault.OLrzqt.setChecked(copydefault().AYXKKw());
        c16443ejy.KWHzl.OLrzqt.setChecked(AEQbTJ().UeEOUB());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
