package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22963hpK extends AbstractC22977hpY {
    public final MutableLiveData<UnsignedSwapData> AEQbTJ;
    public final C22306hcq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<UnsignedSwapData> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:o.hcq:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.hcq:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:17) call: o.hcq.<init>():void type: CONSTRUCTOR) : (r2v0 o.hcq))
 A[MD:(java.lang.String, o.hcq):void (m)] (LINE:15) call: o.hpK.<init>(java.lang.String, o.hcq):void type: THIS */
    public /* synthetic */ C22963hpK(java.lang.String str, C22306hcq c22306hcq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C22306hcq() : c22306hcq);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22963hpK(@NotNull java.lang.String str, @NotNull C22306hcq c22306hcq) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22306hcq, "");
        this.EZpvd = c22306hcq;
        this.AEQbTJ = new MutableLiveData<>();
    }

    @Override // o.AbstractC22977hpY
    public AbstractC22974hpV copydefault() {
        return new C23093hri(fetchVPNInfo(), this);
    }

    public final java.lang.String EZpvd(boolean z, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        return this.EZpvd.EZpvd(z, swapPriorityFeeInfo);
    }
}
