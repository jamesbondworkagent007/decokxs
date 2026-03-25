package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.contacts.editrelation.EditRelationActivity$observeViewModel$1;
import com.okinc.im.imui.contacts.editrelation.EditRelationActivity$observeViewModel$2;
import com.okinc.im.imui.contacts.viewmodel.EditRelationViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nAh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC33638nAh extends AbstractActivityC33641nAk {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public nHY EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nAe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC33638nAh.KWHzl(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault;

    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return false;
    }

    public ActivityC33638nAh() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(EditRelationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.contacts.editrelation.EditRelationActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.contacts.editrelation.EditRelationActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.contacts.editrelation.EditRelationActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.nAh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(StateListAnimator stateListAnimator, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return stateListAnimator.OLrzqt(context, str, str2);
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC33638nAh.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_RELATION_ID", str), C56390yDp.OLrzqt("ARG_GROUP_ID", str2)));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.nAk.AEQbTJ()V */
    public final nHY AEQbTJ() {
        nHY nhy = this.EZpvd;
        Intrinsics.copydefault(nhy);
        return nhy;
    }

    /* JADX DEBUG: Possible override for method o.nAk.KWHzl()V */
    public final android.text.InputFilter[] KWHzl() {
        return (android.text.InputFilter[]) this.KWHzl.getValue();
    }

    public static final android.text.InputFilter[] KWHzl(final ActivityC33638nAh activityC33638nAh) {
        return new android.text.InputFilter[]{new android.text.InputFilter() { // from class: o.nAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.text.InputFilter
            public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
                return ActivityC33638nAh.KWHzl(this.EZpvd, charSequence, i, i2, spanned, i3, i4);
            }
        }, new android.text.InputFilter() { // from class: o.nAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.text.InputFilter
            public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
                return ActivityC33638nAh.OLrzqt(charSequence, i, i2, spanned, i3, i4);
            }
        }};
    }

    public static final java.lang.CharSequence KWHzl(ActivityC33638nAh activityC33638nAh, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        int iKWHzl = activityC33638nAh.EZpvd().KWHzl();
        java.lang.String string = spanned.toString();
        java.lang.String strSubstring = string.substring(0, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        java.lang.String strSubstring2 = string.substring(i4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        java.lang.String str = strSubstring + ((java.lang.Object) charSequenceSubSequence) + strSubstring2;
        if (str.codePointCount(0, str.length()) > iKWHzl) {
            java.lang.String string2 = charSequence.subSequence(i, i2).toString();
            int iCodePointCount = string2.codePointCount(0, string2.length());
            java.lang.String strSubstring3 = string.substring(0, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            int iCodePointCount2 = strSubstring3.codePointCount(0, i3);
            java.lang.String strSubstring4 = string.substring(i4);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            if (iCodePointCount > iKWHzl - (iCodePointCount2 + strSubstring4.codePointCount(0, string.length() - i4))) {
                return "";
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o.nAh$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            EditRelationViewModel editRelationViewModelEZpvd = ActivityC33638nAh.this.EZpvd();
            java.lang.String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            editRelationViewModelEZpvd.OLrzqt(string);
        }
    }

    public static final java.lang.CharSequence OLrzqt(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (!java.lang.Character.isLetterOrDigit(cCharAt) && !java.lang.Character.isIdeographic(cCharAt) && !java.lang.Character.isSpaceChar(cCharAt) && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) "-/:;()$&@\".,?!'[]{}#%^*+=_\\|~<>¥£€•.,?!'", cCharAt, false, 2, (java.lang.Object) null) && !C33480mxJ.EZpvd(charSequence.toString())) {
                return "";
            }
            i++;
        }
        return null;
    }

    public final EditRelationViewModel EZpvd() {
        return (EditRelationViewModel) this.copydefault.getValue();
    }

    public final OKEditText OLrzqt() {
        return AEQbTJ().OLrzqt.EZpvd;
    }

    @Override // o.AbstractActivityC33641nAk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        nHY nhyAEQbTJ = nHY.AEQbTJ(getLayoutInflater());
        setContentView(nhyAEQbTJ.getRoot());
        this.EZpvd = nhyAEQbTJ;
        isConnected();
        gEmmrt();
    }

    private final void isConnected() {
        nHY nhyAEQbTJ = AEQbTJ();
        androidx.appcompat.widget.Toolbar toolbar = nhyAEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, nhyAEQbTJ.AhwBna, getString(C35399nuc.LoaderManager.haRtnV));
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setHomeAsUpIndicator(C52761wXj.TaskDescription.iUnTnt);
        }
        android.graphics.drawable.Drawable navigationIcon = nhyAEQbTJ.djBIcL.getNavigationIcon();
        if (navigationIcon != null) {
            DrawableCompat.setTint(navigationIcon.mutate(), ContextCompat.getColor(this, C52761wXj.Activity.fdOvFl));
        }
        OKEditText oKEditTextOLrzqt = OLrzqt();
        if (oKEditTextOLrzqt != null) {
            oKEditTextOLrzqt.setFilters(KWHzl());
            oKEditTextOLrzqt.addTextChangedListener(new Activity());
        }
        nhyAEQbTJ.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC33638nAh.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final void EZpvd(ActivityC33638nAh activityC33638nAh, android.view.View view) {
        activityC33638nAh.AYXKKw();
        activityC33638nAh.EZpvd().valueOf();
    }

    private final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EditRelationActivity$observeViewModel$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EditRelationActivity$observeViewModel$2(this, null), 3, null);
        EZpvd().OLrzqt();
    }

    public final void OLrzqt(EditRelationViewModel.StateListAnimator stateListAnimator) {
        nHY nhyAEQbTJ = AEQbTJ();
        nhyAEQbTJ.KWHzl.EZpvd.setText(stateListAnimator.EZpvd());
        copydefault(stateListAnimator.copydefault());
        int iCodePointCount = stateListAnimator.copydefault().codePointCount(0, stateListAnimator.copydefault().length());
        android.widget.TextView textView = nhyAEQbTJ.OLrzqt.OLrzqt;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "%d/%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iCodePointCount), java.lang.Integer.valueOf(EZpvd().KWHzl())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        textView.setText(str);
        nhyAEQbTJ.AEQbTJ.setEnabled(stateListAnimator.KWHzl());
        if (stateListAnimator.OLrzqt()) {
            showLoading();
        } else {
            dismissLoading();
        }
    }

    public final void copydefault(java.lang.String str) {
        OKEditText oKEditTextOLrzqt = OLrzqt();
        if (oKEditTextOLrzqt == null || Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(oKEditTextOLrzqt.getText()), (java.lang.Object) str)) {
            return;
        }
        oKEditTextOLrzqt.setText(str);
        oKEditTextOLrzqt.setSelection(str.length());
        if (str.length() > 0) {
            oKEditTextOLrzqt.requestFocus();
        }
    }

    public final void OLrzqt(EditRelationViewModel.TaskDescription taskDescription) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        if (taskDescription instanceof EditRelationViewModel.TaskDescription.Application) {
            setResult(-1);
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.hBORwR), 0, 1, (java.lang.Object) null);
            finish();
            return;
        }
        if (taskDescription instanceof EditRelationViewModel.TaskDescription.ActionBar) {
            java.lang.String strCopydefault = ((EditRelationViewModel.TaskDescription.ActionBar) taskDescription).copydefault();
            try {
                Result.Application application = Result.Companion;
                C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
            if (thM7380exceptionOrNullimpl != null) {
                C44157sFk.KWHzl(thM7380exceptionOrNullimpl);
            }
            EZpvd().AEQbTJ();
            return;
        }
        if (!(taskDescription instanceof EditRelationViewModel.TaskDescription.C0403TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String strKWHzl = ((EditRelationViewModel.TaskDescription.C0403TaskDescription) taskDescription).KWHzl();
        try {
            Result.Application application3 = Result.Companion;
            C55326xho.toastWithFailedIcon$default(strKWHzl, 0, 1, (java.lang.Object) null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl2 != null) {
            C44157sFk.KWHzl(thM7380exceptionOrNullimpl2);
        }
        rVN.reportFullyDrawn$default((android.app.Activity) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        finish();
    }

    private final void AYXKKw() {
        C33570myu.AEQbTJ((android.content.Context) this, (android.view.View) OLrzqt());
    }

    @Override // o.AbstractActivityC33641nAk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.EZpvd = null;
    }

    @Override // o.AbstractActivityC33641nAk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33641nAk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33641nAk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33641nAk, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
