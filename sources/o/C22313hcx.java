package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22313hcx extends LinearLayoutCompat {
    public Function0<Unit> EZpvd;
    public final C21643hGz KWHzl;
    public InterfaceC58217yxC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22313hcx(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSuccessListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:19) call: o.hcx.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C22313hcx(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22313hcx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21643hGz c21643hGzEZpvd = C21643hGz.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21643hGzEZpvd, "");
        this.KWHzl = c21643hGzEZpvd;
        setOrientation(1);
        int iOLrzqt = C55298xhM.OLrzqt(24, context);
        setPadding(iOLrzqt, iOLrzqt, iOLrzqt, iOLrzqt);
        setBackgroundResource(C23274hvD.ActionBar.DbNXlk);
        C25352ivB.setOnDoubleCheckClickListener$default(c21643hGzEZpvd.EZpvd, 0L, new Function1() { // from class: o.hcD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22313hcx.AEQbTJ((android.view.View) obj);
            }
        }, 1, null);
        AEQbTJ(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C22274hcK.OLrzqt.EZpvd(new Function0() { // from class: o.hcz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22313hcx.OLrzqt();
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        RxBus.AEQbTJ(C22275hcL.copydefault);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C22275hcL.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.hcE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22313hcx.OLrzqt(this.KWHzl, (C22275hcL) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hcF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22313hcx.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hcC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22313hcx.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.copydefault = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hcG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22313hcx.OLrzqt(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C22313hcx c22313hcx, C22275hcL c22275hcL) {
        Function0<Unit> function0 = c22313hcx.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    private final void AEQbTJ(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int[] iArr = C23274hvD.LoaderManager.fARcdN;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        java.lang.CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context2, C23274hvD.LoaderManager.iwGUEr, 0, 4, null);
        if (string$default != null) {
            if (string$default.length() <= 0) {
                string$default = null;
            }
            if (string$default != null) {
                setTitle(string$default);
            }
        }
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C23274hvD.LoaderManager.fJNWhG);
        if (string != null) {
            java.lang.String str = string.length() > 0 ? string : null;
            if (str != null) {
                setSubTitle(str);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatImageView appCompatImageView = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C22361hds.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.JwtCheck);
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.KWHzl.AEQbTJ.setText(charSequence);
    }

    public final void setSubTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.KWHzl.copydefault.setText(charSequence);
    }
}
