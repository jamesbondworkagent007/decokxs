package o;

import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$11;
import com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$12;
import com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$8;
import com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$9;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C14557dnh;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC16031ecJ extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public C16297ehK AEQbTJ;
    public final InterfaceC14563dnn AhwBna = new C14565dnp();
    public final InterfaceC56387yDm EZpvd;
    public final C57586ylH KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final ActivityResultLauncher<Unit> djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX INFO: renamed from: o.ecJ$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final boolean AEQbTJ(android.view.View view, android.view.MotionEvent motionEvent) {
        return false;
    }

    public ActivityC16031ecJ() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C16103edc.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.ecM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC16031ecJ.copydefault();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$special$$inlined$viewModels$default$3
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
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(C16102edb.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$special$$inlined$viewModels$default$5
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
        }, new Function0() { // from class: o.ecQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC16031ecJ.EZpvd();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$special$$inlined$viewModels$default$6
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
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(C19631gJn.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$special$$inlined$viewModels$default$9
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
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ScannerActivity.Activity.getResultContract$default(ScannerActivity.Companion, new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), false, null, true, false, null, false, null, 3941, null), yDY.AhwBna(), null, 4, null), new ActivityResultCallback() { // from class: o.ecS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC16031ecJ.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
        this.KWHzl = new C57586ylH(new Function1() { // from class: o.ecO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16031ecJ.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.ecJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ecJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC16031ecJ.class));
        }
    }

    public static final ViewModelProvider.Factory copydefault() {
        return C16103edc.Companion.copydefault();
    }

    public final C16103edc AYXKKw() {
        return (C16103edc) this.OLrzqt.getValue();
    }

    public static final ViewModelProvider.Factory EZpvd() {
        return C16102edb.Companion.OLrzqt();
    }

    public final C16102edb OLrzqt() {
        return (C16102edb) this.EZpvd.getValue();
    }

    private final C19631gJn djBIcL() {
        return (C19631gJn) this.gEmmrt.getValue();
    }

    /* JADX INFO: renamed from: o.ecJ$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ C16297ehK copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(C16297ehK c16297ehK) {
            this.copydefault = c16297ehK;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C52794wYp c52794wYpCopydefault = this.copydefault.copydefault.copydefault();
            int i = 0;
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(!(editable == null || StringsKt__StringsKt.fARcdN(editable)));
            }
            C52794wYp c52794wYp = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(true ^ (editable == null || editable.length() == 0) ? 0 : 8);
            C52794wYp c52794wYp2 = this.copydefault.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            if (editable != null && editable.length() != 0) {
                i = 8;
            }
            c52794wYp2.setVisibility(i);
        }
    }

    public static final void OLrzqt(ActivityC16031ecJ activityC16031ecJ, java.lang.String str) {
        OKEditText oKEditText;
        OKEditText oKEditText2;
        C8349bAz c8349bAz = C8349bAz.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) str);
        TransactionInfo transactionInfoGEmmrt = c8349bAz.gEmmrt(str);
        C16297ehK c16297ehK = activityC16031ecJ.AEQbTJ;
        if (c16297ehK != null && (oKEditText2 = c16297ehK.KWHzl) != null) {
            oKEditText2.setText(transactionInfoGEmmrt.getAddress());
        }
        C16297ehK c16297ehK2 = activityC16031ecJ.AEQbTJ;
        if (c16297ehK2 != null && (oKEditText = c16297ehK2.KWHzl) != null) {
            oKEditText.setSelection(transactionInfoGEmmrt.getAddress().length());
        }
        activityC16031ecJ.valueOf();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.graphics.drawable.Drawable drawable;
        super.onCreate(bundle);
        final C16297ehK c16297ehKKWHzl = C16297ehK.KWHzl(getLayoutInflater());
        this.AEQbTJ = c16297ehKKWHzl;
        Intrinsics.checkNotNullExpressionValue(c16297ehKKWHzl, "");
        dTU.onWeb3Event$default("Web3WalletManagement_ImportWallet_ObserveWallet_View", null, null, 3, null);
        setContentView(c16297ehKKWHzl.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(c16297ehKKWHzl.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.ecU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC16031ecJ.OLrzqt(view, windowInsetsCompat);
            }
        });
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.GGlJim);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, C55298xhM.OLrzqt(20, (android.content.Context) this), C55298xhM.OLrzqt(20, (android.content.Context) this));
            DrawableCompat.setTint(drawable2, ContextCompat.getColor(this, C52761wXj.Activity.iOIMNp));
            drawable = drawable2;
        } else {
            drawable = null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) getString(C13754dXa.FragmentManager.dNxZaP));
        if (drawable != null) {
            C57306yft c57306yft = new C57306yft(drawable, C55298xhM.OLrzqt(4, (android.content.Context) this), 0, 4, null);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.setSpan(c57306yft, length, spannableStringBuilder.length(), 17);
        }
        c16297ehKKWHzl.AhwBna.setText(new android.text.SpannedString(spannableStringBuilder));
        c16297ehKKWHzl.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.ecX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC16031ecJ.onCreate$lambda$10(view);
            }
        });
        OKEditText oKEditText = c16297ehKKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        oKEditText.addTextChangedListener(new StateListAnimator(c16297ehKKWHzl));
        c16297ehKKWHzl.KWHzl.addTextChangedListener(this.KWHzl);
        c16297ehKKWHzl.KWHzl.setOnTouchListener(new View.OnTouchListener() { // from class: o.ecV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return ActivityC16031ecJ.AEQbTJ(view, motionEvent);
            }
        });
        android.widget.ImageView doImage = c16297ehKKWHzl.EZpvd.getDoImage();
        if (doImage != null) {
            doImage.setOnClickListener(new View.OnClickListener() { // from class: o.ecT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC16031ecJ.AEQbTJ(this.KWHzl, view);
                }
            });
        }
        C52794wYp c52794wYpCopydefault = c16297ehKKWHzl.copydefault.copydefault();
        if (c52794wYpCopydefault != null) {
            android.text.Editable text = c16297ehKKWHzl.KWHzl.getText();
            c52794wYpCopydefault.setEnabled(!(text == null || StringsKt__StringsKt.fARcdN(text)));
        }
        C52794wYp c52794wYpCopydefault2 = c16297ehKKWHzl.copydefault.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Activity(c52794wYpCopydefault2, 5000L, this));
        }
        C52794wYp c52794wYp = c16297ehKKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        C19604gIn.KWHzl(c52794wYp, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.dTTfOR, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        c16297ehKKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.ecW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC16031ecJ.EZpvd(c16297ehKKWHzl, view);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletTrackerAddressActivity$onCreate$8(this, c16297ehKKWHzl, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletTrackerAddressActivity$onCreate$9(this, c16297ehKKWHzl, null), 3, null);
        djBIcL().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.eda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16031ecJ.AEQbTJ(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletTrackerAddressActivity$onCreate$11(this, c16297ehKKWHzl, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletTrackerAddressActivity$onCreate$12(this, c16297ehKKWHzl, null), 3, null);
        c16297ehKKWHzl.KWHzl.setImeOptions(6);
        c16297ehKKWHzl.KWHzl.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.ecP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return ActivityC16031ecJ.KWHzl(this.EZpvd, textView, i, keyEvent);
            }
        });
        C52794wYp c52794wYp2 = c16297ehKKWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        C19604gIn.KWHzl(c52794wYp2, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.ZxnNGp, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        C52794wYp c52794wYp3 = c16297ehKKWHzl.djBIcL;
        c52794wYp3.setOnClickListener(new ActionBar(c52794wYp3, 1000L, this, c16297ehKKWHzl));
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ecR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC16031ecJ.djBIcL(this.EZpvd);
            }
        });
    }

    public static final WindowInsetsCompat OLrzqt(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars() | WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), insets.bottom);
        return windowInsetsCompat;
    }

    public static final void onCreate$lambda$10(android.view.View view) {
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.AEQbTJ(C13754dXa.FragmentManager.onPlayFromUri, C13754dXa.FragmentManager.onPlayFromSearch);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.addObserver, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ActivityC16031ecJ activityC16031ecJ, android.view.View view) {
        activityC16031ecJ.djBIcL.launch(Unit.INSTANCE);
    }

    public static final void EZpvd(C16297ehK c16297ehK, android.view.View view) {
        c16297ehK.KWHzl.setText("");
    }

    /* JADX INFO: renamed from: o.ecJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C16297ehK OLrzqt;
        public final /* synthetic */ ActivityC16031ecJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = activityC16031ecJ;
            this.OLrzqt = c16297ehK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.content.ClipData primaryClip;
            java.lang.CharSequence text;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) ContextCompat.getSystemService(this.copydefault, android.content.ClipboardManager.class);
                if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null || text.length() == 0) {
                    return;
                }
                this.OLrzqt.KWHzl.setText(text);
                C33570myu.copydefault((android.app.Activity) this.copydefault);
                android.view.View currentFocus = this.copydefault.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ecJ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC16031ecJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC16031ecJ activityC16031ecJ) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = activityC16031ecJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AhwBna.KWHzl(C14562dnm.AEQbTJ(C14557dnh.Application.KWHzl, "import_type", "watch_only"));
                this.copydefault.valueOf();
            }
        }
    }

    public static final Unit AEQbTJ(ActivityC16031ecJ activityC16031ecJ, AbstractC12782ctV abstractC12782ctV) {
        dZK.AEQbTJ.AEQbTJ(activityC16031ecJ, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(ActivityC16031ecJ activityC16031ecJ, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1) {
            return true;
        }
        activityC16031ecJ.valueOf();
        return false;
    }

    public static final void djBIcL(ActivityC16031ecJ activityC16031ecJ) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC16031ecJ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        OKEditText oKEditText;
        super.onResume();
        C16297ehK c16297ehK = this.AEQbTJ;
        if (c16297ehK == null || (oKEditText = c16297ehK.KWHzl) == null) {
            return;
        }
        oKEditText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        OKEditText oKEditText;
        android.text.Editable text;
        OKEditText oKEditText2;
        C33570myu.copydefault((android.app.Activity) this);
        C16297ehK c16297ehK = this.AEQbTJ;
        if (c16297ehK != null && (oKEditText2 = c16297ehK.KWHzl) != null) {
            oKEditText2.clearFocus();
        }
        C16297ehK c16297ehK2 = this.AEQbTJ;
        java.lang.String string = (c16297ehK2 == null || (oKEditText = c16297ehK2.KWHzl) == null || (text = oKEditText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        copydefault(string);
    }

    public final void copydefault(java.lang.String str) {
        java.util.List<C13853daS> listAEQbTJ = C13847daM.Companion.AEQbTJ(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAEQbTJ) {
            if (((C13853daS) obj).copydefault().fetchVPNInfo() != 607 || !C59449zhJ.startsWith$default(str, "E", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        if ((!arrayList.isEmpty()) && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            if (arrayList.size() == 1) {
                long jAEQbTJ = ((C13853daS) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).copydefault().AEQbTJ();
                if (str.length() > 12) {
                    showLoading();
                    OLrzqt().OLrzqt(str, jAEQbTJ);
                    return;
                } else {
                    showLoading();
                    AYXKKw().copydefault(str, java.lang.Long.valueOf(jAEQbTJ), "", str, "");
                    return;
                }
            }
            OLrzqt().EZpvd(str);
            return;
        }
        showLoading();
        AYXKKw().copydefault(str, null, str, str, str);
    }

    public final void AEQbTJ(long j, java.lang.String str) {
        C19631gJn.importTrackingWallet$default(djBIcL(), j, str, false, getSupportFragmentManager(), 4, null);
    }

    public static final Unit AEQbTJ(ActivityC16031ecJ activityC16031ecJ, java.lang.String str) {
        OKEditText oKEditText;
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        C16297ehK c16297ehK = activityC16031ecJ.AEQbTJ;
        if (c16297ehK != null && (textView = c16297ehK.AEQbTJ) != null) {
            textView.setVisibility(8);
        }
        C16297ehK c16297ehK2 = activityC16031ecJ.AEQbTJ;
        if (c16297ehK2 != null && (oKEditText = c16297ehK2.KWHzl) != null) {
            oKEditText.setHint(str.length() == 0 ? activityC16031ecJ.getString(C13754dXa.FragmentManager.Rid) : "");
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        int color = ContextCompat.getColor(this, C52761wXj.Activity.registerUser);
        boolean z = !C33492mxV.OLrzqt();
        C33567myr.AEQbTJ(this, z);
        getWindow().setNavigationBarColor(color);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
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
    public void onStart() {
        super.onStart();
    }
}
