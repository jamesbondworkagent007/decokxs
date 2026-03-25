package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okuser.data.User;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.planet.biz_setting.SettingHomeModeActivity$requestGetMode$1;
import com.okinc.planet.biz_setting.data.ModeReq;
import com.okinc.planet.biz_setting.data.SettingModeData;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.InterfaceC47502trM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC46114tIi extends AbstractActivityC47505trP implements InterfaceC47502trM<C46263tNw> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C46263tNw AEQbTJ;
    public java.lang.String EZpvd = "";
    public boolean KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C46263tNw OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    public void EZpvd(C46263tNw c46263tNw) {
        this.AEQbTJ = c46263tNw;
    }

    public void copydefault(@NotNull Function1<? super C46263tNw, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    /* JADX INFO: renamed from: o.tIi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tIi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ android.content.Intent newIntent$OKPlanet_ok_feature_planet_impl$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return taskDescription.EZpvd(context, str);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC46114tIi.class);
            intent.putExtra(OtcExtraKeys.MODE, str);
            return intent;
        }
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ConstraintLayout root;
        super.onCreate(bundle);
        C46263tNw c46263tNwAEQbTJ = C46263tNw.AEQbTJ(getLayoutInflater());
        setContentView(c46263tNwAEQbTJ.getRoot());
        EZpvd(c46263tNwAEQbTJ);
        java.lang.String stringExtra = getIntent().getStringExtra(OtcExtraKeys.MODE);
        if (stringExtra != null) {
            this.EZpvd = stringExtra;
        }
        EZpvd();
        KWHzl();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd)) {
            KWHzl(this.EZpvd);
        } else {
            copydefault();
        }
        C46263tNw c46263tNwOLrzqt = OLrzqt();
        if (c46263tNwOLrzqt == null || (root = c46263tNwOLrzqt.getRoot()) == null) {
            return;
        }
        root.post(new java.lang.Runnable() { // from class: o.tIg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC46114tIi.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final void KWHzl(ActivityC46114tIi activityC46114tIi) {
        if (activityC46114tIi.copydefault) {
            return;
        }
        activityC46114tIi.copydefault = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC46114tIi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        copydefault(new Function1() { // from class: o.tIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46114tIi.EZpvd(this.OLrzqt, (C46263tNw) obj);
            }
        });
    }

    public static final Unit EZpvd(ActivityC46114tIi activityC46114tIi, C46263tNw c46263tNw) {
        Intrinsics.checkNotNullParameter(c46263tNw, "");
        android.widget.ImageView backImage = c46263tNw.copydefault.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJK));
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "{leaderboardTerms}", 0, false, 6, (java.lang.Object) null);
            spannableStringBuilder.replace(iIndexOf$default, iIndexOf$default + 18, (java.lang.CharSequence) activityC46114tIi.EZpvd(C33070mpX.AYXKKw(C47501trL.Fragment.RgLUBD), C33070mpX.AYXKKw(C47501trL.Fragment.DTeKQX)));
            c46263tNw.DbNXlk.setText(new android.text.SpannedString(spannableStringBuilder), TextView.BufferType.SPANNABLE);
            c46263tNw.DbNXlk.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            return Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: renamed from: o.tIi$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String KWHzl;

        public Activity(java.lang.String str) {
            this.KWHzl = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            view.cancelPendingInputEvents();
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(ActivityC46114tIi.this), BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.KWHzl)), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setTypeface(C55051xce.OLrzqt.OLrzqt());
            textPaint.setUnderlineText(true);
        }
    }

    public final void KWHzl(final java.lang.String str) {
        this.EZpvd = str;
        copydefault(new Function1() { // from class: o.tIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46114tIi.KWHzl(str, (C46263tNw) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, C46263tNw c46263tNw) {
        Intrinsics.checkNotNullParameter(c46263tNw, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            c46263tNw.EZpvd.setBackgroundResource(C47501trL.ActionBar.AwvSrB);
            c46263tNw.KWHzl.setBackgroundResource(C47501trL.ActionBar.zuBGHE);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2")) {
            c46263tNw.KWHzl.setBackgroundResource(C47501trL.ActionBar.AwvSrB);
            c46263tNw.EZpvd.setBackgroundResource(C47501trL.ActionBar.zuBGHE);
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        copydefault(new Function1() { // from class: o.tIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46114tIi.AEQbTJ(this.AEQbTJ, (C46263tNw) obj);
            }
        });
    }

    public static final Unit AEQbTJ(final ActivityC46114tIi activityC46114tIi, final C46263tNw c46263tNw) {
        Intrinsics.checkNotNullParameter(c46263tNw, "");
        c46263tNw.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.tIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC46114tIi.AhwBna(this.KWHzl, view);
            }
        });
        c46263tNw.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.tIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC46114tIi.copydefault(this.copydefault, view);
            }
        });
        c46263tNw.DbNXlk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ActivityC46114tIi.AEQbTJ(c46263tNw, compoundButton, z);
            }
        });
        c46263tNw.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.tIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC46114tIi.AEQbTJ(this.KWHzl, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AhwBna(ActivityC46114tIi activityC46114tIi, android.view.View view) {
        activityC46114tIi.KWHzl("2");
    }

    public static final void copydefault(ActivityC46114tIi activityC46114tIi, android.view.View view) {
        activityC46114tIi.KWHzl("1");
    }

    public static final void AEQbTJ(C46263tNw c46263tNw, android.widget.CompoundButton compoundButton, boolean z) {
        c46263tNw.OLrzqt.setEnabled(z);
    }

    public static final void AEQbTJ(ActivityC46114tIi activityC46114tIi, android.view.View view) {
        activityC46114tIi.EZpvd(activityC46114tIi.EZpvd);
    }

    public final void EZpvd(final java.lang.String str) {
        final java.lang.String str2;
        if (this.KWHzl) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
            viewOnClickListenerC54939xaY.copydefault(C47501trL.Fragment.iqMDAV);
            viewOnClickListenerC54939xaY.EZpvd(C47501trL.Fragment.OijiEz, new View.OnClickListener() { // from class: o.tIk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46114tIi.EZpvd(this.AEQbTJ, str, viewOnClickListenerC54939xaY, view);
                }
            });
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C47501trL.Fragment.dPkBzA, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
            str2 = "private";
        } else {
            AEQbTJ(str);
            str2 = "public";
        }
        C32866mlf.onEvent$default("app_community_myhomepage_setting_homemode_click", (TrackChannel[]) null, new Function1() { // from class: o.tIn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46114tIi.KWHzl(str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final void EZpvd(ActivityC46114tIi activityC46114tIi, java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC46114tIi.AEQbTJ(str);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("action_type", "Click", true);
        eventParamsList.put("modeltype", str, true);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        User userOLrzqt = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).OLrzqt();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SettingHomeModeActivity$requestGetMode$1(this, userOLrzqt != null ? userOLrzqt.getUid() : null, null), 3, null);
    }

    public final void AEQbTJ(final java.lang.String str) {
        this.KWHzl = true;
        showLoading();
        C33024moe.subscribeOnIO$default(((tQP) C43393roT.EZpvd(C56524yIo.AEQbTJ(tQP.class), tQO.KWHzl())).KWHzl(new ModeReq(str)), new Function1() { // from class: o.tIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46114tIi.KWHzl(this.KWHzl, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.tIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46114tIi.EZpvd(this.EZpvd, str, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(ActivityC46114tIi activityC46114tIi, java.lang.String str, ResponseData responseData) {
        SettingModeData settingModeData;
        Intrinsics.checkNotNullParameter(responseData, "");
        activityC46114tIi.KWHzl = false;
        activityC46114tIi.dismissLoading();
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            if (Intrinsics.EZpvd((java.lang.Object) ((list == null || (settingModeData = (SettingModeData) list.get(0)) == null) ? null : settingModeData.AEQbTJ()), (java.lang.Object) "0")) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2")) {
                    java.lang.String string = activityC46114tIi.getString(C47501trL.Fragment.invokespecialODCBUN);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
                } else {
                    java.lang.String string2 = activityC46114tIi.getString(C47501trL.Fragment.invokespecialDPHOMC);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    C55326xho.toastWithSuccessfulIcon$default(string2, 0, 1, (java.lang.Object) null);
                }
                activityC46114tIi.KWHzl(str);
                activityC46114tIi.finish();
            }
        } else {
            java.lang.String string3 = activityC46114tIi.getString(C47501trL.Fragment.DTwDnp);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            C55326xho.toastWithFailedIcon$default(string3, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC46114tIi activityC46114tIi, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        activityC46114tIi.KWHzl = false;
        activityC46114tIi.dismissLoading();
        java.lang.String string = activityC46114tIi.getString(C47501trL.Fragment.DTwDnp);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final android.text.SpannedString EZpvd(java.lang.String str, java.lang.String str2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        Activity activity = new Activity(str2);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(activity, length, spannableStringBuilder.length(), 17);
        return new android.text.SpannedString(spannableStringBuilder);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
