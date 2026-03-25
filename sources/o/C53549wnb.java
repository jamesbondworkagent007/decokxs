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

/* JADX INFO: renamed from: o.wnb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53549wnb extends android.widget.LinearLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public java.lang.String AhwBna;
    public final AbstractC48502uTu KWHzl;
    public int OLrzqt;
    public int copydefault;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53549wnb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53549wnb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        int i = this.OLrzqt;
        if (i != 0) {
            if (i == 1) {
                return "short";
            }
            if (i == 2) {
                return "neutral";
            }
            if (i == 3) {
                return "hedging";
            }
        }
        return "long";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabSelectedCallBack(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.wnb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53549wnb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53549wnb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.processStrongAuthMessage, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC48502uTu) viewDataBindingInflate;
        this.OLrzqt = -1;
        this.AhwBna = "long";
        AEQbTJ(attributeSet);
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.wnb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wnb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ() {
        AbstractC48502uTu abstractC48502uTu = this.KWHzl;
        abstractC48502uTu.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.wmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53549wnb.OLrzqt(this.AEQbTJ, view);
            }
        });
        abstractC48502uTu.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53549wnb.AhwBna(this.copydefault, view);
            }
        });
        abstractC48502uTu.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.wne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53549wnb.gEmmrt(this.EZpvd, view);
            }
        });
        abstractC48502uTu.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wni
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53549wnb.AYXKKw(this.copydefault, view);
            }
        });
    }

    public static final void OLrzqt(C53549wnb c53549wnb, android.view.View view) {
        int i = c53549wnb.OLrzqt;
        if (i != 0) {
            c53549wnb.AhwBna = i != 1 ? i != 2 ? i != 3 ? "long" : "hedging" : "neutral" : "short";
            c53549wnb.OLrzqt = 0;
            c53549wnb.OLrzqt(0);
            Function1<? super java.lang.String, Unit> function1 = c53549wnb.AEQbTJ;
            if (function1 != null) {
                function1.invoke("long");
            }
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53549wnb.djBIcL;
            if (function2 != null) {
                function2.invoke("long", c53549wnb.AhwBna);
            }
        }
    }

    public static final void AhwBna(C53549wnb c53549wnb, android.view.View view) {
        int i = c53549wnb.OLrzqt;
        if (i != 1) {
            c53549wnb.AhwBna = i != 0 ? i != 2 ? i != 3 ? "short" : "hedging" : "neutral" : "long";
            c53549wnb.OLrzqt = 1;
            c53549wnb.OLrzqt(1);
            Function1<? super java.lang.String, Unit> function1 = c53549wnb.AEQbTJ;
            if (function1 != null) {
                function1.invoke("short");
            }
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53549wnb.djBIcL;
            if (function2 != null) {
                function2.invoke("short", c53549wnb.AhwBna);
            }
        }
    }

    public static final void gEmmrt(C53549wnb c53549wnb, android.view.View view) {
        int i = c53549wnb.OLrzqt;
        if (i != 2) {
            c53549wnb.AhwBna = i != 0 ? i != 1 ? i != 3 ? "neutral" : "hedging" : "short" : "long";
            c53549wnb.OLrzqt = 2;
            c53549wnb.OLrzqt(2);
            Function1<? super java.lang.String, Unit> function1 = c53549wnb.AEQbTJ;
            if (function1 != null) {
                function1.invoke("neutral");
            }
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53549wnb.djBIcL;
            if (function2 != null) {
                function2.invoke("neutral", c53549wnb.AhwBna);
            }
        }
    }

    public static final void AYXKKw(C53549wnb c53549wnb, android.view.View view) {
        int i = c53549wnb.OLrzqt;
        if (i != 3) {
            c53549wnb.AhwBna = i != 0 ? i != 1 ? i != 2 ? "hedging" : "neutral" : "short" : "long";
            c53549wnb.OLrzqt = 3;
            c53549wnb.OLrzqt(3);
            Function1<? super java.lang.String, Unit> function1 = c53549wnb.AEQbTJ;
            if (function1 != null) {
                function1.invoke("hedging");
            }
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53549wnb.djBIcL;
            if (function2 != null) {
                function2.invoke("hedging", c53549wnb.AhwBna);
            }
        }
    }

    private final void OLrzqt(int i) {
        this.KWHzl.KWHzl.setOKDSType(i == 0 ? 261 : 260);
        this.KWHzl.AEQbTJ.setOKDSType(i == 1 ? 262 : 260);
        this.KWHzl.copydefault.setOKDSType(i == 2 ? 259 : 260);
        this.KWHzl.EZpvd.setOKDSType(i == 3 ? 262 : 260);
    }

    public static /* synthetic */ void addTab$default(C53549wnb c53549wnb, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c53549wnb.copydefault(z);
    }

    public final void copydefault(boolean z) {
        this.KWHzl.KWHzl.setText(C55688xof.Application.IResultReceiver2);
        setDirectionType("long");
        this.KWHzl.AEQbTJ.setText(C55688xof.Application.IResultReceiver_Parcel);
        C52794wYp c52794wYp = this.KWHzl.copydefault;
        c52794wYp.setText(C55688xof.Application.IResultReceiverStubProxy);
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(this.copydefault == 0 ? 0 : 8);
        C52794wYp c52794wYp2 = this.KWHzl.EZpvd;
        c52794wYp2.setText(C55688xof.Application.PlaybackStateCompatApi22);
        Intrinsics.copydefault(c52794wYp2);
        c52794wYp2.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void addTab$default(C53549wnb c53549wnb, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        c53549wnb.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        this.KWHzl.KWHzl.setText(C55688xof.Application.IResultReceiver2);
        setDirectionType("long");
        this.KWHzl.AEQbTJ.setText(C55688xof.Application.IResultReceiver_Parcel);
        C52794wYp c52794wYp = this.KWHzl.copydefault;
        c52794wYp.setText(C55688xof.Application.IResultReceiverStubProxy);
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(z ? 0 : 8);
        C52794wYp c52794wYp2 = this.KWHzl.EZpvd;
        c52794wYp2.setText(C55688xof.Application.PlaybackStateCompatApi22);
        Intrinsics.copydefault(c52794wYp2);
        c52794wYp2.setVisibility(z2 ? 0 : 8);
    }

    public final C52794wYp OLrzqt() {
        C52794wYp c52794wYp = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [164=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setDirectionType(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 3327612:
                    if (str.equals("long")) {
                        this.KWHzl.KWHzl.performClick();
                    }
                    break;
                case 109413500:
                    if (str.equals("short")) {
                        this.KWHzl.AEQbTJ.performClick();
                        break;
                    }
                    break;
                case 798171554:
                    if (str.equals("hedging")) {
                        this.KWHzl.EZpvd.performClick();
                        break;
                    }
                    break;
                case 1844321735:
                    if (str.equals("neutral")) {
                        this.KWHzl.copydefault.performClick();
                        break;
                    }
                    break;
            }
        }
    }

    public final void AEQbTJ(android.util.AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.finit);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.copydefault = typedArrayObtainStyledAttributes.getInt(C48033uCm.LoaderManager.fvQaOB, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
