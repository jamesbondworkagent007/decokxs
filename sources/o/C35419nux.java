package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.im.imui.bottomsheets.MentionAndRemoveGroupMemberBottomSheet$performRemoveMemberAction$1$1$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.LongPressInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC35179nqT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35419nux extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public LongPressInfo AEQbTJ;
    public OKMessage EZpvd;
    public C33877nJd KWHzl;
    public GroupInfo copydefault;

    /* JADX INFO: renamed from: o.nux$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nux.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C35419nux AEQbTJ(@NotNull LongPressInfo longPressInfo, @NotNull GroupInfo groupInfo, @NotNull OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(longPressInfo, "");
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(oKMessage, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("long_press_info", longPressInfo);
            bundle.putParcelable("bottomsheet_group_info", groupInfo);
            bundle.putParcelable("bottomsheet_message", oKMessage);
            C35419nux c35419nux = new C35419nux();
            c35419nux.setArguments(bundle);
            return c35419nux;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.AEQbTJ = (LongPressInfo) C6779aVn.copydefault(this).getParcelable("long_press_info");
        this.copydefault = (GroupInfo) C6779aVn.copydefault(this).getParcelable("bottomsheet_group_info");
        this.EZpvd = (OKMessage) C6779aVn.copydefault(this).getParcelable("bottomsheet_message");
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33877nJd c33877nJdEZpvd = C33877nJd.EZpvd(layoutInflater);
        this.KWHzl = c33877nJdEZpvd;
        if (c33877nJdEZpvd != null) {
            return c33877nJdEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C33877nJd c33877nJd = this.KWHzl;
        if (c33877nJd != null) {
            android.widget.TextView textView = c33877nJd.OLrzqt;
            int i = C35399nuc.LoaderManager.Dmq;
            LongPressInfo longPressInfo = this.AEQbTJ;
            textView.setText(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", java.lang.String.valueOf(longPressInfo != null ? longPressInfo.getMentionedName() : null)))));
            android.widget.TextView textView2 = c33877nJd.AhwBna;
            int i2 = C35399nuc.LoaderManager.DCUTEIdCUTEI;
            LongPressInfo longPressInfo2 = this.AEQbTJ;
            textView2.setText(C33069mpW.copydefault(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", java.lang.String.valueOf(longPressInfo2 != null ? longPressInfo2.getMentionedName() : null)))));
            android.widget.LinearLayout linearLayout = c33877nJd.EZpvd;
            linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, this));
            android.widget.LinearLayout linearLayout2 = c33877nJd.AEQbTJ;
            linearLayout2.setOnClickListener(new Application(linearLayout2, 1000L, this));
        }
    }

    public final void OLrzqt() {
        InterfaceC35179nqT interfaceC35179nqT;
        OKMessage oKMessage = this.EZpvd;
        if (oKMessage != null) {
            FragmentActivity activity = getActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov == null || (interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class)) == null) {
                return;
            }
            InterfaceC35179nqT.ActionBar.mentionMemberByMessage$default(interfaceC35179nqT, abstractActivityC33041mov, oKMessage, this.copydefault, false, null, 24, null);
        }
    }

    public final ViewOnClickListenerC54939xaY KWHzl(final GroupInfo groupInfo, final java.lang.String str) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        int i = C35399nuc.LoaderManager.DGOPHZDGOPHZ;
        LongPressInfo longPressInfo = this.AEQbTJ;
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", java.lang.String.valueOf(longPressInfo != null ? longPressInfo.getMentionedName() : null)))));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.heceqZ));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.USBtdM), new View.OnClickListener() { // from class: o.nuC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35419nux.KWHzl(this.copydefault, str, groupInfo, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OqFWZa), new View.OnClickListener() { // from class: o.nuA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35419nux.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
        return viewOnClickListenerC54939xaY;
    }

    public static final void KWHzl(C35419nux c35419nux, java.lang.String str, GroupInfo groupInfo, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c35419nux.AEQbTJ(str, groupInfo);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(java.lang.String str, GroupInfo groupInfo) {
        InterfaceC35180nqU interfaceC35180nqU;
        FragmentActivity activity = getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            return;
        }
        abstractActivityC33041mov.showLoading();
        AbstractC58185ywX abstractC58185ywXEZpvd = C44525sTa.copydefault.EZpvd(new MentionAndRemoveGroupMemberBottomSheet$performRemoveMemberAction$1$1$1(interfaceC35180nqU, groupInfo, str, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C58156yvv.EZpvd(abstractC58185ywXEZpvd, viewLifecycleOwner));
        final Function1 function1 = new Function1() { // from class: o.nuy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35419nux.EZpvd(abstractActivityC33041mov, this, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nuz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C35419nux.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.nuB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35419nux.OLrzqt(abstractActivityC33041mov, (java.lang.Throwable) obj);
            }
        };
        abstractActivityC33041mov.addDisposable(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nuE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C35419nux.copydefault(function12, obj);
            }
        }));
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, C35419nux c35419nux, Unit unit) {
        abstractActivityC33041mov.dismissLoading();
        c35419nux.dismiss();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        abstractActivityC33041mov.dismissLoading();
        Intrinsics.copydefault(th);
        C44157sFk.KWHzl(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nux$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C35419nux copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C35419nux c35419nux) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c35419nux;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.OLrzqt();
                this.copydefault.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.nux$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C35419nux KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C35419nux c35419nux) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c35419nux;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String senderUserId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                GroupInfo groupInfo = this.KWHzl.copydefault;
                if (groupInfo != null) {
                    C35419nux c35419nux = this.KWHzl;
                    OKMessage oKMessage = c35419nux.EZpvd;
                    if (oKMessage == null || (senderUserId = oKMessage.getSenderUserId()) == null) {
                        senderUserId = "";
                    }
                    c35419nux.KWHzl(groupInfo, senderUserId);
                }
            }
        }
    }
}
