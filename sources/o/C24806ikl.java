package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24806ikl extends C55001xbh {
    public long AEQbTJ;
    public java.util.ArrayList<Function2<C55001xbh, java.lang.String, Unit>> AYXKKw;
    public Function2<? super AppCompatEditText, ? super java.lang.Boolean, Unit> AhwBna;
    public java.util.ArrayList<Function2<C55001xbh, java.lang.String, Unit>> EZpvd;
    public Function2<? super C55001xbh, ? super java.lang.String, Unit> KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public boolean copydefault;
    public android.text.TextWatcher djBIcL;
    public java.util.ArrayList<Function2<C55001xbh, java.lang.String, Unit>> gEmmrt;
    public View.OnClickListener valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForbiddenTextChangedListener(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsolateTextChangedListener(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.valueOf = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24806ikl(@NotNull android.content.Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
        this.AYXKKw = new java.util.ArrayList<>();
        this.AEQbTJ = 500L;
        setKeyListener(AYXKKw());
        setShowThousandsSeparator(true);
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24806ikl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
        this.AYXKKw = new java.util.ArrayList<>();
        this.AEQbTJ = 500L;
        setKeyListener(AYXKKw());
        setShowThousandsSeparator(true);
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24806ikl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
        this.AYXKKw = new java.util.ArrayList<>();
        this.AEQbTJ = 500L;
        setKeyListener(AYXKKw());
        setShowThousandsSeparator(true);
        copydefault();
    }

    /* JADX INFO: renamed from: o.ikl$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            Function2 function2 = C24806ikl.this.KWHzl;
            if (function2 != null) {
                C24806ikl c24806ikl = C24806ikl.this;
                function2.invoke(c24806ikl, c24806ikl.isConnected());
            }
            if (C24806ikl.this.copydefault) {
                return;
            }
            java.util.ArrayList arrayList = C24806ikl.this.AYXKKw;
            C24806ikl c24806ikl2 = C24806ikl.this;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(c24806ikl2, c24806ikl2.isConnected());
            }
        }
    }

    private final void copydefault() {
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.djBIcL = stateListAnimator;
        addTextChangedListener(stateListAnimator);
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ikn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C24806ikl.KWHzl(this.OLrzqt, view, z);
            }
        });
        setCursorStyleWeb3();
    }

    public static final void KWHzl(C24806ikl c24806ikl, android.view.View view, boolean z) {
        Function2<? super AppCompatEditText, ? super java.lang.Boolean, Unit> function2 = c24806ikl.AhwBna;
        if (function2 != null) {
            function2.invoke(c24806ikl, java.lang.Boolean.valueOf(z));
        }
    }

    public final void KWHzl() {
        android.text.TextWatcher textWatcher = this.djBIcL;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
        }
        setOnFocusChangeListener(null);
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.valueOf = null;
        setKeyListener(null);
        setOnEditorActionListener(null);
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(this).skip(1L).debounce(this.AEQbTJ, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.iki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24806ikl.copydefault(this.EZpvd, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ikm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24806ikl.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ikp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24806ikl.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.OLrzqt = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ikq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24806ikl.copydefault(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C24806ikl c24806ikl, AbstractC8060avc abstractC8060avc) {
        java.util.Iterator<T> it = c24806ikl.EZpvd.iterator();
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            if (!c24806ikl.gEmmrt.contains(function2)) {
                function2.invoke(c24806ikl, c24806ikl.isConnected());
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        if (this.EZpvd.isEmpty()) {
            AEQbTJ();
        }
        this.EZpvd.add(function2);
    }

    public final void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        InterfaceC58217yxC interfaceC58217yxC;
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd.remove(function2);
        if (!this.EZpvd.isEmpty() || (interfaceC58217yxC = this.OLrzqt) == null) {
            return;
        }
        interfaceC58217yxC.dispose();
    }

    public final void copydefault(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AYXKKw.add(function2);
    }

    public final void OLrzqt(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AYXKKw.remove(function2);
    }

    public static /* synthetic */ void setForbiddenTextChangedListener$default(C24806ikl c24806ikl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c24806ikl.setForbiddenTextChangedListener(z);
    }

    public final void setTradeInputContent(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        setText(str);
        android.text.Editable text = getText();
        setSelection(text != null ? text.length() : 0);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent != null && motionEvent.getAction() == 1 && (onClickListener = this.valueOf) != null) {
            onClickListener.onClick(this);
        }
        return zOnTouchEvent;
    }
}
