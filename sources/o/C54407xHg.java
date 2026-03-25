package o;

import com.okinc.core.livelistener.OKIncomingData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54407xHg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xHg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54407xHg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final ConcurrentHashMap<java.lang.String, CopyOnWriteArrayList<AbstractC57556yke>> KWHzl = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o.xHg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xHg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.xHg$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC57556yke getWsListener$default(StateListAnimator stateListAnimator, java.lang.String str, java.util.ArrayList arrayList, C57567ykp c57567ykp, xGQ xgq, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                function1 = null;
            }
            return stateListAnimator.EZpvd(str, (java.util.ArrayList<? extends InterfaceC57559ykh>) arrayList, c57567ykp, (xGQ<?>) xgq, (Function1<? super java.lang.String, Unit>) function1);
        }

        public final AbstractC57556yke EZpvd(@NotNull final java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, C57567ykp c57567ykp, @NotNull final xGQ<?> xgq, final Function1<? super java.lang.String, Unit> function1) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(xgq, "");
            if (str.length() == 0) {
                throw new java.lang.Exception("channelId is null");
            }
            if (c57567ykp == null) {
                return AEQbTJ(str, arrayList);
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, c57567ykp, arrayList, new Function2() { // from class: o.xHf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C54407xHg.StateListAnimator.OLrzqt(str, function1, xgq, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            AEQbTJ(str, abstractC57556ykeAEQbTJ);
            return abstractC57556ykeAEQbTJ;
        }

        public static final Unit OLrzqt(java.lang.String str, Function1 function1, xGQ xgq, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            if (C56122xwp.EZpvd().contains(str)) {
                try {
                    java.lang.Object payload = oKIncomingData.getPayload();
                    java.lang.String string = payload != null ? payload.toString() : null;
                    if (string != null && string.length() != 0) {
                        java.lang.String strSubstring = oKIncomingData.getPayload().toString().substring(0, oKIncomingData.getPayload().toString().length() / 3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        pUU.EZpvd("TradeWsFactoryMgsPrivate", "ws-data- private channelId: " + str + " " + strSubstring + " account: " + C55697xoo.OLrzqt.AYXKKw());
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if (function1 != null) {
                function1.invoke(oKIncomingData.getPayload().toString());
            } else {
                java.lang.String originMsg = oKIncomingData.getOriginMsg();
                if (originMsg == null) {
                    originMsg = "";
                }
                if (xgq.q_(originMsg)) {
                    java.lang.String string2 = oKIncomingData.getPayload().toString();
                    java.lang.String originMsg2 = oKIncomingData.getOriginMsg();
                    if (originMsg2 == null) {
                        originMsg2 = "";
                    }
                    boolean zAYXKKw = xgq.AYXKKw(originMsg2);
                    java.lang.String originMsg3 = oKIncomingData.getOriginMsg();
                    xgq.KWHzl(string2, zAYXKKw, xgq.djBIcL(originMsg3 != null ? originMsg3 : ""));
                } else {
                    xgq.AEQbTJ(oKIncomingData.getPayload().toString());
                }
            }
            return Unit.INSTANCE;
        }

        public final AbstractC57556yke AEQbTJ(@NotNull final java.lang.String str, C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, @NotNull final Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function2, "");
            if (str.length() == 0) {
                throw new java.lang.Exception("channelId is null");
            }
            if (c57567ykp == null) {
                return AEQbTJ(str, arrayList);
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, c57567ykp, arrayList, new Function2() { // from class: o.xHj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C54407xHg.StateListAnimator.AEQbTJ(str, function2, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            AEQbTJ(str, abstractC57556ykeAEQbTJ);
            return abstractC57556ykeAEQbTJ;
        }

        public static final Unit AEQbTJ(java.lang.String str, Function2 function2, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            if (C56122xwp.EZpvd().contains(str)) {
                try {
                    java.lang.Object payload = oKIncomingData.getPayload();
                    java.lang.String string = payload != null ? payload.toString() : null;
                    if (string != null && string.length() != 0) {
                        java.lang.String strSubstring = oKIncomingData.getPayload().toString().substring(0, oKIncomingData.getPayload().toString().length() / 3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        pUU.EZpvd("TradeWsFactoryMgsPrivate", "simple-ws-data- private channelId: " + str + " " + strSubstring + " account: " + C55697xoo.OLrzqt.AYXKKw());
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            function2.invoke(abstractC33132mqg, oKIncomingData);
            return Unit.INSTANCE;
        }

        public final AbstractC57556yke KWHzl(@NotNull java.lang.String str, C57567ykp c57567ykp, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, @NotNull final Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function2, "");
            if (str.length() == 0) {
                throw new java.lang.Exception("channelId is null");
            }
            if (c57567ykp == null) {
                return AEQbTJ(str, arrayList);
            }
            AbstractC57556yke abstractC57556ykeOLrzqt = C57554ykc.Companion.OLrzqt(str, c57567ykp, arrayList, new Function2() { // from class: o.xHi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C54407xHg.StateListAnimator.KWHzl(function2, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            AEQbTJ(str, abstractC57556ykeOLrzqt);
            return abstractC57556ykeOLrzqt;
        }

        public static final Unit KWHzl(Function2 function2, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            function2.invoke(abstractC33132mqg, oKIncomingData);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.xHg$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends AbstractC57556yke {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC33132mqg
            public void OLrzqt(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                Intrinsics.checkNotNullParameter(oKIncomingData, "");
            }

            public TaskDescription(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
                super(str, arrayList);
            }
        }

        public final AbstractC57556yke AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            return new TaskDescription(str, arrayList);
        }

        public final void AEQbTJ(@NotNull java.lang.String str, @NotNull AbstractC57556yke abstractC57556yke) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractC57556yke, "");
            pUU.KWHzl("TradeWsFactoryListener", "addListener: " + str + " -- " + abstractC57556yke.getClass().getName());
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C54407xHg.KWHzl.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
            }
            copyOnWriteArrayList.add(abstractC57556yke);
            C54407xHg.KWHzl.put(str, copyOnWriteArrayList);
        }

        public static /* synthetic */ void removeListener$default(StateListAnimator stateListAnimator, java.lang.String str, AbstractC57556yke abstractC57556yke, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                abstractC57556yke = null;
            }
            stateListAnimator.EZpvd(str, abstractC57556yke);
        }

        public final void EZpvd(java.lang.String str, AbstractC57556yke abstractC57556yke) {
            if (abstractC57556yke == null) {
                return;
            }
            try {
                java.lang.Object key = "";
                for (Map.Entry entry : C54407xHg.KWHzl.entrySet()) {
                    java.util.Iterator it = ((CopyOnWriteArrayList) entry.getValue()).iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "");
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC57556yke abstractC57556yke2 = (AbstractC57556yke) it.next();
                            if (Intrinsics.EZpvd(abstractC57556yke2, abstractC57556yke)) {
                                abstractC57556yke2.djBIcL();
                                key = entry.getKey();
                                pUU.KWHzl("TradeWsFactoryListener", "removeListener: " + str + " --- " + entry.getValue().getClass().getName());
                                break;
                            }
                        }
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C54407xHg.KWHzl.get(key);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(abstractC57556yke);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) C54407xHg.KWHzl.get(str);
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() == 0) {
                    C56532yIw.AEQbTJ(C54407xHg.KWHzl).remove(str);
                    pUU.KWHzl("TradeWsFactoryListener", "removeListener ChannelId: " + str);
                }
            }
        }
    }
}
