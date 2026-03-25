package com.okinc.buysell.ui.recurring.detail.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.buysell.ui.recurring.detail.bottomsheet.RecurringBuyPlanDetailConfirmationBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C31483luq;
import o.C33070mpX;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.wXX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class RecurringBuyPlanDetailConfirmationBottomSheet extends wXX {
    public static final Companion Companion = new Companion(null);
    public static final int KWHzl = 8;
    public Function1<? super Companion.ConfirmationType, Unit> AEQbTJ;
    public Function1<? super Companion.ConfirmationType, Unit> EZpvd;
    public Companion.ConfirmationType copydefault = Companion.ConfirmationType.PAUSE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super Companion.ConfirmationType, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super Companion.ConfirmationType, Unit> function1) {
        this.EZpvd = function1;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg.type") : null;
        if (string == null) {
            dismissAllowingStateLoss();
        } else {
            this.copydefault = Companion.ConfirmationType.Companion.KWHzl(string);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C31483luq c31483luqEZpvd = C31483luq.EZpvd(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(c31483luqEZpvd, "");
        if (this.copydefault == Companion.ConfirmationType.PAUSE) {
            c31483luqEZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.init));
            c31483luqEZpvd.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.invokespecialhOMIpD));
            c31483luqEZpvd.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DaTmkG));
        } else {
            c31483luqEZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fupbxE));
            c31483luqEZpvd.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.invokespecialRuDPQV));
            c31483luqEZpvd.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.invokespecialsiEkQe));
        }
        c31483luqEZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.lQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailConfirmationBottomSheet.OLrzqt(this.copydefault, view);
            }
        });
        c31483luqEZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecurringBuyPlanDetailConfirmationBottomSheet.AEQbTJ(this.copydefault, view);
            }
        });
        constraintLayout.addView(c31483luqEZpvd.getRoot(), new ConstraintLayout.LayoutParams(-1, -2));
    }

    public static final void OLrzqt(RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet, View view) {
        Function1<? super Companion.ConfirmationType, Unit> function1 = recurringBuyPlanDetailConfirmationBottomSheet.EZpvd;
        if (function1 != null) {
            function1.invoke(recurringBuyPlanDetailConfirmationBottomSheet.copydefault);
        }
    }

    public static final void AEQbTJ(RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet, View view) {
        Function1<? super Companion.ConfirmationType, Unit> function1 = recurringBuyPlanDetailConfirmationBottomSheet.AEQbTJ;
        if (function1 != null) {
            function1.invoke(recurringBuyPlanDetailConfirmationBottomSheet.copydefault);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.detail.bottomsheet.RecurringBuyPlanDetailConfirmationBottomSheet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ConfirmationType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ConfirmationType[] $VALUES;
            public static final StateListAnimator Companion;
            private final String value;
            public static final ConfirmationType PAUSE = new ConfirmationType("PAUSE", 0, "pause");
            public static final ConfirmationType CANCEL = new ConfirmationType("CANCEL", 1, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ConfirmationType[] $values() {
                return new ConfirmationType[]{PAUSE, CANCEL};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ConfirmationType> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getValue() {
                return this.value;
            }

            private ConfirmationType(String str, int i, String str2) {
                this.value = str2;
            }

            static {
                ConfirmationType[] confirmationTypeArr$values = $values();
                $VALUES = confirmationTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(confirmationTypeArr$values);
                Companion = new StateListAnimator(null);
            }

            public static final class StateListAnimator {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.detail.bottomsheet.RecurringBuyPlanDetailConfirmationBottomSheet.Companion.ConfirmationType.StateListAnimator.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private StateListAnimator() {
                }

                public final ConfirmationType KWHzl(String str) {
                    ConfirmationType confirmationType;
                    ConfirmationType[] confirmationTypeArrValues = ConfirmationType.values();
                    int length = confirmationTypeArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            confirmationType = null;
                            break;
                        }
                        confirmationType = confirmationTypeArrValues[i];
                        if (Intrinsics.EZpvd((Object) confirmationType.getValue(), (Object) str)) {
                            break;
                        }
                        i++;
                    }
                    return confirmationType == null ? ConfirmationType.PAUSE : confirmationType;
                }
            }

            public static ConfirmationType valueOf(String str) {
                return (ConfirmationType) Enum.valueOf(ConfirmationType.class, str);
            }

            public static ConfirmationType[] values() {
                return (ConfirmationType[]) $VALUES.clone();
            }
        }

        public final RecurringBuyPlanDetailConfirmationBottomSheet AEQbTJ(@NotNull ConfirmationType confirmationType) {
            Intrinsics.checkNotNullParameter(confirmationType, "");
            RecurringBuyPlanDetailConfirmationBottomSheet recurringBuyPlanDetailConfirmationBottomSheet = new RecurringBuyPlanDetailConfirmationBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putString("arg.type", confirmationType.getValue());
            recurringBuyPlanDetailConfirmationBottomSheet.setArguments(bundle);
            return recurringBuyPlanDetailConfirmationBottomSheet;
        }
    }
}
