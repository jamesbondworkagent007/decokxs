package o;

import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC22992hpn extends AbstractC22977hpY {
    public UnsignedSwapData AEQbTJ;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(UnsignedSwapData unsignedSwapData) {
        this.AEQbTJ = unsignedSwapData;
    }

    public abstract void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MergeCallData mergeCallData, Function1<? super InterfaceC9734bbF, Unit> function1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22992hpn(@NotNull java.lang.String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hpn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchQuoteCallData$default(AbstractC22992hpn abstractC22992hpn, java.lang.String str, java.lang.String str2, MergeCallData mergeCallData, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchQuoteCallData");
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        abstractC22992hpn.copydefault(str, str2, mergeCallData, function1);
    }

    public final BaseSignData KWHzl(UnsignedSwapData unsignedSwapData) {
        java.lang.String unsignedTx = unsignedSwapData != null ? unsignedSwapData.getUnsignedTx() : null;
        if (unsignedTx == null) {
            unsignedTx = "";
        }
        java.lang.String str = unsignedTx;
        return new EVMMessageSignData(str, false, null, SignType.TYPED_MESSAGE, str, null, null, 102, null);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull AbstractC58185ywX<MergeCallData> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        final Function1 function1 = new Function1() { // from class: o.hpp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22992hpn.EZpvd(this.copydefault, (MergeCallData) obj);
            }
        };
        InterfaceC58227yxM<? super MergeCallData> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hpu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22992hpn.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hpt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22992hpn.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywX.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22992hpn.EZpvd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final Unit EZpvd(AbstractC22992hpn abstractC22992hpn, MergeCallData mergeCallData) {
        abstractC22992hpn.AEQbTJ = mergeCallData.getUnsingedCallData();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC22992hpn abstractC22992hpn, java.lang.Throwable th) {
        abstractC22992hpn.AEQbTJ = null;
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.lang.String str, boolean z, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC22974hpV abstractC22974hpVCopydefault = copydefault();
        UnsignedSwapData unsignedSwapData = this.AEQbTJ;
        return abstractC22974hpVCopydefault.KWHzl(str, unsignedSwapData != null ? unsignedSwapData.getOfflineTypeQuote() : null, this.copydefault, z, str2, i);
    }
}
