package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aTI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C6644aTI extends AbstractC52785wYg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.aTO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6644aTI.AEQbTJ(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.aTI$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aTI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C6644aTI AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C6644aTI c6644aTI = new C6644aTI();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("KEY_REQUEST_KEY", str);
            c6644aTI.setArguments(bundle);
            return c6644aTI;
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c54954xan, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("Reset2FARestricationReminder_Account_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.FdcJU);
        c54954xan.AEQbTJ.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.AEQbTJ));
        AppCompatTextView appCompatTextView = c54954xan.OLrzqt;
        if (C34703nhO.AEQbTJ()) {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.tIwhY);
        } else if (((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.P2P)) {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.zYHWMc);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.copydefault);
        }
        appCompatTextView.setText(strAYXKKw);
    }

    public static final java.lang.String AEQbTJ(C6644aTI c6644aTI) {
        java.lang.String string;
        android.os.Bundle arguments = c6644aTI.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_REQUEST_KEY")) == null) ? "REQUEST_KEY" : string;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C8206ayP.Dialog.RAQtXZ));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setContentDescription("continueResetMfa");
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new View.OnClickListener() { // from class: o.aTN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6644aTI.KWHzl(this.EZpvd, view);
                }
            });
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C8206ayP.Dialog.geLlBI));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(258);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.aTQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6644aTI.OLrzqt(this.EZpvd, view);
                }
            });
        }
    }

    public static final void KWHzl(C6644aTI c6644aTI, android.view.View view) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Reset2FARestricationReminder_Account_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6644aTI.copydefault((EventParamsList) obj);
            }
        });
        c6644aTI.getParentFragmentManager().setFragmentResult(c6644aTI.OLrzqt(), BundleKt.bundleOf(C56390yDp.OLrzqt("result", java.lang.Boolean.TRUE)));
        c6644aTI.dismissAllowingStateLoss();
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM, false);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C6644aTI c6644aTI, android.view.View view) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Reset2FARestricationReminder_Account_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6644aTI.EZpvd((EventParamsList) obj);
            }
        });
        c6644aTI.dismiss();
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", false);
        return Unit.INSTANCE;
    }
}
