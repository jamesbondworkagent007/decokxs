package o;

import android.graphics.drawable.ColorDrawable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
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
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC35548nxT extends AbstractActivityC35663nzc {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<android.content.Intent> djBIcL;

    @Override // o.AbstractActivityC33007moN
    public java.lang.CharSequence EZpvd() {
        return null;
    }

    public ActivityC35548nxT() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.nyf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC35548nxT.EZpvd(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
    }

    public static final void EZpvd(ActivityC35548nxT activityC35548nxT, ActivityResult activityResult) {
        androidx.fragment.app.Fragment fragmentKWHzl;
        if (activityResult.getResultCode() != -1 || (fragmentKWHzl = activityC35548nxT.KWHzl()) == null) {
            return;
        }
        FragmentKt.setFragmentResult(fragmentKWHzl, "REQUEST_KEY_REFRESH", BundleKt.bundleOf());
    }

    @Override // o.AbstractActivityC33007moN
    public androidx.fragment.app.Fragment copydefault() {
        return ContactProfileFragment.Companion.AEQbTJ(getIntent().getExtras());
    }

    @Override // o.AbstractActivityC35663nzc, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setBackgroundDrawable(new ColorDrawable(getColor(C52761wXj.Activity.EZpvd)));
        }
        getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_REMOVE_CONTACT", this, new FragmentResultListener() { // from class: o.nxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                ActivityC35548nxT.KWHzl(this.AEQbTJ, str, bundle2);
            }
        });
        getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_ACTION", this, new FragmentResultListener() { // from class: o.nxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                ActivityC35548nxT.AYXKKw(this.EZpvd, str, bundle2);
            }
        });
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nyb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC35548nxT.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(ActivityC35548nxT activityC35548nxT, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("result", false)) {
            activityC35548nxT.setResult(-1);
            activityC35548nxT.finish();
        }
    }

    public static final void AYXKKw(ActivityC35548nxT activityC35548nxT, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ContactProfileFragment.Action action = (ContactProfileFragment.Action) bundle.getParcelable("RESULT_KEY_ACTION");
        if (action != null) {
            activityC35548nxT.EZpvd(action);
        }
    }

    public static final void AEQbTJ(ActivityC35548nxT activityC35548nxT) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC35548nxT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.nAh.StateListAnimator.createIntent$default(o.nAh$StateListAnimator, android.content.Context, java.lang.String, java.lang.String, int, java.lang.Object):android.content.Intent */
    /* JADX DEBUG: Class process forced to load method for inline: o.nzR.ActionBar.newInstance$default(o.nzR$ActionBar, java.lang.String, com.okinc.okimcore.model.remote.RelationInfo, java.lang.String, java.lang.String, int, java.lang.Object):o.nzR */
    public final void EZpvd(final ContactProfileFragment.Action action) {
        if (action instanceof ContactProfileFragment.Action.BlockUser) {
            C35580nxz c35580nxzAEQbTJ = C35580nxz.Companion.AEQbTJ("KEY_REQUEST_BLOCK_CONTACT", ((ContactProfileFragment.Action.BlockUser) action).EZpvd());
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c35580nxzAEQbTJ.show(supportFragmentManager, "BlockContactDialogFragment");
            FragmentKt.setFragmentResultListener(c35580nxzAEQbTJ, "KEY_REQUEST_BLOCK_CONTACT", new Function2() { // from class: o.nxY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC35548nxT.copydefault(this.AEQbTJ, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
            return;
        }
        if (action instanceof ContactProfileFragment.Action.UnFriend) {
            C35675nzo c35675nzoAEQbTJ = C35675nzo.Companion.AEQbTJ(((ContactProfileFragment.Action.UnFriend) action).copydefault());
            androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            c35675nzoAEQbTJ.show(supportFragmentManager2, "RemoveContactDialogFragment");
            FragmentKt.setFragmentResultListener(c35675nzoAEQbTJ, "KEY_REQUEST_REMOVE_CONTACT", new Function2() { // from class: o.nya
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC35548nxT.copydefault(this.copydefault, action, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
            return;
        }
        if (action instanceof ContactProfileFragment.Action.AddFriend) {
            C35652nzR c35652nzRNewInstance$default = C35652nzR.ActionBar.newInstance$default(C35652nzR.Companion, "REQUEST_KET_ADD_CONTACT", ((ContactProfileFragment.Action.AddFriend) action).KWHzl(), "contacts_info", null, 8, null);
            androidx.fragment.app.FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            c35652nzRNewInstance$default.show(supportFragmentManager3, "AddContactDialogFragment");
            FragmentKt.setFragmentResultListener(c35652nzRNewInstance$default, "REQUEST_KET_ADD_CONTACT", new Function2() { // from class: o.nyg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC35548nxT.AEQbTJ(this.OLrzqt, action, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
            return;
        }
        if (action instanceof ContactProfileFragment.Action.SendMessage) {
            ContactProfileFragment.Action.SendMessage sendMessage = (ContactProfileFragment.Action.SendMessage) action;
            if (sendMessage.OLrzqt() != ChatOrigin.CHAT) {
                C33764nEz.OLrzqt.copydefault(sendMessage.EZpvd(), this, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : "contact_info", (204 & 32) != 0 ? null : sendMessage.copydefault().getContactsId(), (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
                C37290oqz.copydefault.AEQbTJ(this);
                return;
            } else {
                getOnBackPressedDispatcher().onBackPressed();
                return;
            }
        }
        if (action instanceof ContactProfileFragment.Action.Pay) {
            ContactProfileFragment.Action.Pay pay = (ContactProfileFragment.Action.Pay) action;
            PayTransactionUidRecipient payTransactionUidRecipient = new PayTransactionUidRecipient(C44157sFk.getDisplayName$default(pay.EZpvd(), null, 1, null), pay.EZpvd().getAvatar(), pay.EZpvd().getContactsId());
            androidx.fragment.app.FragmentManager supportFragmentManager4 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
            final InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
            if (interfaceC31257lqc != null) {
                supportFragmentManager4.setFragmentResultListener(interfaceC31257lqc.EZpvd(), this, new FragmentResultListener() { // from class: o.nyc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                        ActivityC35548nxT.AEQbTJ(interfaceC31257lqc, this, str, bundle);
                    }
                });
                interfaceC31257lqc.EZpvd(supportFragmentManager4, payTransactionUidRecipient, Web3PayProjectId.IM_PAY);
                return;
            }
            return;
        }
        if (action instanceof ContactProfileFragment.Action.EditAlias) {
            this.djBIcL.launch(ActivityC33638nAh.StateListAnimator.createIntent$default(ActivityC33638nAh.Companion, this, ((ContactProfileFragment.Action.EditAlias) action).AEQbTJ().getContactsId(), null, 4, null));
        } else if (action instanceof ContactProfileFragment.Action.RemoveMember) {
            pUU.valueOf(getTAG(), "RemoveMember action is not applicable in ContactProfileActivity");
        } else {
            if (!(action instanceof ContactProfileFragment.Action.ViewPlanetProfile)) {
                throw new NoWhenBranchMatchedException();
            }
            tWL twl = (tWL) C43251rlk.OLrzqt(tWL.class);
            if (twl != null) {
                twl.KWHzl(this, ((ContactProfileFragment.Action.ViewPlanetProfile) action).OLrzqt(), "", "", "im", "");
            }
        }
    }

    public static final Unit copydefault(ActivityC35548nxT activityC35548nxT, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("KEY_BLOCK_CONTACT_RESULT", false)) {
            androidx.fragment.app.Fragment fragmentKWHzl = activityC35548nxT.KWHzl();
            if (fragmentKWHzl != null) {
                FragmentKt.setFragmentResult(fragmentKWHzl, "REQUEST_KEY_REFRESH", BundleKt.bundleOf());
            }
        } else {
            C35664nzd c35664nzdCopydefault = C35664nzd.Companion.copydefault(bundle.getInt("KEY_BLOCK_CONTACT_ERROR", 0));
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC35548nxT.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c35664nzdCopydefault.show(supportFragmentManager, "FailedBlockContactDialogFragment");
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC35548nxT activityC35548nxT, ContactProfileFragment.Action action, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("result", false)) {
            C55326xho.toastWithSuccessfulIcon$default(C33069mpW.KWHzl(activityC35548nxT, C35399nuc.LoaderManager.sQOHWT, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C44157sFk.getDisplayName$default(((ContactProfileFragment.Action.UnFriend) action).copydefault(), null, 1, null)))), 0, 1, (java.lang.Object) null);
            androidx.fragment.app.Fragment fragmentKWHzl = activityC35548nxT.KWHzl();
            if (fragmentKWHzl != null) {
                FragmentKt.setFragmentResult(fragmentKWHzl, "REQUEST_KEY_REFRESH", bundle);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.nFz.startMessageCenter$default(o.nFz, android.content.Context, java.lang.String, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(ActivityC35548nxT activityC35548nxT, ContactProfileFragment.Action action, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        androidx.fragment.app.Fragment fragmentKWHzl = activityC35548nxT.KWHzl();
        if (fragmentKWHzl != null) {
            FragmentKt.setFragmentResult(fragmentKWHzl, "REQUEST_KEY_REFRESH", BundleKt.bundleOf());
        }
        if (bundle.getBoolean("result", false)) {
            C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.hUfVAv, 0, 1, (java.lang.Object) null);
            oBJ obj = oBJ.EZpvd;
            ContactProfileFragment.Action.AddFriend addFriend = (ContactProfileFragment.Action.AddFriend) action;
            OKConversation oKConversationAEQbTJ = addFriend.AEQbTJ();
            java.lang.String targetId = oKConversationAEQbTJ != null ? oKConversationAEQbTJ.getTargetId() : null;
            obj.KWHzl(targetId != null ? targetId : "", false);
            if (yDY.gEmmrt(ChatOrigin.CHAT.getValue(), ChatOrigin.MESSAGE_AVATAR.getValue(), ChatOrigin.CONTACT_SETTINGS.getValue()).contains(addFriend.EZpvd().getValue())) {
                C33791nFz.startMessageCenter$default(C33791nFz.KWHzl, (android.content.Context) activityC35548nxT, ChatOrigin.CONTACT_INFO.getValue(), false, 4, (java.lang.Object) null);
            }
            activityC35548nxT.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(InterfaceC31257lqc interfaceC31257lqc, ActivityC35548nxT activityC35548nxT, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean zKWHzl = interfaceC31257lqc.KWHzl(bundle);
        pUU.KWHzl(activityC35548nxT.getTAG(), "startPayFlowResult=" + zKWHzl);
    }

    /* JADX INFO: renamed from: o.nxT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nxT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(ActionBar actionBar, android.content.Context context, java.lang.String str, java.lang.String str2, OKConversation oKConversation, boolean z, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                z = true;
            }
            return actionBar.EZpvd(context, str, str2, oKConversation, z);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, java.lang.String str, @NotNull java.lang.String str2, OKConversation oKConversation, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return ActivityC35611nyd.Companion.OLrzqt(context, str, str2, oKConversation, z);
        }
    }

    @Override // o.AbstractActivityC35663nzc, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC35663nzc, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC35663nzc, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC35663nzc, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
