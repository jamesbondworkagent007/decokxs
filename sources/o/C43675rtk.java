package o;

import com.okinc.core.livelistener.OKIncomingData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43675rtk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43675rtk {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final ConcurrentHashMap<java.lang.String, CopyOnWriteArrayList<AbstractC57556yke>> KWHzl = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o.rtk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rtk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC57556yke KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, C57567ykp c57567ykp, @NotNull final AbstractC43610rsY abstractC43610rsY) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(abstractC43610rsY, "");
            if (str.length() == 0) {
                throw new java.lang.Exception("channelId is null");
            }
            if (c57567ykp == null) {
                return OLrzqt(str, arrayList);
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, c57567ykp, arrayList, new Function2() { // from class: o.rtn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C43675rtk.TaskDescription.OLrzqt(abstractC43610rsY, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            copydefault(str, abstractC57556ykeAEQbTJ);
            return abstractC57556ykeAEQbTJ;
        }

        public static final Unit OLrzqt(AbstractC43610rsY abstractC43610rsY, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            abstractC43610rsY.copydefault(oKIncomingData.getPayload().toString());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.rtk$TaskDescription$ActionBar */
        public static final class ActionBar extends AbstractC57556yke {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC33132mqg
            public void OLrzqt(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                Intrinsics.checkNotNullParameter(oKIncomingData, "");
            }

            public ActionBar(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
                super(str, arrayList);
            }
        }

        public final AbstractC57556yke OLrzqt(java.lang.String str, java.util.ArrayList<? extends InterfaceC57559ykh> arrayList) {
            return new ActionBar(str, arrayList);
        }

        public final void copydefault(@NotNull java.lang.String str, @NotNull AbstractC57556yke abstractC57556yke) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractC57556yke, "");
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C43675rtk.KWHzl.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
            }
            copyOnWriteArrayList.add(abstractC57556yke);
            C43675rtk.KWHzl.put(str, copyOnWriteArrayList);
        }

        public static /* synthetic */ void removeListener$default(TaskDescription taskDescription, java.lang.String str, AbstractC57556yke abstractC57556yke, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                abstractC57556yke = null;
            }
            taskDescription.EZpvd(str, abstractC57556yke);
        }

        public final void EZpvd(java.lang.String str, AbstractC57556yke abstractC57556yke) {
            if (abstractC57556yke == null) {
                return;
            }
            try {
                java.lang.Object key = "";
                for (Map.Entry entry : C43675rtk.KWHzl.entrySet()) {
                    java.util.Iterator it = ((CopyOnWriteArrayList) entry.getValue()).iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "");
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC57556yke abstractC57556yke2 = (AbstractC57556yke) it.next();
                            if (Intrinsics.EZpvd(abstractC57556yke2, abstractC57556yke)) {
                                abstractC57556yke2.djBIcL();
                                key = entry.getKey();
                                break;
                            }
                        }
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C43675rtk.KWHzl.get(key);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(abstractC57556yke);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) C43675rtk.KWHzl.get(str);
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() == 0) {
                    C56532yIw.AEQbTJ(C43675rtk.KWHzl).remove(str);
                }
            }
        }
    }
}
