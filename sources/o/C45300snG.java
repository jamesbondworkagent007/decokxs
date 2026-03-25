package o;

import com.okinc.okex.common.navigator.CommonServiceKey;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45300snG {
    public final java.util.Map<CommonServiceKey, InterfaceC56387yDm<InterfaceC45302snI>> OLrzqt = new LinkedHashMap();

    @yCM
    public C45300snG() {
    }

    public final InterfaceC45539srt copydefault() {
        java.lang.Object objCopydefault = C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC45539srt.class);
        Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
        return (InterfaceC45539srt) objCopydefault;
    }

    public final void copydefault(@NotNull CommonServiceKey commonServiceKey, @NotNull InterfaceC56387yDm<? extends InterfaceC45302snI> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(commonServiceKey, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.OLrzqt.put(commonServiceKey, interfaceC56387yDm);
    }

    public final InterfaceC45302snI copydefault(@NotNull CommonServiceKey commonServiceKey) {
        Intrinsics.checkNotNullParameter(commonServiceKey, "");
        InterfaceC56387yDm<InterfaceC45302snI> interfaceC56387yDm = this.OLrzqt.get(commonServiceKey);
        if (interfaceC56387yDm == null) {
            InterfaceC56387yDm<InterfaceC45302snI> interfaceC56387yDm2 = this.OLrzqt.get(CommonServiceKey.Default);
            Intrinsics.copydefault(interfaceC56387yDm2);
            return interfaceC56387yDm2.getValue();
        }
        return interfaceC56387yDm.getValue();
    }

    public static /* synthetic */ java.lang.Object runCommonService$OKSupport_support_impl$default(C45300snG c45300snG, CommonServiceKey commonServiceKey, android.content.Context context, java.lang.Object obj, Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return c45300snG.copydefault(commonServiceKey, context, obj, continuation);
    }

    public final java.lang.Object copydefault(@NotNull CommonServiceKey commonServiceKey, @NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = copydefault(commonServiceKey).EZpvd(context, obj, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public final void EZpvd() {
        C45339snt.copydefault(this);
        C45241smA.EZpvd(this);
        C45269smc.EZpvd(this);
        C45343snx.AEQbTJ(this);
        C45344sny.OLrzqt(this);
        C45250smJ.KWHzl(this);
        C45326sng.EZpvd(this);
        C45264smX.copydefault(this);
        C45244smD.copydefault(this);
        C45257smQ.KWHzl(this);
        C45252smL.copydefault(this);
        C45248smH.AEQbTJ(this);
        C45328sni.KWHzl(this);
        C45276smj.AEQbTJ(this);
        C45323snd.EZpvd(this);
        C45278sml.OLrzqt(this);
        C45284smr.AEQbTJ(this);
        C45282smp.AEQbTJ(this);
        C45283smq.OLrzqt(this);
        C45321snb.AEQbTJ(this);
        C45258smR.KWHzl(this);
        C45330snk.AEQbTJ(this);
        C45337snr.KWHzl(this);
        C45289smw.EZpvd(this);
    }
}
