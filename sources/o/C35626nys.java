package o;

import android.graphics.Outline;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import com.just.agentweb.ActionActivity;
import com.okinc.business.web3pay.api.model.PayTransactionUidRecipient;
import com.okinc.business.web3pay.api.model.Web3PayProjectId;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.contacts.ContactProfileBottomSheet$onViewCreated$3$1$3;
import com.okinc.im.imui.contacts.ContactProfileFragment;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC33638nAh;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35626nys extends AbstractC35666nzf {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final ActivityResultLauncher<android.content.Intent> KWHzl;
    public wXQ OLrzqt;
    public nJN copydefault;
    public android.widget.ImageView djBIcL;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public static final void KWHzl(ActivityResult activityResult) {
    }

    public C35626nys() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.nyu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C35626nys.KWHzl((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35626nys.OLrzqt(this.AEQbTJ);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35626nys.AEQbTJ(this.EZpvd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String valueOf() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String OLrzqt(C35626nys c35626nys) {
        android.os.Bundle arguments = c35626nys.getArguments();
        if (arguments != null) {
            return arguments.getString("groupId");
        }
        return null;
    }

    /* JADX DEBUG: Possible override for method o.nzf.EZpvd()V */
    public final java.lang.String EZpvd() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String AEQbTJ(C35626nys c35626nys) {
        RelationInfo relationInfo;
        android.os.Bundle arguments = c35626nys.getArguments();
        if (arguments == null || (relationInfo = (RelationInfo) BundleCompat.getParcelable(arguments, "info", RelationInfo.class)) == null) {
            return null;
        }
        return relationInfo.getContactsId();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        this.OLrzqt = wxq;
    }

    public final void EZpvd(boolean z) {
        wXQ wxq = this.OLrzqt;
        if (wxq != null) {
            wxq.AEQbTJ().setVisibility(z ^ true ? 0 : 8);
        }
    }

    public final void AEQbTJ(boolean z) {
        android.graphics.drawable.Drawable background;
        if (z) {
            android.view.View view = getView();
            if (view == null) {
                return;
            }
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            if (this.djBIcL == null) {
                viewGroup.setBackgroundColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.htlTjW));
                viewGroup.setOutlineProvider(new Activity(getResources().getDimension(C52761wXj.StateListAnimator.ODWQjV)));
                viewGroup.setClipToOutline(true);
                android.widget.ImageView imageView = new android.widget.ImageView(requireContext());
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
                imageView.setImportantForAccessibility(2);
                viewGroup.addView(imageView, 0);
                this.djBIcL = imageView;
            }
            android.graphics.drawable.Drawable background2 = view.getBackground();
            if (background2 != null) {
                background2.setTint(0);
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.lang.String strCopydefault = C43454rpb.copydefault("images/im/vip_bg_profile_bottomsheet.webp", contextRequireContext, true);
            android.widget.ImageView imageView2 = this.djBIcL;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            android.widget.ImageView imageView3 = this.djBIcL;
            if (imageView3 != null) {
                C33054mpH.loadUrl$default(imageView3, strCopydefault, null, 0, 0, 14, null);
                return;
            }
            return;
        }
        android.widget.ImageView imageView4 = this.djBIcL;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        android.view.View view2 = getView();
        if (view2 == null || (background = view2.getBackground()) == null) {
            return;
        }
        background.setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.htlTjW));
    }

    /* JADX INFO: renamed from: o.nys$Activity */
    public static final class Activity extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float EZpvd;

        public Activity(float f) {
            this.EZpvd = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            int width = view.getWidth();
            int height = view.getHeight();
            float f = this.EZpvd;
            outline.setRoundRect(0, 0, width, height + ((int) f), f);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        fragmentTransactionBeginTransaction.replace(C35399nuc.StateListAnimator.UrRBLY, ContactProfileFragment.class, getArguments());
        fragmentTransactionBeginTransaction.commit();
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_CLOSE", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C35626nys.valueOf(this.OLrzqt, str, bundle2);
            }
        });
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_ACTION", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C35626nys.gEmmrt(this.OLrzqt, str, bundle2);
            }
        });
        view.getBackground().setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.htlTjW));
    }

    public static final void valueOf(C35626nys c35626nys, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("result", false)) {
            c35626nys.dismissAllowingStateLoss();
        }
    }

    public static final void gEmmrt(final C35626nys c35626nys, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ContactProfileFragment.Action action = (ContactProfileFragment.Action) BundleCompat.getParcelable(bundle, "RESULT_KEY_ACTION", ContactProfileFragment.Action.class);
        if (action != null) {
            if (action instanceof ContactProfileFragment.Action.BlockUser) {
                C35580nxz c35580nxzAEQbTJ = C35580nxz.Companion.AEQbTJ("KEY_REQUEST_BLOCK_CONTACT", ((ContactProfileFragment.Action.BlockUser) action).EZpvd());
                androidx.fragment.app.FragmentManager supportFragmentManager = c35626nys.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c35580nxzAEQbTJ.show(supportFragmentManager, "BlockContactDialogFragment");
                FragmentKt.setFragmentResultListener(c35580nxzAEQbTJ, "KEY_REQUEST_BLOCK_CONTACT", new Function2() { // from class: o.nyv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C35626nys.AhwBna(this.copydefault, (java.lang.String) obj, (android.os.Bundle) obj2);
                    }
                });
                return;
            }
            if (action instanceof ContactProfileFragment.Action.UnFriend) {
                return;
            }
            if (action instanceof ContactProfileFragment.Action.AddFriend) {
                C35652nzR c35652nzRAEQbTJ = C35652nzR.Companion.AEQbTJ("REQUEST_KET_ADD_CONTACT", ((ContactProfileFragment.Action.AddFriend) action).KWHzl(), "contacts_info", c35626nys.valueOf());
                androidx.fragment.app.FragmentManager supportFragmentManager2 = c35626nys.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                c35652nzRAEQbTJ.show(supportFragmentManager2, "AddContactDialogFragment");
                FragmentKt.setFragmentResultListener(c35652nzRAEQbTJ, "REQUEST_KET_ADD_CONTACT", new Function2() { // from class: o.nyz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C35626nys.djBIcL(this.AEQbTJ, (java.lang.String) obj, (android.os.Bundle) obj2);
                    }
                });
                return;
            }
            if (action instanceof ContactProfileFragment.Action.SendMessage) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c35626nys), null, null, new ContactProfileBottomSheet$onViewCreated$3$1$3(c35626nys, action, null), 3, null);
                return;
            }
            if (action instanceof ContactProfileFragment.Action.Pay) {
                c35626nys.dismiss();
                ContactProfileFragment.Action.Pay pay = (ContactProfileFragment.Action.Pay) action;
                PayTransactionUidRecipient payTransactionUidRecipient = new PayTransactionUidRecipient(C44157sFk.getDisplayName$default(pay.EZpvd(), null, 1, null), pay.EZpvd().getAvatar(), pay.EZpvd().getContactsId());
                androidx.fragment.app.FragmentManager supportFragmentManager3 = c35626nys.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                final InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
                if (interfaceC31257lqc != null) {
                    supportFragmentManager3.setFragmentResultListener(interfaceC31257lqc.EZpvd(), c35626nys.requireActivity(), new FragmentResultListener() { // from class: o.nyw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.fragment.app.FragmentResultListener
                        public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle2) {
                            C35626nys.KWHzl(interfaceC31257lqc, str2, bundle2);
                        }
                    });
                    interfaceC31257lqc.EZpvd(supportFragmentManager3, payTransactionUidRecipient, Web3PayProjectId.IM_PAY);
                    return;
                }
                return;
            }
            if (action instanceof ContactProfileFragment.Action.EditAlias) {
                c35626nys.dismiss();
                ActivityC33638nAh.StateListAnimator stateListAnimator = ActivityC33638nAh.Companion;
                android.content.Context contextRequireContext = c35626nys.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c35626nys.KWHzl.launch(stateListAnimator.OLrzqt(contextRequireContext, ((ContactProfileFragment.Action.EditAlias) action).AEQbTJ().getContactsId(), c35626nys.valueOf()));
                return;
            }
            if (action instanceof ContactProfileFragment.Action.RemoveMember) {
                ContactProfileFragment.Action.RemoveMember removeMember = (ContactProfileFragment.Action.RemoveMember) action;
                C35676nzp c35676nzpEZpvd = C35676nzp.Companion.EZpvd("KEY_REQUEST_REMOVE_MEMBER", removeMember.copydefault(), removeMember.OLrzqt());
                androidx.fragment.app.FragmentManager supportFragmentManager4 = c35626nys.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
                c35676nzpEZpvd.show(supportFragmentManager4, "RemoveMemberDialogFragment");
                FragmentKt.setFragmentResultListener(c35676nzpEZpvd, "KEY_REQUEST_REMOVE_MEMBER", new Function2() { // from class: o.nyy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C35626nys.AYXKKw(this.OLrzqt, (java.lang.String) obj, (android.os.Bundle) obj2);
                    }
                });
                return;
            }
            if (!(action instanceof ContactProfileFragment.Action.ViewPlanetProfile)) {
                throw new NoWhenBranchMatchedException();
            }
            c35626nys.dismiss();
            tWL twl = (tWL) C43251rlk.OLrzqt(tWL.class);
            if (twl != null) {
                android.content.Context contextRequireContext2 = c35626nys.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                twl.KWHzl(contextRequireContext2, ((ContactProfileFragment.Action.ViewPlanetProfile) action).OLrzqt(), "", "", "im", "");
            }
        }
    }

    public static final Unit AhwBna(C35626nys c35626nys, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("KEY_BLOCK_CONTACT_RESULT", false)) {
            c35626nys.dismiss();
        } else {
            C35664nzd c35664nzdCopydefault = C35664nzd.Companion.copydefault(bundle.getInt("KEY_BLOCK_CONTACT_ERROR", 0));
            androidx.fragment.app.FragmentManager supportFragmentManager = c35626nys.requireActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c35664nzdCopydefault.show(supportFragmentManager, "FailedBlockContactDialogFragment");
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C35626nys c35626nys, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) bundle.getString(ActionActivity.KEY_ACTION), (java.lang.Object) "ACTION_ADD_CONTACT")) {
            c35626nys.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(InterfaceC31257lqc interfaceC31257lqc, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        pUU.KWHzl("ContactProfileBottomSheet", "startPayFlowResult=" + interfaceC31257lqc.KWHzl(bundle));
    }

    public static final Unit AYXKKw(C35626nys c35626nys, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("KEY_REMOVE_MEMBER_RESULT", false)) {
            c35626nys.getParentFragmentManager().setFragmentResult("REQUEST_KEY_MEMBER_REMOVED", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_MEMBER_REMOVED", java.lang.Boolean.TRUE)));
            c35626nys.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = nJN.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        getParentFragmentManager().setFragmentResult("REQUEST_KEY_DISMISSED", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_DISMISSED", java.lang.Boolean.TRUE)));
    }

    public final void OLrzqt() {
        android.os.Bundle arguments = getArguments();
        final OKConversation oKConversation = arguments != null ? (OKConversation) BundleCompat.getParcelable(arguments, "conversation", OKConversation.class) : null;
        android.os.Bundle arguments2 = getArguments();
        final java.lang.String string = arguments2 != null ? arguments2.getString("origin") : null;
        C32866mlf.onEvent$default("IMChat_Full_Member_Click", (TrackChannel[]) null, new Function1() { // from class: o.nyx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35626nys.KWHzl(oKConversation, string, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(OKConversation oKConversation, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (oKConversation != null) {
            java.lang.String targetId = oKConversation.getTargetId();
            EventParamsList.put$default(eventParamsList, "channel_id", targetId == null ? "" : targetId, false, 4, null);
            EventParamsList.put$default(eventParamsList, "channel_type", sNN.copydefault(oKConversation.getConversationType()), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "page", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ChatOrigin.MESSAGE_AVATAR.getValue()) ? "chat_list" : "member_list", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nys$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nys.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C35626nys EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, @NotNull java.lang.String str2, RelationInfo relationInfo, OKConversation oKConversation, java.lang.String str3, boolean z, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            C35626nys c35626nys = new C35626nys();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("origin", str);
            bundle.putString("id", str2);
            bundle.putParcelable("info", relationInfo);
            bundle.putParcelable("conversation", oKConversation);
            bundle.putString("groupId", str3);
            bundle.putBoolean("show_messages_settings", z);
            bundle.putString("conversationId", str4);
            c35626nys.setArguments(bundle);
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(c35626nys, C35626nys.class.getName()).commitAllowingStateLoss();
            return c35626nys;
        }
    }
}
