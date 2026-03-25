package o;

import android.text.InputFilter;
import android.view.View;
import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sCX extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public android.text.TextWatcher EZpvd;
    public int OLrzqt;
    public java.lang.String copydefault;
    public final AbstractC47520tre djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sCX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sCX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.sCX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ sCX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sCX(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC47520tre abstractC47520treEZpvd = AbstractC47520tre.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC47520treEZpvd, "");
        this.djBIcL = abstractC47520treEZpvd;
        this.OLrzqt = 100;
        EZpvd(attributeSet);
        OKEditText oKEditText = abstractC47520treEZpvd.copydefault;
        oKEditText.setOnTouchListener(new View.OnTouchListener() { // from class: o.sCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return sCX.copydefault(view, motionEvent);
            }
        });
        Intrinsics.copydefault(oKEditText);
        oKEditText.addTextChangedListener(new ActionBar());
        oKEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.sDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                sCX.copydefault(context, view, z);
            }
        });
        oKEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.OLrzqt)});
        setTitle(this.AEQbTJ);
        setHint(this.copydefault);
        copydefault(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sCX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final boolean copydefault(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        android.view.ViewParent parent2 = view.getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(true);
        }
        if ((motionEvent.getAction() & 255) == 1 && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public static final void copydefault(final android.content.Context context, final android.view.View view, boolean z) {
        if (z) {
            return;
        }
        view.post(new java.lang.Runnable() { // from class: o.sDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                sCX.KWHzl(context, view);
            }
        });
    }

    public static final void KWHzl(android.content.Context context, android.view.View view) {
        C33570myu.AEQbTJ(context, view);
    }

    public final void EZpvd(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C47315tni.FragmentManager.AhwBna);
            Intrinsics.copydefault(typedArrayObtainStyledAttributes);
            this.AEQbTJ = AEQbTJ(typedArrayObtainStyledAttributes, C47315tni.FragmentManager.fetchVPNInfo);
            this.copydefault = AEQbTJ(typedArrayObtainStyledAttributes, C47315tni.FragmentManager.values);
            this.OLrzqt = typedArrayObtainStyledAttributes.getInt(C47315tni.FragmentManager.DbNXlk, 100);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final java.lang.String AEQbTJ(android.content.res.TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, -1);
        return resourceId != -1 ? getContext().getString(resourceId) : typedArray.getString(i);
    }

    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            sCX.this.copydefault(charSequence);
        }
    }

    public final void setTitle(java.lang.String str) {
        this.djBIcL.AEQbTJ.setText(str);
    }

    public final void setHint(java.lang.String str) {
        this.copydefault = str;
        this.djBIcL.copydefault.setHint(str);
    }

    public final void setTextChangedListener(@NotNull android.text.TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "");
        EZpvd();
        this.djBIcL.copydefault.addTextChangedListener(textWatcher);
        this.EZpvd = textWatcher;
    }

    public final void EZpvd() {
        OKEditText oKEditText = this.djBIcL.copydefault;
        android.text.TextWatcher textWatcher = this.EZpvd;
        if (textWatcher != null) {
            oKEditText.removeTextChangedListener(textWatcher);
        }
        this.EZpvd = null;
    }

    public final boolean KWHzl(java.lang.CharSequence charSequence) {
        return (charSequence != null ? charSequence.length() : 0) <= this.OLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.CharSequence charSequence) {
        int length = charSequence != null ? charSequence.length() : 0;
        this.djBIcL.EZpvd.setText(length + "/" + this.OLrzqt);
    }

    public final void setText(java.lang.CharSequence charSequence) {
        OKEditText oKEditText = this.djBIcL.copydefault;
        if (KWHzl(charSequence)) {
            android.text.TextWatcher textWatcher = this.EZpvd;
            if (textWatcher != null) {
                oKEditText.removeTextChangedListener(textWatcher);
            }
            if (charSequence == null) {
                oKEditText.setText(charSequence);
            } else {
                oKEditText.setTextKeepState(charSequence);
            }
            android.text.TextWatcher textWatcher2 = this.EZpvd;
            if (textWatcher2 != null) {
                oKEditText.addTextChangedListener(textWatcher2);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.djBIcL.copydefault.setEnabled(z);
        super.setEnabled(z);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return super.isEnabled() && this.djBIcL.copydefault.isEnabled();
    }
}
