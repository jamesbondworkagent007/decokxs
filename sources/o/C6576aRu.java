package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aRu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6576aRu extends AbstractC52796wYr {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.aRx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6576aRu.KWHzl(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aRz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6576aRu.OLrzqt(this.KWHzl);
        }
    });
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.aRu$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Fido2VerificationOption.values().length];
            try {
                iArr[Fido2VerificationOption.EMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Fido2VerificationOption.SMS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Fido2VerificationOption.GA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[Fido2VerificationOption.FIDO2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX INFO: renamed from: o.aRu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aRu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C6576aRu OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<? extends Fido2VerificationOption> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            C6576aRu c6576aRu = new C6576aRu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("KEY_REQUEST_ID", str);
            bundle.putSerializable("KEY_VERIFICATION_LIST", new java.util.ArrayList(list));
            c6576aRu.setArguments(bundle);
            return c6576aRu;
        }
    }

    private final java.lang.String OLrzqt() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String KWHzl(C6576aRu c6576aRu) {
        android.os.Bundle arguments = c6576aRu.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_REQUEST_ID") : null;
        return string == null ? "" : string;
    }

    public final java.util.List<Fido2VerificationOption> copydefault() {
        return (java.util.List) this.KWHzl.getValue();
    }

    public static final java.util.List OLrzqt(C6576aRu c6576aRu) {
        android.os.Bundle arguments = c6576aRu.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("KEY_VERIFICATION_LIST") : null;
        java.util.List list = serializable instanceof java.util.List ? (java.util.List) serializable : null;
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            C55307xhV.AEQbTJ(textViewFARcdN, C33070mpX.AYXKKw(C8206ayP.Dialog.QbewEr));
        }
        constraintLayout.setPaddingRelative(C55298xhM.dp2px$default(8.0f, null, 1, null), constraintLayout.getPaddingTop(), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null));
        EZpvd();
    }

    public final void EZpvd() {
        C55377xim c55377xim;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        java.util.List<Fido2VerificationOption> listCopydefault = copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (final Fido2VerificationOption fido2VerificationOption : listCopydefault) {
            int i = TaskDescription.OLrzqt[fido2VerificationOption.ordinal()];
            int i2 = 2;
            android.util.AttributeSet attributeSet = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            byte b6 = 0;
            byte b7 = 0;
            if (i == 1) {
                c55377xim = new C55377xim(context, b2 == true ? 1 : 0, i2, b == true ? 1 : 0);
                c55377xim.setOKDSSize(-5);
                c55377xim.setStartDrawable(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.GiPPlLgiPPlL));
                c55377xim.setTitleText(C33070mpX.AYXKKw(C8206ayP.Dialog.RJOkX));
                c55377xim.setClickCallback(new Function0() { // from class: o.aRy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C6576aRu.EZpvd(this.KWHzl, fido2VerificationOption);
                    }
                });
            } else if (i == 2) {
                c55377xim = new C55377xim(context, b4 == true ? 1 : 0, i2, b3 == true ? 1 : 0);
                c55377xim.setOKDSSize(-5);
                c55377xim.setStartDrawable(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.fDu));
                c55377xim.setTitleText(C33070mpX.AYXKKw(C8206ayP.Dialog.akftKQ));
                c55377xim.setClickCallback(new Function0() { // from class: o.aRD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C6576aRu.AhwBna(this.AEQbTJ, fido2VerificationOption);
                    }
                });
            } else if (i == 3) {
                c55377xim = new C55377xim(context, b6 == true ? 1 : 0, i2, b5 == true ? 1 : 0);
                c55377xim.setOKDSSize(-5);
                c55377xim.setStartDrawable(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.gHZMYf));
                c55377xim.setTitleText(C33070mpX.AYXKKw(C8206ayP.Dialog.QUSxYX));
                c55377xim.setClickCallback(new Function0() { // from class: o.aRE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C6576aRu.djBIcL(this.copydefault, fido2VerificationOption);
                    }
                });
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                c55377xim = new C55377xim(context, attributeSet, i2, b7 == true ? 1 : 0);
                c55377xim.setOKDSSize(-5);
                c55377xim.setStartDrawable(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.GiPPlLgiPPlL));
                c55377xim.setTitleText("fido2");
                c55377xim.setClickCallback(new Function0() { // from class: o.aRC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C6576aRu.valueOf(this.KWHzl, fido2VerificationOption);
                    }
                });
            }
            arrayList.add(c55377xim);
        }
        EZpvd(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
    }

    public static final Unit EZpvd(C6576aRu c6576aRu, Fido2VerificationOption fido2VerificationOption) {
        c6576aRu.EZpvd(fido2VerificationOption);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C6576aRu c6576aRu, Fido2VerificationOption fido2VerificationOption) {
        c6576aRu.EZpvd(fido2VerificationOption);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C6576aRu c6576aRu, Fido2VerificationOption fido2VerificationOption) {
        c6576aRu.EZpvd(fido2VerificationOption);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C6576aRu c6576aRu, Fido2VerificationOption fido2VerificationOption) {
        c6576aRu.EZpvd(fido2VerificationOption);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final Fido2VerificationOption fido2VerificationOption) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FidoManagement_MfaVeirfy_Buttton_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6576aRu.OLrzqt(fido2VerificationOption, (EventParamsList) obj);
            }
        });
        getParentFragmentManager().setFragmentResult(OLrzqt(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SELECTED_OPTION", fido2VerificationOption)));
        dismissAllowingStateLoss();
    }

    public static final Unit OLrzqt(Fido2VerificationOption fido2VerificationOption, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, fido2VerificationOption.getTrackValue(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FidoManagement_MfaVeirfy_Buttton_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6576aRu.copydefault((EventParamsList) obj);
            }
        });
        getParentFragmentManager().setFragmentResult(OLrzqt(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SELECTED_OPTION", null)));
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, EopTrackEvent.CLOSE, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        AEQbTJ();
        super.onCancel(dialogInterface);
    }
}
