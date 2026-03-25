package o;

import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingNftCarouselTileBinder$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18184fdc extends AbstractC14584doH<DefiOnboardingTile.TaskDescription, C16733epW> {
    public final yHO<java.lang.Integer, C18190fdi, C18126fcX, Unit> AEQbTJ;
    public final float EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (20.0f float) : (r1v0 float))
  (r2v0 o.yHO)
 A[MD:(float, o.yHO<? super java.lang.Integer, ? super o.fdi, ? super o.fcX, kotlin.Unit>):void (m)] (LINE:12) call: o.fdc.<init>(float, o.yHO):void type: THIS */
    public /* synthetic */ C18184fdc(float f, yHO yho, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 20.0f : f, yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super java.lang.Integer, ? super o.fdi, ? super o.fcX, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18184fdc(float f, @NotNull yHO<? super java.lang.Integer, ? super C18190fdi, ? super C18126fcX, Unit> yho) {
        super(DefiOnboardingNftCarouselTileBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(yho, "");
        this.EZpvd = f;
        this.AEQbTJ = yho;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    public void OLrzqt(@NotNull C16733epW c16733epW, @NotNull DefiOnboardingTile.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c16733epW, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c16733epW.getRoot().KWHzl(taskDescription.AEQbTJ(), this.EZpvd, this.AEQbTJ);
    }
}
