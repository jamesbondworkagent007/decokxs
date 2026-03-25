package com.okinc.business.invest_biz.data.logic;

import com.okinc.business.invest_biz.data.logic.InvestCoinAssetsHandle;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C23539iAc;
import o.C43251rlk;
import o.C9917bed;
import o.InterfaceC23916iOb;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestCoinAssetsHandle {
    private static final String BIND_KEY = "InvestCoinAssetsHandle";
    private final HashMap<String, Function1<C9917bed, Unit>> incrementListenerMap = new HashMap<>();
    private InterfaceC58217yxC wsDisposable;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.logic.InvestCoinAssetsHandle.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void startSync() {
        registerWs();
    }

    public final void stopSync() {
        InterfaceC58217yxC interfaceC58217yxC = this.wsDisposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    private final void registerWs() {
        InterfaceC58217yxC interfaceC58217yxC = this.wsDisposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<C9917bed> abstractC58185ywXSubTokenAssets = subTokenAssets(BIND_KEY);
        final Function1 function1 = new Function1() { // from class: o.iyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestCoinAssetsHandle.registerWs$lambda$1(this.copydefault, (C9917bed) obj);
            }
        };
        this.wsDisposable = abstractC58185ywXSubTokenAssets.AEQbTJ(new InterfaceC58227yxM() { // from class: o.iyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerWs$lambda$1(InvestCoinAssetsHandle investCoinAssetsHandle, C9917bed c9917bed) {
        Collection<Function1<C9917bed, Unit>> collectionValues = investCoinAssetsHandle.incrementListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            Intrinsics.copydefault(c9917bed);
            function1.invoke(c9917bed);
        }
        return Unit.INSTANCE;
    }

    public final void addIncrementListener(@NotNull String str, @NotNull Function1<? super C9917bed, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.incrementListenerMap.put(str, function1);
    }

    public final void removeIncrementListener(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.incrementListenerMap.remove(str);
    }

    public final void clearListener() {
        this.incrementListenerMap.clear();
    }

    public final void getBanlanceFromServer(@NotNull String str, final long j, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<List<InvestTokenWithAmount>> abstractC58185ywXCopydefault = C23539iAc.EZpvd.copydefault(str, j, list, str2);
        final Function1 function1 = new Function1() { // from class: o.izc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestCoinAssetsHandle.getBanlanceFromServer$lambda$5(this.OLrzqt, j, (java.util.List) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58227yxM() { // from class: o.izb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBanlanceFromServer$lambda$5(InvestCoinAssetsHandle investCoinAssetsHandle, long j, List list) {
        Intrinsics.copydefault(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) it.next();
            Collection<Function1<C9917bed, Unit>> collectionValues = investCoinAssetsHandle.incrementListenerMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                Function1 function1 = (Function1) it2.next();
                String tokenAddress = investTokenWithAmount.getTokenAddress();
                String tokenSymbol = investTokenWithAmount.getTokenSymbol();
                function1.invoke(new C9917bed(null, Long.valueOf(j), investTokenWithAmount.getCoinAmount(), null, investTokenWithAmount.getCurrencyAmount(), tokenAddress, tokenSymbol, null, null, 392, null));
            }
        }
        return Unit.INSTANCE;
    }

    private final AbstractC58185ywX<C9917bed> subTokenAssets(String str) {
        return ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).AhwBna(str);
    }
}
