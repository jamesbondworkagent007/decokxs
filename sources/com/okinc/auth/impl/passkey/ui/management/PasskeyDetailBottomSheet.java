package com.okinc.auth.impl.passkey.ui.management;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.ButtonType;
import com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33492mxV;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C56392yDr;
import o.C56444yFp;
import o.C5655aAa;
import o.C6121aJP;
import o.C8206ayP;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.ViewOnClickListenerC54939xaY;
import o.wXQ;
import o.wXX;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class PasskeyDetailBottomSheet extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public Function1<? super AuthenticatorDisplayModel, Unit> AEQbTJ;
    public final boolean EZpvd = true;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.aJu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyDetailBottomSheet.valueOf(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aJx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PasskeyDetailBottomSheet.KWHzl(this.OLrzqt);
        }
    });
    public Function1<? super AuthenticatorDisplayModel, Unit> djBIcL;
    public Function1<? super AuthenticatorDisplayModel, Unit> valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.REMOVE_RENAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.RESET_RENAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonType.RENAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[BUTTON.values().length];
            try {
                iArr2[BUTTON.RENAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BUTTON.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BUTTON.RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit> */
    public final Function1<AuthenticatorDisplayModel, Unit> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super AuthenticatorDisplayModel, Unit> function1) {
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super AuthenticatorDisplayModel, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit> */
    public final Function1<AuthenticatorDisplayModel, Unit> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super AuthenticatorDisplayModel, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel, kotlin.Unit> */
    public final Function1<AuthenticatorDisplayModel, Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    public final AuthenticatorDisplayModel OLrzqt() {
        return (AuthenticatorDisplayModel) this.OLrzqt.getValue();
    }

    public static final AuthenticatorDisplayModel valueOf(PasskeyDetailBottomSheet passkeyDetailBottomSheet) {
        AuthenticatorDisplayModel authenticatorDisplayModel;
        Bundle arguments = passkeyDetailBottomSheet.getArguments();
        return (arguments == null || (authenticatorDisplayModel = (AuthenticatorDisplayModel) arguments.getParcelable("ARG_DISPLAY_MODEL")) == null) ? new AuthenticatorDisplayModel(null, null, null, null, false, null, null, 0, null, false, false, false, false, false, false, 32767, null) : authenticatorDisplayModel;
    }

    private final ButtonType djBIcL() {
        return (ButtonType) this.copydefault.getValue();
    }

    public static final ButtonType KWHzl(PasskeyDetailBottomSheet passkeyDetailBottomSheet) {
        ButtonType buttonType;
        Bundle arguments = passkeyDetailBottomSheet.getArguments();
        return (arguments == null || (buttonType = (ButtonType) arguments.getParcelable("ARG_BUTTON_TYPE")) == null) ? ButtonType.REMOVE_RENAME : buttonType;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        setDynamicFullScreen(OLrzqt().DbNXlk());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C5655aAa c5655aAaAEQbTJ = C5655aAa.AEQbTJ(getLayoutInflater(), constraintLayout);
        Intrinsics.checkNotNullExpressionValue(c5655aAaAEQbTJ, "");
        c5655aAaAEQbTJ.AhwBna.setText(OLrzqt().AhwBna());
        TextView textView = c5655aAaAEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(OLrzqt().ejfBZ() ^ true ? 0 : 8);
        TextView textView2 = c5655aAaAEQbTJ.EZpvd;
        if (OLrzqt().fetchVPNInfo()) {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.iwGUEr);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.Dmq);
        }
        textView2.setText(strAYXKKw);
        c5655aAaAEQbTJ.AEQbTJ.setText(OLrzqt().djBIcL());
        c5655aAaAEQbTJ.AkhnZx.setText(OLrzqt().AYXKKw());
        if (OLrzqt().DbNXlk()) {
            Group group = c5655aAaAEQbTJ.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            c5655aAaAEQbTJ.AYXKKw.setAdapter(new C6121aJP(OLrzqt().EZpvd(), C33492mxV.OLrzqt()));
            TextView textView3 = c5655aAaAEQbTJ.djBIcL;
            textView3.setOnClickListener(new StateListAnimator(textView3, 1000L, this));
            return;
        }
        Group group2 = c5655aAaAEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setOKDSSize(52);
        int i = ActionBar.copydefault[djBIcL().ordinal()];
        if (i == 1) {
            wyf.setType(14);
            KWHzl(wyf.copydefault(), BUTTON.RENAME);
            wyf.setPrimaryText(getString(C8206ayP.Dialog.hDKMBd));
            KWHzl(wyf.AEQbTJ(), BUTTON.REMOVE);
            wyf.setSecondaryText(getString(C8206ayP.Dialog.getFieldNames));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            wyf.setType(5);
            KWHzl(wyf.copydefault(), BUTTON.RENAME);
            wyf.setPrimaryText(getString(C8206ayP.Dialog.hDKMBd));
            return;
        }
        wyf.setType(14);
        KWHzl(wyf.copydefault(), BUTTON.RENAME);
        wyf.setPrimaryText(getString(C8206ayP.Dialog.hDKMBd));
        KWHzl(wyf.AEQbTJ(), BUTTON.RESET);
        wyf.setSecondaryText(getString(C8206ayP.Dialog.DrNnAm));
    }

    public final void EZpvd() {
        Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C8206ayP.Dialog.AuCTelauCTel);
            viewOnClickListenerC54939xaY.copydefault(OLrzqt().fetchVPNInfo() ? C8206ayP.Dialog.uzCIH : C8206ayP.Dialog.zsXlph);
            viewOnClickListenerC54939xaY.EZpvd(C8206ayP.Dialog.RvdRAu, new View.OnClickListener() { // from class: o.aJp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    PasskeyDetailBottomSheet.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(C52794wYp c52794wYp, BUTTON button) {
        int i;
        if (c52794wYp != null) {
            c52794wYp.setEnabled(OLrzqt().fIwbmz());
            int i2 = ActionBar.OLrzqt[button.ordinal()];
            if (i2 == 1) {
                i = C8206ayP.Activity.KWHzl;
            } else if (i2 == 2) {
                i = C8206ayP.Activity.gEmmrt;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C52761wXj.TaskDescription.OeawrH;
            }
            c52794wYp.setOKDSType(260);
            c52794wYp.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
            c52794wYp.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, button, this));
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.auth.impl.passkey.ui.management.PasskeyDetailBottomSheet$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PasskeyDetailBottomSheet newInstance$default(Application application, AuthenticatorDisplayModel authenticatorDisplayModel, ButtonType buttonType, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
            if ((i & 16) != 0) {
                function13 = null;
            }
            return application.AEQbTJ(authenticatorDisplayModel, buttonType, function1, function12, function13);
        }

        public final PasskeyDetailBottomSheet AEQbTJ(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel, @NotNull ButtonType buttonType, Function1<? super AuthenticatorDisplayModel, Unit> function1, Function1<? super AuthenticatorDisplayModel, Unit> function12, Function1<? super AuthenticatorDisplayModel, Unit> function13) {
            Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
            Intrinsics.checkNotNullParameter(buttonType, "");
            PasskeyDetailBottomSheet passkeyDetailBottomSheet = new PasskeyDetailBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_DISPLAY_MODEL", authenticatorDisplayModel);
            bundle.putParcelable("ARG_BUTTON_TYPE", buttonType);
            passkeyDetailBottomSheet.setArguments(bundle);
            passkeyDetailBottomSheet.KWHzl(function1);
            passkeyDetailBottomSheet.EZpvd(function12);
            passkeyDetailBottomSheet.AEQbTJ(function13);
            return passkeyDetailBottomSheet;
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ PasskeyDetailBottomSheet OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, PasskeyDetailBottomSheet passkeyDetailBottomSheet) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = passkeyDetailBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ PasskeyDetailBottomSheet KWHzl;
        public final /* synthetic */ BUTTON copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, BUTTON button, PasskeyDetailBottomSheet passkeyDetailBottomSheet) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = button;
            this.KWHzl = passkeyDetailBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                int i = ActionBar.OLrzqt[this.copydefault.ordinal()];
                if (i == 1) {
                    Function1<AuthenticatorDisplayModel, Unit> function1KWHzl = this.KWHzl.KWHzl();
                    if (function1KWHzl != null) {
                        function1KWHzl.invoke(this.KWHzl.OLrzqt());
                    }
                    this.KWHzl.dismissAllowingStateLoss();
                    return;
                }
                if (i == 2) {
                    Function1<AuthenticatorDisplayModel, Unit> function1Copydefault = this.KWHzl.copydefault();
                    if (function1Copydefault != null) {
                        function1Copydefault.invoke(this.KWHzl.OLrzqt());
                    }
                    this.KWHzl.dismissAllowingStateLoss();
                    return;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Function1<AuthenticatorDisplayModel, Unit> function1AEQbTJ = this.KWHzl.AEQbTJ();
                if (function1AEQbTJ != null) {
                    function1AEQbTJ.invoke(this.KWHzl.OLrzqt());
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BUTTON {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BUTTON[] $VALUES;
        public static final BUTTON RENAME = new BUTTON("RENAME", 0);
        public static final BUTTON REMOVE = new BUTTON("REMOVE", 1);
        public static final BUTTON RESET = new BUTTON("RESET", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BUTTON[] $values() {
            return new BUTTON[]{RENAME, REMOVE, RESET};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BUTTON> getEntries() {
            return $ENTRIES;
        }

        private BUTTON(String str, int i) {
        }

        static {
            BUTTON[] buttonArr$values = $values();
            $VALUES = buttonArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(buttonArr$values);
        }

        public static BUTTON valueOf(String str) {
            return (BUTTON) Enum.valueOf(BUTTON.class, str);
        }

        public static BUTTON[] values() {
            return (BUTTON[]) $VALUES.clone();
        }
    }
}
