package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hSF extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public C21627hGj OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault = new Function1() { // from class: o.hSK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return hSF.EZpvd((java.lang.String) obj);
        }
    };
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hSO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return hSF.EZpvd(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hSN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return hSF.AhwBna(this.OLrzqt);
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String EZpvd(hSF hsf) {
        java.lang.String string;
        android.os.Bundle arguments = hsf.getArguments();
        return (arguments == null || (string = arguments.getString("dex_filter_address_key")) == null) ? "" : string;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AhwBna(hSF hsf) {
        java.lang.String string;
        android.os.Bundle arguments = hsf.getArguments();
        return (arguments == null || (string = arguments.getString("holders.address.tracker")) == null) ? "" : string;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hSF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final hSF copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            hSF hsf = new hSF();
            android.os.Bundle bundle = new android.os.Bundle();
            hsf.copydefault = function1;
            bundle.putString("dex_filter_address_key", str);
            bundle.putString("holders.address.tracker", str2);
            hsf.setArguments(bundle);
            return hsf;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt();
        view.post(new java.lang.Runnable() { // from class: o.hSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                hSF.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(hSF hsf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) hsf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = C21627hGj.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }

    public final void KWHzl(boolean z) {
        final C21627hGj c21627hGj = this.OLrzqt;
        if (c21627hGj != null) {
            if (z) {
                C52794wYp c52794wYp = c21627hGj.EZpvd;
                c52794wYp.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dTTfOR);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                }
                if (drawableKWHzl != null) {
                    drawableKWHzl.setBounds(0, 0, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))), C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))));
                }
                c52794wYp.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
                c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.hSD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        hSF.OLrzqt(c21627hGj, view);
                    }
                });
                return;
            }
            final C52794wYp c52794wYp2 = c21627hGj.EZpvd;
            c52794wYp2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.putCallback));
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.ZxnNGp);
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            }
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setBounds(0, 0, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))), C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null))));
            }
            c52794wYp2.setCompoundDrawablesRelative(drawableKWHzl2, null, null, null);
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.hSI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    hSF.copydefault(c52794wYp2, c21627hGj, view);
                }
            });
        }
    }

    public static final void OLrzqt(C21627hGj c21627hGj, android.view.View view) {
        c21627hGj.AEQbTJ.setText("");
    }

    public static final void copydefault(C52794wYp c52794wYp, C21627hGj c21627hGj, android.view.View view) {
        c21627hGj.AEQbTJ.setText(C33570myu.AYXKKw(c52794wYp.getContext()));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C23274hvD.Dialog.OLrzqt);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.hfeTOA));
        wyf.setSecondaryButton(null);
        final C21627hGj c21627hGj = this.OLrzqt;
        if (c21627hGj != null) {
            OKEditText oKEditText = c21627hGj.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(oKEditText, "");
            C33606mzd.AEQbTJ(oKEditText, new Function1() { // from class: o.hSJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hSF.AEQbTJ(this.copydefault, wyf, (java.lang.CharSequence) obj);
                }
            });
            if (C33129mqd.OLrzqt((java.lang.CharSequence) KWHzl())) {
                c21627hGj.AEQbTJ.setText(KWHzl());
            } else {
                c21627hGj.AEQbTJ.setText("");
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.hSL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        hSF.KWHzl(c21627hGj, this, view);
                    }
                });
            }
        }
    }

    public static final Unit AEQbTJ(hSF hsf, wYF wyf, java.lang.CharSequence charSequence) {
        C52794wYp c52794wYpCopydefault;
        hsf.KWHzl(C33129mqd.OLrzqt(charSequence));
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) hsf.KWHzl()) && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            c52794wYpCopydefault.setEnabled(C33129mqd.OLrzqt((java.lang.CharSequence) java.lang.String.valueOf(charSequence)));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C21627hGj c21627hGj, hSF hsf, android.view.View view) {
        android.content.Context context = c21627hGj.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, c21627hGj.AEQbTJ);
        hsf.copydefault.invoke(java.lang.String.valueOf(c21627hGj.AEQbTJ.getText()));
        hsf.dismissAllowingStateLoss();
    }

    private final void OLrzqt() {
        C32866mlf.onEvent$default("DEXMarket_Token_Holders_Filter_View", (TrackChannel[]) null, new Function1() { // from class: o.hSM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hSF.AEQbTJ(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(hSF hsf, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", hsf.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }
}
