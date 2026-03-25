package o;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C57227yeT;
import o.C57289yfc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57233yeZ extends android.widget.LinearLayout {
    public final C17032evD OLrzqt;
    public Activity copydefault;

    /* JADX INFO: renamed from: o.yeZ$ActionBar */
    public interface ActionBar {
        boolean copydefault(int i, int i2, android.view.KeyEvent keyEvent, @NotNull java.lang.String str);
    }

    /* JADX INFO: renamed from: o.yeZ$Activity */
    public interface Activity {
        void EZpvd(int i);
    }

    /* JADX INFO: renamed from: o.yeZ$Application */
    public interface Application {
        void copydefault(int i, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2);
    }

    /* JADX INFO: renamed from: o.yeZ$StateListAnimator */
    public interface StateListAnimator {
        boolean copydefault(int i, java.lang.CharSequence charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57233yeZ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C17032evD c17032evDOLrzqt = C17032evD.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c17032evDOLrzqt, "");
        this.OLrzqt = c17032evDOLrzqt;
        setClipToPadding(false);
        c17032evDOLrzqt.OLrzqt.setSaveEnabled(false);
        c17032evDOLrzqt.EZpvd.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.yeX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C57233yeZ.AEQbTJ(this.AEQbTJ, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57233yeZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C17032evD c17032evDOLrzqt = C17032evD.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c17032evDOLrzqt, "");
        this.OLrzqt = c17032evDOLrzqt;
        setClipToPadding(false);
        c17032evDOLrzqt.OLrzqt.setSaveEnabled(false);
        c17032evDOLrzqt.EZpvd.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.yeX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C57233yeZ.AEQbTJ(this.AEQbTJ, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57233yeZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C17032evD c17032evDOLrzqt = C17032evD.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c17032evDOLrzqt, "");
        this.OLrzqt = c17032evDOLrzqt;
        setClipToPadding(false);
        c17032evDOLrzqt.OLrzqt.setSaveEnabled(false);
        c17032evDOLrzqt.EZpvd.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.yeX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i2, int i22, int i3, int i4, int i5, int i6, int i7, int i8) {
                C57233yeZ.AEQbTJ(this.AEQbTJ, view, i2, i22, i3, i4, i5, i6, i7, i8);
            }
        });
        setOrientation(1);
    }

    private final int copydefault() {
        C57227yeT.TaskDescription taskDescriptionAEQbTJ = AEQbTJ();
        if (taskDescriptionAEQbTJ != null) {
            return taskDescriptionAEQbTJ.EZpvd();
        }
        return -1;
    }

    public final C57227yeT.TaskDescription AEQbTJ() {
        java.lang.Object tag = getTag(C13754dXa.ActionBar.getNavigationMode);
        if (tag instanceof C57227yeT.TaskDescription) {
            return (C57227yeT.TaskDescription) tag;
        }
        return null;
    }

    public static final void AEQbTJ(C57233yeZ c57233yeZ, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        android.content.Context context = view.getContext();
        C57289yfc c57289yfc = c57233yeZ.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57289yfc, "");
        Intrinsics.copydefault(context);
        int iOLrzqt = C55298xhM.OLrzqt(10, context);
        c57289yfc.setPaddingRelative(((iOLrzqt + i3) - i) + C55298xhM.OLrzqt(8, context), c57289yfc.getPaddingTop(), c57289yfc.getPaddingEnd(), c57289yfc.getPaddingBottom());
    }

    public final void setAddress(@NotNull C57227yeT.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        setTag(C13754dXa.ActionBar.getNavigationMode, taskDescription);
        android.widget.TextView textView = this.OLrzqt.EZpvd;
        java.lang.String str = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(taskDescription.EZpvd() + 1)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        textView.setText(str);
        C57289yfc c57289yfc = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57289yfc, "");
        C57223yeP.AEQbTJ(c57289yfc, taskDescription.djBIcL());
        if (taskDescription.gEmmrt() != -1) {
            this.OLrzqt.OLrzqt.setSelection(C56548yJl.valueOf(taskDescription.gEmmrt(), this.OLrzqt.OLrzqt.length()));
        }
        this.OLrzqt.OLrzqt.setTextColor(ContextCompat.getColor(getContext(), taskDescription.AYXKKw()));
        this.OLrzqt.copydefault.setBackgroundResource(taskDescription.OLrzqt());
        if (taskDescription.isConnected()) {
            this.OLrzqt.gEmmrt.setVisibility(0);
            this.OLrzqt.AEQbTJ.setImageTintList(C33070mpX.AEQbTJ(taskDescription.copydefault()));
            this.OLrzqt.AhwBna.setText(taskDescription.AEQbTJ());
            this.OLrzqt.AhwBna.setTextColor(C33070mpX.copydefault(taskDescription.copydefault()));
        } else {
            this.OLrzqt.gEmmrt.setVisibility(8);
        }
        setSelectedState(taskDescription.EZpvd(), taskDescription.valueOf());
    }

    public final void setSelectedState(int i, int i2) {
        C43296rmc.KWHzl("MultiTransferInputAddress-SingleAddressInputLayout", "setSelectedState1：index-" + i + "，selectedIndex-" + i2);
        if (i2 == -1) {
            this.OLrzqt.OLrzqt.clearFocus();
            C33570myu.AEQbTJ(this.OLrzqt.OLrzqt.getContext(), (android.view.View) this.OLrzqt.OLrzqt);
            return;
        }
        if (i != i2) {
            return;
        }
        bringToFront();
        this.OLrzqt.OLrzqt.setCursorVisible(true);
        C57289yfc c57289yfc = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57289yfc, "");
        C57223yeP.tryRequestFocusWithoutNotifying$default(c57289yfc, 0, 1, null);
        C43296rmc.KWHzl("MultiTransferInputAddress-SingleAddressInputLayout", "setSelectedState2：index-" + i + "，selectedIndex-" + i2);
    }

    public final void setOnWordTextChangedListener(final Application application) {
        if (application == null) {
            C57289yfc c57289yfc = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c57289yfc, "");
            C57223yeP.copydefault(c57289yfc, (InterfaceC57229yeV) null);
        } else {
            C57289yfc c57289yfc2 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c57289yfc2, "");
            C57223yeP.copydefault(c57289yfc2, new InterfaceC57229yeV() { // from class: o.yfg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57229yeV
                public final void AEQbTJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                    C57233yeZ.setOnWordTextChangedListener$lambda$1(this.OLrzqt, application, charSequence, charSequence2);
                }
            });
        }
    }

    public static final void setOnWordTextChangedListener$lambda$1(C57233yeZ c57233yeZ, Application application, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        C57289yfc c57289yfc = c57233yeZ.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57289yfc, "");
        C57223yeP.AEQbTJ(c57289yfc, charSequence);
        application.copydefault(c57233yeZ.copydefault(), charSequence, charSequence2);
    }

    public final void setOnWordKeyListener(final StateListAnimator stateListAnimator) {
        if (stateListAnimator == null) {
            this.OLrzqt.OLrzqt.setOnBackspaceDownListener(null);
        } else {
            this.OLrzqt.OLrzqt.setOnBackspaceDownListener(new C57289yfc.Application() { // from class: o.yff
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C57289yfc.Application
                public final void OLrzqt() {
                    C57233yeZ.setOnWordKeyListener$lambda$2(stateListAnimator, this);
                }
            });
        }
    }

    public static final void setOnWordKeyListener$lambda$2(StateListAnimator stateListAnimator, C57233yeZ c57233yeZ) {
        stateListAnimator.copydefault(c57233yeZ.copydefault(), c57233yeZ.OLrzqt.OLrzqt.getText());
    }

    public final void setOnWordFocusChangeListener(final Activity activity) {
        this.copydefault = activity;
        if (activity == null) {
            this.OLrzqt.OLrzqt.setOnFocusChangeListener(null);
        } else {
            this.OLrzqt.OLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.yfd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C57233yeZ.setOnWordFocusChangeListener$lambda$3(activity, this, view, z);
                }
            });
        }
    }

    public static final void setOnWordFocusChangeListener$lambda$3(Activity activity, C57233yeZ c57233yeZ, android.view.View view, boolean z) {
        if (z) {
            activity.EZpvd(c57233yeZ.copydefault());
            C43296rmc.KWHzl("MultiTransferInputAddress-SingleAddressInputLayout", "setOnWordFocusChangeListener：index-" + c57233yeZ.copydefault());
        }
    }

    public final void setOnWordEditorActionListener(final ActionBar actionBar) {
        if (actionBar == null) {
            this.OLrzqt.OLrzqt.setOnEditorActionListener(null);
        } else {
            this.OLrzqt.OLrzqt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.yfe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return C57233yeZ.KWHzl(actionBar, this, textView, i, keyEvent);
                }
            });
        }
    }

    public static final boolean KWHzl(ActionBar actionBar, C57233yeZ c57233yeZ, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        return actionBar.copydefault(c57233yeZ.copydefault(), i, keyEvent, java.lang.String.valueOf(c57233yeZ.OLrzqt.OLrzqt.getText()));
    }
}
