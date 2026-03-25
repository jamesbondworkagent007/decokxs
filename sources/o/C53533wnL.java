package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53533wnL extends android.widget.LinearLayout {
    public Function1<? super java.lang.String, Unit> EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public final AbstractC48504uTw copydefault;
    public java.lang.String djBIcL;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53533wnL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53533wnL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        int i = this.KWHzl;
        if (i != 0) {
            if (i == 1) {
                return "short";
            }
            if (i == 2) {
                return "neutral";
            }
        }
        return "long";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabSelectedCallBack(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabSelectedWithPreCallBack(@NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.wnL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53533wnL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53533wnL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.pauseLocationServices, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC48504uTw) viewDataBindingInflate;
        this.KWHzl = -1;
        this.djBIcL = "long";
        OLrzqt(attributeSet);
        copydefault();
    }

    /* JADX INFO: renamed from: o.wnL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wnL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void copydefault() {
        AbstractC48504uTw abstractC48504uTw = this.copydefault;
        abstractC48504uTw.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.wnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53533wnL.KWHzl(this.OLrzqt, view);
            }
        });
        abstractC48504uTw.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53533wnL.AEQbTJ(this.copydefault, view);
            }
        });
        abstractC48504uTw.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.wnN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53533wnL.gEmmrt(this.copydefault, view);
            }
        });
    }

    public static final void KWHzl(C53533wnL c53533wnL, android.view.View view) {
        int i = c53533wnL.KWHzl;
        if (i != 0) {
            c53533wnL.djBIcL = i != 1 ? i != 2 ? "long" : "neutral" : "short";
            c53533wnL.KWHzl = 0;
            c53533wnL.KWHzl(0);
            Function1<? super java.lang.String, Unit> function1 = c53533wnL.EZpvd;
            if (function1 != null) {
                function1.invoke("long");
            }
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53533wnL.gEmmrt;
            if (function2 != null) {
                function2.invoke("long", c53533wnL.djBIcL);
            }
        }
    }

    public static final void AEQbTJ(C53533wnL c53533wnL, android.view.View view) {
        int i = c53533wnL.KWHzl;
        if (i != 1) {
            c53533wnL.djBIcL = i != 0 ? i != 2 ? "short" : "neutral" : "long";
            c53533wnL.KWHzl = 1;
            c53533wnL.KWHzl(1);
            Function1<? super java.lang.String, Unit> function1 = c53533wnL.EZpvd;
            if (function1 != null) {
                function1.invoke("short");
            }
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53533wnL.gEmmrt;
            if (function2 != null) {
                function2.invoke("short", c53533wnL.djBIcL);
            }
        }
    }

    public static final void gEmmrt(C53533wnL c53533wnL, android.view.View view) {
        int i = c53533wnL.KWHzl;
        if (i != 2) {
            c53533wnL.djBIcL = i != 0 ? i != 1 ? "neutral" : "short" : "long";
            c53533wnL.KWHzl = 2;
            c53533wnL.KWHzl(2);
            Function1<? super java.lang.String, Unit> function1 = c53533wnL.EZpvd;
            if (function1 != null) {
                function1.invoke("neutral");
            }
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53533wnL.gEmmrt;
            if (function2 != null) {
                function2.invoke("neutral", c53533wnL.djBIcL);
            }
        }
    }

    private final void KWHzl(int i) {
        this.copydefault.copydefault.setOKDSType(i == 0 ? 261 : 260);
        this.copydefault.EZpvd.setOKDSType(i == 1 ? 262 : 260);
        this.copydefault.KWHzl.setOKDSType(i == 2 ? 259 : 260);
    }

    public final void OLrzqt() {
        this.copydefault.copydefault.setText(C55688xof.Application.IResultReceiver2);
        setDirectionType("long");
        this.copydefault.EZpvd.setText(C55688xof.Application.IResultReceiver_Parcel);
        C52794wYp c52794wYp = this.copydefault.KWHzl;
        c52794wYp.setText(C55688xof.Application.IResultReceiverStubProxy);
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(this.OLrzqt == 0 ? 0 : 8);
    }

    public final void setDirectionType(java.lang.String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 3327612) {
                if (str.equals("long")) {
                    this.copydefault.copydefault.performClick();
                }
            } else if (iHashCode == 109413500) {
                if (str.equals("short")) {
                    this.copydefault.EZpvd.performClick();
                }
            } else if (iHashCode == 1844321735 && str.equals("neutral")) {
                this.copydefault.KWHzl.performClick();
            }
        }
    }

    public final void OLrzqt(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.finit);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.OLrzqt = typedArrayObtainStyledAttributes.getInt(C48033uCm.LoaderManager.fvQaOB, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
