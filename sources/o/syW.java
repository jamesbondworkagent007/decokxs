package o;

import android.text.InputFilter;
import android.view.View;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class syW extends android.widget.FrameLayout {
    public int EZpvd;
    public android.text.TextWatcher KWHzl;
    public java.lang.String OLrzqt;
    public Function1<? super java.lang.Boolean, Unit> copydefault;
    public final AbstractC47518trc djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public syW(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public syW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFocusCallback(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.syW.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ syW(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = 100;
        AbstractC47518trc abstractC47518trcEZpvd = AbstractC47518trc.EZpvd(android.view.LayoutInflater.from(context), this, true);
        this.djBIcL = abstractC47518trcEZpvd;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47315tni.FragmentManager.AYXKKw);
        try {
            java.lang.String string = typedArrayObtainStyledAttributes.getString(C47315tni.FragmentManager.djBIcL);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C47315tni.FragmentManager.djBIcL, -1);
            setHint(resourceId != -1 ? C33070mpX.AYXKKw(resourceId) : string);
            this.EZpvd = typedArrayObtainStyledAttributes.getInt(C47315tni.FragmentManager.valueOf, 100);
            typedArrayObtainStyledAttributes.recycle();
            OKEditText oKEditText = abstractC47518trcEZpvd.copydefault;
            oKEditText.setOnTouchListener(new View.OnTouchListener() { // from class: o.syX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return syW.KWHzl(view, motionEvent);
                }
            });
            Intrinsics.copydefault(oKEditText);
            oKEditText.addTextChangedListener(new StateListAnimator());
            oKEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.sza
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    syW.OLrzqt(this.KWHzl, view, z);
                }
            });
            oKEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.EZpvd)});
            OLrzqt(null);
            this.copydefault = new Function1() { // from class: o.syY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return syW.EZpvd(((java.lang.Boolean) obj).booleanValue());
                }
            };
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void setHint(java.lang.String str) {
        this.OLrzqt = str;
        this.djBIcL.copydefault.setHint(str);
    }

    public static final boolean KWHzl(android.view.View view, android.view.MotionEvent motionEvent) {
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

    public static final void OLrzqt(syW syw, android.view.View view, boolean z) {
        syw.djBIcL.OLrzqt.setSelected(z);
        syw.copydefault.invoke(java.lang.Boolean.valueOf(z));
    }

    public static final Unit EZpvd(boolean z) {
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            syW.this.OLrzqt(charSequence);
        }
    }

    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ Function1<java.lang.CharSequence, Unit> EZpvd;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super java.lang.CharSequence, Unit> function1) {
            this.EZpvd = function1;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.EZpvd.invoke(charSequence);
        }
    }

    public final void setTextChangedListener(@NotNull Function1<? super java.lang.CharSequence, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        EZpvd();
        ActionBar actionBar = new ActionBar(function1);
        this.djBIcL.copydefault.addTextChangedListener(actionBar);
        this.KWHzl = actionBar;
    }

    public final void EZpvd() {
        OKEditText oKEditText = this.djBIcL.copydefault;
        android.text.TextWatcher textWatcher = this.KWHzl;
        if (textWatcher != null) {
            oKEditText.removeTextChangedListener(textWatcher);
        }
        this.KWHzl = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        super.clearFocus();
        this.djBIcL.copydefault.clearFocus();
    }

    public final boolean copydefault(java.lang.CharSequence charSequence) {
        return (charSequence != null ? charSequence.length() : 0) <= this.EZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.CharSequence charSequence) {
        int length = charSequence != null ? charSequence.length() : 0;
        this.djBIcL.AEQbTJ.setText(length + "/" + this.EZpvd);
    }

    public final void setText(java.lang.CharSequence charSequence) {
        OKEditText oKEditText = this.djBIcL.copydefault;
        if (copydefault(charSequence)) {
            android.text.TextWatcher textWatcher = this.KWHzl;
            if (textWatcher != null) {
                oKEditText.removeTextChangedListener(textWatcher);
            }
            if (charSequence == null) {
                oKEditText.setText(charSequence);
            } else {
                oKEditText.setTextKeepState(charSequence);
            }
            android.text.TextWatcher textWatcher2 = this.KWHzl;
            if (textWatcher2 != null) {
                oKEditText.addTextChangedListener(textWatcher2);
            }
        }
    }
}
