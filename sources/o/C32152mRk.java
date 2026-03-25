package o;

import com.okinc.core.livelistener.OKIncomingData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32152mRk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32152mRk {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final ConcurrentHashMap<java.lang.String, CopyOnWriteArrayList<AbstractC57556yke>> AEQbTJ = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o.mRk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mRk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AbstractC57556yke OLrzqt(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, C57567ykp c57567ykp, @NotNull final mQP mqp) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(mqp, "");
            if (str.length() == 0) {
                throw new java.lang.Exception("channelId is null");
            }
            if (c57567ykp == null) {
                return EZpvd(str, arrayList);
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, c57567ykp, arrayList, new Function2() { // from class: o.mRl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C32152mRk.StateListAnimator.KWHzl(mqp, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            AEQbTJ(str, abstractC57556ykeAEQbTJ);
            return abstractC57556ykeAEQbTJ;
        }

        public static final Unit KWHzl(mQP mqp, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            mqp.AEQbTJ(oKIncomingData.getPayload().toString());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.mRk$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0881StateListAnimator extends AbstractC57556yke {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC33132mqg
            public void OLrzqt(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                Intrinsics.checkNotNullParameter(oKIncomingData, "");
            }

            public C0881StateListAnimator(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
                super(str, arrayList);
            }
        }

        public final AbstractC57556yke EZpvd(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
            return new C0881StateListAnimator(str, arrayList);
        }

        public final void AEQbTJ(@NotNull java.lang.String str, @NotNull AbstractC57556yke abstractC57556yke) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractC57556yke, "");
            pUU.KWHzl("DexWsListenerFactory", "addListener: " + str + " -- " + abstractC57556yke.getClass().getName());
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C32152mRk.AEQbTJ.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
            }
            copyOnWriteArrayList.add(abstractC57556yke);
            C32152mRk.AEQbTJ.put(str, copyOnWriteArrayList);
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
                for (Map.Entry entry : C32152mRk.AEQbTJ.entrySet()) {
                    java.util.Iterator it = ((CopyOnWriteArrayList) entry.getValue()).iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "");
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC57556yke abstractC57556yke2 = (AbstractC57556yke) it.next();
                            if (Intrinsics.EZpvd(abstractC57556yke2, abstractC57556yke)) {
                                abstractC57556yke2.djBIcL();
                                key = entry.getKey();
                                pUU.KWHzl("DexWsListenerFactory", "removeListener: " + str + " --- " + entry.getValue().getClass().getName());
                                break;
                            }
                        }
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C32152mRk.AEQbTJ.get(key);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(abstractC57556yke);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) C32152mRk.AEQbTJ.get(str);
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() == 0) {
                    C56532yIw.AEQbTJ(C32152mRk.AEQbTJ).remove(str);
                    pUU.KWHzl("DexWsListenerFactory", "removeListener ChannelId: " + str);
                }
            }
        }
    }
}
