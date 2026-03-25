package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: renamed from: o.ytE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58007ytE {

    /* JADX INFO: renamed from: o.ytE$Application */
    public interface Application {
        int EZpvd();

        void EZpvd(java.util.List<C58047yts> list, int i);

        boolean KWHzl(long j, int i);
    }

    public static long KWHzl(long j) {
        return j & 8796093022207L;
    }

    public static int OLrzqt(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    public static boolean copydefault(long j) {
        return ((j >> 63) & 1) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[PHI: r3
  0x0033: PHI (r3v10 boolean) = (r3v1 boolean), (r3v12 boolean) binds: [B:9:0x0020, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void AEQbTJ(long[] jArr, LinkedList<C58047yts> linkedList, boolean z, long j) {
        int iOLrzqt;
        LinkedList linkedList2 = new LinkedList();
        boolean z2 = !z;
        int size = 0;
        for (long j2 : jArr) {
            if (0 != j2) {
                if (z) {
                    if (copydefault(j2) && 1048574 == OLrzqt(j2)) {
                        z2 = true;
                    }
                    if (!z2) {
                        continue;
                    }
                } else if (copydefault(j2)) {
                    if (OLrzqt(j2) == 1048574) {
                        size = 0;
                    }
                    size++;
                    linkedList2.push(java.lang.Long.valueOf(j2));
                } else {
                    int iOLrzqt2 = OLrzqt(j2);
                    if (!linkedList2.isEmpty()) {
                        long jLongValue = ((java.lang.Long) linkedList2.pop()).longValue();
                        size--;
                        LinkedList linkedList3 = new LinkedList();
                        linkedList3.add(java.lang.Long.valueOf(jLongValue));
                        while (true) {
                            iOLrzqt = OLrzqt(jLongValue);
                            if (iOLrzqt == iOLrzqt2 || linkedList2.isEmpty()) {
                                break;
                            }
                            C58013ytK.AEQbTJ("Matrix.TraceDataUtils", "pop inMethodId[%s] to continue match ouMethodId[%s]", java.lang.Integer.valueOf(iOLrzqt), java.lang.Integer.valueOf(iOLrzqt2));
                            jLongValue = ((java.lang.Long) linkedList2.pop()).longValue();
                            size--;
                            linkedList3.add(java.lang.Long.valueOf(jLongValue));
                        }
                        if (iOLrzqt != iOLrzqt2 && iOLrzqt == 1048574) {
                            C58013ytK.OLrzqt("Matrix.TraceDataUtils", "inMethodId[%s] != outMethodId[%s] throw this outMethodId!", java.lang.Integer.valueOf(iOLrzqt), java.lang.Integer.valueOf(iOLrzqt2));
                            linkedList2.addAll(linkedList3);
                            size += linkedList2.size();
                        } else {
                            long jKWHzl = KWHzl(j2) - KWHzl(jLongValue);
                            if (jKWHzl < 0) {
                                C58013ytK.OLrzqt("Matrix.TraceDataUtils", "[structuredDataToStack] trace during invalid:%d", java.lang.Long.valueOf(jKWHzl));
                                linkedList2.clear();
                                linkedList.clear();
                                return;
                            }
                            AEQbTJ(linkedList, new C58047yts(iOLrzqt2, (int) jKWHzl, size));
                        }
                    } else {
                        C58013ytK.AEQbTJ("Matrix.TraceDataUtils", "[structuredDataToStack] method[%s] not found in! ", java.lang.Integer.valueOf(iOLrzqt2));
                    }
                }
            }
        }
        while (!linkedList2.isEmpty() && z) {
            long jLongValue2 = ((java.lang.Long) linkedList2.pop()).longValue();
            int iOLrzqt3 = OLrzqt(jLongValue2);
            boolean zCopydefault = copydefault(jLongValue2);
            long jKWHzl2 = KWHzl(jLongValue2) + AppMethodBeat.getDiffTime();
            C58013ytK.AEQbTJ("Matrix.TraceDataUtils", "[structuredDataToStack] has never out method[%s], isIn:%s, inTime:%s, endTime:%s,rawData size:%s", java.lang.Integer.valueOf(iOLrzqt3), java.lang.Boolean.valueOf(zCopydefault), java.lang.Long.valueOf(jKWHzl2), java.lang.Long.valueOf(j), java.lang.Integer.valueOf(linkedList2.size()));
            if (!zCopydefault) {
                C58013ytK.OLrzqt("Matrix.TraceDataUtils", "[structuredDataToStack] why has out Method[%s]? is wrong! ", java.lang.Integer.valueOf(iOLrzqt3));
            } else {
                AEQbTJ(linkedList, new C58047yts(iOLrzqt3, (int) (j - jKWHzl2), linkedList2.size()));
            }
        }
        ActionBar actionBar = new ActionBar(null, null);
        C58013ytK.EZpvd("Matrix.TraceDataUtils", "stackToTree: count=%s", java.lang.Integer.valueOf(AEQbTJ(linkedList, actionBar)));
        linkedList.clear();
        EZpvd(actionBar, linkedList);
    }

    public static int AEQbTJ(LinkedList<C58047yts> linkedList, C58047yts c58047yts) {
        if (AppMethodBeat.isDev) {
            Objects.toString(c58047yts);
        }
        C58047yts c58047ytsPeek = !linkedList.isEmpty() ? linkedList.peek() : null;
        if (c58047ytsPeek != null && c58047ytsPeek.OLrzqt == c58047yts.OLrzqt) {
            int i = c58047ytsPeek.KWHzl;
            int i2 = c58047yts.KWHzl;
            if (i == i2 && i2 != 0) {
                int i3 = c58047yts.copydefault;
                if (i3 == 5000) {
                    i3 = c58047ytsPeek.copydefault;
                }
                c58047yts.copydefault = i3;
                c58047ytsPeek.AEQbTJ(i3);
                return c58047ytsPeek.copydefault;
            }
        }
        linkedList.push(c58047yts);
        return c58047yts.copydefault;
    }

    public static void EZpvd(ActionBar actionBar, LinkedList<C58047yts> linkedList) {
        for (int i = 0; i < actionBar.copydefault.size(); i++) {
            ActionBar actionBar2 = actionBar.copydefault.get(i);
            if (actionBar2 != null) {
                C58047yts c58047yts = actionBar2.EZpvd;
                if (c58047yts != null) {
                    linkedList.add(c58047yts);
                }
                if (!actionBar2.copydefault.isEmpty()) {
                    EZpvd(actionBar2, linkedList);
                }
            }
        }
    }

    public static int AEQbTJ(LinkedList<C58047yts> linkedList, ActionBar actionBar) {
        ActionBar actionBar2;
        java.util.ListIterator<C58047yts> listIterator = linkedList.listIterator(0);
        ActionBar actionBar3 = null;
        int i = 0;
        while (listIterator.hasNext()) {
            ActionBar actionBar4 = new ActionBar(listIterator.next(), actionBar3);
            i++;
            if (actionBar3 == null && actionBar4.EZpvd() != 0) {
                C58013ytK.OLrzqt("Matrix.TraceDataUtils", "[stackToTree] begin error! why the first node'depth is not 0!", new java.lang.Object[0]);
                return 0;
            }
            int iEZpvd = actionBar4.EZpvd();
            if (actionBar3 == null || iEZpvd == 0) {
                actionBar.AEQbTJ(actionBar4);
            } else if (actionBar3.EZpvd() >= iEZpvd) {
                while (actionBar3 != null && actionBar3.EZpvd() > iEZpvd) {
                    actionBar3 = actionBar3.KWHzl;
                }
                if (actionBar3 != null && (actionBar2 = actionBar3.KWHzl) != null) {
                    actionBar4.KWHzl = actionBar2;
                    actionBar3.KWHzl.AEQbTJ(actionBar4);
                }
            } else {
                actionBar3.AEQbTJ(actionBar4);
            }
            actionBar3 = actionBar4;
        }
        return i;
    }

    public static long AEQbTJ(LinkedList<C58047yts> linkedList, java.lang.StringBuilder sb, java.lang.StringBuilder sb2) {
        sb2.append("|*\t\tTraceStack:");
        sb2.append("\n");
        sb2.append("|*\t\t[id count cost]");
        sb2.append("\n");
        long j = 0;
        for (C58047yts c58047yts : linkedList) {
            sb.append(c58047yts.toString());
            sb.append('\n');
            sb2.append("|*\t\t");
            sb2.append(c58047yts.OLrzqt());
            sb2.append('\n');
            long j2 = c58047yts.copydefault;
            if (j < j2) {
                j = j2;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: o.ytE$ActionBar */
    public static final class ActionBar {
        public C58047yts EZpvd;
        public ActionBar KWHzl;
        public LinkedList<ActionBar> copydefault = new LinkedList<>();

        public ActionBar(C58047yts c58047yts, ActionBar actionBar) {
            this.EZpvd = c58047yts;
            this.KWHzl = actionBar;
        }

        public final int EZpvd() {
            C58047yts c58047yts = this.EZpvd;
            if (c58047yts == null) {
                return 0;
            }
            return c58047yts.KWHzl;
        }

        public final void AEQbTJ(ActionBar actionBar) {
            this.copydefault.addFirst(actionBar);
        }
    }

    public static void KWHzl(java.util.List<C58047yts> list, int i, Application application) {
        if (i < 0) {
            list.clear();
            return;
        }
        int size = list.size();
        int i2 = 1;
        while (size > i) {
            java.util.ListIterator<C58047yts> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (application.KWHzl(listIterator.previous().copydefault, i2)) {
                    listIterator.remove();
                    size--;
                    if (size <= i) {
                        return;
                    }
                }
            }
            size = list.size();
            i2++;
            if (application.EZpvd() < i2) {
                break;
            }
        }
        int size2 = list.size();
        if (size2 > i) {
            application.EZpvd(list, size2);
        }
    }

    public static java.lang.String copydefault(java.util.List<C58047yts> list, long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j2 = (long) (j * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (C58047yts c58047yts : list) {
            if (c58047yts.copydefault >= j2) {
                linkedList.add(c58047yts);
            }
        }
        Collections.sort(linkedList, new java.util.Comparator<C58047yts>() { // from class: o.ytE.5
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public int compare(C58047yts c58047yts2, C58047yts c58047yts3) {
                return java.lang.Integer.compare((c58047yts3.KWHzl + 1) * c58047yts3.copydefault, (c58047yts2.KWHzl + 1) * c58047yts2.copydefault);
            }
        });
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add(list.get(0));
        } else if (linkedList.size() > 1 && ((C58047yts) linkedList.peek()).OLrzqt == 1048574) {
            linkedList.removeFirst();
        }
        java.util.Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            sb.append(((C58047yts) it.next()).OLrzqt + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return sb.toString();
    }
}
