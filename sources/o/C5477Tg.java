package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5477Tg implements InterfaceC5488Tr {
    public static final Application Companion = new Application(null);

    @Override // o.InterfaceC5488Tr
    public void KWHzl(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        C5484Tn.KWHzl(abstractRunnableC5485To.gEmmrt() + " -- onStart -- ");
    }

    @Override // o.InterfaceC5488Tr
    public void OLrzqt(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        C5484Tn.KWHzl(abstractRunnableC5485To.gEmmrt() + " -- onRunning -- ");
    }

    @Override // o.InterfaceC5488Tr
    public void AEQbTJ(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        C5484Tn.KWHzl(abstractRunnableC5485To.gEmmrt() + " -- onFinish -- ");
        Companion.EZpvd(abstractRunnableC5485To);
    }

    @Override // o.InterfaceC5488Tr
    public void EZpvd(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        C5484Tn.KWHzl(abstractRunnableC5485To.gEmmrt() + " -- onRelease -- ");
    }

    /* JADX INFO: renamed from: o.Tg$Application */
    public static final class Application {
        private Application() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:29) call: o.Tg.Application.<init>():void type: THIS */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void EZpvd(AbstractRunnableC5485To abstractRunnableC5485To) {
            C5486Tp c5486TpKWHzl = abstractRunnableC5485To.AEQbTJ().KWHzl(abstractRunnableC5485To.gEmmrt());
            if (c5486TpKWHzl != null) {
                android.util.SparseArray<java.lang.Long> sparseArrayOLrzqt = c5486TpKWHzl.OLrzqt();
                java.lang.Long l = sparseArrayOLrzqt.get(1);
                java.lang.Long l2 = sparseArrayOLrzqt.get(2);
                java.lang.Long l3 = sparseArrayOLrzqt.get(3);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("\n");
                sb.append("TASK_DETAIL");
                sb.append("\n");
                copydefault(sb, c5486TpKWHzl);
                OLrzqt(sb, "依赖任务", KWHzl(c5486TpKWHzl), false);
                java.lang.String strValueOf = java.lang.String.valueOf(c5486TpKWHzl.gEmmrt());
                Intrinsics.AEQbTJ(strValueOf, "");
                OLrzqt(sb, "是否是锚点任务", strValueOf, false);
                OLrzqt(sb, "线程信息", c5486TpKWHzl.AhwBna(), false);
                OLrzqt(sb, "开始时刻", java.lang.String.valueOf(l.longValue()), false);
                long jLongValue = l2.longValue();
                Intrinsics.AEQbTJ(l, "");
                OLrzqt(sb, "等待运行耗时", java.lang.String.valueOf(jLongValue - l.longValue()), true);
                long jLongValue2 = l3.longValue();
                Intrinsics.AEQbTJ(l2, "");
                OLrzqt(sb, "运行任务耗时", java.lang.String.valueOf(jLongValue2 - l2.longValue()), true);
                OLrzqt(sb, "结束时刻", java.lang.String.valueOf(l3.longValue()), false);
                copydefault(sb, null);
                sb.append("\n");
                java.lang.String string = sb.toString();
                Intrinsics.AEQbTJ(string, "");
                C5484Tn.EZpvd("TASK_DETAIL", string);
                if (c5486TpKWHzl.gEmmrt()) {
                    java.lang.String string2 = sb.toString();
                    Intrinsics.AEQbTJ(string2, "");
                    C5484Tn.EZpvd("ANCHOR_DETAIL", string2);
                }
            }
        }

        public final void OLrzqt(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2, boolean z) {
            if (sb == null) {
                return;
            }
            sb.append("\n");
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str3 = java.lang.String.format("| %s : %s ", java.util.Arrays.copyOf(new java.lang.Object[]{str, str2}, 2));
            Intrinsics.AEQbTJ(str3, "");
            sb.append(str3);
            if (z) {
                sb.append(com.ibm.icu.text.DateFormat.MINUTE_SECOND);
            }
        }

        public final void copydefault(java.lang.StringBuilder sb, C5486Tp c5486Tp) {
            java.lang.String str;
            if (sb == null) {
                return;
            }
            sb.append("\n");
            sb.append("=======================");
            if (c5486Tp != null) {
                if (c5486Tp.valueOf()) {
                    str = " project (";
                } else {
                    str = " task (" + c5486Tp.AEQbTJ() + " ) ";
                }
                sb.append(str);
            }
            sb.append("=======================");
        }

        public final java.lang.String KWHzl(C5486Tp c5486Tp) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = c5486Tp.copydefault().iterator();
            while (it.hasNext()) {
                sb.append(it.next() + ' ');
            }
            java.lang.String string = sb.toString();
            Intrinsics.AEQbTJ(string, "");
            return string;
        }
    }
}
