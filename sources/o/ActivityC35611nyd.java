package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.business.web3pay.api.model.PayTransactionUidRecipient;
import com.okinc.business.web3pay.api.model.Web3PayProjectId;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.contacts.ContactProfileFragment;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC33638nAh;
import o.C35399nuc;
import o.C35652nzR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nyd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC35611nyd extends AbstractActivityC35661nza {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public C33868nIv AEQbTJ;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;

    public ActivityC35611nyd() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.nyj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC35611nyd.OLrzqt(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.nyd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nyd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(StateListAnimator stateListAnimator, android.content.Context context, java.lang.String str, java.lang.String str2, OKConversation oKConversation, boolean z, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                z = true;
            }
            return stateListAnimator.OLrzqt(context, str, str2, oKConversation, z);
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, java.lang.String str, @NotNull java.lang.String str2, OKConversation oKConversation, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC35611nyd.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("origin", str), C56390yDp.OLrzqt("id", str2), C56390yDp.OLrzqt("conversation", oKConversation), C56390yDp.OLrzqt("show_messages_settings", java.lang.Boolean.valueOf(z))));
            return intent;
        }
    }

    public final void OLrzqt(boolean z) {
        ConstraintLayout constraintLayout;
        C33868nIv c33868nIv = this.AEQbTJ;
        if (c33868nIv == null || (constraintLayout = c33868nIv.EZpvd) == null) {
            return;
        }
        constraintLayout.setVisibility(z ? 0 : 8);
    }

    /* JADX DEBUG: Possible override for method o.nza.KWHzl()V */
    public final ContactProfileFragment KWHzl() {
        C33868nIv c33868nIv = this.AEQbTJ;
        if (c33868nIv != null) {
            androidx.fragment.app.Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(c33868nIv.AEQbTJ.getId());
            if (fragmentFindFragmentById instanceof ContactProfileFragment) {
                return (ContactProfileFragment) fragmentFindFragmentById;
            }
        }
        return null;
    }

    public static final void OLrzqt(ActivityC35611nyd activityC35611nyd, ActivityResult activityResult) {
        ContactProfileFragment contactProfileFragmentKWHzl;
        if (activityResult.getResultCode() != -1 || (contactProfileFragmentKWHzl = activityC35611nyd.KWHzl()) == null) {
            return;
        }
        FragmentKt.setFragmentResult(contactProfileFragmentKWHzl, "REQUEST_KEY_REFRESH", BundleKt.bundleOf());
    }

    @Override // o.AbstractActivityC35661nza, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL();
        C33868nIv c33868nIvOLrzqt = C33868nIv.OLrzqt(getLayoutInflater());
        this.AEQbTJ = c33868nIvOLrzqt;
        setContentView(c33868nIvOLrzqt != null ? c33868nIvOLrzqt.getRoot() : null);
        AEQbTJ();
        OLrzqt();
        if (bundle == null) {
            ContactProfileFragment contactProfileFragmentAEQbTJ = ContactProfileFragment.Companion.AEQbTJ(getIntent().getExtras());
            C33868nIv c33868nIv = this.AEQbTJ;
            if (c33868nIv != null) {
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                fragmentTransactionBeginTransaction.replace(c33868nIv.AEQbTJ.getId(), contactProfileFragmentAEQbTJ);
                fragmentTransactionBeginTransaction.commit();
            }
        }
        EZpvd();
    }

    @Override // o.AbstractActivityC35661nza, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AEQbTJ = null;
    }

    public final void djBIcL() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(C33492mxV.OLrzqt());
    }

    public final void AEQbTJ() {
        ConstraintLayout constraintLayout;
        C33868nIv c33868nIv = this.AEQbTJ;
        if (c33868nIv == null || (constraintLayout = c33868nIv.EZpvd) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(constraintLayout, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.nyn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC35611nyd.AEQbTJ(view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat AEQbTJ(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = insets.top;
            view.setLayoutParams(layoutParams2);
        }
        return windowInsetsCompat;
    }

    public final void OLrzqt() {
        wYC wyc;
        C33868nIv c33868nIv = this.AEQbTJ;
        if (c33868nIv == null || (wyc = c33868nIv.OLrzqt) == null) {
            return;
        }
        wyc.setOnClickListener(new View.OnClickListener() { // from class: o.nyh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC35611nyd.OLrzqt(this.copydefault, view);
            }
        });
    }

    public static final void OLrzqt(ActivityC35611nyd activityC35611nyd, android.view.View view) {
        activityC35611nyd.getOnBackPressedDispatcher().onBackPressed();
    }

    public final void EZpvd() {
        getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_REMOVE_CONTACT", this, new FragmentResultListener() { // from class: o.nye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC35611nyd.EZpvd(this.EZpvd, str, bundle);
            }
        });
        getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_ACTION", this, new FragmentResultListener() { // from class: o.nyi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC35611nyd.djBIcL(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void EZpvd(ActivityC35611nyd activityC35611nyd, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("result", false)) {
            activityC35611nyd.setResult(-1);
            activityC35611nyd.finish();
        }
    }

    public static final void djBIcL(ActivityC35611nyd activityC35611nyd, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ContactProfileFragment.Action action = (ContactProfileFragment.Action) BundleCompat.getParcelable(bundle, "RESULT_KEY_ACTION", ContactProfileFragment.Action.class);
        if (action != null) {
            activityC35611nyd.EZpvd(action);
        }
    }

    private final void EZpvd(ContactProfileFragment.Action action) {
        if (action instanceof ContactProfileFragment.Action.BlockUser) {
            OLrzqt((ContactProfileFragment.Action.BlockUser) action);
            return;
        }
        if (action instanceof ContactProfileFragment.Action.UnFriend) {
            KWHzl((ContactProfileFragment.Action.UnFriend) action);
            return;
        }
        if (action instanceof ContactProfileFragment.Action.AddFriend) {
            copydefault((ContactProfileFragment.Action.AddFriend) action);
            return;
        }
        if (action instanceof ContactProfileFragment.Action.SendMessage) {
            OLrzqt((ContactProfileFragment.Action.SendMessage) action);
            return;
        }
        if (action instanceof ContactProfileFragment.Action.Pay) {
            KWHzl((ContactProfileFragment.Action.Pay) action);
            return;
        }
        if (action instanceof ContactProfileFragment.Action.EditAlias) {
            AEQbTJ((ContactProfileFragment.Action.EditAlias) action);
        } else if (action instanceof ContactProfileFragment.Action.ViewPlanetProfile) {
            KWHzl((ContactProfileFragment.Action.ViewPlanetProfile) action);
        } else {
            if (!(action instanceof ContactProfileFragment.Action.RemoveMember)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.KWHzl(getTAG(), "RemoveMember action is not applicable in ContactProfileActivityV2");
        }
    }

    public final void OLrzqt(ContactProfileFragment.Action.BlockUser blockUser) {
        C35580nxz c35580nxzAEQbTJ = C35580nxz.Companion.AEQbTJ("KEY_REQUEST_BLOCK_CONTACT", blockUser.EZpvd());
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c35580nxzAEQbTJ.show(supportFragmentManager, "BlockContactDialogFragment");
        FragmentKt.setFragmentResultListener(c35580nxzAEQbTJ, "KEY_REQUEST_BLOCK_CONTACT", new Function2() { // from class: o.nyq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC35611nyd.AEQbTJ(this.KWHzl, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC35611nyd activityC35611nyd, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("KEY_BLOCK_CONTACT_RESULT", false)) {
            ContactProfileFragment contactProfileFragmentKWHzl = activityC35611nyd.KWHzl();
            if (contactProfileFragmentKWHzl != null) {
                FragmentKt.setFragmentResult(contactProfileFragmentKWHzl, "REQUEST_KEY_REFRESH", BundleKt.bundleOf());
            }
        } else {
            C35664nzd c35664nzdCopydefault = C35664nzd.Companion.copydefault(bundle.getInt("KEY_BLOCK_CONTACT_ERROR", 0));
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC35611nyd.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c35664nzdCopydefault.show(supportFragmentManager, "FailedBlockContactDialogFragment");
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final ContactProfileFragment.Action.UnFriend unFriend) {
        C35675nzo c35675nzoAEQbTJ = C35675nzo.Companion.AEQbTJ(unFriend.copydefault());
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c35675nzoAEQbTJ.show(supportFragmentManager, "RemoveContactDialogFragment");
        FragmentKt.setFragmentResultListener(c35675nzoAEQbTJ, "KEY_REQUEST_REMOVE_CONTACT", new Function2() { // from class: o.nyo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC35611nyd.AEQbTJ(this.OLrzqt, unFriend, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC35611nyd activityC35611nyd, ContactProfileFragment.Action.UnFriend unFriend, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("result", false)) {
            C55326xho.toastWithSuccessfulIcon$default(C33069mpW.KWHzl(activityC35611nyd, C35399nuc.LoaderManager.sQOHWT, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C44157sFk.getDisplayName$default(unFriend.copydefault(), null, 1, null)))), 0, 1, (java.lang.Object) null);
            ContactProfileFragment contactProfileFragmentKWHzl = activityC35611nyd.KWHzl();
            if (contactProfileFragmentKWHzl != null) {
                FragmentKt.setFragmentResult(contactProfileFragmentKWHzl, "REQUEST_KEY_REFRESH", bundle);
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final ContactProfileFragment.Action.AddFriend addFriend) {
        C35652nzR c35652nzRNewInstance$default = C35652nzR.ActionBar.newInstance$default(C35652nzR.Companion, "REQUEST_KET_ADD_CONTACT", addFriend.KWHzl(), "contacts_info", null, 8, null);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c35652nzRNewInstance$default.show(supportFragmentManager, "AddContactDialogFragment");
        FragmentKt.setFragmentResultListener(c35652nzRNewInstance$default, "REQUEST_KET_ADD_CONTACT", new Function2() { // from class: o.nyl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC35611nyd.EZpvd(this.AEQbTJ, addFriend, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
    }

    public static final Unit EZpvd(ActivityC35611nyd activityC35611nyd, ContactProfileFragment.Action.AddFriend addFriend, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ContactProfileFragment contactProfileFragmentKWHzl = activityC35611nyd.KWHzl();
        if (contactProfileFragmentKWHzl != null) {
            FragmentKt.setFragmentResult(contactProfileFragmentKWHzl, "REQUEST_KEY_REFRESH", BundleKt.bundleOf());
        }
        if (bundle.getBoolean("result", false)) {
            C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.hUfVAv, 0, 1, (java.lang.Object) null);
            oBJ obj = oBJ.EZpvd;
            OKConversation oKConversationAEQbTJ = addFriend.AEQbTJ();
            java.lang.String targetId = oKConversationAEQbTJ != null ? oKConversationAEQbTJ.getTargetId() : null;
            obj.KWHzl(targetId != null ? targetId : "", false);
            if (yDY.gEmmrt(ChatOrigin.CHAT.getValue(), ChatOrigin.MESSAGE_AVATAR.getValue(), ChatOrigin.CONTACT_SETTINGS.getValue()).contains(addFriend.EZpvd().getValue())) {
                C33791nFz.startMessageCenter$default(C33791nFz.KWHzl, (android.content.Context) activityC35611nyd, ChatOrigin.CONTACT_INFO.getValue(), false, 4, (java.lang.Object) null);
            }
            activityC35611nyd.finish();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ContactProfileFragment.Action.SendMessage sendMessage) {
        if (sendMessage.OLrzqt() != ChatOrigin.CHAT) {
            C33764nEz.OLrzqt.copydefault(sendMessage.EZpvd(), this, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : "contact_info", (204 & 32) != 0 ? null : sendMessage.copydefault().getContactsId(), (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
            C37290oqz.copydefault.AEQbTJ(this);
        } else {
            getOnBackPressedDispatcher().onBackPressed();
        }
    }

    public final void KWHzl(ContactProfileFragment.Action.Pay pay) {
        PayTransactionUidRecipient payTransactionUidRecipient = new PayTransactionUidRecipient(C44157sFk.getDisplayName$default(pay.EZpvd(), null, 1, null), pay.EZpvd().getAvatar(), pay.EZpvd().getContactsId());
        final InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
        if (interfaceC31257lqc != null) {
            getSupportFragmentManager().setFragmentResultListener(interfaceC31257lqc.EZpvd(), this, new FragmentResultListener() { // from class: o.nyk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    ActivityC35611nyd.OLrzqt(interfaceC31257lqc, this, str, bundle);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC31257lqc.EZpvd(supportFragmentManager, payTransactionUidRecipient, Web3PayProjectId.IM_PAY);
        }
    }

    public static final void OLrzqt(InterfaceC31257lqc interfaceC31257lqc, ActivityC35611nyd activityC35611nyd, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean zKWHzl = interfaceC31257lqc.KWHzl(bundle);
        pUU.KWHzl(activityC35611nyd.getTAG(), "startPayFlowResult=" + zKWHzl);
    }

    public final void AEQbTJ(ContactProfileFragment.Action.EditAlias editAlias) {
        this.OLrzqt.launch(ActivityC33638nAh.StateListAnimator.createIntent$default(ActivityC33638nAh.Companion, this, editAlias.AEQbTJ().getContactsId(), null, 4, null));
    }

    public final void KWHzl(ContactProfileFragment.Action.ViewPlanetProfile viewPlanetProfile) {
        tWL twl = (tWL) C43251rlk.OLrzqt(tWL.class);
        if (twl != null) {
            twl.KWHzl(this, viewPlanetProfile.OLrzqt(), "", "", "im", "");
        }
    }

    @Override // o.AbstractActivityC35661nza, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC35661nza, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC35661nza, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC35661nza, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
