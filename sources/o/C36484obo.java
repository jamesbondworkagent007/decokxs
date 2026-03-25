package o;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.obo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36484obo extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C36483obn AEQbTJ;
    public ViewPager2 EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C36484obo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C36484obo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.obo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C36484obo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36484obo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C35399nuc.Dialog.DaTmkG, (android.view.ViewGroup) this, true);
        this.EZpvd = (ViewPager2) findViewById(C35399nuc.StateListAnimator.fsw);
        pUU.KWHzl("PluginBoardView", "PluginBoardView initialized");
    }

    /* JADX INFO: renamed from: o.obo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.obo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void setupViewPager(java.util.List<? extends InterfaceC35288nsW> list, InterfaceC36485obp interfaceC36485obp) {
        C36483obn c36483obn = new C36483obn(interfaceC36485obp);
        c36483obn.KWHzl(list);
        this.AEQbTJ = c36483obn;
        ViewPager2 viewPager2 = this.EZpvd;
        if (viewPager2 != null) {
            viewPager2.setAdapter(c36483obn);
        }
        pUU.KWHzl("PluginBoardView", "ViewPager setup with " + list.size() + " plugins");
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends InterfaceC35288nsW> list, @NotNull InterfaceC36485obp interfaceC36485obp) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC36485obp, "");
        pUU.KWHzl("PluginBoardView", "Initializing PluginBoardView with " + list.size() + " plugins");
        setupViewPager(list, interfaceC36485obp);
    }
}
