package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qyc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41851qyc<T extends InterfaceC40516qYt> extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends T>, ? extends java.util.List<? extends InterfaceC55797xqi>>, java.util.List<? extends T>> {
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41851qyc(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends T>, ? extends java.util.List<? extends InterfaceC55797xqi>> pair, @NotNull Continuation<? super java.util.List<? extends T>> continuation) {
        java.util.List<? extends T> listComponent1 = pair.component1();
        final java.util.List<? extends InterfaceC55797xqi> listComponent2 = pair.component2();
        java.util.List listEZpvd = C41389qpr.EZpvd(listComponent1, new Function1() { // from class: o.qyb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41851qyc.copydefault(listComponent2, (InterfaceC40516qYt) obj);
            }
        });
        Intrinsics.copydefault(listEZpvd, "");
        return listEZpvd;
    }

    public static final InterfaceC40516qYt copydefault(java.util.List list, InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        boolean z = false;
        if (interfaceC40516qYt instanceof C39994qFk) {
            C39994qFk c39994qFkCopy$default = C39994qFk.copy$default((C39994qFk) interfaceC40516qYt, null, null, null, 0, false, null, false, null, false, null, false, null, false, false, false, false, null, false, null, null, false, false, false, null, false, null, 0.0f, 134217727, null);
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC55797xqi interfaceC55797xqi = (InterfaceC55797xqi) it.next();
                    if (interfaceC55797xqi instanceof BizInstrument) {
                        BizInstrument bizInstrument = (BizInstrument) interfaceC55797xqi;
                        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) c39994qFkCopy$default.KWHzl().getInstType()) && Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstId(), (java.lang.Object) c39994qFkCopy$default.KWHzl().getInstId())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            c39994qFkCopy$default.AEQbTJ(z);
            return c39994qFkCopy$default;
        }
        if (interfaceC40516qYt instanceof C40005qFv) {
            C40005qFv c40005qFvCopy$default = C40005qFv.copy$default((C40005qFv) interfaceC40516qYt, null, null, null, null, null, null, null, false, false, null, false, 2047, null);
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC55797xqi interfaceC55797xqi2 = (InterfaceC55797xqi) it2.next();
                    if (interfaceC55797xqi2 instanceof BizInstrument) {
                        BizInstrument bizInstrument2 = (BizInstrument) interfaceC55797xqi2;
                        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument2.getInstType(), (java.lang.Object) c40005qFvCopy$default.KWHzl().getInstType()) && Intrinsics.EZpvd((java.lang.Object) bizInstrument2.getInstId(), (java.lang.Object) c40005qFvCopy$default.KWHzl().getInstId())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            c40005qFvCopy$default.AEQbTJ(z);
            return c40005qFvCopy$default;
        }
        if (!(interfaceC40516qYt instanceof C41876qzA)) {
            return interfaceC40516qYt;
        }
        C41876qzA c41876qzA = (C41876qzA) interfaceC40516qYt;
        C41876qzA c41876qzACopy$default = C41876qzA.copy$default(c41876qzA, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 16383, null);
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                InterfaceC55797xqi interfaceC55797xqi3 = (InterfaceC55797xqi) it3.next();
                if (interfaceC55797xqi3 instanceof DexInstrument) {
                    DexInstrument dexInstrument = (DexInstrument) interfaceC55797xqi3;
                    if (Intrinsics.EZpvd((java.lang.Object) dexInstrument.getChainId(), (java.lang.Object) c41876qzA.copydefault().getChainId()) && Intrinsics.EZpvd((java.lang.Object) dexInstrument.getTokenContractAddress(), (java.lang.Object) c41876qzA.copydefault().getTokenContractAddress())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        c41876qzACopy$default.OLrzqt(z);
        return c41876qzACopy$default;
    }
}
