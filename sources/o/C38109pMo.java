package o;

import com.okinc.lifecycle.impl.deeplink.service.CoreDeeplinkService$navigateToNative$1;
import com.okinc.lifecycle.impl.deeplink.service.CoreDeeplinkService$navigateToNative$wrapper$1;
import com.okinc.lifecycle.impl.deeplink.service.CoreDeeplinkService$navigateToNative$wrapper$2;
import com.okinc.lifecycle.impl.deeplink.service.CoreDeeplinkService$navigateToNative$wrapper$3;
import com.okinc.lifecycle.impl.deeplink.service.CoreDeeplinkService$navigateToNative$wrapper$4;
import com.okinc.lifecycle.impl.deeplink.service.CoreDeeplinkService$processDeeplink$1;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.AbstractC2693AVp;
import o.AbstractC43238rlX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38109pMo extends AbstractC43215rlA implements InterfaceC43294rma {
    public static final int copydefault = C2631ATe.$stable;
    public final C2631ATe EZpvd;

    public C38109pMo(@NotNull C2631ATe c2631ATe) {
        Intrinsics.checkNotNullParameter(c2631ATe, "");
        this.EZpvd = c2631ATe;
    }

    @Override // o.InterfaceC43294rma
    public boolean values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.AEQbTJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC43294rma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43238rlX> continuation) throws java.lang.Throwable {
        CoreDeeplinkService$navigateToNative$1 coreDeeplinkService$navigateToNative$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof CoreDeeplinkService$navigateToNative$1) {
            coreDeeplinkService$navigateToNative$1 = (CoreDeeplinkService$navigateToNative$1) continuation;
            int i = coreDeeplinkService$navigateToNative$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coreDeeplinkService$navigateToNative$1.label = i - Integer.MIN_VALUE;
            } else {
                coreDeeplinkService$navigateToNative$1 = new CoreDeeplinkService$navigateToNative$1(this, continuation);
            }
        }
        java.lang.Object obj = coreDeeplinkService$navigateToNative$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coreDeeplinkService$navigateToNative$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AVG avgKWHzl = this.EZpvd.KWHzl(str);
            C33077mpe c33077mpe = new C33077mpe(new CoreDeeplinkService$navigateToNative$wrapper$1(avgKWHzl), new CoreDeeplinkService$navigateToNative$wrapper$2(avgKWHzl), new CoreDeeplinkService$navigateToNative$wrapper$3(avgKWHzl), new CoreDeeplinkService$navigateToNative$wrapper$4(avgKWHzl), null, 16, null);
            coreDeeplinkService$navigateToNative$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(coreDeeplinkService$navigateToNative$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        AbstractC2693AVp abstractC2693AVp = (AbstractC2693AVp) objAEQbTJ;
        if (abstractC2693AVp == null || (abstractC2693AVp instanceof AbstractC2693AVp.Application)) {
            return AbstractC43238rlX.Application.AEQbTJ;
        }
        return AbstractC43238rlX.StateListAnimator.OLrzqt;
    }

    @Override // o.InterfaceC43294rma
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(this.EZpvd.copydefault(str));
    }

    @Override // o.InterfaceC43294rma
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull LinkSource linkSource, boolean z, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new CoreDeeplinkService$processDeeplink$1(str, map, this, linkSource, z, function1, null), 3, null);
    }

    @Override // o.InterfaceC43294rma
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AEQbTJ(context, str, map, LinkSource.IN_APP, true, function1);
    }

    @Override // o.InterfaceC43294rma
    public boolean AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.EZpvd(str);
    }

    @Override // o.InterfaceC43294rma
    public java.util.Map<java.lang.String, java.lang.Object> fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.OLrzqt(str);
    }

    @Override // o.InterfaceC43294rma
    public java.lang.String wlaJM() {
        return this.EZpvd.OLrzqt();
    }

    @Override // o.InterfaceC43294rma
    public java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof java.lang.String) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        return this.EZpvd.AEQbTJ(str, linkedHashMap2, z);
    }
}
