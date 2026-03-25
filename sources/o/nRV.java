package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.edit.EditGroupAvatarAndNameActivity$observeViewModel$1;
import com.okinc.im.imui.group.edit.EditGroupAvatarAndNameActivity$observeViewModel$2;
import com.okinc.im.imui.group.edit.EditGroupAvatarAndNameViewModel;
import com.okinc.im.imui.picker.PickerSelectionType;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC35723oBh;
import o.C35399nuc;
import o.C37152ooT;
import o.C52761wXj;
import o.C55284xgz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nRV extends AbstractActivityC34122nSf implements AbstractC35723oBh.Activity {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C33848nIb AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC35723oBh copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EditGroupAvatarAndNameViewModel.SavedChangeType.values().length];
            try {
                iArr[EditGroupAvatarAndNameViewModel.SavedChangeType.ADMIN_NAME_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EditGroupAvatarAndNameViewModel.SavedChangeType.CUSTOMER_NAME_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EditGroupAvatarAndNameViewModel.SavedChangeType.BOTH_NAMES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[EditGroupAvatarAndNameViewModel.SavedChangeType.OTHER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    public nRV() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(EditGroupAvatarAndNameViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.edit.EditGroupAvatarAndNameActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.edit.EditGroupAvatarAndNameActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.edit.EditGroupAvatarAndNameActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nRV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) nRV.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupInfo)));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.nSf.EZpvd()V */
    public final EditGroupAvatarAndNameViewModel EZpvd() {
        return (EditGroupAvatarAndNameViewModel) this.KWHzl.getValue();
    }

    @Override // o.AbstractActivityC34122nSf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C33848nIb c33848nIbAEQbTJ = C33848nIb.AEQbTJ(getLayoutInflater());
        this.AEQbTJ = c33848nIbAEQbTJ;
        if (c33848nIbAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c33848nIbAEQbTJ = null;
        }
        setContentView(c33848nIbAEQbTJ.getRoot());
        djBIcL();
        AYXKKw();
    }

    private final void djBIcL() {
        OKEditText oKEditText;
        C33848nIb c33848nIb = this.AEQbTJ;
        if (c33848nIb == null) {
            Intrinsics.gEmmrt("");
            c33848nIb = null;
        }
        androidx.appcompat.widget.Toolbar toolbar = c33848nIb.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, c33848nIb.DbNXlk, getString(C35399nuc.LoaderManager.fruYXx));
        OKEditText oKEditText2 = c33848nIb.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKEditText2, "");
        oKEditText2.addTextChangedListener(new Application());
        nOA noa = c33848nIb.EZpvd;
        noa.KWHzl.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QnnRaN));
        OKEditText oKEditText3 = noa.OLrzqt;
        oKEditText3.setHint(C33070mpX.AYXKKw(C35399nuc.LoaderManager.GiPPlL));
        Intrinsics.copydefault(oKEditText3);
        oKEditText3.addTextChangedListener(new ActionBar());
        oIW oiw = c33848nIb.AEQbTJ.AEQbTJ;
        oiw.setMaxLength(120);
        oiw.setShowCount(true);
        C55001xbh c55001xbhCopydefault = oiw.copydefault();
        if (c55001xbhCopydefault != null) {
            c55001xbhCopydefault.setTextSize(16.0f);
            TextViewCompat.setLineHeight(c55001xbhCopydefault, C55298xhM.dpInt$default(24.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        C55001xbh c55001xbhCopydefault2 = oiw.copydefault();
        if (c55001xbhCopydefault2 != null) {
            c55001xbhCopydefault2.addTextChangedListener(new Activity(oiw, this));
        }
        c33848nIb.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.nRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nRV.OLrzqt(this.KWHzl, view);
            }
        });
        c33848nIb.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.nRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nRV.KWHzl(this.OLrzqt, view);
            }
        });
        c33848nIb.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nRV.djBIcL(this.EZpvd, view);
            }
        });
        if (EZpvd().copydefault().getValue().AEQbTJ()) {
            oKEditText = c33848nIb.EZpvd.OLrzqt;
        } else {
            oKEditText = c33848nIb.OLrzqt.OLrzqt;
        }
        Intrinsics.copydefault(oKEditText);
        oKEditText.requestFocus();
    }

    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            EditGroupAvatarAndNameViewModel editGroupAvatarAndNameViewModelEZpvd = nRV.this.EZpvd();
            java.lang.String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            editGroupAvatarAndNameViewModelEZpvd.EZpvd(string);
        }
    }

    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ nRV EZpvd;
        public final /* synthetic */ oIW OLrzqt;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(oIW oiw, nRV nrv) {
            this.OLrzqt = oiw;
            this.EZpvd = nrv;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.OLrzqt.setState(0);
            C33848nIb c33848nIb = this.EZpvd.AEQbTJ;
            if (c33848nIb == null) {
                Intrinsics.gEmmrt("");
                c33848nIb = null;
            }
            c33848nIb.AEQbTJ.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            EditGroupAvatarAndNameViewModel editGroupAvatarAndNameViewModelEZpvd = this.EZpvd.EZpvd();
            java.lang.String string = charSequence != null ? charSequence.toString() : null;
            editGroupAvatarAndNameViewModelEZpvd.OLrzqt(string != null ? string : "");
        }
    }

    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            EditGroupAvatarAndNameViewModel editGroupAvatarAndNameViewModelEZpvd = nRV.this.EZpvd();
            java.lang.String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            editGroupAvatarAndNameViewModelEZpvd.AEQbTJ(string);
        }
    }

    public static final void OLrzqt(nRV nrv, android.view.View view) {
        nrv.valueOf();
        nrv.EZpvd().KWHzl();
    }

    public static final void KWHzl(nRV nrv, android.view.View view) {
        nrv.valueOf();
        nrv.EZpvd().KWHzl();
    }

    public static final void djBIcL(nRV nrv, android.view.View view) {
        nrv.valueOf();
        nrv.EZpvd().AEQbTJ();
    }

    private final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EditGroupAvatarAndNameActivity$observeViewModel$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EditGroupAvatarAndNameActivity$observeViewModel$2(this, null), 3, null);
    }

    public final void copydefault(EditGroupAvatarAndNameViewModel.Application application) {
        java.lang.String strOLrzqt;
        C33848nIb c33848nIb = this.AEQbTJ;
        C33848nIb c33848nIb2 = null;
        if (c33848nIb == null) {
            Intrinsics.gEmmrt("");
            c33848nIb = null;
        }
        OKEditText oKEditText = c33848nIb.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        KWHzl(oKEditText, application.copydefault());
        OLrzqt(application);
        C33848nIb c33848nIb3 = this.AEQbTJ;
        if (c33848nIb3 == null) {
            Intrinsics.gEmmrt("");
            c33848nIb3 = null;
        }
        oIW oiw = c33848nIb3.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oiw, "");
        EZpvd(oiw, application.KWHzl());
        android.net.Uri uriAhwBna = application.AhwBna();
        if (uriAhwBna == null || (strOLrzqt = uriAhwBna.toString()) == null) {
            strOLrzqt = application.OLrzqt();
        }
        C33848nIb c33848nIb4 = this.AEQbTJ;
        if (c33848nIb4 == null) {
            Intrinsics.gEmmrt("");
            c33848nIb4 = null;
        }
        C35893oHp c35893oHp = c33848nIb4.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.loadGroupAvatar$default(c35893oHp, strOLrzqt, null, 2, null);
        C33848nIb c33848nIb5 = this.AEQbTJ;
        if (c33848nIb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33848nIb2 = c33848nIb5;
        }
        c33848nIb2.copydefault.setEnabled(application.DbNXlk());
        if (application.AkhnZx()) {
            showLoading();
        } else {
            dismissLoading();
        }
    }

    public final void OLrzqt(EditGroupAvatarAndNameViewModel.Application application) {
        C33848nIb c33848nIb = this.AEQbTJ;
        C33848nIb c33848nIb2 = null;
        if (c33848nIb == null) {
            Intrinsics.gEmmrt("");
            c33848nIb = null;
        }
        android.widget.LinearLayout linearLayout = c33848nIb.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(application.AEQbTJ() ? 0 : 8);
        C33848nIb c33848nIb3 = this.AEQbTJ;
        if (c33848nIb3 == null) {
            Intrinsics.gEmmrt("");
            c33848nIb3 = null;
        }
        android.widget.TextView textView = c33848nIb3.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(application.AEQbTJ() ? 0 : 8);
        if (application.AEQbTJ()) {
            C33848nIb c33848nIb4 = this.AEQbTJ;
            if (c33848nIb4 == null) {
                Intrinsics.gEmmrt("");
                c33848nIb4 = null;
            }
            c33848nIb4.OLrzqt.KWHzl.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QiTXOm));
            C33848nIb c33848nIb5 = this.AEQbTJ;
            if (c33848nIb5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c33848nIb2 = c33848nIb5;
            }
            OKEditText oKEditText = c33848nIb2.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(oKEditText, "");
            KWHzl(oKEditText, application.EZpvd());
        }
    }

    public final void KWHzl(android.widget.EditText editText, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) editText.getText().toString(), (java.lang.Object) str)) {
            return;
        }
        editText.setText(str);
        editText.setSelection(editText.getText().length());
    }

    public final void EZpvd(oIW oiw, java.lang.String str) {
        C55001xbh c55001xbhCopydefault = oiw.copydefault();
        if (c55001xbhCopydefault == null) {
            return;
        }
        KWHzl(c55001xbhCopydefault, str);
    }

    public final void copydefault(EditGroupAvatarAndNameViewModel.Activity activity) {
        if (activity instanceof EditGroupAvatarAndNameViewModel.Activity.ActionBar) {
            java.lang.String strEZpvd = EZpvd(((EditGroupAvatarAndNameViewModel.Activity.ActionBar) activity).OLrzqt());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("RESULT_KEY_SUCCESS_MESSAGE", strEZpvd);
            setResult(-1, intent);
            finish();
            return;
        }
        if (activity instanceof EditGroupAvatarAndNameViewModel.Activity.C0418Activity) {
            copydefault(((EditGroupAvatarAndNameViewModel.Activity.C0418Activity) activity).AEQbTJ());
            EZpvd().EZpvd();
            return;
        }
        if (activity instanceof EditGroupAvatarAndNameViewModel.Activity.TaskDescription) {
            gEmmrt();
            return;
        }
        if (!(activity instanceof EditGroupAvatarAndNameViewModel.Activity.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        C33848nIb c33848nIb = this.AEQbTJ;
        C33848nIb c33848nIb2 = null;
        if (c33848nIb == null) {
            Intrinsics.gEmmrt("");
            c33848nIb = null;
        }
        c33848nIb.AEQbTJ.AEQbTJ.setState(2);
        C33848nIb c33848nIb3 = this.AEQbTJ;
        if (c33848nIb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33848nIb2 = c33848nIb3;
        }
        c33848nIb2.AEQbTJ.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
    }

    public final java.lang.String EZpvd(EditGroupAvatarAndNameViewModel.SavedChangeType savedChangeType) {
        int i = TaskDescription.AEQbTJ[savedChangeType.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.DjzMc);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.f1061a);
        }
        if (i == 3) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.dHAKvv);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.ScLVFT);
    }

    public final void copydefault(java.lang.String str) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        C33848nIb c33848nIb = this.AEQbTJ;
        if (c33848nIb == null) {
            Intrinsics.gEmmrt("");
            c33848nIb = null;
        }
        android.widget.LinearLayout root = c33848nIb.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(root, str);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(2);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    private final void gEmmrt() {
        C37152ooT.Application application = C37152ooT.Companion;
        java.lang.String string = getString(C35399nuc.LoaderManager.OhRmUC);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC35723oBh abstractC35723oBhCopydefault = application.copydefault(string, (30 & 2) != 0, (30 & 4) != 0 ? null : null, (30 & 8) == 0 ? false : true, (30 & 16) == 0 ? null : null, (30 & 32) != 0 ? PickerSelectionType.ALL : PickerSelectionType.PHOTO);
        this.copydefault = abstractC35723oBhCopydefault;
        if (abstractC35723oBhCopydefault != null) {
            abstractC35723oBhCopydefault.show(getSupportFragmentManager(), "PickImageDialogFragment");
        }
    }

    private final void valueOf() {
        C33848nIb c33848nIb = this.AEQbTJ;
        if (c33848nIb == null) {
            Intrinsics.gEmmrt("");
            c33848nIb = null;
        }
        C33570myu.AEQbTJ((android.content.Context) this, (android.view.View) c33848nIb.OLrzqt.OLrzqt);
    }

    @Override // o.AbstractC35723oBh.Activity
    public void copydefault(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        AbstractC35723oBh abstractC35723oBh = this.copydefault;
        if (abstractC35723oBh != null) {
            abstractC35723oBh.dismissAllowingStateLoss();
        }
        EZpvd().OLrzqt(uri);
    }

    @Override // o.AbstractActivityC34122nSf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractC35723oBh abstractC35723oBh = this.copydefault;
        if (abstractC35723oBh != null) {
            abstractC35723oBh.dismissAllowingStateLoss();
        }
    }

    @Override // o.AbstractActivityC34122nSf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34122nSf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34122nSf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34122nSf, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
