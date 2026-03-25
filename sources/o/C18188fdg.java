package o;

import android.view.View;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTokensTileBinder$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18188fdg extends AbstractC14584doH<DefiOnboardingTile.TokenGroupTile, C16735epY> {
    public final Function0<Unit> EZpvd;
    public final float OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (20.0f float) : (r1v0 float))
  (r2v0 kotlin.jvm.functions.Function0)
 A[MD:(float, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:7) call: o.fdg.<init>(float, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C18188fdg(float f, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 20.0f : f, function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18188fdg(float f, @NotNull Function0<Unit> function0) {
        super(DefiOnboardingTokensTileBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = f;
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16735epY c16735epY, @NotNull DefiOnboardingTile.TokenGroupTile tokenGroupTile) {
        Intrinsics.checkNotNullParameter(c16735epY, "");
        Intrinsics.checkNotNullParameter(tokenGroupTile, "");
        java.util.List<DefiOnboardingTile.TokenGroupTile.TokenInfo> listKWHzl = tokenGroupTile.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(((DefiOnboardingTile.TokenGroupTile.TokenInfo) it.next()).getLogo());
        }
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        int size = listAxsJAYsNCnLh.size();
        int i = size / 2;
        c16735epY.getRoot().KWHzl(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listAxsJAYsNCnLh, i), CollectionsKt___CollectionsKt.fetchVPNInfo(listAxsJAYsNCnLh, size - i), this.OLrzqt);
        C19606gIp root = c16735epY.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fdg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C18188fdg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C18188fdg c18188fdg) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c18188fdg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.EZpvd.invoke();
            }
        }
    }
}
