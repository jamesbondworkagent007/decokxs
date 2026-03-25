package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletBackupBean;
import com.okinc.business.defi.biz.net.bean.AccountMpcResponse;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC14334djW;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dod, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14606dod extends wXX {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public androidx.fragment.app.FragmentManager AEQbTJ;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.dod$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dod.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C14606dod newInstance$default(Application application, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return application.EZpvd(str, i, z);
        }

        public final C14606dod EZpvd(@NotNull java.lang.String str, int i, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C14606dod c14606dod = new C14606dod();
            c14606dod.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("walletPassword", str), C56390yDp.OLrzqt("jumpHome", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("showBackupMode", java.lang.Integer.valueOf(i))));
            return c14606dod;
        }
    }

    private final java.lang.String KWHzl() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("walletPassword") : null;
        return string == null ? "" : string;
    }

    public final boolean copydefault() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("jumpHome");
        }
        return true;
    }

    public final int OLrzqt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("showBackupMode");
        }
        return 0;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(3);
        wxq.EZpvd().setVisibility(8);
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.dog
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14606dod.OLrzqt(this.KWHzl, view);
            }
        });
        wxq.AEQbTJ().setVisibility(8);
        java.lang.String string = wxq.getContext().getString(C13754dXa.FragmentManager.Px);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    public static final void OLrzqt(C14606dod c14606dod, android.view.View view) {
        c14606dod.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16522elX c16522elXEZpvd = C16522elX.EZpvd(getCustomLayoutInflater(), constraintLayout);
        Intrinsics.checkNotNullExpressionValue(c16522elXEZpvd, "");
        c16522elXEZpvd.KWHzl.setText(C13754dXa.FragmentManager.PluralsRes);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        C52794wYp c52794wYpAEQbTJ;
        Intrinsics.checkNotNullParameter(wyf, "");
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault == null || (c52794wYpAEQbTJ = wyf.AEQbTJ()) == null) {
            return;
        }
        c52794wYpCopydefault.setOKDSSize(52);
        c52794wYpCopydefault.setOKDSType(257);
        c52794wYpCopydefault.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
        c52794wYpAEQbTJ.setOKDSSize(52);
        c52794wYpAEQbTJ.setOKDSType(260);
        c52794wYpAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
        int iOLrzqt = OLrzqt();
        if (iOLrzqt == 0) {
            C14392dkb c14392dkb = C14392dkb.AEQbTJ;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c52794wYpCopydefault.setText(c14392dkb.copydefault(fragmentActivityRequireActivity, 1));
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            c52794wYpAEQbTJ.setText(c14392dkb.copydefault(fragmentActivityRequireActivity2, 2));
            c52794wYpCopydefault.setCompoundDrawablesRelative(c14392dkb.OLrzqt(1), null, null, null);
            c52794wYpAEQbTJ.setCompoundDrawablesRelative(c14392dkb.OLrzqt(2), null, null, null);
        } else if (iOLrzqt == 1) {
            C14392dkb c14392dkb2 = C14392dkb.AEQbTJ;
            FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
            c52794wYpCopydefault.setText(c14392dkb2.copydefault(fragmentActivityRequireActivity3, 1));
            c52794wYpCopydefault.setCompoundDrawablesRelative(c14392dkb2.OLrzqt(1), null, null, null);
            c52794wYpAEQbTJ.setVisibility(8);
        } else if (iOLrzqt == 2) {
            C14392dkb c14392dkb3 = C14392dkb.AEQbTJ;
            FragmentActivity fragmentActivityRequireActivity4 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity4, "");
            c52794wYpCopydefault.setText(c14392dkb3.copydefault(fragmentActivityRequireActivity4, 2));
            c52794wYpCopydefault.setCompoundDrawablesRelative(c14392dkb3.OLrzqt(2), null, null, null);
            c52794wYpAEQbTJ.setVisibility(8);
        }
        KWHzl(wyf);
    }

    public final void KWHzl(wYF wyf) {
        C52794wYp c52794wYpAEQbTJ;
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault == null || (c52794wYpAEQbTJ = wyf.AEQbTJ()) == null) {
            return;
        }
        c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
    }

    /* JADX INFO: renamed from: o.dod$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C14606dod EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C14606dod c14606dod) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c14606dod;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.EZpvd.requireActivity() instanceof AbstractActivityC33041mov) {
                    int i = 1;
                    if (this.EZpvd.OLrzqt() != 0 && this.EZpvd.OLrzqt() != 1) {
                        i = 2;
                    }
                    this.EZpvd.EZpvd(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.dod$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C14606dod EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C14606dod c14606dod) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c14606dod;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.EZpvd.requireActivity() instanceof AbstractActivityC33041mov) {
                    this.EZpvd.EZpvd(2);
                }
            }
        }
    }

    public final void EZpvd(final int i) {
        KWHzl(i);
        try {
            final FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(fragmentActivityRequireActivity, i);
            if (interfaceC14334djWOLrzqt != null) {
                InterfaceC14334djW.Application.judgeCloudServerStatus$default(interfaceC14334djWOLrzqt, (AbstractActivityC33041mov) fragmentActivityRequireActivity, 0, new Function0() { // from class: o.doh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C14606dod.copydefault(this.KWHzl, fragmentActivityRequireActivity, i);
                    }
                }, 2, null);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final Unit copydefault(final C14606dod c14606dod, final FragmentActivity fragmentActivity, final int i) {
        if (c14606dod.AEQbTJ == null) {
            return Unit.INSTANCE;
        }
        java.lang.String strEZpvd = dZP.OLrzqt.EZpvd();
        if (strEZpvd.length() == 0) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, fragmentActivity, null, null, null, null, null, 48, null);
            }
            return Unit.INSTANCE;
        }
        AbstractC58185ywX<ResponseData<AccountMpcResponse>> abstractC58185ywXAEQbTJ = new C13934dbu().AEQbTJ((AbstractC12782ctV) null, strEZpvd);
        final Function1 function1 = new Function1() { // from class: o.doc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14606dod.AEQbTJ(fragmentActivity, i, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.dob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14606dod.OLrzqt(function1, obj);
            }
        }).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, fragmentActivity);
        final Function1 function12 = new Function1() { // from class: o.doa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14606dod.AEQbTJ(this.AEQbTJ, fragmentActivity, i, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.doe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14606dod.djBIcL(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14606dod.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.doj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14606dod.EZpvd(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(FragmentActivity fragmentActivity, int i, ResponseData responseData) {
        AbstractC58260yxt<ResponseData<MPCWalletBackupBean>> abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            AccountMpcResponse accountMpcResponse = (AccountMpcResponse) data;
            InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(fragmentActivity, i);
            if (interfaceC14373dkIEZpvd == null || (abstractC58260yxtCopydefault = interfaceC14373dkIEZpvd.copydefault(accountMpcResponse.getMpcId())) == null) {
                return null;
            }
            return abstractC58260yxtCopydefault.EZpvd();
        }
        return AbstractC58260yxt.copydefault(new ResponseData(-5003, null, null, null, new MPCWalletBackupBean(null, null, null, null, null, null, null, null, 255, null), null, 46, null)).EZpvd();
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(final C14606dod c14606dod, FragmentActivity fragmentActivity, int i, ResponseData responseData) {
        c14606dod.EZpvd();
        if (responseData.getCode() == 200) {
            C18745foG c18745foG = new C18745foG();
            C18833fpq c18833fpq = new C18833fpq((AbstractActivityC33041mov) fragmentActivity);
            c18833fpq.copydefault(c14606dod.KWHzl());
            c18833fpq.EZpvd(i);
            c18833fpq.OLrzqt((MPCWalletBackupBean) responseData.getData());
            c18833fpq.EZpvd(c14606dod.copydefault());
            c18833fpq.KWHzl(new Function2() { // from class: o.doi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C14606dod.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
            InterfaceC18801fpK interfaceC18801fpKOLrzqt = c18833fpq.OLrzqt(1);
            androidx.fragment.app.FragmentManager fragmentManager = c14606dod.AEQbTJ;
            Intrinsics.copydefault(fragmentManager);
            c18745foG.AEQbTJ(fragmentManager, interfaceC18801fpKOLrzqt);
            c14606dod.dismiss();
        } else {
            pUU.copydefault("DefiICloudSelectedTipDialog", "error message : " + responseData.getMsg());
            c14606dod.EZpvd((AbstractActivityC33041mov) fragmentActivity, i);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C14606dod c14606dod, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c14606dod.EZpvd();
        c14606dod.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C14606dod c14606dod, java.lang.Throwable th) {
        c14606dod.EZpvd();
        C11580cTn c11580cTn = C11580cTn.EZpvd;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C55326xho.toast$default(c11580cTn.KWHzl(message), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        final java.lang.String str = i != 1 ? i != 2 ? "default" : MTPushConstants.Manufacturer.HUAWEI : "google";
        C32866mlf.onEvent$default("Web3ImportMPCWallet_Btm_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.dok
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14606dod.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("cloud", "1", false));
        eventParamsList.add(new EventParam("cloud_service", str, false));
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        EZpvd();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        super.show(fragmentManager, str);
        this.AEQbTJ = fragmentManager;
    }

    public final void EZpvd() {
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            ((AbstractActivityC33041mov) fragmentActivityRequireActivity).dismissLoading();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, int i) {
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(abstractActivityC33041mov, i);
        if (interfaceC14334djWOLrzqt != null) {
            interfaceC14334djWOLrzqt.KWHzl(abstractActivityC33041mov);
        }
    }
}
