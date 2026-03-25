package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41561qtD implements InterfaceC49405unt<java.lang.String, java.lang.Boolean> {
    public final OKComplianceRestrictionService EZpvd;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41561qtD(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        this.EZpvd = oKComplianceRestrictionService;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.lang.Boolean OLrzqt(@NotNull java.lang.String str) {
        return (java.lang.Boolean) InterfaceC49405unt.Activity.EZpvd(this, str);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [27=5] */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Boolean AEQbTJ(@NotNull java.lang.String str) {
        boolean zAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1956807563:
                zAEQbTJ = !str.equals("OPTION") ? false : this.EZpvd.AEQbTJ(OKComplianceRestrictionService.Feature.OPTION);
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    zAEQbTJ = this.EZpvd.AEQbTJ(OKComplianceRestrictionService.Feature.SPOT);
                    break;
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    zAEQbTJ = this.EZpvd.AEQbTJ(OKComplianceRestrictionService.Feature.PERPETUAL);
                    break;
                }
                break;
            case 214415088:
                if (str.equals("FUTURES")) {
                    zAEQbTJ = this.EZpvd.AEQbTJ(OKComplianceRestrictionService.Feature.FUTURE);
                    break;
                }
                break;
            case 1689292927:
                if (str.equals("PREMARKET")) {
                    zAEQbTJ = this.EZpvd.AEQbTJ(OKComplianceRestrictionService.Feature.PRE_MARKET);
                    break;
                }
                break;
        }
        return java.lang.Boolean.valueOf(!zAEQbTJ);
    }
}
