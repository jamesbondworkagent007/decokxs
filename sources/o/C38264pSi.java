package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38264pSi extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public AbstractC45509srP EZpvd;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX INFO: renamed from: o.pSi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pSi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C38264pSi newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                bundle = null;
            }
            return stateListAnimator.OLrzqt(str, str2, str3, bundle);
        }

        public final C38264pSi OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C38264pSi c38264pSi = new C38264pSi();
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putString("KEY_COR", str);
            bundle.putString("KEY_FLOW_SOURCE", str2);
            bundle.putString("KEY_SOURCE_CODE", str3);
            c38264pSi.setArguments(bundle);
            return c38264pSi;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setDynamicFullScreen(true);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("KEY_COR");
            if (string == null) {
                string = "";
            }
            this.AEQbTJ = string;
            java.lang.String string2 = arguments.getString("KEY_FLOW_SOURCE");
            if (string2 == null) {
                string2 = "";
            }
            this.OLrzqt = string2;
            java.lang.String string3 = arguments.getString("KEY_SOURCE_CODE");
            this.copydefault = string3 != null ? string3 : "";
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYCPage_Popup_Step_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pSg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38264pSi.gEmmrt(this.copydefault, (EventParamsList) obj);
            }
        });
    }

    public static final Unit gEmmrt(C38264pSi c38264pSi, EventParamsList eventParamsList) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRY_PAGE, "kyc_step3_selfie", false, 4, null);
        java.lang.String str4 = c38264pSi.AEQbTJ;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str4;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        java.lang.String str5 = c38264pSi.OLrzqt;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str5;
        }
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        java.lang.String str6 = c38264pSi.copydefault;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str6;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.setCloseVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.pSj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C38264pSi.OLrzqt(this.copydefault, view);
            }
        });
    }

    public static final void OLrzqt(final C38264pSi c38264pSi, android.view.View view) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYCPage_Popup_Step_Close", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38264pSi.AhwBna(this.AEQbTJ, (EventParamsList) obj);
            }
        });
        c38264pSi.dismissAllowingStateLoss();
    }

    public static final Unit AhwBna(C38264pSi c38264pSi, EventParamsList eventParamsList) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRY_PAGE, "kyc_step3_selfie", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "exit_close", false, 4, null);
        java.lang.String str4 = c38264pSi.AEQbTJ;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str4;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        java.lang.String str5 = c38264pSi.OLrzqt;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str5;
        }
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        java.lang.String str6 = c38264pSi.copydefault;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str6;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC45509srP abstractC45509srPOLrzqt = AbstractC45509srP.OLrzqt(getLayoutInflater(), constraintLayout, true);
        this.EZpvd = abstractC45509srPOLrzqt;
        if (abstractC45509srPOLrzqt == null || (c52794wYp = abstractC45509srPOLrzqt.OLrzqt) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.pSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C38264pSi.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(final C38264pSi c38264pSi, android.view.View view) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYCPage_Popup_Step_Close", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38264pSi.valueOf(this.AEQbTJ, (EventParamsList) obj);
            }
        });
        c38264pSi.dismissAllowingStateLoss();
    }

    public static final Unit valueOf(C38264pSi c38264pSi, EventParamsList eventParamsList) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRY_PAGE, "kyc_step3_selfie", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "continue", false, 4, null);
        java.lang.String str4 = c38264pSi.AEQbTJ;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str4;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        java.lang.String str5 = c38264pSi.OLrzqt;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str5;
        }
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        java.lang.String str6 = c38264pSi.copydefault;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str6;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.EZpvd = null;
        super.onDestroyView();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYCPage_Popup_Step_Close", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38264pSi.OLrzqt(this.EZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(C38264pSi c38264pSi, EventParamsList eventParamsList) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRY_PAGE, "kyc_step3_selfie", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "scroll_close", false, 4, null);
        java.lang.String str4 = c38264pSi.AEQbTJ;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str4;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        java.lang.String str5 = c38264pSi.OLrzqt;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str5;
        }
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        java.lang.String str6 = c38264pSi.copydefault;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str6;
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        return Unit.INSTANCE;
    }
}
