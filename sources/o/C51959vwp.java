package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51959vwp extends android.widget.LinearLayout {
    public final InterfaceC56387yDm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51959vwp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51959vwp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.vwp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51959vwp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51959vwp(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vwq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51959vwp.AEQbTJ(context, this);
            }
        });
        setOrientation(1);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.valueOf, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.vwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51959vwp.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.AhwBna, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.vww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51959vwp.KWHzl(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
        typedArrayObtainStyledAttributes.recycle();
    }

    private final AbstractC48439uRl KWHzl() {
        return (AbstractC48439uRl) this.EZpvd.getValue();
    }

    public static final AbstractC48439uRl AEQbTJ(android.content.Context context, C51959vwp c51959vwp) {
        return AbstractC48439uRl.EZpvd(android.view.LayoutInflater.from(context), c51959vwp, true);
    }

    public static final Unit OLrzqt(C51959vwp c51959vwp, int i) {
        c51959vwp.KWHzl().copydefault.setText(C33070mpX.AYXKKw(i));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51959vwp c51959vwp, int i) {
        c51959vwp.KWHzl().KWHzl.setText(C33070mpX.AYXKKw(i));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.vwp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitleClick$default(C51959vwp c51959vwp, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c51959vwp.setTitleClick(str, function0);
    }

    public final void setTitleClick(java.lang.String str, Function0<Unit> function0) {
        C55258xgZ c55258xgZ = KWHzl().copydefault;
        c55258xgZ.setHelperLabelType(function0 != null ? 1 : 2);
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, function0));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            c55258xgZ.setText(str);
        }
    }

    public final void setContent(java.lang.String str) {
        KWHzl().KWHzl.setText(str);
    }

    /* JADX INFO: renamed from: o.vwp$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
