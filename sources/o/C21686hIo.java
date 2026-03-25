package o;

import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.hHS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21686hIo {
    public static /* synthetic */ InterfaceC58217yxC parseToDAppRedirectListState$default(AbstractC58185ywX abstractC58185ywX, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return AEQbTJ((AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>>) abstractC58185ywX, z, (Function1<? super hHS, Unit>) function1);
    }

    public static final InterfaceC58217yxC AEQbTJ(@NotNull AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> abstractC58185ywX, final boolean z, @NotNull final Function1<? super hHS, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Function1 function12 = new Function1() { // from class: o.hIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21686hIo.EZpvd(z, function1, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.util.List<SwapBridgeDAppInfo>>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21686hIo.KWHzl(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21686hIo.AEQbTJ(z, function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywX.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21686hIo.copydefault(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(boolean z, Function1 function1, ResponseData responseData) {
        if (responseData.getCode() == 40008) {
            if (z) {
                function1.invoke(hHS.ActionBar.OLrzqt);
            } else {
                function1.invoke(hHS.TaskDescription.OLrzqt);
            }
        } else if (responseData.getCode() != 0 || responseData.getData() == null) {
            function1.invoke(hHS.StateListAnimator.KWHzl);
        } else {
            Intrinsics.copydefault(responseData.getData());
            if (!((java.util.Collection) r2).isEmpty()) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                function1.invoke(new hHS.Activity((java.util.List) data));
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(boolean z, Function1 function1, java.lang.Throwable th) {
        if (!(th instanceof OKServerException) || ((OKServerException) th).getCode() != 40008) {
            function1.invoke(hHS.StateListAnimator.KWHzl);
        } else if (z) {
            function1.invoke(hHS.ActionBar.OLrzqt);
        } else {
            function1.invoke(hHS.TaskDescription.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}
