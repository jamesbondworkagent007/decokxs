package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.data.model.ModuleBoostTokenData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C29024klo extends ConstraintLayout implements InterfaceC29022klm<ModuleBoostTokenData> {
    public final InterfaceC56387yDm AEQbTJ;
    public ModuleBoostTokenData OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29024klo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29024klo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC29022klm
    public void KWHzl() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.klo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29024klo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29024klo(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.klu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29024klo.AEQbTJ(context, this);
            }
        });
    }

    private final C23400hxX copydefault() {
        return (C23400hxX) this.AEQbTJ.getValue();
    }

    public static final C23400hxX AEQbTJ(android.content.Context context, C29024klo c29024klo) {
        return C23400hxX.copydefault(android.view.LayoutInflater.from(context), c29024klo, true);
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V */
    @Override // o.InterfaceC29022klm
    public void setData(@NotNull final ModuleBoostTokenData moduleBoostTokenData, final Function1<? super ModuleBoostTokenData, Unit> function1) {
        Intrinsics.checkNotNullParameter(moduleBoostTokenData, "");
        this.OLrzqt = moduleBoostTokenData;
        C23400hxX c23400hxXCopydefault = copydefault();
        android.widget.ImageView imageViewAEQbTJ = c23400hxXCopydefault.copydefault.AEQbTJ();
        imageViewAEQbTJ.setVisibility(0);
        java.lang.String tokenLogo = moduleBoostTokenData.getTokenLogo();
        if (tokenLogo == null) {
            tokenLogo = "";
        }
        C25386ivj.AEQbTJ(imageViewAEQbTJ, tokenLogo, true);
        c23400hxXCopydefault.copydefault.setStyle(2);
        android.widget.TextView textViewEZpvd = c23400hxXCopydefault.copydefault.EZpvd();
        java.lang.String tokenName = moduleBoostTokenData.getTokenName();
        textViewEZpvd.setText(tokenName != null ? tokenName : "");
        c23400hxXCopydefault.copydefault.setOKDSSize(-20);
        C25352ivB.setOnDoubleCheckClickListener$default(c23400hxXCopydefault.copydefault, 0L, new Function1() { // from class: o.klt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29024klo.OLrzqt(moduleBoostTokenData, function1, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(ModuleBoostTokenData moduleBoostTokenData, Function1 function1, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function1 != null) {
            function1.invoke(moduleBoostTokenData);
        }
        return Unit.INSTANCE;
    }
}
