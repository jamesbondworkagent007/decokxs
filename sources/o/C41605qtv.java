package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41605qtv implements InterfaceC49405unt<Unit, java.lang.Boolean> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final OKComplianceRestrictionService copydefault;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41605qtv(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        this.copydefault = oKComplianceRestrictionService;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean copydefault(@NotNull Unit unit) {
        return (java.lang.Boolean) InterfaceC49405unt.Activity.EZpvd(this, unit);
    }

    /* JADX INFO: renamed from: o.qtv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qtv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean AEQbTJ(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        boolean zOLrzqt = C41565qtH.AEQbTJ.OLrzqt();
        boolean z = !this.copydefault.AEQbTJ(OKComplianceRestrictionService.Feature.US_STOCK_PERP);
        pUU.KWHzl("CheckStockRestrictionUseCase", "isSupportStockAb : " + zOLrzqt + "  isSupportStockRestriction: " + z);
        return java.lang.Boolean.valueOf(z && zOLrzqt);
    }
}
