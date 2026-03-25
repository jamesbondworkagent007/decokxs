package o;

import com.okinc.core.livelistener.OKIncomingData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23252hui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23252hui {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final ConcurrentHashMap<java.lang.String, CopyOnWriteArrayList<AbstractC57556yke>> EZpvd = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o.hui$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hui.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC57556yke copydefault(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, C57567ykp c57567ykp, @NotNull final InterfaceC23182htR interfaceC23182htR) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(interfaceC23182htR, "");
            if (str.length() == 0) {
                throw new java.lang.Exception("channelId is null");
            }
            if (c57567ykp == null) {
                return OLrzqt(str, arrayList);
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, c57567ykp, arrayList, new Function2() { // from class: o.hul
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C23252hui.TaskDescription.copydefault(interfaceC23182htR, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            copydefault(str, abstractC57556ykeAEQbTJ);
            return abstractC57556ykeAEQbTJ;
        }

        public static final Unit copydefault(InterfaceC23182htR interfaceC23182htR, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            interfaceC23182htR.copydefault(oKIncomingData.getPayload().toString());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.hui$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends AbstractC57556yke {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC33132mqg
            public void OLrzqt(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                Intrinsics.checkNotNullParameter(oKIncomingData, "");
            }

            public StateListAnimator(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
                super(str, arrayList);
            }
        }

        public final AbstractC57556yke OLrzqt(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
            return new StateListAnimator(str, arrayList);
        }

        public final void copydefault(@NotNull java.lang.String str, @NotNull AbstractC57556yke abstractC57556yke) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractC57556yke, "");
            pUU.KWHzl("DexWsListenerFactory", "addListener: " + str + " -- " + abstractC57556yke.getClass().getName());
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C23252hui.EZpvd.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
            }
            copyOnWriteArrayList.add(abstractC57556yke);
            C23252hui.EZpvd.put(str, copyOnWriteArrayList);
        }

        public static /* synthetic */ void removeListener$default(TaskDescription taskDescription, java.lang.String str, AbstractC57556yke abstractC57556yke, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                abstractC57556yke = null;
            }
            taskDescription.KWHzl(str, abstractC57556yke);
        }

        public final void KWHzl(java.lang.String str, AbstractC57556yke abstractC57556yke) {
            if (abstractC57556yke == null) {
                return;
            }
            try {
                java.lang.Object key = "";
                for (Map.Entry entry : C23252hui.EZpvd.entrySet()) {
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
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C23252hui.EZpvd.get(key);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(abstractC57556yke);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) C23252hui.EZpvd.get(str);
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() == 0) {
                    C56532yIw.AEQbTJ(C23252hui.EZpvd).remove(str);
                    pUU.KWHzl("DexWsListenerFactory", "removeListener ChannelId: " + str);
                }
            }
        }
    }
}
