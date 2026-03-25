package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27343jtR extends C55001xbh {
    public InterfaceC58217yxC AEQbTJ;
    public java.util.ArrayList<Function2<C55001xbh, java.lang.String, Unit>> AhwBna;
    public Function2<? super AppCompatEditText, ? super java.lang.Boolean, Unit> EZpvd;
    public View.OnClickListener KWHzl;
    public long OLrzqt;
    public java.util.ArrayList<Function2<C55001xbh, java.lang.String, Unit>> copydefault;
    public java.util.ArrayList<Function2<C55001xbh, java.lang.String, Unit>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.KWHzl = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFocusChangeCallback(@NotNull Function2<? super AppCompatEditText, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27343jtR(@NotNull android.content.Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        this.AhwBna = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
        this.OLrzqt = 500L;
        setKeyListener(AYXKKw());
        setShowThousandsSeparator(true);
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27343jtR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        this.AhwBna = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
        this.OLrzqt = 500L;
        setKeyListener(AYXKKw());
        setShowThousandsSeparator(true);
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27343jtR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList<>();
        this.AhwBna = new java.util.ArrayList<>();
        this.gEmmrt = new java.util.ArrayList<>();
        this.OLrzqt = 500L;
        setKeyListener(AYXKKw());
        setShowThousandsSeparator(true);
        KWHzl();
    }

    /* JADX INFO: renamed from: o.jtR$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.util.ArrayList arrayList = C27343jtR.this.gEmmrt;
            C27343jtR c27343jtR = C27343jtR.this;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(c27343jtR, c27343jtR.isConnected());
            }
        }
    }

    private final void KWHzl() {
        addTextChangedListener(new ActionBar());
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jtU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C27343jtR.copydefault(this.AEQbTJ, view, z);
            }
        });
    }

    public static final void copydefault(C27343jtR c27343jtR, android.view.View view, boolean z) {
        Function2<? super AppCompatEditText, ? super java.lang.Boolean, Unit> function2 = c27343jtR.EZpvd;
        if (function2 != null) {
            function2.invoke(c27343jtR, java.lang.Boolean.valueOf(z));
        }
    }

    private final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(this).skip(1L).debounce(this.OLrzqt, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.jtT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27343jtR.AEQbTJ(this.AEQbTJ, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jtW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27343jtR.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jtY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27343jtR.copydefault((java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jtV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27343jtR.OLrzqt(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C27343jtR c27343jtR, AbstractC8060avc abstractC8060avc) {
        java.util.Iterator<T> it = c27343jtR.copydefault.iterator();
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            if (!c27343jtR.AhwBna.contains(function2)) {
                function2.invoke(c27343jtR, c27343jtR.isConnected());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void setDelayTime(long j) {
        this.OLrzqt = j;
        AEQbTJ();
    }

    public final void copydefault(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        if (this.copydefault.isEmpty()) {
            AEQbTJ();
        }
        this.copydefault.add(function2);
    }

    public final void EZpvd(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt.add(function2);
    }

    public final void KWHzl(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt.remove(function2);
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
        if (motionEvent != null && motionEvent.getAction() == 1 && (onClickListener = this.KWHzl) != null) {
            onClickListener.onClick(this);
        }
        return zOnTouchEvent;
    }

    public final void setTradeInputSkipCallback(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit>... function2Arr) {
        Intrinsics.checkNotNullParameter(function2Arr, "");
        for (Function2<? super C55001xbh, ? super java.lang.String, Unit> function2 : function2Arr) {
            this.AhwBna.add((Function2<C55001xbh, java.lang.String, Unit>) function2);
        }
    }
}
