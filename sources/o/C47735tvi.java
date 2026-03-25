package o;

import android.view.View;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tvi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47735tvi extends android.widget.FrameLayout {
    public Function1<? super tWV, Unit> AEQbTJ;
    public Function1<? super tWV, Unit> EZpvd;
    public tWV KWHzl;
    public final tOM OLrzqt;
    public PlanetPublisherPluginType copydefault;
    public Function2<? super PlanetPublisherPluginType, ? super tWV, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47735tvi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47735tvi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionButtonListeners(Function1<? super tWV, Unit> function1, Function1<? super tWV, Unit> function12) {
        this.AEQbTJ = function1;
        this.EZpvd = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPluginData(@NotNull PlanetPublisherPluginType planetPublisherPluginType, tWV twv) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        this.copydefault = planetPublisherPluginType;
        this.KWHzl = twv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewClickListener(Function2<? super PlanetPublisherPluginType, ? super tWV, Unit> function2) {
        this.valueOf = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.tvi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C47735tvi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47735tvi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        tOM tomEZpvd = tOM.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(tomEZpvd, "");
        this.OLrzqt = tomEZpvd;
        setupActionButtons();
    }

    public final void setupActionButtons() {
        this.OLrzqt.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.tvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47735tvi.setupActionButtons$lambda$0(this.AEQbTJ, view);
            }
        });
        this.OLrzqt.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.tvm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47735tvi.setupActionButtons$lambda$1(this.KWHzl, view);
            }
        });
        this.OLrzqt.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47735tvi.setupActionButtons$lambda$2(this.OLrzqt, view);
            }
        });
    }

    public static final void setupActionButtons$lambda$0(C47735tvi c47735tvi, android.view.View view) {
        Function1<? super tWV, Unit> function1 = c47735tvi.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c47735tvi.KWHzl);
        }
    }

    public static final void setupActionButtons$lambda$1(C47735tvi c47735tvi, android.view.View view) {
        Function1<? super tWV, Unit> function1 = c47735tvi.EZpvd;
        if (function1 != null) {
            function1.invoke(c47735tvi.KWHzl);
        }
    }

    public static final void setupActionButtons$lambda$2(C47735tvi c47735tvi, android.view.View view) {
        Function2<? super PlanetPublisherPluginType, ? super tWV, Unit> function2 = c47735tvi.valueOf;
        if (function2 != null) {
            function2.invoke(c47735tvi.copydefault, c47735tvi.KWHzl);
        }
    }

    public final void setPluginContent(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt.EZpvd.removeAllViews();
        this.OLrzqt.EZpvd.addView(view);
    }

    public final void OLrzqt() {
        this.OLrzqt.EZpvd.removeAllViews();
    }

    public final void setTestMode(boolean z) {
        this.OLrzqt.AEQbTJ.setVisibility(z ? 0 : 8);
    }
}
